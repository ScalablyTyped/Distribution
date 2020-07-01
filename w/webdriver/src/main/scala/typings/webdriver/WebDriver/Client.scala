package typings.webdriver.WebDriver

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
trait Client extends BaseClient {
  /**
    * [jsonwp]
    * Get the size of the current focused window.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidwindowwindowhandlesize
    */
  def _getWindowSize(): ProtocolCommandResponse = js.native
  /**
    * [jsonwp]
    * Change the size of the current focused window.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidwindowwindowhandlesize
    */
  def _setWindowSize(width: Double, height: Double): Unit = js.native
  /**
    * [webdriver]
    * The Accept Alert command accepts a simple dialog if present, otherwise error.
    * https://w3c.github.io/webdriver/#dfn-accept-alert
    */
  def acceptAlert(): Unit = js.native
  /**
    * [appium]
    * Activate the given app onto the device
    * http://appium.io/docs/en/commands/device/app/activate-app/
    */
  def activateApp(): Unit = js.native
  def activateApp(appId: String): Unit = js.native
  def activateApp(appId: String, bundleId: String): Unit = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeactivate
    */
  def activateIME(engine: String): Unit = js.native
  /**
    * [webdriver]
    * The Add Cookie command adds a single cookie to the cookie store associated with the active document's address.
    * https://w3c.github.io/webdriver/#dfn-adding-a-cookie
    */
  def addCookie(cookie: js.Object): Unit = js.native
  /**
    * [saucelabs]
    * Assert against the performance baseline of your app.
    * https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
    */
  def assertPerformance(name: String): ProtocolCommandResponse = js.native
  def assertPerformance(name: String, metrics: js.Array[String]): ProtocolCommandResponse = js.native
  /**
    * [webdriver]
    * The Back command causes the browser to traverse one step backward in the joint session history of the current top-level browsing context. This is equivalent to pressing the back button in the browser chrome or calling `window.history.back`.
    * https://w3c.github.io/webdriver/#dfn-back
    */
  def back(): Unit = js.native
  def background(): Unit = js.native
  /**
    * [appium]
    * Send the currently running app for this session to the background. iOS tests with XCUITest can also use the `mobile: terminateApp` method to terminate the current app (see detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-terminateapp)), and the `mobile: activateApp` to activate an existing application on the device under test and moves it to the foreground (see detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-activateapp)).
    * http://appium.io/docs/en/commands/device/app/background-app/
    */
  def background(seconds: Double): Unit = js.native
  /**
    * [jsonwp]
    * Click and hold the left mouse button (at the coordinates set by the last moveto command). Note that the next mouse-related command that should follow is buttonup . Any other mouse command (such as click or another call to buttondown) will yield undefined behaviour.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidbuttondown
    */
  def buttonDown(): Unit = js.native
  def buttonDown(button: Double): Unit = js.native
  /**
    * [jsonwp]
    * Releases the mouse button previously held (where the mouse is currently at). Must be called once for every buttondown command issued. See the note in click and buttondown about implications of out-of-order commands.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidbuttonup
    */
  def buttonUp(): Unit = js.native
  def buttonUp(button: Double): Unit = js.native
  /**
    * [jsonwp]
    * Clear the storage.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocal_storage
    */
  def clearLocalStorage(): Unit = js.native
  /**
    * [jsonwp]
    * Clear the storage.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidsession_storage
    */
  def clearSessionStorage(): Unit = js.native
  /**
    * [appium]
    * Close an app on device.
    * http://appium.io/docs/en/commands/device/app/close-app/
    */
  def closeApp(): Unit = js.native
  /**
    * [webdriver]
    * The Close Window command closes the current top-level browsing context. Once done, if there are no more top-level browsing contexts open, the WebDriver session itself is closed.
    * https://w3c.github.io/webdriver/#dfn-close-window
    */
  def closeWindow(): Unit = js.native
  /**
    * [webdriver]
    * Create a new top-level browsing context.
    * https://w3c.github.io/webdriver/#new-window
    */
  def createWindow(`type`: String): WindowHandle = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimedeactivate
    */
  def deactivateIME(): Unit = js.native
  /**
    * [webdriver]
    * The Delete All Cookies command allows deletion of all cookies associated with the active document's address.
    * https://w3c.github.io/webdriver/#dfn-delete-all-cookies
    */
  def deleteAllCookies(): Unit = js.native
  /**
    * [webdriver]
    * The Delete Cookie command allows you to delete either a single cookie by parameter name, or all the cookies associated with the active document's address if name is undefined.
    * https://w3c.github.io/webdriver/#dfn-delete-cookie
    */
  def deleteCookie(name: String): Unit = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidlocal_storagekeykey
    */
  def deleteLocalStorageItem(key: String): Unit = js.native
  /**
    * [chromium]
    * Disable any network throttling which might have been set. Equivalent of setting the `No throttling` preset.
    * https://github.com/bayandin/chromedriver/blob/2.45/window_commands.cc#L1724-L1745
    */
  def deleteNetworkConditions(): Unit = js.native
  /**
    * [webdriver]
    * The Delete Session command closes any top-level browsing contexts associated with the current session, terminates the connection, and finally closes the current session.
    * https://w3c.github.io/webdriver/#dfn-delete-session
    */
  def deleteSession(): Unit = js.native
  /**
    * [jsonwp]
    * Remove the storage item for the given key.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidsession_storagekeykey
    */
  def deleteSessionStorageItem(key: String): Unit = js.native
  /**
    * [webdriver]
    * The Dismiss Alert command dismisses a simple dialog if present, otherwise error. A request to dismiss an alert user prompt, which may not necessarily have a dismiss button, has the same effect as accepting it.
    * https://w3c.github.io/webdriver/#dfn-dismiss-alert
    */
  def dismissAlert(): Unit = js.native
  /**
    * [appium]
    * This command allows you to define a webdriverio script in a string and send it to the Appium server to be executed locally to the server itself, thus reducing latency that might otherwise occur along with each command.
    * https://github.com/appium/appium/blob/master/docs/en/commands/session/execute-driver.md
    */
  def driverScript(script: String): ProtocolCommandResponse = js.native
  def driverScript(script: String, `type`: String): ProtocolCommandResponse = js.native
  def driverScript(script: String, `type`: String, timeout: Double): ProtocolCommandResponse = js.native
  /**
    * [webdriver]
    * The Element Clear command scrolls into view an editable or resettable element and then attempts to clear its selected files or text content.
    * https://w3c.github.io/webdriver/#dfn-element-clear
    */
  def elementClear(elementId: String): Unit = js.native
  /**
    * [webdriver]
    * The Element Click command scrolls into view the element if it is not already pointer-interactable, and clicks its in-view center point. If the element's center point is obscured by another element, an element click intercepted error is returned. If the element is outside the viewport, an element not interactable error is returned.
    * https://w3c.github.io/webdriver/#dfn-element-click
    */
  def elementClick(elementId: String): Unit = js.native
  /**
    * [jsonwp]
    * Compare elements with each other.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidequalsother
    */
  def elementEquals(elementId: String, otherElementId: String): Boolean = js.native
  /**
    * [chromium]
    * Enable hover state for an element, which is reset upon next interaction.
    * https://github.com/bayandin/chromedriver/blob/2.45/element_commands.cc#L126-L146
    */
  def elementHover(elementId: String): Unit = js.native
  /**
    * [webdriver]
    * The Element Send Keys command scrolls into view the form control element and then sends the provided keys to the element. In case the element is not keyboard-interactable, an element not interactable error is returned.<br><br>The key input state used for input may be cleared mid-way through "typing" by sending the null key, which is U+E000 (NULL).
    * https://w3c.github.io/webdriver/#dfn-element-send-keys
    */
  def elementSendKeys(elementId: String, text: String): Unit = js.native
  def elementSendKeys(elementId: String, text: String, value: js.Array[String]): Unit = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidvalue
    */
  def elementSendKeys(elementId: String, value: js.Array[String]): Unit = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidsubmit
    */
  def elementSubmit(elementId: String): Unit = js.native
  /**
    * [appium]
    * Get test coverage data.
    * http://appium.io/docs/en/commands/device/app/end-test-coverage/
    */
  def endCoverage(intent: String, path: String): Unit = js.native
  /**
    * [webdriver]
    * The Execute Async Script command causes JavaScript to execute as an anonymous function. Unlike the Execute Script command, the result of the function is ignored. Instead an additional argument is provided as the final argument to the function. This is a function that, when called, returns its first argument as the response.
    * https://w3c.github.io/webdriver/#dfn-execute-async-script
    */
  def executeAsyncScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): js.Any = js.native
  /**
    * [webdriver]
    * The Execute Script command executes a JavaScript function in the context of the current browsing context and returns the return value of the function.
    * https://w3c.github.io/webdriver/#dfn-execute-script
    */
  def executeScript(script: String): js.Any = js.native
  def executeScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): js.Any = js.native
  /**
    * [chromium]
    * Upload a file to remote machine on which the browser is running.
    * https://github.com/bayandin/chromedriver/blob/2.45/session_commands.cc#L1037-L1065
    */
  def file(file: String): String = js.native
  /**
    * [webdriver]
    * The Find Element command is used to find an element in the current browsing context that can be used for future commands.
    * https://w3c.github.io/webdriver/#dfn-find-element
    */
  def findElement(using: String, value: String): String = js.native
  /**
    * [webdriver]
    * The Find Element From Element command is used to find an element from a web element in the current browsing context that can be used for future commands.
    * https://w3c.github.io/webdriver/#dfn-find-element-from-element
    */
  def findElementFromElement(elementId: String, using: String, value: String): String = js.native
  /**
    * [webdriver]
    * The Find Elements command is used to find elements in the current browsing context that can be used for future commands.
    * https://w3c.github.io/webdriver/#dfn-find-elements
    */
  def findElements(using: String, value: String): js.Array[String] = js.native
  /**
    * [webdriver]
    * The Find Elements From Element command is used to find elements from a web element in the current browsing context that can be used for future commands.
    * https://w3c.github.io/webdriver/#dfn-find-elements-from-element
    */
  def findElementsFromElement(elementId: String, using: String, value: String): js.Array[String] = js.native
  /**
    * [appium]
    * Authenticate users by using their finger print scans on supported emulators.
    * http://appium.io/docs/en/commands/device/authentication/finger-print/
    */
  def fingerPrint(fingerprintId: Double): Unit = js.native
  /**
    * [webdriver]
    * The Forward command causes the browser to traverse one step forwards in the joint session history of the current top-level browsing context.
    * https://w3c.github.io/webdriver/#dfn-forward
    */
  def forward(): Unit = js.native
  /**
    * [chromium]
    * Freeze the current page. Extension for [Page Lifecycle API](https://developers.google.com/web/updates/2018/07/page-lifecycle-api).
    * https://github.com/bayandin/chromedriver/blob/2.45/window_commands.cc#L625-L633
    */
  def freeze(): Unit = js.native
  /**
    * [webdriver]
    * The Fullscreen Window command invokes the window manager-specific “full screen” operation, if any, on the window containing the current top-level browsing context. This typically increases the window to the size of the physical display and can hide browser chrome elements such as toolbars.
    * https://w3c.github.io/webdriver/#dfn-fullscreen-window
    */
  def fullscreenWindow(): RectReturn = js.native
  /**
    * [chromium]
    * Generates a report for testing. Extension for [Reporting API](https://developers.google.com/web/updates/2018/09/reportingapi).
    * https://w3c.github.io/reporting/#generate-test-report-command
    */
  def generateTestReport(message: String, group: String): Unit = js.native
  /**
    * [webdriver]
    * Get Active Element returns the active element of the current browsing context’s document element.
    * https://w3c.github.io/webdriver/#dfn-get-active-element
    */
  def getActiveElement(): String = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeactive_engine
    */
  def getActiveEngine(): String = js.native
  /**
    * [webdriver]
    * The Get Alert Text command returns the message of the current user prompt. If there is no current user prompt, it returns an error.
    * https://w3c.github.io/webdriver/#dfn-get-alert-text
    */
  def getAlertText(): String = js.native
  /**
    * [webdriver]
    * The Get All Cookies command returns all cookies associated with the address of the current browsing context’s active document.
    * https://w3c.github.io/webdriver/#dfn-get-all-cookies
    */
  def getAllCookies(): js.Array[js.Object] = js.native
  /**
    * [jsonwp]
    * Get the status of the html5 application cache.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidapplication_cachestatus
    */
  def getApplicationCacheStatus(): Double = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeavailable_engines
    */
  def getAvailableEngines(): js.Array[String] = js.native
  /**
    * [appium]
    * Get the content of the system clipboard
    * http://appium.io/docs/en/commands/device/clipboard/get-clipboard/
    */
  def getClipboard(): String = js.native
  def getClipboard(contentType: String): String = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
    */
  def getContext(): String | Null = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
    */
  def getContexts(): js.Array[String] = js.native
  /**
    * [appium]
    * Get the name of the current Android activity.
    * http://appium.io/docs/en/commands/device/activity/current-activity/
    */
  def getCurrentActivity(): String = js.native
  /**
    * [appium]
    * Get the name of the current Android package.
    * http://appium.io/docs/en/commands/device/activity/current-package/
    */
  def getCurrentPackage(): String = js.native
  /**
    * [appium]
    * Get the time on the device.
    * http://appium.io/docs/en/commands/device/system/system-time/
    */
  def getDeviceTime(): String = js.native
  /**
    * [appium]
    * Get display density from device.
    * https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
    */
  def getDisplayDensity(): js.Any = js.native
  /**
    * [webdriver]
    * The Get Element Attribute command will return the attribute of a web element.
    * https://w3c.github.io/webdriver/#dfn-get-element-attribute
    */
  def getElementAttribute(elementId: String, name: String): String = js.native
  /**
    * [jsonwp]
    * Get the value of an element's attribute.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidattributename
    */
  @JSName("getElementAttribute")
  def getElementAttribute_Union(elementId: String, name: String): String | Null = js.native
  /**
    * [webdriver]
    * The Get Element CSS Value command retrieves the computed value of the given CSS property of the given web element.
    * https://w3c.github.io/webdriver/#dfn-get-element-css-value
    */
  def getElementCSSValue(elementId: String, propertyName: String): String = js.native
  /**
    * [jsonwp]
    * Determine an element's location on the page. The point `(0, 0)` refers to the upper-left corner of the page. The element's coordinates are returned as a JSON object with `x` and `y` properties.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidlocation
    */
  def getElementLocation(elementId: String): ProtocolCommandResponse = js.native
  /**
    * [jsonwp]
    * Determine an element's location on the screen once it has been scrolled into view.<br><br>__Note:__ This is considered an internal command and should only be used to determine an element's location for correctly generating native events.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidlocation_in_view
    */
  def getElementLocationInView(elementId: String): ProtocolCommandResponse = js.native
  /**
    * [webdriver]
    * The Get Element Property command will return the result of getting a property of an element.
    * https://w3c.github.io/webdriver/#dfn-get-element-property
    */
  def getElementProperty(elementId: String, name: String): String = js.native
  /**
    * [webdriver]
    * The Get Element Rect command returns the dimensions and coordinates of the given web element.
    * https://w3c.github.io/webdriver/#dfn-get-element-rect
    */
  def getElementRect(elementId: String): RectReturn = js.native
  /**
    * [jsonwp]
    * Determine an element's size in pixels. The size will be returned as a JSON object with `width` and `height` properties.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidsize
    */
  def getElementSize(elementId: String): ProtocolCommandResponse = js.native
  /**
    * [webdriver]
    * The Get Element Tag Name command returns the qualified element name of the given web element.
    * https://w3c.github.io/webdriver/#dfn-get-element-tag-name
    */
  def getElementTagName(elementId: String): String = js.native
  /**
    * [webdriver]
    * The Get Element Text command intends to return an element’s text "as rendered". An element's rendered text is also used for locating a elements by their link text and partial link text.
    * https://w3c.github.io/webdriver/#dfn-get-element-text
    */
  def getElementText(elementId: String): String = js.native
  /**
    * [chromium]
    * Retrieves the value of a given form control element.
    * https://github.com/bayandin/chromedriver/blob/2.45/element_commands.cc#L431-L443
    */
  def getElementValue(elementId: String): String | Null = js.native
  /**
    * [appium]
    * Get events stored in appium server.
    * https://github.com/appium/appium/blob/master/docs/en/commands/session/events/get-events.md
    */
  def getEvents(`type`: js.Array[String]): ProtocolCommandResponse = js.native
  /**
    * [jsonwp]
    * Get the current geo location.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocation
    */
  def getGeoLocation(): ProtocolCommandResponse = js.native
  /**
    * [selenium]
    * Receive hub config remotely.
    * https://github.com/nicegraham/selenium-grid2-api#gridapihub
    */
  def getHubConfig(): ProtocolCommandResponse = js.native
  /**
    * [jsonwp]
    * Get all keys of the storage.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocal_storage
    */
  def getLocalStorage(): js.Array[String] = js.native
  /**
    * [jsonwp]
    * Get the storage item for the given key.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocal_storagekeykey
    */
  def getLocalStorageItem(key: String): String = js.native
  /**
    * [jsonwp]
    * Get the number of items in the storage.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidlocal_storagesize
    */
  def getLocalStorageSize(): Double = js.native
  /**
    * [jsonwp]
    * Get available log types.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidlogtypes
    */
  def getLogTypes(): js.Array[String] = js.native
  /**
    * [jsonwp]
    * Get the log for a given log type. Log buffer is reset after each request.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidlog
    */
  def getLogs(`type`: String): js.Array[js.Object] = js.native
  /**
    * [webdriver]
    * The Get Named Cookie command returns the cookie with the requested name from the associated cookies in the cookie store of the current browsing context's active document. If no cookie is found, a no such cookie error is returned.
    * https://w3c.github.io/webdriver/#dfn-get-named-cookie
    */
  def getNamedCookie(name: String): Cookie = js.native
  /**
    * [chromium]
    * Get current network conditions used for emulation.
    * https://github.com/bayandin/chromedriver/blob/2.45/session_commands.cc#L839-L859
    */
  def getNetworkConditions(): ProtocolCommandResponse = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
    */
  def getNetworkConnection(): Double = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidorientation
    */
  def getOrientation(): String = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#mobile-json-wire-protocol-endpoints
    */
  def getPageIndex(): String = js.native
  /**
    * [saucelabs]
    * Get webpage specific log information based on the last page load.
    * https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-ExtendedDebuggingTools
    */
  def getPageLogs(`type`: String): ProtocolCommandResponse = js.native
  /**
    * [webdriver]
    * The Get Page Source command returns a string serialization of the DOM of the current browsing context active document.
    * https://w3c.github.io/webdriver/#dfn-get-page-source
    */
  def getPageSource(): String = js.native
  /**
    * [appium]
    * Returns the information of the system state which is supported to read as like cpu, memory, network traffic, and battery.
    * http://appium.io/docs/en/commands/device/performance-data/get-performance-data/
    */
  def getPerformanceData(packageName: String, dataType: String): js.Array[String] = js.native
  def getPerformanceData(packageName: String, dataType: String, dataReadTimeout: Double): js.Array[String] = js.native
  /**
    * [appium]
    * Returns the information types of the system state which is supported to read as like cpu, memory, network traffic, and battery.
    * http://appium.io/docs/en/commands/device/performance-data/performance-data-types/
    */
  def getPerformanceDataTypes(): js.Array[String] = js.native
  /**
    * [jsonwp]
    * Retrieve the capabilities of the specified session.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionid
    */
  def getSession(): ProtocolCommandResponse = js.native
  /**
    * [jsonwp]
    * Get all keys of the storage.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidsession_storage
    */
  def getSessionStorage(): js.Array[String] = js.native
  /**
    * [jsonwp]
    * Get the storage item for the given key.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidsession_storagekeykey
    */
  def getSessionStorageItem(key: String): String = js.native
  /**
    * [jsonwp]
    * Get the number of items in the storage.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidsession_storagesize
    */
  def getSessionStorageSize(): Double = js.native
  /**
    * [jsonwp]
    * Returns a list of the currently active sessions. Each session will be returned as a list of JSON objects containing `id` and `capabilities`.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessions
    */
  def getSessions(): js.Array[js.Object] = js.native
  /**
    * [appium]
    * Retrieve the current settings on the device.
    * http://appium.io/docs/en/commands/session/settings/get-settings/
    */
  def getSettings(): SettingsReturn = js.native
  /**
    * [appium]
    * Get app strings.
    * http://appium.io/docs/en/commands/device/app/get-app-strings/
    */
  def getStrings(): StringsReturn = js.native
  def getStrings(language: String): StringsReturn = js.native
  def getStrings(language: String, stringFile: String): StringsReturn = js.native
  /**
    * [appium]
    * Retrieve visibility and bounds information of the status and navigation bars.
    * http://appium.io/docs/en/commands/device/system/system-bars/
    */
  def getSystemBars(): js.Array[js.Object] = js.native
  /**
    * [webdriver]
    * The Get Timeouts command gets timeout durations associated with the current session.
    * https://w3c.github.io/webdriver/#dfn-get-timeouts
    */
  def getTimeouts(): Timeouts = js.native
  /**
    * [webdriver]
    * The Get Title command returns the document title of the current top-level browsing context, equivalent to calling `document.title`.
    * https://w3c.github.io/webdriver/#dfn-get-title
    */
  def getTitle(): String = js.native
  /**
    * [webdriver]
    * The Get Current URL command returns the URL of the current top-level browsing context.
    * https://w3c.github.io/webdriver/#dfn-get-current-url
    */
  def getUrl(): String = js.native
  /**
    * [webdriver]
    * The Get Window Handle command returns the window handle for the current top-level browsing context. It can be used as an argument to Switch To Window.
    * https://w3c.github.io/webdriver/#dfn-get-window-handle
    */
  def getWindowHandle(): String = js.native
  /**
    * [webdriver]
    * The Get Window Handles command returns a list of window handles for every open top-level browsing context. The order in which the window handles are returned is arbitrary.
    * https://w3c.github.io/webdriver/#dfn-get-window-handles
    */
  def getWindowHandles(): js.Array[String] = js.native
  /**
    * [jsonwp]
    * Get the position of the current focussed window.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidwindowwindowhandleposition
    */
  def getWindowPosition(): ProtocolCommandResponse = js.native
  /**
    * [webdriver]
    * The Get Window Rect command returns the size and position on the screen of the operating system window corresponding to the current top-level browsing context.
    * https://w3c.github.io/webdriver/#dfn-get-window-rect
    */
  def getWindowRect(): RectReturn = js.native
  /**
    * [selenium]
    * Get proxy details.
    * https://github.com/nicegraham/selenium-grid2-api#gridapiproxy
    */
  def gridProxyDetails(id: String): ProtocolCommandResponse = js.native
  /**
    * [selenium]
    * Get the details of the Selenium Grid node running a session.
    * https://github.com/nicegraham/selenium-grid2-api#gridapitestsession
    */
  def gridTestSession(session: String): ProtocolCommandResponse = js.native
  /**
    * [appium]
    * Make GSM call (Emulator only).
    * http://appium.io/docs/en/commands/device/network/gsm-call/
    */
  def gsmCall(phoneNumber: String, action: String): Unit = js.native
  /**
    * [appium]
    * Set GSM signal strength (Emulator only).
    * http://appium.io/docs/en/commands/device/network/gsm-signal/
    */
  def gsmSignal(signalStrength: String): Unit = js.native
  def gsmSignal(signalStrength: String, signalStrengh: String): Unit = js.native
  /**
    * [appium]
    * Set GSM voice state (Emulator only).
    * http://appium.io/docs/en/commands/device/network/gsm-voice/
    */
  def gsmVoice(state: String): Unit = js.native
  /**
    * [appium]
    * Hide soft keyboard.
    * http://appium.io/docs/en/commands/device/keys/hide-keyboard/
    */
  def hideKeyboard(): Unit = js.native
  def hideKeyboard(strategy: String): Unit = js.native
  def hideKeyboard(strategy: String, key: String): Unit = js.native
  def hideKeyboard(strategy: String, key: String, keyCode: String): Unit = js.native
  def hideKeyboard(strategy: String, key: String, keyCode: String, keyName: String): Unit = js.native
  /**
    * [appium]
    * Install the given app onto the device.
    * http://appium.io/docs/en/commands/device/app/install-app/
    */
  def installApp(appPath: String): Unit = js.native
  /**
    * [saucelabs]
    * Allows modifying any request made by the browser. You can blacklist, modify, or redirect these as required for your tests.
    * https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-InterceptNetworkRequests
    */
  def interceptRequest(rule: js.Object): Unit = js.native
  /**
    * [chromium]
    * Whether a simple dialog is currently open.
    * https://github.com/bayandin/chromedriver/blob/2.45/alert_commands.cc#L42-L49
    */
  def isAlertOpen(): Boolean = js.native
  /**
    * [appium]
    * Check whether the specified app is installed on the device.
    * http://appium.io/docs/en/commands/device/app/is-app-installed/
    */
  def isAppInstalled(): Boolean = js.native
  def isAppInstalled(appId: String): Boolean = js.native
  def isAppInstalled(appId: String, bundleId: String): Boolean = js.native
  /**
    * [chromium]
    * Whether it should automatically raises errors on browser logs.
    * https://codereview.chromium.org/101203012
    */
  def isAutoReporting(): Boolean = js.native
  /**
    * [webdriver]
    * Is Element Displayed determines the visibility of an element which is guided by what is perceptually visible to the human eye. In this context, an element's displayedness does not relate to the `visibility` or `display` style properties.
    * https://w3c.github.io/webdriver/#element-displayedness
    */
  def isElementDisplayed(elementId: String): Boolean = js.native
  /**
    * [webdriver]
    * Is Element Enabled determines if the referenced element is enabled or not. This operation only makes sense on form controls.
    * https://w3c.github.io/webdriver/#dfn-is-element-enabled
    */
  def isElementEnabled(elementId: String): Boolean = js.native
  /**
    * [webdriver]
    * Is Element Selected determines if the referenced element is selected or not. This operation only makes sense on input elements of the Checkbox- and Radio Button states, or option elements.
    * https://w3c.github.io/webdriver/#dfn-is-element-selected
    */
  def isElementSelected(elementId: String): Boolean = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeactivated
    */
  def isIMEActivated(): Boolean = js.native
  /**
    * [appium]
    * Whether or not the soft keyboard is shown.
    * http://appium.io/docs/en/commands/device/keys/is-keyboard-shown/
    */
  def isKeyboardShown(): Boolean = js.native
  /**
    * [chromium]
    * Determines load status for active window handle.
    * https://github.com/bayandin/chromedriver/blob/2.45/session_commands.cc#L783-L802
    */
  def isLoading(): Boolean = js.native
  /**
    * [appium]
    * Check whether the device is locked or not.
    * http://appium.io/docs/en/commands/device/interactions/is-locked/
    */
  def isLocked(): Boolean = js.native
  /**
    * [saucelabs]
    * Perform a scroll test that evaluates the jankiness of the application.
    * https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
    */
  def jankinessCheck(): ProtocolCommandResponse = js.native
  /**
    * [appium]
    * Launch an app on device. iOS tests with XCUITest can also use the `mobile: launchApp` method. See detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-launchapp).
    * http://appium.io/docs/en/commands/device/app/launch-app/
    */
  def launchApp(): Unit = js.native
  /**
    * [chromium]
    * Launches a Chrome app by specified id.
    * https://github.com/bayandin/chromedriver/blob/2.45/session_commands.cc#L521-L539
    */
  def launchApp(id: String): Unit = js.native
  /**
    * [appium]
    * Lock the device.
    * http://appium.io/docs/en/commands/device/interactions/lock/
    */
  def lock(): Unit = js.native
  def lock(seconds: Double): Unit = js.native
  /**
    * [appium]
    * Store a custom event.
    * https://github.com/appium/appium/blob/master/docs/en/commands/session/events/log-event.md
    */
  def logEvent(vendor: String, event: String): Unit = js.native
  /**
    * [appium]
    * Press and hold a particular key code on the device.
    * http://appium.io/docs/en/commands/device/keys/long-press-keycode/
    */
  def longPressKeyCode(keycode: Double): Unit = js.native
  def longPressKeyCode(keycode: Double, metastate: Double): Unit = js.native
  def longPressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
  /**
    * [selenium]
    * Manage lifecycle of hub node.
    * https://github.com/nicegraham/selenium-grid2-api#lifecycle-manager
    */
  def manageSeleniumHubLifecycle(action: String): Unit = js.native
  /**
    * [webdriver]
    * The Maximize Window command invokes the window manager-specific "maximize" operation, if any, on the window containing the current top-level browsing context. This typically increases the window to the maximum available size without going full-screen.
    * https://w3c.github.io/webdriver/#dfn-maximize-window
    */
  def maximizeWindow(): RectReturn = js.native
  /**
    * [jsonwp]
    * Maximize the current focused window if not already maximized.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidwindowwindowhandlemaximize
    */
  @JSName("maximizeWindow")
  def maximizeWindow_Unit(): Unit = js.native
  /**
    * [webdriver]
    * The Minimize Window command invokes the window manager-specific "minimize" operation, if any, on the window containing the current top-level browsing context. This typically hides the window in the system tray.
    * https://w3c.github.io/webdriver/#dfn-minimize-window
    */
  def minimizeWindow(): RectReturn = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidmoveto
    */
  def moveToElement(): Unit = js.native
  def moveToElement(element: String): Unit = js.native
  def moveToElement(element: String, xoffset: Double): Unit = js.native
  def moveToElement(element: String, xoffset: Double, yoffset: Double): Unit = js.native
  def moveToElement(element: Null, xoffset: Double): Unit = js.native
  def moveToElement(element: Null, xoffset: Double, yoffset: Double): Unit = js.native
  /**
    * [appium]
    * This functionality is only available from within a native context. Perform a multi touch action sequence.
    * http://appium.io/docs/en/commands/interactions/touch/multi-touch-perform/
    */
  def multiTouchPerform(actions: js.Array[js.Object]): Unit = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#touch-gestures
    */
  def multiTouchPerform(actions: js.Array[js.Object], elementId: js.Array[js.Object]): Unit = js.native
  /**
    * [webdriver]
    * The navigateTo (go) command is used to cause the user agent to navigate the current top-level browsing context a new location.
    * https://w3c.github.io/webdriver/#dfn-navigate-to
    */
  def navigateTo(url: String): String = js.native
  /**
    * [jsonwp]
    * Navigate to a new URL.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidurl
    */
  @JSName("navigateTo")
  def navigateTo_Unit(url: String): Unit = js.native
  /**
    * [webdriver]
    * The New Session command creates a new WebDriver session with the endpoint node. If the creation fails, a session not created error is returned.
    * https://w3c.github.io/webdriver/#dfn-new-sessions
    */
  def newSession(capabilities: js.Object): SessionReturn = js.native
  /**
    * [jsonwp]
    * Create a new session. The server should attempt to create a session that most closely matches the desired and required capabilities. Required capabilities have higher priority than desired capabilities and must be set for the session to be created.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#session-1
    */
  def newSession(desiredCapabilities: js.Object, requiredCapabilities: js.Object): SessionReturn = js.native
  /**
    * [appium]
    * Open Android notifications (Emulator only).
    * http://appium.io/docs/en/commands/device/system/open-notifications/
    */
  def openNotifications(): Unit = js.native
  /**
    * [webdriver]
    * The Perform Actions command is used to execute complex user actions. See [spec](https://github.com/jlipps/simple-wd-spec#perform-actions) for more details.
    * https://w3c.github.io/webdriver/#dfn-perform-actions
    */
  def performActions(actions: js.Array[js.Object]): Unit = js.native
  /**
    * [jsonwp]
    * Clicks at the current mouse coordinates (set by moveto).
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidclick
    */
  def positionClick(): Unit = js.native
  def positionClick(button: Double): Unit = js.native
  /**
    * [jsonwp]
    * Double-clicks at the current mouse coordinates (set by moveto).
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessioniddoubleclick
    */
  def positionDoubleClick(): Unit = js.native
  /**
    * [appium]
    * Set the state of the battery charger to connected or not (Emulator only).
    * http://appium.io/docs/en/commands/device/emulator/power_ac/
    */
  def powerAC(state: String): Unit = js.native
  /**
    * [appium]
    * Set the battery percentage (Emulator only).
    * http://appium.io/docs/en/commands/device/emulator/power_capacity/
    */
  def powerCapacity(percent: Double): Unit = js.native
  /**
    * [appium]
    * Press a particular key on the device.
    * http://appium.io/docs/en/commands/device/keys/press-keycode/
    */
  def pressKeyCode(keycode: Double): Unit = js.native
  def pressKeyCode(keycode: Double, metastate: Double): Unit = js.native
  def pressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
  /**
    * [appium]
    * Retrieve a file from the device's file system.
    * http://appium.io/docs/en/commands/device/files/pull-file/
    */
  def pullFile(path: String): Unit = js.native
  /**
    * [appium]
    * Retrieve a folder from the device's file system.
    * http://appium.io/docs/en/commands/device/files/pull-folder/
    */
  def pullFolder(path: String): Unit = js.native
  /**
    * [appium]
    * Place a file onto the device in a particular place.
    * http://appium.io/docs/en/commands/device/files/push-file/
    */
  def pushFile(path: String, data: String): Unit = js.native
  /**
    * [appium]
    * Get the given app status on the device
    * http://appium.io/docs/en/commands/device/app/app-state/
    */
  def queryAppState(): Double = js.native
  def queryAppState(appId: String): Double = js.native
  def queryAppState(appId: String, bundleId: String): Double = js.native
  /**
    * [appium]
    * Callback url for asynchronous execution of JavaScript.
    * https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
    */
  def receiveAsyncResponse(response: js.Object): Unit = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#mobile-json-wire-protocol-endpoints
    */
  def receiveAsyncResponse(status: String, value: String): Unit = js.native
  /**
    * [webdriver]
    * The Refresh command causes the browser to reload the page in current top-level browsing context.
    * https://w3c.github.io/webdriver/#dfn-refresh
    */
  def refresh(): Unit = js.native
  /**
    * [webdriver]
    * The Release Actions command is used to release all the keys and pointer buttons that are currently depressed. This causes events to be fired as if the state was released by an explicit series of actions. It also clears all the internal state of the virtual devices.
    * https://w3c.github.io/webdriver/#dfn-release-actions
    */
  def releaseActions(): Unit = js.native
  /**
    * [appium]
    * Remove an app from the device.
    * http://appium.io/docs/en/commands/device/app/remove-app/
    */
  def removeApp(): Unit = js.native
  def removeApp(appId: String): Unit = js.native
  def removeApp(appId: String, bundleId: String): Unit = js.native
  /**
    * [appium]
    * Replace the value to element directly.
    * https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
    */
  def replaceValue(elementId: String, value: String): Unit = js.native
  /**
    * [appium]
    * Reset the currently running app for this session.
    * http://appium.io/docs/en/commands/device/app/reset-app/
    */
  def reset(): Unit = js.native
  /**
    * [chromium]
    * Resume the current page. Extension for [Page Lifecycle API](https://developers.google.com/web/updates/2018/07/page-lifecycle-api).
    * https://github.com/bayandin/chromedriver/blob/2.45/window_commands.cc#L635-L645
    */
  def resume(): Unit = js.native
  /**
    * [appium]
    * Rotate the device in three dimensions.
    * http://appium.io/docs/en/commands/device/interactions/rotate/
    */
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
  /**
    * [webdriver]
    * The Send Alert Text command sets the text field of a window.prompt user prompt to the given value.
    * https://w3c.github.io/webdriver/#dfn-send-alert-text
    */
  def sendAlertText(text: String): Unit = js.native
  /**
    * [chromium]
    * Send a command to the DevTools debugger.<br>For a list of available commands and their parameters refer to the [Chrome DevTools Protocol Viewer](https://chromedevtools.github.io/devtools-protocol/).
    * https://github.com/bayandin/chromedriver/blob/2.45/window_commands.cc#L1290-L1304
    */
  def sendCommand(cmd: String, params: js.Object): Unit = js.native
  /**
    * [chromium]
    * Send a command to the DevTools debugger and wait for the result.<br>For a list of available commands and their parameters refer to the [Chrome DevTools Protocol Viewer](https://chromedevtools.github.io/devtools-protocol/).
    * https://github.com/bayandin/chromedriver/blob/2.45/window_commands.cc#L1306-L1320
    */
  def sendCommandAndGetResult(cmd: String, params: js.Object): js.Any = js.native
  /**
    * [appium]
    * Send a key code to the device.
    * https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
    */
  def sendKeyEvent(keycode: String): Unit = js.native
  def sendKeyEvent(keycode: String, metastate: String): Unit = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidkeys
    */
  def sendKeys(value: js.Array[String]): Unit = js.native
  /**
    * [appium]
    * Simulate an SMS message (Emulator only).
    * http://appium.io/docs/en/commands/device/network/send-sms/
    */
  def sendSms(phoneNumber: String, message: String): Unit = js.native
  /**
    * [jsonwp]
    * Set the amount of time, in milliseconds, that asynchronous scripts executed by `/session/:sessionId/execute_async` are permitted to run before they are aborted and a `Timeout` error is returned to the client.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtimeoutsasync_script
    */
  def setAsyncTimeout(ms: Double): Unit = js.native
  /**
    * [chromium]
    * Toggle whether to return response with unknown error with first browser error (e.g. failed to load resource due to 403/404 response) for all subsequent commands (once enabled).
    * https://codereview.chromium.org/101203012
    */
  def setAutoReporting(enabled: Boolean): js.Object | Null = js.native
  /**
    * [appium]
    * Set the content of the system clipboard
    * http://appium.io/docs/en/commands/device/clipboard/set-clipboard/
    */
  def setClipboard(content: String): String = js.native
  def setClipboard(content: String, contentType: String): String = js.native
  def setClipboard(content: String, contentType: String, label: String): String = js.native
  /**
    * [jsonwp]
    * Set the current geo location.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidlocation
    */
  def setGeoLocation(location: js.Object): Unit = js.native
  /**
    * [jsonwp]
    * Set the amount of time the driver should wait when searching for elements. When searching for a single element, the driver should poll the page until an element is found or the timeout expires, whichever occurs first. When searching for multiple elements, the driver should poll the page until at least one element is found or the timeout expires, at which point it should return an empty list. If this command is never sent, the driver should default to an implicit wait of 0ms.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtimeoutsimplicit_wait
    */
  def setImplicitTimeout(ms: Double): Unit = js.native
  /**
    * [jsonwp]
    * Set the storage item for the given key.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidlocal_storage
    */
  def setLocalStorage(key: String, value: String): Unit = js.native
  /**
    * [chromium]
    * Set network conditions used for emulation by throttling connection.
    * https://github.com/bayandin/chromedriver/blob/2.45/window_commands.cc#L1663-L1722
    */
  def setNetworkConditions(network_conditions: js.Object): Unit = js.native
  def setNetworkConditions(network_conditions: js.Object, network_name: String): Unit = js.native
  /**
    * [chromium]
    * Change connection type for network connection. This command is only applicable when remote end replies with `networkConnectionEnabled` capability set to `true`.
    * https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
    */
  def setNetworkConnection(parameters: js.Object): Double = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
    */
  def setNetworkConnection(`type`: Double): Unit = js.native
  /**
    * [jsonwp]
    * 
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidorientation
    */
  def setOrientation(orientation: String): Unit = js.native
  /**
    * [jsonwp]
    * Set the storage item for the given key.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidsession_storage
    */
  def setSessionStorage(key: String, value: String): Unit = js.native
  /**
    * [webdriver]
    * The Set Timeouts command sets timeout durations associated with the current session. The timeouts that can be controlled are listed in the table of session timeouts below.
    * https://w3c.github.io/webdriver/#dfn-set-timeouts
    */
  def setTimeouts(): Unit = js.native
  def setTimeouts(`implicit`: Double): Unit = js.native
  def setTimeouts(`implicit`: Double, pageLoad: Double): Unit = js.native
  def setTimeouts(`implicit`: Double, pageLoad: Double, script: Double): Unit = js.native
  /**
    * [jsonwp]
    * Configure the amount of time that a particular type of operation can execute for before they are aborted and a |Timeout| error is returned to the client.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtimeouts
    */
  def setTimeouts(`type`: String, ms: Double): Unit = js.native
  /**
    * [appium]
    * 
    * https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
    */
  def setValueImmediate(elementId: String, value: String): Unit = js.native
  /**
    * [jsonwp]
    * Change the position of the current focussed window.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidwindowwindowhandleposition
    */
  def setWindowPosition(x: Double, y: Double): ProtocolCommandResponse = js.native
  def setWindowRect(): RectReturn = js.native
  def setWindowRect(x: Double): RectReturn = js.native
  def setWindowRect(x: Double, y: Double): RectReturn = js.native
  def setWindowRect(x: Double, y: Double, width: Double): RectReturn = js.native
  /**
    * [webdriver]
    * The Set Window Rect command alters the size and the position of the operating system window corresponding to the current top-level browsing context.
    * https://w3c.github.io/webdriver/#dfn-set-window-rect
    */
  def setWindowRect(x: Double, y: Double, width: Double, height: Double): RectReturn = js.native
  def setWindowRect(x: Double, y: Double, width: Null, height: Double): RectReturn = js.native
  def setWindowRect(x: Double, y: Null, width: Double): RectReturn = js.native
  def setWindowRect(x: Double, y: Null, width: Double, height: Double): RectReturn = js.native
  def setWindowRect(x: Double, y: Null, width: Null, height: Double): RectReturn = js.native
  def setWindowRect(x: Null, y: Double): RectReturn = js.native
  def setWindowRect(x: Null, y: Double, width: Double): RectReturn = js.native
  def setWindowRect(x: Null, y: Double, width: Double, height: Double): RectReturn = js.native
  def setWindowRect(x: Null, y: Double, width: Null, height: Double): RectReturn = js.native
  def setWindowRect(x: Null, y: Null, width: Double): RectReturn = js.native
  def setWindowRect(x: Null, y: Null, width: Double, height: Double): RectReturn = js.native
  def setWindowRect(x: Null, y: Null, width: Null, height: Double): RectReturn = js.native
  /**
    * [appium]
    * Perform a shake action on the device.
    * http://appium.io/docs/en/commands/device/interactions/shake/
    */
  def shake(): Unit = js.native
  /**
    * [chromium]
    * Shutdown ChromeDriver process and consequently terminating all active sessions.
    * https://github.com/bayandin/chromedriver/blob/2.45/session_commands.cc#L489-L498
    */
  def shutdown(): Unit = js.native
  /**
    * [appium]
    * Start an Android activity by providing package name and activity name.
    * http://appium.io/docs/en/commands/device/activity/start-activity/
    */
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
  /**
    * [appium]
    * Start recording the screen.
    * http://appium.io/docs/en/commands/device/recording-screen/start-recording-screen/
    */
  def startRecordingScreen(): Unit = js.native
  def startRecordingScreen(options: js.Object): Unit = js.native
  /**
    * [webdriver]
    * The Status command returns information about whether a remote end is in a state in which it can create new sessions and can additionally include arbitrary meta information that is specific to the implementation.
    * https://w3c.github.io/webdriver/#dfn-status
    */
  def status(): StatusReturn = js.native
  /**
    * [appium]
    * Stop recording screen
    * http://appium.io/docs/en/commands/device/recording-screen/stop-recording-screen/
    */
  def stopRecordingScreen(): String = js.native
  def stopRecordingScreen(remotePath: String): String = js.native
  def stopRecordingScreen(remotePath: String, username: String): String = js.native
  def stopRecordingScreen(remotePath: String, username: String, password: String): String = js.native
  def stopRecordingScreen(remotePath: String, username: String, password: String, method: String): String = js.native
  /**
    * [mjsonwp]
    * 
    * https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
    */
  def switchContext(name: String): Unit = js.native
  def switchToFrame(): Unit = js.native
  /**
    * [jsonwp]
    * Change focus to another frame on the page. If the frame `id` is `null`, the server should switch to the page's default content.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidframe
    */
  def switchToFrame(id: String): Unit = js.native
  def switchToFrame(id: js.Object): Unit = js.native
  /**
    * [webdriver]
    * The Switch To Frame command is used to select the current top-level browsing context or a child browsing context of the current browsing context to use as the current browsing context for subsequent commands.
    * https://w3c.github.io/webdriver/#dfn-switch-to-frame
    */
  def switchToFrame(id: Double): Unit = js.native
  /**
    * [webdriver]
    * The Switch to Parent Frame command sets the current browsing context for future commands to the parent of the current browsing context.
    * https://w3c.github.io/webdriver/#dfn-switch-to-parent-frame
    */
  def switchToParentFrame(): Unit = js.native
  /**
    * [webdriver]
    * The Switch To Window command is used to select the current top-level browsing context for the current session, i.e. the one that will be used for processing commands.
    * https://w3c.github.io/webdriver/#dfn-switch-to-window
    */
  def switchToWindow(handle: String): Unit = js.native
  /**
    * [webdriver]
    * The Take Element Screenshot command takes a screenshot of the visible region encompassed by the bounding rectangle of an element.
    * https://w3c.github.io/webdriver/#dfn-take-element-screenshot
    */
  def takeElementScreenshot(elementId: String): String = js.native
  def takeElementScreenshot(elementId: String, scroll: Boolean): String = js.native
  /**
    * [chromium]
    * Takes a heap snapshot of the current execution context.
    * https://github.com/bayandin/chromedriver/blob/2.45/chrome/web_view.h#L198-L202
    */
  def takeHeapSnapshot(): ProtocolCommandResponse = js.native
  /**
    * [webdriver]
    * The Take Screenshot command takes a screenshot of the top-level browsing context's viewport.
    * https://w3c.github.io/webdriver/#dfn-take-screenshot
    */
  def takeScreenshot(): String = js.native
  /**
    * [appium]
    * Terminate the given app on the device
    * http://appium.io/docs/en/commands/device/app/terminate-app/
    */
  def terminateApp(): Unit = js.native
  def terminateApp(appId: String): Unit = js.native
  def terminateApp(appId: String, bundleId: String): Unit = js.native
  /**
    * [saucelabs]
    * You can throttle the CPU in DevTools to understand how your page performs under that constraint.
    * https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-ThrottleCPUCapabilities
    */
  def throttleCPU(rate: Double): Unit = js.native
  /**
    * [saucelabs]
    * With network conditioning you can test your site on a variety of network connections, including Edge, 3G, and even offline. You can throttle the data throughput, including the maximum download and upload throughput, and use latency manipulation to enforce a minimum delay in connection round-trip time (RTT).
    * https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-ThrottleNetworkCapabilities
    */
  def throttleNetwork(condition: String): Unit = js.native
  def throttleNetwork(condition: js.Object): Unit = js.native
  /**
    * [appium]
    * Toggle airplane mode on device.
    * http://appium.io/docs/en/commands/device/network/toggle-airplane-mode/
    */
  def toggleAirplaneMode(): Unit = js.native
  /**
    * [appium]
    * Switch the state of data service.
    * http://appium.io/docs/en/commands/device/network/toggle-data/
    */
  def toggleData(): Unit = js.native
  /**
    * [appium]
    * Toggle the simulator being [enrolled](https://support.apple.com/en-ca/ht201371) to accept touchId (iOS Simulator only). To enable this feature, the `allowTouchIdEnroll` desired capability must be set to true. When `allowTouchIdEnroll` is set to true the Simulator will be enrolled by default, and the 'Toggle Touch ID Enrollment' changes the enrollment state. This call will only work if the Appium process or its parent application (e.g., Terminal.app or Appium.app) has access to Mac OS accessibility in System Preferences > Security & Privacy > Privacy > Accessibility list.
    * http://appium.io/docs/en/commands/device/simulator/toggle-touch-id-enrollment/
    */
  def toggleEnrollTouchId(): Unit = js.native
  def toggleEnrollTouchId(enabled: Boolean): Unit = js.native
  /**
    * [appium]
    * Switch the state of the location service.
    * http://appium.io/docs/en/commands/device/network/toggle-location-services/
    */
  def toggleLocationServices(): Unit = js.native
  /**
    * [appium]
    * Set network speed (Emulator only)
    * http://appium.io/docs/en/commands/device/network/network-speed/
    */
  def toggleNetworkSpeed(): Unit = js.native
  /**
    * [appium]
    * Switch the state of the wifi service.
    * http://appium.io/docs/en/commands/device/network/toggle-wifi/
    */
  def toggleWiFi(): Unit = js.native
  /**
    * [jsonwp]
    * Single tap on the touch enabled device.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchclick
    */
  def touchClick(element: String): Unit = js.native
  /**
    * [jsonwp]
    * Double tap on the touch screen using finger motion events.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchdoubleclick
    */
  def touchDoubleClick(element: String): Unit = js.native
  /**
    * [jsonwp]
    * Finger down on the screen.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchdown
    */
  def touchDown(x: Double, y: Double): Unit = js.native
  /**
    * [jsonwp]
    * Flick on the touch screen using finger motion events. This flickcommand starts at a particulat screen location.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchflick
    */
  def touchFlick(
    xoffset: js.UndefOr[Double],
    yoffset: js.UndefOr[Double],
    element: js.UndefOr[String],
    speed: js.UndefOr[Double],
    xspeed: js.UndefOr[Double],
    yspeed: js.UndefOr[Double]
  ): Unit = js.native
  /**
    * [appium]
    * Simulate a [touch id](https://support.apple.com/en-ca/ht201371) event (iOS Simulator only). To enable this feature, the `allowTouchIdEnroll` desired capability must be set to true and the Simulator must be [enrolled](https://support.apple.com/en-ca/ht201371). When you set allowTouchIdEnroll to true, it will set the Simulator to be enrolled by default. The enrollment state can be [toggled](http://appium.io/docs/en/commands/device/simulator/toggle-touch-id-enrollment/index.html). This call will only work if Appium process or its parent application (e.g. Terminal.app or Appium.app) has access to Mac OS accessibility in System Preferences > Security & Privacy > Privacy > Accessibility list.
    * http://appium.io/docs/en/commands/device/simulator/touch-id/
    */
  def touchId(`match`: Boolean): Unit = js.native
  /**
    * [jsonwp]
    * Long press on the touch screen using finger motion events.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchlongclick
    */
  def touchLongClick(element: String): Unit = js.native
  /**
    * [jsonwp]
    * Finger move on the screen.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchmove
    */
  def touchMove(x: Double, y: Double): Unit = js.native
  /**
    * [appium]
    * This functionality is only available from within a native context. 'Touch Perform' works similarly to the other singular touch interactions, except that this allows you to chain together more than one touch action as one command. This is useful because Appium commands are sent over the network and there's latency between commands. This latency can make certain touch interactions impossible because some interactions need to be performed in one sequence. Vertical, for example, requires pressing down, moving to a different y coordinate, and then releasing. For it to work, there can't be a delay between the interactions.
    * http://appium.io/docs/en/commands/interactions/touch/touch-perform/
    */
  def touchPerform(actions: js.Array[js.Object]): Unit = js.native
  /**
    * [chromium]
    * Trigger a pinch zoom effect.
    * https://github.com/bayandin/chromedriver/blob/2.45/window_commands.cc#L813-L827
    */
  def touchPinch(x: Double, y: Double, scale: Double): Unit = js.native
  /**
    * [jsonwp]
    * Finger move on the screen.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchscroll
    */
  def touchScroll(xoffset: Double, yoffset: Double): Unit = js.native
  def touchScroll(xoffset: Double, yoffset: Double, element: String): Unit = js.native
  /**
    * [jsonwp]
    * Finger up on the screen.
    * https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchup
    */
  def touchUp(x: Double, y: Double): Unit = js.native
  /**
    * [appium]
    * Unlock the device.
    * http://appium.io/docs/en/commands/device/interactions/unlock/
    */
  def unlock(): Unit = js.native
  /**
    * [appium]
    * Update the current setting on the device.
    * http://appium.io/docs/en/commands/session/settings/update-settings/
    */
  def updateSettings(settings: js.Object): Unit = js.native
}

