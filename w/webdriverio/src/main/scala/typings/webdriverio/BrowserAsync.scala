package typings.webdriverio

import typings.node.Buffer
import typings.std.Parameters
import typings.std.RegExp
import typings.std.ReturnType
import typings.webdriver.WebDriver.RectReturn
import typings.webdriverio.WebdriverIO.Cookie
import typings.webdriverio.WebdriverIO.Element
import typings.webdriverio.WebdriverIO.ElementArray
import typings.webdriverio.WebdriverIO.Timeouts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Browser commands wrapper with Promise
/* Inlined {[ K in keyof webdriverio.BrowserPromise ]: (args : std.Parameters<webdriverio.BrowserPromise[K]>): std.Promise<std.ReturnType<webdriverio.BrowserPromise[K]>>} & webdriverio.AsyncSelectors */
@js.native
trait BrowserAsync extends js.Object {
  @JSName("$")
  var $_Original: _empty = js.native
  @JSName("$$")
  var DollarDollar_Original: $ = js.native
  @JSName("addLocatorStrategy")
  var addLocatorStrategy_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* name */ String, 
        /* func */ js.Function1[/* elementFetchingMethod */ js.Function1[/* selector */ String, _], Unit], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* name */ String, 
          /* func */ js.Function1[/* elementFetchingMethod */ js.Function1[/* selector */ String, _], Unit], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("call")
  var call_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[/* callback */ js.Function1[/* repeated */ _, js.Promise[_]], js.Promise[_]]
    ], 
    js.Promise[
      ReturnType[
        js.Function1[/* callback */ js.Function1[/* repeated */ _, js.Promise[_]], js.Promise[_]]
      ]
    ]
  ] = js.native
  @JSName("custom$")
  var custom$_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]], 
    js.Promise[
      ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]]
    ]
  ] = js.native
  @JSName("custom$$")
  var customDollarDollar_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]], 
    js.Promise[
      ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]]
    ]
  ] = js.native
  @JSName("debug")
  var debug_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("deleteCookies")
  var deleteCookies_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* names */ js.UndefOr[js.Array[String]], Unit]], 
    js.Promise[ReturnType[js.Function1[/* names */ js.UndefOr[js.Array[String]], Unit]]]
  ] = js.native
  @JSName("executeAsync")
  var executeAsync_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String | (js.Function1[/* repeated */ _, Unit]), 
        /* repeated */ _, 
        js.Promise[_]
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String | (js.Function1[/* repeated */ _, Unit]), 
          /* repeated */ _, 
          js.Promise[_]
        ]
      ]
    ]
  ] = js.native
  @JSName("execute")
  var execute_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String | (js.Function1[/* repeated */ _, _]), 
        /* repeated */ _, 
        js.Promise[_]
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String | (js.Function1[/* repeated */ _, _]), 
          /* repeated */ _, 
          js.Promise[_]
        ]
      ]
    ]
  ] = js.native
  @JSName("getCookies")
  var getCookies_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* names */ js.UndefOr[js.Array[String]], js.Array[Cookie]]], 
    js.Promise[
      ReturnType[js.Function1[/* names */ js.UndefOr[js.Array[String]], js.Array[Cookie]]]
    ]
  ] = js.native
  @JSName("getWindowSize")
  var getWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ] = js.native
  @JSName("keys")
  var keys_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* value */ String | js.Array[String], Unit]], 
    js.Promise[ReturnType[js.Function1[/* value */ String | js.Array[String], Unit]]]
  ] = js.native
  @JSName("newWindow")
  var newWindow_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* url */ String, 
        /* windowName */ js.UndefOr[String], 
        /* windowFeatures */ js.UndefOr[String], 
        String
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* url */ String, 
          /* windowName */ js.UndefOr[String], 
          /* windowFeatures */ js.UndefOr[String], 
          String
        ]
      ]
    ]
  ] = js.native
  @JSName("pause")
  var pause_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* milliseconds */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* milliseconds */ Double, Unit]]]
  ] = js.native
  @JSName("react$")
  var react$_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        Element
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* selector */ String, 
          /* props */ js.UndefOr[js.Object], 
          /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
          Element
        ]
      ]
    ]
  ] = js.native
  @JSName("react$$")
  var reactDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        ElementArray
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* selector */ String, 
          /* props */ js.UndefOr[js.Object], 
          /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
          ElementArray
        ]
      ]
    ]
  ] = js.native
  @JSName("reloadSession")
  var reloadSession_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("saveRecordingScreen")
  var saveRecordingScreen_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* filepath */ String, Buffer]], 
    js.Promise[ReturnType[js.Function1[/* filepath */ String, Buffer]]]
  ] = js.native
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* filepath */ String, Buffer]], 
    js.Promise[ReturnType[js.Function1[/* filepath */ String, Buffer]]]
  ] = js.native
  @JSName("setCookies")
  var setCookies_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* cookie */ Cookie, Unit]], 
    js.Promise[ReturnType[js.Function1[/* cookie */ Cookie, Unit]]]
  ] = js.native
  @JSName("setTimeout")
  var setTimeout_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* timeouts */ Timeouts, Unit]], 
    js.Promise[ReturnType[js.Function1[/* timeouts */ Timeouts, Unit]]]
  ] = js.native
  @JSName("setWindowSize")
  var setWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Null | js.Object]], 
    js.Promise[
      ReturnType[js.Function2[/* width */ Double, /* height */ Double, Null | js.Object]]
    ]
  ] = js.native
  @JSName("switchWindow")
  var switchWindow_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* urlOrTitleToMatch */ String | RegExp, Unit]], 
    js.Promise[ReturnType[js.Function1[/* urlOrTitleToMatch */ String | RegExp, Unit]]]
  ] = js.native
  @JSName("uploadFile")
  var uploadFile_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* localPath */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* localPath */ String, String]]]
  ] = js.native
  @JSName("url")
  var url_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* url */ js.UndefOr[String], Unit]], 
    js.Promise[ReturnType[js.Function1[/* url */ js.UndefOr[String], Unit]]]
  ] = js.native
  @JSName("waitUntil")
  var waitUntil_Original: js.Function1[
    /* args */ Parameters[
      js.Function4[
        /* condition */ js.Function0[js.Promise[Boolean]], 
        /* timeout */ js.UndefOr[Double], 
        /* timeoutMsg */ js.UndefOr[String], 
        /* interval */ js.UndefOr[Double], 
        js.Promise[Boolean]
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function4[
          /* condition */ js.Function0[js.Promise[Boolean]], 
          /* timeout */ js.UndefOr[Double], 
          /* timeoutMsg */ js.UndefOr[String], 
          /* interval */ js.UndefOr[Double], 
          js.Promise[Boolean]
        ]
      ]
    ]
  ] = js.native
  @JSName("$")
  def $(selector: String): js.Promise[typings.webdriverio.WebdriverIOAsync.Element] = js.native
  @JSName("$")
  def $(selector: js.Function): js.Promise[typings.webdriverio.WebdriverIOAsync.Element] = js.native
  @JSName("$$")
  def DollarDollar(selector: String): js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray] = js.native
  @JSName("$$")
  def DollarDollar(selector: js.Function): js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray] = js.native
  def addLocatorStrategy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* name */ String, 
        /* func */ js.Function1[/* elementFetchingMethod */ js.Function1[/* selector */ String, _], Unit], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* name */ String, 
        /* func */ js.Function1[/* elementFetchingMethod */ js.Function1[/* selector */ String, _], Unit], 
        Unit
      ]
    ]
  ] = js.native
  def call(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function1[/* callback */ js.Function1[/* repeated */ _, js.Promise[_]], js.Promise[_]]
    ]
  ): js.Promise[
    ReturnType[
      js.Function1[/* callback */ js.Function1[/* repeated */ _, js.Promise[_]], js.Promise[_]]
    ]
  ] = js.native
  @JSName("custom$")
  def custom$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]]
  ): js.Promise[
    ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]]
  ] = js.native
  @JSName("custom$$")
  def customDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]]
  ): js.Promise[
    ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]]
  ] = js.native
  def debug(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def deleteCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* names */ js.UndefOr[js.Array[String]], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* names */ js.UndefOr[js.Array[String]], Unit]]] = js.native
  def execute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String | (js.Function1[/* repeated */ _, _]), 
        /* repeated */ _, 
        js.Promise[_]
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* script */ String | (js.Function1[/* repeated */ _, _]), 
        /* repeated */ _, 
        js.Promise[_]
      ]
    ]
  ] = js.native
  def executeAsync(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String | (js.Function1[/* repeated */ _, Unit]), 
        /* repeated */ _, 
        js.Promise[_]
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* script */ String | (js.Function1[/* repeated */ _, Unit]), 
        /* repeated */ _, 
        js.Promise[_]
      ]
    ]
  ] = js.native
  def getCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* names */ js.UndefOr[js.Array[String]], js.Array[Cookie]]]
  ): js.Promise[
    ReturnType[js.Function1[/* names */ js.UndefOr[js.Array[String]], js.Array[Cookie]]]
  ] = js.native
  def getWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]] = js.native
  def keys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* value */ String | js.Array[String], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* value */ String | js.Array[String], Unit]]] = js.native
  def newWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* url */ String, 
        /* windowName */ js.UndefOr[String], 
        /* windowFeatures */ js.UndefOr[String], 
        String
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* url */ String, 
        /* windowName */ js.UndefOr[String], 
        /* windowFeatures */ js.UndefOr[String], 
        String
      ]
    ]
  ] = js.native
  def pause(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* milliseconds */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* milliseconds */ Double, Unit]]] = js.native
  @JSName("react$")
  def react$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        Element
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        Element
      ]
    ]
  ] = js.native
  @JSName("react$$")
  def reactDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        ElementArray
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        ElementArray
      ]
    ]
  ] = js.native
  def reloadSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def saveRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* filepath */ String, Buffer]]
  ): js.Promise[ReturnType[js.Function1[/* filepath */ String, Buffer]]] = js.native
  def saveScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* filepath */ String, Buffer]]
  ): js.Promise[ReturnType[js.Function1[/* filepath */ String, Buffer]]] = js.native
  def setCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* cookie */ Cookie, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* cookie */ Cookie, Unit]]] = js.native
  def setTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* timeouts */ Timeouts, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* timeouts */ Timeouts, Unit]]] = js.native
  def setWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function2[/* width */ Double, /* height */ Double, Null | js.Object]]
  ): js.Promise[
    ReturnType[js.Function2[/* width */ Double, /* height */ Double, Null | js.Object]]
  ] = js.native
  def switchWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* urlOrTitleToMatch */ String | RegExp, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* urlOrTitleToMatch */ String | RegExp, Unit]]] = js.native
  def uploadFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* localPath */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* localPath */ String, String]]] = js.native
  def url(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[js.Function1[/* url */ js.UndefOr[String], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* url */ js.UndefOr[String], Unit]]] = js.native
  def waitUntil(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserPromise[K]> is not an array type */ args: Parameters[
      js.Function4[
        /* condition */ js.Function0[js.Promise[Boolean]], 
        /* timeout */ js.UndefOr[Double], 
        /* timeoutMsg */ js.UndefOr[String], 
        /* interval */ js.UndefOr[Double], 
        js.Promise[Boolean]
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function4[
        /* condition */ js.Function0[js.Promise[Boolean]], 
        /* timeout */ js.UndefOr[Double], 
        /* timeoutMsg */ js.UndefOr[String], 
        /* interval */ js.UndefOr[Double], 
        js.Promise[Boolean]
      ]
    ]
  ] = js.native
}

