package typings.webostvjs.mod

import typings.webostvjs.webostvjsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInfo extends StObject {
  
  /**
    * The brief information about your app.
    *
    * Think of this as a short tagline for the app. It cannot exceed 60 characters.
    */
  var appDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the app background in the Launcher.
    *
    * It is displayed when the bgImage is not provided or unable to display.
    * You can specify the color as a hex value or as an HTML color name.
    * - `Example`: "bgColor":"#5e70a2, "bgColor":"#ffffff"
    *
    * This property is only available in webOS TV v1.x and v2.x. This property is ignored from webOS TV v3.0 or later.
    */
  var bgColor: js.UndefOr[String] = js.undefined
  
  /**
    * The background image displayed for your app when activated in the Launcher.
    *
    * The image must be in PNG format, and the image size must be 1920 x 1080 pixels. The file path must be relative to the appinfo.json file.
    * - `Example`: "image/myappbgimage.png"
    *
    * This property is only available in webOS TV v1.x and v2.x. This property is ignored in webOS TV v3.0 or later.
    */
  var bgImage: js.UndefOr[String] = js.undefined
  
  /**
    * Set whether your app needs to receive the back key event when the back button of the remote control unit is pressed.
    * For more information about this property, see Back Button.
    * - false (default) - Your app does not need to receive the back key event.
    * Instead, the webOS TV platform manages history using standard HTML history API such as history.pushState(), history.back(), and popState event.
    * - true - Your app needs to receive the back key event. You should implement the method of how to process the back key event in your app.
    */
  var disableBackHistoryAPI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines how your web app handles the webOSRelaunch event.
    *
    * The webOSRelaunch event occurs whenever your web app is re-launched irrespective of handlesRelaunch property value.
    * webOS TV platform will pass the webOSRelaunch event to your app.
    * This value determines whether the app can take background action or not.
    *
    * If your app sets `handlesRelaunch` to:
    * - false (default) - Your app does not handle the webOSRelaunch event.
    * webOS TV platform will automatically display your app in the full-screen mode.
    * - true - Your app needs to handle the webOSRelaunch event in the background for a while.
    * Then, your app comes to the foreground by calling the PalmSystem.activate() method. See App Lifecycle for more details.
    */
  var handlesRelaunch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The small app icon displayed for your app, 80x80 pixels, in PNG format.
    *
    * The file path must be relative to the appinfo.json file.
    */
  var icon: String
  
  /*
    * The background color for your app tile.
    *
    * The app tile is displayed in the Home, the Launcher, and the Recent screen. The default value is white.
    */
  var iconColor: js.UndefOr[String] = js.undefined
  
  /**
    * The app ID, i.e., "com.newco.app.myapp".
    *
    * Every app MUST have a unique ID, formed from reverse DNS naming conventions.
    * The launcher uses the ID to uniquely identify your app and displays it with the title.
    * The app ID is set once and cannot be changed after publishing the app.
    *
    * - Must create the ID only with lowercase letters (a-z), digits (0-9), minus signs, and periods.
    * It must be at least two characters long and must start with an alphanumeric character.
    *
    * - Cannot start with the following reverse domain names:
    * com.palm, com.webos, com.lge, com.palmdts
    *
    * - Start the ID with a reverse domain of the company/institution. (Recommended)
    *
    * - Finish the ID with the subdomain app.app-name. (Recommended)
    */
  var id: String
  
  /**
    * The large app icon displayed for your app, 130x130 pixels and should be in PNG format.
    *
    * The file path must be relative to the appinfo.json file.
    */
  var largeIcon: String
  
  /**
    * The launch point for your app.
    *
    * The file path must be relative to the appinfo.json file and needs to point to an HTML file. The default is index.html.
    */
  var main: String
  
  /**
    * The minimum amount of memory in megabytes required to run your app. This is not the same as the maximum memory usage while your app is running.
    */
  var requiredMemory: js.UndefOr[Double] = js.undefined
  
  /**
    * The screen resolution of your app.
    *
    * webOS TV does not support UHD resolution for web apps. webOS TV supports the following resolutions:
    * - "1920x1080": FHD resolution (default)
    * - "1280x720": HD resolution
    */
  var resolution: js.UndefOr[String] = js.undefined
  
  /**
    * The background image path to be shown while your app is loading.
    *
    * The path must be relative to the appinfo.json file. The file must be in PNG format, and the resolution should be 1920 x 1080.
    */
  var splashBackground: String
  
  /**
    * The app title that is shown in the Launcher and the app window.
    */
  var title: String
  
  /**
    * The app background that overlays the system background.
    *
    * This property configures the transparency of the app's background.
    * If you do not set the background color or background image, the system background (black color) is displayed.
    * - false (default) - The transparency rate of the app background is decreased and the system background is shown as a little grey color.
    * - true - The system background is displayed clearly.
    */
  var transparent: js.UndefOr[String] = js.undefined
  
  /**
    * The app type. Only "web" is allowed.
    */
  var `type`: web
  
  /**
    * The app owner that is used in the launcher and deviceinfo dialogs.
    */
  var vendor: String
  
  /**
    * The app version number, comprised of three non-negative integers in the format. The default value is "1.0.0"
    *
    * - DO NOT contain leading zeroes.
    * ```
    * ..
    * e.g. "2.1.0" (not "2.1")
    * ```
    *
    * - The major, minor, and revision numbers are all mandatory; otherwise, the app may not be installed.
    * Each number can have up to nine digits. For example, the maximum version is "999999999.999999999.999999999".
    *
    * - The major, minor, and revision numbers are discrete. For example, "1.5.3" is a lower version than "1.15.3".
    *
    * - After uploading your app on the LG Content Store, you cannot upload the same version of your app again.
    * To update and re-upload an app, you must increase the version number.
    */
  var version: String
}
object AppInfo {
  
  inline def apply(
    icon: String,
    id: String,
    largeIcon: String,
    main: String,
    splashBackground: String,
    title: String,
    vendor: String,
    version: String
  ): AppInfo = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], largeIcon = largeIcon.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], splashBackground = splashBackground.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("web")
    __obj.asInstanceOf[AppInfo]
  }
  
  extension [Self <: AppInfo](x: Self) {
    
    inline def setAppDescription(value: String): Self = StObject.set(x, "appDescription", value.asInstanceOf[js.Any])
    
    inline def setAppDescriptionUndefined: Self = StObject.set(x, "appDescription", js.undefined)
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setBgImage(value: String): Self = StObject.set(x, "bgImage", value.asInstanceOf[js.Any])
    
    inline def setBgImageUndefined: Self = StObject.set(x, "bgImage", js.undefined)
    
    inline def setDisableBackHistoryAPI(value: Boolean): Self = StObject.set(x, "disableBackHistoryAPI", value.asInstanceOf[js.Any])
    
    inline def setDisableBackHistoryAPIUndefined: Self = StObject.set(x, "disableBackHistoryAPI", js.undefined)
    
    inline def setHandlesRelaunch(value: Boolean): Self = StObject.set(x, "handlesRelaunch", value.asInstanceOf[js.Any])
    
    inline def setHandlesRelaunchUndefined: Self = StObject.set(x, "handlesRelaunch", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLargeIcon(value: String): Self = StObject.set(x, "largeIcon", value.asInstanceOf[js.Any])
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setRequiredMemory(value: Double): Self = StObject.set(x, "requiredMemory", value.asInstanceOf[js.Any])
    
    inline def setRequiredMemoryUndefined: Self = StObject.set(x, "requiredMemory", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSplashBackground(value: String): Self = StObject.set(x, "splashBackground", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: String): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setType(value: web): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
