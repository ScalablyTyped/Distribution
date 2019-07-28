package typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderMod

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import typings.webdriverDashJsDashExtender.Anon_Altitude
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`0`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`1`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`2`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`3`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`4`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`5`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`6`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderNumbers.`7`
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.LANDSCAPE
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.PORTRAIT
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.default
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.press
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.pressKey
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.swipeDown
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.tapOut
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.tapOutside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def getGeolocation(): js.Promise[Anon_Altitude] = js.native
  def getNetworkConnection(): js.Promise[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  def getScreenOrientation(): js.Promise[LANDSCAPE | PORTRAIT] = js.native
  def hideSoftKeyboard(): js.Promise[Unit] = js.native
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
  def rotationGesture(): js.Promise[Unit] = js.native
  def rotationGesture(x: Double): js.Promise[Unit] = js.native
  def rotationGesture(x: Double, y: Double): js.Promise[Unit] = js.native
  def rotationGesture(x: Double, y: Double, duration: Double): js.Promise[Unit] = js.native
  def rotationGesture(x: Double, y: Double, duration: Double, rotation: Double): js.Promise[Unit] = js.native
  @JSName("rotationGesture")
  def rotationGesture_1(x: Double, y: Double, duration: Double, rotation: Double, touchCount: `1`): js.Promise[Unit] = js.native
  @JSName("rotationGesture")
  def rotationGesture_2(x: Double, y: Double, duration: Double, rotation: Double, touchCount: `2`): js.Promise[Unit] = js.native
  @JSName("rotationGesture")
  def rotationGesture_3(x: Double, y: Double, duration: Double, rotation: Double, touchCount: `3`): js.Promise[Unit] = js.native
  @JSName("rotationGesture")
  def rotationGesture_4(x: Double, y: Double, duration: Double, rotation: Double, touchCount: `4`): js.Promise[Unit] = js.native
  @JSName("rotationGesture")
  def rotationGesture_5(x: Double, y: Double, duration: Double, rotation: Double, touchCount: `5`): js.Promise[Unit] = js.native
  def selectContext(name: String): js.Promise[Unit] = js.native
  def sendAppToBackground(): js.Promise[Unit] = js.native
  def sendAppToBackground(delay: Double): js.Promise[Unit] = js.native
  def sendChromiumCommand(cmd: String, params: js.Object): js.Promise[Unit] = js.native
  def sendChromiumCommandAndGetResult(cmd: String, params: js.Object): js.Promise[js.Object] = js.native
  def setAppiumSettings(settings: StringDictionary[js.Any]): js.Promise[Unit] = js.native
  def setGeolocation(): js.Promise[Unit] = js.native
  def setGeolocation(latitude: Double): js.Promise[Unit] = js.native
  def setGeolocation(latitude: Double, longitude: Double): js.Promise[Unit] = js.native
  def setGeolocation(latitude: Double, longitude: Double, altitude: Double): js.Promise[Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: Boolean): js.Promise[Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: Boolean): js.Promise[Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: Boolean, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_0(typeOrAirplaneMode: `0`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_0(typeOrAirplaneMode: `0`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_0(typeOrAirplaneMode: `0`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_1(typeOrAirplaneMode: `1`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_1(typeOrAirplaneMode: `1`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_1(typeOrAirplaneMode: `1`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_2(typeOrAirplaneMode: `2`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_2(typeOrAirplaneMode: `2`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_2(typeOrAirplaneMode: `2`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_3(typeOrAirplaneMode: `3`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_3(typeOrAirplaneMode: `3`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_3(typeOrAirplaneMode: `3`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_4(typeOrAirplaneMode: `4`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_4(typeOrAirplaneMode: `4`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_4(typeOrAirplaneMode: `4`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_5(typeOrAirplaneMode: `5`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_5(typeOrAirplaneMode: `5`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_5(typeOrAirplaneMode: `5`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_6(typeOrAirplaneMode: `6`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_6(typeOrAirplaneMode: `6`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_6(typeOrAirplaneMode: `6`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_7(typeOrAirplaneMode: `7`): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_7(typeOrAirplaneMode: `7`, wifi: Boolean): js.Promise[Unit] = js.native
  @JSName("setNetworkConnection")
  def setNetworkConnection_7(typeOrAirplaneMode: `7`, wifi: Boolean, data: Boolean): js.Promise[Unit] = js.native
  def setScreenOrientation(orientation: String): js.Promise[Unit] = js.native
  def shakeDevice(): js.Promise[Unit] = js.native
  def startDeviceActivity(appPackage: String, appActivity: String): js.Promise[Unit] = js.native
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

