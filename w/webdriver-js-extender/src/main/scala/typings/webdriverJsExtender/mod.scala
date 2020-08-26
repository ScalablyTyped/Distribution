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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-js-extender", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ExtendedWebDriver extends WebDriver {
    def closeApp(): js.Promise[Unit] = js.native
    def fullscreen(): js.Promise[Unit] = js.native
    def getAppStrings(): js.Promise[js.Array[String]] = js.native
    def getAppStrings(language: String): js.Promise[js.Array[String]] = js.native
    def getAppiumSettings(): js.Promise[StringDictionary[_]] = js.native
    def getCurrentContext(): js.Promise[String] = js.native
    def getCurrentDeviceActivity(): js.Promise[String] = js.native
    def getDeviceTime(): js.Promise[String] = js.native
    def getGeolocation(): js.Promise[Altitude] = js.native
    def getNetworkConnection(): js.Promise[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
    def getScreenOrientation(): js.Promise[LANDSCAPE | PORTRAIT] = js.native
    def hideSoftKeyboard(): js.Promise[Unit] = js.native
    def hideSoftKeyboard(strategy: js.UndefOr[scala.Nothing], key: String): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_default(strategy: default): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_default(strategy: default, key: String): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_press(strategy: press): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_press(strategy: press, key: String): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_pressKey(strategy: pressKey): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_pressKey(strategy: pressKey, key: String): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_swipeDown(strategy: swipeDown): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_swipeDown(strategy: swipeDown, key: String): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_tapOut(strategy: tapOut): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_tapOut(strategy: tapOut, key: String): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_tapOutside(strategy: tapOutside): js.Promise[Unit] = js.native
    @JSName("hideSoftKeyboard")
    def hideSoftKeyboard_tapOutside(strategy: tapOutside, key: String): js.Promise[Unit] = js.native
    def installApp(appPath: String): js.Promise[Unit] = js.native
    def isAppInstalled(bundleId: String): js.Promise[Boolean] = js.native
    def isDeviceLocked(): js.Promise[Boolean] = js.native
    def launchSession(): js.Promise[Unit] = js.native
    def listContexts(): js.Promise[js.Array[String]] = js.native
    def lockDevice(): js.Promise[Unit] = js.native
    def lockDevice(delay: Double): js.Promise[Unit] = js.native
    def openDeviceNotifications(): js.Promise[Unit] = js.native
    def pullFileFromDevice(path: String): js.Promise[String] = js.native
    def pullFolderFromDevice(path: String): js.Promise[_] = js.native
    def pushFileToDevice(path: String, base64Data: String): js.Promise[Unit] = js.native
    def removeApp(appId: String): js.Promise[Unit] = js.native
    def resetApp(): js.Promise[Unit] = js.native
    def rotationGesture(
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      duration: js.UndefOr[Double],
      rotation: js.UndefOr[Double],
      touchCount: js.UndefOr[`1` | `2` | `3` | `4` | `5`]
    ): js.Promise[Unit] = js.native
    def selectContext(name: String): js.Promise[Unit] = js.native
    def sendAppToBackground(): js.Promise[Unit] = js.native
    def sendAppToBackground(delay: Double): js.Promise[Unit] = js.native
    def sendChromiumCommand(cmd: String, params: js.Object): js.Promise[Unit] = js.native
    def sendChromiumCommandAndGetResult(cmd: String, params: js.Object): js.Promise[js.Object] = js.native
    def setAppiumSettings(settings: StringDictionary[js.Any]): js.Promise[Unit] = js.native
    def setGeolocation(): js.Promise[Unit] = js.native
    def setGeolocation(latitude: js.UndefOr[scala.Nothing], longitude: js.UndefOr[scala.Nothing], altitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: js.UndefOr[scala.Nothing], longitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: js.UndefOr[scala.Nothing], longitude: Double, altitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double, longitude: js.UndefOr[scala.Nothing], altitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double, longitude: Double): js.Promise[Unit] = js.native
    def setGeolocation(latitude: Double, longitude: Double, altitude: Double): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: Boolean): js.Promise[Unit] = js.native
    def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_0(typeOrAirplaneMode: `0`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_0(typeOrAirplaneMode: `0`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_0(typeOrAirplaneMode: `0`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_0(typeOrAirplaneMode: `0`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_1(typeOrAirplaneMode: `1`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_1(typeOrAirplaneMode: `1`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_1(typeOrAirplaneMode: `1`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_1(typeOrAirplaneMode: `1`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_2(typeOrAirplaneMode: `2`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_2(typeOrAirplaneMode: `2`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_2(typeOrAirplaneMode: `2`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_2(typeOrAirplaneMode: `2`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_3(typeOrAirplaneMode: `3`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_3(typeOrAirplaneMode: `3`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_3(typeOrAirplaneMode: `3`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_3(typeOrAirplaneMode: `3`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_4(typeOrAirplaneMode: `4`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_4(typeOrAirplaneMode: `4`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_4(typeOrAirplaneMode: `4`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_4(typeOrAirplaneMode: `4`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_5(typeOrAirplaneMode: `5`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_5(typeOrAirplaneMode: `5`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_5(typeOrAirplaneMode: `5`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_5(typeOrAirplaneMode: `5`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_6(typeOrAirplaneMode: `6`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_6(typeOrAirplaneMode: `6`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_6(typeOrAirplaneMode: `6`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_6(typeOrAirplaneMode: `6`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_7(typeOrAirplaneMode: `7`): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_7(typeOrAirplaneMode: `7`, wifi: js.UndefOr[scala.Nothing], data: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_7(typeOrAirplaneMode: `7`, wifi: Boolean): js.Promise[Unit] = js.native
    @JSName("setNetworkConnection")
    def setNetworkConnection_7(typeOrAirplaneMode: `7`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
    def setScreenOrientation(orientation: String): js.Promise[Unit] = js.native
    def shakeDevice(): js.Promise[Unit] = js.native
    def startDeviceActivity(appPackage: String, appActivity: String): js.Promise[Unit] = js.native
    def startDeviceActivity(
      appPackage: String,
      appActivity: String,
      appWaitPackage: js.UndefOr[scala.Nothing],
      appWaitActivity: String
    ): js.Promise[Unit] = js.native
    def startDeviceActivity(appPackage: String, appActivity: String, appWaitPackage: String): js.Promise[Unit] = js.native
    def startDeviceActivity(appPackage: String, appActivity: String, appWaitPackage: String, appWaitActivity: String): js.Promise[Unit] = js.native
    def switchToParentFrame(): js.Promise[Unit] = js.native
    def toggleAirplaneMode(): js.Promise[Unit] = js.native
    def toggleData(): js.Promise[Unit] = js.native
    def toggleLocationServices(): js.Promise[Unit] = js.native
    def toggleWiFi(): js.Promise[Unit] = js.native
    def unlockDevice(): js.Promise[Unit] = js.native
    def uploadFile(base64Data: String): js.Promise[Unit] = js.native
  }
  
  def extend(baseDriver: WebDriver): ExtendedWebDriver = js.native
  def extend(baseDriver: WebDriver, fallbackGracefully: Boolean): ExtendedWebDriver = js.native
}

