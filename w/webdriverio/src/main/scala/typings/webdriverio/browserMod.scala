package typings.webdriverio

import typings.node.Buffer
import typings.std.RegExp
import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.devtoolsMod.default
import typings.webdriverio.typesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("webdriverio/build/commands/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriverio/build/commands/browser", "$$")
  @js.native
  val $: js.ThisFunction1[/* this */ BrowserObject, /* selector */ String, js.Promise[js.Array[js.Object]]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "$")
  @js.native
  val _empty: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* selector */ String | ElementReference, 
    js.Promise[js.Any]
  ] = js.native
  
  @scala.inline
  def call[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("webdriverio/build/commands/browser", "custom$")
  @js.native
  val custom: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* strategyName */ String, 
    /* repeated */ js.Any, 
    js.Promise[js.Any]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "custom$$")
  @js.native
  val custom$: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* strategyName */ String, 
    /* repeated */ js.Any, 
    js.Promise[js.Array[js.Object]]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "debug")
  @js.native
  val debug: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* commandTimeout */ js.UndefOr[Double], 
    js.Promise[js.Any]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "deleteCookies")
  @js.native
  val deleteCookies: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* names */ js.UndefOr[String | js.Array[String]], 
    js.Promise[js.Array[Unit] | Unit]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "execute")
  @js.native
  val execute: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* script */ String | js.Function, 
    /* repeated */ js.Any, 
    js.Promise[js.Any]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "executeAsync")
  @js.native
  val executeAsync: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* script */ String | js.Function, 
    /* repeated */ js.Any, 
    js.Promise[js.Any]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "getCookies")
  @js.native
  val getCookies: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* names */ js.UndefOr[String | js.Array[String]], 
    js.Promise[js.Array[js.Object]]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "getPuppeteer")
  @js.native
  val getPuppeteer: js.ThisFunction0[/* this */ BrowserObject, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "getWindowSize")
  @js.native
  val getWindowSize: js.ThisFunction0[/* this */ BrowserObject, js.Any] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "keys")
  @js.native
  val keys: js.ThisFunction1[/* this */ BrowserObject, /* value */ String | js.Array[String], js.Promise[Unit]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "mock")
  @js.native
  val mock: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* url */ String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockFilterOptions */ /* filterOptions */ js.Any, 
    js.Promise[default | typings.webdriverio.webdriverMod.default]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "newWindow")
  @js.native
  val newWindow: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* url */ String, 
    /* hasWindowNameWindowFeatures */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.NewWindowOptions */ js.Any
    ], 
    js.Promise[String]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "pause")
  @js.native
  val pause: js.ThisFunction1[/* this */ BrowserObject, /* milliseconds */ js.UndefOr[Double], js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "react$")
  @js.native
  val react: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* selector */ String, 
    /* hasPropsState */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ReactSelectorOptions */ js.Any
    ], 
    js.Promise[js.Any]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "react$$")
  @js.native
  val react$: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* selector */ String, 
    /* hasPropsState */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ReactSelectorOptions */ js.Any
    ], 
    js.Promise[js.Array[js.Object]]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "reloadSession")
  @js.native
  val reloadSession: js.ThisFunction0[/* this */ BrowserObject, js.Promise[String]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "savePDF")
  @js.native
  val savePDF: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* filepath */ String, 
    /* options */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.PDFPrintOptions */ js.Any
    ], 
    js.Promise[Buffer]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "saveRecordingScreen")
  @js.native
  val saveRecordingScreen: js.ThisFunction1[/* this */ BrowserObject, /* filepath */ String, js.Promise[Buffer]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "saveScreenshot")
  @js.native
  val saveScreenshot: js.ThisFunction1[/* this */ BrowserObject, /* filepath */ String, js.Promise[Buffer]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "setCookies")
  @js.native
  val setCookies: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* cookieObjs */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Cookie */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Cookie */ js.Any
    ]), 
    js.Promise[js.Array[Unit]]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "setTimeout")
  @js.native
  val setTimeout: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Timeouts */ /* timeouts */ js.Any, 
    js.Promise[js.Any]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "setWindowSize")
  @js.native
  val setWindowSize: js.ThisFunction2[/* this */ BrowserObject, /* width */ Double, /* height */ Double, js.Any] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "switchWindow")
  @js.native
  val switchWindow: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* urlOrTitleToMatch */ String | RegExp, 
    js.Promise[String]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "throttle")
  @js.native
  val throttle: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ThrottleOptions */ /* params */ js.Any, 
    js.Promise[Null]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "touchAction")
  @js.native
  val touchAction: js.ThisFunction1[
    /* this */ BrowserObject, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.TouchAction */ /* repeated */ js.Any, 
    js.Any
  ] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "uploadFile")
  @js.native
  val uploadFile: js.ThisFunction1[/* this */ BrowserObject, /* localPath */ String, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "url")
  @js.native
  val url: js.ThisFunction1[/* this */ BrowserObject, /* path */ String, js.Promise[Unit]] = js.native
  
  @JSImport("webdriverio/build/commands/browser", "waitUntil")
  @js.native
  val waitUntil: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* condition */ js.Function0[Boolean | js.Promise[Boolean]], 
    /* hasTimeoutIntervalTimeoutMsg */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.WaitUntilOptions */ js.Any
    ], 
    js.Any
  ] = js.native
}
