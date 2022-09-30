package typings.webdriverio.typesMod

import typings.std.Parameters
import typings.std.ReturnType
import typings.wdioTypes.mod.ThenArg
import typings.webdriverio.webdriverioStrings.async
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof std.Omit<webdriverio.webdriverio/build/types.BrowserCommandsType, webdriverio.webdriverio/build/types.ElementCommandNames> ]: (args : std.Parameters<webdriverio.webdriverio/build/types.BrowserCommandsType[K]>): std.Promise<std.Array<@wdio/types.@wdio/types.ThenArg<std.ReturnType<webdriverio.webdriverio/build/types.BrowserCommandsType[K]>>>>} & webdriverio.webdriverio/build/types.MultiRemoteElementCommands */
trait MultiRemoteBrowserCommandsType extends StObject {
  
  @JSName("$")
  def $(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): ThenArg[MultiRemoteElement[async]]
  @JSName("$")
  var $_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    ThenArg[MultiRemoteElement[async]]
  ]
  
  @JSName("$$")
  def DollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): ThenArg[js.Array[MultiRemoteElement[async]]]
  @JSName("$$")
  var DollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    ThenArg[js.Array[MultiRemoteElement[async]]]
  ]
  
  def call(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
        ]
      ]
    ]
  ]
  @JSName("call")
  var call_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  @JSName("custom$")
  def custom$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): ThenArg[MultiRemoteElement[async]]
  @JSName("custom$")
  var custom$_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    ThenArg[MultiRemoteElement[async]]
  ]
  
  @JSName("custom$$")
  def customDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): ThenArg[js.Array[MultiRemoteElement[async]]]
  @JSName("custom$$")
  var customDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    ThenArg[js.Array[MultiRemoteElement[async]]]
  ]
  
  def debug(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
        ]
      ]
    ]
  ]
  @JSName("debug")
  var debug_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def deleteCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
        ]
      ]
    ]
  ]
  @JSName("deleteCookies")
  var deleteCookies_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def execute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
        ]
      ]
    ]
  ]
  
  def executeAsync(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
        ]
      ]
    ]
  ]
  @JSName("executeAsync")
  var executeAsync_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  @JSName("execute")
  var execute_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getCookies")
  var getCookies_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getPuppeteer(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getPuppeteer")
  var getPuppeteer_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getWindowSize")
  var getWindowSize_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def keys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
        ]
      ]
    ]
  ]
  @JSName("keys")
  var keys_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def mock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
        ]
      ]
    ]
  ]
  
  def mockClearAll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
        ]
      ]
    ]
  ]
  @JSName("mockClearAll")
  var mockClearAll_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def mockRestoreAll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
        ]
      ]
    ]
  ]
  @JSName("mockRestoreAll")
  var mockRestoreAll_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  @JSName("mock")
  var mock_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def newWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
        ]
      ]
    ]
  ]
  @JSName("newWindow")
  var newWindow_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def pause(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
        ]
      ]
    ]
  ]
  @JSName("pause")
  var pause_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  @JSName("react$")
  def react$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): ThenArg[MultiRemoteElement[async]]
  @JSName("react$")
  var react$_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    ThenArg[MultiRemoteElement[async]]
  ]
  
  @JSName("react$$")
  def reactDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): ThenArg[js.Array[MultiRemoteElement[async]]]
  @JSName("react$$")
  var reactDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    ThenArg[js.Array[MultiRemoteElement[async]]]
  ]
  
  def reloadSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
        ]
      ]
    ]
  ]
  @JSName("reloadSession")
  var reloadSession_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def savePDF(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
        ]
      ]
    ]
  ]
  @JSName("savePDF")
  var savePDF_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def saveRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
        ]
      ]
    ]
  ]
  @JSName("saveRecordingScreen")
  var saveRecordingScreen_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def saveScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
        ]
      ]
    ]
  ]
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def setCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
        ]
      ]
    ]
  ]
  @JSName("setCookies")
  var setCookies_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def setTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
        ]
      ]
    ]
  ]
  @JSName("setTimeout")
  var setTimeout_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def setWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
        ]
      ]
    ]
  ]
  @JSName("setWindowSize")
  var setWindowSize_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  @JSName("shadow$")
  def shadow$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ], 
            ChainablePromiseElement[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("shadow$")
  var shadow$_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
              ], 
              ChainablePromiseElement[
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("shadow$$")
  def shadowDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ], 
            ChainablePromiseArray[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("shadow$$")
  var shadowDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ]
          ]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
              ], 
              ChainablePromiseArray[
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def switchWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
        ]
      ]
    ]
  ]
  @JSName("switchWindow")
  var switchWindow_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def throttle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
        ]
      ]
    ]
  ]
  @JSName("throttle")
  var throttle_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def touchAction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
        ]
      ]
    ]
  ]
  @JSName("touchAction")
  var touchAction_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def uploadFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
        ]
      ]
    ]
  ]
  @JSName("uploadFile")
  var uploadFile_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def url(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
        ]
      ]
    ]
  ]
  @JSName("url")
  var url_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def waitUntil(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
        ]
      ]
    ]
  ]
  @JSName("waitUntil")
  var waitUntil_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
          ]
        ]
      ]
    ]
  ]
}
object MultiRemoteBrowserCommandsType {
  
  inline def apply(
    $: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
            ]
          ]
        ]
      ]
    ] => ThenArg[MultiRemoteElement[async]],
    DollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
            ]
          ]
        ]
      ]
    ] => ThenArg[js.Array[MultiRemoteElement[async]]],
    call: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
          ]
        ]
      ]
    ],
    custom$: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
            ]
          ]
        ]
      ]
    ] => ThenArg[MultiRemoteElement[async]],
    customDollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
            ]
          ]
        ]
      ]
    ] => ThenArg[js.Array[MultiRemoteElement[async]]],
    debug: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
          ]
        ]
      ]
    ],
    deleteCookies: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
          ]
        ]
      ]
    ],
    execute: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
          ]
        ]
      ]
    ],
    executeAsync: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
          ]
        ]
      ]
    ],
    getCookies: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
          ]
        ]
      ]
    ],
    getPuppeteer: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
          ]
        ]
      ]
    ],
    getWindowSize: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
          ]
        ]
      ]
    ],
    keys: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
          ]
        ]
      ]
    ],
    mock: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
          ]
        ]
      ]
    ],
    mockClearAll: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
          ]
        ]
      ]
    ],
    mockRestoreAll: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
          ]
        ]
      ]
    ],
    newWindow: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
          ]
        ]
      ]
    ],
    pause: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
          ]
        ]
      ]
    ],
    react$: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
            ]
          ]
        ]
      ]
    ] => ThenArg[MultiRemoteElement[async]],
    reactDollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
            ]
          ]
        ]
      ]
    ] => ThenArg[js.Array[MultiRemoteElement[async]]],
    reloadSession: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
          ]
        ]
      ]
    ],
    savePDF: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
          ]
        ]
      ]
    ],
    saveRecordingScreen: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
          ]
        ]
      ]
    ],
    saveScreenshot: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
          ]
        ]
      ]
    ],
    setCookies: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
          ]
        ]
      ]
    ],
    setTimeout: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
          ]
        ]
      ]
    ],
    setWindowSize: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
          ]
        ]
      ]
    ],
    shadow$: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
        ], 
        ChainablePromiseElement[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ]
          ]
        ]
      ]
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
              ], 
              ChainablePromiseElement[
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    shadowDollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
        ], 
        ChainablePromiseArray[
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ]
          ]
        ]
      ]
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
              ], 
              ChainablePromiseArray[
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    switchWindow: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
          ]
        ]
      ]
    ],
    throttle: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
          ]
        ]
      ]
    ],
    touchAction: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
          ]
        ]
      ]
    ],
    uploadFile: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
          ]
        ]
      ]
    ],
    url: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
          ]
        ]
      ]
    ],
    waitUntil: /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
    ] => js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
          ]
        ]
      ]
    ]
  ): MultiRemoteBrowserCommandsType = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), call = js.Any.fromFunction1(call), custom$ = js.Any.fromFunction1(custom$), debug = js.Any.fromFunction1(debug), deleteCookies = js.Any.fromFunction1(deleteCookies), execute = js.Any.fromFunction1(execute), executeAsync = js.Any.fromFunction1(executeAsync), getCookies = js.Any.fromFunction1(getCookies), getPuppeteer = js.Any.fromFunction1(getPuppeteer), getWindowSize = js.Any.fromFunction1(getWindowSize), keys = js.Any.fromFunction1(keys), mock = js.Any.fromFunction1(mock), mockClearAll = js.Any.fromFunction1(mockClearAll), mockRestoreAll = js.Any.fromFunction1(mockRestoreAll), newWindow = js.Any.fromFunction1(newWindow), pause = js.Any.fromFunction1(pause), react$ = js.Any.fromFunction1(react$), reloadSession = js.Any.fromFunction1(reloadSession), savePDF = js.Any.fromFunction1(savePDF), saveRecordingScreen = js.Any.fromFunction1(saveRecordingScreen), saveScreenshot = js.Any.fromFunction1(saveScreenshot), setCookies = js.Any.fromFunction1(setCookies), setTimeout = js.Any.fromFunction1(setTimeout), setWindowSize = js.Any.fromFunction1(setWindowSize), shadow$ = js.Any.fromFunction1(shadow$), switchWindow = js.Any.fromFunction1(switchWindow), throttle = js.Any.fromFunction1(throttle), touchAction = js.Any.fromFunction1(touchAction), uploadFile = js.Any.fromFunction1(uploadFile), url = js.Any.fromFunction1(url), waitUntil = js.Any.fromFunction1(waitUntil))
    __obj.updateDynamic("$$")(js.Any.fromFunction1(DollarDollar))
    __obj.updateDynamic("custom$$")(js.Any.fromFunction1(customDollarDollar))
    __obj.updateDynamic("react$$")(js.Any.fromFunction1(reactDollarDollar))
    __obj.updateDynamic("shadow$$")(js.Any.fromFunction1(shadowDollarDollar))
    __obj.asInstanceOf[MultiRemoteBrowserCommandsType]
  }
  
  extension [Self <: MultiRemoteBrowserCommandsType](x: Self) {
    
    inline def set$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
            ], 
            ChainablePromiseElement[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
                ]
              ]
            ]
          ]
        ] => ThenArg[MultiRemoteElement[async]]
    ): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
    
    inline def setCall(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof call */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
    
    inline def setCustom$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
            ], 
            ChainablePromiseElement[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
                ]
              ]
            ]
          ]
        ] => ThenArg[MultiRemoteElement[async]]
    ): Self = StObject.set(x, "custom$", js.Any.fromFunction1(value))
    
    inline def setCustomDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
            ], 
            ChainablePromiseArray[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
                ]
              ]
            ]
          ]
        ] => ThenArg[js.Array[MultiRemoteElement[async]]]
    ): Self = StObject.set(x, "custom$$", js.Any.fromFunction1(value))
    
    inline def setDebug(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof debug */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDeleteCookies(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof deleteCookies */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteCookies", js.Any.fromFunction1(value))
    
    inline def setDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
            ], 
            ChainablePromiseArray[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
                ]
              ]
            ]
          ]
        ] => ThenArg[js.Array[MultiRemoteElement[async]]]
    ): Self = StObject.set(x, "$$", js.Any.fromFunction1(value))
    
    inline def setExecute(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof execute */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setExecuteAsync(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof executeAsync */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "executeAsync", js.Any.fromFunction1(value))
    
    inline def setGetCookies(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getCookies */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCookies", js.Any.fromFunction1(value))
    
    inline def setGetPuppeteer(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getPuppeteer */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getPuppeteer", js.Any.fromFunction1(value))
    
    inline def setGetWindowSize(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getWindowSize */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getWindowSize", js.Any.fromFunction1(value))
    
    inline def setKeys(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof keys */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
    
    inline def setMock(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof mock */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "mock", js.Any.fromFunction1(value))
    
    inline def setMockClearAll(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof mockClearAll */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "mockClearAll", js.Any.fromFunction1(value))
    
    inline def setMockRestoreAll(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof mockRestoreAll */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "mockRestoreAll", js.Any.fromFunction1(value))
    
    inline def setNewWindow(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof newWindow */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "newWindow", js.Any.fromFunction1(value))
    
    inline def setPause(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof pause */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setReact$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
            ], 
            ChainablePromiseElement[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
                ]
              ]
            ]
          ]
        ] => ThenArg[MultiRemoteElement[async]]
    ): Self = StObject.set(x, "react$", js.Any.fromFunction1(value))
    
    inline def setReactDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
            ], 
            ChainablePromiseArray[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
                ]
              ]
            ]
          ]
        ] => ThenArg[js.Array[MultiRemoteElement[async]]]
    ): Self = StObject.set(x, "react$$", js.Any.fromFunction1(value))
    
    inline def setReloadSession(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof reloadSession */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "reloadSession", js.Any.fromFunction1(value))
    
    inline def setSavePDF(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof savePDF */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "savePDF", js.Any.fromFunction1(value))
    
    inline def setSaveRecordingScreen(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof saveRecordingScreen */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "saveRecordingScreen", js.Any.fromFunction1(value))
    
    inline def setSaveScreenshot(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "saveScreenshot", js.Any.fromFunction1(value))
    
    inline def setSetCookies(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof setCookies */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setCookies", js.Any.fromFunction1(value))
    
    inline def setSetTimeout(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof setTimeout */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    inline def setSetWindowSize(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof setWindowSize */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setWindowSize", js.Any.fromFunction1(value))
    
    inline def setShadow$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ], 
            ChainablePromiseElement[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                ]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                  ], 
                  ChainablePromiseElement[
                    ThenArg[
                      ReturnType[
                        /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "shadow$", js.Any.fromFunction1(value))
    
    inline def setShadowDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ], 
            ChainablePromiseArray[
              ThenArg[
                ReturnType[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                ]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                  ], 
                  ChainablePromiseArray[
                    ThenArg[
                      ReturnType[
                        /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "shadow$$", js.Any.fromFunction1(value))
    
    inline def setSwitchWindow(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof switchWindow */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "switchWindow", js.Any.fromFunction1(value))
    
    inline def setThrottle(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof throttle */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "throttle", js.Any.fromFunction1(value))
    
    inline def setTouchAction(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchAction", js.Any.fromFunction1(value))
    
    inline def setUploadFile(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof uploadFile */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "uploadFile", js.Any.fromFunction1(value))
    
    inline def setUrl(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof url */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
    
    inline def setWaitUntil(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitUntil", js.Any.fromFunction1(value))
  }
}
