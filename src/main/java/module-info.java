module com.z01a.helicopter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.z01a.helicopter to javafx.fxml;
    exports com.z01a.helicopter;
}