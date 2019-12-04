package typings.webdriverio.WebdriverIO

import typings.node.Buffer
import typings.std.RegExp
import typings.webdriver.WebDriver.RectReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var config: Config = js.native
  var options: RemoteOptions = js.native
  /**
    * The `$` command is a short way to call the [`findElement`](/docs/api/webdriver.html#findelement) command in order
    * to fetch a single element on the page. It returns an object that with an extended prototype to call
    * action commands without passing in a selector. However if you still pass in a selector it will look
    * for that element first and call the action on that element. You can also pass in an object as selector
    * where the object contains a property `element-6066-11e4-a52e-4f735466cecf` with the value of a reference
    * to an element. The command will then transform the reference to an extended WebdriverIO element.
    */
  @JSName("$")
  def $(selector: String): js.Promise[Element] = js.native
  @JSName("$")
  def $(selector: js.Function): js.Promise[Element] = js.native
  @JSName("$")
  def $(selector: js.Object): js.Promise[Element] = js.native
  /**
    * The `$$` command is a short way to call the [`findElements`](/docs/api/webdriver.html#findelements) command in order
    * to fetch multiple elements on the page. It returns an array with element results that will have an
    * extended prototype to call action commands without passing in a selector. However if you still pass
    * in a selector it will look for that element first and call the action on that element.
    */
  @JSName("$$")
  def $$(selector: String): js.Array[Element] = js.native
  @JSName("$$")
  def $$(selector: js.Function): js.Array[Element] = js.native
  /**
    * The `$$` command is a short way to call the [`findElements`](/docs/api/webdriver.html#findelements) command in order
    * to fetch multiple elements on the page. It returns an array with element results that will have an
    * extended prototype to call action commands without passing in a selector. However if you still pass
    * in a selector it will look for that element first and call the action on that element.
    */
  @JSName("$$")
  def $$_Promise(selector: String): js.Promise[js.Array[Element]] = js.native
  @JSName("$$")
  def $$_Promise(selector: js.Function): js.Promise[js.Array[Element]] = js.native
  /**
    * The `$` command is a short way to call the [`findElement`](/docs/api/webdriver.html#findelement) command in order
    * to fetch a single element on the page. It returns an object that with an extended prototype to call
    * action commands without passing in a selector. However if you still pass in a selector it will look
    * for that element first and call the action on that element. You can also pass in an object as selector
    * where the object contains a property `element-6066-11e4-a52e-4f735466cecf` with the value of a reference
    * to an element. The command will then transform the reference to an extended WebdriverIO element.
    */
  @JSName("$")
  def $_Element(selector: String): Element = js.native
  @JSName("$")
  def $_Element(selector: js.Function): Element = js.native
  @JSName("$")
  def $_Element(selector: js.Object): Element = js.native
  /**
    * add command to `browser` or `element` scope
    */
  def addCommand(name: String, func: js.Function): Unit = js.native
  def addCommand(name: String, func: js.Function, attachToElement: Boolean): Unit = js.native
  /**
    * execute any async action within your test spec
    */
  def call[T](callback: js.Function1[/* repeated */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * The `custom$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$")
  def custom$(strategyName: String, strategyArguments: js.Any): js.Promise[Element] = js.native
  /**
    * The `customs$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$$")
  def custom$$(strategyName: String, strategyArguments: js.Any): js.Promise[Element] = js.native
  /**
    * The `customs$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$$")
  def custom$$_Element(strategyName: String, strategyArguments: js.Any): Element = js.native
  /**
    * The `custom$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$")
  def custom$_Element(strategyName: String, strategyArguments: js.Any): Element = js.native
  /**
    * This command helps you to debug your integration tests. It stops the running browser and gives
    * you time to jump into it and check the state of your application (e.g. using dev tools).
    * Your terminal transforms into a [REPL](https://en.wikipedia.org/wiki/Read%E2%80%93eval%E2%80%93print_loop)
    * interface that will allow you to try out certain commands, find elements and test actions on
    * them.
    */
  def debug(): js.Promise[Unit] = js.native
  /**
    * This command helps you to debug your integration tests. It stops the running browser and gives
    * you time to jump into it and check the state of your application (e.g. using dev tools).
    * Your terminal transforms into a [REPL](https://en.wikipedia.org/wiki/Read%E2%80%93eval%E2%80%93print_loop)
    * interface that will allow you to try out certain commands, find elements and test actions on
    * them.
    */
  @JSName("debug")
  def debug_Unit(): Unit = js.native
  /**
    * Delete cookies visible to the current page. By providing a cookie name it just removes the single cookie or more when multiple names are passed.
    */
  def deleteCookies(): js.Promise[Unit] = js.native
  def deleteCookies(names: js.Array[String]): js.Promise[Unit] = js.native
  /**
    * Delete cookies visible to the current page. By providing a cookie name it just removes the single cookie or more when multiple names are passed.
    */
  @JSName("deleteCookies")
  def deleteCookies_Unit(): Unit = js.native
  @JSName("deleteCookies")
  def deleteCookies_Unit(names: js.Array[String]): Unit = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
    * The executed script is assumed to be synchronous and the result of evaluating the script is returned to
    * the client.
    */
  def execute[T](script: String, arguments: js.Any*): js.Promise[T] = js.native
  def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): js.Promise[T] = js.native
  // there is no way to add callback as last parameter after `...args`.
  // https://github.com/Microsoft/TypeScript/issues/1360
  // executeAsync: <T>(script: string | ((...arguments: any[], callback: (result: T) => void) => void), ...arguments: any[]) => Promise<T>;
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
    * The executed script is assumed to be asynchronous and must signal that is done by invoking
    * the provided callback, which is always provided as the final argument to the function. The value
    * to this callback will be returned to the client.
    */
  def executeAsync(script: String, arguments: js.Any*): js.Promise[_] = js.native
  def executeAsync(script: js.Function1[/* repeated */ js.Any, Unit], arguments: js.Any*): js.Promise[_] = js.native
  /**
    * Retrieve a [cookie](https://w3c.github.io/webdriver/webdriver-spec.html#cookies)
    */
  def getCookies(): js.Array[Cookie] = js.native
  def getCookies(names: js.Array[String]): js.Array[Cookie] = js.native
  /**
    * Retrieve a [cookie](https://w3c.github.io/webdriver/webdriver-spec.html#cookies)
    */
  @JSName("getCookies")
  def getCookies_Promise(): js.Promise[js.Array[Cookie]] = js.native
  @JSName("getCookies")
  def getCookies_Promise(names: js.Array[String]): js.Promise[js.Array[Cookie]] = js.native
  /**
    * Returns browser window size (and position for drivers with W3C support).
    */
  def getWindowSize(): js.Promise[RectReturn] = js.native
  /**
    * Returns browser window size (and position for drivers with W3C support).
    */
  @JSName("getWindowSize")
  def getWindowSize_RectReturn(): RectReturn = js.native
  /**
    * Send a sequence of key strokes to the active element. You can also use characters like
    * "Left arrow" or "Back space". WebdriverIO will take care of translating them into unicode
    * characters. You’ll find all supported characters [here](https://w3c.github.io/webdriver/webdriver-spec.html#keyboard-actions).
    * To do that, the value has to correspond to a key from the table.
    */
  def keys(value: String): js.Promise[Unit] = js.native
  def keys(value: js.Array[String]): js.Promise[Unit] = js.native
  /**
    * Send a sequence of key strokes to the active element. You can also use characters like
    * "Left arrow" or "Back space". WebdriverIO will take care of translating them into unicode
    * characters. You’ll find all supported characters [here](https://w3c.github.io/webdriver/webdriver-spec.html#keyboard-actions).
    * To do that, the value has to correspond to a key from the table.
    */
  @JSName("keys")
  def keys_Unit(value: String): Unit = js.native
  @JSName("keys")
  def keys_Unit(value: js.Array[String]): Unit = js.native
  /**
    * Open new window in browser. This command is the equivalent function to `window.open()`. This command does not
    * work in mobile environments.
    */
  def newWindow(url: String): js.Promise[String] = js.native
  def newWindow(url: String, windowName: String): js.Promise[String] = js.native
  def newWindow(url: String, windowName: String, windowFeatures: String): js.Promise[String] = js.native
  /**
    * Open new window in browser. This command is the equivalent function to `window.open()`. This command does not
    * work in mobile environments.
    */
  @JSName("newWindow")
  def newWindow_String(url: String): String = js.native
  @JSName("newWindow")
  def newWindow_String(url: String, windowName: String): String = js.native
  @JSName("newWindow")
  def newWindow_String(url: String, windowName: String, windowFeatures: String): String = js.native
  /**
    * overwrite `browser` or `element` command
    */
  def overwriteCommand(name: String, func: js.Function2[/* origCommand */ js.Function, /* repeated */ js.Any, _]): Unit = js.native
  def overwriteCommand(
    name: String,
    func: js.Function2[/* origCommand */ js.Function, /* repeated */ js.Any, _],
    attachToElement: Boolean
  ): Unit = js.native
  /**
    * Pauses execution for a specific amount of time. It is recommended to not use this command to wait for an
    * element to show up. In order to avoid flaky test results it is better to use commands like
    * [`waitForExist`](/docs/api/element/waitForExist.html) or other waitFor* commands.
    */
  def pause(milliseconds: Double): js.Promise[Unit] = js.native
  /**
    * Pauses execution for a specific amount of time. It is recommended to not use this command to wait for an
    * element to show up. In order to avoid flaky test results it is better to use commands like
    * [`waitForExist`](/docs/api/element/waitForExist.html) or other waitFor* commands.
    */
  @JSName("pause")
  def pause_Unit(milliseconds: Double): Unit = js.native
  /**
    * The `react$` command is a useful command to query React Components by their
    * actual name and filter them by props and state.
    */
  @JSName("react$")
  def react$(selector: String): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: String): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Array[_]): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Object): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Boolean): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Double): js.Promise[Element] = js.native
  /**
    * The `react$$` command is a useful command to query multiple React Components
    * by their actual name and filter them by props and state.
    */
  @JSName("react$$")
  def react$$(selector: String): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: String): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: js.Array[_]): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: js.Object): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: Boolean): js.Array[Element] = js.native
  @JSName("react$$")
  def react$$(selector: String, props: js.Object, state: Double): js.Array[Element] = js.native
  /**
    * The `react$$` command is a useful command to query multiple React Components
    * by their actual name and filter them by props and state.
    */
  @JSName("react$$")
  def react$$_Promise(selector: String): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: String): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: js.Array[_]): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: js.Object): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: Boolean): js.Promise[js.Array[Element]] = js.native
  @JSName("react$$")
  def react$$_Promise(selector: String, props: js.Object, state: Double): js.Promise[js.Array[Element]] = js.native
  /**
    * The `react$` command is a useful command to query React Components by their
    * actual name and filter them by props and state.
    */
  @JSName("react$")
  def react$_Element(selector: String): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: String): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: js.Array[_]): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: js.Object): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: Boolean): Element = js.native
  @JSName("react$")
  def react$_Element(selector: String, props: js.Object, state: Double): Element = js.native
  /**
    * Creates a new Selenium session with your current capabilities. This is useful if you
    * test highly stateful application where you need to clean the browser session between
    * the tests in your spec file to avoid creating hundreds of single test files with WDIO.
    * Be careful though, this command affects your test time tremendously since spawning
    * new Selenium sessions is very time consuming especially when using cloud services.
    */
  def reloadSession(): js.Promise[Unit] = js.native
  /**
    * Creates a new Selenium session with your current capabilities. This is useful if you
    * test highly stateful application where you need to clean the browser session between
    * the tests in your spec file to avoid creating hundreds of single test files with WDIO.
    * Be careful though, this command affects your test time tremendously since spawning
    * new Selenium sessions is very time consuming especially when using cloud services.
    */
  @JSName("reloadSession")
  def reloadSession_Unit(): Unit = js.native
  /**
    * Appium only. Save a video started by startRecordingScreen command to file.
    * See [Appium docs](http://appium.io/docs/en/commands/device/recording-screen/start-recording-screen/)
    */
  def saveRecordingScreen(filepath: String): Buffer = js.native
  /**
    * Appium only. Save a video started by startRecordingScreen command to file.
    * See [Appium docs](http://appium.io/docs/en/commands/device/recording-screen/start-recording-screen/)
    */
  @JSName("saveRecordingScreen")
  def saveRecordingScreen_Promise(filepath: String): js.Promise[Buffer] = js.native
  /**
    * Save a screenshot of the current browsing context to a PNG file on your OS. Be aware that
    * some browser drivers take screenshots of the whole document (e.g. Geckodriver with Firefox)
    * and others only of the current viewport (e.g. Chromedriver with Chrome).
    */
  def saveScreenshot(filepath: String): Buffer = js.native
  /**
    * Save a screenshot of the current browsing context to a PNG file on your OS. Be aware that
    * some browser drivers take screenshots of the whole document (e.g. Geckodriver with Firefox)
    * and others only of the current viewport (e.g. Chromedriver with Chrome).
    */
  @JSName("saveScreenshot")
  def saveScreenshot_Promise(filepath: String): js.Promise[Buffer] = js.native
  /**
    * Sets one or more [cookies](https://w3c.github.io/webdriver/#cookies) for the current page.
    */
  def setCookies(cookie: Cookie): js.Promise[Unit] = js.native
  /**
    * Sets one or more [cookies](https://w3c.github.io/webdriver/#cookies) for the current page.
    */
  @JSName("setCookies")
  def setCookies_Unit(cookie: Cookie): Unit = js.native
  /**
    * Sets the timeouts (implicit, pageLoad, script) associated with the current session.
    */
  def setTimeout(timeouts: Timeouts): js.Promise[Unit] = js.native
  /**
    * Sets the timeouts (implicit, pageLoad, script) associated with the current session.
    */
  @JSName("setTimeout")
  def setTimeout_Unit(timeouts: Timeouts): Unit = js.native
  /**
    * Resizes browser window outer size according to provided width and height.
    */
  def setWindowSize(width: Double, height: Double): Null | js.Object = js.native
  /**
    * Resizes browser window outer size according to provided width and height.
    */
  @JSName("setWindowSize")
  def setWindowSize_Promise(width: Double, height: Double): js.Promise[Null | js.Object] = js.native
  /**
    * Switch focus to a particular tab / window.
    */
  def switchWindow(urlOrTitleToMatch: String): js.Promise[Unit] = js.native
  def switchWindow(urlOrTitleToMatch: RegExp): js.Promise[Unit] = js.native
  /**
    * Switch focus to a particular tab / window.
    */
  @JSName("switchWindow")
  def switchWindow_Unit(urlOrTitleToMatch: String): Unit = js.native
  @JSName("switchWindow")
  def switchWindow_Unit(urlOrTitleToMatch: RegExp): Unit = js.native
  /**
    * [appium] The Touch Action API provides the basis of all gestures that can be automated in Appium.
    */
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
  /**
    * [appium] The Touch Action API provides the basis of all gestures that can be automated in Appium.
    */
  @JSName("touchAction")
  def touchAction_Unit(action: TouchActions): Unit = js.native
  /**
    * Uploads a file to the Selenium Standalone server or other browser driver
    * (e.g. Chromedriver) by using the [`file`](/api/protocol/file.html) command.
    * _Note:_ that this command is only supported if you use a Selenium Hub or
    * Chromedriver directly.
    */
  def uploadFile(localPath: String): js.Promise[String] = js.native
  /**
    * Uploads a file to the Selenium Standalone server or other browser driver
    * (e.g. Chromedriver) by using the [`file`](/api/protocol/file.html) command.
    * _Note:_ that this command is only supported if you use a Selenium Hub or
    * Chromedriver directly.
    */
  @JSName("uploadFile")
  def uploadFile_String(localPath: String): String = js.native
  /**
    * Protocol binding to load the URL of the browser. If a baseUrl is
    * specified in the config, it will be prepended to the url parameter using
    * node's url.resolve() method.
    */
  def url(): js.Promise[Unit] = js.native
  def url(url: String): js.Promise[Unit] = js.native
  /**
    * Protocol binding to load the URL of the browser. If a baseUrl is
    * specified in the config, it will be prepended to the url parameter using
    * node's url.resolve() method.
    */
  @JSName("url")
  def url_Unit(): Unit = js.native
  @JSName("url")
  def url_Unit(url: String): Unit = js.native
  /**
    * waits until the condition is fulfilled with a truthy value
    */
  def waitUntil(condition: js.Function0[js.Promise[Boolean]]): js.Promise[Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[Boolean]], timeout: Double): js.Promise[Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[Boolean]], timeout: Double, timeoutMsg: String): js.Promise[Boolean] = js.native
  def waitUntil(
    condition: js.Function0[js.Promise[Boolean]],
    timeout: Double,
    timeoutMsg: String,
    interval: Double
  ): js.Promise[Boolean] = js.native
}

