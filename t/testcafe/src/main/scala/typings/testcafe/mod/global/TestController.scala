package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLCollection
import typings.std.Node
import typings.std.NodeList
import typings.std.Record
import typings.testcafe.testcafeStrings.alert
import typings.testcafe.testcafeStrings.beforeunload
import typings.testcafe.testcafeStrings.confirm
import typings.testcafe.testcafeStrings.prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestController extends StObject {
  
  /**
    * Attaches the hooks during a test run.
    *
    * @param hooks - The set of RequestHook subclasses.
    */
  def addRequestHooks(hooks: js.Object*): TestControllerPromise[Any] = js.native
  
  /**
    * Returns an object that contains browser information.
    */
  val browser: Browser = js.native
  
  /**
    * Removes all file paths from the specified file upload input.
    *
    * @param selector - Identifies the input field that needs to be cleared.
    */
  def clearUpload(selector: String): TestControllerPromise[Any] = js.native
  def clearUpload(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def clearUpload(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def clearUpload(selector: Selector): TestControllerPromise[Any] = js.native
  def clearUpload(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  
  /**
    * Clicks a webpage element.
    *
    * @param selector - Identifies the webpage element being clicked.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def click(selector: String): TestControllerPromise[Any] = js.native
  def click(selector: String, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def click(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def click(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ClickActionOptions
  ): TestControllerPromise[Any] = js.native
  def click(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def click(selector: NodeSnapshot, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def click(selector: Selector): TestControllerPromise[Any] = js.native
  def click(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  def click(selector: SelectorPromise, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def click(selector: Selector, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Closes a browser window.
    *
    * @param windowDescriptor - The target window. If this parameter is omitted, the currently active window is selected.
    */
  def closeWindow(): TestControllerPromise[Any] = js.native
  def closeWindow(windowDescriptor: WindowDescriptor): TestControllerPromise[Any] = js.native
  
  /**
    * Dictionary that is shared between test hook functions and test code.
    */
  var ctx: StringDictionary[Any] = js.native
  
  /**
    * Pauses the test and switches to the step-by-step execution mode.
    */
  def debug(): TestControllerPromise[Any] = js.native
  
  /**
    * Deletes cookies with the specified parameters. If there are no parameters, this method empties the browser's cookie storage.
    *
    * @param cookies - Cookies.
    */
  def deleteCookies(): TestControllerPromise[Any] = js.native
  def deleteCookies(cookies: js.Array[CookieOptions | String]): TestControllerPromise[Any] = js.native
  def deleteCookies(cookies: CookieOptions): TestControllerPromise[Any] = js.native
  /**
    * Deletes cookies associated with the specified URLs. If there are no parameters, this method empties the browser's cookie storage.
    *
    * @param names - Cookie names.
    * @param urls - URLs.
    */
  def deleteCookies(names: String): TestControllerPromise[Any] = js.native
  def deleteCookies(names: String, urls: String): TestControllerPromise[Any] = js.native
  def deleteCookies(names: String, urls: js.Array[String]): TestControllerPromise[Any] = js.native
  def deleteCookies(names: js.Array[String], urls: String): TestControllerPromise[Any] = js.native
  def deleteCookies(names: js.Array[String], urls: js.Array[String]): TestControllerPromise[Any] = js.native
  
  /**
    * Dispatches an event over a specified webpage element.
    *
    * @param selector - Identifies the EventTarget element.
    * @param eventName - The name of the event to be dispatched on the DOM element..
    * @param options - The options which will be passed to EventConstructor.
    */
  def dispatchEvent(selector: String, eventName: String): TestControllerPromise[Any] = js.native
  def dispatchEvent(selector: String, eventName: String, options: js.Object): TestControllerPromise[Any] = js.native
  def dispatchEvent(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    eventName: String
  ): TestControllerPromise[Any] = js.native
  def dispatchEvent(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    eventName: String,
    options: js.Object
  ): TestControllerPromise[Any] = js.native
  def dispatchEvent(selector: NodeSnapshot, eventName: String): TestControllerPromise[Any] = js.native
  def dispatchEvent(selector: NodeSnapshot, eventName: String, options: js.Object): TestControllerPromise[Any] = js.native
  def dispatchEvent(selector: SelectorPromise, eventName: String): TestControllerPromise[Any] = js.native
  def dispatchEvent(selector: SelectorPromise, eventName: String, options: js.Object): TestControllerPromise[Any] = js.native
  def dispatchEvent(selector: Selector, eventName: String): TestControllerPromise[Any] = js.native
  def dispatchEvent(selector: Selector, eventName: String, options: js.Object): TestControllerPromise[Any] = js.native
  
  /**
    * Double-clicks a webpage element.
    *
    * @param selector - Identifies the webpage element being double-clicked.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def doubleClick(selector: String): TestControllerPromise[Any] = js.native
  def doubleClick(selector: String, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def doubleClick(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def doubleClick(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ClickActionOptions
  ): TestControllerPromise[Any] = js.native
  def doubleClick(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def doubleClick(selector: NodeSnapshot, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def doubleClick(selector: Selector): TestControllerPromise[Any] = js.native
  def doubleClick(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  def doubleClick(selector: SelectorPromise, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def doubleClick(selector: Selector, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Drags an element by an offset.
    *
    * @param selector - Identifies the webpage element being dragged
    * @param dragOffsetX - An X-offset of the drop coordinates from the mouse pointer's initial position.
    * @param dragOffsetY - An Y-offset of the drop coordinates from the mouse pointer's initial position.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def drag(selector: String, dragOffsetX: Double, dragOffsetY: Double): TestControllerPromise[Any] = js.native
  def drag(selector: String, dragOffsetX: Double, dragOffsetY: Double, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  def drag(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    dragOffsetX: Double,
    dragOffsetY: Double
  ): TestControllerPromise[Any] = js.native
  def drag(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    dragOffsetX: Double,
    dragOffsetY: Double,
    options: MouseActionOptions
  ): TestControllerPromise[Any] = js.native
  def drag(selector: NodeSnapshot, dragOffsetX: Double, dragOffsetY: Double): TestControllerPromise[Any] = js.native
  def drag(selector: NodeSnapshot, dragOffsetX: Double, dragOffsetY: Double, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  def drag(selector: SelectorPromise, dragOffsetX: Double, dragOffsetY: Double): TestControllerPromise[Any] = js.native
  def drag(selector: SelectorPromise, dragOffsetX: Double, dragOffsetY: Double, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  def drag(selector: Selector, dragOffsetX: Double, dragOffsetY: Double): TestControllerPromise[Any] = js.native
  def drag(selector: Selector, dragOffsetX: Double, dragOffsetY: Double, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Drags an element onto another one.
    *
    * @param selector - Identifies the webpage element being dragged.
    * @param destinationSelector - Identifies the webpage element that serves as the drop location.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def dragToElement(selector: String, destinationSelector: String): TestControllerPromise[Any] = js.native
  def dragToElement(selector: String, destinationSelector: String, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: String,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: String,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(selector: String, destinationSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def dragToElement(selector: String, destinationSelector: NodeSnapshot, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: String, destinationSelector: Selector): TestControllerPromise[Any] = js.native
  def dragToElement(selector: String, destinationSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def dragToElement(selector: String, destinationSelector: SelectorPromise, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: String, destinationSelector: Selector, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: String
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: String,
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: NodeSnapshot
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: NodeSnapshot,
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: Selector
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: SelectorPromise
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: SelectorPromise,
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    destinationSelector: Selector,
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: String): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: String, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: NodeSnapshot,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: NodeSnapshot,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: NodeSnapshot, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: Selector): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: SelectorPromise, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: NodeSnapshot, destinationSelector: Selector, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: String): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: String, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: SelectorPromise,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: SelectorPromise,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: NodeSnapshot, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: Selector): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: SelectorPromise, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: SelectorPromise, destinationSelector: Selector, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: String): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: String, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: Selector,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def dragToElement(
    selector: Selector,
    destinationSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: DragToElementOptions
  ): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: NodeSnapshot, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: Selector): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: SelectorPromise, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  def dragToElement(selector: Selector, destinationSelector: Selector, options: DragToElementOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Executes function on client and returns it's result.
    *
    * @param fn - A function to be executed on the client side.
    * @param options - Function options.
    */
  def eval(fn: js.Function): js.Promise[Any] = js.native
  def eval(fn: js.Function, options: ClientFunctionOptions): js.Promise[Any] = js.native
  
  /**
    * Starts an assertion chain and specifies assertion actual value.
    *
    * @param actual - An actual value of the assertion.
    */
  def expect[A](actual: A): Assertion[A] = js.native
  def expect[A](actual: js.Promise[A]): Assertion[A] = js.native
  
  /**
    * Dictionary that is shared between `fixture.before` and `fixture.after`, test hook functions and test code.
    */
  val fixtureCtx: StringDictionary[Any] = js.native
  
  /**
    * Returns an object that contains messages output to the browser console.
    */
  def getBrowserConsoleMessages(): js.Promise[BrowserConsoleMessages] = js.native
  
  /**
    * Returns cookies from the specified cookie objects. If there are no parameters, the method returns all the cookies.
    *
    * @param cookies - cookie objects.
    */
  def getCookies(): js.Promise[js.Array[CookieOptions]] = js.native
  def getCookies(cookies: js.Array[CookieOptions | String]): js.Promise[js.Array[CookieOptions]] = js.native
  def getCookies(cookies: CookieOptions): js.Promise[js.Array[CookieOptions]] = js.native
  /**
    * Returns cookies with the specified names and URLs.
    *
    * @param names - Cookie names.
    * @param urls - URLs.
    */
  def getCookies(names: String): js.Promise[js.Array[CookieOptions]] = js.native
  def getCookies(names: String, urls: String): js.Promise[js.Array[CookieOptions]] = js.native
  def getCookies(names: String, urls: js.Array[String]): js.Promise[js.Array[CookieOptions]] = js.native
  def getCookies(names: js.Array[String], urls: String): js.Promise[js.Array[CookieOptions]] = js.native
  def getCookies(names: js.Array[String], urls: js.Array[String]): js.Promise[js.Array[CookieOptions]] = js.native
  
  /**
    * Retrieves a `window` object that corresponds to the currently open window.
    */
  def getCurrentWindow(): WindowDescriptorPromise = js.native
  
  /**
    * Returns a stack of history entries (i.e., an array in which the latest dialog has an index of 0). Each entry
    * corresponds to a certain native dialog that appears in the main window or in an `<iframe>`.
    */
  def getNativeDialogHistory(): js.Promise[js.Array[NativeDialogHistoryItem]] = js.native
  
  /**
    * Hovers the mouse pointer over a webpage element.
    *
    * @param selector - Identifies the webpage element being hovered over.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def hover(selector: String): TestControllerPromise[Any] = js.native
  def hover(selector: String, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  def hover(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def hover(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: MouseActionOptions
  ): TestControllerPromise[Any] = js.native
  def hover(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def hover(selector: NodeSnapshot, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  def hover(selector: Selector): TestControllerPromise[Any] = js.native
  def hover(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  def hover(selector: SelectorPromise, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  def hover(selector: Selector, options: MouseActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Maximizes the browser window.
    */
  def maximizeWindow(): TestControllerPromise[Any] = js.native
  
  /**
    * Navigates to the specified URL.
    *
    * @param url - The URL to navigate to. Absolute or relative to the current page.
    * You can use the `file://` scheme or relative paths to navigate to a webpage in a local directory.
    */
  def navigateTo(url: String): TestControllerPromise[Any] = js.native
  
  /**
    * Opens a new browser window.
    *
    * @param url - The URL to open. Can be local or remote, absolute or relative.
    */
  def openWindow(url: String): WindowDescriptorPromise = js.native
  
  /**
    * Presses the specified keyboard keys.
    *
    * @param keys - The sequence of keys and key combinations to be pressed.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def pressKey(keys: String): TestControllerPromise[Any] = js.native
  def pressKey(keys: String, options: PressActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Detaches the hooks during a test run.
    *
    * @param hooks - The set of RequestHook subclasses.
    */
  def removeRequestHooks(hooks: js.Object*): TestControllerPromise[Any] = js.native
  
  /**
    * Request
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  /**
    * Execute a request
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def request(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def request(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
  /**
    * Execute a request
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  @JSName("request")
  var request_Original: Request = js.native
  
  /**
    * Sets the browser window size.
    *
    * @param width - The new width, in pixels.
    * @param height - The new height, in pixels.
    */
  def resizeWindow(width: Double, height: Double): TestControllerPromise[Any] = js.native
  
  /**
    * Fits the browser window into a particular device.
    *
    * @param deviceName - The name of the device as listed at https://github.com/DevExpress/device-specs/blob/master/viewport-sizes.json.
    * @param options - Provide additional information about the device.
    */
  def resizeWindowToFitDevice(deviceName: String): TestControllerPromise[Any] = js.native
  def resizeWindowToFitDevice(deviceName: String, options: ResizeToFitDeviceOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Right-clicks a webpage element.
    *
    * @param selector - Identifies the webpage element being right-clicked.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def rightClick(selector: String): TestControllerPromise[Any] = js.native
  def rightClick(selector: String, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def rightClick(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def rightClick(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ClickActionOptions
  ): TestControllerPromise[Any] = js.native
  def rightClick(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def rightClick(selector: NodeSnapshot, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def rightClick(selector: Selector): TestControllerPromise[Any] = js.native
  def rightClick(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  def rightClick(selector: SelectorPromise, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  def rightClick(selector: Selector, options: ClickActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Scrolls the document element to the { scrollLeft, scrollTop } position.
    *
    * @param scrollLeft - The position along the horizontal axis of the document.
    * @param scrollTop - The position along the vertical axis of the document.
    */
  def scroll(posX: Double, posY: Double): TestControllerPromise[Any] = js.native
  /**
    * Scrolls the document element to the predefined position.
    *
    * @param position - The position to scroll the document to. Valid values are topLeft, top, topRight, left, center, right, bottomLeft, bottom, bottomRight
    */
  def scroll(position: ScrollPosition): TestControllerPromise[Any] = js.native
  /**
    * Scrolls the specified element to the predefined position.
    *
    * @param selector - Identifies the webpage element being hovered over.
    * @param position - The position to scroll the document to. Valid values are topLeft, top, topRight, left, center, right, bottomLeft, bottom, bottomRight
    * @param options - A set of options that provide additional parameters for the action.
    */
  def scroll(selector: String, position: ScrollPosition): TestControllerPromise[Any] = js.native
  def scroll(selector: String, position: ScrollPosition, options: OffsetOptions): TestControllerPromise[Any] = js.native
  /**
    * Scrolls the specified element to the { scrollLeft, scrollTop } position.
    *
    * @param selector - Identifies the webpage element being hovered over.
    * @param scrollLeft - The position along the horizontal axis of the document.
    * @param scrollTop - The position along the vertical axis of the document.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def scroll(selector: String, scrollLeft: Double, scrollTop: Double): TestControllerPromise[Any] = js.native
  def scroll(selector: String, scrollLeft: Double, scrollTop: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scroll(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    position: ScrollPosition
  ): TestControllerPromise[Any] = js.native
  def scroll(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    position: ScrollPosition,
    options: OffsetOptions
  ): TestControllerPromise[Any] = js.native
  def scroll(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    scrollLeft: Double,
    scrollTop: Double
  ): TestControllerPromise[Any] = js.native
  def scroll(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    scrollLeft: Double,
    scrollTop: Double,
    options: OffsetOptions
  ): TestControllerPromise[Any] = js.native
  def scroll(selector: NodeSnapshot, position: ScrollPosition): TestControllerPromise[Any] = js.native
  def scroll(selector: NodeSnapshot, position: ScrollPosition, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scroll(selector: NodeSnapshot, scrollLeft: Double, scrollTop: Double): TestControllerPromise[Any] = js.native
  def scroll(selector: NodeSnapshot, scrollLeft: Double, scrollTop: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scroll(selector: SelectorPromise, position: ScrollPosition): TestControllerPromise[Any] = js.native
  def scroll(selector: SelectorPromise, position: ScrollPosition, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scroll(selector: SelectorPromise, scrollLeft: Double, scrollTop: Double): TestControllerPromise[Any] = js.native
  def scroll(selector: SelectorPromise, scrollLeft: Double, scrollTop: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scroll(selector: Selector, position: ScrollPosition): TestControllerPromise[Any] = js.native
  def scroll(selector: Selector, position: ScrollPosition, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scroll(selector: Selector, scrollLeft: Double, scrollTop: Double): TestControllerPromise[Any] = js.native
  def scroll(selector: Selector, scrollLeft: Double, scrollTop: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Scrolls the specified element by the given offset.
    * @param selector - Identifies the webpage element being hovered over.
    * @param scrollLeft - The horizontal pixel value that you want to scroll by.
    * @param scrollTop - The vertical pixel value that you want to scroll by.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def scrollBy(selector: String, x: Double, y: Double): TestControllerPromise[Any] = js.native
  def scrollBy(selector: String, x: Double, y: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scrollBy(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    x: Double,
    y: Double
  ): TestControllerPromise[Any] = js.native
  def scrollBy(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    x: Double,
    y: Double,
    options: OffsetOptions
  ): TestControllerPromise[Any] = js.native
  def scrollBy(selector: NodeSnapshot, x: Double, y: Double): TestControllerPromise[Any] = js.native
  def scrollBy(selector: NodeSnapshot, x: Double, y: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scrollBy(selector: SelectorPromise, x: Double, y: Double): TestControllerPromise[Any] = js.native
  def scrollBy(selector: SelectorPromise, x: Double, y: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scrollBy(selector: Selector, x: Double, y: Double): TestControllerPromise[Any] = js.native
  def scrollBy(selector: Selector, x: Double, y: Double, options: OffsetOptions): TestControllerPromise[Any] = js.native
  /**
    * Scrolls the document element by the given offset.
    *
    * @param scrollLeft - The horizontal pixel value that you want to scroll by.
    * @param scrollTop - The vertical pixel value that you want to scroll by.
    */
  def scrollBy(x: Double, y: Double): TestControllerPromise[Any] = js.native
  
  /**
    * Scrolls the specified element into view.
    * @param selector - Identifies the webpage element being hovered over.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def scrollIntoView(selector: String): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: String, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def scrollIntoView(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: OffsetOptions
  ): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: NodeSnapshot, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: Selector): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: SelectorPromise, options: OffsetOptions): TestControllerPromise[Any] = js.native
  def scrollIntoView(selector: Selector, options: OffsetOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Performs selection within editable content
    *
    * @param startSelector - Identifies a webpage element from which selection starts. The start position of selection is the first character of the element's text.
    * @param endSelector - Identifies a webpage element at which selection ends. The end position of selection is the last character of the element's text.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def selectEditableContent(startSelector: String, endSelector: String): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: String, endSelector: String, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: String,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: String,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: String, endSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: String, endSelector: NodeSnapshot, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: String, endSelector: Selector): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: String, endSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: String, endSelector: SelectorPromise, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: String, endSelector: Selector, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: String
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: String,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: NodeSnapshot
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: NodeSnapshot,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: Selector
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: SelectorPromise
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: SelectorPromise,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    endSelector: Selector,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: String): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: String, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: NodeSnapshot,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: NodeSnapshot,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: NodeSnapshot, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: Selector): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: SelectorPromise, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: NodeSnapshot, endSelector: Selector, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: String): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: String, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: SelectorPromise,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: SelectorPromise,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: NodeSnapshot, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: Selector): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: SelectorPromise, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: SelectorPromise, endSelector: Selector, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: String): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: String, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: Selector,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(
    startSelector: Selector,
    endSelector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: NodeSnapshot, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: Selector): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: SelectorPromise): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: SelectorPromise, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectEditableContent(startSelector: Selector, endSelector: Selector, options: ActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Selects text in input elements.
    *
    * @param selector - Identifies the webpage element whose text will be selected.
    * @param startPos - The start position of the selection. A zero-based integer.
    * @param endPos - The end position of the selection. A zero-based integer.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def selectText(selector: String): TestControllerPromise[Any] = js.native
  def selectText(selector: String, startPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: String, startPos: Double, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: String, startPos: Double, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: String, startPos: Double, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: String, startPos: Unit, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: String, startPos: Unit, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: String, startPos: Unit, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def selectText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    startPos: Double
  ): TestControllerPromise[Any] = js.native
  def selectText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    startPos: Double,
    endPos: Double
  ): TestControllerPromise[Any] = js.native
  def selectText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    startPos: Double,
    endPos: Double,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    startPos: Double,
    endPos: Unit,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    startPos: Unit,
    endPos: Double
  ): TestControllerPromise[Any] = js.native
  def selectText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    startPos: Unit,
    endPos: Double,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    startPos: Unit,
    endPos: Unit,
    options: ActionOptions
  ): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot, startPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot, startPos: Double, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot, startPos: Double, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot, startPos: Double, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot, startPos: Unit, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot, startPos: Unit, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: NodeSnapshot, startPos: Unit, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise, startPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise, startPos: Double, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise, startPos: Double, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise, startPos: Double, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise, startPos: Unit, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise, startPos: Unit, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: SelectorPromise, startPos: Unit, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector, startPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector, startPos: Double, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector, startPos: Double, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector, startPos: Double, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector, startPos: Unit, endPos: Double): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector, startPos: Unit, endPos: Double, options: ActionOptions): TestControllerPromise[Any] = js.native
  def selectText(selector: Selector, startPos: Unit, endPos: Unit, options: ActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Selects `<textarea>` content.
    *
    * @param selector
    * @param startLine
    * @param startPos
    * @param endLine
    * @param endPos
    * @param options
    */
  def selectTextAreaContent(
    selector: String | Selector | NodeSnapshot | SelectorPromise | (js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]),
    startLine: js.UndefOr[Double],
    startPos: js.UndefOr[Double],
    endLine: js.UndefOr[Double],
    endPos: js.UndefOr[Double],
    options: js.UndefOr[ActionOptions]
  ): TestControllerPromise[Any] = js.native
  
  /**
    * Creates cookies with the specified parameters.
    *
    * @param cookies - Cookie objects.
    */
  def setCookies(): TestControllerPromise[Any] = js.native
  def setCookies(cookies: js.Array[CookieOptions | (Record[String, String])]): TestControllerPromise[Any] = js.native
  def setCookies(cookies: CookieOptions): TestControllerPromise[Any] = js.native
  def setCookies(nameValueObjects: js.Array[Record[String, String]], url: String): TestControllerPromise[Any] = js.native
  /**
    * Assigns the specified URL to the specified cookie name-value pairs.
    *
    * @param nameValueObjects - Cookie name-value pairs (Objects).
    * @param url - Cookie URL.
    */
  def setCookies(nameValueObjects: Record[String, String]): TestControllerPromise[Any] = js.native
  def setCookies(nameValueObjects: Record[String, String], url: String): TestControllerPromise[Any] = js.native
  
  /**
    * Populates the specified file upload input with file paths.
    *
    * @param selector - Identifies the input field to which file paths are written.
    * @param filePath - The path to the uploaded file, or several such paths. Relative paths resolve from the folder with the test file.
    */
  def setFilesToUpload(selector: String, filePath: String): TestControllerPromise[Any] = js.native
  def setFilesToUpload(selector: String, filePath: js.Array[String]): TestControllerPromise[Any] = js.native
  def setFilesToUpload(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    filePath: String
  ): TestControllerPromise[Any] = js.native
  def setFilesToUpload(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    filePath: js.Array[String]
  ): TestControllerPromise[Any] = js.native
  def setFilesToUpload(selector: NodeSnapshot, filePath: String): TestControllerPromise[Any] = js.native
  def setFilesToUpload(selector: NodeSnapshot, filePath: js.Array[String]): TestControllerPromise[Any] = js.native
  def setFilesToUpload(selector: SelectorPromise, filePath: String): TestControllerPromise[Any] = js.native
  def setFilesToUpload(selector: SelectorPromise, filePath: js.Array[String]): TestControllerPromise[Any] = js.native
  def setFilesToUpload(selector: Selector, filePath: String): TestControllerPromise[Any] = js.native
  def setFilesToUpload(selector: Selector, filePath: js.Array[String]): TestControllerPromise[Any] = js.native
  
  /**
    * Specifies handler function for the browser native dialogs.
    *
    * @param fn - A regular or client function that will be triggered whenever a native dialog is invoked. null to
    * remove the native dialog handler.
    * @param fn `type` - The type of the native dialog.
    * @param fn `text` - Text of the dialog message.
    * @param fn `url` - The URL of the page that invoked the dialog. Use it to determine if the dialog originated from
    * the main window or an `<iframe>`.
    * @param options - Handler options.
    */
  def setNativeDialogHandler(): TestControllerPromise[Any] = js.native
  def setNativeDialogHandler(
    fn: js.Function3[
      /* type */ alert | confirm | beforeunload | prompt, 
      /* text */ String, 
      /* url */ String, 
      Any
    ]
  ): TestControllerPromise[Any] = js.native
  def setNativeDialogHandler(
    fn: js.Function3[
      /* type */ alert | confirm | beforeunload | prompt, 
      /* text */ String, 
      /* url */ String, 
      Any
    ],
    options: ClientFunctionOptions
  ): TestControllerPromise[Any] = js.native
  def setNativeDialogHandler(fn: Null, options: ClientFunctionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Specifies the amount of time within which TestCafe waits for the `window.load` event to fire before starting the test.
    *
    * @param duration - Specifies the amount of time within which TestCafe waits for the `window.load` event to fire before starting the test.
    */
  def setPageLoadTimeout(duration: Double): TestControllerPromise[Any] = js.native
  
  /**
    * Specifies the speed of test execution.
    *
    * @param speed - Specifies the test speed. Must be a number between 1 (the fastest) and 0.01 (the slowest).
    */
  def setTestSpeed(speed: Double): TestControllerPromise[Any] = js.native
  
  /**
    * Customize the behavior of the skipJsErrors method.
    *
    * @param options - Error skipping conditions: a Boolean flag, an Object with options, or a callback function that defines custom error skipping logic.
    */
  def skipJsErrors(): TestControllerPromise[Any] = js.native
  def skipJsErrors(options: Boolean): TestControllerPromise[Any] = js.native
  def skipJsErrors(options: SkipJsErrorsCallback): TestControllerPromise[Any] = js.native
  def skipJsErrors(options: SkipJsErrorsCallbackWithOptionsObject): TestControllerPromise[Any] = js.native
  def skipJsErrors(options: SkipJsErrorsOptionsObject): TestControllerPromise[Any] = js.native
  
  /**
    * Switches the test's browsing context to the specified `<iframe>`.
    *
    * @param selector - Identifies an `<iframe>` on the tested page.
    */
  def switchToIframe(selector: String): TestControllerPromise[Any] = js.native
  def switchToIframe(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def switchToIframe(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def switchToIframe(selector: Selector): TestControllerPromise[Any] = js.native
  def switchToIframe(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  
  /**
    * Switches the test's browsing context from an `<iframe>` back to the main window.
    */
  def switchToMainWindow(): TestControllerPromise[Any] = js.native
  
  /**
    * Activates the window that launched, or was active during the launch of, the currently active window.
    */
  def switchToParentWindow(): TestControllerPromise[Any] = js.native
  
  /**
    * Activates the most recent of the previously active windows.
    */
  def switchToPreviousWindow(): TestControllerPromise[Any] = js.native
  
  /**
    * Activates the first window that matches the criteria passed to the `filterFn` function
    *
    * @param filterFn - The predicate used to select windows.
    */
  def switchToWindow(filterFn: js.Function1[/* data */ WindowFilterData, Boolean]): TestControllerPromise[Any] = js.native
  /**
    * Activates the window that corresponds to the `window` object.
    *
    * @param windowDescriptor - The target window.
    */
  def switchToWindow(windowDescriptor: WindowDescriptor): TestControllerPromise[Any] = js.native
  
  /**
    * Takes a screenshot of the specified element.
    *
    * @param selector - Identifies the element for screenshot capturing.
    * @param path - relative path to the screenshot file. Resolved from the screenshot  directory specified by
    * using the `runner.screenshots` API method or the `screenshots-path` command line option.
    * If path doesn't have .png extension, it will be added automatically.
    */
  def takeElementScreenshot(selector: String): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: String, path: String): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: String, path: String, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: String, path: Unit, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    path: String
  ): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    path: String,
    options: TakeElementScreenshotOptions
  ): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    path: Unit,
    options: TakeElementScreenshotOptions
  ): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: NodeSnapshot): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: NodeSnapshot, path: String): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: NodeSnapshot, path: String, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: NodeSnapshot, path: Unit, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: Selector): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: SelectorPromise): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: SelectorPromise, path: String): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: SelectorPromise, path: String, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: SelectorPromise, path: Unit, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: Selector, path: String): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: Selector, path: String, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeElementScreenshot(selector: Selector, path: Unit, options: TakeElementScreenshotOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Takes a screenshot of the tested page.
    *
    * @param path - relative path to the screenshot file. Resolved from the screenshot directory specified by
    * using the `runner.screenshots` API method or the `screenshots-path` command line option.
    * If path doesn't have .png extension, it will be added automatically.
    */
  def takeScreenshot(): TestControllerPromise[Any] = js.native
  /**
    * Takes a screenshot of the tested page.
    *
    * @param options - TakeScreenshot Options
    */
  def takeScreenshot(options: TakeScreenshotOptions): TestControllerPromise[Any] = js.native
  def takeScreenshot(path: String): TestControllerPromise[Any] = js.native
  
  /**
    * Types the specified text into an input element.
    *
    * @param selector - Identifies the webpage element that will receive input focus.
    * @param text - The text to be typed into the specified webpage element.
    * @param options - A set of options that provide additional parameters for the action.
    */
  def typeText(selector: String, text: String): TestControllerPromise[Any] = js.native
  def typeText(selector: String, text: String, options: TypeActionOptions): TestControllerPromise[Any] = js.native
  def typeText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    text: String
  ): TestControllerPromise[Any] = js.native
  def typeText(
    selector: js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection],
    text: String,
    options: TypeActionOptions
  ): TestControllerPromise[Any] = js.native
  def typeText(selector: NodeSnapshot, text: String): TestControllerPromise[Any] = js.native
  def typeText(selector: NodeSnapshot, text: String, options: TypeActionOptions): TestControllerPromise[Any] = js.native
  def typeText(selector: SelectorPromise, text: String): TestControllerPromise[Any] = js.native
  def typeText(selector: SelectorPromise, text: String, options: TypeActionOptions): TestControllerPromise[Any] = js.native
  def typeText(selector: Selector, text: String): TestControllerPromise[Any] = js.native
  def typeText(selector: Selector, text: String, options: TypeActionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Switches user role.
    *
    * @param role - The role you need to use further in the test.
    */
  def useRole(role: Role): TestControllerPromise[Any] = js.native
  
  /**
    * Pauses a test for a specified period of time.
    *
    * @param timeout - The pause duration, in milliseconds.
    */
  def wait(timeout: Double): TestControllerPromise[Any] = js.native
}
