package com.quanlisinhvien;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    protected static String URL = "jdbc:sqlite:/C:/Users/Administrator/OneDrive/Documents/Coding/HocJava/QuanLySinhVien/quanlysinhvien/src/main/resources/com/quanlisinhvien/data.db";
    @Override
    public void start(Stage Main) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root,1280,720);
        scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
        Image logo = new Image(getClass().getResourceAsStream("logo.png"));
        Main.getIcons().add(logo);
        Main.setResizable(false);
        Main.setScene(scene);
        Main.setTitle("Trang Chủ");
        Main.show();
    }
}
