package typings.wdioProtocols

import typings.wdioProtocols.typesMod.Cookie
import typings.wdioProtocols.typesMod.ElementReference
import typings.wdioProtocols.typesMod.ProtocolCommandResponse
import typings.wdioProtocols.typesMod.RectReturn
import typings.wdioProtocols.typesMod.SessionReturn
import typings.wdioProtocols.typesMod.StatusReturn
import typings.wdioProtocols.typesMod.Timeouts
import typings.wdioProtocols.typesMod.WindowHandle
import typings.wdioProtocols.wdioProtocolsStrings.tab
import typings.wdioProtocols.wdioProtocolsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverMod {
  
  @js.native
  trait WebdriverCommands extends StObject {
    
    /**
      * Webdriver Protocol Command
      *
      * The Accept Alert command accepts a simple dialog if present, otherwise error.
      * @ref https://w3c.github.io/webdriver/#dfn-accept-alert
      *
      */
    def acceptAlert(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Add Cookie command adds a single cookie to the cookie store associated with the active document's address.
      * @ref https://w3c.github.io/webdriver/#dfn-adding-a-cookie
      *
      */
    def addCookie(cookie: js.Object): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Injects a Public Key Credential Source into an existing Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-add-credential
      *
      */
    def addCredential(
      credentialId: String,
      isResidentCredential: Boolean,
      rpId: String,
      privateKey: String,
      userHandle: String,
      signCount: Double,
      largeBlob: String
    ): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Creates a software [Virtual Authenticator](https://www.w3.org/TR/webauthn-2/#virtual-authenticators).
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-add-virtual-authenticator
      *
      */
    def addVirtualAuthenticator(
      protocol: js.UndefOr[String],
      transport: js.UndefOr[String],
      hasResidentKey: js.UndefOr[Boolean],
      hasUserVerification: js.UndefOr[Boolean],
      isUserConsenting: js.UndefOr[Boolean],
      isUserVerified: js.UndefOr[Boolean],
      extensions: js.UndefOr[js.Array[String]],
      uvm: js.UndefOr[js.Array[js.Object]]
    ): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Back command causes the browser to traverse one step backward in the joint session history of the current top-level browsing context. This is equivalent to pressing the back button in the browser chrome or calling `window.history.back`.
      * @ref https://w3c.github.io/webdriver/#dfn-back
      *
      */
    def back(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Close Window command closes the current top-level browsing context. Once done, if there are no more top-level browsing contexts open, the WebDriver session itself is closed.
      * @ref https://w3c.github.io/webdriver/#dfn-close-window
      *
      */
    def closeWindow(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Creates a mock sensor to emulate sensors like Ambient Light Sensor. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#create-mock-sensor-command
      *
      */
    def createMockSensor(mockSensorType: String, maxSamplingFrequency: Double, minSamplingFrequency: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Create a new top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#new-window
      *
      */
    def createWindow(`type`: tab | window): WindowHandle = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete All Cookies command allows deletion of all cookies associated with the active document's address.
      * @ref https://w3c.github.io/webdriver/#dfn-delete-all-cookies
      *
      */
    def deleteAllCookies(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete Cookie command allows you to delete either a single cookie by parameter name, or all the cookies associated with the active document's address if name is undefined.
      * @ref https://w3c.github.io/webdriver/#dfn-delete-cookie
      *
      */
    def deleteCookie(name: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete Session command closes any top-level browsing contexts associated with the current session, terminates the connection, and finally closes the current session. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#delete-mock-sensor-command
      *
      */
    def deleteMockSensor(`type`: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete Session command closes any top-level browsing contexts associated with the current session, terminates the connection, and finally closes the current session.
      * @ref https://w3c.github.io/webdriver/#dfn-delete-session
      *
      */
    def deleteSession(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Dismiss Alert command dismisses a simple dialog if present, otherwise error. A request to dismiss an alert user prompt, which may not necessarily have a dismiss button, has the same effect as accepting it.
      * @ref https://w3c.github.io/webdriver/#dfn-dismiss-alert
      *
      */
    def dismissAlert(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Element Clear command scrolls into view an editable or resettable element and then attempts to clear its selected files or text content.
      * @ref https://w3c.github.io/webdriver/#dfn-element-clear
      *
      */
    def elementClear(elementId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Element Click command scrolls into view the element if it is not already pointer-interactable, and clicks its in-view center point. If the element's center point is obscured by another element, an element click intercepted error is returned. If the element is outside the viewport, an element not interactable error is returned.
      * @ref https://w3c.github.io/webdriver/#dfn-element-click
      *
      */
    def elementClick(elementId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Element Send Keys command scrolls into view the form control element and then sends the provided keys to the element. In case the element is not keyboard-interactable, an element not interactable error is returned.<br /><br />The key input state used for input may be cleared mid-way through "typing" by sending the null key, which is U+E000 (NULL).
      * @ref https://w3c.github.io/webdriver/#dfn-element-send-keys
      *
      */
    def elementSendKeys(elementId: String, text: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Execute Async Script command causes JavaScript to execute as an anonymous function. Unlike the Execute Script command, the result of the function is ignored. Instead an additional argument is provided as the final argument to the function. This is a function that, when called, returns its first argument as the response.
      * @ref https://w3c.github.io/webdriver/#dfn-execute-async-script
      *
      */
    def executeAsyncScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): Any = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Execute Script command executes a JavaScript function in the context of the current browsing context and returns the return value of the function.
      * @ref https://w3c.github.io/webdriver/#dfn-execute-script
      *
      */
    def executeScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): Any = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Element command is used to find an element in the current browsing context that can be used for future commands. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element.
      * @ref https://w3c.github.io/webdriver/#dfn-find-element
      *
      * @example
      * ```js
      * // get element
      * const elementRef = await browser.findElement('xpath', '//div')
      * const element = await $(elementRef)
      * await element.click()
      * ```
      */
    def findElement(`using`: String, value: String): ElementReference = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Element From Element command is used to find an element from a web element in the current browsing context that can be used for future commands. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-find-element-from-element
      *
      */
    def findElementFromElement(elementId: String, `using`: String, value: String): ElementReference = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Element From Shadow Root command is used to find an element within the shadow root of an element that can be used for future commands. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element.
      * @ref https://w3c.github.io/webdriver/#find-element-from-shadow-root
      *
      * @example
      * ```js
      * // get shadow root
      * const element = await browser.findElement('xpath', '//div')
      * const shadowRoot = await browser.getElementShadowRoot(
      *     element['element-6066-11e4-a52e-4f735466cecf']
      * )
      * // fetch element within that shadow root
      * const elementRef = await browser.findElementFromShadowRoot(
      *     shadowRoot['shadow-6066-11e4-a52e-4f735466cecf'],
      *     'xpath',
      *     '//div'
      * )
      * ```
      */
    def findElementFromShadowRoot(shadowId: String, `using`: String, value: String): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Elements command is used to find elements in the current browsing context that can be used for future commands. This command returns array of JSON representation of the elements that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-find-elements
      *
      */
    def findElements(`using`: String, value: String): js.Array[ElementReference] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Elements From Element command is used to find elements from a web element in the current browsing context that can be used for future commands. This command returns array of JSON representation of the elements that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-find-elements-from-element
      *
      */
    def findElementsFromElement(elementId: String, `using`: String, value: String): js.Array[ElementReference] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Elements command is used to find elements within the shadow root of an element that can be used for future commands. This command returns array of JSON representation of the elements that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#find-elements-from-shadow-root
      *
      * @example
      * ```js
      * // get shadow root
      * const element = await browser.findElement('xpath', '//div')
      * const shadowRoot = await browser.getElementShadowRoot(
      *     element['element-6066-11e4-a52e-4f735466cecf']
      * )
      * // fetch elements within that shadow root
      * const elementRef = await browser.findElementsFromShadowRoot(
      *     shadowRoot['shadow-6066-11e4-a52e-4f735466cecf'],
      *     'xpath',
      *     '//div'
      * )
      * ```
      */
    def findElementsFromShadowRoot(shadowId: String, `using`: String, value: String): js.Array[js.Object] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Forward command causes the browser to traverse one step forwards in the joint session history of the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-forward
      *
      */
    def forward(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Fullscreen Window command invokes the window manager-specific “full screen” operation, if any, on the window containing the current top-level browsing context. This typically increases the window to the size of the physical display and can hide browser chrome elements such as toolbars.
      * @ref https://w3c.github.io/webdriver/#dfn-fullscreen-window
      *
      */
    def fullscreenWindow(): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Generates a report for testing. Extension for [Reporting API](https://developers.google.com/web/updates/2018/09/reportingapi). __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/reporting/#automation
      *
      */
    def generateTestReport(message: String, group: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get Active Element returns the active element of the current browsing context’s document element. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-get-active-element
      *
      */
    def getActiveElement(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Alert Text command returns the message of the current user prompt. If there is no current user prompt, it returns an error.
      * @ref https://w3c.github.io/webdriver/#dfn-get-alert-text
      *
      */
    def getAlertText(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get All Cookies command returns all cookies associated with the address of the current browsing context’s active document.
      * @ref https://w3c.github.io/webdriver/#dfn-get-all-cookies
      *
      */
    def getAllCookies(): js.Array[Cookie] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Returns one Credential Parameters object for every Public Key Credential Source stored in a Virtual Authenticator, regardless of whether they were stored using Add Credential or `navigator.credentials.create()`.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-get-credentials
      *
      */
    def getCredentials(authenticatorId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Attribute command will return the attribute of a web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-attribute
      *
      */
    def getElementAttribute(elementId: String, name: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element CSS Value command retrieves the computed value of the given CSS property of the given web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-css-value
      *
      */
    def getElementCSSValue(elementId: String, propertyName: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get the accessible name of the element.
      * @ref https://w3c.github.io/webdriver/#get-computed-label
      *
      */
    def getElementComputedLabel(elementId: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get the computed WAI-ARIA role of an element.
      * @ref https://w3c.github.io/webdriver/#get-computed-role
      *
      */
    def getElementComputedRole(elementId: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Property command will return the result of getting a property of an element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-property
      *
      */
    def getElementProperty(elementId: String, name: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Rect command returns the dimensions and coordinates of the given web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-rect
      *
      */
    def getElementRect(elementId: String): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get the shadow root object of an element. The result object can be used to fetch elements within this shadow root using e.g. findElementFromShadowRoots or findElementsFromShadowRoots.
      * @ref https://w3c.github.io/webdriver/#dfn-get-active-element
      *
      */
    def getElementShadowRoot(elementId: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Tag Name command returns the qualified element name of the given web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-tag-name
      *
      */
    def getElementTagName(elementId: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Text command intends to return an element’s text "as rendered". An element's rendered text is also used for locating a elements by their link text and partial link text.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-text
      *
      */
    def getElementText(elementId: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Retrieves information about a given type of mock sensor. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#get-mock-sensor-command
      *
      */
    def getMockSensor(`type`: String): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Named Cookie command returns the cookie with the requested name from the associated cookies in the cookie store of the current browsing context's active document. If no cookie is found, a no such cookie error is returned.
      * @ref https://w3c.github.io/webdriver/#dfn-get-named-cookie
      *
      */
    def getNamedCookie(name: String): Cookie = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Page Source command returns a string serialization of the DOM of the current browsing context active document.
      * @ref https://w3c.github.io/webdriver/#dfn-get-page-source
      *
      */
    def getPageSource(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Timeouts command gets timeout durations associated with the current session.
      * @ref https://w3c.github.io/webdriver/#dfn-get-timeouts
      *
      */
    def getTimeouts(): Timeouts = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Title command returns the document title of the current top-level browsing context, equivalent to calling `document.title`.
      * @ref https://w3c.github.io/webdriver/#dfn-get-title
      *
      */
    def getTitle(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Current URL command returns the URL of the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-get-current-url
      *
      */
    def getUrl(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Window Handle command returns the window handle for the current top-level browsing context. It can be used as an argument to Switch To Window.
      * @ref https://w3c.github.io/webdriver/#dfn-get-window-handle
      *
      */
    def getWindowHandle(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Window Handles command returns a list of window handles for every open top-level browsing context. The order in which the window handles are returned is arbitrary.
      * @ref https://w3c.github.io/webdriver/#dfn-get-window-handles
      *
      */
    def getWindowHandles(): js.Array[String] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Window Rect command returns the size and position on the screen of the operating system window corresponding to the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-get-window-rect
      *
      */
    def getWindowRect(): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Is Element Displayed determines the visibility of an element which is guided by what is perceptually visible to the human eye. In this context, an element's displayedness does not relate to the `visibility` or `display` style properties.
      * @ref https://w3c.github.io/webdriver/#element-displayedness
      *
      */
    def isElementDisplayed(elementId: String): Boolean = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Is Element Enabled determines if the referenced element is enabled or not. This operation only makes sense on form controls.
      * @ref https://w3c.github.io/webdriver/#dfn-is-element-enabled
      *
      */
    def isElementEnabled(elementId: String): Boolean = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Is Element Selected determines if the referenced element is selected or not. This operation only makes sense on input elements of the Checkbox- and Radio Button states, or option elements.
      * @ref https://w3c.github.io/webdriver/#dfn-is-element-selected
      *
      */
    def isElementSelected(elementId: String): Boolean = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Maximize Window command invokes the window manager-specific "maximize" operation, if any, on the window containing the current top-level browsing context. This typically increases the window to the maximum available size without going full-screen.
      * @ref https://w3c.github.io/webdriver/#dfn-maximize-window
      *
      */
    def maximizeWindow(): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Minimize Window command invokes the window manager-specific "minimize" operation, if any, on the window containing the current top-level browsing context. This typically hides the window in the system tray.
      * @ref https://w3c.github.io/webdriver/#dfn-minimize-window
      *
      */
    def minimizeWindow(): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The navigateTo (go) command is used to cause the user agent to navigate the current top-level browsing context a new location.
      * @ref https://w3c.github.io/webdriver/#dfn-navigate-to
      *
      */
    def navigateTo(url: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The New Session command creates a new WebDriver session with the endpoint node. If the creation fails, a session not created error is returned.
      * @ref https://w3c.github.io/webdriver/#dfn-new-sessions
      *
      */
    def newSession(capabilities: js.Object): SessionReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Perform Actions command is used to execute complex user actions. See [spec](https://github.com/jlipps/simple-wd-spec#perform-actions) for more details.
      * @ref https://w3c.github.io/webdriver/#dfn-perform-actions
      *
      */
    def performActions(actions: js.Array[js.Object]): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Print Page command renders the document to a paginated PDF document.
      * @ref https://w3c.github.io/webdriver/#print-page
      *
      */
    def printPage(
      orientation: js.UndefOr[String],
      scale: js.UndefOr[Double],
      background: js.UndefOr[Boolean],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      top: js.UndefOr[Double],
      bottom: js.UndefOr[Double],
      left: js.UndefOr[Double],
      right: js.UndefOr[Double],
      shrinkToFit: js.UndefOr[Boolean],
      pageRanges: js.UndefOr[js.Array[js.Object]]
    ): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Refresh command causes the browser to reload the page in current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-refresh
      *
      */
    def refresh(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Release Actions command is used to release all the keys and pointer buttons that are currently depressed. This causes events to be fired as if the state was released by an explicit series of actions. It also clears all the internal state of the virtual devices.
      * @ref https://w3c.github.io/webdriver/#dfn-release-actions
      *
      */
    def releaseActions(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Removes all Public Key Credential Sources stored on a Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-remove-all-credentials
      *
      */
    def removeAllCredentials(authenticatorId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Removes a Public Key Credential Source stored on a Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-remove-credential
      *
      */
    def removeCredential(authenticatorId: String, credentialId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Removes a previously created Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-remove-virtual-authenticator
      *
      */
    def removeVirtualAuthenticator(authenticatorId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Send Alert Text command sets the text field of a window.prompt user prompt to the given value.
      * @ref https://w3c.github.io/webdriver/#dfn-send-alert-text
      *
      */
    def sendAlertText(text: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Simulates user modification of a PermissionDescriptor's permission state. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/permissions/#set-permission-command
      *
      * @example
      * ```js
      * // set midi permissions
      * browser.setPermissions({
      *   name: 'midi',
      *   sysex; true
      * , 'granted'); // can be also 'denied' or 'prompt'
      * ```
      */
    def setPermissions(descriptor: js.Object, state: String): Unit = js.native
    def setPermissions(descriptor: js.Object, state: String, oneRealm: Boolean): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Simulates the changing of a time zone for the purposes of testing. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#create-mock-sensor-command
      *
      */
    def setTimeZone(timeZone: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Set Timeouts command sets timeout durations associated with the current session. The timeouts that can be controlled are listed in the table of session timeouts below.
      * @ref https://w3c.github.io/webdriver/#dfn-set-timeouts
      *
      */
    def setTimeouts(): Unit = js.native
    def setTimeouts(`implicit`: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Unit, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Unit, script: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Set User Verified extension command sets the isUserVerified property on the Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-set-user-verified
      *
      */
    def setUserVerified(authenticatorId: String, credentialId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Set Window Rect command alters the size and the position of the operating system window corresponding to the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-set-window-rect
      *
      */
    def setWindowRect(): RectReturn = js.native
    def setWindowRect(x: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Double, width: Double): RectReturn = js.native
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
      * Webdriver Protocol Command
      *
      * The Status command returns information about whether a remote end is in a state in which it can create new sessions and can additionally include arbitrary meta information that is specific to the implementation.
      * @ref https://w3c.github.io/webdriver/#dfn-status
      *
      */
    def status(): StatusReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Switch To Frame command is used to select the current top-level browsing context or a child browsing context of the current browsing context to use as the current browsing context for subsequent commands.
      * @ref https://w3c.github.io/webdriver/#dfn-switch-to-frame
      *
      */
    def switchToFrame(): Unit = js.native
    def switchToFrame(id: js.Object): Unit = js.native
    def switchToFrame(id: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Switch to Parent Frame command sets the current browsing context for future commands to the parent of the current browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-switch-to-parent-frame
      *
      */
    def switchToParentFrame(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Switch To Window command is used to select the current top-level browsing context for the current session, i.e. the one that will be used for processing commands.
      * @ref https://w3c.github.io/webdriver/#dfn-switch-to-window
      *
      */
    def switchToWindow(handle: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Take Element Screenshot command takes a screenshot of the visible region encompassed by the bounding rectangle of an element.
      * @ref https://w3c.github.io/webdriver/#dfn-take-element-screenshot
      *
      */
    def takeElementScreenshot(elementId: String): String = js.native
    def takeElementScreenshot(elementId: String, scroll: Boolean): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Take Screenshot command takes a screenshot of the top-level browsing context's viewport.
      * @ref https://w3c.github.io/webdriver/#dfn-take-screenshot
      *
      */
    def takeScreenshot(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Updates the mock sensor type. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#update-mock-sensor-reading-command
      *
      */
    def updateMockSensor(`type`: String, mockSensorType: String, maxSamplingFrequency: Double, minSamplingFrequency: Double): Unit = js.native
  }
}
