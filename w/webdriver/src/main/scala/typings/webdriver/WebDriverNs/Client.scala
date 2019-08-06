package typings.webdriver.WebDriverNs

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
// selenium types
@js.native
trait Client extends js.Object {
  def _getWindowSize(): js.Object = js.native
  def _setWindowSize(width: Double, height: Double): Unit = js.native
  def acceptAlert(): Unit = js.native
  def activateApp(): Unit = js.native
  def activateApp(appId: String): Unit = js.native
  def activateApp(appId: String, bundleId: String): Unit = js.native
  def activateIME(engine: String): Unit = js.native
  def addCookie(cookie: js.Object): Unit = js.native
  def assertPerformance(name: String): Boolean = js.native
  def assertPerformance(name: String, metrics: js.Array[String]): Boolean = js.native
  def back(): Unit = js.native
  def background(): Unit = js.native
  def background(seconds: Double): Unit = js.native
  def buttonDown(): Unit = js.native
  def buttonDown(button: Double): Unit = js.native
  def buttonUp(): Unit = js.native
  def buttonUp(button: Double): Unit = js.native
  def clearLocalStorage(): Unit = js.native
  def clearSessionStorage(): Unit = js.native
  def closeApp(): Unit = js.native
  def closeWindow(): Unit = js.native
  def createWindow(`type`: String): js.Object = js.native
  def deactivateIME(): Unit = js.native
  def deleteAllCookies(): Unit = js.native
  def deleteCookie(name: String): Unit = js.native
  def deleteLocalStorageItem(key: String): Unit = js.native
  def deleteNetworkConditions(): Unit = js.native
  def deleteSession(): Unit = js.native
  def deleteSessionStorageItem(key: String): Unit = js.native
  def dismissAlert(): Unit = js.native
  def elementClear(elementId: String): Unit = js.native
  def elementClick(elementId: String): Unit = js.native
  def elementEquals(elementId: String, otherElementId: String): Boolean = js.native
  def elementHover(elementId: String): Unit = js.native
  def elementSendKeys(elementId: String, text: String): Unit = js.native
  def elementSendKeys(elementId: String, text: String, value: js.Array[String]): Unit = js.native
  def elementSendKeys(elementId: String, value: js.Array[String]): Unit = js.native
  def elementSubmit(elementId: String): Unit = js.native
  def endCoverage(intent: String, path: String): Unit = js.native
  def executeAsyncScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): js.Any = js.native
  def executeScript(script: String): js.Any = js.native
  def executeScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): js.Any = js.native
  def file(file: String): String = js.native
  def findElement(using: String, value: String): String = js.native
  def findElementFromElement(elementId: String, using: String, value: String): String = js.native
  def findElements(using: String, value: String): js.Array[String] = js.native
  def findElementsFromElement(elementId: String, using: String, value: String): js.Array[String] = js.native
  def fingerPrint(fingerprintId: Double): Unit = js.native
  def forward(): Unit = js.native
  def freeze(): Unit = js.native
  def fullscreenWindow(): js.Object = js.native
  def generateTestReport(message: String, group: String): Unit = js.native
  def getActiveElement(): String = js.native
  def getActiveEngine(): String = js.native
  def getAlertText(): String = js.native
  def getAllCookies(): js.Array[js.Object] = js.native
  def getApplicationCacheStatus(): Double = js.native
  def getAvailableEngines(): js.Array[String] = js.native
  def getClipboard(): String = js.native
  def getClipboard(contentType: String): String = js.native
  def getContext(): String | Null = js.native
  def getContexts(): js.Array[String] = js.native
  def getCurrentActivity(): String = js.native
  def getCurrentPackage(): String = js.native
  def getDeviceTime(): String = js.native
  def getDisplayDensity(): js.Any = js.native
  def getElementAttribute(elementId: String, name: String): String | Null = js.native
  @JSName("getElementAttribute")
  def getElementAttribute_String(elementId: String, name: String): String = js.native
  def getElementCSSValue(elementId: String, propertyName: String): String = js.native
  def getElementLocation(elementId: String): js.Object = js.native
  def getElementLocationInView(elementId: String): js.Object = js.native
  def getElementProperty(elementId: String, name: String): String = js.native
  def getElementRect(elementId: String): js.Object = js.native
  def getElementSize(elementId: String): js.Object = js.native
  def getElementTagName(elementId: String): String = js.native
  def getElementText(elementId: String): String = js.native
  def getElementValue(elementId: String): String | Null = js.native
  def getGeoLocation(): js.Object = js.native
  def getHubConfig(): js.Object = js.native
  def getLocalStorage(): js.Array[String] = js.native
  def getLocalStorageItem(key: String): String = js.native
  def getLocalStorageSize(): Double = js.native
  def getLogTypes(): js.Array[String] = js.native
  def getLogs(`type`: String): js.Array[js.Object] = js.native
  def getNamedCookie(name: String): js.Object = js.native
  def getNetworkConditions(): js.Object = js.native
  def getNetworkConnection(): Double = js.native
  def getOrientation(): String = js.native
  def getPageIndex(): String = js.native
  def getPageLogs(`type`: String): js.Object = js.native
  def getPageSource(): String = js.native
  def getPerformanceData(packageName: String, dataType: String): js.Array[String] = js.native
  def getPerformanceData(packageName: String, dataType: String, dataReadTimeout: Double): js.Array[String] = js.native
  def getPerformanceDataTypes(): js.Array[String] = js.native
  def getSession(): js.Object = js.native
  def getSessionStorage(): js.Array[String] = js.native
  def getSessionStorageItem(key: String): String = js.native
  def getSessionStorageSize(): Double = js.native
  def getSessions(): js.Array[js.Object] = js.native
  def getSettings(): js.Object = js.native
  def getStrings(): js.Object = js.native
  def getStrings(language: String): js.Object = js.native
  def getStrings(language: String, stringFile: String): js.Object = js.native
  def getSystemBars(): js.Array[js.Object] = js.native
  def getTimeouts(): js.Object = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def getWindowHandle(): String = js.native
  def getWindowHandles(): js.Array[String] = js.native
  def getWindowPosition(): js.Object = js.native
  def getWindowRect(): js.Object = js.native
  def gridProxyDetails(id: String): js.Object = js.native
  def gridTestSession(session: String): js.Object = js.native
  def gsmCall(phoneNumber: String, action: String): Unit = js.native
  def gsmSignal(signalStrength: String): Unit = js.native
  def gsmSignal(signalStrength: String, signalStrengh: String): Unit = js.native
  def gsmVoice(state: String): Unit = js.native
  def hideKeyboard(): Unit = js.native
  def hideKeyboard(strategy: String): Unit = js.native
  def hideKeyboard(strategy: String, key: String): Unit = js.native
  def hideKeyboard(strategy: String, key: String, keyCode: String): Unit = js.native
  def hideKeyboard(strategy: String, key: String, keyCode: String, keyName: String): Unit = js.native
  def installApp(appPath: String): Unit = js.native
  def interceptRequest(rule: js.Object): Unit = js.native
  def isAlertOpen(): Boolean = js.native
  def isAppInstalled(): Boolean = js.native
  def isAppInstalled(appId: String): Boolean = js.native
  def isAppInstalled(appId: String, bundleId: String): Boolean = js.native
  def isAutoReporting(): Boolean = js.native
  def isElementDisplayed(elementId: String): Boolean = js.native
  def isElementEnabled(elementId: String): Boolean = js.native
  def isElementSelected(elementId: String): Boolean = js.native
  def isIMEActivated(): Boolean = js.native
  def isKeyboardShown(): Boolean = js.native
  def isLoading(): Boolean = js.native
  def isLocked(): Boolean = js.native
  def launchApp(): Unit = js.native
  def launchApp(id: String): Unit = js.native
  def lock(): Unit = js.native
  def lock(seconds: Double): Unit = js.native
  def longPressKeyCode(keycode: Double): Unit = js.native
  def longPressKeyCode(keycode: Double, metastate: Double): Unit = js.native
  def longPressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
  def manageSeleniumHubLifecycle(action: String): Unit = js.native
  def maximizeWindow(): js.Object = js.native
  @JSName("maximizeWindow")
  def maximizeWindow_Unit(): Unit = js.native
  def minimizeWindow(): js.Object = js.native
  def moveToElement(): Unit = js.native
  def moveToElement(element: String): Unit = js.native
  def moveToElement(element: String, xoffset: Double): Unit = js.native
  def moveToElement(element: String, xoffset: Double, yoffset: Double): Unit = js.native
  def moveToElement(element: Null, xoffset: Double): Unit = js.native
  def moveToElement(element: Null, xoffset: Double, yoffset: Double): Unit = js.native
  def multiTouchPerform(actions: js.Array[js.Object]): Unit = js.native
  def multiTouchPerform(actions: js.Array[js.Object], elementId: js.Array[js.Object]): Unit = js.native
  def navigateTo(url: String): String = js.native
  @JSName("navigateTo")
  def navigateTo_Unit(url: String): Unit = js.native
  def newSession(capabilities: js.Object): js.Object = js.native
  def newSession(desiredCapabilities: js.Object, requiredCapabilities: js.Object): js.Object = js.native
  def openNotifications(): Unit = js.native
  def performActions(actions: js.Array[js.Object]): Unit = js.native
  def positionClick(): Unit = js.native
  def positionClick(button: Double): Unit = js.native
  def positionDoubleClick(): Unit = js.native
  def powerAC(state: String): Unit = js.native
  def powerCapacity(percent: Double): Unit = js.native
  def pressKeyCode(keycode: Double): Unit = js.native
  def pressKeyCode(keycode: Double, metastate: Double): Unit = js.native
  def pressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
  def pullFile(path: String): Unit = js.native
  def pullFolder(path: String): Unit = js.native
  def pushFile(path: String, data: String): Unit = js.native
  def queryAppState(): Double = js.native
  def queryAppState(appId: String): Double = js.native
  def queryAppState(appId: String, bundleId: String): Double = js.native
  def receiveAsyncResponse(response: js.Object): Unit = js.native
  def receiveAsyncResponse(status: String, value: String): Unit = js.native
  def refresh(): Unit = js.native
  def releaseActions(): Unit = js.native
  def removeApp(): Unit = js.native
  def removeApp(appId: String): Unit = js.native
  def removeApp(appId: String, bundleId: String): Unit = js.native
  def replaceValue(elementId: String, value: String): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def rotateDevice(x: Double, y: Double, radius: Double, rotation: Double, touchCount: Double, duration: Double): Unit = js.native
  def rotateDevice(
    x: Double,
    y: Double,
    radius: Double,
    rotation: Double,
    touchCount: Double,
    duration: Double,
    element: String
  ): Unit = js.native
  def sendAlertText(text: String): Unit = js.native
  def sendCommand(cmd: String, params: js.Object): Unit = js.native
  def sendCommandAndGetResult(cmd: String, params: js.Object): js.Any = js.native
  def sendKeyEvent(keycode: String): Unit = js.native
  def sendKeyEvent(keycode: String, metastate: String): Unit = js.native
  def sendKeys(value: js.Array[String]): Unit = js.native
  def sendSms(phoneNumber: String, message: String): Unit = js.native
  def setAsyncTimeout(ms: Double): Unit = js.native
  def setAutoReporting(enabled: Boolean): js.Object | Null = js.native
  def setClipboard(content: String): String = js.native
  def setClipboard(content: String, contentType: String): String = js.native
  def setClipboard(content: String, contentType: String, label: String): String = js.native
  def setGeoLocation(location: js.Object): Unit = js.native
  def setImplicitTimeout(ms: Double): Unit = js.native
  def setLocalStorage(key: String, value: String): Unit = js.native
  def setNetworkConditions(network_conditions: js.Object): Unit = js.native
  def setNetworkConditions(network_conditions: js.Object, network_name: String): Unit = js.native
  def setNetworkConnection(parameters: js.Object): Double = js.native
  def setNetworkConnection(`type`: Double): Unit = js.native
  def setOrientation(orientation: String): Unit = js.native
  def setSessionStorage(key: String, value: String): Unit = js.native
  def setTimeouts(): Unit = js.native
  def setTimeouts(`implicit`: Double): Unit = js.native
  def setTimeouts(`implicit`: Double, pageLoad: Double): Unit = js.native
  def setTimeouts(`implicit`: Double, pageLoad: Double, script: Double): Unit = js.native
  def setTimeouts(`type`: String, ms: Double): Unit = js.native
  def setValueImmediate(elementId: String, value: String): Unit = js.native
  def setWindowPosition(x: Double, y: Double): js.Object = js.native
  def setWindowRect(): js.Object = js.native
  def setWindowRect(x: Double): js.Object = js.native
  def setWindowRect(x: Double, y: Double): js.Object = js.native
  def setWindowRect(x: Double, y: Double, width: Double): js.Object = js.native
  def setWindowRect(x: Double, y: Double, width: Double, height: Double): js.Object = js.native
  def setWindowRect(x: Double, y: Double, width: Null, height: Double): js.Object = js.native
  def setWindowRect(x: Double, y: Null, width: Double): js.Object = js.native
  def setWindowRect(x: Double, y: Null, width: Double, height: Double): js.Object = js.native
  def setWindowRect(x: Double, y: Null, width: Null, height: Double): js.Object = js.native
  def setWindowRect(x: Null, y: Double): js.Object = js.native
  def setWindowRect(x: Null, y: Double, width: Double): js.Object = js.native
  def setWindowRect(x: Null, y: Double, width: Double, height: Double): js.Object = js.native
  def setWindowRect(x: Null, y: Double, width: Null, height: Double): js.Object = js.native
  def setWindowRect(x: Null, y: Null, width: Double): js.Object = js.native
  def setWindowRect(x: Null, y: Null, width: Double, height: Double): js.Object = js.native
  def setWindowRect(x: Null, y: Null, width: Null, height: Double): js.Object = js.native
  def shake(): Unit = js.native
  def shutdown(): Unit = js.native
  def startActivity(
    appPackage: String,
    appActivity: String,
    appWaitPackage: js.UndefOr[String],
    appWaitActivity: js.UndefOr[String],
    intentAction: js.UndefOr[String],
    intentCategory: js.UndefOr[String],
    intentFlags: js.UndefOr[String],
    optionalIntentArguments: js.UndefOr[String],
    dontStopAppOnReset: js.UndefOr[String]
  ): Unit = js.native
  def startRecordingScreen(
    remotePath: js.UndefOr[String],
    username: js.UndefOr[String],
    password: js.UndefOr[String],
    method: js.UndefOr[String],
    forceRestart: js.UndefOr[Boolean],
    timeLimit: js.UndefOr[String],
    videoType: js.UndefOr[String],
    videoQuality: js.UndefOr[String],
    videoFps: js.UndefOr[String],
    bitRate: js.UndefOr[String],
    videoSize: js.UndefOr[String],
    bugReport: js.UndefOr[String]
  ): Unit = js.native
  def status(): js.Object = js.native
  def stopRecordingScreen(): String = js.native
  def stopRecordingScreen(remotePath: String): String = js.native
  def stopRecordingScreen(remotePath: String, username: String): String = js.native
  def stopRecordingScreen(remotePath: String, username: String, password: String): String = js.native
  def stopRecordingScreen(remotePath: String, username: String, password: String, method: String): String = js.native
  def switchContext(name: String): Unit = js.native
  def switchToFrame(): Unit = js.native
  def switchToFrame(id: String): Unit = js.native
  def switchToFrame(id: js.Object): Unit = js.native
  def switchToFrame(id: Double): Unit = js.native
  def switchToParentFrame(): Unit = js.native
  def switchToWindow(handle: String): Unit = js.native
  def takeElementScreenshot(elementId: String): String = js.native
  def takeElementScreenshot(elementId: String, scroll: Boolean): String = js.native
  def takeHeapSnapshot(): js.Object = js.native
  def takeScreenshot(): String = js.native
  def terminateApp(): Unit = js.native
  def terminateApp(appId: String): Unit = js.native
  def terminateApp(appId: String, bundleId: String): Unit = js.native
  def throttleCPU(rate: Double): Unit = js.native
  def throttleNetwork(condition: String): Unit = js.native
  def throttleNetwork(condition: js.Object): Unit = js.native
  def toggleAirplaneMode(): Unit = js.native
  def toggleData(): Unit = js.native
  def toggleEnrollTouchId(): Unit = js.native
  def toggleEnrollTouchId(enabled: Boolean): Unit = js.native
  def toggleLocationServices(): Unit = js.native
  def toggleWiFi(): Unit = js.native
  def touchClick(element: String): Unit = js.native
  def touchDoubleClick(element: String): Unit = js.native
  def touchDown(x: Double, y: Double): Unit = js.native
  def touchFlick(
    xoffset: js.UndefOr[Double],
    yoffset: js.UndefOr[Double],
    element: js.UndefOr[String],
    speed: js.UndefOr[Double],
    xspeed: js.UndefOr[Double],
    yspeed: js.UndefOr[Double]
  ): Unit = js.native
  def touchId(`match`: Boolean): Unit = js.native
  def touchLongClick(element: String): Unit = js.native
  def touchMove(x: Double, y: Double): Unit = js.native
  def touchPerform(actions: js.Array[js.Object]): Unit = js.native
  def touchPinch(x: Double, y: Double, scale: Double): Unit = js.native
  def touchScroll(xoffset: Double, yoffset: Double): Unit = js.native
  def touchScroll(xoffset: Double, yoffset: Double, element: String): Unit = js.native
  def touchUp(x: Double, y: Double): Unit = js.native
  def unlock(): Unit = js.native
  def updateSettings(settings: js.Object): Unit = js.native
}

