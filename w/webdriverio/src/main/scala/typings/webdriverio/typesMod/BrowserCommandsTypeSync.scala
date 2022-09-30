package typings.webdriverio.typesMod

import typings.std.Parameters
import typings.std.ReturnType
import typings.wdioTypes.mod.ThenArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof std.Omit<webdriverio.webdriverio/build/types.$BrowserCommands, 'execute' | 'call'> ]: (args : std.Parameters<webdriverio.webdriverio/build/types.$BrowserCommands[K]>): @wdio/types.@wdio/types.ThenArg<std.ReturnType<webdriverio.webdriverio/build/types.$BrowserCommands[K]>>} & {call <T>(fn : (): T): @wdio/types.@wdio/types.ThenArg<T>, execute <ReturnValue, InnerArguments extends std.Array<any> = std.Array<any>, OuterArguments extends InnerArguments = any>(script : string | (innerArgs : OuterArguments): ReturnValue, args : InnerArguments): ReturnValue} */
@js.native
trait BrowserCommandsTypeSync extends StObject {
  
  @JSName("$")
  def $(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
    ]
  ] = js.native
  @JSName("$")
  var $_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
      ]
    ]
  ] = js.native
  
  @JSName("$$")
  def DollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
    ]
  ] = js.native
  @JSName("$$")
  var DollarDollar_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
      ]
    ]
  ] = js.native
  
  /**
    * we need to copy type definitions for execute and executeAsync as we can't copy over
    * generics with method used above
    */
  def call[T](fn: js.Function0[T]): ThenArg[T] = js.native
  
  @JSName("custom$")
  def custom$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
    ]
  ] = js.native
  @JSName("custom$")
  var custom$_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
      ]
    ]
  ] = js.native
  
  @JSName("custom$$")
  def customDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
    ]
  ] = js.native
  @JSName("custom$$")
  var customDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
      ]
    ]
  ] = js.native
  
  def debug(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
    ]
  ] = js.native
  @JSName("debug")
  var debug_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
      ]
    ]
  ] = js.native
  
  def deleteCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
    ]
  ] = js.native
  @JSName("deleteCookies")
  var deleteCookies_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
      ]
    ]
  ] = js.native
  
  def execute[ReturnValue, InnerArguments /* <: js.Array[Any] */, OuterArguments /* <: InnerArguments */](
    script: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): ReturnValue = js.native
  def execute[ReturnValue, InnerArguments /* <: js.Array[Any] */, OuterArguments /* <: InnerArguments */](
    script: js.Function1[/* innerArgs */ OuterArguments, ReturnValue],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): ReturnValue = js.native
  
  def executeAsync(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
    ]
  ] = js.native
  @JSName("executeAsync")
  var executeAsync_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
      ]
    ]
  ] = js.native
  
  def getCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
    ]
  ] = js.native
  @JSName("getCookies")
  var getCookies_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
      ]
    ]
  ] = js.native
  
  def getPuppeteer(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
    ]
  ] = js.native
  @JSName("getPuppeteer")
  var getPuppeteer_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
      ]
    ]
  ] = js.native
  
  def getWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
    ]
  ] = js.native
  @JSName("getWindowSize")
  var getWindowSize_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
      ]
    ]
  ] = js.native
  
  def keys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
    ]
  ] = js.native
  @JSName("keys")
  var keys_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
      ]
    ]
  ] = js.native
  
  def mock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
    ]
  ] = js.native
  
  def mockClearAll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
    ]
  ] = js.native
  @JSName("mockClearAll")
  var mockClearAll_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
      ]
    ]
  ] = js.native
  
  def mockRestoreAll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
    ]
  ] = js.native
  @JSName("mockRestoreAll")
  var mockRestoreAll_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
      ]
    ]
  ] = js.native
  
  @JSName("mock")
  var mock_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
      ]
    ]
  ] = js.native
  
  def newWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
    ]
  ] = js.native
  @JSName("newWindow")
  var newWindow_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
      ]
    ]
  ] = js.native
  
  def pause(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
    ]
  ] = js.native
  @JSName("pause")
  var pause_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
      ]
    ]
  ] = js.native
  
  @JSName("react$")
  def react$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
    ]
  ] = js.native
  @JSName("react$")
  var react$_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
      ]
    ]
  ] = js.native
  
  @JSName("react$$")
  def reactDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
    ]
  ] = js.native
  @JSName("react$$")
  var reactDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
      ]
    ]
  ] = js.native
  
  def reloadSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
    ]
  ] = js.native
  @JSName("reloadSession")
  var reloadSession_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
      ]
    ]
  ] = js.native
  
  def savePDF(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
    ]
  ] = js.native
  @JSName("savePDF")
  var savePDF_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
      ]
    ]
  ] = js.native
  
  def saveRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
    ]
  ] = js.native
  @JSName("saveRecordingScreen")
  var saveRecordingScreen_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
      ]
    ]
  ] = js.native
  
  def saveScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
    ]
  ] = js.native
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
      ]
    ]
  ] = js.native
  
  def setCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
    ]
  ] = js.native
  @JSName("setCookies")
  var setCookies_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
      ]
    ]
  ] = js.native
  
  def setTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
    ]
  ] = js.native
  @JSName("setTimeout")
  var setTimeout_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
      ]
    ]
  ] = js.native
  
  def setWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
    ]
  ] = js.native
  @JSName("setWindowSize")
  var setWindowSize_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
      ]
    ]
  ] = js.native
  
  def switchWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
    ]
  ] = js.native
  @JSName("switchWindow")
  var switchWindow_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
      ]
    ]
  ] = js.native
  
  def throttle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
    ]
  ] = js.native
  @JSName("throttle")
  var throttle_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
      ]
    ]
  ] = js.native
  
  def touchAction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
    ]
  ] = js.native
  @JSName("touchAction")
  var touchAction_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
      ]
    ]
  ] = js.native
  
  def uploadFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
    ]
  ] = js.native
  @JSName("uploadFile")
  var uploadFile_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
      ]
    ]
  ] = js.native
  
  def url(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
    ]
  ] = js.native
  @JSName("url")
  var url_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
      ]
    ]
  ] = js.native
  
  def waitUntil(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<$BrowserCommands[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
    ]
  ): ThenArg[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
    ]
  ] = js.native
  @JSName("waitUntil")
  var waitUntil_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
    ], 
    ThenArg[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
      ]
    ]
  ] = js.native
}
