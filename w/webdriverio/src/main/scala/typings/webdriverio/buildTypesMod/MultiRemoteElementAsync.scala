package typings.webdriverio.buildTypesMod

import typings.std.Parameters
import typings.std.ReturnType
import typings.wdioProtocols.buildTypesMod.Context
import typings.wdioProtocols.buildTypesMod.Cookie
import typings.wdioProtocols.buildTypesMod.ElementReference
import typings.wdioProtocols.buildTypesMod.ProtocolCommandResponse
import typings.wdioProtocols.buildTypesMod.RectReturn
import typings.wdioProtocols.buildTypesMod.SessionReturn
import typings.wdioProtocols.buildTypesMod.SettingsReturn
import typings.wdioProtocols.buildTypesMod.StatusReturn
import typings.wdioProtocols.buildTypesMod.StringsReturn
import typings.wdioProtocols.buildTypesMod.Timeouts
import typings.wdioProtocols.buildTypesMod.WindowHandle
import typings.wdioTypes.mod.ThenArg
import typings.webdriverio.webdriverioStrings.async
import typings.webdriverio.webdriverioStrings.tab
import typings.webdriverio.webdriverioStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent webdriverio.webdriverio/build/types.MultiRemoteElementBase */
/* Inlined parent webdriverio.webdriverio/build/types.MultiRemoteProtocolCommandsType */
/* Inlined parent std.Omit<webdriverio.webdriverio/build/types.MultiRemoteBrowserCommandsType, keyof webdriverio.webdriverio/build/types.MultiRemoteElementCommandsType> */
/* Inlined parent webdriverio.webdriverio/build/types.MultiRemoteElementCommandsType */
trait MultiRemoteElementAsync extends StObject {
  
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
  
  def _getWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("_getWindowSize")
  var _getWindowSize_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def _setWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("_setWindowSize")
  var _setWindowSize_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
              js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def acceptAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("acceptAlert")
  var acceptAlert_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def activateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("activateApp")
  var activateApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def activateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("activateIME")
  var activateIME_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  var addCommand: js.Function
  
  def addCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("addCookie")
  var addCookie_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
              js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def addCredential(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function7[
            /* credentialId */ String, 
            /* isResidentCredential */ Boolean, 
            /* rpId */ String, 
            /* privateKey */ String, 
            /* userHandle */ String, 
            /* signCount */ Double, 
            /* largeBlob */ String, 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function7[
              /* credentialId */ String, 
              /* isResidentCredential */ Boolean, 
              /* rpId */ String, 
              /* privateKey */ String, 
              /* userHandle */ String, 
              /* signCount */ Double, 
              /* largeBlob */ String, 
              Unit
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
              js.Function7[
                /* credentialId */ String, 
                /* isResidentCredential */ Boolean, 
                /* rpId */ String, 
                /* privateKey */ String, 
                /* userHandle */ String, 
                /* signCount */ Double, 
                /* largeBlob */ String, 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function7[
                  /* credentialId */ String, 
                  /* isResidentCredential */ Boolean, 
                  /* rpId */ String, 
                  /* privateKey */ String, 
                  /* userHandle */ String, 
                  /* signCount */ Double, 
                  /* largeBlob */ String, 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("addCredential")
  var addCredential_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function7[
            /* credentialId */ String, 
            /* isResidentCredential */ Boolean, 
            /* rpId */ String, 
            /* privateKey */ String, 
            /* userHandle */ String, 
            /* signCount */ Double, 
            /* largeBlob */ String, 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function7[
              /* credentialId */ String, 
              /* isResidentCredential */ Boolean, 
              /* rpId */ String, 
              /* privateKey */ String, 
              /* userHandle */ String, 
              /* signCount */ Double, 
              /* largeBlob */ String, 
              Unit
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
                js.Function7[
                  /* credentialId */ String, 
                  /* isResidentCredential */ Boolean, 
                  /* rpId */ String, 
                  /* privateKey */ String, 
                  /* userHandle */ String, 
                  /* signCount */ Double, 
                  /* largeBlob */ String, 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function7[
                    /* credentialId */ String, 
                    /* isResidentCredential */ Boolean, 
                    /* rpId */ String, 
                    /* privateKey */ String, 
                    /* userHandle */ String, 
                    /* signCount */ Double, 
                    /* largeBlob */ String, 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def addValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
        ]
      ]
    ]
  ]
  @JSName("addValue")
  var addValue_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def addVirtualAuthenticator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function8[
            /* protocol */ js.UndefOr[String], 
            /* transport */ js.UndefOr[String], 
            /* hasResidentKey */ js.UndefOr[Boolean], 
            /* hasUserVerification */ js.UndefOr[Boolean], 
            /* isUserConsenting */ js.UndefOr[Boolean], 
            /* isUserVerified */ js.UndefOr[Boolean], 
            /* extensions */ js.UndefOr[js.Array[String]], 
            /* uvm */ js.UndefOr[js.Array[js.Object]], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function8[
              /* protocol */ js.UndefOr[String], 
              /* transport */ js.UndefOr[String], 
              /* hasResidentKey */ js.UndefOr[Boolean], 
              /* hasUserVerification */ js.UndefOr[Boolean], 
              /* isUserConsenting */ js.UndefOr[Boolean], 
              /* isUserVerified */ js.UndefOr[Boolean], 
              /* extensions */ js.UndefOr[js.Array[String]], 
              /* uvm */ js.UndefOr[js.Array[js.Object]], 
              Unit
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
              js.Function8[
                /* protocol */ js.UndefOr[String], 
                /* transport */ js.UndefOr[String], 
                /* hasResidentKey */ js.UndefOr[Boolean], 
                /* hasUserVerification */ js.UndefOr[Boolean], 
                /* isUserConsenting */ js.UndefOr[Boolean], 
                /* isUserVerified */ js.UndefOr[Boolean], 
                /* extensions */ js.UndefOr[js.Array[String]], 
                /* uvm */ js.UndefOr[js.Array[js.Object]], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function8[
                  /* protocol */ js.UndefOr[String], 
                  /* transport */ js.UndefOr[String], 
                  /* hasResidentKey */ js.UndefOr[Boolean], 
                  /* hasUserVerification */ js.UndefOr[Boolean], 
                  /* isUserConsenting */ js.UndefOr[Boolean], 
                  /* isUserVerified */ js.UndefOr[Boolean], 
                  /* extensions */ js.UndefOr[js.Array[String]], 
                  /* uvm */ js.UndefOr[js.Array[js.Object]], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("addVirtualAuthenticator")
  var addVirtualAuthenticator_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function8[
            /* protocol */ js.UndefOr[String], 
            /* transport */ js.UndefOr[String], 
            /* hasResidentKey */ js.UndefOr[Boolean], 
            /* hasUserVerification */ js.UndefOr[Boolean], 
            /* isUserConsenting */ js.UndefOr[Boolean], 
            /* isUserVerified */ js.UndefOr[Boolean], 
            /* extensions */ js.UndefOr[js.Array[String]], 
            /* uvm */ js.UndefOr[js.Array[js.Object]], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function8[
              /* protocol */ js.UndefOr[String], 
              /* transport */ js.UndefOr[String], 
              /* hasResidentKey */ js.UndefOr[Boolean], 
              /* hasUserVerification */ js.UndefOr[Boolean], 
              /* isUserConsenting */ js.UndefOr[Boolean], 
              /* isUserVerified */ js.UndefOr[Boolean], 
              /* extensions */ js.UndefOr[js.Array[String]], 
              /* uvm */ js.UndefOr[js.Array[js.Object]], 
              Unit
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
                js.Function8[
                  /* protocol */ js.UndefOr[String], 
                  /* transport */ js.UndefOr[String], 
                  /* hasResidentKey */ js.UndefOr[Boolean], 
                  /* hasUserVerification */ js.UndefOr[Boolean], 
                  /* isUserConsenting */ js.UndefOr[Boolean], 
                  /* isUserVerified */ js.UndefOr[Boolean], 
                  /* extensions */ js.UndefOr[js.Array[String]], 
                  /* uvm */ js.UndefOr[js.Array[js.Object]], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function8[
                    /* protocol */ js.UndefOr[String], 
                    /* transport */ js.UndefOr[String], 
                    /* hasResidentKey */ js.UndefOr[Boolean], 
                    /* hasUserVerification */ js.UndefOr[Boolean], 
                    /* isUserConsenting */ js.UndefOr[Boolean], 
                    /* isUserVerified */ js.UndefOr[Boolean], 
                    /* extensions */ js.UndefOr[js.Array[String]], 
                    /* uvm */ js.UndefOr[js.Array[js.Object]], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def assertPerformance(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* name */ String, 
              /* metrics */ js.UndefOr[js.Array[String]], 
              ProtocolCommandResponse
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
              js.Function2[
                /* name */ String, 
                /* metrics */ js.UndefOr[js.Array[String]], 
                ProtocolCommandResponse
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* name */ String, 
                  /* metrics */ js.UndefOr[js.Array[String]], 
                  ProtocolCommandResponse
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("assertPerformance")
  var assertPerformance_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* name */ String, 
              /* metrics */ js.UndefOr[js.Array[String]], 
              ProtocolCommandResponse
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
                js.Function2[
                  /* name */ String, 
                  /* metrics */ js.UndefOr[js.Array[String]], 
                  ProtocolCommandResponse
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function2[
                    /* name */ String, 
                    /* metrics */ js.UndefOr[js.Array[String]], 
                    ProtocolCommandResponse
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def back(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("back")
  var back_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def background(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
            js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("background")
  var background_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
              js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def buttonDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("buttonDown")
  var buttonDown_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
              js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def buttonUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("buttonUp")
  var buttonUp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
              js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
            ]
          ]
        ]
      ]
    ]
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
  
  def clearLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("clearLocalStorage")
  var clearLocalStorage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def clearMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("clearMockCalls")
  var clearMockCalls_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
              js.Promise[
                ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def clearSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("clearSessionStorage")
  var clearSessionStorage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def clearValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
        ]
      ]
    ]
  ]
  @JSName("clearValue")
  var clearValue_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def click(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
        ]
      ]
    ]
  ]
  @JSName("click")
  var click_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def closeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("closeApp")
  var closeApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def closeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("closeWindow")
  var closeWindow_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def compareImages(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* mode */ String, 
            /* firstImage */ String, 
            /* secondImage */ String, 
            /* options */ js.Object, 
            ProtocolCommandResponse
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* mode */ String, 
              /* firstImage */ String, 
              /* secondImage */ String, 
              /* options */ js.Object, 
              ProtocolCommandResponse
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
              js.Function4[
                /* mode */ String, 
                /* firstImage */ String, 
                /* secondImage */ String, 
                /* options */ js.Object, 
                ProtocolCommandResponse
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* mode */ String, 
                  /* firstImage */ String, 
                  /* secondImage */ String, 
                  /* options */ js.Object, 
                  ProtocolCommandResponse
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("compareImages")
  var compareImages_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* mode */ String, 
            /* firstImage */ String, 
            /* secondImage */ String, 
            /* options */ js.Object, 
            ProtocolCommandResponse
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* mode */ String, 
              /* firstImage */ String, 
              /* secondImage */ String, 
              /* options */ js.Object, 
              ProtocolCommandResponse
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
                js.Function4[
                  /* mode */ String, 
                  /* firstImage */ String, 
                  /* secondImage */ String, 
                  /* options */ js.Object, 
                  ProtocolCommandResponse
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function4[
                    /* mode */ String, 
                    /* firstImage */ String, 
                    /* secondImage */ String, 
                    /* options */ js.Object, 
                    ProtocolCommandResponse
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def createMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* mockSensorType */ String, 
              /* maxSamplingFrequency */ Double, 
              /* minSamplingFrequency */ Double, 
              Unit
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
              js.Function3[
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("createMockSensor")
  var createMockSensor_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* mockSensorType */ String, 
              /* maxSamplingFrequency */ Double, 
              /* minSamplingFrequency */ Double, 
              Unit
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
                js.Function3[
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* mockSensorType */ String, 
                    /* maxSamplingFrequency */ Double, 
                    /* minSamplingFrequency */ Double, 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def createWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
        js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
            js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("createWindow")
  var createWindow_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
        js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
              js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
            ]
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
  
  def deactivateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("deactivateIME")
  var deactivateIME_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
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
  
  def deleteAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("deleteAllCookies")
  var deleteAllCookies_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def deleteCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("deleteCookie")
  var deleteCookie_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
            ]
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
  
  def deleteLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("deleteLocalStorageItem")
  var deleteLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def deleteMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("deleteMockSensor")
  var deleteMockSensor_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def deleteNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("deleteNetworkConditions")
  var deleteNetworkConditions_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def deleteSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  
  def deleteSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("deleteSessionStorageItem")
  var deleteSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("deleteSession")
  var deleteSession_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def dismissAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("dismissAlert")
  var dismissAlert_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def doubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
        ]
      ]
    ]
  ]
  @JSName("doubleClick")
  var doubleClick_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def dragAndDrop(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
        ]
      ]
    ]
  ]
  @JSName("dragAndDrop")
  var dragAndDrop_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def driverScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* script */ String, 
              /* type */ js.UndefOr[String], 
              /* timeout */ js.UndefOr[Double], 
              ProtocolCommandResponse
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
              js.Function3[
                /* script */ String, 
                /* type */ js.UndefOr[String], 
                /* timeout */ js.UndefOr[Double], 
                ProtocolCommandResponse
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* script */ String, 
                  /* type */ js.UndefOr[String], 
                  /* timeout */ js.UndefOr[Double], 
                  ProtocolCommandResponse
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("driverScript")
  var driverScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* script */ String, 
              /* type */ js.UndefOr[String], 
              /* timeout */ js.UndefOr[Double], 
              ProtocolCommandResponse
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
                js.Function3[
                  /* script */ String, 
                  /* type */ js.UndefOr[String], 
                  /* timeout */ js.UndefOr[Double], 
                  ProtocolCommandResponse
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* script */ String, 
                    /* type */ js.UndefOr[String], 
                    /* timeout */ js.UndefOr[Double], 
                    ProtocolCommandResponse
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def elementClear(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("elementClear")
  var elementClear_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def elementClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("elementClick")
  var elementClick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def elementEquals(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
            js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("elementEquals")
  var elementEquals_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
              js.Promise[
                ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def elementHover(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("elementHover")
  var elementHover_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def elementSendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("elementSendKeys")
  var elementSendKeys_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def elementSubmit(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("elementSubmit")
  var elementSubmit_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def endCoverage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("endCoverage")
  var endCoverage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
            ]
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
  
  def executeAsyncScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
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
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("executeAsyncScript")
  var executeAsyncScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
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
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function2[
                    /* script */ String, 
                    /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                    Any
                  ]
                ]
              ]
            ]
          ]
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
  
  def executeScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
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
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("executeScript")
  var executeScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
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
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function2[
                    /* script */ String, 
                    /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                    Any
                  ]
                ]
              ]
            ]
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
  
  def file(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* file */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* file */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("file")
  var file_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* file */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* file */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def findElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
            js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def findElementFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
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
              js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("findElementFromElement")
  var findElementFromElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
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
                js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def findElementFromShadowRoot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
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
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("findElementFromShadowRoot")
  var findElementFromShadowRoot_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
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
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("findElement")
  var findElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
              js.Promise[
                ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def findElements(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
            js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def findElementsFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* elementId */ String, 
              /* using */ String, 
              /* value */ String, 
              js.Array[ElementReference]
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
              js.Function3[
                /* elementId */ String, 
                /* using */ String, 
                /* value */ String, 
                js.Array[ElementReference]
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* elementId */ String, 
                  /* using */ String, 
                  /* value */ String, 
                  js.Array[ElementReference]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("findElementsFromElement")
  var findElementsFromElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* elementId */ String, 
              /* using */ String, 
              /* value */ String, 
              js.Array[ElementReference]
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
                js.Function3[
                  /* elementId */ String, 
                  /* using */ String, 
                  /* value */ String, 
                  js.Array[ElementReference]
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* elementId */ String, 
                    /* using */ String, 
                    /* value */ String, 
                    js.Array[ElementReference]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def findElementsFromShadowRoot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
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
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("findElementsFromShadowRoot")
  var findElementsFromShadowRoot_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
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
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("findElements")
  var findElements_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
              js.Promise[
                ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def fingerPrint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("fingerPrint")
  var fingerPrint_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
              js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def forward(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("forward")
  var forward_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def freeze(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("freeze")
  var freeze_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def fullscreenWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("fullscreenWindow")
  var fullscreenWindow_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[RectReturn]], 
              js.Promise[ReturnType[js.Function0[RectReturn]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def generateTestReport(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("generateTestReport")
  var generateTestReport_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getActiveElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getActiveElement")
  var getActiveElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getActiveEngine(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getActiveEngine")
  var getActiveEngine_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getAlertText")
  var getAlertText_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
            js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getAllCookies")
  var getAllCookies_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
              js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getApplicationCacheStatus(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getApplicationCacheStatus")
  var getApplicationCacheStatus_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Double]], 
              js.Promise[ReturnType[js.Function0[Double]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getAttribute")
  var getAttribute_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getAvailableEngines(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getAvailableEngines")
  var getAvailableEngines_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[String]]], 
              js.Promise[ReturnType[js.Function0[js.Array[String]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getCSSProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getCSSProperty")
  var getCSSProperty_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getCastIssueMessage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getCastIssueMessage")
  var getCastIssueMessage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getCastSinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getCastSinks")
  var getCastSinks_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[String]]], 
              js.Promise[ReturnType[js.Function0[js.Array[String]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
        js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
            js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getClipboard")
  var getClipboard_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
        js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
              js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getComputedLabel(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getComputedLabel")
  var getComputedLabel_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getComputedRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getComputedRole")
  var getComputedRole_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Context]], 
        js.Promise[ReturnType[js.Function0[Context]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Context]], 
            js.Promise[ReturnType[js.Function0[Context]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getContext")
  var getContext_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Context]], 
        js.Promise[ReturnType[js.Function0[Context]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Context]], 
              js.Promise[ReturnType[js.Function0[Context]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getContexts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Context]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[Context]]], 
            js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getContexts")
  var getContexts_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Context]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[Context]]], 
              js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
            ]
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
  
  def getCredentials(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getCredentials")
  var getCredentials_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getCurrentActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getCurrentActivity")
  var getCurrentActivity_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getCurrentPackage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getCurrentPackage")
  var getCurrentPackage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getDeviceTime(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getDeviceTime")
  var getDeviceTime_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getDisplayDensity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Any]], 
        js.Promise[ReturnType[js.Function0[Any]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Any]], 
            js.Promise[ReturnType[js.Function0[Any]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getDisplayDensity")
  var getDisplayDensity_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Any]], 
        js.Promise[ReturnType[js.Function0[Any]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Any]], 
              js.Promise[ReturnType[js.Function0[Any]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementAttribute")
  var getElementAttribute_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
              js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementCSSValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
            js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementCSSValue")
  var getElementCSSValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
              js.Promise[
                ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementComputedLabel(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementComputedLabel")
  var getElementComputedLabel_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementComputedRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementComputedRole")
  var getElementComputedRole_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  
  def getElementLocationInView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementLocationInView")
  var getElementLocationInView_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("getElementLocation")
  var getElementLocation_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementProperty")
  var getElementProperty_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
              js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementRect")
  var getElementRect_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementShadowRoot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementShadowRoot")
  var getElementShadowRoot_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementSize")
  var getElementSize_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementTagName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementTagName")
  var getElementTagName_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementText")
  var getElementText_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getElementValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getElementValue")
  var getElementValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getEvents(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getEvents")
  var getEvents_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getGeoLocation")
  var getGeoLocation_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getHTML(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getHTML")
  var getHTML_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getHubConfig(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getHubConfig")
  var getHubConfig_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ]
      ]
    ]
  ]
  
  def getLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getLocalStorageItem")
  var getLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* key */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getLocalStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getLocalStorageSize")
  var getLocalStorageSize_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Double]], 
              js.Promise[ReturnType[js.Function0[Double]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("getLocalStorage")
  var getLocalStorage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[String]]], 
              js.Promise[ReturnType[js.Function0[js.Array[String]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocation */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocation */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getLocation")
  var getLocation_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocation */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocation */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getLogTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getLogTypes")
  var getLogTypes_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[String]]], 
              js.Promise[ReturnType[js.Function0[js.Array[String]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getLogs")
  var getLogs_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
              js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getMockCalls")
  var getMockCalls_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getMockSensor")
  var getMockSensor_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getNamedCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
            js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getNamedCookie")
  var getNamedCookie_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
              js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getNetworkConditions")
  var getNetworkConditions_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getNetworkConnection")
  var getNetworkConnection_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Double]], 
              js.Promise[ReturnType[js.Function0[Double]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getOrientation")
  var getOrientation_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getPageIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getPageIndex")
  var getPageIndex_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getPageLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getPageLogs")
  var getPageLogs_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getPageSource(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getPageSource")
  var getPageSource_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getPerformanceData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* packageName */ String, 
              /* dataType */ String, 
              /* dataReadTimeout */ js.UndefOr[Double], 
              js.Array[String]
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
              js.Function3[
                /* packageName */ String, 
                /* dataType */ String, 
                /* dataReadTimeout */ js.UndefOr[Double], 
                js.Array[String]
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* packageName */ String, 
                  /* dataType */ String, 
                  /* dataReadTimeout */ js.UndefOr[Double], 
                  js.Array[String]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getPerformanceDataTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getPerformanceDataTypes")
  var getPerformanceDataTypes_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[String]]], 
              js.Promise[ReturnType[js.Function0[js.Array[String]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("getPerformanceData")
  var getPerformanceData_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* packageName */ String, 
              /* dataType */ String, 
              /* dataReadTimeout */ js.UndefOr[Double], 
              js.Array[String]
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
                js.Function3[
                  /* packageName */ String, 
                  /* dataType */ String, 
                  /* dataReadTimeout */ js.UndefOr[Double], 
                  js.Array[String]
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* packageName */ String, 
                    /* dataType */ String, 
                    /* dataReadTimeout */ js.UndefOr[Double], 
                    js.Array[String]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getProperty")
  var getProperty_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
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
  
  def getSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  
  def getSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ]
      ]
    ]
  ]
  
  def getSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getSessionStorageItem")
  var getSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* key */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getSessionStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getSessionStorageSize")
  var getSessionStorageSize_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Double]], 
              js.Promise[ReturnType[js.Function0[Double]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("getSessionStorage")
  var getSessionStorage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[String]]], 
              js.Promise[ReturnType[js.Function0[js.Array[String]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("getSession")
  var getSession_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getSessions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
            js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getSessions")
  var getSessions_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
              js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[SettingsReturn]], 
        js.Promise[ReturnType[js.Function0[SettingsReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[SettingsReturn]], 
            js.Promise[ReturnType[js.Function0[SettingsReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getSettings")
  var getSettings_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[SettingsReturn]], 
        js.Promise[ReturnType[js.Function0[SettingsReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[SettingsReturn]], 
              js.Promise[ReturnType[js.Function0[SettingsReturn]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getSize */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getSize */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getSize")
  var getSize_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getSize */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getSize */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getStrings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* language */ js.UndefOr[String], 
              /* stringFile */ js.UndefOr[String], 
              StringsReturn
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
              js.Function2[
                /* language */ js.UndefOr[String], 
                /* stringFile */ js.UndefOr[String], 
                StringsReturn
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* language */ js.UndefOr[String], 
                  /* stringFile */ js.UndefOr[String], 
                  StringsReturn
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getStrings")
  var getStrings_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* language */ js.UndefOr[String], 
              /* stringFile */ js.UndefOr[String], 
              StringsReturn
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
                js.Function2[
                  /* language */ js.UndefOr[String], 
                  /* stringFile */ js.UndefOr[String], 
                  StringsReturn
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function2[
                    /* language */ js.UndefOr[String], 
                    /* stringFile */ js.UndefOr[String], 
                    StringsReturn
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getSystemBars(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
            js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getSystemBars")
  var getSystemBars_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
              js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getTagName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getTagName")
  var getTagName_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getText")
  var getText_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Timeouts]], 
        js.Promise[ReturnType[js.Function0[Timeouts]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Timeouts]], 
            js.Promise[ReturnType[js.Function0[Timeouts]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getTimeouts")
  var getTimeouts_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Timeouts]], 
        js.Promise[ReturnType[js.Function0[Timeouts]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Timeouts]], 
              js.Promise[ReturnType[js.Function0[Timeouts]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getTitle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getTitle")
  var getTitle_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getUrl(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getUrl")
  var getUrl_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
        ]
      ]
    ]
  ]
  @JSName("getValue")
  var getValue_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def getWindowHandle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getWindowHandle")
  var getWindowHandle_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getWindowHandles(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getWindowHandles")
  var getWindowHandles_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[js.Array[String]]], 
              js.Promise[ReturnType[js.Function0[js.Array[String]]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getWindowPosition")
  var getWindowPosition_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("getWindowRect")
  var getWindowRect_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[RectReturn]], 
              js.Promise[ReturnType[js.Function0[RectReturn]]]
            ]
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
  
  def gridProxyDetails(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("gridProxyDetails")
  var gridProxyDetails_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def gridTestSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("gridTestSession")
  var gridTestSession_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def gsmCall(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("gsmCall")
  var gsmCall_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def gsmSignal(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
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
              js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("gsmSignal")
  var gsmSignal_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
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
                js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
              ], 
              js.Promise[
                ReturnType[
                  js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def gsmVoice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("gsmVoice")
  var gsmVoice_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def hideKeyboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* strategy */ js.UndefOr[String], 
            /* key */ js.UndefOr[String], 
            /* keyCode */ js.UndefOr[String], 
            /* keyName */ js.UndefOr[String], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* strategy */ js.UndefOr[String], 
              /* key */ js.UndefOr[String], 
              /* keyCode */ js.UndefOr[String], 
              /* keyName */ js.UndefOr[String], 
              Unit
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
              js.Function4[
                /* strategy */ js.UndefOr[String], 
                /* key */ js.UndefOr[String], 
                /* keyCode */ js.UndefOr[String], 
                /* keyName */ js.UndefOr[String], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* strategy */ js.UndefOr[String], 
                  /* key */ js.UndefOr[String], 
                  /* keyCode */ js.UndefOr[String], 
                  /* keyName */ js.UndefOr[String], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("hideKeyboard")
  var hideKeyboard_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* strategy */ js.UndefOr[String], 
            /* key */ js.UndefOr[String], 
            /* keyCode */ js.UndefOr[String], 
            /* keyName */ js.UndefOr[String], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* strategy */ js.UndefOr[String], 
              /* key */ js.UndefOr[String], 
              /* keyCode */ js.UndefOr[String], 
              /* keyName */ js.UndefOr[String], 
              Unit
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
                js.Function4[
                  /* strategy */ js.UndefOr[String], 
                  /* key */ js.UndefOr[String], 
                  /* keyCode */ js.UndefOr[String], 
                  /* keyName */ js.UndefOr[String], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function4[
                    /* strategy */ js.UndefOr[String], 
                    /* key */ js.UndefOr[String], 
                    /* keyCode */ js.UndefOr[String], 
                    /* keyName */ js.UndefOr[String], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def installApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("installApp")
  var installApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  /**
    * multiremote browser instance names
    */
  var instances: js.Array[String]
  
  def interceptRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("interceptRequest")
  var interceptRequest_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
              js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isAlertOpen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isAlertOpen")
  var isAlertOpen_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Boolean]], 
              js.Promise[ReturnType[js.Function0[Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isAppInstalled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isAppInstalled")
  var isAppInstalled_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
              js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isAutoReporting")
  var isAutoReporting_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Boolean]], 
              js.Promise[ReturnType[js.Function0[Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isClickable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
        ]
      ]
    ]
  ]
  @JSName("isClickable")
  var isClickable_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def isDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
        ]
      ]
    ]
  ]
  
  def isDisplayedInViewport(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
        ]
      ]
    ]
  ]
  @JSName("isDisplayedInViewport")
  var isDisplayedInViewport_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  @JSName("isDisplayed")
  var isDisplayed_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def isElementDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isElementDisplayed")
  var isElementDisplayed_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isElementEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isElementEnabled")
  var isElementEnabled_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isElementSelected(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isElementSelected")
  var isElementSelected_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
              js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
        ]
      ]
    ]
  ]
  @JSName("isEnabled")
  var isEnabled_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def isEqual(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
        ]
      ]
    ]
  ]
  @JSName("isEqual")
  var isEqual_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def isExisting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
        ]
      ]
    ]
  ]
  @JSName("isExisting")
  var isExisting_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def isFocused(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
        ]
      ]
    ]
  ]
  @JSName("isFocused")
  var isFocused_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def isIMEActivated(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isIMEActivated")
  var isIMEActivated_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Boolean]], 
              js.Promise[ReturnType[js.Function0[Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isKeyboardShown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isKeyboardShown")
  var isKeyboardShown_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Boolean]], 
              js.Promise[ReturnType[js.Function0[Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isLoading(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isLoading")
  var isLoading_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Boolean]], 
              js.Promise[ReturnType[js.Function0[Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isLocked(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("isLocked")
  var isLocked_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Boolean]], 
              js.Promise[ReturnType[js.Function0[Boolean]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isSelected(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
        ]
      ]
    ]
  ]
  @JSName("isSelected")
  var isSelected_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def jankinessCheck(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("jankinessCheck")
  var jankinessCheck_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
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
  
  def launchApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("launchApp")
  var launchApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def launchChromeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("launchChromeApp")
  var launchChromeApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def lock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("lock")
  var lock_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
              js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def logEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("logEvent")
  var logEvent_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def longPressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
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
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("longPressKeyCode")
  var longPressKeyCode_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
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
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* keycode */ Double, 
                    /* metastate */ js.UndefOr[Double], 
                    /* flags */ js.UndefOr[Double], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def manageSeleniumHubLifecycle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("manageSeleniumHubLifecycle")
  var manageSeleniumHubLifecycle_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def maximizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("maximizeWindow")
  var maximizeWindow_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[RectReturn]], 
              js.Promise[ReturnType[js.Function0[RectReturn]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def minimizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("minimizeWindow")
  var minimizeWindow_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[RectReturn]], 
              js.Promise[ReturnType[js.Function0[RectReturn]]]
            ]
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
  
  def mockRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
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
              js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("mockRequest")
  var mockRequest_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
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
                js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
              ], 
              js.Promise[
                ReturnType[
                  js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
                ]
              ]
            ]
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
  
  def moveTo(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
        ]
      ]
    ]
  ]
  
  def moveToElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* element */ js.UndefOr[String | Null], 
              /* xoffset */ js.UndefOr[Double], 
              /* yoffset */ js.UndefOr[Double], 
              Unit
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
              js.Function3[
                /* element */ js.UndefOr[String | Null], 
                /* xoffset */ js.UndefOr[Double], 
                /* yoffset */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* element */ js.UndefOr[String | Null], 
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("moveToElement")
  var moveToElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* element */ js.UndefOr[String | Null], 
              /* xoffset */ js.UndefOr[Double], 
              /* yoffset */ js.UndefOr[Double], 
              Unit
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
                js.Function3[
                  /* element */ js.UndefOr[String | Null], 
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* element */ js.UndefOr[String | Null], 
                    /* xoffset */ js.UndefOr[Double], 
                    /* yoffset */ js.UndefOr[Double], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("moveTo")
  var moveTo_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def multiTouchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("multiTouchPerform")
  var multiTouchPerform_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
              js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def navigateTo(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* url */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* url */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("navigateTo")
  var navigateTo_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* url */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* url */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def newSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
        js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
            js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("newSession")
  var newSession_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
        js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
              js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
            ]
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
  
  def nextElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
        ]
      ]
    ]
  ]
  @JSName("nextElement")
  var nextElement_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def openNotifications(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("openNotifications")
  var openNotifications_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  var overwriteCommand: js.Function
  
  def parentElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
        ]
      ]
    ]
  ]
  @JSName("parentElement")
  var parentElement_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
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
  
  def performActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("performActions")
  var performActions_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
              js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def positionClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("positionClick")
  var positionClick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
              js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def positionDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("positionDoubleClick")
  var positionDoubleClick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def powerAC(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("powerAC")
  var powerAC_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def powerCapacity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("powerCapacity")
  var powerCapacity_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
              js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def pressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
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
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("pressKeyCode")
  var pressKeyCode_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
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
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* keycode */ Double, 
                    /* metastate */ js.UndefOr[Double], 
                    /* flags */ js.UndefOr[Double], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def previousElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
        ]
      ]
    ]
  ]
  @JSName("previousElement")
  var previousElement_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def printPage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function11[
            /* orientation */ js.UndefOr[String], 
            /* scale */ js.UndefOr[Double], 
            /* background */ js.UndefOr[Boolean], 
            /* width */ js.UndefOr[Double], 
            /* height */ js.UndefOr[Double], 
            /* top */ js.UndefOr[Double], 
            /* bottom */ js.UndefOr[Double], 
            /* left */ js.UndefOr[Double], 
            /* right */ js.UndefOr[Double], 
            /* shrinkToFit */ js.UndefOr[Boolean], 
            /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
            String
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function11[
              /* orientation */ js.UndefOr[String], 
              /* scale */ js.UndefOr[Double], 
              /* background */ js.UndefOr[Boolean], 
              /* width */ js.UndefOr[Double], 
              /* height */ js.UndefOr[Double], 
              /* top */ js.UndefOr[Double], 
              /* bottom */ js.UndefOr[Double], 
              /* left */ js.UndefOr[Double], 
              /* right */ js.UndefOr[Double], 
              /* shrinkToFit */ js.UndefOr[Boolean], 
              /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
              String
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
              js.Function11[
                /* orientation */ js.UndefOr[String], 
                /* scale */ js.UndefOr[Double], 
                /* background */ js.UndefOr[Boolean], 
                /* width */ js.UndefOr[Double], 
                /* height */ js.UndefOr[Double], 
                /* top */ js.UndefOr[Double], 
                /* bottom */ js.UndefOr[Double], 
                /* left */ js.UndefOr[Double], 
                /* right */ js.UndefOr[Double], 
                /* shrinkToFit */ js.UndefOr[Boolean], 
                /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                String
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function11[
                  /* orientation */ js.UndefOr[String], 
                  /* scale */ js.UndefOr[Double], 
                  /* background */ js.UndefOr[Boolean], 
                  /* width */ js.UndefOr[Double], 
                  /* height */ js.UndefOr[Double], 
                  /* top */ js.UndefOr[Double], 
                  /* bottom */ js.UndefOr[Double], 
                  /* left */ js.UndefOr[Double], 
                  /* right */ js.UndefOr[Double], 
                  /* shrinkToFit */ js.UndefOr[Boolean], 
                  /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                  String
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("printPage")
  var printPage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function11[
            /* orientation */ js.UndefOr[String], 
            /* scale */ js.UndefOr[Double], 
            /* background */ js.UndefOr[Boolean], 
            /* width */ js.UndefOr[Double], 
            /* height */ js.UndefOr[Double], 
            /* top */ js.UndefOr[Double], 
            /* bottom */ js.UndefOr[Double], 
            /* left */ js.UndefOr[Double], 
            /* right */ js.UndefOr[Double], 
            /* shrinkToFit */ js.UndefOr[Boolean], 
            /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
            String
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function11[
              /* orientation */ js.UndefOr[String], 
              /* scale */ js.UndefOr[Double], 
              /* background */ js.UndefOr[Boolean], 
              /* width */ js.UndefOr[Double], 
              /* height */ js.UndefOr[Double], 
              /* top */ js.UndefOr[Double], 
              /* bottom */ js.UndefOr[Double], 
              /* left */ js.UndefOr[Double], 
              /* right */ js.UndefOr[Double], 
              /* shrinkToFit */ js.UndefOr[Boolean], 
              /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
              String
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
                js.Function11[
                  /* orientation */ js.UndefOr[String], 
                  /* scale */ js.UndefOr[Double], 
                  /* background */ js.UndefOr[Boolean], 
                  /* width */ js.UndefOr[Double], 
                  /* height */ js.UndefOr[Double], 
                  /* top */ js.UndefOr[Double], 
                  /* bottom */ js.UndefOr[Double], 
                  /* left */ js.UndefOr[Double], 
                  /* right */ js.UndefOr[Double], 
                  /* shrinkToFit */ js.UndefOr[Boolean], 
                  /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                  String
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function11[
                    /* orientation */ js.UndefOr[String], 
                    /* scale */ js.UndefOr[Double], 
                    /* background */ js.UndefOr[Boolean], 
                    /* width */ js.UndefOr[Double], 
                    /* height */ js.UndefOr[Double], 
                    /* top */ js.UndefOr[Double], 
                    /* bottom */ js.UndefOr[Double], 
                    /* left */ js.UndefOr[Double], 
                    /* right */ js.UndefOr[Double], 
                    /* shrinkToFit */ js.UndefOr[Boolean], 
                    /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                    String
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def pullFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* path */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("pullFile")
  var pullFile_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* path */ String, String]], 
              js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def pullFolder(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("pullFolder")
  var pullFolder_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def pushFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("pushFile")
  var pushFile_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def queryAppState(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("queryAppState")
  var queryAppState_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
              js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def queryGrid(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("queryGrid")
  var queryGrid_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
            ]
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
  
  def receiveAsyncResponse(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("receiveAsyncResponse")
  var receiveAsyncResponse_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
              js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def refresh(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("refresh")
  var refresh_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def releaseActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("releaseActions")
  var releaseActions_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
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
  
  def removeAllCredentials(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("removeAllCredentials")
  var removeAllCredentials_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def removeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("removeApp")
  var removeApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def removeCredential(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("removeCredential")
  var removeCredential_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
              js.Promise[
                ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def removeVirtualAuthenticator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("removeVirtualAuthenticator")
  var removeVirtualAuthenticator_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def replaceValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("replaceValue")
  var replaceValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def reset(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("reset")
  var reset_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def respondMock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("respondMock")
  var respondMock_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
              js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def resume(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("resume")
  var resume_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def rotateDevice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function7[
            /* x */ Double, 
            /* y */ Double, 
            /* radius */ Double, 
            /* rotation */ Double, 
            /* touchCount */ Double, 
            /* duration */ Double, 
            /* element */ js.UndefOr[String], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function7[
              /* x */ Double, 
              /* y */ Double, 
              /* radius */ Double, 
              /* rotation */ Double, 
              /* touchCount */ Double, 
              /* duration */ Double, 
              /* element */ js.UndefOr[String], 
              Unit
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
              js.Function7[
                /* x */ Double, 
                /* y */ Double, 
                /* radius */ Double, 
                /* rotation */ Double, 
                /* touchCount */ Double, 
                /* duration */ Double, 
                /* element */ js.UndefOr[String], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function7[
                  /* x */ Double, 
                  /* y */ Double, 
                  /* radius */ Double, 
                  /* rotation */ Double, 
                  /* touchCount */ Double, 
                  /* duration */ Double, 
                  /* element */ js.UndefOr[String], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("rotateDevice")
  var rotateDevice_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function7[
            /* x */ Double, 
            /* y */ Double, 
            /* radius */ Double, 
            /* rotation */ Double, 
            /* touchCount */ Double, 
            /* duration */ Double, 
            /* element */ js.UndefOr[String], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function7[
              /* x */ Double, 
              /* y */ Double, 
              /* radius */ Double, 
              /* rotation */ Double, 
              /* touchCount */ Double, 
              /* duration */ Double, 
              /* element */ js.UndefOr[String], 
              Unit
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
                js.Function7[
                  /* x */ Double, 
                  /* y */ Double, 
                  /* radius */ Double, 
                  /* rotation */ Double, 
                  /* touchCount */ Double, 
                  /* duration */ Double, 
                  /* element */ js.UndefOr[String], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function7[
                    /* x */ Double, 
                    /* y */ Double, 
                    /* radius */ Double, 
                    /* rotation */ Double, 
                    /* touchCount */ Double, 
                    /* duration */ Double, 
                    /* element */ js.UndefOr[String], 
                    Unit
                  ]
                ]
              ]
            ]
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
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
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
  
  def scrollIntoView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
        ]
      ]
    ]
  ]
  @JSName("scrollIntoView")
  var scrollIntoView_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def selectByAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
        ]
      ]
    ]
  ]
  @JSName("selectByAttribute")
  var selectByAttribute_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def selectByIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
        ]
      ]
    ]
  ]
  @JSName("selectByIndex")
  var selectByIndex_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def selectByVisibleText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
        ]
      ]
    ]
  ]
  @JSName("selectByVisibleText")
  var selectByVisibleText_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def selectCastSink(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("selectCastSink")
  var selectCastSink_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def sendAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("sendAlertText")
  var sendAlertText_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def sendCommand(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  
  def sendCommandAndGetResult(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
            js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("sendCommandAndGetResult")
  var sendCommandAndGetResult_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
              js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("sendCommand")
  var sendCommand_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
              js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def sendKeyEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("sendKeyEvent")
  var sendKeyEvent_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
              js.Promise[
                ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def sendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
        js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
            js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("sendKeys")
  var sendKeys_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
        js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
              js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def sendSms(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("sendSms")
  var sendSms_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setAsyncTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setAsyncTimeout")
  var setAsyncTimeout_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
              js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
            js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setAutoReporting")
  var setAutoReporting_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
              js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* content */ String, 
              /* contentType */ js.UndefOr[String], 
              /* label */ js.UndefOr[String], 
              String
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
              js.Function3[
                /* content */ String, 
                /* contentType */ js.UndefOr[String], 
                /* label */ js.UndefOr[String], 
                String
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* content */ String, 
                  /* contentType */ js.UndefOr[String], 
                  /* label */ js.UndefOr[String], 
                  String
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setClipboard")
  var setClipboard_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* content */ String, 
              /* contentType */ js.UndefOr[String], 
              /* label */ js.UndefOr[String], 
              String
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
                js.Function3[
                  /* content */ String, 
                  /* contentType */ js.UndefOr[String], 
                  /* label */ js.UndefOr[String], 
                  String
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* content */ String, 
                    /* contentType */ js.UndefOr[String], 
                    /* label */ js.UndefOr[String], 
                    String
                  ]
                ]
              ]
            ]
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
  
  def setGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setGeoLocation")
  var setGeoLocation_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
              js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setImplicitTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setImplicitTimeout")
  var setImplicitTimeout_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
              js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setLocalStorage")
  var setLocalStorage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
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
              js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setNetworkConditions")
  var setNetworkConditions_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
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
                js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
              ], 
              js.Promise[
                ReturnType[
                  js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
        js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
            js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setNetworkConnection")
  var setNetworkConnection_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
        js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
              js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setOrientation")
  var setOrientation_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setPermissions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* descriptor */ js.Object, 
              /* state */ String, 
              /* oneRealm */ js.UndefOr[Boolean], 
              Unit
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
              js.Function3[
                /* descriptor */ js.Object, 
                /* state */ String, 
                /* oneRealm */ js.UndefOr[Boolean], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* descriptor */ js.Object, 
                  /* state */ String, 
                  /* oneRealm */ js.UndefOr[Boolean], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setPermissions")
  var setPermissions_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* descriptor */ js.Object, 
              /* state */ String, 
              /* oneRealm */ js.UndefOr[Boolean], 
              Unit
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
                js.Function3[
                  /* descriptor */ js.Object, 
                  /* state */ String, 
                  /* oneRealm */ js.UndefOr[Boolean], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* descriptor */ js.Object, 
                    /* state */ String, 
                    /* oneRealm */ js.UndefOr[Boolean], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setSessionStorage")
  var setSessionStorage_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setTimeZone(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setTimeZone")
  var setTimeZone_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
            ]
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
  
  def setTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* implicit */ js.UndefOr[Double], 
              /* pageLoad */ js.UndefOr[Double], 
              /* script */ js.UndefOr[Double], 
              Unit
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
              js.Function3[
                /* implicit */ js.UndefOr[Double], 
                /* pageLoad */ js.UndefOr[Double], 
                /* script */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* implicit */ js.UndefOr[Double], 
                  /* pageLoad */ js.UndefOr[Double], 
                  /* script */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setTimeouts")
  var setTimeouts_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[
              /* implicit */ js.UndefOr[Double], 
              /* pageLoad */ js.UndefOr[Double], 
              /* script */ js.UndefOr[Double], 
              Unit
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
                js.Function3[
                  /* implicit */ js.UndefOr[Double], 
                  /* pageLoad */ js.UndefOr[Double], 
                  /* script */ js.UndefOr[Double], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[
                    /* implicit */ js.UndefOr[Double], 
                    /* pageLoad */ js.UndefOr[Double], 
                    /* script */ js.UndefOr[Double], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setUserVerified(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setUserVerified")
  var setUserVerified_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
              js.Promise[
                ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
        ]
      ]
    ]
  ]
  
  def setValueImmediate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("setValueImmediate")
  var setValueImmediate_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
              js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("setValue")
  var setValue_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def setWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
        js.Promise[
          ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
            js.Promise[
              ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setWindowPosition")
  var setWindowPosition_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
        js.Promise[
          ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
              js.Promise[
                ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* x */ Double | Null, 
            /* y */ Double | Null, 
            /* width */ Double | Null, 
            /* height */ Double | Null, 
            RectReturn
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* x */ Double | Null, 
              /* y */ Double | Null, 
              /* width */ Double | Null, 
              /* height */ Double | Null, 
              RectReturn
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
              js.Function4[
                /* x */ Double | Null, 
                /* y */ Double | Null, 
                /* width */ Double | Null, 
                /* height */ Double | Null, 
                RectReturn
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* x */ Double | Null, 
                  /* y */ Double | Null, 
                  /* width */ Double | Null, 
                  /* height */ Double | Null, 
                  RectReturn
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setWindowRect")
  var setWindowRect_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* x */ Double | Null, 
            /* y */ Double | Null, 
            /* width */ Double | Null, 
            /* height */ Double | Null, 
            RectReturn
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* x */ Double | Null, 
              /* y */ Double | Null, 
              /* width */ Double | Null, 
              /* height */ Double | Null, 
              RectReturn
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
                js.Function4[
                  /* x */ Double | Null, 
                  /* y */ Double | Null, 
                  /* width */ Double | Null, 
                  /* height */ Double | Null, 
                  RectReturn
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function4[
                    /* x */ Double | Null, 
                    /* y */ Double | Null, 
                    /* width */ Double | Null, 
                    /* height */ Double | Null, 
                    RectReturn
                  ]
                ]
              ]
            ]
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
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
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
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
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
  
  def shake(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("shake")
  var shake_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def shutdown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("shutdown")
  var shutdown_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def startActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function9[
            /* appPackage */ String, 
            /* appActivity */ String, 
            /* appWaitPackage */ js.UndefOr[String], 
            /* appWaitActivity */ js.UndefOr[String], 
            /* intentAction */ js.UndefOr[String], 
            /* intentCategory */ js.UndefOr[String], 
            /* intentFlags */ js.UndefOr[String], 
            /* optionalIntentArguments */ js.UndefOr[String], 
            /* dontStopAppOnReset */ js.UndefOr[String], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function9[
              /* appPackage */ String, 
              /* appActivity */ String, 
              /* appWaitPackage */ js.UndefOr[String], 
              /* appWaitActivity */ js.UndefOr[String], 
              /* intentAction */ js.UndefOr[String], 
              /* intentCategory */ js.UndefOr[String], 
              /* intentFlags */ js.UndefOr[String], 
              /* optionalIntentArguments */ js.UndefOr[String], 
              /* dontStopAppOnReset */ js.UndefOr[String], 
              Unit
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
              js.Function9[
                /* appPackage */ String, 
                /* appActivity */ String, 
                /* appWaitPackage */ js.UndefOr[String], 
                /* appWaitActivity */ js.UndefOr[String], 
                /* intentAction */ js.UndefOr[String], 
                /* intentCategory */ js.UndefOr[String], 
                /* intentFlags */ js.UndefOr[String], 
                /* optionalIntentArguments */ js.UndefOr[String], 
                /* dontStopAppOnReset */ js.UndefOr[String], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function9[
                  /* appPackage */ String, 
                  /* appActivity */ String, 
                  /* appWaitPackage */ js.UndefOr[String], 
                  /* appWaitActivity */ js.UndefOr[String], 
                  /* intentAction */ js.UndefOr[String], 
                  /* intentCategory */ js.UndefOr[String], 
                  /* intentFlags */ js.UndefOr[String], 
                  /* optionalIntentArguments */ js.UndefOr[String], 
                  /* dontStopAppOnReset */ js.UndefOr[String], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("startActivity")
  var startActivity_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function9[
            /* appPackage */ String, 
            /* appActivity */ String, 
            /* appWaitPackage */ js.UndefOr[String], 
            /* appWaitActivity */ js.UndefOr[String], 
            /* intentAction */ js.UndefOr[String], 
            /* intentCategory */ js.UndefOr[String], 
            /* intentFlags */ js.UndefOr[String], 
            /* optionalIntentArguments */ js.UndefOr[String], 
            /* dontStopAppOnReset */ js.UndefOr[String], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function9[
              /* appPackage */ String, 
              /* appActivity */ String, 
              /* appWaitPackage */ js.UndefOr[String], 
              /* appWaitActivity */ js.UndefOr[String], 
              /* intentAction */ js.UndefOr[String], 
              /* intentCategory */ js.UndefOr[String], 
              /* intentFlags */ js.UndefOr[String], 
              /* optionalIntentArguments */ js.UndefOr[String], 
              /* dontStopAppOnReset */ js.UndefOr[String], 
              Unit
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
                js.Function9[
                  /* appPackage */ String, 
                  /* appActivity */ String, 
                  /* appWaitPackage */ js.UndefOr[String], 
                  /* appWaitActivity */ js.UndefOr[String], 
                  /* intentAction */ js.UndefOr[String], 
                  /* intentCategory */ js.UndefOr[String], 
                  /* intentFlags */ js.UndefOr[String], 
                  /* optionalIntentArguments */ js.UndefOr[String], 
                  /* dontStopAppOnReset */ js.UndefOr[String], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function9[
                    /* appPackage */ String, 
                    /* appActivity */ String, 
                    /* appWaitPackage */ js.UndefOr[String], 
                    /* appWaitActivity */ js.UndefOr[String], 
                    /* intentAction */ js.UndefOr[String], 
                    /* intentCategory */ js.UndefOr[String], 
                    /* intentFlags */ js.UndefOr[String], 
                    /* optionalIntentArguments */ js.UndefOr[String], 
                    /* dontStopAppOnReset */ js.UndefOr[String], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def startCastTabMirroring(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("startCastTabMirroring")
  var startCastTabMirroring_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def startRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("startRecordingScreen")
  var startRecordingScreen_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
              js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def status(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[StatusReturn]], 
        js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[StatusReturn]], 
            js.Promise[ReturnType[js.Function0[StatusReturn]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("status")
  var status_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[StatusReturn]], 
        js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[StatusReturn]], 
              js.Promise[ReturnType[js.Function0[StatusReturn]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def stopCasting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("stopCasting")
  var stopCasting_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def stopRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* remotePath */ js.UndefOr[String], 
            /* username */ js.UndefOr[String], 
            /* password */ js.UndefOr[String], 
            /* method */ js.UndefOr[String], 
            String
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* remotePath */ js.UndefOr[String], 
              /* username */ js.UndefOr[String], 
              /* password */ js.UndefOr[String], 
              /* method */ js.UndefOr[String], 
              String
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
              js.Function4[
                /* remotePath */ js.UndefOr[String], 
                /* username */ js.UndefOr[String], 
                /* password */ js.UndefOr[String], 
                /* method */ js.UndefOr[String], 
                String
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* remotePath */ js.UndefOr[String], 
                  /* username */ js.UndefOr[String], 
                  /* password */ js.UndefOr[String], 
                  /* method */ js.UndefOr[String], 
                  String
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("stopRecordingScreen")
  var stopRecordingScreen_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* remotePath */ js.UndefOr[String], 
            /* username */ js.UndefOr[String], 
            /* password */ js.UndefOr[String], 
            /* method */ js.UndefOr[String], 
            String
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* remotePath */ js.UndefOr[String], 
              /* username */ js.UndefOr[String], 
              /* password */ js.UndefOr[String], 
              /* method */ js.UndefOr[String], 
              String
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
                js.Function4[
                  /* remotePath */ js.UndefOr[String], 
                  /* username */ js.UndefOr[String], 
                  /* password */ js.UndefOr[String], 
                  /* method */ js.UndefOr[String], 
                  String
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function4[
                    /* remotePath */ js.UndefOr[String], 
                    /* username */ js.UndefOr[String], 
                    /* password */ js.UndefOr[String], 
                    /* method */ js.UndefOr[String], 
                    String
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def switchContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("switchContext")
  var switchContext_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def switchToFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
            js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("switchToFrame")
  var switchToFrame_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
              js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def switchToParentFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("switchToParentFrame")
  var switchToParentFrame_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def switchToWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("switchToWindow")
  var switchToWindow_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
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
  
  def takeElementScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
            js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("takeElementScreenshot")
  var takeElementScreenshot_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
              js.Promise[
                ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def takeHeapSnapshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("takeHeapSnapshot")
  var takeHeapSnapshot_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
              js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def takeScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("takeScreenshot")
  var takeScreenshot_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[String]], 
              js.Promise[ReturnType[js.Function0[String]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def terminateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("terminateApp")
  var terminateApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
            ]
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
  
  def throttleCPU(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("throttleCPU")
  var throttleCPU_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
              js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def throttleNetwork(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("throttleNetwork")
  var throttleNetwork_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
              js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
            ]
          ]
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
  
  def toggleAirplaneMode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("toggleAirplaneMode")
  var toggleAirplaneMode_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def toggleData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("toggleData")
  var toggleData_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def toggleEnrollTouchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
            js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("toggleEnrollTouchId")
  var toggleEnrollTouchId_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
              js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def toggleLocationServices(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("toggleLocationServices")
  var toggleLocationServices_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def toggleNetworkSpeed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("toggleNetworkSpeed")
  var toggleNetworkSpeed_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def toggleWiFi(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("toggleWiFi")
  var toggleWiFi_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchAction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
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
  
  def touchClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchClick")
  var touchClick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchDoubleClick")
  var touchDoubleClick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchDown")
  var touchDown_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
              js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchFlick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function6[
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            /* element */ js.UndefOr[String], 
            /* speed */ js.UndefOr[Double], 
            /* xspeed */ js.UndefOr[Double], 
            /* yspeed */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function6[
              /* xoffset */ js.UndefOr[Double], 
              /* yoffset */ js.UndefOr[Double], 
              /* element */ js.UndefOr[String], 
              /* speed */ js.UndefOr[Double], 
              /* xspeed */ js.UndefOr[Double], 
              /* yspeed */ js.UndefOr[Double], 
              Unit
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
              js.Function6[
                /* xoffset */ js.UndefOr[Double], 
                /* yoffset */ js.UndefOr[Double], 
                /* element */ js.UndefOr[String], 
                /* speed */ js.UndefOr[Double], 
                /* xspeed */ js.UndefOr[Double], 
                /* yspeed */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function6[
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  /* element */ js.UndefOr[String], 
                  /* speed */ js.UndefOr[Double], 
                  /* xspeed */ js.UndefOr[Double], 
                  /* yspeed */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchFlick")
  var touchFlick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function6[
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            /* element */ js.UndefOr[String], 
            /* speed */ js.UndefOr[Double], 
            /* xspeed */ js.UndefOr[Double], 
            /* yspeed */ js.UndefOr[Double], 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function6[
              /* xoffset */ js.UndefOr[Double], 
              /* yoffset */ js.UndefOr[Double], 
              /* element */ js.UndefOr[String], 
              /* speed */ js.UndefOr[Double], 
              /* xspeed */ js.UndefOr[Double], 
              /* yspeed */ js.UndefOr[Double], 
              Unit
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
                js.Function6[
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  /* element */ js.UndefOr[String], 
                  /* speed */ js.UndefOr[Double], 
                  /* xspeed */ js.UndefOr[Double], 
                  /* yspeed */ js.UndefOr[Double], 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function6[
                    /* xoffset */ js.UndefOr[Double], 
                    /* yoffset */ js.UndefOr[Double], 
                    /* element */ js.UndefOr[String], 
                    /* speed */ js.UndefOr[Double], 
                    /* xspeed */ js.UndefOr[Double], 
                    /* yspeed */ js.UndefOr[Double], 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
        js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
            js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchId")
  var touchId_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
        js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
              js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchLongClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchLongClick")
  var touchLongClick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
              js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchMove(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchMove")
  var touchMove_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
              js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchPerform")
  var touchPerform_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
              js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchPinch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
        js.Promise[
          ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
        ]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
            js.Promise[
              ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchPinch")
  var touchPinch_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
        js.Promise[
          ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
        ]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
              js.Promise[
                ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchScroll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
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
              js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchScroll")
  var touchScroll_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
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
                js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
              ], 
              js.Promise[
                ReturnType[
                  js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchUp")
  var touchUp_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
              js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def unlock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("unlock")
  var unlock_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function0[Unit]], 
              js.Promise[ReturnType[js.Function0[Unit]]]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def updateMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* type */ String, 
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* type */ String, 
              /* mockSensorType */ String, 
              /* maxSamplingFrequency */ Double, 
              /* minSamplingFrequency */ Double, 
              Unit
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
              js.Function4[
                /* type */ String, 
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* type */ String, 
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("updateMockSensor")
  var updateMockSensor_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* type */ String, 
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function4[
              /* type */ String, 
              /* mockSensorType */ String, 
              /* maxSamplingFrequency */ Double, 
              /* minSamplingFrequency */ Double, 
              Unit
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
                js.Function4[
                  /* type */ String, 
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
                ]
              ], 
              js.Promise[
                ReturnType[
                  js.Function4[
                    /* type */ String, 
                    /* mockSensorType */ String, 
                    /* maxSamplingFrequency */ Double, 
                    /* minSamplingFrequency */ Double, 
                    Unit
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def updateSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommandsAsync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
      ]
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
          ]
        ]
      ]
    ]
  ]
  @JSName("updateSettings")
  var updateSettings_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
      ]
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            js.Function1[
              /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
              js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
            ]
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
  
  def waitForClickable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
        ]
      ]
    ]
  ]
  @JSName("waitForClickable")
  var waitForClickable_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def waitForDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
        ]
      ]
    ]
  ]
  @JSName("waitForDisplayed")
  var waitForDisplayed_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def waitForEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
        ]
      ]
    ]
  ]
  @JSName("waitForEnabled")
  var waitForEnabled_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def waitForExist(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ThenArg[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
        ]
      ]
    ]
  ]
  @JSName("waitForExist")
  var waitForExist_Original: js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
    ], 
    js.Promise[
      js.Array[
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
          ]
        ]
      ]
    ]
  ]
  
  def waitUntil(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsType[K]> is not an array type */ args: Parameters[
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
object MultiRemoteElementAsync {
  
  extension [Self <: MultiRemoteElementAsync](x: Self) {
    
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
    
    inline def setAcceptAlert(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "acceptAlert", js.Any.fromFunction1(value))
    
    inline def setActivateApp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "activateApp", js.Any.fromFunction1(value))
    
    inline def setActivateIME(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "activateIME", js.Any.fromFunction1(value))
    
    inline def setAddCommand(value: js.Function): Self = StObject.set(x, "addCommand", value.asInstanceOf[js.Any])
    
    inline def setAddCookie(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "addCookie", js.Any.fromFunction1(value))
    
    inline def setAddCredential(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function7[
                /* credentialId */ String, 
                /* isResidentCredential */ Boolean, 
                /* rpId */ String, 
                /* privateKey */ String, 
                /* userHandle */ String, 
                /* signCount */ Double, 
                /* largeBlob */ String, 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function7[
                  /* credentialId */ String, 
                  /* isResidentCredential */ Boolean, 
                  /* rpId */ String, 
                  /* privateKey */ String, 
                  /* userHandle */ String, 
                  /* signCount */ Double, 
                  /* largeBlob */ String, 
                  Unit
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
                    js.Function7[
                      /* credentialId */ String, 
                      /* isResidentCredential */ Boolean, 
                      /* rpId */ String, 
                      /* privateKey */ String, 
                      /* userHandle */ String, 
                      /* signCount */ Double, 
                      /* largeBlob */ String, 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function7[
                        /* credentialId */ String, 
                        /* isResidentCredential */ Boolean, 
                        /* rpId */ String, 
                        /* privateKey */ String, 
                        /* userHandle */ String, 
                        /* signCount */ Double, 
                        /* largeBlob */ String, 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "addCredential", js.Any.fromFunction1(value))
    
    inline def setAddValue(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "addValue", js.Any.fromFunction1(value))
    
    inline def setAddVirtualAuthenticator(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function8[
                /* protocol */ js.UndefOr[String], 
                /* transport */ js.UndefOr[String], 
                /* hasResidentKey */ js.UndefOr[Boolean], 
                /* hasUserVerification */ js.UndefOr[Boolean], 
                /* isUserConsenting */ js.UndefOr[Boolean], 
                /* isUserVerified */ js.UndefOr[Boolean], 
                /* extensions */ js.UndefOr[js.Array[String]], 
                /* uvm */ js.UndefOr[js.Array[js.Object]], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function8[
                  /* protocol */ js.UndefOr[String], 
                  /* transport */ js.UndefOr[String], 
                  /* hasResidentKey */ js.UndefOr[Boolean], 
                  /* hasUserVerification */ js.UndefOr[Boolean], 
                  /* isUserConsenting */ js.UndefOr[Boolean], 
                  /* isUserVerified */ js.UndefOr[Boolean], 
                  /* extensions */ js.UndefOr[js.Array[String]], 
                  /* uvm */ js.UndefOr[js.Array[js.Object]], 
                  Unit
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
                    js.Function8[
                      /* protocol */ js.UndefOr[String], 
                      /* transport */ js.UndefOr[String], 
                      /* hasResidentKey */ js.UndefOr[Boolean], 
                      /* hasUserVerification */ js.UndefOr[Boolean], 
                      /* isUserConsenting */ js.UndefOr[Boolean], 
                      /* isUserVerified */ js.UndefOr[Boolean], 
                      /* extensions */ js.UndefOr[js.Array[String]], 
                      /* uvm */ js.UndefOr[js.Array[js.Object]], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function8[
                        /* protocol */ js.UndefOr[String], 
                        /* transport */ js.UndefOr[String], 
                        /* hasResidentKey */ js.UndefOr[Boolean], 
                        /* hasUserVerification */ js.UndefOr[Boolean], 
                        /* isUserConsenting */ js.UndefOr[Boolean], 
                        /* isUserVerified */ js.UndefOr[Boolean], 
                        /* extensions */ js.UndefOr[js.Array[String]], 
                        /* uvm */ js.UndefOr[js.Array[js.Object]], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "addVirtualAuthenticator", js.Any.fromFunction1(value))
    
    inline def setAssertPerformance(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function2[
                /* name */ String, 
                /* metrics */ js.UndefOr[js.Array[String]], 
                ProtocolCommandResponse
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* name */ String, 
                  /* metrics */ js.UndefOr[js.Array[String]], 
                  ProtocolCommandResponse
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
                    js.Function2[
                      /* name */ String, 
                      /* metrics */ js.UndefOr[js.Array[String]], 
                      ProtocolCommandResponse
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function2[
                        /* name */ String, 
                        /* metrics */ js.UndefOr[js.Array[String]], 
                        ProtocolCommandResponse
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "assertPerformance", js.Any.fromFunction1(value))
    
    inline def setBack(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
    
    inline def setBackground(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
            js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "background", js.Any.fromFunction1(value))
    
    inline def setButtonDown(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "buttonDown", js.Any.fromFunction1(value))
    
    inline def setButtonUp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "buttonUp", js.Any.fromFunction1(value))
    
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
    
    inline def setClearLocalStorage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "clearLocalStorage", js.Any.fromFunction1(value))
    
    inline def setClearMockCalls(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
                  js.Promise[
                    ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "clearMockCalls", js.Any.fromFunction1(value))
    
    inline def setClearSessionStorage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "clearSessionStorage", js.Any.fromFunction1(value))
    
    inline def setClearValue(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "clearValue", js.Any.fromFunction1(value))
    
    inline def setClick(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setCloseApp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "closeApp", js.Any.fromFunction1(value))
    
    inline def setCloseWindow(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "closeWindow", js.Any.fromFunction1(value))
    
    inline def setCompareImages(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function4[
                /* mode */ String, 
                /* firstImage */ String, 
                /* secondImage */ String, 
                /* options */ js.Object, 
                ProtocolCommandResponse
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* mode */ String, 
                  /* firstImage */ String, 
                  /* secondImage */ String, 
                  /* options */ js.Object, 
                  ProtocolCommandResponse
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
                    js.Function4[
                      /* mode */ String, 
                      /* firstImage */ String, 
                      /* secondImage */ String, 
                      /* options */ js.Object, 
                      ProtocolCommandResponse
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function4[
                        /* mode */ String, 
                        /* firstImage */ String, 
                        /* secondImage */ String, 
                        /* options */ js.Object, 
                        ProtocolCommandResponse
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "compareImages", js.Any.fromFunction1(value))
    
    inline def setCreateMockSensor(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
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
                    js.Function3[
                      /* mockSensorType */ String, 
                      /* maxSamplingFrequency */ Double, 
                      /* minSamplingFrequency */ Double, 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* mockSensorType */ String, 
                        /* maxSamplingFrequency */ Double, 
                        /* minSamplingFrequency */ Double, 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "createMockSensor", js.Any.fromFunction1(value))
    
    inline def setCreateWindow(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
            js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
                  js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "createWindow", js.Any.fromFunction1(value))
    
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
    
    inline def setDeactivateIME(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deactivateIME", js.Any.fromFunction1(value))
    
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
    
    inline def setDeleteAllCookies(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteAllCookies", js.Any.fromFunction1(value))
    
    inline def setDeleteCookie(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteCookie", js.Any.fromFunction1(value))
    
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
    
    inline def setDeleteLocalStorageItem(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteLocalStorageItem", js.Any.fromFunction1(value))
    
    inline def setDeleteMockSensor(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteMockSensor", js.Any.fromFunction1(value))
    
    inline def setDeleteNetworkConditions(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteNetworkConditions", js.Any.fromFunction1(value))
    
    inline def setDeleteSession(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
    
    inline def setDeleteSessionStorageItem(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "deleteSessionStorageItem", js.Any.fromFunction1(value))
    
    inline def setDismissAlert(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "dismissAlert", js.Any.fromFunction1(value))
    
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
    
    inline def setDoubleClick(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
    
    inline def setDragAndDrop(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "dragAndDrop", js.Any.fromFunction1(value))
    
    inline def setDriverScript(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* script */ String, 
                /* type */ js.UndefOr[String], 
                /* timeout */ js.UndefOr[Double], 
                ProtocolCommandResponse
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* script */ String, 
                  /* type */ js.UndefOr[String], 
                  /* timeout */ js.UndefOr[Double], 
                  ProtocolCommandResponse
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
                    js.Function3[
                      /* script */ String, 
                      /* type */ js.UndefOr[String], 
                      /* timeout */ js.UndefOr[Double], 
                      ProtocolCommandResponse
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* script */ String, 
                        /* type */ js.UndefOr[String], 
                        /* timeout */ js.UndefOr[Double], 
                        ProtocolCommandResponse
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "driverScript", js.Any.fromFunction1(value))
    
    inline def setElementClear(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "elementClear", js.Any.fromFunction1(value))
    
    inline def setElementClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "elementClick", js.Any.fromFunction1(value))
    
    inline def setElementEquals(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
            js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
                  js.Promise[
                    ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "elementEquals", js.Any.fromFunction1(value))
    
    inline def setElementHover(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "elementHover", js.Any.fromFunction1(value))
    
    inline def setElementSendKeys(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "elementSendKeys", js.Any.fromFunction1(value))
    
    inline def setElementSubmit(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "elementSubmit", js.Any.fromFunction1(value))
    
    inline def setEndCoverage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "endCoverage", js.Any.fromFunction1(value))
    
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
    
    inline def setExecuteAsyncScript(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
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
                    js.Function2[
                      /* script */ String, 
                      /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                      Any
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function2[
                        /* script */ String, 
                        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                        Any
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "executeAsyncScript", js.Any.fromFunction1(value))
    
    inline def setExecuteScript(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
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
                    js.Function2[
                      /* script */ String, 
                      /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                      Any
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function2[
                        /* script */ String, 
                        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                        Any
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "executeScript", js.Any.fromFunction1(value))
    
    inline def setFile(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* file */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* file */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
    
    inline def setFindElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
            js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
                  js.Promise[
                    ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElement", js.Any.fromFunction1(value))
    
    inline def setFindElementFromElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElementFromElement", js.Any.fromFunction1(value))
    
    inline def setFindElementFromShadowRoot(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElementFromShadowRoot", js.Any.fromFunction1(value))
    
    inline def setFindElements(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
            js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
                  js.Promise[
                    ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElements", js.Any.fromFunction1(value))
    
    inline def setFindElementsFromElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* elementId */ String, 
                /* using */ String, 
                /* value */ String, 
                js.Array[ElementReference]
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* elementId */ String, 
                  /* using */ String, 
                  /* value */ String, 
                  js.Array[ElementReference]
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
                    js.Function3[
                      /* elementId */ String, 
                      /* using */ String, 
                      /* value */ String, 
                      js.Array[ElementReference]
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* elementId */ String, 
                        /* using */ String, 
                        /* value */ String, 
                        js.Array[ElementReference]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElementsFromElement", js.Any.fromFunction1(value))
    
    inline def setFindElementsFromShadowRoot(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElementsFromShadowRoot", js.Any.fromFunction1(value))
    
    inline def setFingerPrint(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "fingerPrint", js.Any.fromFunction1(value))
    
    inline def setForward(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
    
    inline def setFreeze(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "freeze", js.Any.fromFunction1(value))
    
    inline def setFullscreenWindow(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[RectReturn]], 
                  js.Promise[ReturnType[js.Function0[RectReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "fullscreenWindow", js.Any.fromFunction1(value))
    
    inline def setGenerateTestReport(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "generateTestReport", js.Any.fromFunction1(value))
    
    inline def setGetActiveElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
    
    inline def setGetActiveEngine(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getActiveEngine", js.Any.fromFunction1(value))
    
    inline def setGetAlertText(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getAlertText", js.Any.fromFunction1(value))
    
    inline def setGetAllCookies(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
            js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getAllCookies", js.Any.fromFunction1(value))
    
    inline def setGetApplicationCacheStatus(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Double]], 
                  js.Promise[ReturnType[js.Function0[Double]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getApplicationCacheStatus", js.Any.fromFunction1(value))
    
    inline def setGetAttribute(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetAvailableEngines(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[String]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[String]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getAvailableEngines", js.Any.fromFunction1(value))
    
    inline def setGetCSSProperty(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCSSProperty", js.Any.fromFunction1(value))
    
    inline def setGetCastIssueMessage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCastIssueMessage", js.Any.fromFunction1(value))
    
    inline def setGetCastSinks(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[String]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[String]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCastSinks", js.Any.fromFunction1(value))
    
    inline def setGetClipboard(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
            js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
                  js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
    
    inline def setGetComputedLabel(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getComputedLabel", js.Any.fromFunction1(value))
    
    inline def setGetComputedRole(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getComputedRole", js.Any.fromFunction1(value))
    
    inline def setGetContext(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Context]], 
            js.Promise[ReturnType[js.Function0[Context]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Context]], 
                  js.Promise[ReturnType[js.Function0[Context]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    inline def setGetContexts(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[Context]]], 
            js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[Context]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getContexts", js.Any.fromFunction1(value))
    
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
    
    inline def setGetCredentials(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCredentials", js.Any.fromFunction1(value))
    
    inline def setGetCurrentActivity(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCurrentActivity", js.Any.fromFunction1(value))
    
    inline def setGetCurrentPackage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCurrentPackage", js.Any.fromFunction1(value))
    
    inline def setGetDeviceTime(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getDeviceTime", js.Any.fromFunction1(value))
    
    inline def setGetDisplayDensity(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Any]], 
            js.Promise[ReturnType[js.Function0[Any]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Any]], 
                  js.Promise[ReturnType[js.Function0[Any]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getDisplayDensity", js.Any.fromFunction1(value))
    
    inline def setGetElementAttribute(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
                  js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementAttribute", js.Any.fromFunction1(value))
    
    inline def setGetElementCSSValue(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
            js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
                  js.Promise[
                    ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementCSSValue", js.Any.fromFunction1(value))
    
    inline def setGetElementComputedLabel(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementComputedLabel", js.Any.fromFunction1(value))
    
    inline def setGetElementComputedRole(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementComputedRole", js.Any.fromFunction1(value))
    
    inline def setGetElementLocation(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementLocation", js.Any.fromFunction1(value))
    
    inline def setGetElementLocationInView(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementLocationInView", js.Any.fromFunction1(value))
    
    inline def setGetElementProperty(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
                  js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementProperty", js.Any.fromFunction1(value))
    
    inline def setGetElementRect(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementRect", js.Any.fromFunction1(value))
    
    inline def setGetElementShadowRoot(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementShadowRoot", js.Any.fromFunction1(value))
    
    inline def setGetElementSize(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
    
    inline def setGetElementTagName(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementTagName", js.Any.fromFunction1(value))
    
    inline def setGetElementText(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementText", js.Any.fromFunction1(value))
    
    inline def setGetElementValue(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getElementValue", js.Any.fromFunction1(value))
    
    inline def setGetEvents(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getEvents", js.Any.fromFunction1(value))
    
    inline def setGetGeoLocation(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getGeoLocation", js.Any.fromFunction1(value))
    
    inline def setGetHTML(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getHTML", js.Any.fromFunction1(value))
    
    inline def setGetHubConfig(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getHubConfig", js.Any.fromFunction1(value))
    
    inline def setGetLocalStorage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[String]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[String]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getLocalStorage", js.Any.fromFunction1(value))
    
    inline def setGetLocalStorageItem(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* key */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getLocalStorageItem", js.Any.fromFunction1(value))
    
    inline def setGetLocalStorageSize(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Double]], 
                  js.Promise[ReturnType[js.Function0[Double]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getLocalStorageSize", js.Any.fromFunction1(value))
    
    inline def setGetLocation(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocation */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocation */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getLocation", js.Any.fromFunction1(value))
    
    inline def setGetLogTypes(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[String]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[String]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getLogTypes", js.Any.fromFunction1(value))
    
    inline def setGetLogs(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
                  js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getLogs", js.Any.fromFunction1(value))
    
    inline def setGetMockCalls(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getMockCalls", js.Any.fromFunction1(value))
    
    inline def setGetMockSensor(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getMockSensor", js.Any.fromFunction1(value))
    
    inline def setGetNamedCookie(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
            js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
                  js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getNamedCookie", js.Any.fromFunction1(value))
    
    inline def setGetNetworkConditions(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getNetworkConditions", js.Any.fromFunction1(value))
    
    inline def setGetNetworkConnection(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Double]], 
                  js.Promise[ReturnType[js.Function0[Double]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getNetworkConnection", js.Any.fromFunction1(value))
    
    inline def setGetOrientation(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getOrientation", js.Any.fromFunction1(value))
    
    inline def setGetPageIndex(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction1(value))
    
    inline def setGetPageLogs(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getPageLogs", js.Any.fromFunction1(value))
    
    inline def setGetPageSource(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getPageSource", js.Any.fromFunction1(value))
    
    inline def setGetPerformanceData(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* packageName */ String, 
                /* dataType */ String, 
                /* dataReadTimeout */ js.UndefOr[Double], 
                js.Array[String]
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* packageName */ String, 
                  /* dataType */ String, 
                  /* dataReadTimeout */ js.UndefOr[Double], 
                  js.Array[String]
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
                    js.Function3[
                      /* packageName */ String, 
                      /* dataType */ String, 
                      /* dataReadTimeout */ js.UndefOr[Double], 
                      js.Array[String]
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* packageName */ String, 
                        /* dataType */ String, 
                        /* dataReadTimeout */ js.UndefOr[Double], 
                        js.Array[String]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getPerformanceData", js.Any.fromFunction1(value))
    
    inline def setGetPerformanceDataTypes(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[String]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[String]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getPerformanceDataTypes", js.Any.fromFunction1(value))
    
    inline def setGetProperty(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
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
    
    inline def setGetSession(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
    
    inline def setGetSessionStorage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[String]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[String]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSessionStorage", js.Any.fromFunction1(value))
    
    inline def setGetSessionStorageItem(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* key */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* key */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSessionStorageItem", js.Any.fromFunction1(value))
    
    inline def setGetSessionStorageSize(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Double]], 
            js.Promise[ReturnType[js.Function0[Double]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Double]], 
                  js.Promise[ReturnType[js.Function0[Double]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSessionStorageSize", js.Any.fromFunction1(value))
    
    inline def setGetSessions(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
            js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSessions", js.Any.fromFunction1(value))
    
    inline def setGetSettings(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[SettingsReturn]], 
            js.Promise[ReturnType[js.Function0[SettingsReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[SettingsReturn]], 
                  js.Promise[ReturnType[js.Function0[SettingsReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSettings", js.Any.fromFunction1(value))
    
    inline def setGetSize(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getSize */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getSize */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetStrings(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function2[
                /* language */ js.UndefOr[String], 
                /* stringFile */ js.UndefOr[String], 
                StringsReturn
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[
                  /* language */ js.UndefOr[String], 
                  /* stringFile */ js.UndefOr[String], 
                  StringsReturn
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
                    js.Function2[
                      /* language */ js.UndefOr[String], 
                      /* stringFile */ js.UndefOr[String], 
                      StringsReturn
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function2[
                        /* language */ js.UndefOr[String], 
                        /* stringFile */ js.UndefOr[String], 
                        StringsReturn
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getStrings", js.Any.fromFunction1(value))
    
    inline def setGetSystemBars(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
            js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSystemBars", js.Any.fromFunction1(value))
    
    inline def setGetTagName(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getTagName", js.Any.fromFunction1(value))
    
    inline def setGetText(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
    
    inline def setGetTimeouts(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Timeouts]], 
            js.Promise[ReturnType[js.Function0[Timeouts]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Timeouts]], 
                  js.Promise[ReturnType[js.Function0[Timeouts]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getTimeouts", js.Any.fromFunction1(value))
    
    inline def setGetTitle(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
    
    inline def setGetUrl(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
    
    inline def setGetValue(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setGetWindowHandle(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction1(value))
    
    inline def setGetWindowHandles(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[js.Array[String]]], 
            js.Promise[ReturnType[js.Function0[js.Array[String]]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[js.Array[String]]], 
                  js.Promise[ReturnType[js.Function0[js.Array[String]]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getWindowHandles", js.Any.fromFunction1(value))
    
    inline def setGetWindowPosition(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getWindowPosition", js.Any.fromFunction1(value))
    
    inline def setGetWindowRect(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[RectReturn]], 
                  js.Promise[ReturnType[js.Function0[RectReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getWindowRect", js.Any.fromFunction1(value))
    
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
    
    inline def setGridProxyDetails(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "gridProxyDetails", js.Any.fromFunction1(value))
    
    inline def setGridTestSession(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "gridTestSession", js.Any.fromFunction1(value))
    
    inline def setGsmCall(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "gsmCall", js.Any.fromFunction1(value))
    
    inline def setGsmSignal(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "gsmSignal", js.Any.fromFunction1(value))
    
    inline def setGsmVoice(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "gsmVoice", js.Any.fromFunction1(value))
    
    inline def setHideKeyboard(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function4[
                /* strategy */ js.UndefOr[String], 
                /* key */ js.UndefOr[String], 
                /* keyCode */ js.UndefOr[String], 
                /* keyName */ js.UndefOr[String], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* strategy */ js.UndefOr[String], 
                  /* key */ js.UndefOr[String], 
                  /* keyCode */ js.UndefOr[String], 
                  /* keyName */ js.UndefOr[String], 
                  Unit
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
                    js.Function4[
                      /* strategy */ js.UndefOr[String], 
                      /* key */ js.UndefOr[String], 
                      /* keyCode */ js.UndefOr[String], 
                      /* keyName */ js.UndefOr[String], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function4[
                        /* strategy */ js.UndefOr[String], 
                        /* key */ js.UndefOr[String], 
                        /* keyCode */ js.UndefOr[String], 
                        /* keyName */ js.UndefOr[String], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "hideKeyboard", js.Any.fromFunction1(value))
    
    inline def setInstallApp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "installApp", js.Any.fromFunction1(value))
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setInterceptRequest(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "interceptRequest", js.Any.fromFunction1(value))
    
    inline def setIsAlertOpen(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Boolean]], 
                  js.Promise[ReturnType[js.Function0[Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isAlertOpen", js.Any.fromFunction1(value))
    
    inline def setIsAppInstalled(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
                  js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isAppInstalled", js.Any.fromFunction1(value))
    
    inline def setIsAutoReporting(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Boolean]], 
                  js.Promise[ReturnType[js.Function0[Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isAutoReporting", js.Any.fromFunction1(value))
    
    inline def setIsClickable(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isClickable", js.Any.fromFunction1(value))
    
    inline def setIsDisplayed(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isDisplayed", js.Any.fromFunction1(value))
    
    inline def setIsDisplayedInViewport(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isDisplayedInViewport", js.Any.fromFunction1(value))
    
    inline def setIsElementDisplayed(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isElementDisplayed", js.Any.fromFunction1(value))
    
    inline def setIsElementEnabled(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isElementEnabled", js.Any.fromFunction1(value))
    
    inline def setIsElementSelected(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
            js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
                  js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isElementSelected", js.Any.fromFunction1(value))
    
    inline def setIsEnabled(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
    
    inline def setIsEqual(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setIsExisting(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isExisting", js.Any.fromFunction1(value))
    
    inline def setIsFocused(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isFocused", js.Any.fromFunction1(value))
    
    inline def setIsIMEActivated(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Boolean]], 
                  js.Promise[ReturnType[js.Function0[Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isIMEActivated", js.Any.fromFunction1(value))
    
    inline def setIsKeyboardShown(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Boolean]], 
                  js.Promise[ReturnType[js.Function0[Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isKeyboardShown", js.Any.fromFunction1(value))
    
    inline def setIsLoading(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Boolean]], 
                  js.Promise[ReturnType[js.Function0[Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
    
    inline def setIsLocked(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Boolean]], 
            js.Promise[ReturnType[js.Function0[Boolean]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Boolean]], 
                  js.Promise[ReturnType[js.Function0[Boolean]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isLocked", js.Any.fromFunction1(value))
    
    inline def setIsSelected(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    inline def setJankinessCheck(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "jankinessCheck", js.Any.fromFunction1(value))
    
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
    
    inline def setLaunchApp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "launchApp", js.Any.fromFunction1(value))
    
    inline def setLaunchChromeApp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "launchChromeApp", js.Any.fromFunction1(value))
    
    inline def setLock(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
    
    inline def setLogEvent(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
    
    inline def setLongPressKeyCode(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
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
                    js.Function3[
                      /* keycode */ Double, 
                      /* metastate */ js.UndefOr[Double], 
                      /* flags */ js.UndefOr[Double], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* keycode */ Double, 
                        /* metastate */ js.UndefOr[Double], 
                        /* flags */ js.UndefOr[Double], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "longPressKeyCode", js.Any.fromFunction1(value))
    
    inline def setManageSeleniumHubLifecycle(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "manageSeleniumHubLifecycle", js.Any.fromFunction1(value))
    
    inline def setMaximizeWindow(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[RectReturn]], 
                  js.Promise[ReturnType[js.Function0[RectReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "maximizeWindow", js.Any.fromFunction1(value))
    
    inline def setMinimizeWindow(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[RectReturn]], 
            js.Promise[ReturnType[js.Function0[RectReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[RectReturn]], 
                  js.Promise[ReturnType[js.Function0[RectReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "minimizeWindow", js.Any.fromFunction1(value))
    
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
    
    inline def setMockRequest(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "mockRequest", js.Any.fromFunction1(value))
    
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
    
    inline def setMoveTo(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
    
    inline def setMoveToElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* element */ js.UndefOr[String | Null], 
                /* xoffset */ js.UndefOr[Double], 
                /* yoffset */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* element */ js.UndefOr[String | Null], 
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  Unit
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
                    js.Function3[
                      /* element */ js.UndefOr[String | Null], 
                      /* xoffset */ js.UndefOr[Double], 
                      /* yoffset */ js.UndefOr[Double], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* element */ js.UndefOr[String | Null], 
                        /* xoffset */ js.UndefOr[Double], 
                        /* yoffset */ js.UndefOr[Double], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "moveToElement", js.Any.fromFunction1(value))
    
    inline def setMultiTouchPerform(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction1(value))
    
    inline def setNavigateTo(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* url */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* url */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "navigateTo", js.Any.fromFunction1(value))
    
    inline def setNewSession(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
            js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
                  js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "newSession", js.Any.fromFunction1(value))
    
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
    
    inline def setNextElement(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "nextElement", js.Any.fromFunction1(value))
    
    inline def setOpenNotifications(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "openNotifications", js.Any.fromFunction1(value))
    
    inline def setOverwriteCommand(value: js.Function): Self = StObject.set(x, "overwriteCommand", value.asInstanceOf[js.Any])
    
    inline def setParentElement(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "parentElement", js.Any.fromFunction1(value))
    
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
    
    inline def setPerformActions(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "performActions", js.Any.fromFunction1(value))
    
    inline def setPositionClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
            js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "positionClick", js.Any.fromFunction1(value))
    
    inline def setPositionDoubleClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "positionDoubleClick", js.Any.fromFunction1(value))
    
    inline def setPowerAC(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "powerAC", js.Any.fromFunction1(value))
    
    inline def setPowerCapacity(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "powerCapacity", js.Any.fromFunction1(value))
    
    inline def setPressKeyCode(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
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
                    js.Function3[
                      /* keycode */ Double, 
                      /* metastate */ js.UndefOr[Double], 
                      /* flags */ js.UndefOr[Double], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* keycode */ Double, 
                        /* metastate */ js.UndefOr[Double], 
                        /* flags */ js.UndefOr[Double], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "pressKeyCode", js.Any.fromFunction1(value))
    
    inline def setPreviousElement(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "previousElement", js.Any.fromFunction1(value))
    
    inline def setPrintPage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function11[
                /* orientation */ js.UndefOr[String], 
                /* scale */ js.UndefOr[Double], 
                /* background */ js.UndefOr[Boolean], 
                /* width */ js.UndefOr[Double], 
                /* height */ js.UndefOr[Double], 
                /* top */ js.UndefOr[Double], 
                /* bottom */ js.UndefOr[Double], 
                /* left */ js.UndefOr[Double], 
                /* right */ js.UndefOr[Double], 
                /* shrinkToFit */ js.UndefOr[Boolean], 
                /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                String
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function11[
                  /* orientation */ js.UndefOr[String], 
                  /* scale */ js.UndefOr[Double], 
                  /* background */ js.UndefOr[Boolean], 
                  /* width */ js.UndefOr[Double], 
                  /* height */ js.UndefOr[Double], 
                  /* top */ js.UndefOr[Double], 
                  /* bottom */ js.UndefOr[Double], 
                  /* left */ js.UndefOr[Double], 
                  /* right */ js.UndefOr[Double], 
                  /* shrinkToFit */ js.UndefOr[Boolean], 
                  /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                  String
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
                    js.Function11[
                      /* orientation */ js.UndefOr[String], 
                      /* scale */ js.UndefOr[Double], 
                      /* background */ js.UndefOr[Boolean], 
                      /* width */ js.UndefOr[Double], 
                      /* height */ js.UndefOr[Double], 
                      /* top */ js.UndefOr[Double], 
                      /* bottom */ js.UndefOr[Double], 
                      /* left */ js.UndefOr[Double], 
                      /* right */ js.UndefOr[Double], 
                      /* shrinkToFit */ js.UndefOr[Boolean], 
                      /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                      String
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function11[
                        /* orientation */ js.UndefOr[String], 
                        /* scale */ js.UndefOr[Double], 
                        /* background */ js.UndefOr[Boolean], 
                        /* width */ js.UndefOr[Double], 
                        /* height */ js.UndefOr[Double], 
                        /* top */ js.UndefOr[Double], 
                        /* bottom */ js.UndefOr[Double], 
                        /* left */ js.UndefOr[Double], 
                        /* right */ js.UndefOr[Double], 
                        /* shrinkToFit */ js.UndefOr[Boolean], 
                        /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
                        String
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "printPage", js.Any.fromFunction1(value))
    
    inline def setPullFile(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* path */ String, String]], 
            js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* path */ String, String]], 
                  js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "pullFile", js.Any.fromFunction1(value))
    
    inline def setPullFolder(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "pullFolder", js.Any.fromFunction1(value))
    
    inline def setPushFile(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "pushFile", js.Any.fromFunction1(value))
    
    inline def setQueryAppState(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
                  js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "queryAppState", js.Any.fromFunction1(value))
    
    inline def setQueryGrid(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "queryGrid", js.Any.fromFunction1(value))
    
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
    
    inline def setReceiveAsyncResponse(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction1(value))
    
    inline def setRefresh(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    
    inline def setReleaseActions(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "releaseActions", js.Any.fromFunction1(value))
    
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
    
    inline def setRemoveAllCredentials(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "removeAllCredentials", js.Any.fromFunction1(value))
    
    inline def setRemoveApp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
    
    inline def setRemoveCredential(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
                  js.Promise[
                    ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "removeCredential", js.Any.fromFunction1(value))
    
    inline def setRemoveVirtualAuthenticator(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "removeVirtualAuthenticator", js.Any.fromFunction1(value))
    
    inline def setReplaceValue(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "replaceValue", js.Any.fromFunction1(value))
    
    inline def setReset(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setRespondMock(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "respondMock", js.Any.fromFunction1(value))
    
    inline def setResume(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
    
    inline def setRotateDevice(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function7[
                /* x */ Double, 
                /* y */ Double, 
                /* radius */ Double, 
                /* rotation */ Double, 
                /* touchCount */ Double, 
                /* duration */ Double, 
                /* element */ js.UndefOr[String], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function7[
                  /* x */ Double, 
                  /* y */ Double, 
                  /* radius */ Double, 
                  /* rotation */ Double, 
                  /* touchCount */ Double, 
                  /* duration */ Double, 
                  /* element */ js.UndefOr[String], 
                  Unit
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
                    js.Function7[
                      /* x */ Double, 
                      /* y */ Double, 
                      /* radius */ Double, 
                      /* rotation */ Double, 
                      /* touchCount */ Double, 
                      /* duration */ Double, 
                      /* element */ js.UndefOr[String], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function7[
                        /* x */ Double, 
                        /* y */ Double, 
                        /* radius */ Double, 
                        /* rotation */ Double, 
                        /* touchCount */ Double, 
                        /* duration */ Double, 
                        /* element */ js.UndefOr[String], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "rotateDevice", js.Any.fromFunction1(value))
    
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
    
    inline def setScrollIntoView(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction1(value))
    
    inline def setSelectByAttribute(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "selectByAttribute", js.Any.fromFunction1(value))
    
    inline def setSelectByIndex(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "selectByIndex", js.Any.fromFunction1(value))
    
    inline def setSelectByVisibleText(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "selectByVisibleText", js.Any.fromFunction1(value))
    
    inline def setSelectCastSink(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "selectCastSink", js.Any.fromFunction1(value))
    
    inline def setSendAlertText(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "sendAlertText", js.Any.fromFunction1(value))
    
    inline def setSendCommand(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
    
    inline def setSendCommandAndGetResult(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
            js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
                  js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "sendCommandAndGetResult", js.Any.fromFunction1(value))
    
    inline def setSendKeyEvent(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
                  js.Promise[
                    ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "sendKeyEvent", js.Any.fromFunction1(value))
    
    inline def setSendKeys(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
            js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "sendKeys", js.Any.fromFunction1(value))
    
    inline def setSendSms(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "sendSms", js.Any.fromFunction1(value))
    
    inline def setSetAsyncTimeout(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setAsyncTimeout", js.Any.fromFunction1(value))
    
    inline def setSetAutoReporting(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
            js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
                  js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setAutoReporting", js.Any.fromFunction1(value))
    
    inline def setSetClipboard(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* content */ String, 
                /* contentType */ js.UndefOr[String], 
                /* label */ js.UndefOr[String], 
                String
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* content */ String, 
                  /* contentType */ js.UndefOr[String], 
                  /* label */ js.UndefOr[String], 
                  String
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
                    js.Function3[
                      /* content */ String, 
                      /* contentType */ js.UndefOr[String], 
                      /* label */ js.UndefOr[String], 
                      String
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* content */ String, 
                        /* contentType */ js.UndefOr[String], 
                        /* label */ js.UndefOr[String], 
                        String
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setClipboard", js.Any.fromFunction1(value))
    
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
    
    inline def setSetGeoLocation(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setGeoLocation", js.Any.fromFunction1(value))
    
    inline def setSetImplicitTimeout(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setImplicitTimeout", js.Any.fromFunction1(value))
    
    inline def setSetLocalStorage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setLocalStorage", js.Any.fromFunction1(value))
    
    inline def setSetNetworkConditions(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
            ], 
            js.Promise[
              ReturnType[
                js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setNetworkConditions", js.Any.fromFunction1(value))
    
    inline def setSetNetworkConnection(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
            js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
                  js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1(value))
    
    inline def setSetOrientation(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
    
    inline def setSetPermissions(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* descriptor */ js.Object, 
                /* state */ String, 
                /* oneRealm */ js.UndefOr[Boolean], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* descriptor */ js.Object, 
                  /* state */ String, 
                  /* oneRealm */ js.UndefOr[Boolean], 
                  Unit
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
                    js.Function3[
                      /* descriptor */ js.Object, 
                      /* state */ String, 
                      /* oneRealm */ js.UndefOr[Boolean], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* descriptor */ js.Object, 
                        /* state */ String, 
                        /* oneRealm */ js.UndefOr[Boolean], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setPermissions", js.Any.fromFunction1(value))
    
    inline def setSetSessionStorage(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setSessionStorage", js.Any.fromFunction1(value))
    
    inline def setSetTimeZone(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
    
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
    
    inline def setSetTimeouts(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[
                /* implicit */ js.UndefOr[Double], 
                /* pageLoad */ js.UndefOr[Double], 
                /* script */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[
                  /* implicit */ js.UndefOr[Double], 
                  /* pageLoad */ js.UndefOr[Double], 
                  /* script */ js.UndefOr[Double], 
                  Unit
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
                    js.Function3[
                      /* implicit */ js.UndefOr[Double], 
                      /* pageLoad */ js.UndefOr[Double], 
                      /* script */ js.UndefOr[Double], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[
                        /* implicit */ js.UndefOr[Double], 
                        /* pageLoad */ js.UndefOr[Double], 
                        /* script */ js.UndefOr[Double], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setTimeouts", js.Any.fromFunction1(value))
    
    inline def setSetUserVerified(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
            js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
                  js.Promise[
                    ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setUserVerified", js.Any.fromFunction1(value))
    
    inline def setSetValue(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueImmediate(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
            js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setValueImmediate", js.Any.fromFunction1(value))
    
    inline def setSetWindowPosition(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
            js.Promise[
              ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
                  js.Promise[
                    ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setWindowPosition", js.Any.fromFunction1(value))
    
    inline def setSetWindowRect(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function4[
                /* x */ Double | Null, 
                /* y */ Double | Null, 
                /* width */ Double | Null, 
                /* height */ Double | Null, 
                RectReturn
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* x */ Double | Null, 
                  /* y */ Double | Null, 
                  /* width */ Double | Null, 
                  /* height */ Double | Null, 
                  RectReturn
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
                    js.Function4[
                      /* x */ Double | Null, 
                      /* y */ Double | Null, 
                      /* width */ Double | Null, 
                      /* height */ Double | Null, 
                      RectReturn
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function4[
                        /* x */ Double | Null, 
                        /* y */ Double | Null, 
                        /* width */ Double | Null, 
                        /* height */ Double | Null, 
                        RectReturn
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setWindowRect", js.Any.fromFunction1(value))
    
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
    
    inline def setShake(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
    
    inline def setShutdown(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
    
    inline def setStartActivity(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function9[
                /* appPackage */ String, 
                /* appActivity */ String, 
                /* appWaitPackage */ js.UndefOr[String], 
                /* appWaitActivity */ js.UndefOr[String], 
                /* intentAction */ js.UndefOr[String], 
                /* intentCategory */ js.UndefOr[String], 
                /* intentFlags */ js.UndefOr[String], 
                /* optionalIntentArguments */ js.UndefOr[String], 
                /* dontStopAppOnReset */ js.UndefOr[String], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function9[
                  /* appPackage */ String, 
                  /* appActivity */ String, 
                  /* appWaitPackage */ js.UndefOr[String], 
                  /* appWaitActivity */ js.UndefOr[String], 
                  /* intentAction */ js.UndefOr[String], 
                  /* intentCategory */ js.UndefOr[String], 
                  /* intentFlags */ js.UndefOr[String], 
                  /* optionalIntentArguments */ js.UndefOr[String], 
                  /* dontStopAppOnReset */ js.UndefOr[String], 
                  Unit
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
                    js.Function9[
                      /* appPackage */ String, 
                      /* appActivity */ String, 
                      /* appWaitPackage */ js.UndefOr[String], 
                      /* appWaitActivity */ js.UndefOr[String], 
                      /* intentAction */ js.UndefOr[String], 
                      /* intentCategory */ js.UndefOr[String], 
                      /* intentFlags */ js.UndefOr[String], 
                      /* optionalIntentArguments */ js.UndefOr[String], 
                      /* dontStopAppOnReset */ js.UndefOr[String], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function9[
                        /* appPackage */ String, 
                        /* appActivity */ String, 
                        /* appWaitPackage */ js.UndefOr[String], 
                        /* appWaitActivity */ js.UndefOr[String], 
                        /* intentAction */ js.UndefOr[String], 
                        /* intentCategory */ js.UndefOr[String], 
                        /* intentFlags */ js.UndefOr[String], 
                        /* optionalIntentArguments */ js.UndefOr[String], 
                        /* dontStopAppOnReset */ js.UndefOr[String], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "startActivity", js.Any.fromFunction1(value))
    
    inline def setStartCastTabMirroring(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "startCastTabMirroring", js.Any.fromFunction1(value))
    
    inline def setStartRecordingScreen(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "startRecordingScreen", js.Any.fromFunction1(value))
    
    inline def setStatus(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[StatusReturn]], 
            js.Promise[ReturnType[js.Function0[StatusReturn]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[StatusReturn]], 
                  js.Promise[ReturnType[js.Function0[StatusReturn]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
    
    inline def setStopCasting(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "stopCasting", js.Any.fromFunction1(value))
    
    inline def setStopRecordingScreen(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function4[
                /* remotePath */ js.UndefOr[String], 
                /* username */ js.UndefOr[String], 
                /* password */ js.UndefOr[String], 
                /* method */ js.UndefOr[String], 
                String
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* remotePath */ js.UndefOr[String], 
                  /* username */ js.UndefOr[String], 
                  /* password */ js.UndefOr[String], 
                  /* method */ js.UndefOr[String], 
                  String
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
                    js.Function4[
                      /* remotePath */ js.UndefOr[String], 
                      /* username */ js.UndefOr[String], 
                      /* password */ js.UndefOr[String], 
                      /* method */ js.UndefOr[String], 
                      String
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function4[
                        /* remotePath */ js.UndefOr[String], 
                        /* username */ js.UndefOr[String], 
                        /* password */ js.UndefOr[String], 
                        /* method */ js.UndefOr[String], 
                        String
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "stopRecordingScreen", js.Any.fromFunction1(value))
    
    inline def setSwitchContext(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "switchContext", js.Any.fromFunction1(value))
    
    inline def setSwitchToFrame(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
            js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "switchToFrame", js.Any.fromFunction1(value))
    
    inline def setSwitchToParentFrame(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "switchToParentFrame", js.Any.fromFunction1(value))
    
    inline def setSwitchToWindow(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "switchToWindow", js.Any.fromFunction1(value))
    
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
    
    inline def setTakeElementScreenshot(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
            js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
                  js.Promise[
                    ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "takeElementScreenshot", js.Any.fromFunction1(value))
    
    inline def setTakeHeapSnapshot(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "takeHeapSnapshot", js.Any.fromFunction1(value))
    
    inline def setTakeScreenshot(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[String]], 
            js.Promise[ReturnType[js.Function0[String]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[String]], 
                  js.Promise[ReturnType[js.Function0[String]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "takeScreenshot", js.Any.fromFunction1(value))
    
    inline def setTerminateApp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "terminateApp", js.Any.fromFunction1(value))
    
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
    
    inline def setThrottleCPU(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
            js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "throttleCPU", js.Any.fromFunction1(value))
    
    inline def setThrottleNetwork(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "throttleNetwork", js.Any.fromFunction1(value))
    
    inline def setToggleAirplaneMode(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "toggleAirplaneMode", js.Any.fromFunction1(value))
    
    inline def setToggleData(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "toggleData", js.Any.fromFunction1(value))
    
    inline def setToggleEnrollTouchId(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
            js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "toggleEnrollTouchId", js.Any.fromFunction1(value))
    
    inline def setToggleLocationServices(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "toggleLocationServices", js.Any.fromFunction1(value))
    
    inline def setToggleNetworkSpeed(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "toggleNetworkSpeed", js.Any.fromFunction1(value))
    
    inline def setToggleWiFi(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "toggleWiFi", js.Any.fromFunction1(value))
    
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
    
    inline def setTouchClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchClick", js.Any.fromFunction1(value))
    
    inline def setTouchDoubleClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchDoubleClick", js.Any.fromFunction1(value))
    
    inline def setTouchDown(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchDown", js.Any.fromFunction1(value))
    
    inline def setTouchFlick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function6[
                /* xoffset */ js.UndefOr[Double], 
                /* yoffset */ js.UndefOr[Double], 
                /* element */ js.UndefOr[String], 
                /* speed */ js.UndefOr[Double], 
                /* xspeed */ js.UndefOr[Double], 
                /* yspeed */ js.UndefOr[Double], 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function6[
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  /* element */ js.UndefOr[String], 
                  /* speed */ js.UndefOr[Double], 
                  /* xspeed */ js.UndefOr[Double], 
                  /* yspeed */ js.UndefOr[Double], 
                  Unit
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
                    js.Function6[
                      /* xoffset */ js.UndefOr[Double], 
                      /* yoffset */ js.UndefOr[Double], 
                      /* element */ js.UndefOr[String], 
                      /* speed */ js.UndefOr[Double], 
                      /* xspeed */ js.UndefOr[Double], 
                      /* yspeed */ js.UndefOr[Double], 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function6[
                        /* xoffset */ js.UndefOr[Double], 
                        /* yoffset */ js.UndefOr[Double], 
                        /* element */ js.UndefOr[String], 
                        /* speed */ js.UndefOr[Double], 
                        /* xspeed */ js.UndefOr[Double], 
                        /* yspeed */ js.UndefOr[Double], 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchFlick", js.Any.fromFunction1(value))
    
    inline def setTouchId(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
            js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchId", js.Any.fromFunction1(value))
    
    inline def setTouchLongClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
            js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchLongClick", js.Any.fromFunction1(value))
    
    inline def setTouchMove(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchMove", js.Any.fromFunction1(value))
    
    inline def setTouchPerform(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
            js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
                  js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1(value))
    
    inline def setTouchPinch(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
            js.Promise[
              ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
                  js.Promise[
                    ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchPinch", js.Any.fromFunction1(value))
    
    inline def setTouchScroll(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
            ], 
            js.Promise[
              ReturnType[
                js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
              ]
            ]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[
                    js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchScroll", js.Any.fromFunction1(value))
    
    inline def setTouchUp(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchUp", js.Any.fromFunction1(value))
    
    inline def setUnlock(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[Unit]], 
            js.Promise[ReturnType[js.Function0[Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[Unit]], 
                  js.Promise[ReturnType[js.Function0[Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
    
    inline def setUpdateMockSensor(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              js.Function4[
                /* type */ String, 
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ], 
            js.Promise[
              ReturnType[
                js.Function4[
                  /* type */ String, 
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
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
                    js.Function4[
                      /* type */ String, 
                      /* mockSensorType */ String, 
                      /* maxSamplingFrequency */ Double, 
                      /* minSamplingFrequency */ Double, 
                      Unit
                    ]
                  ], 
                  js.Promise[
                    ReturnType[
                      js.Function4[
                        /* type */ String, 
                        /* mockSensorType */ String, 
                        /* maxSamplingFrequency */ Double, 
                        /* minSamplingFrequency */ Double, 
                        Unit
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "updateMockSensor", js.Any.fromFunction1(value))
    
    inline def setUpdateSettings(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
            js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
                  js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "updateSettings", js.Any.fromFunction1(value))
    
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
    
    inline def setWaitForClickable(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForClickable", js.Any.fromFunction1(value))
    
    inline def setWaitForDisplayed(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForDisplayed", js.Any.fromFunction1(value))
    
    inline def setWaitForEnabled(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForEnabled", js.Any.fromFunction1(value))
    
    inline def setWaitForExist(
      value: /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForExist", js.Any.fromFunction1(value))
    
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
    
    inline def set_getWindowSize(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
            js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
                  js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "_getWindowSize", js.Any.fromFunction1(value))
    
    inline def set_setWindowSize(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
            js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
          ]
        ] => js.Promise[
          js.Array[
            ThenArg[
              ReturnType[
                js.Function1[
                  /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
                  js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "_setWindowSize", js.Any.fromFunction1(value))
  }
}
