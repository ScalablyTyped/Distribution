package typings.webdriverio.typesMod

import typings.std.Parameters
import typings.std.ReturnType
import typings.wdioProtocols.typesMod.Context
import typings.wdioProtocols.typesMod.Cookie
import typings.wdioProtocols.typesMod.ElementReference
import typings.wdioProtocols.typesMod.ProtocolCommandResponse
import typings.wdioProtocols.typesMod.RectReturn
import typings.wdioProtocols.typesMod.SessionReturn
import typings.wdioProtocols.typesMod.SettingsReturn
import typings.wdioProtocols.typesMod.StatusReturn
import typings.wdioProtocols.typesMod.StringsReturn
import typings.wdioProtocols.typesMod.Timeouts
import typings.wdioProtocols.typesMod.WindowHandle
import typings.wdioTypes.mod.ThenArg
import typings.webdriverio.webdriverioStrings.tab
import typings.webdriverio.webdriverioStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols.ProtocolCommands ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols.ProtocolCommands[K]>): std.Array<@wdio/types.@wdio/types.ThenArg<std.ReturnType<@wdio/protocols.@wdio/protocols.ProtocolCommands[K]>>>} */
trait MultiRemoteProtocolCommandsTypeSync extends StObject {
  
  def _getWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  @JSName("_getWindowSize")
  var _getWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def _setWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]]
  @JSName("_setWindowSize")
  var _setWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]]
  ]
  
  def acceptAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("acceptAlert")
  var acceptAlert_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def activateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
  @JSName("activateApp")
  var activateApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
  ]
  
  def activateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* engine */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* engine */ String, Unit]]]]
  @JSName("activateIME")
  var activateIME_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* engine */ String, Unit]]]]
  ]
  
  def addCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* cookie */ js.Object, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]]
  @JSName("addCookie")
  var addCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]]
  ]
  
  def addCredential(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
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
  ): js.Array[
    ThenArg[
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
  @JSName("addCredential")
  var addCredential_Original: js.Function1[
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
    js.Array[
      ThenArg[
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
  
  def addVirtualAuthenticator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
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
  ): js.Array[
    ThenArg[
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
  @JSName("addVirtualAuthenticator")
  var addVirtualAuthenticator_Original: js.Function1[
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
    js.Array[
      ThenArg[
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
  
  def assertPerformance(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, ProtocolCommandResponse]]]]
  @JSName("assertPerformance")
  var assertPerformance_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, ProtocolCommandResponse]]]]
  ]
  
  def back(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("back")
  var back_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def background(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("background")
  var background_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def buttonDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("buttonDown")
  var buttonDown_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def buttonUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("buttonUp")
  var buttonUp_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def clearLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("clearLocalStorage")
  var clearLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def clearMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* mockId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, Unit]]]]
  @JSName("clearMockCalls")
  var clearMockCalls_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* mockId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, Unit]]]]
  ]
  
  def clearSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("clearSessionStorage")
  var clearSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def closeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("closeApp")
  var closeApp_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def closeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("closeWindow")
  var closeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def compareImages(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function4[
        /* mode */ String, 
        /* firstImage */ String, 
        /* secondImage */ String, 
        /* options */ js.Object, 
        ProtocolCommandResponse
      ]
    ]
  ): js.Array[
    ThenArg[
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
  @JSName("compareImages")
  var compareImages_Original: js.Function1[
    /* args */ Parameters[
      js.Function4[
        /* mode */ String, 
        /* firstImage */ String, 
        /* secondImage */ String, 
        /* options */ js.Object, 
        ProtocolCommandResponse
      ]
    ], 
    js.Array[
      ThenArg[
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
  
  def createMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* mockSensorType */ String, 
        /* maxSamplingFrequency */ Double, 
        /* minSamplingFrequency */ Double, 
        Unit
      ]
    ]
  ): js.Array[
    ThenArg[
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
  @JSName("createMockSensor")
  var createMockSensor_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* mockSensorType */ String, 
        /* maxSamplingFrequency */ Double, 
        /* minSamplingFrequency */ Double, 
        Unit
      ]
    ], 
    js.Array[
      ThenArg[
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
  
  def createWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ tab | window, WindowHandle]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]]
  @JSName("createWindow")
  var createWindow_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]]
  ]
  
  def deactivateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("deactivateIME")
  var deactivateIME_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def deleteAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("deleteAllCookies")
  var deleteAllCookies_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def deleteCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]]
  @JSName("deleteCookie")
  var deleteCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]]
  ]
  
  def deleteLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]]
  @JSName("deleteLocalStorageItem")
  var deleteLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]]
  ]
  
  def deleteMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, Unit]]]]
  @JSName("deleteMockSensor")
  var deleteMockSensor_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, Unit]]]]
  ]
  
  def deleteNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("deleteNetworkConditions")
  var deleteNetworkConditions_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def deleteSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  
  def deleteSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]]
  @JSName("deleteSessionStorageItem")
  var deleteSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]]
  ]
  
  @JSName("deleteSession")
  var deleteSession_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def dismissAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("dismissAlert")
  var dismissAlert_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def driverScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* script */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* script */ String, ProtocolCommandResponse]]]]
  @JSName("driverScript")
  var driverScript_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* script */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* script */ String, ProtocolCommandResponse]]]]
  ]
  
  def elementClear(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  @JSName("elementClear")
  var elementClear_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  ]
  
  def elementClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  @JSName("elementClick")
  var elementClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  ]
  
  def elementEquals(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
    ]
  ]
  @JSName("elementEquals")
  var elementEquals_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
      ]
    ]
  ]
  
  def elementHover(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  @JSName("elementHover")
  var elementHover_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  ]
  
  def elementSendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
  ]
  @JSName("elementSendKeys")
  var elementSendKeys_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
    ]
  ]
  
  def elementSubmit(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  @JSName("elementSubmit")
  var elementSubmit_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
  ]
  
  def endCoverage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]]
  @JSName("endCoverage")
  var endCoverage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]]
  ]
  
  def executeAsyncScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        Any
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
          Any
        ]
      ]
    ]
  ]
  @JSName("executeAsyncScript")
  var executeAsyncScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        Any
      ]
    ], 
    js.Array[
      ThenArg[
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
  
  def executeScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        Any
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
          Any
        ]
      ]
    ]
  ]
  @JSName("executeScript")
  var executeScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        Any
      ]
    ], 
    js.Array[
      ThenArg[
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
  
  def file(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* file */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* file */ String, String]]]]
  @JSName("file")
  var file_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* file */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* file */ String, String]]]]
  ]
  
  def findElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
    ]
  ]
  
  def findElementFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
      ]
    ]
  ]
  @JSName("findElementFromElement")
  var findElementFromElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
      ]
    ]
  ]
  
  def findElementFromShadowRoot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
      ]
    ]
  ]
  @JSName("findElementFromShadowRoot")
  var findElementFromShadowRoot_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ]
      ]
    ]
  ]
  
  @JSName("findElement")
  var findElement_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
      ]
    ]
  ]
  
  def findElements(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
    ]
  ]
  
  def findElementsFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* elementId */ String, 
        /* using */ String, 
        /* value */ String, 
        js.Array[ElementReference]
      ]
    ]
  ): js.Array[
    ThenArg[
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
  @JSName("findElementsFromElement")
  var findElementsFromElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* elementId */ String, 
        /* using */ String, 
        /* value */ String, 
        js.Array[ElementReference]
      ]
    ], 
    js.Array[
      ThenArg[
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
  
  def findElementsFromShadowRoot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
      ]
    ]
  ]
  @JSName("findElementsFromShadowRoot")
  var findElementsFromShadowRoot_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ]
      ]
    ]
  ]
  
  @JSName("findElements")
  var findElements_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
      ]
    ]
  ]
  
  def fingerPrint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* fingerprintId */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]]
  @JSName("fingerPrint")
  var fingerPrint_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]]
  ]
  
  def forward(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("forward")
  var forward_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def freeze(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("freeze")
  var freeze_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def fullscreenWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  @JSName("fullscreenWindow")
  var fullscreenWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  ]
  
  def generateTestReport(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* message */ String, /* group */ String, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
  ]
  @JSName("generateTestReport")
  var generateTestReport_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
    ]
  ]
  
  def getActiveElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getActiveElement")
  var getActiveElement_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getActiveEngine(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getActiveEngine")
  var getActiveEngine_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getAlertText")
  var getAlertText_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[Cookie]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[Cookie]]]]]
  @JSName("getAllCookies")
  var getAllCookies_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[Cookie]]]]]
  ]
  
  def getApplicationCacheStatus(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  @JSName("getApplicationCacheStatus")
  var getApplicationCacheStatus_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  ]
  
  def getAvailableEngines(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  @JSName("getAvailableEngines")
  var getAvailableEngines_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  ]
  
  def getCastIssueMessage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getCastIssueMessage")
  var getCastIssueMessage_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getCastSinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  @JSName("getCastSinks")
  var getCastSinks_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  ]
  
  def getClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getClipboard")
  var getClipboard_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Context]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Context]]]]
  @JSName("getContext")
  var getContext_Original: js.Function1[
    /* args */ Parameters[js.Function0[Context]], 
    js.Array[ThenArg[ReturnType[js.Function0[Context]]]]
  ]
  
  def getContexts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[Context]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[Context]]]]]
  @JSName("getContexts")
  var getContexts_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[Context]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[Context]]]]]
  ]
  
  def getCredentials(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
  @JSName("getCredentials")
  var getCredentials_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
  ]
  
  def getCurrentActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getCurrentActivity")
  var getCurrentActivity_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getCurrentPackage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getCurrentPackage")
  var getCurrentPackage_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getDeviceTime(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getDeviceTime")
  var getDeviceTime_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getDisplayDensity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Any]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Any]]]]
  @JSName("getDisplayDensity")
  var getDisplayDensity_Original: js.Function1[
    /* args */ Parameters[js.Function0[Any]], 
    js.Array[ThenArg[ReturnType[js.Function0[Any]]]]
  ]
  
  def getElementAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  ]
  @JSName("getElementAttribute")
  var getElementAttribute_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    ]
  ]
  
  def getElementCSSValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
    ]
  ]
  @JSName("getElementCSSValue")
  var getElementCSSValue_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
      ]
    ]
  ]
  
  def getElementComputedLabel(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  @JSName("getElementComputedLabel")
  var getElementComputedLabel_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  ]
  
  def getElementComputedRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  @JSName("getElementComputedRole")
  var getElementComputedRole_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  ]
  
  def getElementLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Array[
    ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ]
  
  def getElementLocationInView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Array[
    ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ]
  @JSName("getElementLocationInView")
  var getElementLocationInView_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Array[
      ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ]
  ]
  
  @JSName("getElementLocation")
  var getElementLocation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Array[
      ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ]
  ]
  
  def getElementProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  ]
  @JSName("getElementProperty")
  var getElementProperty_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    ]
  ]
  
  def getElementRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, RectReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]]
  @JSName("getElementRect")
  var getElementRect_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]]
  ]
  
  def getElementShadowRoot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  @JSName("getElementShadowRoot")
  var getElementShadowRoot_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  ]
  
  def getElementSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Array[
    ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ]
  @JSName("getElementSize")
  var getElementSize_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Array[
      ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ]
  ]
  
  def getElementTagName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  @JSName("getElementTagName")
  var getElementTagName_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  ]
  
  def getElementText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  @JSName("getElementText")
  var getElementText_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  ]
  
  def getElementValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String | Null]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String | Null]]]]
  @JSName("getElementValue")
  var getElementValue_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String | Null]]]]
  ]
  
  def getEvents(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]
  ): js.Array[
    ThenArg[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
  ]
  @JSName("getEvents")
  var getEvents_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
    js.Array[
      ThenArg[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
    ]
  ]
  
  def getGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  @JSName("getGeoLocation")
  var getGeoLocation_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def getHubConfig(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  @JSName("getHubConfig")
  var getHubConfig_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def getLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  
  def getLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]]
  @JSName("getLocalStorageItem")
  var getLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]]
  ]
  
  def getLocalStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  @JSName("getLocalStorageSize")
  var getLocalStorageSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  ]
  
  @JSName("getLocalStorage")
  var getLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  ]
  
  def getLogTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  @JSName("getLogTypes")
  var getLogTypes_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  ]
  
  def getLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, js.Array[js.Object]]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]]
  @JSName("getLogs")
  var getLogs_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]]
  ]
  
  def getMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]]
  @JSName("getMockCalls")
  var getMockCalls_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]]
  ]
  
  def getMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]]
  @JSName("getMockSensor")
  var getMockSensor_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]]
  ]
  
  def getNamedCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Cookie]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Cookie]]]]
  @JSName("getNamedCookie")
  var getNamedCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Cookie]]]]
  ]
  
  def getNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  @JSName("getNetworkConditions")
  var getNetworkConditions_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def getNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  @JSName("getNetworkConnection")
  var getNetworkConnection_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  ]
  
  def getOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getOrientation")
  var getOrientation_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getPageIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getPageIndex")
  var getPageIndex_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getPageLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]]
  @JSName("getPageLogs")
  var getPageLogs_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]]
  ]
  
  def getPageSource(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getPageSource")
  var getPageSource_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getPerformanceData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]]
    ]
  ]
  
  def getPerformanceDataTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  @JSName("getPerformanceDataTypes")
  var getPerformanceDataTypes_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  ]
  
  @JSName("getPerformanceData")
  var getPerformanceData_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]]
      ]
    ]
  ]
  
  def getSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  
  def getSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  
  def getSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]]
  @JSName("getSessionStorageItem")
  var getSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]]
  ]
  
  def getSessionStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  @JSName("getSessionStorageSize")
  var getSessionStorageSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
  ]
  
  @JSName("getSessionStorage")
  var getSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  ]
  
  @JSName("getSession")
  var getSession_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def getSessions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]]
  @JSName("getSessions")
  var getSessions_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]]
  ]
  
  def getSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[SettingsReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[SettingsReturn]]]]
  @JSName("getSettings")
  var getSettings_Original: js.Function1[
    /* args */ Parameters[js.Function0[SettingsReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[SettingsReturn]]]]
  ]
  
  def getStrings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[StringsReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[StringsReturn]]]]
  @JSName("getStrings")
  var getStrings_Original: js.Function1[
    /* args */ Parameters[js.Function0[StringsReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[StringsReturn]]]]
  ]
  
  def getSystemBars(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]]
  @JSName("getSystemBars")
  var getSystemBars_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]]
  ]
  
  def getTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Timeouts]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Timeouts]]]]
  @JSName("getTimeouts")
  var getTimeouts_Original: js.Function1[
    /* args */ Parameters[js.Function0[Timeouts]], 
    js.Array[ThenArg[ReturnType[js.Function0[Timeouts]]]]
  ]
  
  def getTitle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getTitle")
  var getTitle_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getUrl(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getUrl")
  var getUrl_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getWindowHandle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("getWindowHandle")
  var getWindowHandle_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def getWindowHandles(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  @JSName("getWindowHandles")
  var getWindowHandles_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
  ]
  
  def getWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  @JSName("getWindowPosition")
  var getWindowPosition_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def getWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  @JSName("getWindowRect")
  var getWindowRect_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  ]
  
  def gridProxyDetails(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]]
  @JSName("gridProxyDetails")
  var gridProxyDetails_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]]
  ]
  
  def gridTestSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]]
  @JSName("gridTestSession")
  var gridTestSession_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]]
  ]
  
  def gsmCall(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
  ]
  @JSName("gsmCall")
  var gsmCall_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
    ]
  ]
  
  def gsmSignal(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* signalStrength */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* signalStrength */ String, Unit]]]]
  @JSName("gsmSignal")
  var gsmSignal_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* signalStrength */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* signalStrength */ String, Unit]]]]
  ]
  
  def gsmVoice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]]
  @JSName("gsmVoice")
  var gsmVoice_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]]
  ]
  
  def hideKeyboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("hideKeyboard")
  var hideKeyboard_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def installApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appPath */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* appPath */ String, Unit]]]]
  @JSName("installApp")
  var installApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* appPath */ String, Unit]]]]
  ]
  
  def interceptRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* rule */ js.Object, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]]
  @JSName("interceptRequest")
  var interceptRequest_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]]
  ]
  
  def isAlertOpen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  @JSName("isAlertOpen")
  var isAlertOpen_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  ]
  
  def isAppInstalled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Boolean]]]]
  @JSName("isAppInstalled")
  var isAppInstalled_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Boolean]]]]
  ]
  
  def isAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  @JSName("isAutoReporting")
  var isAutoReporting_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  ]
  
  def isElementDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
  @JSName("isElementDisplayed")
  var isElementDisplayed_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
  ]
  
  def isElementEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
  @JSName("isElementEnabled")
  var isElementEnabled_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
  ]
  
  def isElementSelected(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
  @JSName("isElementSelected")
  var isElementSelected_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
  ]
  
  def isIMEActivated(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  @JSName("isIMEActivated")
  var isIMEActivated_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  ]
  
  def isKeyboardShown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  @JSName("isKeyboardShown")
  var isKeyboardShown_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  ]
  
  def isLoading(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  @JSName("isLoading")
  var isLoading_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  ]
  
  def isLocked(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  @JSName("isLocked")
  var isLocked_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
  ]
  
  def jankinessCheck(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  @JSName("jankinessCheck")
  var jankinessCheck_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def launchApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("launchApp")
  var launchApp_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def launchChromeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, Unit]]]]
  @JSName("launchChromeApp")
  var launchChromeApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, Unit]]]]
  ]
  
  def lock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("lock")
  var lock_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def logEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]]
  @JSName("logEvent")
  var logEvent_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]]
  ]
  
  def longPressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* keycode */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]]
  @JSName("longPressKeyCode")
  var longPressKeyCode_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* keycode */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]]
  ]
  
  def manageSeleniumHubLifecycle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* action */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* action */ String, Unit]]]]
  @JSName("manageSeleniumHubLifecycle")
  var manageSeleniumHubLifecycle_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* action */ String, Unit]]]]
  ]
  
  def maximizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  @JSName("maximizeWindow")
  var maximizeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  ]
  
  def minimizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  @JSName("minimizeWindow")
  var minimizeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  ]
  
  def mockRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* url */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, ProtocolCommandResponse]]]]
  @JSName("mockRequest")
  var mockRequest_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* url */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, ProtocolCommandResponse]]]]
  ]
  
  def moveToElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("moveToElement")
  var moveToElement_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def multiTouchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
  @JSName("multiTouchPerform")
  var multiTouchPerform_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
  ]
  
  def navigateTo(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* url */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, String]]]]
  @JSName("navigateTo")
  var navigateTo_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* url */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, String]]]]
  ]
  
  def newSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]]
  @JSName("newSession")
  var newSession_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]]
  ]
  
  def openNotifications(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("openNotifications")
  var openNotifications_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def performActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
  @JSName("performActions")
  var performActions_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
  ]
  
  def positionClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("positionClick")
  var positionClick_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def positionDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("positionDoubleClick")
  var positionDoubleClick_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def powerAC(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]]
  @JSName("powerAC")
  var powerAC_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]]
  ]
  
  def powerCapacity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* percent */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* percent */ Double, Unit]]]]
  @JSName("powerCapacity")
  var powerCapacity_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* percent */ Double, Unit]]]]
  ]
  
  def pressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* keycode */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]]
  @JSName("pressKeyCode")
  var pressKeyCode_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* keycode */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]]
  ]
  
  def printPage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
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
  ): js.Array[
    ThenArg[
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
  @JSName("printPage")
  var printPage_Original: js.Function1[
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
    js.Array[
      ThenArg[
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
  
  def pullFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, String]]]]
  @JSName("pullFile")
  var pullFile_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* path */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, String]]]]
  ]
  
  def pullFolder(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, Unit]]]]
  @JSName("pullFolder")
  var pullFolder_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, Unit]]]]
  ]
  
  def pushFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* path */ String, /* data */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]]
  @JSName("pushFile")
  var pushFile_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]]
  ]
  
  def queryAppState(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Double]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Double]]]]
  @JSName("queryAppState")
  var queryAppState_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Double]]]]
  ]
  
  def queryGrid(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]]
  @JSName("queryGrid")
  var queryGrid_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]]
  ]
  
  def receiveAsyncResponse(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* response */ js.Object, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* response */ js.Object, Unit]]]]
  @JSName("receiveAsyncResponse")
  var receiveAsyncResponse_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* response */ js.Object, Unit]]]]
  ]
  
  def refresh(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("refresh")
  var refresh_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def releaseActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("releaseActions")
  var releaseActions_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def removeAllCredentials(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
  @JSName("removeAllCredentials")
  var removeAllCredentials_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
  ]
  
  def removeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
  @JSName("removeApp")
  var removeApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
  ]
  
  def removeCredential(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
    ]
  ]
  @JSName("removeCredential")
  var removeCredential_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    ]
  ]
  
  def removeVirtualAuthenticator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
  @JSName("removeVirtualAuthenticator")
  var removeVirtualAuthenticator_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
  ]
  
  def replaceValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  ]
  @JSName("replaceValue")
  var replaceValue_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    ]
  ]
  
  def reset(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("reset")
  var reset_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def respondMock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
  ]
  @JSName("respondMock")
  var respondMock_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
    ]
  ]
  
  def resume(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("resume")
  var resume_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def rotateDevice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function6[
        /* x */ Double, 
        /* y */ Double, 
        /* radius */ Double, 
        /* rotation */ Double, 
        /* touchCount */ Double, 
        /* duration */ Double, 
        Unit
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function6[
          /* x */ Double, 
          /* y */ Double, 
          /* radius */ Double, 
          /* rotation */ Double, 
          /* touchCount */ Double, 
          /* duration */ Double, 
          Unit
        ]
      ]
    ]
  ]
  @JSName("rotateDevice")
  var rotateDevice_Original: js.Function1[
    /* args */ Parameters[
      js.Function6[
        /* x */ Double, 
        /* y */ Double, 
        /* radius */ Double, 
        /* rotation */ Double, 
        /* touchCount */ Double, 
        /* duration */ Double, 
        Unit
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function6[
            /* x */ Double, 
            /* y */ Double, 
            /* radius */ Double, 
            /* rotation */ Double, 
            /* touchCount */ Double, 
            /* duration */ Double, 
            Unit
          ]
        ]
      ]
    ]
  ]
  
  def selectCastSink(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
  @JSName("selectCastSink")
  var selectCastSink_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
  ]
  
  def sendAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* text */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* text */ String, Unit]]]]
  @JSName("sendAlertText")
  var sendAlertText_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* text */ String, Unit]]]]
  ]
  
  def sendCommand(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
  ]
  
  def sendCommandAndGetResult(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]]
  @JSName("sendCommandAndGetResult")
  var sendCommandAndGetResult_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]]
  ]
  
  @JSName("sendCommand")
  var sendCommand_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
    ]
  ]
  
  def sendKeyEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* keycode */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ String, Unit]]]]
  @JSName("sendKeyEvent")
  var sendKeyEvent_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* keycode */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ String, Unit]]]]
  ]
  
  def sendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* value */ js.Array[String], Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]]
  @JSName("sendKeys")
  var sendKeys_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]]
  ]
  
  def sendSms(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
  ]
  @JSName("sendSms")
  var sendSms_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
    ]
  ]
  
  def setAsyncTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]]
  @JSName("setAsyncTimeout")
  var setAsyncTimeout_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]]
  ]
  
  def setAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]]
  @JSName("setAutoReporting")
  var setAutoReporting_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]]
  ]
  
  def setClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* content */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* content */ String, String]]]]
  @JSName("setClipboard")
  var setClipboard_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* content */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* content */ String, String]]]]
  ]
  
  def setGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* location */ js.Object, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* location */ js.Object, Unit]]]]
  @JSName("setGeoLocation")
  var setGeoLocation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* location */ js.Object, Unit]]]]
  ]
  
  def setImplicitTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]]
  @JSName("setImplicitTimeout")
  var setImplicitTimeout_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]]
  ]
  
  def setLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]]
  @JSName("setLocalStorage")
  var setLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]]
  ]
  
  def setNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* networkConditions */ js.Object, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* networkConditions */ js.Object, Unit]]]]
  @JSName("setNetworkConditions")
  var setNetworkConditions_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* networkConditions */ js.Object, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* networkConditions */ js.Object, Unit]]]]
  ]
  
  def setNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* parameters */ js.Object, Double]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]]
  @JSName("setNetworkConnection")
  var setNetworkConnection_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]]
  ]
  
  def setOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* orientation */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* orientation */ String, Unit]]]]
  @JSName("setOrientation")
  var setOrientation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* orientation */ String, Unit]]]]
  ]
  
  def setPermissions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]]]
  ]
  @JSName("setPermissions")
  var setPermissions_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]]]
    ]
  ]
  
  def setSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]]
  @JSName("setSessionStorage")
  var setSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]]
  ]
  
  def setTimeZone(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* timeZone */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* timeZone */ String, Unit]]]]
  @JSName("setTimeZone")
  var setTimeZone_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* timeZone */ String, Unit]]]]
  ]
  
  def setTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("setTimeouts")
  var setTimeouts_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def setUserVerified(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
    ]
  ]
  @JSName("setUserVerified")
  var setUserVerified_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    ]
  ]
  
  def setValueImmediate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  ]
  @JSName("setValueImmediate")
  var setValueImmediate_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    ]
  ]
  
  def setWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
    ]
  ]
  @JSName("setWindowPosition")
  var setWindowPosition_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
      ]
    ]
  ]
  
  def setWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  @JSName("setWindowRect")
  var setWindowRect_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
  ]
  
  def shake(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("shake")
  var shake_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def shutdown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("shutdown")
  var shutdown_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def startActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
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
  ): js.Array[
    ThenArg[
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
  @JSName("startActivity")
  var startActivity_Original: js.Function1[
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
    js.Array[
      ThenArg[
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
  
  def startCastTabMirroring(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
  @JSName("startCastTabMirroring")
  var startCastTabMirroring_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
  ]
  
  def startRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("startRecordingScreen")
  var startRecordingScreen_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def status(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[StatusReturn]]
  ): js.Array[ThenArg[ReturnType[js.Function0[StatusReturn]]]]
  @JSName("status")
  var status_Original: js.Function1[
    /* args */ Parameters[js.Function0[StatusReturn]], 
    js.Array[ThenArg[ReturnType[js.Function0[StatusReturn]]]]
  ]
  
  def stopCasting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
  @JSName("stopCasting")
  var stopCasting_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
  ]
  
  def stopRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("stopRecordingScreen")
  var stopRecordingScreen_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def switchContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]]
  @JSName("switchContext")
  var switchContext_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]]
  ]
  
  def switchToFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("switchToFrame")
  var switchToFrame_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def switchToParentFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("switchToParentFrame")
  var switchToParentFrame_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def switchToWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* handle */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* handle */ String, Unit]]]]
  @JSName("switchToWindow")
  var switchToWindow_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* handle */ String, Unit]]]]
  ]
  
  def takeElementScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  @JSName("takeElementScreenshot")
  var takeElementScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
  ]
  
  def takeHeapSnapshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  @JSName("takeHeapSnapshot")
  var takeHeapSnapshot_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
  ]
  
  def takeScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  @JSName("takeScreenshot")
  var takeScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Array[ThenArg[ReturnType[js.Function0[String]]]]
  ]
  
  def terminateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
  @JSName("terminateApp")
  var terminateApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
  ]
  
  def throttleCPU(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* rate */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* rate */ Double, Unit]]]]
  @JSName("throttleCPU")
  var throttleCPU_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* rate */ Double, Unit]]]]
  ]
  
  def throttleNetwork(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* condition */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* condition */ String, Unit]]]]
  @JSName("throttleNetwork")
  var throttleNetwork_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* condition */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* condition */ String, Unit]]]]
  ]
  
  def toggleAirplaneMode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("toggleAirplaneMode")
  var toggleAirplaneMode_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def toggleData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("toggleData")
  var toggleData_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def toggleEnrollTouchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("toggleEnrollTouchId")
  var toggleEnrollTouchId_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def toggleLocationServices(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("toggleLocationServices")
  var toggleLocationServices_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def toggleNetworkSpeed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* netspeed */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* netspeed */ String, Unit]]]]
  @JSName("toggleNetworkSpeed")
  var toggleNetworkSpeed_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* netspeed */ String, Unit]]]]
  ]
  
  def toggleWiFi(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("toggleWiFi")
  var toggleWiFi_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def touchClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
  @JSName("touchClick")
  var touchClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
  ]
  
  def touchDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
  @JSName("touchDoubleClick")
  var touchDoubleClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
  ]
  
  def touchDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
  @JSName("touchDown")
  var touchDown_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
  ]
  
  def touchFlick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
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
  ): js.Array[
    ThenArg[
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
  @JSName("touchFlick")
  var touchFlick_Original: js.Function1[
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
    js.Array[
      ThenArg[
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
  
  def touchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* match */ Boolean, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* match */ Boolean, Unit]]]]
  @JSName("touchId")
  var touchId_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* match */ Boolean, Unit]]]]
  ]
  
  def touchLongClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
  @JSName("touchLongClick")
  var touchLongClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
  ]
  
  def touchMove(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
  @JSName("touchMove")
  var touchMove_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
  ]
  
  def touchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
  @JSName("touchPerform")
  var touchPerform_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
  ]
  
  def touchPinch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
  ): js.Array[
    ThenArg[
      ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
    ]
  ]
  @JSName("touchPinch")
  var touchPinch_Original: js.Function1[
    /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
    js.Array[
      ThenArg[
        ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
      ]
    ]
  ]
  
  def touchScroll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]]
  ): js.Array[
    ThenArg[ReturnType[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]]]
  ]
  @JSName("touchScroll")
  var touchScroll_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]], 
    js.Array[
      ThenArg[ReturnType[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]]]
    ]
  ]
  
  def touchUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
  @JSName("touchUp")
  var touchUp_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
  ]
  
  def unlock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  @JSName("unlock")
  var unlock_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
  ]
  
  def updateMockSensor(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[
      js.Function4[
        /* type */ String, 
        /* mockSensorType */ String, 
        /* maxSamplingFrequency */ Double, 
        /* minSamplingFrequency */ Double, 
        Unit
      ]
    ]
  ): js.Array[
    ThenArg[
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
  @JSName("updateMockSensor")
  var updateMockSensor_Original: js.Function1[
    /* args */ Parameters[
      js.Function4[
        /* type */ String, 
        /* mockSensorType */ String, 
        /* maxSamplingFrequency */ Double, 
        /* minSamplingFrequency */ Double, 
        Unit
      ]
    ], 
    js.Array[
      ThenArg[
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
  
  def updateSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ProtocolCommands[K]> is not an array type */ args: Parameters[js.Function1[/* settings */ js.Object, Unit]]
  ): js.Array[ThenArg[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]]
  @JSName("updateSettings")
  var updateSettings_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
    js.Array[ThenArg[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]]
  ]
}
object MultiRemoteProtocolCommandsTypeSync {
  
  inline def apply(
    _getWindowSize: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    _setWindowSize: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]],
    acceptAlert: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    activateApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]],
    activateIME: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* engine */ String, Unit]]]],
    addCookie: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]],
    addCredential: /* args */ Parameters[
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
    ] => js.Array[
      ThenArg[
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
    ],
    addVirtualAuthenticator: /* args */ Parameters[
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
    ] => js.Array[
      ThenArg[
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
    ],
    assertPerformance: /* args */ Parameters[js.Function1[/* name */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, ProtocolCommandResponse]]]],
    back: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    background: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    buttonDown: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    buttonUp: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    clearLocalStorage: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    clearMockCalls: /* args */ Parameters[js.Function1[/* mockId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, Unit]]]],
    clearSessionStorage: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    closeApp: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    closeWindow: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    compareImages: /* args */ Parameters[
      js.Function4[
        /* mode */ String, 
        /* firstImage */ String, 
        /* secondImage */ String, 
        /* options */ js.Object, 
        ProtocolCommandResponse
      ]
    ] => js.Array[
      ThenArg[
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
    ],
    createMockSensor: /* args */ Parameters[
      js.Function3[
        /* mockSensorType */ String, 
        /* maxSamplingFrequency */ Double, 
        /* minSamplingFrequency */ Double, 
        Unit
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ]
      ]
    ],
    createWindow: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]],
    deactivateIME: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    deleteAllCookies: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    deleteCookie: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]],
    deleteLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]],
    deleteMockSensor: /* args */ Parameters[js.Function1[/* type */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, Unit]]]],
    deleteNetworkConditions: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    deleteSession: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    deleteSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]],
    dismissAlert: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    driverScript: /* args */ Parameters[js.Function1[/* script */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* script */ String, ProtocolCommandResponse]]]],
    elementClear: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]],
    elementClick: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]],
    elementEquals: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
      ]
    ],
    elementHover: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]],
    elementSendKeys: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
    ],
    elementSubmit: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]],
    endCoverage: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]],
    executeAsyncScript: /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        Any
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ]
      ]
    ],
    executeScript: /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        Any
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ]
      ]
    ],
    file: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* file */ String, String]]]],
    findElement: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
      ]
    ],
    findElementFromElement: /* args */ Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
      ]
    ],
    findElementFromShadowRoot: /* args */ Parameters[
      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ]
      ]
    ],
    findElements: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
      ]
    ],
    findElementsFromElement: /* args */ Parameters[
      js.Function3[
        /* elementId */ String, 
        /* using */ String, 
        /* value */ String, 
        js.Array[ElementReference]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ]
      ]
    ],
    findElementsFromShadowRoot: /* args */ Parameters[
      js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ]
      ]
    ],
    fingerPrint: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]],
    forward: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    freeze: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    fullscreenWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]],
    generateTestReport: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
    ],
    getActiveElement: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getActiveEngine: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getAlertText: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getAllCookies: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[Cookie]]]]],
    getApplicationCacheStatus: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]],
    getAvailableEngines: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]],
    getCastIssueMessage: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getCastSinks: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]],
    getClipboard: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getContext: /* args */ Parameters[js.Function0[Context]] => js.Array[ThenArg[ReturnType[js.Function0[Context]]]],
    getContexts: /* args */ Parameters[js.Function0[js.Array[Context]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[Context]]]]],
    getCredentials: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]],
    getCurrentActivity: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getCurrentPackage: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getDeviceTime: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getDisplayDensity: /* args */ Parameters[js.Function0[Any]] => js.Array[ThenArg[ReturnType[js.Function0[Any]]]],
    getElementAttribute: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    ],
    getElementCSSValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
      ]
    ],
    getElementComputedLabel: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]],
    getElementComputedRole: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]],
    getElementLocation: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Array[
      ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ],
    getElementLocationInView: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Array[
      ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ],
    getElementProperty: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    ],
    getElementRect: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]],
    getElementShadowRoot: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]],
    getElementSize: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Array[
      ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ],
    getElementTagName: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]],
    getElementText: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]],
    getElementValue: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String | Null]]]],
    getEvents: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Array[
      ThenArg[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
    ],
    getGeoLocation: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    getHubConfig: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    getLocalStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]],
    getLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]],
    getLocalStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]],
    getLogTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]],
    getLogs: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]],
    getMockCalls: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]],
    getMockSensor: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]],
    getNamedCookie: /* args */ Parameters[js.Function1[/* name */ String, Cookie]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Cookie]]]],
    getNetworkConditions: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    getNetworkConnection: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]],
    getOrientation: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getPageIndex: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getPageLogs: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]],
    getPageSource: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getPerformanceData: /* args */ Parameters[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]]
      ]
    ],
    getPerformanceDataTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]],
    getSession: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    getSessionStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]],
    getSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]],
    getSessionStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]],
    getSessions: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]],
    getSettings: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Array[ThenArg[ReturnType[js.Function0[SettingsReturn]]]],
    getStrings: /* args */ Parameters[js.Function0[StringsReturn]] => js.Array[ThenArg[ReturnType[js.Function0[StringsReturn]]]],
    getSystemBars: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]],
    getTimeouts: /* args */ Parameters[js.Function0[Timeouts]] => js.Array[ThenArg[ReturnType[js.Function0[Timeouts]]]],
    getTitle: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getUrl: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getWindowHandle: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    getWindowHandles: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]],
    getWindowPosition: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    getWindowRect: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]],
    gridProxyDetails: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]],
    gridTestSession: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]],
    gsmCall: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
    ],
    gsmSignal: /* args */ Parameters[js.Function1[/* signalStrength */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* signalStrength */ String, Unit]]]],
    gsmVoice: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]],
    hideKeyboard: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    installApp: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appPath */ String, Unit]]]],
    interceptRequest: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]],
    isAlertOpen: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]],
    isAppInstalled: /* args */ Parameters[js.Function1[/* appId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Boolean]]]],
    isAutoReporting: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]],
    isElementDisplayed: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]],
    isElementEnabled: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]],
    isElementSelected: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]],
    isIMEActivated: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]],
    isKeyboardShown: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]],
    isLoading: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]],
    isLocked: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]],
    jankinessCheck: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    launchApp: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    launchChromeApp: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, Unit]]]],
    lock: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    logEvent: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]],
    longPressKeyCode: /* args */ Parameters[js.Function1[/* keycode */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]],
    manageSeleniumHubLifecycle: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* action */ String, Unit]]]],
    maximizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]],
    minimizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]],
    mockRequest: /* args */ Parameters[js.Function1[/* url */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, ProtocolCommandResponse]]]],
    moveToElement: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    multiTouchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]],
    navigateTo: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, String]]]],
    newSession: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Array[ThenArg[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]],
    openNotifications: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    performActions: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]],
    positionClick: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    positionDoubleClick: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    powerAC: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]],
    powerCapacity: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* percent */ Double, Unit]]]],
    pressKeyCode: /* args */ Parameters[js.Function1[/* keycode */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]],
    printPage: /* args */ Parameters[
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
    ] => js.Array[
      ThenArg[
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
    ],
    pullFile: /* args */ Parameters[js.Function1[/* path */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, String]]]],
    pullFolder: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, Unit]]]],
    pushFile: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]],
    queryAppState: /* args */ Parameters[js.Function1[/* appId */ String, Double]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Double]]]],
    queryGrid: /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]],
    receiveAsyncResponse: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* response */ js.Object, Unit]]]],
    refresh: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    releaseActions: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    removeAllCredentials: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]],
    removeApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]],
    removeCredential: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    ],
    removeVirtualAuthenticator: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]],
    replaceValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    ],
    reset: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    respondMock: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
    ],
    resume: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    rotateDevice: /* args */ Parameters[
      js.Function6[
        /* x */ Double, 
        /* y */ Double, 
        /* radius */ Double, 
        /* rotation */ Double, 
        /* touchCount */ Double, 
        /* duration */ Double, 
        Unit
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function6[
            /* x */ Double, 
            /* y */ Double, 
            /* radius */ Double, 
            /* rotation */ Double, 
            /* touchCount */ Double, 
            /* duration */ Double, 
            Unit
          ]
        ]
      ]
    ],
    selectCastSink: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]],
    sendAlertText: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* text */ String, Unit]]]],
    sendCommand: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
    ],
    sendCommandAndGetResult: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]] => js.Array[ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]],
    sendKeyEvent: /* args */ Parameters[js.Function1[/* keycode */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ String, Unit]]]],
    sendKeys: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]],
    sendSms: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
    ],
    setAsyncTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]],
    setAutoReporting: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Array[ThenArg[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]],
    setClipboard: /* args */ Parameters[js.Function1[/* content */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* content */ String, String]]]],
    setGeoLocation: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* location */ js.Object, Unit]]]],
    setImplicitTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]],
    setLocalStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]],
    setNetworkConditions: /* args */ Parameters[js.Function1[/* networkConditions */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* networkConditions */ js.Object, Unit]]]],
    setNetworkConnection: /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]] => js.Array[ThenArg[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]],
    setOrientation: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* orientation */ String, Unit]]]],
    setPermissions: /* args */ Parameters[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]]]
    ],
    setSessionStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]],
    setTimeZone: /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* timeZone */ String, Unit]]]],
    setTimeouts: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    setUserVerified: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    ],
    setValueImmediate: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    ],
    setWindowPosition: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Array[
      ThenArg[
        ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
      ]
    ],
    setWindowRect: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]],
    shake: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    shutdown: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    startActivity: /* args */ Parameters[
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
    ] => js.Array[
      ThenArg[
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
    ],
    startCastTabMirroring: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]],
    startRecordingScreen: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    status: /* args */ Parameters[js.Function0[StatusReturn]] => js.Array[ThenArg[ReturnType[js.Function0[StatusReturn]]]],
    stopCasting: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]],
    stopRecordingScreen: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    switchContext: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]],
    switchToFrame: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    switchToParentFrame: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    switchToWindow: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* handle */ String, Unit]]]],
    takeElementScreenshot: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]],
    takeHeapSnapshot: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]],
    takeScreenshot: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]],
    terminateApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]],
    throttleCPU: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* rate */ Double, Unit]]]],
    throttleNetwork: /* args */ Parameters[js.Function1[/* condition */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* condition */ String, Unit]]]],
    toggleAirplaneMode: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    toggleData: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    toggleEnrollTouchId: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    toggleLocationServices: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    toggleNetworkSpeed: /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* netspeed */ String, Unit]]]],
    toggleWiFi: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    touchClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]],
    touchDoubleClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]],
    touchDown: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]],
    touchFlick: /* args */ Parameters[
      js.Function6[
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        /* element */ js.UndefOr[String], 
        /* speed */ js.UndefOr[Double], 
        /* xspeed */ js.UndefOr[Double], 
        /* yspeed */ js.UndefOr[Double], 
        Unit
      ]
    ] => js.Array[
      ThenArg[
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
    ],
    touchId: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* match */ Boolean, Unit]]]],
    touchLongClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]],
    touchMove: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]],
    touchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]],
    touchPinch: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Array[
      ThenArg[
        ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
      ]
    ],
    touchScroll: /* args */ Parameters[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]] => js.Array[
      ThenArg[ReturnType[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]]]
    ],
    touchUp: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]],
    unlock: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]],
    updateMockSensor: /* args */ Parameters[
      js.Function4[
        /* type */ String, 
        /* mockSensorType */ String, 
        /* maxSamplingFrequency */ Double, 
        /* minSamplingFrequency */ Double, 
        Unit
      ]
    ] => js.Array[
      ThenArg[
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
    ],
    updateSettings: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]]
  ): MultiRemoteProtocolCommandsTypeSync = {
    val __obj = js.Dynamic.literal(_getWindowSize = js.Any.fromFunction1(_getWindowSize), _setWindowSize = js.Any.fromFunction1(_setWindowSize), acceptAlert = js.Any.fromFunction1(acceptAlert), activateApp = js.Any.fromFunction1(activateApp), activateIME = js.Any.fromFunction1(activateIME), addCookie = js.Any.fromFunction1(addCookie), addCredential = js.Any.fromFunction1(addCredential), addVirtualAuthenticator = js.Any.fromFunction1(addVirtualAuthenticator), assertPerformance = js.Any.fromFunction1(assertPerformance), back = js.Any.fromFunction1(back), background = js.Any.fromFunction1(background), buttonDown = js.Any.fromFunction1(buttonDown), buttonUp = js.Any.fromFunction1(buttonUp), clearLocalStorage = js.Any.fromFunction1(clearLocalStorage), clearMockCalls = js.Any.fromFunction1(clearMockCalls), clearSessionStorage = js.Any.fromFunction1(clearSessionStorage), closeApp = js.Any.fromFunction1(closeApp), closeWindow = js.Any.fromFunction1(closeWindow), compareImages = js.Any.fromFunction1(compareImages), createMockSensor = js.Any.fromFunction1(createMockSensor), createWindow = js.Any.fromFunction1(createWindow), deactivateIME = js.Any.fromFunction1(deactivateIME), deleteAllCookies = js.Any.fromFunction1(deleteAllCookies), deleteCookie = js.Any.fromFunction1(deleteCookie), deleteLocalStorageItem = js.Any.fromFunction1(deleteLocalStorageItem), deleteMockSensor = js.Any.fromFunction1(deleteMockSensor), deleteNetworkConditions = js.Any.fromFunction1(deleteNetworkConditions), deleteSession = js.Any.fromFunction1(deleteSession), deleteSessionStorageItem = js.Any.fromFunction1(deleteSessionStorageItem), dismissAlert = js.Any.fromFunction1(dismissAlert), driverScript = js.Any.fromFunction1(driverScript), elementClear = js.Any.fromFunction1(elementClear), elementClick = js.Any.fromFunction1(elementClick), elementEquals = js.Any.fromFunction1(elementEquals), elementHover = js.Any.fromFunction1(elementHover), elementSendKeys = js.Any.fromFunction1(elementSendKeys), elementSubmit = js.Any.fromFunction1(elementSubmit), endCoverage = js.Any.fromFunction1(endCoverage), executeAsyncScript = js.Any.fromFunction1(executeAsyncScript), executeScript = js.Any.fromFunction1(executeScript), file = js.Any.fromFunction1(file), findElement = js.Any.fromFunction1(findElement), findElementFromElement = js.Any.fromFunction1(findElementFromElement), findElementFromShadowRoot = js.Any.fromFunction1(findElementFromShadowRoot), findElements = js.Any.fromFunction1(findElements), findElementsFromElement = js.Any.fromFunction1(findElementsFromElement), findElementsFromShadowRoot = js.Any.fromFunction1(findElementsFromShadowRoot), fingerPrint = js.Any.fromFunction1(fingerPrint), forward = js.Any.fromFunction1(forward), freeze = js.Any.fromFunction1(freeze), fullscreenWindow = js.Any.fromFunction1(fullscreenWindow), generateTestReport = js.Any.fromFunction1(generateTestReport), getActiveElement = js.Any.fromFunction1(getActiveElement), getActiveEngine = js.Any.fromFunction1(getActiveEngine), getAlertText = js.Any.fromFunction1(getAlertText), getAllCookies = js.Any.fromFunction1(getAllCookies), getApplicationCacheStatus = js.Any.fromFunction1(getApplicationCacheStatus), getAvailableEngines = js.Any.fromFunction1(getAvailableEngines), getCastIssueMessage = js.Any.fromFunction1(getCastIssueMessage), getCastSinks = js.Any.fromFunction1(getCastSinks), getClipboard = js.Any.fromFunction1(getClipboard), getContext = js.Any.fromFunction1(getContext), getContexts = js.Any.fromFunction1(getContexts), getCredentials = js.Any.fromFunction1(getCredentials), getCurrentActivity = js.Any.fromFunction1(getCurrentActivity), getCurrentPackage = js.Any.fromFunction1(getCurrentPackage), getDeviceTime = js.Any.fromFunction1(getDeviceTime), getDisplayDensity = js.Any.fromFunction1(getDisplayDensity), getElementAttribute = js.Any.fromFunction1(getElementAttribute), getElementCSSValue = js.Any.fromFunction1(getElementCSSValue), getElementComputedLabel = js.Any.fromFunction1(getElementComputedLabel), getElementComputedRole = js.Any.fromFunction1(getElementComputedRole), getElementLocation = js.Any.fromFunction1(getElementLocation), getElementLocationInView = js.Any.fromFunction1(getElementLocationInView), getElementProperty = js.Any.fromFunction1(getElementProperty), getElementRect = js.Any.fromFunction1(getElementRect), getElementShadowRoot = js.Any.fromFunction1(getElementShadowRoot), getElementSize = js.Any.fromFunction1(getElementSize), getElementTagName = js.Any.fromFunction1(getElementTagName), getElementText = js.Any.fromFunction1(getElementText), getElementValue = js.Any.fromFunction1(getElementValue), getEvents = js.Any.fromFunction1(getEvents), getGeoLocation = js.Any.fromFunction1(getGeoLocation), getHubConfig = js.Any.fromFunction1(getHubConfig), getLocalStorage = js.Any.fromFunction1(getLocalStorage), getLocalStorageItem = js.Any.fromFunction1(getLocalStorageItem), getLocalStorageSize = js.Any.fromFunction1(getLocalStorageSize), getLogTypes = js.Any.fromFunction1(getLogTypes), getLogs = js.Any.fromFunction1(getLogs), getMockCalls = js.Any.fromFunction1(getMockCalls), getMockSensor = js.Any.fromFunction1(getMockSensor), getNamedCookie = js.Any.fromFunction1(getNamedCookie), getNetworkConditions = js.Any.fromFunction1(getNetworkConditions), getNetworkConnection = js.Any.fromFunction1(getNetworkConnection), getOrientation = js.Any.fromFunction1(getOrientation), getPageIndex = js.Any.fromFunction1(getPageIndex), getPageLogs = js.Any.fromFunction1(getPageLogs), getPageSource = js.Any.fromFunction1(getPageSource), getPerformanceData = js.Any.fromFunction1(getPerformanceData), getPerformanceDataTypes = js.Any.fromFunction1(getPerformanceDataTypes), getSession = js.Any.fromFunction1(getSession), getSessionStorage = js.Any.fromFunction1(getSessionStorage), getSessionStorageItem = js.Any.fromFunction1(getSessionStorageItem), getSessionStorageSize = js.Any.fromFunction1(getSessionStorageSize), getSessions = js.Any.fromFunction1(getSessions), getSettings = js.Any.fromFunction1(getSettings), getStrings = js.Any.fromFunction1(getStrings), getSystemBars = js.Any.fromFunction1(getSystemBars), getTimeouts = js.Any.fromFunction1(getTimeouts), getTitle = js.Any.fromFunction1(getTitle), getUrl = js.Any.fromFunction1(getUrl), getWindowHandle = js.Any.fromFunction1(getWindowHandle), getWindowHandles = js.Any.fromFunction1(getWindowHandles), getWindowPosition = js.Any.fromFunction1(getWindowPosition), getWindowRect = js.Any.fromFunction1(getWindowRect), gridProxyDetails = js.Any.fromFunction1(gridProxyDetails), gridTestSession = js.Any.fromFunction1(gridTestSession), gsmCall = js.Any.fromFunction1(gsmCall), gsmSignal = js.Any.fromFunction1(gsmSignal), gsmVoice = js.Any.fromFunction1(gsmVoice), hideKeyboard = js.Any.fromFunction1(hideKeyboard), installApp = js.Any.fromFunction1(installApp), interceptRequest = js.Any.fromFunction1(interceptRequest), isAlertOpen = js.Any.fromFunction1(isAlertOpen), isAppInstalled = js.Any.fromFunction1(isAppInstalled), isAutoReporting = js.Any.fromFunction1(isAutoReporting), isElementDisplayed = js.Any.fromFunction1(isElementDisplayed), isElementEnabled = js.Any.fromFunction1(isElementEnabled), isElementSelected = js.Any.fromFunction1(isElementSelected), isIMEActivated = js.Any.fromFunction1(isIMEActivated), isKeyboardShown = js.Any.fromFunction1(isKeyboardShown), isLoading = js.Any.fromFunction1(isLoading), isLocked = js.Any.fromFunction1(isLocked), jankinessCheck = js.Any.fromFunction1(jankinessCheck), launchApp = js.Any.fromFunction1(launchApp), launchChromeApp = js.Any.fromFunction1(launchChromeApp), lock = js.Any.fromFunction1(lock), logEvent = js.Any.fromFunction1(logEvent), longPressKeyCode = js.Any.fromFunction1(longPressKeyCode), manageSeleniumHubLifecycle = js.Any.fromFunction1(manageSeleniumHubLifecycle), maximizeWindow = js.Any.fromFunction1(maximizeWindow), minimizeWindow = js.Any.fromFunction1(minimizeWindow), mockRequest = js.Any.fromFunction1(mockRequest), moveToElement = js.Any.fromFunction1(moveToElement), multiTouchPerform = js.Any.fromFunction1(multiTouchPerform), navigateTo = js.Any.fromFunction1(navigateTo), newSession = js.Any.fromFunction1(newSession), openNotifications = js.Any.fromFunction1(openNotifications), performActions = js.Any.fromFunction1(performActions), positionClick = js.Any.fromFunction1(positionClick), positionDoubleClick = js.Any.fromFunction1(positionDoubleClick), powerAC = js.Any.fromFunction1(powerAC), powerCapacity = js.Any.fromFunction1(powerCapacity), pressKeyCode = js.Any.fromFunction1(pressKeyCode), printPage = js.Any.fromFunction1(printPage), pullFile = js.Any.fromFunction1(pullFile), pullFolder = js.Any.fromFunction1(pullFolder), pushFile = js.Any.fromFunction1(pushFile), queryAppState = js.Any.fromFunction1(queryAppState), queryGrid = js.Any.fromFunction1(queryGrid), receiveAsyncResponse = js.Any.fromFunction1(receiveAsyncResponse), refresh = js.Any.fromFunction1(refresh), releaseActions = js.Any.fromFunction1(releaseActions), removeAllCredentials = js.Any.fromFunction1(removeAllCredentials), removeApp = js.Any.fromFunction1(removeApp), removeCredential = js.Any.fromFunction1(removeCredential), removeVirtualAuthenticator = js.Any.fromFunction1(removeVirtualAuthenticator), replaceValue = js.Any.fromFunction1(replaceValue), reset = js.Any.fromFunction1(reset), respondMock = js.Any.fromFunction1(respondMock), resume = js.Any.fromFunction1(resume), rotateDevice = js.Any.fromFunction1(rotateDevice), selectCastSink = js.Any.fromFunction1(selectCastSink), sendAlertText = js.Any.fromFunction1(sendAlertText), sendCommand = js.Any.fromFunction1(sendCommand), sendCommandAndGetResult = js.Any.fromFunction1(sendCommandAndGetResult), sendKeyEvent = js.Any.fromFunction1(sendKeyEvent), sendKeys = js.Any.fromFunction1(sendKeys), sendSms = js.Any.fromFunction1(sendSms), setAsyncTimeout = js.Any.fromFunction1(setAsyncTimeout), setAutoReporting = js.Any.fromFunction1(setAutoReporting), setClipboard = js.Any.fromFunction1(setClipboard), setGeoLocation = js.Any.fromFunction1(setGeoLocation), setImplicitTimeout = js.Any.fromFunction1(setImplicitTimeout), setLocalStorage = js.Any.fromFunction1(setLocalStorage), setNetworkConditions = js.Any.fromFunction1(setNetworkConditions), setNetworkConnection = js.Any.fromFunction1(setNetworkConnection), setOrientation = js.Any.fromFunction1(setOrientation), setPermissions = js.Any.fromFunction1(setPermissions), setSessionStorage = js.Any.fromFunction1(setSessionStorage), setTimeZone = js.Any.fromFunction1(setTimeZone), setTimeouts = js.Any.fromFunction1(setTimeouts), setUserVerified = js.Any.fromFunction1(setUserVerified), setValueImmediate = js.Any.fromFunction1(setValueImmediate), setWindowPosition = js.Any.fromFunction1(setWindowPosition), setWindowRect = js.Any.fromFunction1(setWindowRect), shake = js.Any.fromFunction1(shake), shutdown = js.Any.fromFunction1(shutdown), startActivity = js.Any.fromFunction1(startActivity), startCastTabMirroring = js.Any.fromFunction1(startCastTabMirroring), startRecordingScreen = js.Any.fromFunction1(startRecordingScreen), status = js.Any.fromFunction1(status), stopCasting = js.Any.fromFunction1(stopCasting), stopRecordingScreen = js.Any.fromFunction1(stopRecordingScreen), switchContext = js.Any.fromFunction1(switchContext), switchToFrame = js.Any.fromFunction1(switchToFrame), switchToParentFrame = js.Any.fromFunction1(switchToParentFrame), switchToWindow = js.Any.fromFunction1(switchToWindow), takeElementScreenshot = js.Any.fromFunction1(takeElementScreenshot), takeHeapSnapshot = js.Any.fromFunction1(takeHeapSnapshot), takeScreenshot = js.Any.fromFunction1(takeScreenshot), terminateApp = js.Any.fromFunction1(terminateApp), throttleCPU = js.Any.fromFunction1(throttleCPU), throttleNetwork = js.Any.fromFunction1(throttleNetwork), toggleAirplaneMode = js.Any.fromFunction1(toggleAirplaneMode), toggleData = js.Any.fromFunction1(toggleData), toggleEnrollTouchId = js.Any.fromFunction1(toggleEnrollTouchId), toggleLocationServices = js.Any.fromFunction1(toggleLocationServices), toggleNetworkSpeed = js.Any.fromFunction1(toggleNetworkSpeed), toggleWiFi = js.Any.fromFunction1(toggleWiFi), touchClick = js.Any.fromFunction1(touchClick), touchDoubleClick = js.Any.fromFunction1(touchDoubleClick), touchDown = js.Any.fromFunction1(touchDown), touchFlick = js.Any.fromFunction1(touchFlick), touchId = js.Any.fromFunction1(touchId), touchLongClick = js.Any.fromFunction1(touchLongClick), touchMove = js.Any.fromFunction1(touchMove), touchPerform = js.Any.fromFunction1(touchPerform), touchPinch = js.Any.fromFunction1(touchPinch), touchScroll = js.Any.fromFunction1(touchScroll), touchUp = js.Any.fromFunction1(touchUp), unlock = js.Any.fromFunction1(unlock), updateMockSensor = js.Any.fromFunction1(updateMockSensor), updateSettings = js.Any.fromFunction1(updateSettings))
    __obj.asInstanceOf[MultiRemoteProtocolCommandsTypeSync]
  }
  
  extension [Self <: MultiRemoteProtocolCommandsTypeSync](x: Self) {
    
    inline def setAcceptAlert(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "acceptAlert", js.Any.fromFunction1(value))
    
    inline def setActivateApp(
      value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
    ): Self = StObject.set(x, "activateApp", js.Any.fromFunction1(value))
    
    inline def setActivateIME(
      value: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* engine */ String, Unit]]]]
    ): Self = StObject.set(x, "activateIME", js.Any.fromFunction1(value))
    
    inline def setAddCookie(
      value: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]]
    ): Self = StObject.set(x, "addCookie", js.Any.fromFunction1(value))
    
    inline def setAddCredential(
      value: /* args */ Parameters[
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
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "addCredential", js.Any.fromFunction1(value))
    
    inline def setAddVirtualAuthenticator(
      value: /* args */ Parameters[
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
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "addVirtualAuthenticator", js.Any.fromFunction1(value))
    
    inline def setAssertPerformance(
      value: /* args */ Parameters[js.Function1[/* name */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "assertPerformance", js.Any.fromFunction1(value))
    
    inline def setBack(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
    
    inline def setBackground(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "background", js.Any.fromFunction1(value))
    
    inline def setButtonDown(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "buttonDown", js.Any.fromFunction1(value))
    
    inline def setButtonUp(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "buttonUp", js.Any.fromFunction1(value))
    
    inline def setClearLocalStorage(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "clearLocalStorage", js.Any.fromFunction1(value))
    
    inline def setClearMockCalls(
      value: /* args */ Parameters[js.Function1[/* mockId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, Unit]]]]
    ): Self = StObject.set(x, "clearMockCalls", js.Any.fromFunction1(value))
    
    inline def setClearSessionStorage(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "clearSessionStorage", js.Any.fromFunction1(value))
    
    inline def setCloseApp(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "closeApp", js.Any.fromFunction1(value))
    
    inline def setCloseWindow(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "closeWindow", js.Any.fromFunction1(value))
    
    inline def setCompareImages(
      value: /* args */ Parameters[
          js.Function4[
            /* mode */ String, 
            /* firstImage */ String, 
            /* secondImage */ String, 
            /* options */ js.Object, 
            ProtocolCommandResponse
          ]
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "compareImages", js.Any.fromFunction1(value))
    
    inline def setCreateMockSensor(
      value: /* args */ Parameters[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "createMockSensor", js.Any.fromFunction1(value))
    
    inline def setCreateWindow(
      value: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]]
    ): Self = StObject.set(x, "createWindow", js.Any.fromFunction1(value))
    
    inline def setDeactivateIME(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "deactivateIME", js.Any.fromFunction1(value))
    
    inline def setDeleteAllCookies(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "deleteAllCookies", js.Any.fromFunction1(value))
    
    inline def setDeleteCookie(
      value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]]
    ): Self = StObject.set(x, "deleteCookie", js.Any.fromFunction1(value))
    
    inline def setDeleteLocalStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]]
    ): Self = StObject.set(x, "deleteLocalStorageItem", js.Any.fromFunction1(value))
    
    inline def setDeleteMockSensor(
      value: /* args */ Parameters[js.Function1[/* type */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, Unit]]]]
    ): Self = StObject.set(x, "deleteMockSensor", js.Any.fromFunction1(value))
    
    inline def setDeleteNetworkConditions(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "deleteNetworkConditions", js.Any.fromFunction1(value))
    
    inline def setDeleteSession(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
    
    inline def setDeleteSessionStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, Unit]]]]
    ): Self = StObject.set(x, "deleteSessionStorageItem", js.Any.fromFunction1(value))
    
    inline def setDismissAlert(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "dismissAlert", js.Any.fromFunction1(value))
    
    inline def setDriverScript(
      value: /* args */ Parameters[js.Function1[/* script */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* script */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "driverScript", js.Any.fromFunction1(value))
    
    inline def setElementClear(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
    ): Self = StObject.set(x, "elementClear", js.Any.fromFunction1(value))
    
    inline def setElementClick(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
    ): Self = StObject.set(x, "elementClick", js.Any.fromFunction1(value))
    
    inline def setElementEquals(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
          ]
        ]
    ): Self = StObject.set(x, "elementEquals", js.Any.fromFunction1(value))
    
    inline def setElementHover(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
    ): Self = StObject.set(x, "elementHover", js.Any.fromFunction1(value))
    
    inline def setElementSendKeys(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
        ]
    ): Self = StObject.set(x, "elementSendKeys", js.Any.fromFunction1(value))
    
    inline def setElementSubmit(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Unit]]]]
    ): Self = StObject.set(x, "elementSubmit", js.Any.fromFunction1(value))
    
    inline def setEndCoverage(
      value: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]]
    ): Self = StObject.set(x, "endCoverage", js.Any.fromFunction1(value))
    
    inline def setExecuteAsyncScript(
      value: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "executeAsyncScript", js.Any.fromFunction1(value))
    
    inline def setExecuteScript(
      value: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "executeScript", js.Any.fromFunction1(value))
    
    inline def setFile(
      value: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* file */ String, String]]]]
    ): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
    
    inline def setFindElement(
      value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
          ]
        ]
    ): Self = StObject.set(x, "findElement", js.Any.fromFunction1(value))
    
    inline def setFindElementFromElement(
      value: /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElementFromElement", js.Any.fromFunction1(value))
    
    inline def setFindElementFromShadowRoot(
      value: /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElementFromShadowRoot", js.Any.fromFunction1(value))
    
    inline def setFindElements(
      value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
          ]
        ]
    ): Self = StObject.set(x, "findElements", js.Any.fromFunction1(value))
    
    inline def setFindElementsFromElement(
      value: /* args */ Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "findElementsFromElement", js.Any.fromFunction1(value))
    
    inline def setFindElementsFromShadowRoot(
      value: /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
            ]
          ]
        ]
    ): Self = StObject.set(x, "findElementsFromShadowRoot", js.Any.fromFunction1(value))
    
    inline def setFingerPrint(
      value: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]]
    ): Self = StObject.set(x, "fingerPrint", js.Any.fromFunction1(value))
    
    inline def setForward(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
    
    inline def setFreeze(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "freeze", js.Any.fromFunction1(value))
    
    inline def setFullscreenWindow(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
    ): Self = StObject.set(x, "fullscreenWindow", js.Any.fromFunction1(value))
    
    inline def setGenerateTestReport(
      value: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
        ]
    ): Self = StObject.set(x, "generateTestReport", js.Any.fromFunction1(value))
    
    inline def setGetActiveElement(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
    
    inline def setGetActiveEngine(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getActiveEngine", js.Any.fromFunction1(value))
    
    inline def setGetAlertText(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getAlertText", js.Any.fromFunction1(value))
    
    inline def setGetAllCookies(
      value: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[Cookie]]]]]
    ): Self = StObject.set(x, "getAllCookies", js.Any.fromFunction1(value))
    
    inline def setGetApplicationCacheStatus(
      value: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
    ): Self = StObject.set(x, "getApplicationCacheStatus", js.Any.fromFunction1(value))
    
    inline def setGetAvailableEngines(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
    ): Self = StObject.set(x, "getAvailableEngines", js.Any.fromFunction1(value))
    
    inline def setGetCastIssueMessage(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getCastIssueMessage", js.Any.fromFunction1(value))
    
    inline def setGetCastSinks(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
    ): Self = StObject.set(x, "getCastSinks", js.Any.fromFunction1(value))
    
    inline def setGetClipboard(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
    
    inline def setGetContext(
      value: /* args */ Parameters[js.Function0[Context]] => js.Array[ThenArg[ReturnType[js.Function0[Context]]]]
    ): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    inline def setGetContexts(
      value: /* args */ Parameters[js.Function0[js.Array[Context]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[Context]]]]]
    ): Self = StObject.set(x, "getContexts", js.Any.fromFunction1(value))
    
    inline def setGetCredentials(
      value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
    ): Self = StObject.set(x, "getCredentials", js.Any.fromFunction1(value))
    
    inline def setGetCurrentActivity(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getCurrentActivity", js.Any.fromFunction1(value))
    
    inline def setGetCurrentPackage(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getCurrentPackage", js.Any.fromFunction1(value))
    
    inline def setGetDeviceTime(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getDeviceTime", js.Any.fromFunction1(value))
    
    inline def setGetDisplayDensity(
      value: /* args */ Parameters[js.Function0[Any]] => js.Array[ThenArg[ReturnType[js.Function0[Any]]]]
    ): Self = StObject.set(x, "getDisplayDensity", js.Any.fromFunction1(value))
    
    inline def setGetElementAttribute(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
        ]
    ): Self = StObject.set(x, "getElementAttribute", js.Any.fromFunction1(value))
    
    inline def setGetElementCSSValue(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
          ]
        ]
    ): Self = StObject.set(x, "getElementCSSValue", js.Any.fromFunction1(value))
    
    inline def setGetElementComputedLabel(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
    ): Self = StObject.set(x, "getElementComputedLabel", js.Any.fromFunction1(value))
    
    inline def setGetElementComputedRole(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
    ): Self = StObject.set(x, "getElementComputedRole", js.Any.fromFunction1(value))
    
    inline def setGetElementLocation(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Array[
          ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
        ]
    ): Self = StObject.set(x, "getElementLocation", js.Any.fromFunction1(value))
    
    inline def setGetElementLocationInView(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Array[
          ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
        ]
    ): Self = StObject.set(x, "getElementLocationInView", js.Any.fromFunction1(value))
    
    inline def setGetElementProperty(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
        ]
    ): Self = StObject.set(x, "getElementProperty", js.Any.fromFunction1(value))
    
    inline def setGetElementRect(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]]
    ): Self = StObject.set(x, "getElementRect", js.Any.fromFunction1(value))
    
    inline def setGetElementShadowRoot(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
    ): Self = StObject.set(x, "getElementShadowRoot", js.Any.fromFunction1(value))
    
    inline def setGetElementSize(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Array[
          ThenArg[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
        ]
    ): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
    
    inline def setGetElementTagName(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
    ): Self = StObject.set(x, "getElementTagName", js.Any.fromFunction1(value))
    
    inline def setGetElementText(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
    ): Self = StObject.set(x, "getElementText", js.Any.fromFunction1(value))
    
    inline def setGetElementValue(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String | Null]]]]
    ): Self = StObject.set(x, "getElementValue", js.Any.fromFunction1(value))
    
    inline def setGetEvents(
      value: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Array[
          ThenArg[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
        ]
    ): Self = StObject.set(x, "getEvents", js.Any.fromFunction1(value))
    
    inline def setGetGeoLocation(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getGeoLocation", js.Any.fromFunction1(value))
    
    inline def setGetHubConfig(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getHubConfig", js.Any.fromFunction1(value))
    
    inline def setGetLocalStorage(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
    ): Self = StObject.set(x, "getLocalStorage", js.Any.fromFunction1(value))
    
    inline def setGetLocalStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]]
    ): Self = StObject.set(x, "getLocalStorageItem", js.Any.fromFunction1(value))
    
    inline def setGetLocalStorageSize(
      value: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
    ): Self = StObject.set(x, "getLocalStorageSize", js.Any.fromFunction1(value))
    
    inline def setGetLogTypes(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
    ): Self = StObject.set(x, "getLogTypes", js.Any.fromFunction1(value))
    
    inline def setGetLogs(
      value: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]]
    ): Self = StObject.set(x, "getLogs", js.Any.fromFunction1(value))
    
    inline def setGetMockCalls(
      value: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getMockCalls", js.Any.fromFunction1(value))
    
    inline def setGetMockSensor(
      value: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getMockSensor", js.Any.fromFunction1(value))
    
    inline def setGetNamedCookie(
      value: /* args */ Parameters[js.Function1[/* name */ String, Cookie]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Cookie]]]]
    ): Self = StObject.set(x, "getNamedCookie", js.Any.fromFunction1(value))
    
    inline def setGetNetworkConditions(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getNetworkConditions", js.Any.fromFunction1(value))
    
    inline def setGetNetworkConnection(
      value: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
    ): Self = StObject.set(x, "getNetworkConnection", js.Any.fromFunction1(value))
    
    inline def setGetOrientation(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getOrientation", js.Any.fromFunction1(value))
    
    inline def setGetPageIndex(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction1(value))
    
    inline def setGetPageLogs(
      value: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getPageLogs", js.Any.fromFunction1(value))
    
    inline def setGetPageSource(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getPageSource", js.Any.fromFunction1(value))
    
    inline def setGetPerformanceData(
      value: /* args */ Parameters[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* packageName */ String, /* dataType */ String, js.Array[String]]]
          ]
        ]
    ): Self = StObject.set(x, "getPerformanceData", js.Any.fromFunction1(value))
    
    inline def setGetPerformanceDataTypes(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
    ): Self = StObject.set(x, "getPerformanceDataTypes", js.Any.fromFunction1(value))
    
    inline def setGetSession(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
    
    inline def setGetSessionStorage(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
    ): Self = StObject.set(x, "getSessionStorage", js.Any.fromFunction1(value))
    
    inline def setGetSessionStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* key */ String, String]]]]
    ): Self = StObject.set(x, "getSessionStorageItem", js.Any.fromFunction1(value))
    
    inline def setGetSessionStorageSize(
      value: /* args */ Parameters[js.Function0[Double]] => js.Array[ThenArg[ReturnType[js.Function0[Double]]]]
    ): Self = StObject.set(x, "getSessionStorageSize", js.Any.fromFunction1(value))
    
    inline def setGetSessions(
      value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]]
    ): Self = StObject.set(x, "getSessions", js.Any.fromFunction1(value))
    
    inline def setGetSettings(
      value: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Array[ThenArg[ReturnType[js.Function0[SettingsReturn]]]]
    ): Self = StObject.set(x, "getSettings", js.Any.fromFunction1(value))
    
    inline def setGetStrings(
      value: /* args */ Parameters[js.Function0[StringsReturn]] => js.Array[ThenArg[ReturnType[js.Function0[StringsReturn]]]]
    ): Self = StObject.set(x, "getStrings", js.Any.fromFunction1(value))
    
    inline def setGetSystemBars(
      value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[js.Object]]]]]
    ): Self = StObject.set(x, "getSystemBars", js.Any.fromFunction1(value))
    
    inline def setGetTimeouts(
      value: /* args */ Parameters[js.Function0[Timeouts]] => js.Array[ThenArg[ReturnType[js.Function0[Timeouts]]]]
    ): Self = StObject.set(x, "getTimeouts", js.Any.fromFunction1(value))
    
    inline def setGetTitle(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
    
    inline def setGetUrl(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
    
    inline def setGetWindowHandle(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction1(value))
    
    inline def setGetWindowHandles(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Array[ThenArg[ReturnType[js.Function0[js.Array[String]]]]]
    ): Self = StObject.set(x, "getWindowHandles", js.Any.fromFunction1(value))
    
    inline def setGetWindowPosition(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "getWindowPosition", js.Any.fromFunction1(value))
    
    inline def setGetWindowRect(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
    ): Self = StObject.set(x, "getWindowRect", js.Any.fromFunction1(value))
    
    inline def setGridProxyDetails(
      value: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "gridProxyDetails", js.Any.fromFunction1(value))
    
    inline def setGridTestSession(
      value: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "gridTestSession", js.Any.fromFunction1(value))
    
    inline def setGsmCall(
      value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
        ]
    ): Self = StObject.set(x, "gsmCall", js.Any.fromFunction1(value))
    
    inline def setGsmSignal(
      value: /* args */ Parameters[js.Function1[/* signalStrength */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* signalStrength */ String, Unit]]]]
    ): Self = StObject.set(x, "gsmSignal", js.Any.fromFunction1(value))
    
    inline def setGsmVoice(
      value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]]
    ): Self = StObject.set(x, "gsmVoice", js.Any.fromFunction1(value))
    
    inline def setHideKeyboard(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "hideKeyboard", js.Any.fromFunction1(value))
    
    inline def setInstallApp(
      value: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appPath */ String, Unit]]]]
    ): Self = StObject.set(x, "installApp", js.Any.fromFunction1(value))
    
    inline def setInterceptRequest(
      value: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]]
    ): Self = StObject.set(x, "interceptRequest", js.Any.fromFunction1(value))
    
    inline def setIsAlertOpen(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
    ): Self = StObject.set(x, "isAlertOpen", js.Any.fromFunction1(value))
    
    inline def setIsAppInstalled(
      value: /* args */ Parameters[js.Function1[/* appId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Boolean]]]]
    ): Self = StObject.set(x, "isAppInstalled", js.Any.fromFunction1(value))
    
    inline def setIsAutoReporting(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
    ): Self = StObject.set(x, "isAutoReporting", js.Any.fromFunction1(value))
    
    inline def setIsElementDisplayed(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
    ): Self = StObject.set(x, "isElementDisplayed", js.Any.fromFunction1(value))
    
    inline def setIsElementEnabled(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
    ): Self = StObject.set(x, "isElementEnabled", js.Any.fromFunction1(value))
    
    inline def setIsElementSelected(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, Boolean]]]]
    ): Self = StObject.set(x, "isElementSelected", js.Any.fromFunction1(value))
    
    inline def setIsIMEActivated(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
    ): Self = StObject.set(x, "isIMEActivated", js.Any.fromFunction1(value))
    
    inline def setIsKeyboardShown(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
    ): Self = StObject.set(x, "isKeyboardShown", js.Any.fromFunction1(value))
    
    inline def setIsLoading(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
    ): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
    
    inline def setIsLocked(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Array[ThenArg[ReturnType[js.Function0[Boolean]]]]
    ): Self = StObject.set(x, "isLocked", js.Any.fromFunction1(value))
    
    inline def setJankinessCheck(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "jankinessCheck", js.Any.fromFunction1(value))
    
    inline def setLaunchApp(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "launchApp", js.Any.fromFunction1(value))
    
    inline def setLaunchChromeApp(
      value: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* id */ String, Unit]]]]
    ): Self = StObject.set(x, "launchChromeApp", js.Any.fromFunction1(value))
    
    inline def setLock(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
    
    inline def setLogEvent(
      value: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]]
    ): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
    
    inline def setLongPressKeyCode(
      value: /* args */ Parameters[js.Function1[/* keycode */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]]
    ): Self = StObject.set(x, "longPressKeyCode", js.Any.fromFunction1(value))
    
    inline def setManageSeleniumHubLifecycle(
      value: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* action */ String, Unit]]]]
    ): Self = StObject.set(x, "manageSeleniumHubLifecycle", js.Any.fromFunction1(value))
    
    inline def setMaximizeWindow(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
    ): Self = StObject.set(x, "maximizeWindow", js.Any.fromFunction1(value))
    
    inline def setMinimizeWindow(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
    ): Self = StObject.set(x, "minimizeWindow", js.Any.fromFunction1(value))
    
    inline def setMockRequest(
      value: /* args */ Parameters[js.Function1[/* url */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "mockRequest", js.Any.fromFunction1(value))
    
    inline def setMoveToElement(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "moveToElement", js.Any.fromFunction1(value))
    
    inline def setMultiTouchPerform(
      value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
    ): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction1(value))
    
    inline def setNavigateTo(
      value: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* url */ String, String]]]]
    ): Self = StObject.set(x, "navigateTo", js.Any.fromFunction1(value))
    
    inline def setNewSession(
      value: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Array[ThenArg[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]]
    ): Self = StObject.set(x, "newSession", js.Any.fromFunction1(value))
    
    inline def setOpenNotifications(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "openNotifications", js.Any.fromFunction1(value))
    
    inline def setPerformActions(
      value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
    ): Self = StObject.set(x, "performActions", js.Any.fromFunction1(value))
    
    inline def setPositionClick(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "positionClick", js.Any.fromFunction1(value))
    
    inline def setPositionDoubleClick(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "positionDoubleClick", js.Any.fromFunction1(value))
    
    inline def setPowerAC(
      value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* state */ String, Unit]]]]
    ): Self = StObject.set(x, "powerAC", js.Any.fromFunction1(value))
    
    inline def setPowerCapacity(
      value: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* percent */ Double, Unit]]]]
    ): Self = StObject.set(x, "powerCapacity", js.Any.fromFunction1(value))
    
    inline def setPressKeyCode(
      value: /* args */ Parameters[js.Function1[/* keycode */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ Double, Unit]]]]
    ): Self = StObject.set(x, "pressKeyCode", js.Any.fromFunction1(value))
    
    inline def setPrintPage(
      value: /* args */ Parameters[
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
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "printPage", js.Any.fromFunction1(value))
    
    inline def setPullFile(
      value: /* args */ Parameters[js.Function1[/* path */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, String]]]]
    ): Self = StObject.set(x, "pullFile", js.Any.fromFunction1(value))
    
    inline def setPullFolder(
      value: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* path */ String, Unit]]]]
    ): Self = StObject.set(x, "pullFolder", js.Any.fromFunction1(value))
    
    inline def setPushFile(
      value: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]]
    ): Self = StObject.set(x, "pushFile", js.Any.fromFunction1(value))
    
    inline def setQueryAppState(
      value: /* args */ Parameters[js.Function1[/* appId */ String, Double]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Double]]]]
    ): Self = StObject.set(x, "queryAppState", js.Any.fromFunction1(value))
    
    inline def setQueryGrid(
      value: /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "queryGrid", js.Any.fromFunction1(value))
    
    inline def setReceiveAsyncResponse(
      value: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* response */ js.Object, Unit]]]]
    ): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction1(value))
    
    inline def setRefresh(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    
    inline def setReleaseActions(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "releaseActions", js.Any.fromFunction1(value))
    
    inline def setRemoveAllCredentials(
      value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
    ): Self = StObject.set(x, "removeAllCredentials", js.Any.fromFunction1(value))
    
    inline def setRemoveApp(
      value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
    ): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
    
    inline def setRemoveCredential(
      value: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
          ]
        ]
    ): Self = StObject.set(x, "removeCredential", js.Any.fromFunction1(value))
    
    inline def setRemoveVirtualAuthenticator(
      value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]]
    ): Self = StObject.set(x, "removeVirtualAuthenticator", js.Any.fromFunction1(value))
    
    inline def setReplaceValue(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
        ]
    ): Self = StObject.set(x, "replaceValue", js.Any.fromFunction1(value))
    
    inline def setReset(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setRespondMock(
      value: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
        ]
    ): Self = StObject.set(x, "respondMock", js.Any.fromFunction1(value))
    
    inline def setResume(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
    
    inline def setRotateDevice(
      value: /* args */ Parameters[
          js.Function6[
            /* x */ Double, 
            /* y */ Double, 
            /* radius */ Double, 
            /* rotation */ Double, 
            /* touchCount */ Double, 
            /* duration */ Double, 
            Unit
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function6[
                /* x */ Double, 
                /* y */ Double, 
                /* radius */ Double, 
                /* rotation */ Double, 
                /* touchCount */ Double, 
                /* duration */ Double, 
                Unit
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "rotateDevice", js.Any.fromFunction1(value))
    
    inline def setSelectCastSink(
      value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
    ): Self = StObject.set(x, "selectCastSink", js.Any.fromFunction1(value))
    
    inline def setSendAlertText(
      value: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* text */ String, Unit]]]]
    ): Self = StObject.set(x, "sendAlertText", js.Any.fromFunction1(value))
    
    inline def setSendCommand(
      value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
        ]
    ): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
    
    inline def setSendCommandAndGetResult(
      value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]] => js.Array[ThenArg[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]]
    ): Self = StObject.set(x, "sendCommandAndGetResult", js.Any.fromFunction1(value))
    
    inline def setSendKeyEvent(
      value: /* args */ Parameters[js.Function1[/* keycode */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* keycode */ String, Unit]]]]
    ): Self = StObject.set(x, "sendKeyEvent", js.Any.fromFunction1(value))
    
    inline def setSendKeys(
      value: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]]
    ): Self = StObject.set(x, "sendKeys", js.Any.fromFunction1(value))
    
    inline def setSendSms(
      value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
        ]
    ): Self = StObject.set(x, "sendSms", js.Any.fromFunction1(value))
    
    inline def setSetAsyncTimeout(
      value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]]
    ): Self = StObject.set(x, "setAsyncTimeout", js.Any.fromFunction1(value))
    
    inline def setSetAutoReporting(
      value: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Array[ThenArg[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]]
    ): Self = StObject.set(x, "setAutoReporting", js.Any.fromFunction1(value))
    
    inline def setSetClipboard(
      value: /* args */ Parameters[js.Function1[/* content */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* content */ String, String]]]]
    ): Self = StObject.set(x, "setClipboard", js.Any.fromFunction1(value))
    
    inline def setSetGeoLocation(
      value: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* location */ js.Object, Unit]]]]
    ): Self = StObject.set(x, "setGeoLocation", js.Any.fromFunction1(value))
    
    inline def setSetImplicitTimeout(
      value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* ms */ Double, Unit]]]]
    ): Self = StObject.set(x, "setImplicitTimeout", js.Any.fromFunction1(value))
    
    inline def setSetLocalStorage(
      value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]]
    ): Self = StObject.set(x, "setLocalStorage", js.Any.fromFunction1(value))
    
    inline def setSetNetworkConditions(
      value: /* args */ Parameters[js.Function1[/* networkConditions */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* networkConditions */ js.Object, Unit]]]]
    ): Self = StObject.set(x, "setNetworkConditions", js.Any.fromFunction1(value))
    
    inline def setSetNetworkConnection(
      value: /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]] => js.Array[ThenArg[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]]
    ): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1(value))
    
    inline def setSetOrientation(
      value: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* orientation */ String, Unit]]]]
    ): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
    
    inline def setSetPermissions(
      value: /* args */ Parameters[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* descriptor */ js.Object, /* state */ String, Unit]]]
        ]
    ): Self = StObject.set(x, "setPermissions", js.Any.fromFunction1(value))
    
    inline def setSetSessionStorage(
      value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]]
    ): Self = StObject.set(x, "setSessionStorage", js.Any.fromFunction1(value))
    
    inline def setSetTimeZone(
      value: /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* timeZone */ String, Unit]]]]
    ): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
    
    inline def setSetTimeouts(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "setTimeouts", js.Any.fromFunction1(value))
    
    inline def setSetUserVerified(
      value: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
          ]
        ]
    ): Self = StObject.set(x, "setUserVerified", js.Any.fromFunction1(value))
    
    inline def setSetValueImmediate(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
        ]
    ): Self = StObject.set(x, "setValueImmediate", js.Any.fromFunction1(value))
    
    inline def setSetWindowPosition(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Array[
          ThenArg[
            ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
          ]
        ]
    ): Self = StObject.set(x, "setWindowPosition", js.Any.fromFunction1(value))
    
    inline def setSetWindowRect(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Array[ThenArg[ReturnType[js.Function0[RectReturn]]]]
    ): Self = StObject.set(x, "setWindowRect", js.Any.fromFunction1(value))
    
    inline def setShake(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
    
    inline def setShutdown(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
    
    inline def setStartActivity(
      value: /* args */ Parameters[
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
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "startActivity", js.Any.fromFunction1(value))
    
    inline def setStartCastTabMirroring(
      value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
    ): Self = StObject.set(x, "startCastTabMirroring", js.Any.fromFunction1(value))
    
    inline def setStartRecordingScreen(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "startRecordingScreen", js.Any.fromFunction1(value))
    
    inline def setStatus(
      value: /* args */ Parameters[js.Function0[StatusReturn]] => js.Array[ThenArg[ReturnType[js.Function0[StatusReturn]]]]
    ): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
    
    inline def setStopCasting(
      value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* sinkName */ String, Unit]]]]
    ): Self = StObject.set(x, "stopCasting", js.Any.fromFunction1(value))
    
    inline def setStopRecordingScreen(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "stopRecordingScreen", js.Any.fromFunction1(value))
    
    inline def setSwitchContext(
      value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* name */ String, Unit]]]]
    ): Self = StObject.set(x, "switchContext", js.Any.fromFunction1(value))
    
    inline def setSwitchToFrame(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "switchToFrame", js.Any.fromFunction1(value))
    
    inline def setSwitchToParentFrame(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "switchToParentFrame", js.Any.fromFunction1(value))
    
    inline def setSwitchToWindow(
      value: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* handle */ String, Unit]]]]
    ): Self = StObject.set(x, "switchToWindow", js.Any.fromFunction1(value))
    
    inline def setTakeElementScreenshot(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Array[ThenArg[ReturnType[js.Function1[/* elementId */ String, String]]]]
    ): Self = StObject.set(x, "takeElementScreenshot", js.Any.fromFunction1(value))
    
    inline def setTakeHeapSnapshot(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "takeHeapSnapshot", js.Any.fromFunction1(value))
    
    inline def setTakeScreenshot(
      value: /* args */ Parameters[js.Function0[String]] => js.Array[ThenArg[ReturnType[js.Function0[String]]]]
    ): Self = StObject.set(x, "takeScreenshot", js.Any.fromFunction1(value))
    
    inline def setTerminateApp(
      value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* appId */ String, Unit]]]]
    ): Self = StObject.set(x, "terminateApp", js.Any.fromFunction1(value))
    
    inline def setThrottleCPU(
      value: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* rate */ Double, Unit]]]]
    ): Self = StObject.set(x, "throttleCPU", js.Any.fromFunction1(value))
    
    inline def setThrottleNetwork(
      value: /* args */ Parameters[js.Function1[/* condition */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* condition */ String, Unit]]]]
    ): Self = StObject.set(x, "throttleNetwork", js.Any.fromFunction1(value))
    
    inline def setToggleAirplaneMode(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "toggleAirplaneMode", js.Any.fromFunction1(value))
    
    inline def setToggleData(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "toggleData", js.Any.fromFunction1(value))
    
    inline def setToggleEnrollTouchId(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "toggleEnrollTouchId", js.Any.fromFunction1(value))
    
    inline def setToggleLocationServices(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "toggleLocationServices", js.Any.fromFunction1(value))
    
    inline def setToggleNetworkSpeed(
      value: /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* netspeed */ String, Unit]]]]
    ): Self = StObject.set(x, "toggleNetworkSpeed", js.Any.fromFunction1(value))
    
    inline def setToggleWiFi(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "toggleWiFi", js.Any.fromFunction1(value))
    
    inline def setTouchClick(
      value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
    ): Self = StObject.set(x, "touchClick", js.Any.fromFunction1(value))
    
    inline def setTouchDoubleClick(
      value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
    ): Self = StObject.set(x, "touchDoubleClick", js.Any.fromFunction1(value))
    
    inline def setTouchDown(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
    ): Self = StObject.set(x, "touchDown", js.Any.fromFunction1(value))
    
    inline def setTouchFlick(
      value: /* args */ Parameters[
          js.Function6[
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            /* element */ js.UndefOr[String], 
            /* speed */ js.UndefOr[Double], 
            /* xspeed */ js.UndefOr[Double], 
            /* yspeed */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "touchFlick", js.Any.fromFunction1(value))
    
    inline def setTouchId(
      value: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* match */ Boolean, Unit]]]]
    ): Self = StObject.set(x, "touchId", js.Any.fromFunction1(value))
    
    inline def setTouchLongClick(
      value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* element */ String, Unit]]]]
    ): Self = StObject.set(x, "touchLongClick", js.Any.fromFunction1(value))
    
    inline def setTouchMove(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
    ): Self = StObject.set(x, "touchMove", js.Any.fromFunction1(value))
    
    inline def setTouchPerform(
      value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]]
    ): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1(value))
    
    inline def setTouchPinch(
      value: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Array[
          ThenArg[
            ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
          ]
        ]
    ): Self = StObject.set(x, "touchPinch", js.Any.fromFunction1(value))
    
    inline def setTouchScroll(
      value: /* args */ Parameters[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]] => js.Array[
          ThenArg[ReturnType[js.Function2[/* xoffset */ Double, /* yoffset */ Double, Unit]]]
        ]
    ): Self = StObject.set(x, "touchScroll", js.Any.fromFunction1(value))
    
    inline def setTouchUp(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]]
    ): Self = StObject.set(x, "touchUp", js.Any.fromFunction1(value))
    
    inline def setUnlock(
      value: /* args */ Parameters[js.Function0[Unit]] => js.Array[ThenArg[ReturnType[js.Function0[Unit]]]]
    ): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
    
    inline def setUpdateMockSensor(
      value: /* args */ Parameters[
          js.Function4[
            /* type */ String, 
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ] => js.Array[
          ThenArg[
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
    ): Self = StObject.set(x, "updateMockSensor", js.Any.fromFunction1(value))
    
    inline def setUpdateSettings(
      value: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Array[ThenArg[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]]
    ): Self = StObject.set(x, "updateSettings", js.Any.fromFunction1(value))
    
    inline def set_getWindowSize(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Array[ThenArg[ReturnType[js.Function0[ProtocolCommandResponse]]]]
    ): Self = StObject.set(x, "_getWindowSize", js.Any.fromFunction1(value))
    
    inline def set_setWindowSize(
      value: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Array[ThenArg[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]]
    ): Self = StObject.set(x, "_setWindowSize", js.Any.fromFunction1(value))
  }
}
