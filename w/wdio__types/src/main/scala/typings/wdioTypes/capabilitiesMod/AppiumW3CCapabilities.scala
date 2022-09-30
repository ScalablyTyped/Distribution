package typings.wdioTypes.capabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppiumW3CCapabilities extends StObject {
  
  /**
    * The absolute local path or remote http URL to a .ipa file (IOS), .app folder (IOS Simulator), .apk file (Android)
    * or [.apks file (Android App Bundle)](https://appium.io/docs/en/writing-running-appium/android/android-appbundle/index.html),
    * or a .zip file containing one of these.
    *
    * Appium will attempt to install this app binary on the appropriate device first.
    * Note that this capability is not required for Android if you specify appPackage and appActivity capabilities.
    * UiAutomator2 and XCUITest allow to start the session without app or appPackage.
    */
  @JSName("appium:app")
  var appiumColonapp: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the app to be tested. eg: 'com.android.chrome'.
    */
  @JSName("appium:appPackage")
  var appiumColonappPackage: js.UndefOr[String] = js.undefined
  
  /**
    * Windows-specific capability: Please see https://github.com/appium/appium-windows-driver#usage
    * This is a hexadecimal handle of an existing application top level window to attach to. Either this
    * capability or 'appium:app' must be provided on session startup.
    */
  @JSName("appium:appTopLevelWindow")
  var appiumColonappTopLevelWindow: js.UndefOr[String] = js.undefined
  
  @JSName("appium:appWaitActivity")
  var appiumColonappWaitActivity: js.UndefOr[String] = js.undefined
  
  @JSName("appium:autoWebview")
  var appiumColonautoWebview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which automation engine to use.
    *
    * Acceptable values:
    * + 'Appium' (default)
    * + 'UiAutomator2' for Android
    * + 'Espresso' for Android
    * + 'UiAutomator1' for Android
    * + 'XCUITest' or 'Instruments' for iOS
    * + 'YouiEngine' for application built with You.i Engine
    */
  @JSName("appium:automationName")
  var appiumColonautomationName: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of mobile device or emulator to use, for each platform, it accept different kind of values.
    *
    * ### For iOS, it could be:
    *
    * + Simulator name, eg: 'iPhone Simulator', 'iPad Simulator', 'iPhone Retina 4-inch'.
    * + Instruments name, which comes from 'instruments -s devices' command.
    * + xctrace device name, which comes from 'xcrun xctrace list devices' command. (since Xcode 12)
    *
    * ### For Android, this capability is currently ignored, though it remains required.
    * Note: This document is written with appium 1.22.1 release, this behavior may changed later.
    */
  @JSName("appium:deviceName")
  var appiumColondeviceName: js.UndefOr[String] = js.undefined
  
  @JSName("appium:directConnectHost")
  var appiumColondirectConnectHost: js.UndefOr[String] = js.undefined
  
  @JSName("appium:directConnectPath")
  var appiumColondirectConnectPath: js.UndefOr[String] = js.undefined
  
  @JSName("appium:directConnectPort")
  var appiumColondirectConnectPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Users as directConnect feature by the server
    * https://appiumpro.com/editions/86-connecting-directly-to-appium-hosts-in-distributed-environments
    */
  @JSName("appium:directConnectProtocol")
  var appiumColondirectConnectProtocol: js.UndefOr[String] = js.undefined
  
  @JSName("appium:enablePerformanceLogging")
  var appiumColonenablePerformanceLogging: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:eventTimings")
  var appiumColoneventTimings: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:fullReset")
  var appiumColonfullReset: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:language")
  var appiumColonlanguage: js.UndefOr[String] = js.undefined
  
  @JSName("appium:locale")
  var appiumColonlocale: js.UndefOr[String] = js.undefined
  
  @JSName("appium:nativeWebTap")
  var appiumColonnativeWebTap: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:newCommandTimeout")
  var appiumColonnewCommandTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:noReset")
  var appiumColonnoReset: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:options")
  var appiumColonoptions: js.UndefOr[AppiumCapabilities] = js.undefined
  
  @JSName("appium:orientation")
  var appiumColonorientation: js.UndefOr[String] = js.undefined
  
  /**
    * Which mobile OS platform to use.
    *
    * Acceptable values:
    * + 'iOS'
    * + 'Android'
    * + 'FirefoxOS'
    */
  @JSName("appium:platformName")
  var appiumColonplatformName: js.UndefOr[String] = js.undefined
  
  /**
    * Expected mobile OS version, eg: '7.1', '4.4' etc.
    */
  @JSName("appium:platformVersion")
  var appiumColonplatformVersion: js.UndefOr[String] = js.undefined
  
  @JSName("appium:printPageSourceOnFindFailure")
  var appiumColonprintPageSourceOnFindFailure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * iOS Unique Device Identifier
    */
  @JSName("appium:udid")
  var appiumColonudid: js.UndefOr[String] = js.undefined
}
object AppiumW3CCapabilities {
  
  inline def apply(): AppiumW3CCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppiumW3CCapabilities]
  }
  
  extension [Self <: AppiumW3CCapabilities](x: Self) {
    
    inline def setAppiumColonapp(value: String): Self = StObject.set(x, "appium:app", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonappPackage(value: String): Self = StObject.set(x, "appium:appPackage", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonappPackageUndefined: Self = StObject.set(x, "appium:appPackage", js.undefined)
    
    inline def setAppiumColonappTopLevelWindow(value: String): Self = StObject.set(x, "appium:appTopLevelWindow", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonappTopLevelWindowUndefined: Self = StObject.set(x, "appium:appTopLevelWindow", js.undefined)
    
    inline def setAppiumColonappUndefined: Self = StObject.set(x, "appium:app", js.undefined)
    
    inline def setAppiumColonappWaitActivity(value: String): Self = StObject.set(x, "appium:appWaitActivity", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonappWaitActivityUndefined: Self = StObject.set(x, "appium:appWaitActivity", js.undefined)
    
    inline def setAppiumColonautoWebview(value: Boolean): Self = StObject.set(x, "appium:autoWebview", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonautoWebviewUndefined: Self = StObject.set(x, "appium:autoWebview", js.undefined)
    
    inline def setAppiumColonautomationName(value: String): Self = StObject.set(x, "appium:automationName", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonautomationNameUndefined: Self = StObject.set(x, "appium:automationName", js.undefined)
    
    inline def setAppiumColondeviceName(value: String): Self = StObject.set(x, "appium:deviceName", value.asInstanceOf[js.Any])
    
    inline def setAppiumColondeviceNameUndefined: Self = StObject.set(x, "appium:deviceName", js.undefined)
    
    inline def setAppiumColondirectConnectHost(value: String): Self = StObject.set(x, "appium:directConnectHost", value.asInstanceOf[js.Any])
    
    inline def setAppiumColondirectConnectHostUndefined: Self = StObject.set(x, "appium:directConnectHost", js.undefined)
    
    inline def setAppiumColondirectConnectPath(value: String): Self = StObject.set(x, "appium:directConnectPath", value.asInstanceOf[js.Any])
    
    inline def setAppiumColondirectConnectPathUndefined: Self = StObject.set(x, "appium:directConnectPath", js.undefined)
    
    inline def setAppiumColondirectConnectPort(value: Double): Self = StObject.set(x, "appium:directConnectPort", value.asInstanceOf[js.Any])
    
    inline def setAppiumColondirectConnectPortUndefined: Self = StObject.set(x, "appium:directConnectPort", js.undefined)
    
    inline def setAppiumColondirectConnectProtocol(value: String): Self = StObject.set(x, "appium:directConnectProtocol", value.asInstanceOf[js.Any])
    
    inline def setAppiumColondirectConnectProtocolUndefined: Self = StObject.set(x, "appium:directConnectProtocol", js.undefined)
    
    inline def setAppiumColonenablePerformanceLogging(value: Boolean): Self = StObject.set(x, "appium:enablePerformanceLogging", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonenablePerformanceLoggingUndefined: Self = StObject.set(x, "appium:enablePerformanceLogging", js.undefined)
    
    inline def setAppiumColoneventTimings(value: Boolean): Self = StObject.set(x, "appium:eventTimings", value.asInstanceOf[js.Any])
    
    inline def setAppiumColoneventTimingsUndefined: Self = StObject.set(x, "appium:eventTimings", js.undefined)
    
    inline def setAppiumColonfullReset(value: Boolean): Self = StObject.set(x, "appium:fullReset", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonfullResetUndefined: Self = StObject.set(x, "appium:fullReset", js.undefined)
    
    inline def setAppiumColonlanguage(value: String): Self = StObject.set(x, "appium:language", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonlanguageUndefined: Self = StObject.set(x, "appium:language", js.undefined)
    
    inline def setAppiumColonlocale(value: String): Self = StObject.set(x, "appium:locale", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonlocaleUndefined: Self = StObject.set(x, "appium:locale", js.undefined)
    
    inline def setAppiumColonnativeWebTap(value: Boolean): Self = StObject.set(x, "appium:nativeWebTap", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonnativeWebTapUndefined: Self = StObject.set(x, "appium:nativeWebTap", js.undefined)
    
    inline def setAppiumColonnewCommandTimeout(value: Double): Self = StObject.set(x, "appium:newCommandTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonnewCommandTimeoutUndefined: Self = StObject.set(x, "appium:newCommandTimeout", js.undefined)
    
    inline def setAppiumColonnoReset(value: Boolean): Self = StObject.set(x, "appium:noReset", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonnoResetUndefined: Self = StObject.set(x, "appium:noReset", js.undefined)
    
    inline def setAppiumColonoptions(value: AppiumCapabilities): Self = StObject.set(x, "appium:options", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonoptionsUndefined: Self = StObject.set(x, "appium:options", js.undefined)
    
    inline def setAppiumColonorientation(value: String): Self = StObject.set(x, "appium:orientation", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonorientationUndefined: Self = StObject.set(x, "appium:orientation", js.undefined)
    
    inline def setAppiumColonplatformName(value: String): Self = StObject.set(x, "appium:platformName", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonplatformNameUndefined: Self = StObject.set(x, "appium:platformName", js.undefined)
    
    inline def setAppiumColonplatformVersion(value: String): Self = StObject.set(x, "appium:platformVersion", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonplatformVersionUndefined: Self = StObject.set(x, "appium:platformVersion", js.undefined)
    
    inline def setAppiumColonprintPageSourceOnFindFailure(value: Boolean): Self = StObject.set(x, "appium:printPageSourceOnFindFailure", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonprintPageSourceOnFindFailureUndefined: Self = StObject.set(x, "appium:printPageSourceOnFindFailure", js.undefined)
    
    inline def setAppiumColonudid(value: String): Self = StObject.set(x, "appium:udid", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonudidUndefined: Self = StObject.set(x, "appium:udid", js.undefined)
  }
}
