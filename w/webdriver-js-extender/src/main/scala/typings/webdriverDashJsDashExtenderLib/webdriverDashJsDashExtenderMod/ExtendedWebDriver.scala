package typings
package webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedWebDriver
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver {
  def closeApp(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def fullscreen(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def getAppStrings(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[java.lang.String]] = js.native
  def getAppStrings(language: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[java.lang.String]] = js.native
  def getAppiumSettings(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getCurrentContext(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  def getCurrentDeviceActivity(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  def getDeviceTime(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  def getGeolocation(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[webdriverDashJsDashExtenderLib.Anon_Altitude] = js.native
  def getNetworkConnection(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[
    webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`
  ] = js.native
  def getScreenOrientation(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[
    webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.LANDSCAPE | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.PORTRAIT
  ] = js.native
  def hideSoftKeyboard(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_default(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.default): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_default(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.default,
    key: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_press(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.press): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_press(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.press,
    key: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_pressKey(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.pressKey): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_pressKey(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.pressKey,
    key: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_swipeDown(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.swipeDown): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_swipeDown(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.swipeDown,
    key: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOut(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOut): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOut(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOut,
    key: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOutside(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOutside): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOutside(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOutside,
    key: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def installApp(appPath: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def isAppInstalled(bundleId: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  def isDeviceLocked(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  def launchSession(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def listContexts(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[java.lang.String]] = js.native
  def lockDevice(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def lockDevice(delay: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def openDeviceNotifications(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def pullFileFromDevice(path: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  def pullFolderFromDevice(path: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  def pushFileToDevice(path: java.lang.String, base64Data: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def removeApp(appId: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def resetApp(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double, y: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double, y: scala.Double, duration: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double, y: scala.Double, duration: scala.Double, rotation: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def selectContext(name: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def sendAppToBackground(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def sendAppToBackground(delay: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def sendChromiumCommand(cmd: java.lang.String, params: js.Object): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def sendChromiumCommandAndGetResult(cmd: java.lang.String, params: js.Object): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Object] = js.native
  def setAppiumSettings(settings: org.scalablytyped.runtime.StringDictionary[js.Any]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setGeolocation(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setGeolocation(latitude: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setGeolocation(latitude: scala.Double, longitude: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setGeolocation(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: scala.Boolean): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: scala.Boolean, wifi: scala.Boolean): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: scala.Boolean, wifi: scala.Boolean, data: scala.Boolean): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`,
    wifi: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def setScreenOrientation(orientation: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def shakeDevice(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def startDeviceActivity(appPackage: java.lang.String, appActivity: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def startDeviceActivity(appPackage: java.lang.String, appActivity: java.lang.String, appWaitPackage: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def startDeviceActivity(
    appPackage: java.lang.String,
    appActivity: java.lang.String,
    appWaitPackage: java.lang.String,
    appWaitActivity: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def switchToParentFrame(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def toggleAirplaneMode(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def toggleData(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def toggleLocationServices(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def toggleWiFi(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def unlockDevice(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  def uploadFile(base64Data: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
}

