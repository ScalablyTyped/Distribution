package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// generated typings
// webdriver types
// appium types
// jsonwp types
// mjsonwp types
// saucelabs types
@js.native
trait Client[T] extends js.Object {
  var capabilities: DesiredCapabilities = js.native
  var isAndroid: scala.Boolean = js.native
  var isIOS: scala.Boolean = js.native
  var isMobile: scala.Boolean = js.native
  var isW3C: scala.Boolean = js.native
  def acceptAlert(): js.UndefOr[scala.Nothing] = js.native
  def activateIME(engine: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def addCookie(cookie: js.Object): js.UndefOr[scala.Nothing] = js.native
  def assertPerformance(assertOptions: js.Object): scala.Boolean = js.native
  def back(): js.UndefOr[scala.Nothing] = js.native
  def background(): js.UndefOr[scala.Nothing] = js.native
  def background(duration: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def buttonDown(): js.UndefOr[scala.Nothing] = js.native
  def buttonDown(button: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def buttonUp(): js.UndefOr[scala.Nothing] = js.native
  def buttonUp(button: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def clearLocalStorage(): js.UndefOr[scala.Nothing] = js.native
  def clearSessionStorage(): js.UndefOr[scala.Nothing] = js.native
  def closeApp(): js.UndefOr[scala.Nothing] = js.native
  def closeWindow(): js.UndefOr[scala.Nothing] = js.native
  def createWindow(`type`: java.lang.String): js.Object = js.native
  def deactivateIME(): js.UndefOr[scala.Nothing] = js.native
  def deleteAllCookies(): js.UndefOr[scala.Nothing] = js.native
  def deleteCookie(name: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def deleteLocalStorageItem(key: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def deleteSession(): js.UndefOr[scala.Nothing] = js.native
  def deleteSessionStorageItem(key: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def dismissAlert(): js.UndefOr[scala.Nothing] = js.native
  def elementClear(): js.UndefOr[scala.Nothing] = js.native
  def elementClick(): js.UndefOr[scala.Nothing] = js.native
  def elementEquals(otherElementId: java.lang.String): scala.Boolean = js.native
  def elementSendKeys(text: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def elementSendKeys(text: java.lang.String, value: js.Array[java.lang.String]): js.UndefOr[scala.Nothing] = js.native
  def elementSendKeys(value: js.Array[java.lang.String]): js.UndefOr[scala.Nothing] = js.native
  def elementSubmit(): js.UndefOr[scala.Nothing] = js.native
  def endCoverage(intent: java.lang.String, path: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def executeAsyncScript(
    script: java.lang.String,
    args: js.Array[java.lang.String | js.Object | scala.Double | scala.Boolean]
  ): js.UndefOr[scala.Nothing] = js.native
  @JSName("executeAsyncScript")
  def executeAsyncScript_Any(
    script: java.lang.String,
    args: js.Array[java.lang.String | js.Object | scala.Double | scala.Boolean]
  ): js.Any = js.native
  def executeScript(
    script: java.lang.String,
    args: js.Array[java.lang.String | js.Object | scala.Double | scala.Boolean]
  ): js.UndefOr[scala.Nothing] = js.native
  @JSName("executeScript")
  def executeScript_Any(
    script: java.lang.String,
    args: js.Array[java.lang.String | js.Object | scala.Double | scala.Boolean]
  ): js.Any = js.native
  def findElement(using: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def findElementFromElement(using: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def findElements(using: java.lang.String, value: java.lang.String): js.Array[java.lang.String] = js.native
  def findElementsFromElement(using: java.lang.String, value: java.lang.String): js.Array[java.lang.String] = js.native
  def fingerPrint(fingerprintId: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def forward(): js.UndefOr[scala.Nothing] = js.native
  def fullscreenWindow(): js.Object = js.native
  def getActiveElement(): java.lang.String = js.native
  def getActiveEngine(): js.UndefOr[scala.Nothing] = js.native
  def getAlertText(): js.UndefOr[scala.Nothing] = js.native
  @JSName("getAlertText")
  def getAlertText_String(): java.lang.String = js.native
  def getAllCookies(): js.Array[js.Object] = js.native
  @JSName("getAllCookies")
  def getAllCookies_UndefOr(): js.UndefOr[scala.Nothing] = js.native
  def getApplicationCacheStatus(): scala.Double = js.native
  def getAvailableEngines(): js.UndefOr[scala.Nothing] = js.native
  def getContext(): java.lang.String | scala.Null = js.native
  def getContexts(): js.Array[java.lang.String] = js.native
  def getCurrentActivity(): js.UndefOr[scala.Nothing] = js.native
  def getCurrentPackage(): js.UndefOr[scala.Nothing] = js.native
  def getDeviceTime(): js.UndefOr[scala.Nothing] = js.native
  def getDisplayDensity(): js.UndefOr[scala.Nothing] = js.native
  def getElementAttribute(name: java.lang.String): java.lang.String | scala.Null = js.native
  @JSName("getElementAttribute")
  def getElementAttribute_String(name: java.lang.String): java.lang.String = js.native
  def getElementCSSValue(propertyName: java.lang.String): java.lang.String = js.native
  def getElementLocation(): js.Object = js.native
  def getElementLocationInView(): js.Object = js.native
  def getElementProperty(name: java.lang.String): java.lang.String = js.native
  def getElementRect(): js.Object = js.native
  def getElementSize(): js.Object = js.native
  def getElementTagName(): java.lang.String = js.native
  def getElementText(): java.lang.String = js.native
  def getGeoLocation(): js.Object = js.native
  def getLocalStorage(): js.Array[java.lang.String] = js.native
  def getLocalStorageItem(key: java.lang.String): java.lang.String = js.native
  def getLocalStorageSize(): scala.Double = js.native
  def getLogTypes(): js.Array[java.lang.String] = js.native
  def getLogs(`type`: java.lang.String): js.Array[js.Object] = js.native
  def getNamedCookie(name: java.lang.String): js.Object = js.native
  def getNetworkConnection(): scala.Double = js.native
  def getOrientation(): js.UndefOr[scala.Nothing] = js.native
  def getPageIndex(): js.UndefOr[scala.Nothing] = js.native
  def getPageLogs(`type`: java.lang.String): js.Object = js.native
  def getPageSource(): js.UndefOr[scala.Nothing] = js.native
  def getPerformanceData(packageName: java.lang.String, dataType: java.lang.String, dataReadTimeout: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getPerformanceDataTypes(): js.UndefOr[scala.Nothing] = js.native
  def getSession(): js.Object = js.native
  def getSessionStorage(): js.Array[java.lang.String] = js.native
  def getSessionStorageItem(key: java.lang.String): java.lang.String = js.native
  def getSessionStorageSize(): js.UndefOr[scala.Nothing] = js.native
  def getSessions(): js.Array[js.Object] = js.native
  def getSettings(): js.UndefOr[scala.Nothing] = js.native
  def getStrings(language: java.lang.String, stringFile: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def getSystemBars(): js.UndefOr[scala.Nothing] = js.native
  def getTimeouts(): js.Object = js.native
  def getTitle(): java.lang.String = js.native
  def getUrl(): js.UndefOr[scala.Nothing] = js.native
  @JSName("getUrl")
  def getUrl_String(): java.lang.String = js.native
  def getWindowHandle(): java.lang.String = js.native
  def getWindowHandles(): js.Array[java.lang.String] = js.native
  def getWindowPosition(): js.Object = js.native
  def getWindowRect(): js.Object = js.native
  def getWindowSize(): js.Object = js.native
  def gsmCall(phoneNumber: java.lang.String, action: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def gsmSignal(signalStrengh: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def gsmVoice(state: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def hideKeyboard(
    strategy: java.lang.String,
    key: java.lang.String,
    keyCode: java.lang.String,
    keyName: java.lang.String
  ): js.UndefOr[scala.Nothing] = js.native
  def installApp(appPath: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def interceptRequest(rule: js.Object): js.UndefOr[scala.Nothing] = js.native
  def isAppInstalled(bundleId: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def isElementDisplayed(): scala.Boolean = js.native
  def isElementEnabled(): scala.Boolean = js.native
  def isElementSelected(): scala.Boolean = js.native
  def isIMEActivated(): js.UndefOr[scala.Nothing] = js.native
  def isKeyboardShown(): js.UndefOr[scala.Nothing] = js.native
  def isLocked(): js.UndefOr[scala.Nothing] = js.native
  def launchApp(): js.UndefOr[scala.Nothing] = js.native
  def lock(seconds: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def longPressKeyCode(keycode: java.lang.String, metastate: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def maximizeWindow(): js.UndefOr[scala.Nothing] = js.native
  @JSName("maximizeWindow")
  def maximizeWindow_Object(): js.Object = js.native
  def minimizeWindow(): js.Object = js.native
  def moveToElement(): js.UndefOr[scala.Nothing] = js.native
  def moveToElement(element: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def moveToElement(element: java.lang.String, xoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def moveToElement(element: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def moveToElement(element: scala.Null, xoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def moveToElement(element: scala.Null, xoffset: scala.Double, yoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def multiTouchPerform(actions: js.Array[js.Object]): js.UndefOr[scala.Nothing] = js.native
  def multiTouchPerform(actions: js.Array[js.Object], elementId: js.Array[js.Object]): js.UndefOr[scala.Nothing] = js.native
  def navigateTo(url: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  @JSName("navigateTo")
  def navigateTo_String(url: java.lang.String): java.lang.String = js.native
  def newSession(capabilities: js.Object): js.Object = js.native
  def newSession(desiredCapabilities: js.Object, requiredCapabilities: js.Object): js.Object = js.native
  def openNotifications(): js.UndefOr[scala.Nothing] = js.native
  def performActions(actions: js.Array[js.Object]): js.UndefOr[scala.Nothing] = js.native
  def positionClick(): js.UndefOr[scala.Nothing] = js.native
  def positionClick(button: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def positionDoubleClick(): js.UndefOr[scala.Nothing] = js.native
  def pressKeyCode(keycode: java.lang.String, metastate: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def pullFile(path: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def pullFolder(path: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def pushFile(path: java.lang.String, data: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def receiveAsyncResponse(response: js.Object): js.UndefOr[scala.Nothing] = js.native
  def receiveAsyncResponse(status: java.lang.String, value: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def refresh(): js.UndefOr[scala.Nothing] = js.native
  def releaseActions(): js.UndefOr[scala.Nothing] = js.native
  def removeApp(appId: js.Array[java.lang.String], bundleId: js.Array[java.lang.String]): js.UndefOr[scala.Nothing] = js.native
  def replaceValue(value: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def reset(): js.UndefOr[scala.Nothing] = js.native
  def rotateDevice(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    rotation: scala.Double,
    touchCount: scala.Double,
    duration: scala.Double,
    element: java.lang.String
  ): js.UndefOr[scala.Nothing] = js.native
  def sendAlertText(text: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def sendKeyEvent(keycode: java.lang.String, metastate: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def sendKeys(value: js.Array[java.lang.String]): js.UndefOr[scala.Nothing] = js.native
  def sendSms(phoneNumber: java.lang.String, message: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setAsyncTimeout(ms: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setGeoLocation(location: js.Object): js.UndefOr[scala.Nothing] = js.native
  def setImplicitTimeout(ms: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setLocalStorage(key: java.lang.String, value: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setNetworkConnection(connectionType: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setOrientation(engine: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setSessionStorage(key: java.lang.String, value: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setTimeouts(): js.UndefOr[scala.Nothing] = js.native
  def setTimeouts(`implicit`: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setTimeouts(`implicit`: scala.Double, pageLoad: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setTimeouts(`implicit`: scala.Double, pageLoad: scala.Double, script: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setTimeouts(`type`: java.lang.String, ms: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setValueImmediate(value: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setWindowPosition(x: scala.Double, y: scala.Double): js.Object = js.native
  def setWindowRect(): js.Object = js.native
  def setWindowRect(x: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Double, y: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Double, y: scala.Double, width: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Double, y: scala.Double, width: scala.Null, height: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Double, y: scala.Null, width: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Double, y: scala.Null, width: scala.Double, height: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Double, y: scala.Null, width: scala.Null, height: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Null, y: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Null, y: scala.Double, width: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Null, y: scala.Double, width: scala.Double, height: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Null, y: scala.Double, width: scala.Null, height: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Null, y: scala.Null, width: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Null, y: scala.Null, width: scala.Double, height: scala.Double): js.Object = js.native
  def setWindowRect(x: scala.Null, y: scala.Null, width: scala.Null, height: scala.Double): js.Object = js.native
  def setWindowSize(width: scala.Double, height: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def shake(): js.UndefOr[scala.Nothing] = js.native
  def startActivity(
    appPackage: java.lang.String,
    appActivity: java.lang.String,
    appWaitPackage: java.lang.String,
    appWaitActivity: java.lang.String,
    intentAction: java.lang.String,
    intentCategory: java.lang.String,
    intentFlags: java.lang.String,
    optionalIntentArguments: java.lang.String,
    dontStopAppOnReset: java.lang.String
  ): js.UndefOr[scala.Nothing] = js.native
  def startRecordingScreen(
    filePath: java.lang.String,
    videoSize: scala.Double,
    timeLimit: scala.Double,
    bitRate: scala.Double
  ): js.UndefOr[scala.Nothing] = js.native
  def status(): js.Object = js.native
  def stopRecordingScreen(): js.UndefOr[scala.Nothing] = js.native
  def switchContext(name: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def switchToFrame(): js.UndefOr[scala.Nothing] = js.native
  def switchToFrame(id: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def switchToFrame(id: js.Object): js.UndefOr[scala.Nothing] = js.native
  def switchToFrame(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def switchToParentFrame(): js.UndefOr[scala.Nothing] = js.native
  def switchToWindow(handle: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def takeElementScreenshot(): java.lang.String = js.native
  def takeElementScreenshot(scroll: scala.Boolean): java.lang.String = js.native
  def takeScreenshot(): java.lang.String = js.native
  def throttleNetwork(condition: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def throttleNetwork(condition: js.Object): js.UndefOr[scala.Nothing] = js.native
  def toggleAirplaneMode(): js.UndefOr[scala.Nothing] = js.native
  def toggleData(): js.UndefOr[scala.Nothing] = js.native
  def toggleEnrollTouchId(enabled: scala.Boolean): js.UndefOr[scala.Nothing] = js.native
  def toggleLocationServices(): js.UndefOr[scala.Nothing] = js.native
  def toggleWiFi(): js.UndefOr[scala.Nothing] = js.native
  def touchClick(element: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def touchDoubleClick(element: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def touchDown(): js.UndefOr[scala.Nothing] = js.native
  def touchDown(x: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchDown(x: scala.Double, y: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchFlick(xoffset: scala.Double, yoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchFlick(xoffset: scala.Double, yoffset: scala.Double, element: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def touchFlick(xoffset: scala.Double, yoffset: scala.Double, element: java.lang.String, speed: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchId(`match`: scala.Boolean): js.UndefOr[scala.Nothing] = js.native
  def touchLongClick(element: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def touchMove(): js.UndefOr[scala.Nothing] = js.native
  def touchMove(x: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchMove(x: scala.Double, y: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchPerform(actions: js.Array[js.Object]): js.UndefOr[scala.Nothing] = js.native
  def touchScroll(xoffset: scala.Double, yoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchScroll(xoffset: scala.Double, yoffset: scala.Double, element: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def touchUp(): js.UndefOr[scala.Nothing] = js.native
  def touchUp(x: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def touchUp(x: scala.Double, y: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def unlock(): js.UndefOr[scala.Nothing] = js.native
  def updateSettings(settings: js.Object): js.UndefOr[scala.Nothing] = js.native
}

