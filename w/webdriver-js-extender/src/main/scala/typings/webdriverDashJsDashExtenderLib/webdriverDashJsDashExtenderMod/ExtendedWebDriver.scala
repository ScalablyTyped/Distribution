package typings
package webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedWebDriver
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver {
  def closeApp(): js.Promise[scala.Unit] = js.native
  def fullscreen(): js.Promise[scala.Unit] = js.native
  def getAppStrings(): js.Promise[js.Array[java.lang.String]] = js.native
  def getAppStrings(language: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def getAppiumSettings(): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getCurrentContext(): js.Promise[java.lang.String] = js.native
  def getCurrentDeviceActivity(): js.Promise[java.lang.String] = js.native
  def getDeviceTime(): js.Promise[java.lang.String] = js.native
  def getGeolocation(): js.Promise[webdriverDashJsDashExtenderLib.Anon_Altitude] = js.native
  def getNetworkConnection(): js.Promise[
    webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6` | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`
  ] = js.native
  def getScreenOrientation(): js.Promise[
    webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.LANDSCAPE | webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.PORTRAIT
  ] = js.native
  def hideSoftKeyboard(): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_default(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.default): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_default(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.default,
    key: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_press(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.press): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_press(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.press,
    key: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_pressKey(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.pressKey): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_pressKey(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.pressKey,
    key: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_swipeDown(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.swipeDown): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_swipeDown(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.swipeDown,
    key: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOut(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOut): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOut(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOut,
    key: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOutside(strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOutside): js.Promise[scala.Unit] = js.native
  @JSName("hideSoftKeyboard")
  def hideSoftKeyboard_tapOutside(
    strategy: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibStrings.tapOutside,
    key: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def installApp(appPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def isAppInstalled(bundleId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def isDeviceLocked(): js.Promise[scala.Boolean] = js.native
  def launchSession(): js.Promise[scala.Unit] = js.native
  def listContexts(): js.Promise[js.Array[java.lang.String]] = js.native
  def lockDevice(): js.Promise[scala.Unit] = js.native
  def lockDevice(delay: scala.Double): js.Promise[scala.Unit] = js.native
  def openDeviceNotifications(): js.Promise[scala.Unit] = js.native
  def pullFileFromDevice(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def pullFolderFromDevice(path: java.lang.String): js.Promise[_] = js.native
  def pushFileToDevice(path: java.lang.String, base64Data: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeApp(appId: java.lang.String): js.Promise[scala.Unit] = js.native
  def resetApp(): js.Promise[scala.Unit] = js.native
  def rotationGesture(): js.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double): js.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double, y: scala.Double): js.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double, y: scala.Double, duration: scala.Double): js.Promise[scala.Unit] = js.native
  def rotationGesture(x: scala.Double, y: scala.Double, duration: scala.Double, rotation: scala.Double): js.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`
  ): js.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`
  ): js.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`
  ): js.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`
  ): js.Promise[scala.Unit] = js.native
  def rotationGesture(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    rotation: scala.Double,
    touchCount: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`
  ): js.Promise[scala.Unit] = js.native
  def selectContext(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def sendAppToBackground(): js.Promise[scala.Unit] = js.native
  def sendAppToBackground(delay: scala.Double): js.Promise[scala.Unit] = js.native
  def sendChromiumCommand(cmd: java.lang.String, params: js.Object): js.Promise[scala.Unit] = js.native
  def sendChromiumCommandAndGetResult(cmd: java.lang.String, params: js.Object): js.Promise[js.Object] = js.native
  def setAppiumSettings(settings: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[scala.Unit] = js.native
  def setGeolocation(): js.Promise[scala.Unit] = js.native
  def setGeolocation(latitude: scala.Double): js.Promise[scala.Unit] = js.native
  def setGeolocation(latitude: scala.Double, longitude: scala.Double): js.Promise[scala.Unit] = js.native
  def setGeolocation(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: scala.Boolean): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: scala.Boolean, wifi: scala.Boolean): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: scala.Boolean, wifi: scala.Boolean, data: scala.Boolean): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`0`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`1`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`2`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`3`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`4`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`5`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`6`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`,
    wifi: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setNetworkConnection(
    typeOrAirplaneMode: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderLibNumbers.`7`,
    wifi: scala.Boolean,
    data: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def setScreenOrientation(orientation: java.lang.String): js.Promise[scala.Unit] = js.native
  def shakeDevice(): js.Promise[scala.Unit] = js.native
  def startDeviceActivity(appPackage: java.lang.String, appActivity: java.lang.String): js.Promise[scala.Unit] = js.native
  def startDeviceActivity(appPackage: java.lang.String, appActivity: java.lang.String, appWaitPackage: java.lang.String): js.Promise[scala.Unit] = js.native
  def startDeviceActivity(
    appPackage: java.lang.String,
    appActivity: java.lang.String,
    appWaitPackage: java.lang.String,
    appWaitActivity: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def switchToParentFrame(): js.Promise[scala.Unit] = js.native
  def toggleAirplaneMode(): js.Promise[scala.Unit] = js.native
  def toggleData(): js.Promise[scala.Unit] = js.native
  def toggleLocationServices(): js.Promise[scala.Unit] = js.native
  def toggleWiFi(): js.Promise[scala.Unit] = js.native
  def unlockDevice(): js.Promise[scala.Unit] = js.native
  def uploadFile(base64Data: java.lang.String): js.Promise[scala.Unit] = js.native
}

