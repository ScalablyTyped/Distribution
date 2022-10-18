package typings.wdioProtocols

import typings.wdioProtocols.buildTypesMod.Cookie
import typings.wdioProtocols.buildTypesMod.ElementReference
import typings.wdioProtocols.buildTypesMod.ProtocolCommandResponse
import typings.wdioProtocols.buildTypesMod.RectReturn
import typings.wdioProtocols.buildTypesMod.SessionReturn
import typings.wdioProtocols.buildTypesMod.StatusReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsJsonwpMod {
  
  @js.native
  trait JsonwpCommands extends StObject {
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the size of the current focused window.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidwindowwindowhandlesize
      *
      */
    def _getWindowSize(): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Change the size of the current focused window.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidwindowwindowhandlesize
      *
      */
    def _setWindowSize(width: Double, height: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidaccept_alert
      *
      */
    def acceptAlert(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeactivate
      *
      */
    def activateIME(engine: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidcookie
      *
      */
    def addCookie(cookie: js.Object): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Navigate backwards in the browser history, if possible.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidback
      *
      */
    def back(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Click and hold the left mouse button (at the coordinates set by the last moveto command). Note that the next mouse-related command that should follow is buttonup . Any other mouse command (such as click or another call to buttondown) will yield undefined behaviour.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidbuttondown
      *
      */
    def buttonDown(): Unit = js.native
    def buttonDown(button: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Releases the mouse button previously held (where the mouse is currently at). Must be called once for every buttondown command issued. See the note in click and buttondown about implications of out-of-order commands.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidbuttonup
      *
      */
    def buttonUp(): Unit = js.native
    def buttonUp(button: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Clear the storage.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocal_storage
      *
      */
    def clearLocalStorage(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Clear the storage.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidsession_storage
      *
      */
    def clearSessionStorage(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Close the current window.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidwindow
      *
      */
    def closeWindow(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimedeactivate
      *
      */
    def deactivateIME(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidcookie
      *
      */
    def deleteAllCookies(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidcookiename
      *
      */
    def deleteCookie(name: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidlocal_storagekeykey
      *
      */
    def deleteLocalStorageItem(key: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Delete the session.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionid
      *
      */
    def deleteSession(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Remove the storage item for the given key.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#delete-sessionsessionidsession_storagekeykey
      *
      */
    def deleteSessionStorageItem(key: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessioniddismiss_alert
      *
      */
    def dismissAlert(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidclear
      *
      */
    def elementClear(elementId: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Click any mouse button (at the coordinates set by the last moveto command). Note that calling this command after calling buttondown and before calling button up (or any out-of-order interactions sequence) will yield undefined behaviour).
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidclick
      *
      */
    def elementClick(elementId: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Compare elements with each other.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidequalsother
      *
      */
    def elementEquals(elementId: String, otherElementId: String): Boolean = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidvalue
      *
      */
    def elementSendKeys(elementId: String, value: js.Array[String]): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidsubmit
      *
      */
    def elementSubmit(elementId: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidexecute_async
      *
      */
    def executeAsyncScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): Any = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidexecute
      *
      */
    def executeScript(script: String): Any = js.native
    def executeScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): Any = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Search for an element on the page, starting from the document root. The located element will be returned as a WebElement JSON object. The table below lists the locator strategies that each server should support. Each locator must return the first matching element located in the DOM.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelement
      *
      */
    def findElement(`using`: String, value: String): ElementReference = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Search for an element on the page, starting from the identified element. The located element will be returned as a WebElement JSON object. The table below lists the locator strategies that each server should support. Each locator must return the first matching element located in the DOM.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidelement
      *
      */
    def findElementFromElement(elementId: String, `using`: String, value: String): ElementReference = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Search for multiple elements on the page, starting from the document root. The located elements will be returned as a WebElement JSON objects. The table below lists the locator strategies that each server should support. Elements should be returned in the order located in the DOM.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelements
      *
      */
    def findElements(`using`: String, value: String): js.Array[ElementReference] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Search for multiple elements on the page, starting from the identified element. The located elements will be returned as a WebElement JSON objects. The table below lists the locator strategies that each server should support. Elements should be returned in the order located in the DOM.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidelements
      *
      */
    def findElementsFromElement(elementId: String, `using`: String, value: String): js.Array[ElementReference] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Navigate forwards in the browser history, if possible.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidforward
      *
      */
    def forward(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the element on the page that currently has focus. The element will be returned as a WebElement JSON object.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementactive
      *
      */
    def getActiveElement(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeactive_engine
      *
      */
    def getActiveEngine(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidalert_text
      *
      */
    def getAlertText(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidcookie
      *
      */
    def getAllCookies(): js.Array[Cookie] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the status of the html5 application cache.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidapplication_cachestatus
      *
      */
    def getApplicationCacheStatus(): Double = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeavailable_engines
      *
      */
    def getAvailableEngines(): js.Array[String] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the value of an element's attribute.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidattributename
      *
      */
    def getElementAttribute(elementId: String, name: String): String | Null = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Query the value of an element's computed CSS property. The CSS property to query should be specified using the CSS property name, __not__ the JavaScript property name (e.g. `background-color` instead of `backgroundColor`).
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidcsspropertyname
      *
      */
    def getElementCSSValue(elementId: String, propertyName: String): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Determine an element's location on the page. The point `(0, 0)` refers to the upper-left corner of the page. The element's coordinates are returned as a JSON object with `x` and `y` properties.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidlocation
      *
      */
    def getElementLocation(elementId: String): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Determine an element's location on the screen once it has been scrolled into view.<br /><br />__Note:__ This is considered an internal command and should only be used to determine an element's location for correctly generating native events.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidlocation_in_view
      *
      */
    def getElementLocationInView(elementId: String): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Determine an element's size in pixels. The size will be returned as a JSON object with `width` and `height` properties.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidsize
      *
      */
    def getElementSize(elementId: String): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Query for an element's tag name.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidname
      *
      */
    def getElementTagName(elementId: String): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Returns the visible text for the element.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidtext
      *
      */
    def getElementText(elementId: String): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the current geo location.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocation
      *
      */
    def getGeoLocation(): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get all keys of the storage.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocal_storage
      *
      */
    def getLocalStorage(): js.Array[String] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the storage item for the given key.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidlocal_storagekeykey
      *
      */
    def getLocalStorageItem(key: String): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the number of items in the storage.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidlocal_storagesize
      *
      */
    def getLocalStorageSize(): Double = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get available log types.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidlogtypes
      *
      */
    def getLogTypes(): js.Array[String] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the log for a given log type. Log buffer is reset after each request.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidlog
      *
      */
    def getLogs(`type`: String): js.Array[js.Object] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidorientation
      *
      */
    def getOrientation(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidsource
      *
      */
    def getPageSource(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Retrieve the capabilities of the specified session.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionid
      *
      */
    def getSession(): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get all keys of the storage.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidsession_storage
      *
      */
    def getSessionStorage(): js.Array[String] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the storage item for the given key.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidsession_storagekeykey
      *
      */
    def getSessionStorageItem(key: String): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the number of items in the storage.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidsession_storagesize
      *
      */
    def getSessionStorageSize(): Double = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Returns a list of the currently active sessions. Each session will be returned as a list of JSON objects containing `id` and `capabilities`.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessions
      *
      */
    def getSessions(): js.Array[js.Object] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the current page title.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtitle
      *
      */
    def getTitle(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Retrieve the URL of the current page.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidurl
      *
      */
    def getUrl(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Retrieve the current window handle.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidwindow_handle
      *
      */
    def getWindowHandle(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Retrieve the list of all window handles available to the session.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidwindow_handles
      *
      */
    def getWindowHandles(): js.Array[String] = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Get the position of the current focussed window.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#get-sessionsessionidwindowwindowhandleposition
      *
      */
    def getWindowPosition(): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Determine if an element is currently displayed.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementiddisplayed
      *
      */
    def isElementDisplayed(elementId: String): Boolean = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Determine if an element is currently enabled.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidenabled
      *
      */
    def isElementEnabled(elementId: String): Boolean = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Determine if an `OPTION` element, or an `INPUT` element of type `checkbox` or `radiobutton` is currently selected.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidselected
      *
      */
    def isElementSelected(elementId: String): Boolean = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidimeactivated
      *
      */
    def isIMEActivated(): Boolean = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Maximize the current focused window if not already maximized.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidwindowwindowhandlemaximize
      *
      */
    def maximizeWindow(): RectReturn = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidmoveto
      *
      */
    def moveToElement(): Unit = js.native
    def moveToElement(element: String): Unit = js.native
    def moveToElement(element: String, xoffset: Double): Unit = js.native
    def moveToElement(element: String, xoffset: Double, yoffset: Double): Unit = js.native
    def moveToElement(element: String, xoffset: Unit, yoffset: Double): Unit = js.native
    def moveToElement(element: Null, xoffset: Double): Unit = js.native
    def moveToElement(element: Null, xoffset: Double, yoffset: Double): Unit = js.native
    def moveToElement(element: Null, xoffset: Unit, yoffset: Double): Unit = js.native
    def moveToElement(element: Unit, xoffset: Double): Unit = js.native
    def moveToElement(element: Unit, xoffset: Double, yoffset: Double): Unit = js.native
    def moveToElement(element: Unit, xoffset: Unit, yoffset: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Navigate to a new URL.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidurl
      *
      */
    def navigateTo(url: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Create a new session. The server should attempt to create a session that most closely matches the desired and required capabilities. Required capabilities have higher priority than desired capabilities and must be set for the session to be created.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#session-1
      *
      */
    def newSession(desiredCapabilities: js.Object, requiredCapabilities: js.Object): SessionReturn = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Clicks at the current mouse coordinates (set by moveto).
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidclick
      *
      */
    def positionClick(): Unit = js.native
    def positionClick(button: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Double-clicks at the current mouse coordinates (set by moveto).
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessioniddoubleclick
      *
      */
    def positionDoubleClick(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Refresh the current page.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidrefresh
      *
      */
    def refresh(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://w3c.github.io/webdriver/webdriver-spec.html#dfn-send-alert-text
      *
      */
    def sendAlertText(text: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidkeys
      *
      */
    def sendKeys(value: js.Array[String]): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Set the amount of time, in milliseconds, that asynchronous scripts executed by `/session/:sessionId/execute_async` are permitted to run before they are aborted and a `Timeout` error is returned to the client.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtimeoutsasync_script
      *
      */
    def setAsyncTimeout(ms: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Set the current geo location.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidlocation
      *
      */
    def setGeoLocation(location: js.Object): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Set the amount of time the driver should wait when searching for elements. When searching for a single element, the driver should poll the page until an element is found or the timeout expires, whichever occurs first. When searching for multiple elements, the driver should poll the page until at least one element is found or the timeout expires, at which point it should return an empty list. If this command is never sent, the driver should default to an implicit wait of 0ms.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtimeoutsimplicit_wait
      *
      */
    def setImplicitTimeout(ms: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Set the storage item for the given key.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidlocal_storage
      *
      */
    def setLocalStorage(key: String, value: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidorientation
      *
      */
    def setOrientation(orientation: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Set the storage item for the given key.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidsession_storage
      *
      */
    def setSessionStorage(key: String, value: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Configure the amount of time that a particular type of operation can execute for before they are aborted and a |Timeout| error is returned to the client.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtimeouts
      *
      */
    def setTimeouts(`type`: String, ms: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Change the position of the current focussed window.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidwindowwindowhandleposition
      *
      */
    def setWindowPosition(x: Double, y: Double): ProtocolCommandResponse = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Query the server's current status. The server should respond with a general "HTTP 200 OK" response if it is alive and accepting commands. The response body should be a JSON object describing the state of the server. All server implementations should return two basic objects describing the server's current platform and when the server was built. All fields are optional; if omitted, the client should assume the value is unknown. Furthermore, server implementations may include additional fields not listed here.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#status
      *
      */
    def status(): StatusReturn = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Change focus to another frame on the page. If the frame `id` is `null`, the server should switch to the page's default content.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidframe
      *
      */
    def switchToFrame(): Unit = js.native
    def switchToFrame(id: String): Unit = js.native
    def switchToFrame(id: js.Object): Unit = js.native
    def switchToFrame(id: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Change focus to the parent context. If the current context is the top level browsing context, the context remains unchanged.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidframeparent
      *
      */
    def switchToParentFrame(): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Change focus to another window. The window to change focus to may be specified by its server assigned window handle, or by the value of its `name` attribute.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#post-sessionsessionidwindow
      *
      */
    def switchToWindow(name: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidscreenshot
      *
      */
    def takeScreenshot(): String = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Single tap on the touch enabled device.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchclick
      *
      */
    def touchClick(element: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Double tap on the touch screen using finger motion events.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchdoubleclick
      *
      */
    def touchDoubleClick(element: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Finger down on the screen.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchdown
      *
      */
    def touchDown(x: Double, y: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Flick on the touch screen using finger motion events. This flickcommand starts at a particulat screen location.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchflick
      *
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
      * Jsonwp Protocol Command
      *
      * Long press on the touch screen using finger motion events.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchlongclick
      *
      */
    def touchLongClick(element: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Finger move on the screen.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchmove
      *
      */
    def touchMove(x: Double, y: Double): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Finger move on the screen.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchscroll
      *
      */
    def touchScroll(xoffset: Double, yoffset: Double): Unit = js.native
    def touchScroll(xoffset: Double, yoffset: Double, element: String): Unit = js.native
    
    /**
      * Jsonwp Protocol Command
      *
      * Finger up on the screen.
      * @ref https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidtouchup
      *
      */
    def touchUp(x: Double, y: Double): Unit = js.native
  }
}
