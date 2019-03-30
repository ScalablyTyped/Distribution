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
// chromium types
// saucelabs types
@js.native
trait Client extends js.Object {
  def _setWindowSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def acceptAlert(): scala.Unit = js.native
  def activateIME(engine: java.lang.String): scala.Unit = js.native
  def addCookie(cookie: js.Object): scala.Unit = js.native
  def assertPerformance(name: java.lang.String): scala.Boolean = js.native
  def assertPerformance(name: java.lang.String, metrics: js.Array[java.lang.String]): scala.Boolean = js.native
  def back(): scala.Unit = js.native
  def background(): scala.Unit = js.native
  def background(seconds: scala.Double): scala.Unit = js.native
  def buttonDown(): scala.Unit = js.native
  def buttonDown(button: scala.Double): scala.Unit = js.native
  def buttonUp(): scala.Unit = js.native
  def buttonUp(button: scala.Double): scala.Unit = js.native
  def clearLocalStorage(): scala.Unit = js.native
  def clearSessionStorage(): scala.Unit = js.native
  def closeApp(): scala.Unit = js.native
  def closeWindow(): scala.Unit = js.native
  def createWindow(`type`: java.lang.String): js.Object = js.native
  def deactivateIME(): scala.Unit = js.native
  def deleteAllCookies(): scala.Unit = js.native
  def deleteCookie(name: java.lang.String): scala.Unit = js.native
  def deleteLocalStorageItem(key: java.lang.String): scala.Unit = js.native
  def deleteNetworkConditions(): scala.Unit = js.native
  def deleteSession(): scala.Unit = js.native
  def deleteSessionStorageItem(key: java.lang.String): scala.Unit = js.native
  def dismissAlert(): scala.Unit = js.native
  def elementClear(): scala.Unit = js.native
  def elementClick(): scala.Unit = js.native
  def elementEquals(otherElementId: java.lang.String): scala.Boolean = js.native
  def elementHover(): scala.Unit = js.native
  def elementSendKeys(text: java.lang.String): scala.Unit = js.native
  def elementSendKeys(text: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  def elementSendKeys(value: js.Array[java.lang.String]): scala.Unit = js.native
  def elementSubmit(): scala.Unit = js.native
  def endCoverage(intent: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def executeAsyncScript(
    script: java.lang.String,
    args: js.Array[js.UndefOr[java.lang.String | js.Object | scala.Double | scala.Boolean]]
  ): scala.Unit = js.native
  @JSName("executeAsyncScript")
  def executeAsyncScript_Any(
    script: java.lang.String,
    args: js.Array[js.UndefOr[java.lang.String | js.Object | scala.Double | scala.Boolean]]
  ): js.Any = js.native
  def executeScript(
    script: java.lang.String,
    args: js.Array[js.UndefOr[java.lang.String | js.Object | scala.Double | scala.Boolean]]
  ): scala.Unit = js.native
  @JSName("executeScript")
  def executeScript_Any(
    script: java.lang.String,
    args: js.Array[js.UndefOr[java.lang.String | js.Object | scala.Double | scala.Boolean]]
  ): js.Any = js.native
  def findElement(using: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def findElementFromElement(using: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def findElements(using: java.lang.String, value: java.lang.String): js.Array[java.lang.String] = js.native
  def findElementsFromElement(using: java.lang.String, value: java.lang.String): js.Array[java.lang.String] = js.native
  def fingerPrint(fingerprintId: scala.Double): scala.Unit = js.native
  def forward(): scala.Unit = js.native
  def freeze(): scala.Unit = js.native
  def fullscreenWindow(): js.Object = js.native
  def generateTestReport(message: java.lang.String, group: java.lang.String): scala.Unit = js.native
  def getActiveElement(): java.lang.String = js.native
  def getActiveEngine(): scala.Unit = js.native
  def getAlertText(): java.lang.String = js.native
  @JSName("getAlertText")
  def getAlertText_Unit(): scala.Unit = js.native
  def getAllCookies(): js.Array[js.Object] = js.native
  @JSName("getAllCookies")
  def getAllCookies_Unit(): scala.Unit = js.native
  def getApplicationCacheStatus(): scala.Double = js.native
  def getAvailableEngines(): scala.Unit = js.native
  def getContext(): java.lang.String | scala.Null = js.native
  def getContexts(): js.Array[java.lang.String] = js.native
  def getCurrentActivity(): scala.Unit = js.native
  def getCurrentPackage(): scala.Unit = js.native
  def getDeviceTime(): scala.Unit = js.native
  def getDisplayDensity(): scala.Unit = js.native
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
  def getElementValue(): java.lang.String | scala.Null = js.native
  def getGeoLocation(): js.Object = js.native
  def getLocalStorage(): js.Array[java.lang.String] = js.native
  def getLocalStorageItem(key: java.lang.String): java.lang.String = js.native
  def getLocalStorageSize(): scala.Double = js.native
  def getLogTypes(): js.Array[java.lang.String] = js.native
  def getLogs(`type`: java.lang.String): js.Array[js.Object] = js.native
  def getNamedCookie(name: java.lang.String): js.Object = js.native
  def getNetworkConditions(): scala.Unit = js.native
  def getNetworkConnection(): scala.Double = js.native
  def getOrientation(): scala.Unit = js.native
  def getPageIndex(): scala.Unit = js.native
  def getPageLogs(`type`: java.lang.String): js.Object = js.native
  def getPageSource(): scala.Unit = js.native
  def getPerformanceData(packageName: java.lang.String, dataType: java.lang.String, dataReadTimeout: scala.Double): scala.Unit = js.native
  def getPerformanceDataTypes(): scala.Unit = js.native
  def getSession(): js.Object = js.native
  def getSessionStorage(): js.Array[java.lang.String] = js.native
  def getSessionStorageItem(key: java.lang.String): java.lang.String = js.native
  def getSessionStorageSize(): scala.Unit = js.native
  def getSessions(): js.Array[js.Object] = js.native
  def getSettings(): scala.Unit = js.native
  def getStrings(language: java.lang.String, stringFile: java.lang.String): scala.Unit = js.native
  def getSystemBars(): scala.Unit = js.native
  def getTimeouts(): js.Object = js.native
  def getTitle(): java.lang.String = js.native
  def getUrl(): java.lang.String = js.native
  @JSName("getUrl")
  def getUrl_Unit(): scala.Unit = js.native
  def getWindowHandle(): java.lang.String = js.native
  def getWindowHandles(): js.Array[java.lang.String] = js.native
  def getWindowPosition(): js.Object = js.native
  def getWindowRect(): js.Object = js.native
  def getWindowSize(): js.Object = js.native
  def gsmCall(phoneNumber: java.lang.String, action: java.lang.String): scala.Unit = js.native
  def gsmSignal(signalStrength: java.lang.String, signalStrengh: java.lang.String): scala.Unit = js.native
  def gsmVoice(state: java.lang.String): scala.Unit = js.native
  def hideKeyboard(
    strategy: java.lang.String,
    key: java.lang.String,
    keyCode: java.lang.String,
    keyName: java.lang.String
  ): scala.Unit = js.native
  def installApp(appPath: java.lang.String): scala.Unit = js.native
  def interceptRequest(rule: js.Object): scala.Unit = js.native
  def isAlertOpen(): scala.Boolean = js.native
  def isAppInstalled(bundleId: java.lang.String): scala.Unit = js.native
  def isAutoReporting(): scala.Boolean = js.native
  def isElementDisplayed(): scala.Boolean = js.native
  def isElementEnabled(): scala.Boolean = js.native
  def isElementSelected(): scala.Boolean = js.native
  def isIMEActivated(): scala.Unit = js.native
  def isKeyboardShown(): scala.Unit = js.native
  def isLoading(): scala.Boolean = js.native
  def isLocked(): scala.Unit = js.native
  def launchApp(): scala.Unit = js.native
  def launchApp(id: java.lang.String): scala.Unit = js.native
  def lock(seconds: scala.Double): scala.Unit = js.native
  def longPressKeyCode(keycode: scala.Double, metastate: scala.Double): scala.Unit = js.native
  def maximizeWindow(): js.Object = js.native
  @JSName("maximizeWindow")
  def maximizeWindow_Unit(): scala.Unit = js.native
  def minimizeWindow(): js.Object = js.native
  def moveToElement(): scala.Unit = js.native
  def moveToElement(element: java.lang.String): scala.Unit = js.native
  def moveToElement(element: java.lang.String, xoffset: scala.Double): scala.Unit = js.native
  def moveToElement(element: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): scala.Unit = js.native
  def moveToElement(element: scala.Null, xoffset: scala.Double): scala.Unit = js.native
  def moveToElement(element: scala.Null, xoffset: scala.Double, yoffset: scala.Double): scala.Unit = js.native
  def multiTouchPerform(actions: js.Array[js.Object]): scala.Unit = js.native
  def multiTouchPerform(actions: js.Array[js.Object], elementId: js.Array[js.Object]): scala.Unit = js.native
  def navigateTo(url: java.lang.String): java.lang.String = js.native
  @JSName("navigateTo")
  def navigateTo_Unit(url: java.lang.String): scala.Unit = js.native
  def newSession(capabilities: js.Object): js.Object = js.native
  def newSession(desiredCapabilities: js.Object, requiredCapabilities: js.Object): js.Object = js.native
  def openNotifications(): scala.Unit = js.native
  def performActions(actions: js.Array[js.Object]): scala.Unit = js.native
  def positionClick(): scala.Unit = js.native
  def positionClick(button: scala.Double): scala.Unit = js.native
  def positionDoubleClick(): scala.Unit = js.native
  def pressKeyCode(keycode: scala.Double, metastate: scala.Double): scala.Unit = js.native
  def pullFile(path: java.lang.String): scala.Unit = js.native
  def pullFolder(path: java.lang.String): scala.Unit = js.native
  def pushFile(path: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def receiveAsyncResponse(response: js.Object): scala.Unit = js.native
  def receiveAsyncResponse(status: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def releaseActions(): scala.Unit = js.native
  def removeApp(appId: js.Array[java.lang.String], bundleId: js.Array[java.lang.String]): scala.Unit = js.native
  def replaceValue(value: java.lang.String): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def rotateDevice(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    rotation: scala.Double,
    touchCount: scala.Double,
    duration: scala.Double,
    element: java.lang.String
  ): scala.Unit = js.native
  def sendAlertText(text: java.lang.String): scala.Unit = js.native
  def sendCommand(cmd: java.lang.String, params: js.Object): scala.Unit = js.native
  def sendCommandAndGetResult(cmd: java.lang.String, params: js.Object): js.Any = js.native
  def sendKeyEvent(keycode: java.lang.String, metastate: java.lang.String): scala.Unit = js.native
  def sendKeys(value: js.Array[java.lang.String]): scala.Unit = js.native
  def sendSms(phoneNumber: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def setAsyncTimeout(ms: scala.Double): scala.Unit = js.native
  def setAutoReporting(enabled: scala.Boolean): js.Object | scala.Null = js.native
  def setGeoLocation(location: js.Object): scala.Unit = js.native
  def setImplicitTimeout(ms: scala.Double): scala.Unit = js.native
  def setLocalStorage(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setNetworkConditions(network_conditions: js.Object): scala.Unit = js.native
  def setNetworkConditions(network_conditions: js.Object, network_name: java.lang.String): scala.Unit = js.native
  def setNetworkConnection(parameters: js.Object): scala.Double = js.native
  def setNetworkConnection(`type`: scala.Double): scala.Unit = js.native
  def setOrientation(engine: java.lang.String): scala.Unit = js.native
  def setSessionStorage(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setTimeouts(): scala.Unit = js.native
  def setTimeouts(`implicit`: scala.Double): scala.Unit = js.native
  def setTimeouts(`implicit`: scala.Double, pageLoad: scala.Double): scala.Unit = js.native
  def setTimeouts(`implicit`: scala.Double, pageLoad: scala.Double, script: scala.Double): scala.Unit = js.native
  def setTimeouts(`type`: java.lang.String, ms: scala.Double): scala.Unit = js.native
  def setValueImmediate(value: java.lang.String): scala.Unit = js.native
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
  def shake(): scala.Unit = js.native
  def shutdown(): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def startRecordingScreen(
    remotePath: js.UndefOr[java.lang.String],
    username: js.UndefOr[java.lang.String],
    password: js.UndefOr[java.lang.String],
    method: js.UndefOr[java.lang.String],
    forceRestart: js.UndefOr[scala.Boolean],
    timeLimit: js.UndefOr[java.lang.String],
    videoType: js.UndefOr[java.lang.String],
    videoQuality: js.UndefOr[java.lang.String],
    videoFps: js.UndefOr[java.lang.String],
    bitRate: js.UndefOr[java.lang.String],
    videoSize: js.UndefOr[java.lang.String],
    bugReport: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def status(): js.Object = js.native
  def stopRecordingScreen(): java.lang.String = js.native
  def stopRecordingScreen(remotePath: java.lang.String): java.lang.String = js.native
  def stopRecordingScreen(remotePath: java.lang.String, username: java.lang.String): java.lang.String = js.native
  def stopRecordingScreen(remotePath: java.lang.String, username: java.lang.String, password: java.lang.String): java.lang.String = js.native
  def stopRecordingScreen(
    remotePath: java.lang.String,
    username: java.lang.String,
    password: java.lang.String,
    method: java.lang.String
  ): java.lang.String = js.native
  def switchContext(name: java.lang.String): scala.Unit = js.native
  def switchToFrame(): scala.Unit = js.native
  def switchToFrame(id: java.lang.String): scala.Unit = js.native
  def switchToFrame(id: js.Object): scala.Unit = js.native
  def switchToFrame(id: scala.Double): scala.Unit = js.native
  def switchToParentFrame(): scala.Unit = js.native
  def switchToWindow(handle: java.lang.String): scala.Unit = js.native
  def takeElementScreenshot(): java.lang.String = js.native
  def takeElementScreenshot(scroll: scala.Boolean): java.lang.String = js.native
  def takeHeapSnapshot(): js.Object = js.native
  def takeScreenshot(): java.lang.String = js.native
  def throttleNetwork(condition: java.lang.String): scala.Unit = js.native
  def throttleNetwork(condition: js.Object): scala.Unit = js.native
  def toggleAirplaneMode(): scala.Unit = js.native
  def toggleData(): scala.Unit = js.native
  def toggleEnrollTouchId(enabled: scala.Boolean): scala.Unit = js.native
  def toggleLocationServices(): scala.Unit = js.native
  def toggleWiFi(): scala.Unit = js.native
  def touchClick(element: java.lang.String): scala.Unit = js.native
  def touchDoubleClick(element: java.lang.String): scala.Unit = js.native
  def touchDown(): scala.Unit = js.native
  def touchDown(x: scala.Double): scala.Unit = js.native
  def touchDown(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def touchFlick(xoffset: scala.Double, yoffset: scala.Double): scala.Unit = js.native
  def touchFlick(xoffset: scala.Double, yoffset: scala.Double, element: java.lang.String): scala.Unit = js.native
  def touchFlick(xoffset: scala.Double, yoffset: scala.Double, element: java.lang.String, speed: scala.Double): scala.Unit = js.native
  def touchId(`match`: scala.Boolean): scala.Unit = js.native
  def touchLongClick(element: java.lang.String): scala.Unit = js.native
  def touchMove(): scala.Unit = js.native
  def touchMove(x: scala.Double): scala.Unit = js.native
  def touchMove(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def touchPerform(actions: js.Array[js.Object]): scala.Unit = js.native
  def touchPinch(x: scala.Double, y: scala.Double, scale: scala.Double): scala.Unit = js.native
  def touchScroll(xoffset: scala.Double, yoffset: scala.Double): scala.Unit = js.native
  def touchScroll(xoffset: scala.Double, yoffset: scala.Double, element: java.lang.String): scala.Unit = js.native
  def touchUp(): scala.Unit = js.native
  def touchUp(x: scala.Double): scala.Unit = js.native
  def touchUp(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def unlock(): scala.Unit = js.native
  def updateSettings(settings: js.Object): scala.Unit = js.native
  def uploadFile(file: java.lang.String): java.lang.String = js.native
}

