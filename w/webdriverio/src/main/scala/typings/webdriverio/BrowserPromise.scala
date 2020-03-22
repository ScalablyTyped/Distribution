package typings.webdriverio

import typings.node.Buffer
import typings.std.RegExp
import typings.webdriver.WebDriver.RectReturn
import typings.webdriverio.WebdriverIO.Cookie
import typings.webdriverio.WebdriverIO.Element
import typings.webdriverio.WebdriverIO.ElementArray
import typings.webdriverio.WebdriverIO.Timeouts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Browser commands that should be wrapper with Promise
/* Inlined std.Omit<webdriverio.WebdriverIO.Browser, 'addCommand' | 'overwriteCommand' | 'options' | 'config' | '$' | '$$' | 'touchAction'> */
@js.native
trait BrowserPromise extends js.Object {
  @JSName("addLocatorStrategy")
  var addLocatorStrategy_Original: js.Function2[
    /* name */ String, 
    /* func */ js.Function1[/* elementFetchingMethod */ js.Function1[/* selector */ String, _], Unit], 
    Unit
  ] = js.native
  @JSName("call")
  var call_Original: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, js.Promise[_]], js.Promise[_]] = js.native
  @JSName("custom$")
  var custom$_Original: js.Function2[/* strategyName */ String, /* strategyArguments */ js.Any, Element] = js.native
  @JSName("custom$$")
  var customDollarDollar_Original: js.Function2[/* strategyName */ String, /* strategyArguments */ js.Any, ElementArray] = js.native
  @JSName("debug")
  var debug_Original: js.Function0[Unit] = js.native
  @JSName("deleteCookies")
  var deleteCookies_Original: js.Function1[/* names */ js.UndefOr[js.Array[String]], Unit] = js.native
  @JSName("executeAsync")
  var executeAsync_Original: js.Function2[
    /* script */ String | (js.Function1[/* repeated */ js.Any, Unit]), 
    /* repeated */ js.Any, 
    js.Promise[_]
  ] = js.native
  @JSName("execute")
  var execute_Original: js.Function2[
    /* script */ String | (js.Function1[/* repeated */ js.Any, _]), 
    /* repeated */ js.Any, 
    js.Promise[_]
  ] = js.native
  @JSName("getCookies")
  var getCookies_Original: js.Function1[/* names */ js.UndefOr[js.Array[String]], js.Array[Cookie]] = js.native
  @JSName("getWindowSize")
  var getWindowSize_Original: js.Function0[RectReturn] = js.native
  @JSName("keys")
  var keys_Original: js.Function1[/* value */ String | js.Array[String], Unit] = js.native
  @JSName("newWindow")
  var newWindow_Original: js.Function3[
    /* url */ String, 
    /* windowName */ js.UndefOr[String], 
    /* windowFeatures */ js.UndefOr[String], 
    String
  ] = js.native
  @JSName("pause")
  var pause_Original: js.Function1[/* milliseconds */ Double, Unit] = js.native
  @JSName("react$")
  var react$_Original: js.Function3[
    /* selector */ String, 
    /* props */ js.UndefOr[js.Object], 
    /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
    Element
  ] = js.native
  @JSName("react$$")
  var reactDollarDollar_Original: js.Function3[
    /* selector */ String, 
    /* props */ js.UndefOr[js.Object], 
    /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
    ElementArray
  ] = js.native
  @JSName("reloadSession")
  var reloadSession_Original: js.Function0[Unit] = js.native
  @JSName("saveRecordingScreen")
  var saveRecordingScreen_Original: js.Function1[/* filepath */ String, Buffer] = js.native
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function1[/* filepath */ String, Buffer] = js.native
  @JSName("setCookies")
  var setCookies_Original: js.Function1[/* cookie */ Cookie, Unit] = js.native
  @JSName("setTimeout")
  var setTimeout_Original: js.Function1[/* timeouts */ Timeouts, Unit] = js.native
  @JSName("setWindowSize")
  var setWindowSize_Original: js.Function2[/* width */ Double, /* height */ Double, Null | js.Object] = js.native
  @JSName("switchWindow")
  var switchWindow_Original: js.Function1[/* urlOrTitleToMatch */ String | RegExp, Unit] = js.native
  @JSName("uploadFile")
  var uploadFile_Original: js.Function1[/* localPath */ String, String] = js.native
  @JSName("url")
  var url_Original: js.Function1[/* url */ js.UndefOr[String], Unit] = js.native
  @JSName("waitUntil")
  var waitUntil_Original: js.Function4[
    /* condition */ js.Function0[js.Promise[Boolean]], 
    /* timeout */ js.UndefOr[Double], 
    /* timeoutMsg */ js.UndefOr[String], 
    /* interval */ js.UndefOr[Double], 
    js.Promise[Boolean]
  ] = js.native
  def addLocatorStrategy(
    name: String,
    func: js.Function1[/* elementFetchingMethod */ js.Function1[/* selector */ String, _], Unit]
  ): Unit = js.native
  def call[T](callback: js.Function1[/* repeated */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
  @JSName("custom$")
  def custom$(strategyName: String, strategyArguments: js.Any): Element = js.native
  @JSName("custom$$")
  def customDollarDollar(strategyName: String, strategyArguments: js.Any): ElementArray = js.native
  def debug(): Unit = js.native
  def deleteCookies(): Unit = js.native
  def deleteCookies(names: js.Array[String]): Unit = js.native
  def execute[T](script: String, arguments: js.Any*): js.Promise[T] = js.native
  def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): js.Promise[T] = js.native
  def executeAsync(script: String, arguments: js.Any*): js.Promise[_] = js.native
  def executeAsync(script: js.Function1[/* repeated */ js.Any, Unit], arguments: js.Any*): js.Promise[_] = js.native
  def getCookies(): js.Array[Cookie] = js.native
  def getCookies(names: js.Array[String]): js.Array[Cookie] = js.native
  def getWindowSize(): RectReturn = js.native
  def keys(value: String): Unit = js.native
  def keys(value: js.Array[String]): Unit = js.native
  def newWindow(url: String): String = js.native
  def newWindow(url: String, windowName: String): String = js.native
  def newWindow(url: String, windowName: String, windowFeatures: String): String = js.native
  def pause(milliseconds: Double): Unit = js.native
  @JSName("react$")
  def react$(selector: String): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: String): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Array[_]): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Object): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Boolean): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Double): Element = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: String): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: js.Array[_]): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: js.Object): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: Boolean): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: Double): ElementArray = js.native
  def reloadSession(): Unit = js.native
  def saveRecordingScreen(filepath: String): Buffer = js.native
  def saveScreenshot(filepath: String): Buffer = js.native
  def setCookies(cookie: Cookie): Unit = js.native
  def setTimeout(timeouts: Timeouts): Unit = js.native
  def setWindowSize(width: Double, height: Double): Null | js.Object = js.native
  def switchWindow(urlOrTitleToMatch: String): Unit = js.native
  def switchWindow(urlOrTitleToMatch: RegExp): Unit = js.native
  def uploadFile(localPath: String): String = js.native
  def url(): Unit = js.native
  def url(url: String): Unit = js.native
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

