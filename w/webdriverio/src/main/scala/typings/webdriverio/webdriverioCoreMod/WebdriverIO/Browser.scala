package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.node.Buffer
import typings.std.RegExp
import typings.webdriver.WebDriver.BaseClient
import typings.webdriver.WebDriver.Cookie
import typings.webdriver.WebDriver.RectReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends BaseClient {
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
  def DollarDollar(selector: String): js.Promise[ElementArray] = js.native
  @JSName("$$")
  def DollarDollar(selector: js.Function): js.Promise[ElementArray] = js.native
  /**
    * add command to `browser` or `element` scope
    */
  def addCommand(name: String, func: js.Function): Unit = js.native
  def addCommand(name: String, func: js.Function, attachToElement: Boolean): Unit = js.native
  /**
    * create custom selector
    */
  def addLocatorStrategy(
    name: String,
    func: js.Function1[/* elementFetchingMethod */ js.Function1[/* selector */ String, _], Unit]
  ): Unit = js.native
  /**
    * The `custom$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$")
  def custom$(strategyName: String, strategyArguments: js.Any): js.Promise[Element] = js.native
  /**
    * The `customs$$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    */
  @JSName("custom$$")
  def customDollarDollar(strategyName: String, strategyArguments: js.Any): js.Promise[ElementArray] = js.native
  /**
    * This command helps you to debug your integration tests. It stops the running browser and gives
    * you time to jump into it and check the state of your application (e.g. using dev tools).
    * Your terminal transforms into a [REPL](https://en.wikipedia.org/wiki/Read%E2%80%93eval%E2%80%93print_loop)
    * interface that will allow you to try out certain commands, find elements and test actions on
    * them.
    */
  def debug(): js.Promise[Unit] = js.native
  /**
    * Delete cookies visible to the current page. By providing a cookie name it just removes the single cookie or more when multiple names are passed.
    */
  def deleteCookies(): js.Promise[Unit] = js.native
  def deleteCookies(names: String): js.Promise[Unit] = js.native
  def deleteCookies(names: js.Array[String]): js.Promise[Unit] = js.native
  /**
    * Retrieve a [cookie](https://w3c.github.io/webdriver/webdriver-spec.html#cookies)
    * visible to the current page. You can query a specific cookie by providing the cookie name or
    * retrieve all.
    */
  def getCookies(): js.Promise[js.Array[Cookie]] = js.native
  def getCookies(names: String): js.Promise[js.Array[Cookie]] = js.native
  def getCookies(names: js.Array[String]): js.Promise[js.Array[Cookie]] = js.native
  /**
    * Returns browser window size (and position for drivers with W3C support).
    */
  def getWindowSize(): js.Promise[RectReturn] = js.native
  /**
    * Send a sequence of key strokes to the active element. You can also use characters like
    * "Left arrow" or "Back space". WebdriverIO will take care of translating them into unicode
    * characters. You’ll find all supported characters [here](https://w3c.github.io/webdriver/webdriver-spec.html#keyboard-actions).
    * To do that, the value has to correspond to a key from the table.
    */
  def keys(value: String): js.Promise[Unit] = js.native
  def keys(value: js.Array[String]): js.Promise[Unit] = js.native
  /**
    * > This is a __beta__ feature. Please give us feedback and file [an issue](https://github.com/webdriverio/webdriverio/issues/new/choose) if certain scenarions don't work as expected!
    */
  def mock(url: String): js.Promise[Mock] = js.native
  def mock(url: String, filterOptions: MockFilterOptions): js.Promise[Mock] = js.native
  /**
    * Open new window in browser. This command is the equivalent function to `window.open()`. This command does not
    * work in mobile environments.
    */
  def newWindow(url: String): js.Promise[String] = js.native
  def newWindow(url: String, options: NewWindowOptions): js.Promise[String] = js.native
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
    * The `react$` command is a useful command to query React Components by their
    * actual name and filter them by props and state.
    */
  @JSName("react$")
  def react$(selector: String): js.Promise[Element] = js.native
  @JSName("react$")
  def react$(selector: String, options: ReactSelectorOptions): js.Promise[Element] = js.native
  /**
    * The `react$$` command is a useful command to query multiple React Components
    * by their actual name and filter them by props and state.
    */
  @JSName("react$$")
  def reactDollarDollar(selector: String): js.Promise[ElementArray] = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, options: ReactSelectorOptions): js.Promise[ElementArray] = js.native
  /**
    * Creates a new Selenium session with your current capabilities. This is useful if you
    * test highly stateful application where you need to clean the browser session between
    * the tests in your spec file to avoid creating hundreds of single test files with WDIO.
    * Be careful though, this command affects your test time tremendously since spawning
    * new Selenium sessions is very time consuming especially when using cloud services.
    */
  def reloadSession(): js.Promise[Unit] = js.native
  /**
    * Appium only. Save a video started by startRecordingScreen command to file.
    * See [Appium docs](http://appium.io/docs/en/commands/device/recording-screen/start-recording-screen/)
    */
  def saveRecordingScreen(filepath: String): js.Promise[Buffer] = js.native
  /**
    * Save a screenshot of the current browsing context to a PNG file on your OS. Be aware that
    * some browser drivers take screenshots of the whole document (e.g. Geckodriver with Firefox)
    * and others only of the current viewport (e.g. Chromedriver with Chrome).
    */
  def saveScreenshot(filepath: String): js.Promise[Buffer] = js.native
  /**
    * Sets one or more [cookies](https://w3c.github.io/webdriver/#cookies) for the current page. Make sure you are
    * on the page that should receive the cookie. You can't set a cookie for an arbitrary page without
    * being on that page.
    */
  def setCookies(cookie: js.Array[Cookie]): js.Promise[Unit] = js.native
  def setCookies(cookie: Cookie): js.Promise[Unit] = js.native
  /**
    * Sets the timeouts associated with the current session, timeout durations control such
    * behaviour as timeouts on script injection, document navigation, and element retrieval.
    * For more information and examples, see [timeouts guide](https://webdriver.io/docs/timeouts.html#selenium-timeouts).
    */
  def setTimeout(timeouts: Timeouts): js.Promise[Unit] = js.native
  /**
    * Resizes browser window outer size according to provided width and height.
    */
  def setWindowSize(width: Double, height: Double): js.Promise[Null | js.Object] = js.native
  /**
    * Switch focus to a particular tab / window.
    */
  def switchWindow(urlOrTitleToMatch: String): js.Promise[Unit] = js.native
  def switchWindow(urlOrTitleToMatch: RegExp): js.Promise[Unit] = js.native
  /**
    * Throttle the network capabilities of the browser. This can help to
    * emulate certain scenarios where a user looses the internet connection
    * and your app needs to address that.
    */
  def throttle(params: ThrottleOptions): js.Promise[Unit] = js.native
  /**
    * The Touch Action API provides the basis of all gestures that can be automated in Appium.
    * It is currently only available to native apps and can not be used to interact with webapps.
    * At its core is the ability to chain together _ad hoc_ individual actions, which will then be
    * applied to an element in the application on the device. The basic actions that can be used are:
    */
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
  /**
    * Uploads a file to the Selenium Standalone server or other browser driver
    * (e.g. Chromedriver) by using the [`file`](docs/api/selenium.html#file) command.
    * _Note:_ that this command is only supported if you use a Selenium Hub or
    * Chromedriver directly.
    */
  def uploadFile(localPath: String): js.Promise[String] = js.native
  /**
    * Protocol binding to load the URL of the browser. If a baseUrl is
    * specified in the config, it will be prepended to the url parameter using
    * node's url.resolve() method.
    */
  def url(): js.Promise[Unit] = js.native
  def url(url: String): js.Promise[Unit] = js.native
  /**
    * This wait command is your universal weapon if you want to wait on something. It expects a condition
    * and waits until that condition is fulfilled with a truthy value. If you use the WDIO testrunner the
    * commands within the condition are getting executed synchronously like in your test.
    */
  def waitUntil(condition: js.Function0[js.Promise[Boolean]]): js.Promise[Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[Boolean]], options: WaitUntilOptions): js.Promise[Boolean] = js.native
}

