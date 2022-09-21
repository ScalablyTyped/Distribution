package typings.webdriverJsExtender

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumWebdriver.mod.WebDriver
import typings.webdriverJsExtender.anon.Altitude
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`0`
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`1`
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`2`
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`3`
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`4`
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`5`
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`6`
import typings.webdriverJsExtender.webdriverJsExtenderNumbers.`7`
import typings.webdriverJsExtender.webdriverJsExtenderStrings.LANDSCAPE
import typings.webdriverJsExtender.webdriverJsExtenderStrings.PORTRAIT
import typings.webdriverJsExtender.webdriverJsExtenderStrings.default
import typings.webdriverJsExtender.webdriverJsExtenderStrings.press
import typings.webdriverJsExtender.webdriverJsExtenderStrings.pressKey
import typings.webdriverJsExtender.webdriverJsExtenderStrings.swipeDown
import typings.webdriverJsExtender.webdriverJsExtenderStrings.tapOut
import typings.webdriverJsExtender.webdriverJsExtenderStrings.tapOutside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webdriver-js-extender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend(baseDriver: WebDriver): ExtendedWebDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(baseDriver.asInstanceOf[js.Any]).asInstanceOf[ExtendedWebDriver]
  inline def extend(baseDriver: WebDriver, fallbackGracefully: Boolean): ExtendedWebDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(baseDriver.asInstanceOf[js.Any], fallbackGracefully.asInstanceOf[js.Any])).asInstanceOf[ExtendedWebDriver]
  
  @js.native
  trait ExtendedWebDriver extends WebDriver {
    
    def closeApp(): js.Promise[Unit] = js.native
    
    def fullscreen(): js.Promise[Unit] = js.native
    
    def getAppStrings(): js.Promise[js.Array[String]] = js.native
    def getAppStrings(language: String): js.Promise[js.Array[String]] = js.native
    
    def getAppiumSettings(): js.Promise[StringDictionary[Any]] = js.native
    
    def getCurrentContext(): js.Promise[String] = js.native
    
    def getCurrentDeviceActivity(): js.Promise[String] = js.native
    
    def getDeviceTime(): js.Promise[String] = js.native
    
    def getGeolocation(): js.Promise[Altitude] = js.native
    
    def getNetworkConnection(): js.Promise[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
    
    def getScreenOrientation(): js.Promise[LANDSCAPE | PORTRAIT] = js.native
    
    def hideSoftKeyboard(): js.Promise[Unit] = js.native
    def hideSoftKeyboard(strategy: default | tapOutside | tapOut | swipeDown | pressKey | press): js.Promise[Unit] = js.native
    def hideSoftKeyboard(strategy: default | tapOutside | tapOut | swipeDown | pressKey | press, key: String): js.Promise[Unit] = js.native
    def hideSoftKeyboard(strategy: Unit, key: String): js.Promise[Unit] = js.native
    
    def installApp(appPath: String): js.Promise[Unit] = js.native
    
    def isAppInstalled(bundleId: String): js.Promise[Boolean] = js.native
    
    def isDeviceLocked(): js.Promise[Boolean] = js.native
    
    def launchSession(): js.Promise[Unit] = js.native
    
    def listContexts(): js.Promise[js.Array[String]] = js.native
    
    def lockDevice(): js.Promise[Unit] = js.native
    def lockDevice(delay: Double): js.Promise[Unit] = js.native
    
    def openDeviceNotifications(): js.Promise[Unit] = js.native
    
    def pullFileFromDevice(path: String): js.Promise[String] = js.native
    
    def pullFolderFromDevice(path: String): js.Promise[Any] = js.native
    
    def pushFileToDevice(path: String, base64Data: String): js.Promise[Unit] = js.native
    
    def removeApp(appId: String): js.Promise[Unit] = js.native
    
    def resetApp(): js.Promise[Unit] = js.native
    
    def rotationGesture(): js.Promise[Unit] = js.native
    def rotationGesture(x: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double, duration: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double, duration: Double, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double, duration: Double, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double, duration: Double, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double, duration: Unit, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double, duration: Unit, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Double, duration: Unit, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Unit, duration: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Unit, duration: Double, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Unit, duration: Double, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Unit, duration: Double, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Unit, duration: Unit, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Unit, duration: Unit, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Double, y: Unit, duration: Unit, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double, duration: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double, duration: Double, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double, duration: Double, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double, duration: Double, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double, duration: Unit, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double, duration: Unit, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Double, duration: Unit, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Unit, duration: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Unit, duration: Double, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Unit, duration: Double, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Unit, duration: Double, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Unit, duration: Unit, rotation: Double): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Unit, duration: Unit, rotation: Double, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    def rotationGesture(x: Unit, y: Unit, duration: Unit, rotation: Unit, touchCount: `1` | `2` | `3` | `4` | `5`): js.Promise[Unit] = js.native
    
    def selectContext(name: String): js.Promise[Unit] = js.native
    
    def sendAppToBackground(): js.Promise[Unit] = js.native
    def sendAppToBackground(delay: Double): js.Promise[Unit] = js.native
    
    def sendChromiumCommand(cmd: String, params: js.Object): js.Promise[Unit] = js.native
    
    def sendChromiumCommandAndGetResult(cmd: String, params: js.Object): js.Promise[js.Object] = js.native
    
    def setAppiumSettings(settings: StringDictionary[Any]): js.Promise[Unit] = js.native
    
    def setGeolocation(): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double, longitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double, longitude: Double, altitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double, longitude: Unit, altitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Unit, longitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Unit, longitude: Double, altitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Unit, longitude: Unit, altitude: Double): js.Promise[Unit] = js.native
    
    def setNetworkConnection(typeOrAirplaneMode: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`, wifi: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`, wifi: Unit, data: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: Unit, data: Boolean): js.Promise[Unit] = js.native
    
    def setScreenOrientation(orientation: String): js.Promise[Unit] = js.native
    
    def shakeDevice(): js.Promise[Unit] = js.native
    
    def startDeviceActivity(appPackage: String, appActivity: String): js.Promise[Unit] = js.native
    def startDeviceActivity(appPackage: String, appActivity: String, appWaitPackage: String): js.Promise[Unit] = js.native
    def startDeviceActivity(appPackage: String, appActivity: String, appWaitPackage: String, appWaitActivity: String): js.Promise[Unit] = js.native
    def startDeviceActivity(appPackage: String, appActivity: String, appWaitPackage: Unit, appWaitActivity: String): js.Promise[Unit] = js.native
    
    def switchToParentFrame(): js.Promise[Unit] = js.native
    
    def toggleAirplaneMode(): js.Promise[Unit] = js.native
    
    def toggleData(): js.Promise[Unit] = js.native
    
    def toggleLocationServices(): js.Promise[Unit] = js.native
    
    def toggleWiFi(): js.Promise[Unit] = js.native
    
    def unlockDevice(): js.Promise[Unit] = js.native
    
    def uploadFile(base64Data: String): js.Promise[Unit] = js.native
  }
}
