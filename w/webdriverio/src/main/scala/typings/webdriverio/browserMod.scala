package typings.webdriverio

import typings.node.bufferMod.global.Buffer
import typings.std.Element
import typings.wdioProtocols.typesMod.Cookie
import typings.wdioProtocols.typesMod.ElementReference
import typings.webdriverio.anon.Fn0
import typings.webdriverio.anon.FnCall
import typings.webdriverio.anon.FnCallThisScriptArgs
import typings.webdriverio.anon.PartialTimeouts
import typings.webdriverio.anon.PartialWaitUntilOptions
import typings.webdriverio.getWindowSizeMod.BrowserSize
import typings.webdriverio.interceptionTypesMod.MockFilterOptions
import typings.webdriverio.interceptionTypesMod.ThrottleOptions
import typings.webdriverio.savePDFMod.PDFPrintOptions
import typings.webdriverio.typesMod.ElementArray
import typings.webdriverio.typesMod.Mock
import typings.webdriverio.typesMod.NewWindowOptions
import typings.webdriverio.typesMod.ReactSelectorOptions
import typings.webdriverio.typesMod.Selector
import typings.webdriverio.typesMod.TouchActions
import typings.webdriverio.webdriverioBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  object default {
    
    @JSImport("webdriverio/build/commands/browser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriverio/build/commands/browser", "default.$$")
    @js.native
    def $: js.ThisFunction1[
        /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
        /* selector */ Selector | (js.Array[Element | ElementReference]), 
        js.Promise[ElementArray]
      ] = js.native
    
    inline def $(selector: js.Array[Element | ElementReference]): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
    inline def $(selector: Selector): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
    inline def $_=(
      x: js.ThisFunction1[
          /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
          /* selector */ Selector | (js.Array[Element | ElementReference]), 
          js.Promise[ElementArray]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$")(x.asInstanceOf[js.Any])
    @JSImport("webdriverio/build/commands/browser", "default.$")
    @js.native
    def _empty: js.ThisFunction1[
        /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
        /* selector */ Selector, 
        js.Promise[Element]
      ] = js.native
    
    inline def _empty(selector: Selector): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
    inline def _empty_=(
      x: js.ThisFunction1[
          /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
          /* selector */ Selector, 
          js.Promise[Element]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.call")
    @js.native
    def call: FnCall = js.native
    inline def call[T](fn: js.Function0[T]): T | js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any]).asInstanceOf[T | js.Promise[T]]
    inline def call_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("call")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.custom$")
    @js.native
    def custom: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* strategyName */ String, 
        /* repeated */ Any, 
        js.Promise[Element]
      ] = js.native
    
    inline def custom(strategyName: String, strategyArguments: Any*): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("custom$")(scala.List(strategyName.asInstanceOf[js.Any]).`++`(strategyArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[Element]]
    
    @JSImport("webdriverio/build/commands/browser", "default.custom$$")
    @js.native
    def custom$: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* strategyName */ String, 
        /* repeated */ Any, 
        js.Promise[ElementArray]
      ] = js.native
    
    inline def custom$(strategyName: String, strategyArguments: Any*): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("custom$$")(scala.List(strategyName.asInstanceOf[js.Any]).`++`(strategyArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[ElementArray]]
    inline def custom$_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* strategyName */ String, 
          /* repeated */ Any, 
          js.Promise[ElementArray]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom$$")(x.asInstanceOf[js.Any])
    
    inline def custom_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* strategyName */ String, 
          /* repeated */ Any, 
          js.Promise[Element]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom$")(x.asInstanceOf[js.Any])
    
    inline def debug(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[js.Promise[Any]]
    inline def debug(commandTimeout: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(commandTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    @JSImport("webdriverio/build/commands/browser", "default.debug")
    @js.native
    def debug_Fdefault: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* commandTimeout */ js.UndefOr[Double], 
        js.Promise[Any]
      ] = js.native
    
    inline def debug_Fdefault_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* commandTimeout */ js.UndefOr[Double], 
          js.Promise[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    inline def deleteCookies(): js.Promise[js.Array[Unit] | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookies")().asInstanceOf[js.Promise[js.Array[Unit] | Unit]]
    inline def deleteCookies(names: String): js.Promise[js.Array[Unit] | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookies")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit] | Unit]]
    inline def deleteCookies(names: js.Array[String]): js.Promise[js.Array[Unit] | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookies")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit] | Unit]]
    @JSImport("webdriverio/build/commands/browser", "default.deleteCookies")
    @js.native
    def deleteCookies_Fdefault: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* names */ js.UndefOr[String | js.Array[String]], 
        js.Promise[js.Array[Unit] | Unit]
      ] = js.native
    
    inline def deleteCookies_Fdefault_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* names */ js.UndefOr[String | js.Array[String]], 
          js.Promise[js.Array[Unit] | Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleteCookies")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.execute")
    @js.native
    def execute: FnCallThisScriptArgs = js.native
    inline def execute[ReturnValue, InnerArguments /* <: js.Array[Any] */](
      script: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
    ): js.Promise[ReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue]]
    inline def execute[ReturnValue, InnerArguments /* <: js.Array[Any] */](
      script: js.Function1[/* innerArgs */ InnerArguments, ReturnValue],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
    ): js.Promise[ReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue]]
    
    @JSImport("webdriverio/build/commands/browser", "default.executeAsync")
    @js.native
    def executeAsync: Fn0 = js.native
    inline def executeAsync[ReturnValue, InnerArguments /* <: js.Array[Any] */](
      script: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
    ): js.Promise[ReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue]]
    inline def executeAsync[ReturnValue, InnerArguments /* <: js.Array[Any] */](
      script: js.Function1[
          /* import warning: importer.ImportType#apply c repeated non-array type: InnerArguments */ /* innerArgs */ /* args */ js.Array[InnerArguments], 
          Unit
        ],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
    ): js.Promise[ReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(script.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue]]
    inline def executeAsync_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeAsync")(x.asInstanceOf[js.Any])
    
    inline def execute_=(x: FnCallThisScriptArgs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("execute")(x.asInstanceOf[js.Any])
    
    inline def getCookies(): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookies")().asInstanceOf[js.Promise[js.Array[Cookie]]]
    inline def getCookies(names: String): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookies")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Cookie]]]
    inline def getCookies(names: js.Array[String]): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookies")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Cookie]]]
    @JSImport("webdriverio/build/commands/browser", "default.getCookies")
    @js.native
    def getCookies_Fdefault: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* names */ js.UndefOr[String | js.Array[String]], 
        js.Promise[js.Array[Cookie]]
      ] = js.native
    
    inline def getCookies_Fdefault_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* names */ js.UndefOr[String | js.Array[String]], 
          js.Promise[js.Array[Cookie]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCookies")(x.asInstanceOf[js.Any])
    
    inline def getPuppeteer(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PuppeteerBrowser */ Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPuppeteer")().asInstanceOf[js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PuppeteerBrowser */ Any
      ]]
    @JSImport("webdriverio/build/commands/browser", "default.getPuppeteer")
    @js.native
    def getPuppeteer_Fdefault: js.ThisFunction0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PuppeteerBrowser */ Any
        ]
      ] = js.native
    
    inline def getPuppeteer_Fdefault_=(
      x: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PuppeteerBrowser */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPuppeteer")(x.asInstanceOf[js.Any])
    
    inline def getWindowSize(): js.Promise[BrowserSize] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowSize")().asInstanceOf[js.Promise[BrowserSize]]
    @JSImport("webdriverio/build/commands/browser", "default.getWindowSize")
    @js.native
    def getWindowSize_Fdefault: js.ThisFunction0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        js.Promise[BrowserSize]
      ] = js.native
    
    inline def getWindowSize_Fdefault_=(
      x: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          js.Promise[BrowserSize]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getWindowSize")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.keys")
    @js.native
    def keys: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* value */ String | js.Array[String], 
        js.Promise[Unit]
      ] = js.native
    inline def keys(value: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def keys(value: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def keys_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* value */ String | js.Array[String], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.mock")
    @js.native
    def mock: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* url */ String | js.RegExp, 
        /* filterOptions */ js.UndefOr[MockFilterOptions], 
        js.Promise[Mock]
      ] = js.native
    inline def mock(url: String): js.Promise[Mock] = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mock]]
    inline def mock(url: String, filterOptions: MockFilterOptions): js.Promise[Mock] = (^.asInstanceOf[js.Dynamic].applyDynamic("mock")(url.asInstanceOf[js.Any], filterOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mock]]
    inline def mock(url: js.RegExp): js.Promise[Mock] = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mock]]
    inline def mock(url: js.RegExp, filterOptions: MockFilterOptions): js.Promise[Mock] = (^.asInstanceOf[js.Dynamic].applyDynamic("mock")(url.asInstanceOf[js.Any], filterOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mock]]
    
    inline def mockClearAll(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mockClearAll")().asInstanceOf[js.Promise[Unit]]
    @JSImport("webdriverio/build/commands/browser", "default.mockClearAll")
    @js.native
    def mockClearAll_Fdefault: js.Function0[js.Promise[Unit]] = js.native
    
    inline def mockClearAll_Fdefault_=(x: js.Function0[js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mockClearAll")(x.asInstanceOf[js.Any])
    
    inline def mockRestoreAll(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mockRestoreAll")().asInstanceOf[js.Promise[Unit]]
    @JSImport("webdriverio/build/commands/browser", "default.mockRestoreAll")
    @js.native
    def mockRestoreAll_Fdefault: js.Function0[js.Promise[Unit]] = js.native
    
    inline def mockRestoreAll_Fdefault_=(x: js.Function0[js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mockRestoreAll")(x.asInstanceOf[js.Any])
    
    inline def mock_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* url */ String | js.RegExp, 
          /* filterOptions */ js.UndefOr[MockFilterOptions], 
          js.Promise[Mock]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mock")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.newWindow")
    @js.native
    def newWindow: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* url */ String, 
        /* hasWindowNameWindowFeatures */ js.UndefOr[NewWindowOptions], 
        js.Promise[String]
      ] = js.native
    inline def newWindow(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("newWindow")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def newWindow(url: String, hasWindowNameWindowFeatures: NewWindowOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("newWindow")(url.asInstanceOf[js.Any], hasWindowNameWindowFeatures.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def newWindow_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* url */ String, 
          /* hasWindowNameWindowFeatures */ js.UndefOr[NewWindowOptions], 
          js.Promise[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newWindow")(x.asInstanceOf[js.Any])
    
    inline def pause(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[js.Promise[Any]]
    inline def pause(milliseconds: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    @JSImport("webdriverio/build/commands/browser", "default.pause")
    @js.native
    def pause_Fdefault: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* milliseconds */ js.UndefOr[Double], 
        js.Promise[Any]
      ] = js.native
    
    inline def pause_Fdefault_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* milliseconds */ js.UndefOr[Double], 
          js.Promise[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pause")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.react$")
    @js.native
    def react: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* selector */ String, 
        /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
        js.Promise[Element]
      ] = js.native
    
    inline def react(selector: String): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("react$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
    inline def react(selector: String, hasPropsState: ReactSelectorOptions): js.Promise[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("react$")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Element]]
    
    @JSImport("webdriverio/build/commands/browser", "default.react$$")
    @js.native
    def react$: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* selector */ String, 
        /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
        js.Promise[ElementArray]
      ] = js.native
    
    inline def react$(selector: String): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("react$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
    inline def react$(selector: String, hasPropsState: ReactSelectorOptions): js.Promise[ElementArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("react$$")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ElementArray]]
    inline def react$_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* selector */ String, 
          /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
          js.Promise[ElementArray]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react$$")(x.asInstanceOf[js.Any])
    
    inline def react_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* selector */ String, 
          /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
          js.Promise[Element]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react$")(x.asInstanceOf[js.Any])
    
    inline def reloadSession(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")().asInstanceOf[js.Promise[String]]
    @JSImport("webdriverio/build/commands/browser", "default.reloadSession")
    @js.native
    def reloadSession_Fdefault: js.ThisFunction0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        js.Promise[String]
      ] = js.native
    
    inline def reloadSession_Fdefault_=(
      x: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          js.Promise[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reloadSession")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.savePDF")
    @js.native
    def savePDF: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* filepath */ String, 
        /* options */ js.UndefOr[PDFPrintOptions], 
        js.Promise[Buffer]
      ] = js.native
    inline def savePDF(filepath: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("savePDF")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def savePDF(filepath: String, options: PDFPrintOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("savePDF")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def savePDF_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* filepath */ String, 
          /* options */ js.UndefOr[PDFPrintOptions], 
          js.Promise[Buffer]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("savePDF")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.saveRecordingScreen")
    @js.native
    def saveRecordingScreen: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* filepath */ String, 
        js.Promise[Buffer]
      ] = js.native
    inline def saveRecordingScreen(filepath: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveRecordingScreen")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def saveRecordingScreen_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* filepath */ String, 
          js.Promise[Buffer]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saveRecordingScreen")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.saveScreenshot")
    @js.native
    def saveScreenshot: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* filepath */ String, 
        js.Promise[Buffer]
      ] = js.native
    inline def saveScreenshot(filepath: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveScreenshot")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def saveScreenshot_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* filepath */ String, 
          js.Promise[Buffer]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saveScreenshot")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.setCookies")
    @js.native
    def setCookies: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* cookieObjs */ Cookie | js.Array[Cookie], 
        js.Promise[Unit]
      ] = js.native
    inline def setCookies(cookieObjs: js.Array[Cookie]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setCookies")(cookieObjs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setCookies(cookieObjs: Cookie): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setCookies")(cookieObjs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setCookies_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* cookieObjs */ Cookie | js.Array[Cookie], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setCookies")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.setTimeout")
    @js.native
    def setTimeout: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* timeouts */ PartialTimeouts, 
        js.Promise[Unit]
      ] = js.native
    inline def setTimeout(timeouts: PartialTimeouts): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(timeouts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setTimeout_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* timeouts */ PartialTimeouts, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.setWindowSize")
    @js.native
    def setWindowSize: js.ThisFunction2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* width */ Double, 
        /* height */ Double, 
        js.Promise[Unit]
      ] = js.native
    inline def setWindowSize(width: Double, height: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWindowSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def setWindowSize_=(
      x: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* width */ Double, 
          /* height */ Double, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setWindowSize")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.switchWindow")
    @js.native
    def switchWindow: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* matcher */ String | js.RegExp, 
        js.Promise[String]
      ] = js.native
    inline def switchWindow(matcher: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchWindow")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def switchWindow(matcher: js.RegExp): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchWindow")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def switchWindow_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* matcher */ String | js.RegExp, 
          js.Promise[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("switchWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.throttle")
    @js.native
    def throttle: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* params */ ThrottleOptions, 
        js.Promise[Null]
      ] = js.native
    inline def throttle(params: ThrottleOptions): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
    inline def throttle_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* params */ ThrottleOptions, 
          js.Promise[Null]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throttle")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.touchAction")
    @js.native
    def touchAction: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* actions */ TouchActions, 
        js.Promise[Unit]
      ] = js.native
    inline def touchAction(actions: TouchActions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchAction")(actions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def touchAction_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* actions */ TouchActions, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.uploadFile")
    @js.native
    def uploadFile: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* localPath */ String, 
        js.Promise[String]
      ] = js.native
    inline def uploadFile(localPath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(localPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def uploadFile_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* localPath */ String, 
          js.Promise[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uploadFile")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.url")
    @js.native
    def url: js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
        /* path */ String, 
        js.Promise[String]
      ] = js.native
    inline def url(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def url_=(
      x: js.ThisFunction1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ /* this */ Any, 
          /* path */ String, 
          js.Promise[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/browser", "default.waitUntil")
    @js.native
    def waitUntil: js.ThisFunction2[
        /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
        /* condition */ js.Function0[Boolean | js.Promise[Boolean]], 
        /* hasTimeoutIntervalTimeoutMsg */ js.UndefOr[PartialWaitUntilOptions], 
        js.Promise[`true` | Unit]
      ] = js.native
    inline def waitUntil(condition: js.Function0[Boolean | js.Promise[Boolean]]): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(condition.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitUntil(
      condition: js.Function0[Boolean | js.Promise[Boolean]],
      hasTimeoutIntervalTimeoutMsg: PartialWaitUntilOptions
    ): js.Promise[`true` | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(condition.asInstanceOf[js.Any], hasTimeoutIntervalTimeoutMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitUntil_=(
      x: js.ThisFunction2[
          /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
          /* condition */ js.Function0[Boolean | js.Promise[Boolean]], 
          /* hasTimeoutIntervalTimeoutMsg */ js.UndefOr[PartialWaitUntilOptions], 
          js.Promise[`true` | Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitUntil")(x.asInstanceOf[js.Any])
  }
}
