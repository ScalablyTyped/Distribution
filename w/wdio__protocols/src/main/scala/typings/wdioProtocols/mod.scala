package typings.wdioProtocols

import typings.std.Parameters
import typings.std.ReturnType
import typings.wdioProtocols.typesMod.Context
import typings.wdioProtocols.typesMod.Cookie
import typings.wdioProtocols.typesMod.ElementReference
import typings.wdioProtocols.typesMod.Protocol
import typings.wdioProtocols.typesMod.ProtocolCommandResponse
import typings.wdioProtocols.typesMod.RectReturn
import typings.wdioProtocols.typesMod.SessionReturn
import typings.wdioProtocols.typesMod.SettingsReturn
import typings.wdioProtocols.typesMod.StatusReturn
import typings.wdioProtocols.typesMod.StringsReturn
import typings.wdioProtocols.typesMod.Timeouts
import typings.wdioProtocols.typesMod.WindowHandle
import typings.wdioProtocols.wdioProtocolsStrings.tab
import typings.wdioProtocols.wdioProtocolsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/protocols", "AppiumProtocol")
  @js.native
  val AppiumProtocol: Protocol = js.native
  
  @JSImport("@wdio/protocols", "CAPABILITY_KEYS")
  @js.native
  val CAPABILITY_KEYS: js.Array[String] = js.native
  
  @JSImport("@wdio/protocols", "ChromiumProtocol")
  @js.native
  val ChromiumProtocol: Protocol = js.native
  
  @JSImport("@wdio/protocols", "GeckoProtocol")
  @js.native
  val GeckoProtocol: Protocol = js.native
  
  @JSImport("@wdio/protocols", "JsonWProtocol")
  @js.native
  val JsonWProtocol: Protocol = js.native
  
  @JSImport("@wdio/protocols", "MJsonWProtocol")
  @js.native
  val MJsonWProtocol: Protocol = js.native
  
  @JSImport("@wdio/protocols", "SauceLabsProtocol")
  @js.native
  val SauceLabsProtocol: Protocol = js.native
  
  @JSImport("@wdio/protocols", "SeleniumProtocol")
  @js.native
  val SeleniumProtocol: Protocol = js.native
  
  @JSImport("@wdio/protocols", "WebDriverProtocol")
  @js.native
  val WebDriverProtocol: Protocol = js.native
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/appium.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/appium.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/appium.default[K]>>} */
  trait AppiumCommandsAsync extends StObject {
    
    def activateApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
    @JSName("activateApp")
    var activateApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    
    def background(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ Double | Null, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
    @JSName("background")
    var background_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
      ]
    
    def closeApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("closeApp")
    var closeApp_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def compareImages(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* mode */ String, 
            /* firstImage */ String, 
            /* secondImage */ String, 
            /* options */ js.Object, 
            ProtocolCommandResponse
          ]
        ]
    ): js.Promise[
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
    
    def driverScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ]
      ]
    @JSName("driverScript")
    var driverScript_Original: js.Function1[
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
    
    def endCoverage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
    @JSName("endCoverage")
    var endCoverage_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
      ]
    
    def fingerPrint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* fingerprintId */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
    @JSName("fingerPrint")
    var fingerPrint_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
      ]
    
    def getClipboard(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]]
    ): js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
    @JSName("getClipboard")
    var getClipboard_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
        js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
      ]
    
    def getCurrentActivity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getCurrentActivity")
    var getCurrentActivity_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getCurrentPackage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getCurrentPackage")
    var getCurrentPackage_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getDeviceTime(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getDeviceTime")
    var getDeviceTime_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getDisplayDensity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Any]]
    ): js.Promise[ReturnType[js.Function0[Any]]]
    @JSName("getDisplayDensity")
    var getDisplayDensity_Original: js.Function1[
        /* args */ Parameters[js.Function0[Any]], 
        js.Promise[ReturnType[js.Function0[Any]]]
      ]
    
    def getEvents(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
    @JSName("getEvents")
    var getEvents_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
      ]
    
    def getPerformanceData(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ]
      ]
    
    def getPerformanceDataTypes(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getPerformanceDataTypes")
    var getPerformanceDataTypes_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    @JSName("getPerformanceData")
    var getPerformanceData_Original: js.Function1[
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
    
    def getSettings(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[SettingsReturn]]
    ): js.Promise[ReturnType[js.Function0[SettingsReturn]]]
    @JSName("getSettings")
    var getSettings_Original: js.Function1[
        /* args */ Parameters[js.Function0[SettingsReturn]], 
        js.Promise[ReturnType[js.Function0[SettingsReturn]]]
      ]
    
    def getStrings(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ]
      ]
    @JSName("getStrings")
    var getStrings_Original: js.Function1[
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
    
    def getSystemBars(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
    @JSName("getSystemBars")
    var getSystemBars_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    
    def gsmCall(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
    @JSName("gsmCall")
    var gsmCall_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
      ]
    
    def gsmSignal(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ]
      ]
    @JSName("gsmSignal")
    var gsmSignal_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
          ]
        ]
      ]
    
    def gsmVoice(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
    @JSName("gsmVoice")
    var gsmVoice_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    
    def hideKeyboard(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* strategy */ js.UndefOr[String], 
            /* key */ js.UndefOr[String], 
            /* keyCode */ js.UndefOr[String], 
            /* keyName */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): js.Promise[
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
    @JSName("hideKeyboard")
    var hideKeyboard_Original: js.Function1[
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
    
    def installApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appPath */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
    @JSName("installApp")
    var installApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
      ]
    
    def isAppInstalled(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
    @JSName("isAppInstalled")
    var isAppInstalled_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
      ]
    
    def isKeyboardShown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isKeyboardShown")
    var isKeyboardShown_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isLocked(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isLocked")
    var isLocked_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def launchApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("launchApp")
    var launchApp_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def lock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
    @JSName("lock")
    var lock_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
      ]
    
    def logEvent(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
    @JSName("logEvent")
    var logEvent_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
      ]
    
    def longPressKeyCode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("longPressKeyCode")
    var longPressKeyCode_Original: js.Function1[
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
    
    def multiTouchPerform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    @JSName("multiTouchPerform")
    var multiTouchPerform_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    
    def openNotifications(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("openNotifications")
    var openNotifications_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def powerAC(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
    @JSName("powerAC")
    var powerAC_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    
    def powerCapacity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* percent */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
    @JSName("powerCapacity")
    var powerCapacity_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
      ]
    
    def pressKeyCode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("pressKeyCode")
    var pressKeyCode_Original: js.Function1[
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
    
    def pullFile(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
    @JSName("pullFile")
    var pullFile_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
      ]
    
    def pullFolder(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
    @JSName("pullFolder")
    var pullFolder_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
      ]
    
    def pushFile(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* path */ String, /* data */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
    @JSName("pushFile")
    var pushFile_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
      ]
    
    def queryAppState(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Double]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
    @JSName("queryAppState")
    var queryAppState_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
      ]
    
    def receiveAsyncResponse(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* response */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
    @JSName("receiveAsyncResponse")
    var receiveAsyncResponse_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
      ]
    
    def removeApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
    @JSName("removeApp")
    var removeApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    
    def replaceValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    @JSName("replaceValue")
    var replaceValue_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    
    def reset(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("reset")
    var reset_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def rotateDevice(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    @JSName("rotateDevice")
    var rotateDevice_Original: js.Function1[
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
    
    def sendKeyEvent(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
      ]
    @JSName("sendKeyEvent")
    var sendKeyEvent_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
        ]
      ]
    
    def sendSms(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
    @JSName("sendSms")
    var sendSms_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
      ]
    
    def setClipboard(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ]
      ]
    @JSName("setClipboard")
    var setClipboard_Original: js.Function1[
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
    
    def setValueImmediate(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    @JSName("setValueImmediate")
    var setValueImmediate_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    
    def shake(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("shake")
    var shake_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def startActivity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def startRecordingScreen(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
    @JSName("startRecordingScreen")
    var startRecordingScreen_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
      ]
    
    def stopRecordingScreen(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* remotePath */ js.UndefOr[String], 
            /* username */ js.UndefOr[String], 
            /* password */ js.UndefOr[String], 
            /* method */ js.UndefOr[String], 
            String
          ]
        ]
    ): js.Promise[
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
    @JSName("stopRecordingScreen")
    var stopRecordingScreen_Original: js.Function1[
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
    
    def terminateApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
    @JSName("terminateApp")
    var terminateApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    
    def toggleAirplaneMode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleAirplaneMode")
    var toggleAirplaneMode_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def toggleData(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleData")
    var toggleData_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def toggleEnrollTouchId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
    @JSName("toggleEnrollTouchId")
    var toggleEnrollTouchId_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
      ]
    
    def toggleLocationServices(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleLocationServices")
    var toggleLocationServices_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def toggleNetworkSpeed(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* netspeed */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
    @JSName("toggleNetworkSpeed")
    var toggleNetworkSpeed_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
      ]
    
    def toggleWiFi(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleWiFi")
    var toggleWiFi_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def touchId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* match */ Boolean, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
    @JSName("touchId")
    var touchId_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
        js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
      ]
    
    def touchPerform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    @JSName("touchPerform")
    var touchPerform_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    
    def unlock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("unlock")
    var unlock_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def updateSettings(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* settings */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
    @JSName("updateSettings")
    var updateSettings_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
      ]
  }
  object AppiumCommandsAsync {
    
    inline def apply(
      activateApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]],
      background: /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]],
      closeApp: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      compareImages: /* args */ Parameters[
          js.Function4[
            /* mode */ String, 
            /* firstImage */ String, 
            /* secondImage */ String, 
            /* options */ js.Object, 
            ProtocolCommandResponse
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* mode */ String, 
              /* firstImage */ String, 
              /* secondImage */ String, 
              /* options */ js.Object, 
              ProtocolCommandResponse
            ]
          ]
        ],
      driverScript: /* args */ Parameters[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* script */ String, 
              /* type */ js.UndefOr[String], 
              /* timeout */ js.UndefOr[Double], 
              ProtocolCommandResponse
            ]
          ]
        ],
      endCoverage: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]],
      fingerPrint: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]],
      getClipboard: /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]] => js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]],
      getCurrentActivity: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getCurrentPackage: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getDeviceTime: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getDisplayDensity: /* args */ Parameters[js.Function0[Any]] => js.Promise[ReturnType[js.Function0[Any]]],
      getEvents: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]],
      getPerformanceData: /* args */ Parameters[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* packageName */ String, 
              /* dataType */ String, 
              /* dataReadTimeout */ js.UndefOr[Double], 
              js.Array[String]
            ]
          ]
        ],
      getPerformanceDataTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getSettings: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Promise[ReturnType[js.Function0[SettingsReturn]]],
      getStrings: /* args */ Parameters[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* language */ js.UndefOr[String], 
              /* stringFile */ js.UndefOr[String], 
              StringsReturn
            ]
          ]
        ],
      getSystemBars: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]],
      gsmCall: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]],
      gsmSignal: /* args */ Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
          ]
        ],
      gsmVoice: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]],
      hideKeyboard: /* args */ Parameters[
          js.Function4[
            /* strategy */ js.UndefOr[String], 
            /* key */ js.UndefOr[String], 
            /* keyCode */ js.UndefOr[String], 
            /* keyName */ js.UndefOr[String], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* strategy */ js.UndefOr[String], 
              /* key */ js.UndefOr[String], 
              /* keyCode */ js.UndefOr[String], 
              /* keyName */ js.UndefOr[String], 
              Unit
            ]
          ]
        ],
      installApp: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]],
      isAppInstalled: /* args */ Parameters[js.Function1[/* appId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]],
      isKeyboardShown: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isLocked: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      launchApp: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      lock: /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]],
      logEvent: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]],
      longPressKeyCode: /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
      multiTouchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
      openNotifications: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      powerAC: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]],
      powerCapacity: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]],
      pressKeyCode: /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
      pullFile: /* args */ Parameters[js.Function1[/* path */ String, String]] => js.Promise[ReturnType[js.Function1[/* path */ String, String]]],
      pullFolder: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]],
      pushFile: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]],
      queryAppState: /* args */ Parameters[js.Function1[/* appId */ String, Double]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]],
      receiveAsyncResponse: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]],
      removeApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]],
      replaceValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]],
      reset: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      rotateDevice: /* args */ Parameters[
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
        ] => js.Promise[
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
        ],
      sendKeyEvent: /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]] => js.Promise[
          ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
        ],
      sendSms: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]],
      setClipboard: /* args */ Parameters[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* content */ String, 
              /* contentType */ js.UndefOr[String], 
              /* label */ js.UndefOr[String], 
              String
            ]
          ]
        ],
      setValueImmediate: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]],
      shake: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
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
        ] => js.Promise[
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
        ],
      startRecordingScreen: /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]],
      stopRecordingScreen: /* args */ Parameters[
          js.Function4[
            /* remotePath */ js.UndefOr[String], 
            /* username */ js.UndefOr[String], 
            /* password */ js.UndefOr[String], 
            /* method */ js.UndefOr[String], 
            String
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* remotePath */ js.UndefOr[String], 
              /* username */ js.UndefOr[String], 
              /* password */ js.UndefOr[String], 
              /* method */ js.UndefOr[String], 
              String
            ]
          ]
        ],
      terminateApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]],
      toggleAirplaneMode: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      toggleData: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      toggleEnrollTouchId: /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] => js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]],
      toggleLocationServices: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      toggleNetworkSpeed: /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]],
      toggleWiFi: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      touchId: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]],
      touchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
      unlock: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      updateSettings: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
    ): AppiumCommandsAsync = {
      val __obj = js.Dynamic.literal(activateApp = js.Any.fromFunction1(activateApp), background = js.Any.fromFunction1(background), closeApp = js.Any.fromFunction1(closeApp), compareImages = js.Any.fromFunction1(compareImages), driverScript = js.Any.fromFunction1(driverScript), endCoverage = js.Any.fromFunction1(endCoverage), fingerPrint = js.Any.fromFunction1(fingerPrint), getClipboard = js.Any.fromFunction1(getClipboard), getCurrentActivity = js.Any.fromFunction1(getCurrentActivity), getCurrentPackage = js.Any.fromFunction1(getCurrentPackage), getDeviceTime = js.Any.fromFunction1(getDeviceTime), getDisplayDensity = js.Any.fromFunction1(getDisplayDensity), getEvents = js.Any.fromFunction1(getEvents), getPerformanceData = js.Any.fromFunction1(getPerformanceData), getPerformanceDataTypes = js.Any.fromFunction1(getPerformanceDataTypes), getSettings = js.Any.fromFunction1(getSettings), getStrings = js.Any.fromFunction1(getStrings), getSystemBars = js.Any.fromFunction1(getSystemBars), gsmCall = js.Any.fromFunction1(gsmCall), gsmSignal = js.Any.fromFunction1(gsmSignal), gsmVoice = js.Any.fromFunction1(gsmVoice), hideKeyboard = js.Any.fromFunction1(hideKeyboard), installApp = js.Any.fromFunction1(installApp), isAppInstalled = js.Any.fromFunction1(isAppInstalled), isKeyboardShown = js.Any.fromFunction1(isKeyboardShown), isLocked = js.Any.fromFunction1(isLocked), launchApp = js.Any.fromFunction1(launchApp), lock = js.Any.fromFunction1(lock), logEvent = js.Any.fromFunction1(logEvent), longPressKeyCode = js.Any.fromFunction1(longPressKeyCode), multiTouchPerform = js.Any.fromFunction1(multiTouchPerform), openNotifications = js.Any.fromFunction1(openNotifications), powerAC = js.Any.fromFunction1(powerAC), powerCapacity = js.Any.fromFunction1(powerCapacity), pressKeyCode = js.Any.fromFunction1(pressKeyCode), pullFile = js.Any.fromFunction1(pullFile), pullFolder = js.Any.fromFunction1(pullFolder), pushFile = js.Any.fromFunction1(pushFile), queryAppState = js.Any.fromFunction1(queryAppState), receiveAsyncResponse = js.Any.fromFunction1(receiveAsyncResponse), removeApp = js.Any.fromFunction1(removeApp), replaceValue = js.Any.fromFunction1(replaceValue), reset = js.Any.fromFunction1(reset), rotateDevice = js.Any.fromFunction1(rotateDevice), sendKeyEvent = js.Any.fromFunction1(sendKeyEvent), sendSms = js.Any.fromFunction1(sendSms), setClipboard = js.Any.fromFunction1(setClipboard), setValueImmediate = js.Any.fromFunction1(setValueImmediate), shake = js.Any.fromFunction1(shake), startActivity = js.Any.fromFunction1(startActivity), startRecordingScreen = js.Any.fromFunction1(startRecordingScreen), stopRecordingScreen = js.Any.fromFunction1(stopRecordingScreen), terminateApp = js.Any.fromFunction1(terminateApp), toggleAirplaneMode = js.Any.fromFunction1(toggleAirplaneMode), toggleData = js.Any.fromFunction1(toggleData), toggleEnrollTouchId = js.Any.fromFunction1(toggleEnrollTouchId), toggleLocationServices = js.Any.fromFunction1(toggleLocationServices), toggleNetworkSpeed = js.Any.fromFunction1(toggleNetworkSpeed), toggleWiFi = js.Any.fromFunction1(toggleWiFi), touchId = js.Any.fromFunction1(touchId), touchPerform = js.Any.fromFunction1(touchPerform), unlock = js.Any.fromFunction1(unlock), updateSettings = js.Any.fromFunction1(updateSettings))
      __obj.asInstanceOf[AppiumCommandsAsync]
    }
    
    extension [Self <: AppiumCommandsAsync](x: Self) {
      
      inline def setActivateApp(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ): Self = StObject.set(x, "activateApp", js.Any.fromFunction1(value))
      
      inline def setBackground(
        value: /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
      ): Self = StObject.set(x, "background", js.Any.fromFunction1(value))
      
      inline def setCloseApp(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "closeApp", js.Any.fromFunction1(value))
      
      inline def setCompareImages(
        value: /* args */ Parameters[
              js.Function4[
                /* mode */ String, 
                /* firstImage */ String, 
                /* secondImage */ String, 
                /* options */ js.Object, 
                ProtocolCommandResponse
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "compareImages", js.Any.fromFunction1(value))
      
      inline def setDriverScript(
        value: /* args */ Parameters[
              js.Function3[
                /* script */ String, 
                /* type */ js.UndefOr[String], 
                /* timeout */ js.UndefOr[Double], 
                ProtocolCommandResponse
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* script */ String, 
                  /* type */ js.UndefOr[String], 
                  /* timeout */ js.UndefOr[Double], 
                  ProtocolCommandResponse
                ]
              ]
            ]
      ): Self = StObject.set(x, "driverScript", js.Any.fromFunction1(value))
      
      inline def setEndCoverage(
        value: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
      ): Self = StObject.set(x, "endCoverage", js.Any.fromFunction1(value))
      
      inline def setFingerPrint(
        value: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
      ): Self = StObject.set(x, "fingerPrint", js.Any.fromFunction1(value))
      
      inline def setGetClipboard(
        value: /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]] => js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
      ): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
      
      inline def setGetCurrentActivity(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCurrentActivity", js.Any.fromFunction1(value))
      
      inline def setGetCurrentPackage(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCurrentPackage", js.Any.fromFunction1(value))
      
      inline def setGetDeviceTime(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getDeviceTime", js.Any.fromFunction1(value))
      
      inline def setGetDisplayDensity(value: /* args */ Parameters[js.Function0[Any]] => js.Promise[ReturnType[js.Function0[Any]]]): Self = StObject.set(x, "getDisplayDensity", js.Any.fromFunction1(value))
      
      inline def setGetEvents(
        value: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getEvents", js.Any.fromFunction1(value))
      
      inline def setGetPerformanceData(
        value: /* args */ Parameters[
              js.Function3[
                /* packageName */ String, 
                /* dataType */ String, 
                /* dataReadTimeout */ js.UndefOr[Double], 
                js.Array[String]
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* packageName */ String, 
                  /* dataType */ String, 
                  /* dataReadTimeout */ js.UndefOr[Double], 
                  js.Array[String]
                ]
              ]
            ]
      ): Self = StObject.set(x, "getPerformanceData", js.Any.fromFunction1(value))
      
      inline def setGetPerformanceDataTypes(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getPerformanceDataTypes", js.Any.fromFunction1(value))
      
      inline def setGetSettings(
        value: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Promise[ReturnType[js.Function0[SettingsReturn]]]
      ): Self = StObject.set(x, "getSettings", js.Any.fromFunction1(value))
      
      inline def setGetStrings(
        value: /* args */ Parameters[
              js.Function2[
                /* language */ js.UndefOr[String], 
                /* stringFile */ js.UndefOr[String], 
                StringsReturn
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* language */ js.UndefOr[String], 
                  /* stringFile */ js.UndefOr[String], 
                  StringsReturn
                ]
              ]
            ]
      ): Self = StObject.set(x, "getStrings", js.Any.fromFunction1(value))
      
      inline def setGetSystemBars(
        value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ): Self = StObject.set(x, "getSystemBars", js.Any.fromFunction1(value))
      
      inline def setGsmCall(
        value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
      ): Self = StObject.set(x, "gsmCall", js.Any.fromFunction1(value))
      
      inline def setGsmSignal(
        value: /* args */ Parameters[
              js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
            ] => js.Promise[
              ReturnType[
                js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
              ]
            ]
      ): Self = StObject.set(x, "gsmSignal", js.Any.fromFunction1(value))
      
      inline def setGsmVoice(
        value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ): Self = StObject.set(x, "gsmVoice", js.Any.fromFunction1(value))
      
      inline def setHideKeyboard(
        value: /* args */ Parameters[
              js.Function4[
                /* strategy */ js.UndefOr[String], 
                /* key */ js.UndefOr[String], 
                /* keyCode */ js.UndefOr[String], 
                /* keyName */ js.UndefOr[String], 
                Unit
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "hideKeyboard", js.Any.fromFunction1(value))
      
      inline def setInstallApp(
        value: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
      ): Self = StObject.set(x, "installApp", js.Any.fromFunction1(value))
      
      inline def setIsAppInstalled(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
      ): Self = StObject.set(x, "isAppInstalled", js.Any.fromFunction1(value))
      
      inline def setIsKeyboardShown(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isKeyboardShown", js.Any.fromFunction1(value))
      
      inline def setIsLocked(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isLocked", js.Any.fromFunction1(value))
      
      inline def setLaunchApp(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "launchApp", js.Any.fromFunction1(value))
      
      inline def setLock(
        value: /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
      
      inline def setLogEvent(
        value: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
      ): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
      
      inline def setLongPressKeyCode(
        value: /* args */ Parameters[
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "longPressKeyCode", js.Any.fromFunction1(value))
      
      inline def setMultiTouchPerform(
        value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction1(value))
      
      inline def setOpenNotifications(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "openNotifications", js.Any.fromFunction1(value))
      
      inline def setPowerAC(
        value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ): Self = StObject.set(x, "powerAC", js.Any.fromFunction1(value))
      
      inline def setPowerCapacity(
        value: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
      ): Self = StObject.set(x, "powerCapacity", js.Any.fromFunction1(value))
      
      inline def setPressKeyCode(
        value: /* args */ Parameters[
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "pressKeyCode", js.Any.fromFunction1(value))
      
      inline def setPullFile(
        value: /* args */ Parameters[js.Function1[/* path */ String, String]] => js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
      ): Self = StObject.set(x, "pullFile", js.Any.fromFunction1(value))
      
      inline def setPullFolder(
        value: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
      ): Self = StObject.set(x, "pullFolder", js.Any.fromFunction1(value))
      
      inline def setPushFile(
        value: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
      ): Self = StObject.set(x, "pushFile", js.Any.fromFunction1(value))
      
      inline def setQueryAppState(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Double]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
      ): Self = StObject.set(x, "queryAppState", js.Any.fromFunction1(value))
      
      inline def setReceiveAsyncResponse(
        value: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
      ): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
      
      inline def setReplaceValue(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "replaceValue", js.Any.fromFunction1(value))
      
      inline def setReset(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setRotateDevice(
        value: /* args */ Parameters[
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "rotateDevice", js.Any.fromFunction1(value))
      
      inline def setSendKeyEvent(
        value: /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]] => js.Promise[
              ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
            ]
      ): Self = StObject.set(x, "sendKeyEvent", js.Any.fromFunction1(value))
      
      inline def setSendSms(
        value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
      ): Self = StObject.set(x, "sendSms", js.Any.fromFunction1(value))
      
      inline def setSetClipboard(
        value: /* args */ Parameters[
              js.Function3[
                /* content */ String, 
                /* contentType */ js.UndefOr[String], 
                /* label */ js.UndefOr[String], 
                String
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* content */ String, 
                  /* contentType */ js.UndefOr[String], 
                  /* label */ js.UndefOr[String], 
                  String
                ]
              ]
            ]
      ): Self = StObject.set(x, "setClipboard", js.Any.fromFunction1(value))
      
      inline def setSetValueImmediate(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "setValueImmediate", js.Any.fromFunction1(value))
      
      inline def setShake(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
      
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "startActivity", js.Any.fromFunction1(value))
      
      inline def setStartRecordingScreen(
        value: /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
      ): Self = StObject.set(x, "startRecordingScreen", js.Any.fromFunction1(value))
      
      inline def setStopRecordingScreen(
        value: /* args */ Parameters[
              js.Function4[
                /* remotePath */ js.UndefOr[String], 
                /* username */ js.UndefOr[String], 
                /* password */ js.UndefOr[String], 
                /* method */ js.UndefOr[String], 
                String
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "stopRecordingScreen", js.Any.fromFunction1(value))
      
      inline def setTerminateApp(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ): Self = StObject.set(x, "terminateApp", js.Any.fromFunction1(value))
      
      inline def setToggleAirplaneMode(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleAirplaneMode", js.Any.fromFunction1(value))
      
      inline def setToggleData(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleData", js.Any.fromFunction1(value))
      
      inline def setToggleEnrollTouchId(
        value: /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] => js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
      ): Self = StObject.set(x, "toggleEnrollTouchId", js.Any.fromFunction1(value))
      
      inline def setToggleLocationServices(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleLocationServices", js.Any.fromFunction1(value))
      
      inline def setToggleNetworkSpeed(
        value: /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
      ): Self = StObject.set(x, "toggleNetworkSpeed", js.Any.fromFunction1(value))
      
      inline def setToggleWiFi(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleWiFi", js.Any.fromFunction1(value))
      
      inline def setTouchId(
        value: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
      ): Self = StObject.set(x, "touchId", js.Any.fromFunction1(value))
      
      inline def setTouchPerform(
        value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1(value))
      
      inline def setUnlock(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
      
      inline def setUpdateSettings(
        value: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
      ): Self = StObject.set(x, "updateSettings", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/chromium.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/chromium.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/chromium.default[K]>>} */
  trait ChromiumCommandsAsync extends StObject {
    
    def deleteNetworkConditions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deleteNetworkConditions")
    var deleteNetworkConditions_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def elementHover(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementHover")
    var elementHover_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def file(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* file */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
    @JSName("file")
    var file_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* file */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ]
    
    def freeze(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("freeze")
    var freeze_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def getCastIssueMessage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getCastIssueMessage")
    var getCastIssueMessage_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getCastSinks(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getCastSinks")
    var getCastSinks_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getElementValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String | Null]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
    @JSName("getElementValue")
    var getElementValue_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
      ]
    
    def getLogTypes(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getLogTypes")
    var getLogTypes_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getLogs(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, js.Array[js.Object]]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
    @JSName("getLogs")
    var getLogs_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ]
    
    def getNetworkConditions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getNetworkConditions")
    var getNetworkConditions_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getNetworkConnection(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getNetworkConnection")
    var getNetworkConnection_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    def isAlertOpen(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isAlertOpen")
    var isAlertOpen_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isAutoReporting(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isAutoReporting")
    var isAutoReporting_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isLoading(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isLoading")
    var isLoading_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def launchChromeApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
    @JSName("launchChromeApp")
    var launchChromeApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ]
    
    def resume(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("resume")
    var resume_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def selectCastSink(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
    @JSName("selectCastSink")
    var selectCastSink_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    
    def sendCommand(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
    
    def sendCommandAndGetResult(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]
    ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
    @JSName("sendCommandAndGetResult")
    var sendCommandAndGetResult_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
      ]
    
    @JSName("sendCommand")
    var sendCommand_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
      ]
    
    def setAutoReporting(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]]
    ): js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
    @JSName("setAutoReporting")
    var setAutoReporting_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
      ]
    
    def setNetworkConditions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ]
      ]
    @JSName("setNetworkConditions")
    var setNetworkConditions_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
          ]
        ]
      ]
    
    def setNetworkConnection(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* parameters */ js.Object, Double]]
    ): js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
    @JSName("setNetworkConnection")
    var setNetworkConnection_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
        js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
      ]
    
    def shutdown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("shutdown")
    var shutdown_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def startCastTabMirroring(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
    @JSName("startCastTabMirroring")
    var startCastTabMirroring_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    
    def stopCasting(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
    @JSName("stopCasting")
    var stopCasting_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    
    def takeElementScreenshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
      ]
    @JSName("takeElementScreenshot")
    var takeElementScreenshot_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ]
      ]
    
    def takeHeapSnapshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("takeHeapSnapshot")
    var takeHeapSnapshot_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def touchPinch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
    ): js.Promise[
        ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
      ]
    @JSName("touchPinch")
    var touchPinch_Original: js.Function1[
        /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
        js.Promise[
          ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
        ]
      ]
  }
  object ChromiumCommandsAsync {
    
    inline def apply(
      deleteNetworkConditions: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      elementHover: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      file: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]],
      freeze: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      getCastIssueMessage: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getCastSinks: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getElementValue: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]],
      getLogTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getLogs: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]],
      getNetworkConditions: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getNetworkConnection: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      isAlertOpen: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isAutoReporting: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isLoading: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      launchChromeApp: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]],
      resume: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      selectCastSink: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]],
      sendCommand: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]],
      sendCommandAndGetResult: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]],
      setAutoReporting: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]],
      setNetworkConditions: /* args */ Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
          ]
        ],
      setNetworkConnection: /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]] => js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]],
      shutdown: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      startCastTabMirroring: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]],
      stopCasting: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]],
      takeElementScreenshot: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ],
      takeHeapSnapshot: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      touchPinch: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Promise[
          ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
        ]
    ): ChromiumCommandsAsync = {
      val __obj = js.Dynamic.literal(deleteNetworkConditions = js.Any.fromFunction1(deleteNetworkConditions), elementHover = js.Any.fromFunction1(elementHover), file = js.Any.fromFunction1(file), freeze = js.Any.fromFunction1(freeze), getCastIssueMessage = js.Any.fromFunction1(getCastIssueMessage), getCastSinks = js.Any.fromFunction1(getCastSinks), getElementValue = js.Any.fromFunction1(getElementValue), getLogTypes = js.Any.fromFunction1(getLogTypes), getLogs = js.Any.fromFunction1(getLogs), getNetworkConditions = js.Any.fromFunction1(getNetworkConditions), getNetworkConnection = js.Any.fromFunction1(getNetworkConnection), isAlertOpen = js.Any.fromFunction1(isAlertOpen), isAutoReporting = js.Any.fromFunction1(isAutoReporting), isLoading = js.Any.fromFunction1(isLoading), launchChromeApp = js.Any.fromFunction1(launchChromeApp), resume = js.Any.fromFunction1(resume), selectCastSink = js.Any.fromFunction1(selectCastSink), sendCommand = js.Any.fromFunction1(sendCommand), sendCommandAndGetResult = js.Any.fromFunction1(sendCommandAndGetResult), setAutoReporting = js.Any.fromFunction1(setAutoReporting), setNetworkConditions = js.Any.fromFunction1(setNetworkConditions), setNetworkConnection = js.Any.fromFunction1(setNetworkConnection), shutdown = js.Any.fromFunction1(shutdown), startCastTabMirroring = js.Any.fromFunction1(startCastTabMirroring), stopCasting = js.Any.fromFunction1(stopCasting), takeElementScreenshot = js.Any.fromFunction1(takeElementScreenshot), takeHeapSnapshot = js.Any.fromFunction1(takeHeapSnapshot), touchPinch = js.Any.fromFunction1(touchPinch))
      __obj.asInstanceOf[ChromiumCommandsAsync]
    }
    
    extension [Self <: ChromiumCommandsAsync](x: Self) {
      
      inline def setDeleteNetworkConditions(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteNetworkConditions", js.Any.fromFunction1(value))
      
      inline def setElementHover(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementHover", js.Any.fromFunction1(value))
      
      inline def setFile(
        value: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
      
      inline def setFreeze(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "freeze", js.Any.fromFunction1(value))
      
      inline def setGetCastIssueMessage(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCastIssueMessage", js.Any.fromFunction1(value))
      
      inline def setGetCastSinks(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getCastSinks", js.Any.fromFunction1(value))
      
      inline def setGetElementValue(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
      ): Self = StObject.set(x, "getElementValue", js.Any.fromFunction1(value))
      
      inline def setGetLogTypes(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getLogTypes", js.Any.fromFunction1(value))
      
      inline def setGetLogs(
        value: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ): Self = StObject.set(x, "getLogs", js.Any.fromFunction1(value))
      
      inline def setGetNetworkConditions(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getNetworkConditions", js.Any.fromFunction1(value))
      
      inline def setGetNetworkConnection(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getNetworkConnection", js.Any.fromFunction1(value))
      
      inline def setIsAlertOpen(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isAlertOpen", js.Any.fromFunction1(value))
      
      inline def setIsAutoReporting(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isAutoReporting", js.Any.fromFunction1(value))
      
      inline def setIsLoading(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
      
      inline def setLaunchChromeApp(
        value: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ): Self = StObject.set(x, "launchChromeApp", js.Any.fromFunction1(value))
      
      inline def setResume(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
      
      inline def setSelectCastSink(
        value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ): Self = StObject.set(x, "selectCastSink", js.Any.fromFunction1(value))
      
      inline def setSendCommand(
        value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
      ): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
      
      inline def setSendCommandAndGetResult(
        value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
      ): Self = StObject.set(x, "sendCommandAndGetResult", js.Any.fromFunction1(value))
      
      inline def setSetAutoReporting(
        value: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
      ): Self = StObject.set(x, "setAutoReporting", js.Any.fromFunction1(value))
      
      inline def setSetNetworkConditions(
        value: /* args */ Parameters[
              js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
            ] => js.Promise[
              ReturnType[
                js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
              ]
            ]
      ): Self = StObject.set(x, "setNetworkConditions", js.Any.fromFunction1(value))
      
      inline def setSetNetworkConnection(
        value: /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]] => js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
      ): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1(value))
      
      inline def setShutdown(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
      
      inline def setStartCastTabMirroring(
        value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ): Self = StObject.set(x, "startCastTabMirroring", js.Any.fromFunction1(value))
      
      inline def setStopCasting(
        value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ): Self = StObject.set(x, "stopCasting", js.Any.fromFunction1(value))
      
      inline def setTakeElementScreenshot(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
            ]
      ): Self = StObject.set(x, "takeElementScreenshot", js.Any.fromFunction1(value))
      
      inline def setTakeHeapSnapshot(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "takeHeapSnapshot", js.Any.fromFunction1(value))
      
      inline def setTouchPinch(
        value: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Promise[
              ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
            ]
      ): Self = StObject.set(x, "touchPinch", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/gecko.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/gecko.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/gecko.default[K]>>} */
  trait GeckoCommandsAsync extends StObject {
    
    def fullPageScreenshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeckoCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("fullPageScreenshot")
    var fullPageScreenshot_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getMozContext(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeckoCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getMozContext")
    var getMozContext_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def installAddOn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeckoCommands[K]> is not an array type */ args: Parameters[js.Function2[/* addon */ String, /* temporary */ Boolean, String]]
    ): js.Promise[ReturnType[js.Function2[/* addon */ String, /* temporary */ Boolean, String]]]
    @JSName("installAddOn")
    var installAddOn_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* addon */ String, /* temporary */ Boolean, String]], 
        js.Promise[ReturnType[js.Function2[/* addon */ String, /* temporary */ Boolean, String]]]
      ]
    
    def setMozContext(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeckoCommands[K]> is not an array type */ args: Parameters[js.Function1[/* context */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* context */ String, Unit]]]
    @JSName("setMozContext")
    var setMozContext_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* context */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* context */ String, Unit]]]
      ]
    
    def uninstallAddOn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<GeckoCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
    @JSName("uninstallAddOn")
    var uninstallAddOn_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ]
  }
  object GeckoCommandsAsync {
    
    inline def apply(
      fullPageScreenshot: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getMozContext: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      installAddOn: /* args */ Parameters[js.Function2[/* addon */ String, /* temporary */ Boolean, String]] => js.Promise[ReturnType[js.Function2[/* addon */ String, /* temporary */ Boolean, String]]],
      setMozContext: /* args */ Parameters[js.Function1[/* context */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* context */ String, Unit]]],
      uninstallAddOn: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
    ): GeckoCommandsAsync = {
      val __obj = js.Dynamic.literal(fullPageScreenshot = js.Any.fromFunction1(fullPageScreenshot), getMozContext = js.Any.fromFunction1(getMozContext), installAddOn = js.Any.fromFunction1(installAddOn), setMozContext = js.Any.fromFunction1(setMozContext), uninstallAddOn = js.Any.fromFunction1(uninstallAddOn))
      __obj.asInstanceOf[GeckoCommandsAsync]
    }
    
    extension [Self <: GeckoCommandsAsync](x: Self) {
      
      inline def setFullPageScreenshot(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "fullPageScreenshot", js.Any.fromFunction1(value))
      
      inline def setGetMozContext(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getMozContext", js.Any.fromFunction1(value))
      
      inline def setInstallAddOn(
        value: /* args */ Parameters[js.Function2[/* addon */ String, /* temporary */ Boolean, String]] => js.Promise[ReturnType[js.Function2[/* addon */ String, /* temporary */ Boolean, String]]]
      ): Self = StObject.set(x, "installAddOn", js.Any.fromFunction1(value))
      
      inline def setSetMozContext(
        value: /* args */ Parameters[js.Function1[/* context */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* context */ String, Unit]]]
      ): Self = StObject.set(x, "setMozContext", js.Any.fromFunction1(value))
      
      inline def setUninstallAddOn(
        value: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ): Self = StObject.set(x, "uninstallAddOn", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/jsonwp.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/jsonwp.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/jsonwp.default[K]>>} */
  trait JSONWPCommandsAsync extends StObject {
    
    def _getWindowSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("_getWindowSize")
    var _getWindowSize_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def _setWindowSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
    @JSName("_setWindowSize")
    var _setWindowSize_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
      ]
    
    def acceptAlert(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("acceptAlert")
    var acceptAlert_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def activateIME(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* engine */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
    @JSName("activateIME")
    var activateIME_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
      ]
    
    def addCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* cookie */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
    @JSName("addCookie")
    var addCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
      ]
    
    def back(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("back")
    var back_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def buttonDown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    @JSName("buttonDown")
    var buttonDown_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    
    def buttonUp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    @JSName("buttonUp")
    var buttonUp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    
    def clearLocalStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("clearLocalStorage")
    var clearLocalStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def clearSessionStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("clearSessionStorage")
    var clearSessionStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def closeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("closeWindow")
    var closeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def deactivateIME(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deactivateIME")
    var deactivateIME_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def deleteAllCookies(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deleteAllCookies")
    var deleteAllCookies_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def deleteCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    @JSName("deleteCookie")
    var deleteCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    
    def deleteLocalStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
    @JSName("deleteLocalStorageItem")
    var deleteLocalStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    
    def deleteSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    
    def deleteSessionStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
    @JSName("deleteSessionStorageItem")
    var deleteSessionStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    
    @JSName("deleteSession")
    var deleteSession_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def dismissAlert(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("dismissAlert")
    var dismissAlert_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def elementClear(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementClear")
    var elementClear_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def elementClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementClick")
    var elementClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def elementEquals(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
      ]
    @JSName("elementEquals")
    var elementEquals_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
        ]
      ]
    
    def elementSendKeys(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]]
      ]
    @JSName("elementSendKeys")
    var elementSendKeys_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]]
        ]
      ]
    
    def elementSubmit(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementSubmit")
    var elementSubmit_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def executeAsyncScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
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
    
    def executeScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
            Any
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
            Any
          ]
        ]
      ]
    @JSName("executeScript")
    var executeScript_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
            Any
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
              Any
            ]
          ]
        ]
      ]
    
    def findElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]]
    ): js.Promise[
        ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
      ]
    
    def findElementFromElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
      ]
    @JSName("findElementFromElement")
    var findElementFromElement_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
          ]
        ]
      ]
    
    @JSName("findElement")
    var findElement_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ]
      ]
    
    def findElements(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
    ): js.Promise[
        ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
      ]
    
    def findElementsFromElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
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
    
    @JSName("findElements")
    var findElements_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ]
      ]
    
    def forward(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("forward")
    var forward_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def getActiveElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getActiveElement")
    var getActiveElement_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getActiveEngine(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getActiveEngine")
    var getActiveEngine_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getAlertText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getAlertText")
    var getAlertText_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getAllCookies(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[Cookie]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
    @JSName("getAllCookies")
    var getAllCookies_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ]
    
    def getApplicationCacheStatus(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getApplicationCacheStatus")
    var getApplicationCacheStatus_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    def getAvailableEngines(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getAvailableEngines")
    var getAvailableEngines_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getElementAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String | Null]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* name */ String, String | Null]]
      ]
    @JSName("getElementAttribute")
    var getElementAttribute_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String | Null]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* name */ String, String | Null]]
        ]
      ]
    
    def getElementCSSValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
      ]
    @JSName("getElementCSSValue")
    var getElementCSSValue_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ]
      ]
    
    def getElementLocation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    
    def getElementLocationInView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    @JSName("getElementLocationInView")
    var getElementLocationInView_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    
    @JSName("getElementLocation")
    var getElementLocation_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    
    def getElementSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    @JSName("getElementSize")
    var getElementSize_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    
    def getElementTagName(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementTagName")
    var getElementTagName_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementText")
    var getElementText_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getGeoLocation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getGeoLocation")
    var getGeoLocation_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getLocalStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    
    def getLocalStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
    @JSName("getLocalStorageItem")
    var getLocalStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    
    def getLocalStorageSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getLocalStorageSize")
    var getLocalStorageSize_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    @JSName("getLocalStorage")
    var getLocalStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getLogTypes(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getLogTypes")
    var getLogTypes_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getLogs(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, js.Array[js.Object]]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
    @JSName("getLogs")
    var getLogs_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ]
    
    def getOrientation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getOrientation")
    var getOrientation_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getPageSource(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getPageSource")
    var getPageSource_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    
    def getSessionStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    
    def getSessionStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
    @JSName("getSessionStorageItem")
    var getSessionStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    
    def getSessionStorageSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getSessionStorageSize")
    var getSessionStorageSize_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    @JSName("getSessionStorage")
    var getSessionStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    @JSName("getSession")
    var getSession_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getSessions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
    @JSName("getSessions")
    var getSessions_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    
    def getTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getTitle")
    var getTitle_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getUrl(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getUrl")
    var getUrl_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getWindowHandle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getWindowHandle")
    var getWindowHandle_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getWindowHandles(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getWindowHandles")
    var getWindowHandles_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getWindowPosition(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getWindowPosition")
    var getWindowPosition_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def isElementDisplayed(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementDisplayed")
    var isElementDisplayed_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isElementEnabled(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementEnabled")
    var isElementEnabled_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isElementSelected(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementSelected")
    var isElementSelected_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isIMEActivated(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isIMEActivated")
    var isIMEActivated_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def maximizeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("maximizeWindow")
    var maximizeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def moveToElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("moveToElement")
    var moveToElement_Original: js.Function1[
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
    
    def navigateTo(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* url */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* url */ String, Unit]]]
    @JSName("navigateTo")
    var navigateTo_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* url */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* url */ String, Unit]]]
      ]
    
    def newSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* desiredCapabilities */ js.Object, 
            /* requiredCapabilities */ js.Object, 
            SessionReturn
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* desiredCapabilities */ js.Object, 
            /* requiredCapabilities */ js.Object, 
            SessionReturn
          ]
        ]
      ]
    @JSName("newSession")
    var newSession_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[
            /* desiredCapabilities */ js.Object, 
            /* requiredCapabilities */ js.Object, 
            SessionReturn
          ]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[
              /* desiredCapabilities */ js.Object, 
              /* requiredCapabilities */ js.Object, 
              SessionReturn
            ]
          ]
        ]
      ]
    
    def positionClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    @JSName("positionClick")
    var positionClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    
    def positionDoubleClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("positionDoubleClick")
    var positionDoubleClick_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def refresh(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("refresh")
    var refresh_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def sendAlertText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* text */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
    @JSName("sendAlertText")
    var sendAlertText_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ]
    
    def sendKeys(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* value */ js.Array[String], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
    @JSName("sendKeys")
    var sendKeys_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
        js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
      ]
    
    def setAsyncTimeout(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
    @JSName("setAsyncTimeout")
    var setAsyncTimeout_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    
    def setGeoLocation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* location */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
    @JSName("setGeoLocation")
    var setGeoLocation_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
      ]
    
    def setImplicitTimeout(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
    @JSName("setImplicitTimeout")
    var setImplicitTimeout_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    
    def setLocalStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
    @JSName("setLocalStorage")
    var setLocalStorage_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    
    def setOrientation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* orientation */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
    @JSName("setOrientation")
    var setOrientation_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
      ]
    
    def setSessionStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
    @JSName("setSessionStorage")
    var setSessionStorage_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    
    def setTimeouts(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* type */ String, /* ms */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* type */ String, /* ms */ Double, Unit]]]
    @JSName("setTimeouts")
    var setTimeouts_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* type */ String, /* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* type */ String, /* ms */ Double, Unit]]]
      ]
    
    def setWindowPosition(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
    ): js.Promise[
        ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
      ]
    @JSName("setWindowPosition")
    var setWindowPosition_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
        js.Promise[
          ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
        ]
      ]
    
    def status(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[StatusReturn]]
    ): js.Promise[ReturnType[js.Function0[StatusReturn]]]
    @JSName("status")
    var status_Original: js.Function1[
        /* args */ Parameters[js.Function0[StatusReturn]], 
        js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ]
    
    def switchToFrame(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String | Double | js.Object | Null, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* id */ String | Double | js.Object | Null, Unit]]]
    @JSName("switchToFrame")
    var switchToFrame_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String | Double | js.Object | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ String | Double | js.Object | Null, Unit]]]
      ]
    
    def switchToParentFrame(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("switchToParentFrame")
    var switchToParentFrame_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def switchToWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    @JSName("switchToWindow")
    var switchToWindow_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    
    def takeScreenshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("takeScreenshot")
    var takeScreenshot_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def touchClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    @JSName("touchClick")
    var touchClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    
    def touchDoubleClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    @JSName("touchDoubleClick")
    var touchDoubleClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    
    def touchDown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    @JSName("touchDown")
    var touchDown_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    
    def touchFlick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def touchLongClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    @JSName("touchLongClick")
    var touchLongClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    
    def touchMove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    @JSName("touchMove")
    var touchMove_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    
    def touchScroll(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ]
      ]
    @JSName("touchScroll")
    var touchScroll_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
          ]
        ]
      ]
    
    def touchUp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    @JSName("touchUp")
    var touchUp_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
  }
  object JSONWPCommandsAsync {
    
    inline def apply(
      _getWindowSize: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      _setWindowSize: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]],
      acceptAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      activateIME: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]],
      addCookie: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]],
      back: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      buttonDown: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
      buttonUp: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
      clearLocalStorage: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      clearSessionStorage: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      closeWindow: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deactivateIME: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteAllCookies: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteCookie: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
      deleteLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]],
      deleteSession: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]],
      dismissAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      elementClear: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      elementClick: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      elementEquals: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
        ],
      elementSendKeys: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]]
        ],
      elementSubmit: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      executeAsyncScript: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
            ]
          ]
        ],
      executeScript: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
            Any
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
              Any
            ]
          ]
        ],
      findElement: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ],
      findElementFromElement: /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
          ]
        ],
      findElements: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ],
      findElementsFromElement: /* args */ Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* elementId */ String, 
              /* using */ String, 
              /* value */ String, 
              js.Array[ElementReference]
            ]
          ]
        ],
      forward: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      getActiveElement: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getActiveEngine: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getAlertText: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getAllCookies: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]],
      getApplicationCacheStatus: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getAvailableEngines: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getElementAttribute: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String | Null]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* name */ String, String | Null]]
        ],
      getElementCSSValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ],
      getElementLocation: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
      getElementLocationInView: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
      getElementSize: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
      getElementTagName: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementText: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getGeoLocation: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getLocalStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]],
      getLocalStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getLogTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getLogs: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]],
      getOrientation: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getPageSource: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getSession: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getSessionStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]],
      getSessionStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getSessions: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]],
      getTitle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getUrl: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getWindowHandle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getWindowHandles: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getWindowPosition: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      isElementDisplayed: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isElementEnabled: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isElementSelected: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isIMEActivated: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      maximizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      moveToElement: /* args */ Parameters[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* element */ js.UndefOr[String | Null], 
              /* xoffset */ js.UndefOr[Double], 
              /* yoffset */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
      navigateTo: /* args */ Parameters[js.Function1[/* url */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* url */ String, Unit]]],
      newSession: /* args */ Parameters[
          js.Function2[
            /* desiredCapabilities */ js.Object, 
            /* requiredCapabilities */ js.Object, 
            SessionReturn
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* desiredCapabilities */ js.Object, 
              /* requiredCapabilities */ js.Object, 
              SessionReturn
            ]
          ]
        ],
      positionClick: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
      positionDoubleClick: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      refresh: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      sendAlertText: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]],
      sendKeys: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]],
      setAsyncTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]],
      setGeoLocation: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]],
      setImplicitTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]],
      setLocalStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]],
      setOrientation: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]],
      setSessionStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]],
      setTimeouts: /* args */ Parameters[js.Function2[/* type */ String, /* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* type */ String, /* ms */ Double, Unit]]],
      setWindowPosition: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Promise[
          ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
        ],
      status: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]],
      switchToFrame: /* args */ Parameters[js.Function1[/* id */ String | Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String | Double | js.Object | Null, Unit]]],
      switchToParentFrame: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      switchToWindow: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
      takeScreenshot: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      touchClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
      touchDoubleClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
      touchDown: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
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
        ] => js.Promise[
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
        ],
      touchLongClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
      touchMove: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
      touchScroll: /* args */ Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
          ]
        ],
      touchUp: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    ): JSONWPCommandsAsync = {
      val __obj = js.Dynamic.literal(_getWindowSize = js.Any.fromFunction1(_getWindowSize), _setWindowSize = js.Any.fromFunction1(_setWindowSize), acceptAlert = js.Any.fromFunction1(acceptAlert), activateIME = js.Any.fromFunction1(activateIME), addCookie = js.Any.fromFunction1(addCookie), back = js.Any.fromFunction1(back), buttonDown = js.Any.fromFunction1(buttonDown), buttonUp = js.Any.fromFunction1(buttonUp), clearLocalStorage = js.Any.fromFunction1(clearLocalStorage), clearSessionStorage = js.Any.fromFunction1(clearSessionStorage), closeWindow = js.Any.fromFunction1(closeWindow), deactivateIME = js.Any.fromFunction1(deactivateIME), deleteAllCookies = js.Any.fromFunction1(deleteAllCookies), deleteCookie = js.Any.fromFunction1(deleteCookie), deleteLocalStorageItem = js.Any.fromFunction1(deleteLocalStorageItem), deleteSession = js.Any.fromFunction1(deleteSession), deleteSessionStorageItem = js.Any.fromFunction1(deleteSessionStorageItem), dismissAlert = js.Any.fromFunction1(dismissAlert), elementClear = js.Any.fromFunction1(elementClear), elementClick = js.Any.fromFunction1(elementClick), elementEquals = js.Any.fromFunction1(elementEquals), elementSendKeys = js.Any.fromFunction1(elementSendKeys), elementSubmit = js.Any.fromFunction1(elementSubmit), executeAsyncScript = js.Any.fromFunction1(executeAsyncScript), executeScript = js.Any.fromFunction1(executeScript), findElement = js.Any.fromFunction1(findElement), findElementFromElement = js.Any.fromFunction1(findElementFromElement), findElements = js.Any.fromFunction1(findElements), findElementsFromElement = js.Any.fromFunction1(findElementsFromElement), forward = js.Any.fromFunction1(forward), getActiveElement = js.Any.fromFunction1(getActiveElement), getActiveEngine = js.Any.fromFunction1(getActiveEngine), getAlertText = js.Any.fromFunction1(getAlertText), getAllCookies = js.Any.fromFunction1(getAllCookies), getApplicationCacheStatus = js.Any.fromFunction1(getApplicationCacheStatus), getAvailableEngines = js.Any.fromFunction1(getAvailableEngines), getElementAttribute = js.Any.fromFunction1(getElementAttribute), getElementCSSValue = js.Any.fromFunction1(getElementCSSValue), getElementLocation = js.Any.fromFunction1(getElementLocation), getElementLocationInView = js.Any.fromFunction1(getElementLocationInView), getElementSize = js.Any.fromFunction1(getElementSize), getElementTagName = js.Any.fromFunction1(getElementTagName), getElementText = js.Any.fromFunction1(getElementText), getGeoLocation = js.Any.fromFunction1(getGeoLocation), getLocalStorage = js.Any.fromFunction1(getLocalStorage), getLocalStorageItem = js.Any.fromFunction1(getLocalStorageItem), getLocalStorageSize = js.Any.fromFunction1(getLocalStorageSize), getLogTypes = js.Any.fromFunction1(getLogTypes), getLogs = js.Any.fromFunction1(getLogs), getOrientation = js.Any.fromFunction1(getOrientation), getPageSource = js.Any.fromFunction1(getPageSource), getSession = js.Any.fromFunction1(getSession), getSessionStorage = js.Any.fromFunction1(getSessionStorage), getSessionStorageItem = js.Any.fromFunction1(getSessionStorageItem), getSessionStorageSize = js.Any.fromFunction1(getSessionStorageSize), getSessions = js.Any.fromFunction1(getSessions), getTitle = js.Any.fromFunction1(getTitle), getUrl = js.Any.fromFunction1(getUrl), getWindowHandle = js.Any.fromFunction1(getWindowHandle), getWindowHandles = js.Any.fromFunction1(getWindowHandles), getWindowPosition = js.Any.fromFunction1(getWindowPosition), isElementDisplayed = js.Any.fromFunction1(isElementDisplayed), isElementEnabled = js.Any.fromFunction1(isElementEnabled), isElementSelected = js.Any.fromFunction1(isElementSelected), isIMEActivated = js.Any.fromFunction1(isIMEActivated), maximizeWindow = js.Any.fromFunction1(maximizeWindow), moveToElement = js.Any.fromFunction1(moveToElement), navigateTo = js.Any.fromFunction1(navigateTo), newSession = js.Any.fromFunction1(newSession), positionClick = js.Any.fromFunction1(positionClick), positionDoubleClick = js.Any.fromFunction1(positionDoubleClick), refresh = js.Any.fromFunction1(refresh), sendAlertText = js.Any.fromFunction1(sendAlertText), sendKeys = js.Any.fromFunction1(sendKeys), setAsyncTimeout = js.Any.fromFunction1(setAsyncTimeout), setGeoLocation = js.Any.fromFunction1(setGeoLocation), setImplicitTimeout = js.Any.fromFunction1(setImplicitTimeout), setLocalStorage = js.Any.fromFunction1(setLocalStorage), setOrientation = js.Any.fromFunction1(setOrientation), setSessionStorage = js.Any.fromFunction1(setSessionStorage), setTimeouts = js.Any.fromFunction1(setTimeouts), setWindowPosition = js.Any.fromFunction1(setWindowPosition), status = js.Any.fromFunction1(status), switchToFrame = js.Any.fromFunction1(switchToFrame), switchToParentFrame = js.Any.fromFunction1(switchToParentFrame), switchToWindow = js.Any.fromFunction1(switchToWindow), takeScreenshot = js.Any.fromFunction1(takeScreenshot), touchClick = js.Any.fromFunction1(touchClick), touchDoubleClick = js.Any.fromFunction1(touchDoubleClick), touchDown = js.Any.fromFunction1(touchDown), touchFlick = js.Any.fromFunction1(touchFlick), touchLongClick = js.Any.fromFunction1(touchLongClick), touchMove = js.Any.fromFunction1(touchMove), touchScroll = js.Any.fromFunction1(touchScroll), touchUp = js.Any.fromFunction1(touchUp))
      __obj.asInstanceOf[JSONWPCommandsAsync]
    }
    
    extension [Self <: JSONWPCommandsAsync](x: Self) {
      
      inline def setAcceptAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "acceptAlert", js.Any.fromFunction1(value))
      
      inline def setActivateIME(
        value: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
      ): Self = StObject.set(x, "activateIME", js.Any.fromFunction1(value))
      
      inline def setAddCookie(
        value: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
      ): Self = StObject.set(x, "addCookie", js.Any.fromFunction1(value))
      
      inline def setBack(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
      
      inline def setButtonDown(
        value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "buttonDown", js.Any.fromFunction1(value))
      
      inline def setButtonUp(
        value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "buttonUp", js.Any.fromFunction1(value))
      
      inline def setClearLocalStorage(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "clearLocalStorage", js.Any.fromFunction1(value))
      
      inline def setClearSessionStorage(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "clearSessionStorage", js.Any.fromFunction1(value))
      
      inline def setCloseWindow(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "closeWindow", js.Any.fromFunction1(value))
      
      inline def setDeactivateIME(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deactivateIME", js.Any.fromFunction1(value))
      
      inline def setDeleteAllCookies(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteAllCookies", js.Any.fromFunction1(value))
      
      inline def setDeleteCookie(
        value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ): Self = StObject.set(x, "deleteCookie", js.Any.fromFunction1(value))
      
      inline def setDeleteLocalStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ): Self = StObject.set(x, "deleteLocalStorageItem", js.Any.fromFunction1(value))
      
      inline def setDeleteSession(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
      
      inline def setDeleteSessionStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ): Self = StObject.set(x, "deleteSessionStorageItem", js.Any.fromFunction1(value))
      
      inline def setDismissAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "dismissAlert", js.Any.fromFunction1(value))
      
      inline def setElementClear(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementClear", js.Any.fromFunction1(value))
      
      inline def setElementClick(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementClick", js.Any.fromFunction1(value))
      
      inline def setElementEquals(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
            ]
      ): Self = StObject.set(x, "elementEquals", js.Any.fromFunction1(value))
      
      inline def setElementSendKeys(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* value */ js.Array[String], Unit]]
            ]
      ): Self = StObject.set(x, "elementSendKeys", js.Any.fromFunction1(value))
      
      inline def setElementSubmit(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementSubmit", js.Any.fromFunction1(value))
      
      inline def setExecuteAsyncScript(
        value: /* args */ Parameters[
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
                ]
              ]
            ]
      ): Self = StObject.set(x, "executeAsyncScript", js.Any.fromFunction1(value))
      
      inline def setExecuteScript(
        value: /* args */ Parameters[
              js.Function2[
                /* script */ String, 
                /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
                Any
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
                  Any
                ]
              ]
            ]
      ): Self = StObject.set(x, "executeScript", js.Any.fromFunction1(value))
      
      inline def setFindElement(
        value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
            ]
      ): Self = StObject.set(x, "findElement", js.Any.fromFunction1(value))
      
      inline def setFindElementFromElement(
        value: /* args */ Parameters[
              js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
              ]
            ]
      ): Self = StObject.set(x, "findElementFromElement", js.Any.fromFunction1(value))
      
      inline def setFindElements(
        value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
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
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* elementId */ String, 
                  /* using */ String, 
                  /* value */ String, 
                  js.Array[ElementReference]
                ]
              ]
            ]
      ): Self = StObject.set(x, "findElementsFromElement", js.Any.fromFunction1(value))
      
      inline def setForward(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
      
      inline def setGetActiveElement(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
      
      inline def setGetActiveEngine(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getActiveEngine", js.Any.fromFunction1(value))
      
      inline def setGetAlertText(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getAlertText", js.Any.fromFunction1(value))
      
      inline def setGetAllCookies(
        value: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ): Self = StObject.set(x, "getAllCookies", js.Any.fromFunction1(value))
      
      inline def setGetApplicationCacheStatus(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getApplicationCacheStatus", js.Any.fromFunction1(value))
      
      inline def setGetAvailableEngines(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getAvailableEngines", js.Any.fromFunction1(value))
      
      inline def setGetElementAttribute(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String | Null]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* name */ String, String | Null]]
            ]
      ): Self = StObject.set(x, "getElementAttribute", js.Any.fromFunction1(value))
      
      inline def setGetElementCSSValue(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
            ]
      ): Self = StObject.set(x, "getElementCSSValue", js.Any.fromFunction1(value))
      
      inline def setGetElementLocation(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getElementLocation", js.Any.fromFunction1(value))
      
      inline def setGetElementLocationInView(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getElementLocationInView", js.Any.fromFunction1(value))
      
      inline def setGetElementSize(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
      
      inline def setGetElementTagName(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementTagName", js.Any.fromFunction1(value))
      
      inline def setGetElementText(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementText", js.Any.fromFunction1(value))
      
      inline def setGetGeoLocation(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getGeoLocation", js.Any.fromFunction1(value))
      
      inline def setGetLocalStorage(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getLocalStorage", js.Any.fromFunction1(value))
      
      inline def setGetLocalStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ): Self = StObject.set(x, "getLocalStorageItem", js.Any.fromFunction1(value))
      
      inline def setGetLocalStorageSize(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getLocalStorageSize", js.Any.fromFunction1(value))
      
      inline def setGetLogTypes(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getLogTypes", js.Any.fromFunction1(value))
      
      inline def setGetLogs(
        value: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ): Self = StObject.set(x, "getLogs", js.Any.fromFunction1(value))
      
      inline def setGetOrientation(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getOrientation", js.Any.fromFunction1(value))
      
      inline def setGetPageSource(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getPageSource", js.Any.fromFunction1(value))
      
      inline def setGetSession(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
      
      inline def setGetSessionStorage(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getSessionStorage", js.Any.fromFunction1(value))
      
      inline def setGetSessionStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ): Self = StObject.set(x, "getSessionStorageItem", js.Any.fromFunction1(value))
      
      inline def setGetSessionStorageSize(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getSessionStorageSize", js.Any.fromFunction1(value))
      
      inline def setGetSessions(
        value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ): Self = StObject.set(x, "getSessions", js.Any.fromFunction1(value))
      
      inline def setGetTitle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
      
      inline def setGetUrl(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
      
      inline def setGetWindowHandle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction1(value))
      
      inline def setGetWindowHandles(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getWindowHandles", js.Any.fromFunction1(value))
      
      inline def setGetWindowPosition(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getWindowPosition", js.Any.fromFunction1(value))
      
      inline def setIsElementDisplayed(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementDisplayed", js.Any.fromFunction1(value))
      
      inline def setIsElementEnabled(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementEnabled", js.Any.fromFunction1(value))
      
      inline def setIsElementSelected(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementSelected", js.Any.fromFunction1(value))
      
      inline def setIsIMEActivated(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isIMEActivated", js.Any.fromFunction1(value))
      
      inline def setMaximizeWindow(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "maximizeWindow", js.Any.fromFunction1(value))
      
      inline def setMoveToElement(
        value: /* args */ Parameters[
              js.Function3[
                /* element */ js.UndefOr[String | Null], 
                /* xoffset */ js.UndefOr[Double], 
                /* yoffset */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* element */ js.UndefOr[String | Null], 
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "moveToElement", js.Any.fromFunction1(value))
      
      inline def setNavigateTo(
        value: /* args */ Parameters[js.Function1[/* url */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* url */ String, Unit]]]
      ): Self = StObject.set(x, "navigateTo", js.Any.fromFunction1(value))
      
      inline def setNewSession(
        value: /* args */ Parameters[
              js.Function2[
                /* desiredCapabilities */ js.Object, 
                /* requiredCapabilities */ js.Object, 
                SessionReturn
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* desiredCapabilities */ js.Object, 
                  /* requiredCapabilities */ js.Object, 
                  SessionReturn
                ]
              ]
            ]
      ): Self = StObject.set(x, "newSession", js.Any.fromFunction1(value))
      
      inline def setPositionClick(
        value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "positionClick", js.Any.fromFunction1(value))
      
      inline def setPositionDoubleClick(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "positionDoubleClick", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
      
      inline def setSendAlertText(
        value: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ): Self = StObject.set(x, "sendAlertText", js.Any.fromFunction1(value))
      
      inline def setSendKeys(
        value: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
      ): Self = StObject.set(x, "sendKeys", js.Any.fromFunction1(value))
      
      inline def setSetAsyncTimeout(
        value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ): Self = StObject.set(x, "setAsyncTimeout", js.Any.fromFunction1(value))
      
      inline def setSetGeoLocation(
        value: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
      ): Self = StObject.set(x, "setGeoLocation", js.Any.fromFunction1(value))
      
      inline def setSetImplicitTimeout(
        value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ): Self = StObject.set(x, "setImplicitTimeout", js.Any.fromFunction1(value))
      
      inline def setSetLocalStorage(
        value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "setLocalStorage", js.Any.fromFunction1(value))
      
      inline def setSetOrientation(
        value: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
      ): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
      
      inline def setSetSessionStorage(
        value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "setSessionStorage", js.Any.fromFunction1(value))
      
      inline def setSetTimeouts(
        value: /* args */ Parameters[js.Function2[/* type */ String, /* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* type */ String, /* ms */ Double, Unit]]]
      ): Self = StObject.set(x, "setTimeouts", js.Any.fromFunction1(value))
      
      inline def setSetWindowPosition(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Promise[
              ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
            ]
      ): Self = StObject.set(x, "setWindowPosition", js.Any.fromFunction1(value))
      
      inline def setStatus(
        value: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
      
      inline def setSwitchToFrame(
        value: /* args */ Parameters[js.Function1[/* id */ String | Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String | Double | js.Object | Null, Unit]]]
      ): Self = StObject.set(x, "switchToFrame", js.Any.fromFunction1(value))
      
      inline def setSwitchToParentFrame(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "switchToParentFrame", js.Any.fromFunction1(value))
      
      inline def setSwitchToWindow(
        value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ): Self = StObject.set(x, "switchToWindow", js.Any.fromFunction1(value))
      
      inline def setTakeScreenshot(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "takeScreenshot", js.Any.fromFunction1(value))
      
      inline def setTouchClick(
        value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ): Self = StObject.set(x, "touchClick", js.Any.fromFunction1(value))
      
      inline def setTouchDoubleClick(
        value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ): Self = StObject.set(x, "touchDoubleClick", js.Any.fromFunction1(value))
      
      inline def setTouchDown(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "touchFlick", js.Any.fromFunction1(value))
      
      inline def setTouchLongClick(
        value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ): Self = StObject.set(x, "touchLongClick", js.Any.fromFunction1(value))
      
      inline def setTouchMove(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction1(value))
      
      inline def setTouchScroll(
        value: /* args */ Parameters[
              js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
              ]
            ]
      ): Self = StObject.set(x, "touchScroll", js.Any.fromFunction1(value))
      
      inline def setTouchUp(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ): Self = StObject.set(x, "touchUp", js.Any.fromFunction1(value))
      
      inline def set_getWindowSize(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "_getWindowSize", js.Any.fromFunction1(value))
      
      inline def set_setWindowSize(
        value: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
      ): Self = StObject.set(x, "_setWindowSize", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/mjsonwp.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/mjsonwp.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/mjsonwp.default[K]>>} */
  trait MJSONWPCommandsAsync extends StObject {
    
    def getContext(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Context]]
    ): js.Promise[ReturnType[js.Function0[Context]]]
    @JSName("getContext")
    var getContext_Original: js.Function1[
        /* args */ Parameters[js.Function0[Context]], 
        js.Promise[ReturnType[js.Function0[Context]]]
      ]
    
    def getContexts(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[Context]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
    @JSName("getContexts")
    var getContexts_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Context]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
      ]
    
    def getNetworkConnection(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getNetworkConnection")
    var getNetworkConnection_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    def getPageIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getPageIndex")
    var getPageIndex_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def multiTouchPerform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
        ]
      ]
    @JSName("multiTouchPerform")
    var multiTouchPerform_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
          ]
        ]
      ]
    
    def receiveAsyncResponse(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* status */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* status */ String, /* value */ String, Unit]]]
    @JSName("receiveAsyncResponse")
    var receiveAsyncResponse_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* status */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* status */ String, /* value */ String, Unit]]]
      ]
    
    def setNetworkConnection(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]]
    @JSName("setNetworkConnection")
    var setNetworkConnection_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]]
      ]
    
    def switchContext(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    @JSName("switchContext")
    var switchContext_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    
    def touchPerform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    @JSName("touchPerform")
    var touchPerform_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
  }
  object MJSONWPCommandsAsync {
    
    inline def apply(
      getContext: /* args */ Parameters[js.Function0[Context]] => js.Promise[ReturnType[js.Function0[Context]]],
      getContexts: /* args */ Parameters[js.Function0[js.Array[Context]]] => js.Promise[ReturnType[js.Function0[js.Array[Context]]]],
      getNetworkConnection: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getPageIndex: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      multiTouchPerform: /* args */ Parameters[
          js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
          ]
        ],
      receiveAsyncResponse: /* args */ Parameters[js.Function2[/* status */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* status */ String, /* value */ String, Unit]]],
      setNetworkConnection: /* args */ Parameters[js.Function1[/* type */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]],
      switchContext: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
      touchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    ): MJSONWPCommandsAsync = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext), getContexts = js.Any.fromFunction1(getContexts), getNetworkConnection = js.Any.fromFunction1(getNetworkConnection), getPageIndex = js.Any.fromFunction1(getPageIndex), multiTouchPerform = js.Any.fromFunction1(multiTouchPerform), receiveAsyncResponse = js.Any.fromFunction1(receiveAsyncResponse), setNetworkConnection = js.Any.fromFunction1(setNetworkConnection), switchContext = js.Any.fromFunction1(switchContext), touchPerform = js.Any.fromFunction1(touchPerform))
      __obj.asInstanceOf[MJSONWPCommandsAsync]
    }
    
    extension [Self <: MJSONWPCommandsAsync](x: Self) {
      
      inline def setGetContext(
        value: /* args */ Parameters[js.Function0[Context]] => js.Promise[ReturnType[js.Function0[Context]]]
      ): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      inline def setGetContexts(
        value: /* args */ Parameters[js.Function0[js.Array[Context]]] => js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
      ): Self = StObject.set(x, "getContexts", js.Any.fromFunction1(value))
      
      inline def setGetNetworkConnection(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getNetworkConnection", js.Any.fromFunction1(value))
      
      inline def setGetPageIndex(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction1(value))
      
      inline def setMultiTouchPerform(
        value: /* args */ Parameters[
              js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
            ] => js.Promise[
              ReturnType[
                js.Function2[/* actions */ js.Array[js.Object], /* elementId */ js.Array[js.Object], Unit]
              ]
            ]
      ): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction1(value))
      
      inline def setReceiveAsyncResponse(
        value: /* args */ Parameters[js.Function2[/* status */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* status */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction1(value))
      
      inline def setSetNetworkConnection(
        value: /* args */ Parameters[js.Function1[/* type */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]]
      ): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1(value))
      
      inline def setSwitchContext(
        value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ): Self = StObject.set(x, "switchContext", js.Any.fromFunction1(value))
      
      inline def setTouchPerform(
        value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent @wdio/protocols.@wdio/protocols/build/commands/webdriver.default */
  /* Inlined parent std.Omit<@wdio/protocols.@wdio/protocols/build/commands/jsonwp.default, keyof @wdio/protocols.@wdio/protocols/build/commands/webdriver.default> */
  /* Inlined parent @wdio/protocols.@wdio/protocols/build/commands/appium.default */
  /* Inlined parent @wdio/protocols.@wdio/protocols/build/commands/chromium.default */
  /* Inlined parent std.Omit<@wdio/protocols.@wdio/protocols/build/commands/mjsonwp.default, keyof @wdio/protocols.@wdio/protocols/build/commands/appium.default | keyof @wdio/protocols.@wdio/protocols/build/commands/chromium.default> */
  /* Inlined parent @wdio/protocols.@wdio/protocols/build/commands/saucelabs.default */
  /* Inlined parent @wdio/protocols.@wdio/protocols/build/commands/selenium.default */
  @js.native
  trait ProtocolCommands extends StObject {
    
    def _getWindowSize(): ProtocolCommandResponse = js.native
    @JSName("_getWindowSize")
    var _getWindowSize_Original: js.Function0[ProtocolCommandResponse] = js.native
    
    def _setWindowSize(width: Double, height: Double): Unit = js.native
    @JSName("_setWindowSize")
    var _setWindowSize_Original: js.Function2[/* width */ Double, /* height */ Double, Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Accept Alert command accepts a simple dialog if present, otherwise error.
      * @ref https://w3c.github.io/webdriver/#dfn-accept-alert
      *
      */
    def acceptAlert(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Activate the given app onto the device
      * @ref http://appium.io/docs/en/commands/device/app/activate-app/
      *
      */
    def activateApp(appId: String): Unit = js.native
    
    def activateIME(engine: String): Unit = js.native
    @JSName("activateIME")
    var activateIME_Original: js.Function1[/* engine */ String, Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Add Cookie command adds a single cookie to the cookie store associated with the active document's address.
      * @ref https://w3c.github.io/webdriver/#dfn-adding-a-cookie
      *
      */
    def addCookie(cookie: js.Object): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Injects a Public Key Credential Source into an existing Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-add-credential
      *
      */
    def addCredential(
      credentialId: String,
      isResidentCredential: Boolean,
      rpId: String,
      privateKey: String,
      userHandle: String,
      signCount: Double,
      largeBlob: String
    ): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Creates a software [Virtual Authenticator](https://www.w3.org/TR/webauthn-2/#virtual-authenticators).
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-add-virtual-authenticator
      *
      */
    def addVirtualAuthenticator(
      protocol: js.UndefOr[String],
      transport: js.UndefOr[String],
      hasResidentKey: js.UndefOr[Boolean],
      hasUserVerification: js.UndefOr[Boolean],
      isUserConsenting: js.UndefOr[Boolean],
      isUserVerified: js.UndefOr[Boolean],
      extensions: js.UndefOr[js.Array[String]],
      uvm: js.UndefOr[js.Array[js.Object]]
    ): Unit = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Assert against the performance baseline of your app.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
      *
      * @example
      * ```js
      * // test performance for a page
      * browser.url('https://webdriver.io')
      * const hasRegression = browser.assertPerformance({
      *   name: 'my performance test', // make sure that the name is also set in the sauce options in your capabilities
      *   metrics: ['score', 'firstPaint']
      * })
      * ```
      */
    def assertPerformance(name: String): ProtocolCommandResponse = js.native
    def assertPerformance(name: String, metrics: js.Array[String]): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Back command causes the browser to traverse one step backward in the joint session history of the current top-level browsing context. This is equivalent to pressing the back button in the browser chrome or calling `window.history.back`.
      * @ref https://w3c.github.io/webdriver/#dfn-back
      *
      */
    def back(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Send the currently running app for this session to the background. iOS tests with XCUITest can also use the `mobile: terminateApp` method to terminate the current app (see detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-terminateapp)), and the `mobile: activateApp` to activate an existing application on the device under test and moves it to the foreground (see detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-activateapp)).
      * @ref http://appium.io/docs/en/commands/device/app/background-app/
      *
      */
    def background(): Unit = js.native
    def background(seconds: Double): Unit = js.native
    
    def buttonDown(): Unit = js.native
    def buttonDown(button: Double): Unit = js.native
    @JSName("buttonDown")
    var buttonDown_Original: js.Function1[/* button */ js.UndefOr[Double], Unit] = js.native
    
    def buttonUp(): Unit = js.native
    def buttonUp(button: Double): Unit = js.native
    @JSName("buttonUp")
    var buttonUp_Original: js.Function1[/* button */ js.UndefOr[Double], Unit] = js.native
    
    def clearLocalStorage(): Unit = js.native
    @JSName("clearLocalStorage")
    var clearLocalStorage_Original: js.Function0[Unit] = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Clear list of mock calls.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
      *
      */
    def clearMockCalls(mockId: String): Unit = js.native
    def clearMockCalls(mockId: String, restore: Boolean): Unit = js.native
    
    def clearSessionStorage(): Unit = js.native
    @JSName("clearSessionStorage")
    var clearSessionStorage_Original: js.Function0[Unit] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Close an app on device.
      * @ref http://appium.io/docs/en/commands/device/app/close-app/
      *
      */
    def closeApp(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Close Window command closes the current top-level browsing context. Once done, if there are no more top-level browsing contexts open, the WebDriver session itself is closed.
      * @ref https://w3c.github.io/webdriver/#dfn-close-window
      *
      */
    def closeWindow(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Performs images comparison using OpenCV framework features. It is expected that both OpenCV framework and opencv4nodejs module are installed on the machine where Appium server is running.
      * @ref http://appium.io/docs/en/writing-running-appium/image-comparison/
      *
      */
    def compareImages(mode: String, firstImage: String, secondImage: String, options: js.Object): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Creates a mock sensor to emulate sensors like Ambient Light Sensor. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#create-mock-sensor-command
      *
      */
    def createMockSensor(mockSensorType: String, maxSamplingFrequency: Double, minSamplingFrequency: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Create a new top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#new-window
      *
      */
    def createWindow(`type`: tab | window): WindowHandle = js.native
    
    def deactivateIME(): Unit = js.native
    @JSName("deactivateIME")
    var deactivateIME_Original: js.Function0[Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete All Cookies command allows deletion of all cookies associated with the active document's address.
      * @ref https://w3c.github.io/webdriver/#dfn-delete-all-cookies
      *
      */
    def deleteAllCookies(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete Cookie command allows you to delete either a single cookie by parameter name, or all the cookies associated with the active document's address if name is undefined.
      * @ref https://w3c.github.io/webdriver/#dfn-delete-cookie
      *
      */
    def deleteCookie(name: String): Unit = js.native
    
    def deleteLocalStorageItem(key: String): Unit = js.native
    @JSName("deleteLocalStorageItem")
    var deleteLocalStorageItem_Original: js.Function1[/* key */ String, Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete Session command closes any top-level browsing contexts associated with the current session, terminates the connection, and finally closes the current session. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#delete-mock-sensor-command
      *
      */
    def deleteMockSensor(`type`: String): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Disable any network throttling which might have been set. Equivalent of setting the `No throttling` preset.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/window_commands.cc#L1724-L1745
      *
      */
    def deleteNetworkConditions(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Delete Session command closes any top-level browsing contexts associated with the current session, terminates the connection, and finally closes the current session.
      * @ref https://w3c.github.io/webdriver/#dfn-delete-session
      *
      */
    def deleteSession(): Unit = js.native
    
    def deleteSessionStorageItem(key: String): Unit = js.native
    @JSName("deleteSessionStorageItem")
    var deleteSessionStorageItem_Original: js.Function1[/* key */ String, Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Dismiss Alert command dismisses a simple dialog if present, otherwise error. A request to dismiss an alert user prompt, which may not necessarily have a dismiss button, has the same effect as accepting it.
      * @ref https://w3c.github.io/webdriver/#dfn-dismiss-alert
      *
      */
    def dismissAlert(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * This command allows you to define a webdriverio script in a string and send it to the Appium server to be executed locally to the server itself, thus reducing latency that might otherwise occur along with each command.
      * @ref https://github.com/appium/appium/blob/master/docs/en/commands/session/execute-driver.md
      *
      */
    def driverScript(script: String): ProtocolCommandResponse = js.native
    def driverScript(script: String, `type`: String): ProtocolCommandResponse = js.native
    def driverScript(script: String, `type`: String, timeout: Double): ProtocolCommandResponse = js.native
    def driverScript(script: String, `type`: Unit, timeout: Double): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Element Clear command scrolls into view an editable or resettable element and then attempts to clear its selected files or text content.
      * @ref https://w3c.github.io/webdriver/#dfn-element-clear
      *
      */
    def elementClear(elementId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Element Click command scrolls into view the element if it is not already pointer-interactable, and clicks its in-view center point. If the element's center point is obscured by another element, an element click intercepted error is returned. If the element is outside the viewport, an element not interactable error is returned.
      * @ref https://w3c.github.io/webdriver/#dfn-element-click
      *
      */
    def elementClick(elementId: String): Unit = js.native
    
    def elementEquals(elementId: String, otherElementId: String): Boolean = js.native
    @JSName("elementEquals")
    var elementEquals_Original: js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean] = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Enable hover state for an element, which is reset upon next interaction.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/element_commands.cc#L126-L146
      *
      */
    def elementHover(elementId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Element Send Keys command scrolls into view the form control element and then sends the provided keys to the element. In case the element is not keyboard-interactable, an element not interactable error is returned.<br /><br />The key input state used for input may be cleared mid-way through "typing" by sending the null key, which is U+E000 (NULL).
      * @ref https://w3c.github.io/webdriver/#dfn-element-send-keys
      *
      */
    def elementSendKeys(elementId: String, text: String): Unit = js.native
    
    def elementSubmit(elementId: String): Unit = js.native
    @JSName("elementSubmit")
    var elementSubmit_Original: js.Function1[/* elementId */ String, Unit] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get test coverage data.
      * @ref http://appium.io/docs/en/commands/device/app/end-test-coverage/
      *
      */
    def endCoverage(intent: String, path: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Execute Async Script command causes JavaScript to execute as an anonymous function. Unlike the Execute Script command, the result of the function is ignored. Instead an additional argument is provided as the final argument to the function. This is a function that, when called, returns its first argument as the response.
      * @ref https://w3c.github.io/webdriver/#dfn-execute-async-script
      *
      */
    def executeAsyncScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): Any = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Execute Script command executes a JavaScript function in the context of the current browsing context and returns the return value of the function.
      * @ref https://w3c.github.io/webdriver/#dfn-execute-script
      *
      */
    def executeScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): Any = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Upload a file to remote machine on which the browser is running.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/session_commands.cc#L1037-L1065
      *
      */
    def file(file: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Element command is used to find an element in the current browsing context that can be used for future commands. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element.
      * @ref https://w3c.github.io/webdriver/#dfn-find-element
      *
      * @example
      * ```js
      * // get element
      * const elementRef = await browser.findElement('xpath', '//div')
      * const element = await $(elementRef)
      * await element.click()
      * ```
      */
    def findElement(`using`: String, value: String): ElementReference = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Element From Element command is used to find an element from a web element in the current browsing context that can be used for future commands. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-find-element-from-element
      *
      */
    def findElementFromElement(elementId: String, `using`: String, value: String): ElementReference = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Element From Shadow Root command is used to find an element within the shadow root of an element that can be used for future commands. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element.
      * @ref https://w3c.github.io/webdriver/#find-element-from-shadow-root
      *
      * @example
      * ```js
      * // get shadow root
      * const element = await browser.findElement('xpath', '//div')
      * const shadowRoot = await browser.getElementShadowRoot(
      *     element['element-6066-11e4-a52e-4f735466cecf']
      * )
      * // fetch element within that shadow root
      * const elementRef = await browser.findElementFromShadowRoot(
      *     shadowRoot['shadow-6066-11e4-a52e-4f735466cecf'],
      *     'xpath',
      *     '//div'
      * )
      * ```
      */
    def findElementFromShadowRoot(shadowId: String, `using`: String, value: String): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Elements command is used to find elements in the current browsing context that can be used for future commands. This command returns array of JSON representation of the elements that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-find-elements
      *
      */
    def findElements(`using`: String, value: String): js.Array[ElementReference] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Elements From Element command is used to find elements from a web element in the current browsing context that can be used for future commands. This command returns array of JSON representation of the elements that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-find-elements-from-element
      *
      */
    def findElementsFromElement(elementId: String, `using`: String, value: String): js.Array[ElementReference] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Find Elements command is used to find elements within the shadow root of an element that can be used for future commands. This command returns array of JSON representation of the elements that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#find-elements-from-shadow-root
      *
      * @example
      * ```js
      * // get shadow root
      * const element = await browser.findElement('xpath', '//div')
      * const shadowRoot = await browser.getElementShadowRoot(
      *     element['element-6066-11e4-a52e-4f735466cecf']
      * )
      * // fetch elements within that shadow root
      * const elementRef = await browser.findElementsFromShadowRoot(
      *     shadowRoot['shadow-6066-11e4-a52e-4f735466cecf'],
      *     'xpath',
      *     '//div'
      * )
      * ```
      */
    def findElementsFromShadowRoot(shadowId: String, `using`: String, value: String): js.Array[js.Object] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Authenticate users by using their finger print scans on supported emulators.
      * @ref http://appium.io/docs/en/commands/device/authentication/finger-print/
      *
      */
    def fingerPrint(fingerprintId: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Forward command causes the browser to traverse one step forwards in the joint session history of the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-forward
      *
      */
    def forward(): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Freeze the current page. Extension for [Page Lifecycle API](https://developers.google.com/web/updates/2018/07/page-lifecycle-api).
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/window_commands.cc#L625-L633
      *
      */
    def freeze(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Fullscreen Window command invokes the window manager-specific “full screen” operation, if any, on the window containing the current top-level browsing context. This typically increases the window to the size of the physical display and can hide browser chrome elements such as toolbars.
      * @ref https://w3c.github.io/webdriver/#dfn-fullscreen-window
      *
      */
    def fullscreenWindow(): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Generates a report for testing. Extension for [Reporting API](https://developers.google.com/web/updates/2018/09/reportingapi). __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/reporting/#automation
      *
      */
    def generateTestReport(message: String, group: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get Active Element returns the active element of the current browsing context’s document element. This command returns JSON representation of the element that can be passed to $ command to transform the reference to an extended WebdriverIO element (See findElement).
      * @ref https://w3c.github.io/webdriver/#dfn-get-active-element
      *
      */
    def getActiveElement(): String = js.native
    
    def getActiveEngine(): String = js.native
    @JSName("getActiveEngine")
    var getActiveEngine_Original: js.Function0[String] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Alert Text command returns the message of the current user prompt. If there is no current user prompt, it returns an error.
      * @ref https://w3c.github.io/webdriver/#dfn-get-alert-text
      *
      */
    def getAlertText(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get All Cookies command returns all cookies associated with the address of the current browsing context’s active document.
      * @ref https://w3c.github.io/webdriver/#dfn-get-all-cookies
      *
      */
    def getAllCookies(): js.Array[Cookie] = js.native
    
    def getApplicationCacheStatus(): Double = js.native
    @JSName("getApplicationCacheStatus")
    var getApplicationCacheStatus_Original: js.Function0[Double] = js.native
    
    def getAvailableEngines(): js.Array[String] = js.native
    @JSName("getAvailableEngines")
    var getAvailableEngines_Original: js.Function0[js.Array[String]] = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Returns error message if there is any issue in a Cast session.
      * @ref https://chromium.googlesource.com/chromium/src/+/refs/tags/73.0.3683.121/chrome/test/chromedriver/server/http_handler.cc#751
      *
      */
    def getCastIssueMessage(): String = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Returns the list of cast sinks (Cast devices) available to the Chrome media router.
      * @ref https://chromium.googlesource.com/chromium/src/+/refs/tags/73.0.3683.121/chrome/test/chromedriver/server/http_handler.cc#748
      *
      */
    def getCastSinks(): js.Array[String] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the content of the system clipboard
      * @ref http://appium.io/docs/en/commands/device/clipboard/get-clipboard/
      *
      */
    def getClipboard(): String = js.native
    def getClipboard(contentType: String): String = js.native
    
    def getContext(): Context = js.native
    @JSName("getContext")
    var getContext_Original: js.Function0[Context] = js.native
    
    def getContexts(): js.Array[Context] = js.native
    @JSName("getContexts")
    var getContexts_Original: js.Function0[js.Array[Context]] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Returns one Credential Parameters object for every Public Key Credential Source stored in a Virtual Authenticator, regardless of whether they were stored using Add Credential or `navigator.credentials.create()`.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-get-credentials
      *
      */
    def getCredentials(authenticatorId: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the name of the current Android activity.
      * @ref http://appium.io/docs/en/commands/device/activity/current-activity/
      *
      */
    def getCurrentActivity(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the name of the current Android package.
      * @ref http://appium.io/docs/en/commands/device/activity/current-package/
      *
      */
    def getCurrentPackage(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the time on the device.
      * @ref http://appium.io/docs/en/commands/device/system/system-time/
      *
      */
    def getDeviceTime(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get display density from device.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def getDisplayDensity(): Any = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Attribute command will return the attribute of a web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-attribute
      *
      */
    def getElementAttribute(elementId: String, name: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element CSS Value command retrieves the computed value of the given CSS property of the given web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-css-value
      *
      */
    def getElementCSSValue(elementId: String, propertyName: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get the accessible name of the element.
      * @ref https://w3c.github.io/webdriver/#get-computed-label
      *
      */
    def getElementComputedLabel(elementId: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get the computed WAI-ARIA role of an element.
      * @ref https://w3c.github.io/webdriver/#get-computed-role
      *
      */
    def getElementComputedRole(elementId: String): String = js.native
    
    def getElementLocation(elementId: String): ProtocolCommandResponse = js.native
    
    def getElementLocationInView(elementId: String): ProtocolCommandResponse = js.native
    @JSName("getElementLocationInView")
    var getElementLocationInView_Original: js.Function1[/* elementId */ String, ProtocolCommandResponse] = js.native
    
    @JSName("getElementLocation")
    var getElementLocation_Original: js.Function1[/* elementId */ String, ProtocolCommandResponse] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Property command will return the result of getting a property of an element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-property
      *
      */
    def getElementProperty(elementId: String, name: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Rect command returns the dimensions and coordinates of the given web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-rect
      *
      */
    def getElementRect(elementId: String): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Get the shadow root object of an element. The result object can be used to fetch elements within this shadow root using e.g. findElementFromShadowRoots or findElementsFromShadowRoots.
      * @ref https://w3c.github.io/webdriver/#dfn-get-active-element
      *
      */
    def getElementShadowRoot(elementId: String): String = js.native
    
    def getElementSize(elementId: String): ProtocolCommandResponse = js.native
    @JSName("getElementSize")
    var getElementSize_Original: js.Function1[/* elementId */ String, ProtocolCommandResponse] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Tag Name command returns the qualified element name of the given web element.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-tag-name
      *
      */
    def getElementTagName(elementId: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Element Text command intends to return an element’s text "as rendered". An element's rendered text is also used for locating a elements by their link text and partial link text.
      * @ref https://w3c.github.io/webdriver/#dfn-get-element-text
      *
      */
    def getElementText(elementId: String): String = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Retrieves the value of a given form control element.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/element_commands.cc#L431-L443
      *
      */
    def getElementValue(elementId: String): String | Null = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get events stored in appium server.
      * @ref https://github.com/appium/appium/blob/master/docs/en/commands/session/events/get-events.md
      *
      */
    def getEvents(`type`: js.Array[String]): ProtocolCommandResponse = js.native
    
    def getGeoLocation(): ProtocolCommandResponse = js.native
    @JSName("getGeoLocation")
    var getGeoLocation_Original: js.Function0[ProtocolCommandResponse] = js.native
    
    /**
      * Selenium Protocol Command
      *
      * Receive hub config remotely.
      * @ref https://github.com/nicegraham/selenium-grid2-api#gridapihub
      *
      */
    def getHubConfig(): ProtocolCommandResponse = js.native
    
    def getLocalStorage(): js.Array[String] = js.native
    
    def getLocalStorageItem(key: String): String = js.native
    @JSName("getLocalStorageItem")
    var getLocalStorageItem_Original: js.Function1[/* key */ String, String] = js.native
    
    def getLocalStorageSize(): Double = js.native
    @JSName("getLocalStorageSize")
    var getLocalStorageSize_Original: js.Function0[Double] = js.native
    
    @JSName("getLocalStorage")
    var getLocalStorage_Original: js.Function0[js.Array[String]] = js.native
    
    def getLogTypes(): js.Array[String] = js.native
    @JSName("getLogTypes")
    var getLogTypes_Original: js.Function0[js.Array[String]] = js.native
    
    def getLogs(`type`: String): js.Array[js.Object] = js.native
    @JSName("getLogs")
    var getLogs_Original: js.Function1[/* type */ String, js.Array[js.Object]] = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Receive request information about requests that match the mocked resource.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
      *
      */
    def getMockCalls(mockId: String): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Retrieves information about a given type of mock sensor. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#get-mock-sensor-command
      *
      */
    def getMockSensor(`type`: String): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Named Cookie command returns the cookie with the requested name from the associated cookies in the cookie store of the current browsing context's active document. If no cookie is found, a no such cookie error is returned.
      * @ref https://w3c.github.io/webdriver/#dfn-get-named-cookie
      *
      */
    def getNamedCookie(name: String): Cookie = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Get current network conditions used for emulation.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/session_commands.cc#L839-L859
      *
      */
    def getNetworkConditions(): ProtocolCommandResponse = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Get the connection type for network emulation. This command is only applicable when remote end replies with `networkConnectionEnabled` capability set to `true`.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
      *
      * @example
      * ```js
      * const browser = remote({
      *     capabilities: {
      *         browserName: 'chrome',
      *         'goog:chromeOptions': {
      *             // Network emulation requires device mode, which is only enabled when mobile emulation is on
      *             mobileEmulation: { deviceName: 'iPad' },
      *         },
      *     }
      * });
      * console.log(browser.getNetworkConnection()); // outputs: 6 (Both Wi-Fi and data)
      * ```
      */
    def getNetworkConnection(): Double = js.native
    
    def getOrientation(): String = js.native
    @JSName("getOrientation")
    var getOrientation_Original: js.Function0[String] = js.native
    
    def getPageIndex(): String = js.native
    @JSName("getPageIndex")
    var getPageIndex_Original: js.Function0[String] = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Get webpage specific log information based on the last page load.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-ExtendedDebuggingTools
      *
      * @example
      * ```js
      * // Get Network Logs
      * console.log(browser.getPageLogs('sauce:network'));
      * //
      * // outputs:
      * // [{
      * //   "url": "https://app.saucelabs.com/dashboard",
      * //   "statusCode": 200,
      * //   "method": "GET",
      * //   "requestHeaders": {
      * //     ...
      * //   },
      * //   "responseHeaders": {
      * //     ...
      * //   },
      * //   "timing": {
      * //     ...
      * //   }
      * // }, {,
      * //   ...
      * // }]
      * //
      * ```*
      * @example
      * ```js
      * // Get Performance Logs (needs capturePerformance capability see: https://wiki.saucelabs.com/display/DOCS/Measure+Page+Load+Performance+Using+Test+Automation#MeasurePageLoadPerformanceUsingTestAutomation-EnableYourScript)
      * console.log(browser.getPageLogs('sauce:performance'));
      * //
      * // outputs:
      * // {
      * //   "speedIndex": 1472.023,
      * //   "timeToFirstInteractive": 1243.214,
      * //   "firstMeaningfulPaint": 892.643,
      * //   ...
      * // }
      * //
      * ```
      */
    def getPageLogs(`type`: String): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Page Source command returns a string serialization of the DOM of the current browsing context active document.
      * @ref https://w3c.github.io/webdriver/#dfn-get-page-source
      *
      */
    def getPageSource(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Returns the information of the system state which is supported to read as like cpu, memory, network traffic, and battery.
      * @ref http://appium.io/docs/en/commands/device/performance-data/get-performance-data/
      *
      */
    def getPerformanceData(packageName: String, dataType: String): js.Array[String] = js.native
    def getPerformanceData(packageName: String, dataType: String, dataReadTimeout: Double): js.Array[String] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Returns the information types of the system state which is supported to read as like cpu, memory, network traffic, and battery.
      * @ref http://appium.io/docs/en/commands/device/performance-data/performance-data-types/
      *
      */
    def getPerformanceDataTypes(): js.Array[String] = js.native
    
    def getSession(): ProtocolCommandResponse = js.native
    
    def getSessionStorage(): js.Array[String] = js.native
    
    def getSessionStorageItem(key: String): String = js.native
    @JSName("getSessionStorageItem")
    var getSessionStorageItem_Original: js.Function1[/* key */ String, String] = js.native
    
    def getSessionStorageSize(): Double = js.native
    @JSName("getSessionStorageSize")
    var getSessionStorageSize_Original: js.Function0[Double] = js.native
    
    @JSName("getSessionStorage")
    var getSessionStorage_Original: js.Function0[js.Array[String]] = js.native
    
    @JSName("getSession")
    var getSession_Original: js.Function0[ProtocolCommandResponse] = js.native
    
    def getSessions(): js.Array[js.Object] = js.native
    @JSName("getSessions")
    var getSessions_Original: js.Function0[js.Array[js.Object]] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve the current settings on the device.
      * @ref http://appium.io/docs/en/commands/session/settings/get-settings/
      *
      */
    def getSettings(): SettingsReturn = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get app strings.
      * @ref http://appium.io/docs/en/commands/device/app/get-app-strings/
      *
      */
    def getStrings(): StringsReturn = js.native
    def getStrings(language: String): StringsReturn = js.native
    def getStrings(language: String, stringFile: String): StringsReturn = js.native
    def getStrings(language: Unit, stringFile: String): StringsReturn = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve visibility and bounds information of the status and navigation bars.
      * @ref http://appium.io/docs/en/commands/device/system/system-bars/
      *
      */
    def getSystemBars(): js.Array[js.Object] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Timeouts command gets timeout durations associated with the current session.
      * @ref https://w3c.github.io/webdriver/#dfn-get-timeouts
      *
      */
    def getTimeouts(): Timeouts = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Title command returns the document title of the current top-level browsing context, equivalent to calling `document.title`.
      * @ref https://w3c.github.io/webdriver/#dfn-get-title
      *
      */
    def getTitle(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Current URL command returns the URL of the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-get-current-url
      *
      */
    def getUrl(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Window Handle command returns the window handle for the current top-level browsing context. It can be used as an argument to Switch To Window.
      * @ref https://w3c.github.io/webdriver/#dfn-get-window-handle
      *
      */
    def getWindowHandle(): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Window Handles command returns a list of window handles for every open top-level browsing context. The order in which the window handles are returned is arbitrary.
      * @ref https://w3c.github.io/webdriver/#dfn-get-window-handles
      *
      */
    def getWindowHandles(): js.Array[String] = js.native
    
    def getWindowPosition(): ProtocolCommandResponse = js.native
    @JSName("getWindowPosition")
    var getWindowPosition_Original: js.Function0[ProtocolCommandResponse] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Get Window Rect command returns the size and position on the screen of the operating system window corresponding to the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-get-window-rect
      *
      */
    def getWindowRect(): RectReturn = js.native
    
    /**
      * Selenium Protocol Command
      *
      * Get proxy details.
      * @ref https://github.com/nicegraham/selenium-grid2-api#gridapiproxy
      *
      */
    def gridProxyDetails(id: String): ProtocolCommandResponse = js.native
    
    /**
      * Selenium Protocol Command
      *
      * Get the details of the Selenium Grid node running a session.
      * @ref https://github.com/nicegraham/selenium-grid2-api#gridapitestsession
      *
      */
    def gridTestSession(session: String): ProtocolCommandResponse = js.native
    
    /**
      * Appium Protocol Command
      *
      * Make GSM call (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/gsm-call/
      *
      */
    def gsmCall(phoneNumber: String, action: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set GSM signal strength (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/gsm-signal/
      *
      */
    def gsmSignal(signalStrength: String): Unit = js.native
    def gsmSignal(signalStrength: String, signalStrengh: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set GSM voice state (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/gsm-voice/
      *
      */
    def gsmVoice(state: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Hide soft keyboard.
      * @ref http://appium.io/docs/en/commands/device/keys/hide-keyboard/
      *
      */
    def hideKeyboard(): Unit = js.native
    def hideKeyboard(strategy: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String, keyCode: Unit, keyName: String): Unit = js.native
    def hideKeyboard(strategy: String, key: Unit, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: String, key: Unit, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: String, key: Unit, keyCode: Unit, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String, keyCode: Unit, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: Unit, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: Unit, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: Unit, keyCode: Unit, keyName: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Install the given app onto the device.
      * @ref http://appium.io/docs/en/commands/device/app/install-app/
      *
      */
    def installApp(appPath: String): Unit = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Allows modifying any request made by the browser. You can blacklist, modify, or redirect these as required for your tests.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-InterceptNetworkRequests
      *
      * @example
      * ```js
      * // redirect a request
      * browser.interceptRequest({
      *   url: 'https://saucelabs.com',
      *   redirect: 'https://google.com'
      * })
      * ```*
      * @example
      * ```js
      * // Blacklist requests to 3rd party vendors
      * browser.interceptRequest({
      *   url: 'https://api.segment.io/v1/p',
      *   error: 'Failed'
      * })
      * ```*
      * @example
      * ```js
      * // Modify requests to REST API (Mock REST API response)
      * browser.interceptRequest({
      *   url: 'http://sampleapp.appspot.com/api/todos',
      *   response: {
      *     headers: {
      *       'x-custom-headers': 'foobar'
      *     },
      *     body: [{
      *       title: 'My custom todo',
      *       order: 1,
      *       completed: false,
      *       url: 'http://todo-backend-express.herokuapp.com/15727'
      *     }]
      *   }
      * })
      * ```
      */
    def interceptRequest(rule: js.Object): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Whether a simple dialog is currently open.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/alert_commands.cc#L42-L49
      *
      * @example
      * ```js
      * console.log(browser.isAlertOpen()); // outputs: false
      * browser.execute('window.alert()');
      * console.log(browser.isAlertOpen()); // outputs: true
      * ```
      */
    def isAlertOpen(): Boolean = js.native
    
    /**
      * Appium Protocol Command
      *
      * Check whether the specified app is installed on the device.
      * @ref http://appium.io/docs/en/commands/device/app/is-app-installed/
      *
      */
    def isAppInstalled(appId: String): Boolean = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Whether it should automatically raises errors on browser logs.
      * @ref https://codereview.chromium.org/101203012
      *
      */
    def isAutoReporting(): Boolean = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Is Element Displayed determines the visibility of an element which is guided by what is perceptually visible to the human eye. In this context, an element's displayedness does not relate to the `visibility` or `display` style properties.
      * @ref https://w3c.github.io/webdriver/#element-displayedness
      *
      */
    def isElementDisplayed(elementId: String): Boolean = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Is Element Enabled determines if the referenced element is enabled or not. This operation only makes sense on form controls.
      * @ref https://w3c.github.io/webdriver/#dfn-is-element-enabled
      *
      */
    def isElementEnabled(elementId: String): Boolean = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Is Element Selected determines if the referenced element is selected or not. This operation only makes sense on input elements of the Checkbox- and Radio Button states, or option elements.
      * @ref https://w3c.github.io/webdriver/#dfn-is-element-selected
      *
      */
    def isElementSelected(elementId: String): Boolean = js.native
    
    def isIMEActivated(): Boolean = js.native
    @JSName("isIMEActivated")
    var isIMEActivated_Original: js.Function0[Boolean] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Whether or not the soft keyboard is shown.
      * @ref http://appium.io/docs/en/commands/device/keys/is-keyboard-shown/
      *
      */
    def isKeyboardShown(): Boolean = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Determines load status for active window handle.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/session_commands.cc#L783-L802
      *
      * @example
      * ```js
      * console.log(browser.isLoading()); // outputs: false
      * browser.newWindow('https://webdriver.io');
      * console.log(browser.isLoading()); // outputs: true
      * ```
      */
    def isLoading(): Boolean = js.native
    
    /**
      * Appium Protocol Command
      *
      * Check whether the device is locked or not.
      * @ref http://appium.io/docs/en/commands/device/interactions/is-locked/
      *
      */
    def isLocked(): Boolean = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Perform a scroll test that evaluates the jankiness of the application.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
      *
      * @example
      * ```js
      * // test performance for a page
      * browser.url('https://webdriver.io')
      * browser.jankinessCheck()
      * ```
      */
    def jankinessCheck(): ProtocolCommandResponse = js.native
    
    /**
      * Appium Protocol Command
      *
      * Launch an app on device. iOS tests with XCUITest can also use the `mobile: launchApp` method. See detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-launchapp).
      * @ref http://appium.io/docs/en/commands/device/app/launch-app/
      *
      */
    def launchApp(): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Launches a Chrome app by specified id.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/session_commands.cc#L521-L539
      *
      * @example
      * ```js
      * const browser = remote({
      *     capabilities: {
      *         browserName: 'chrome',
      *         'goog:chromeOptions': {
      *             // Install upon starting browser in order to launch it
      *             extensions: [
      *               // Entry should be a base64-encoded packed Chrome app (.crx)
      *               require('fs').readFileSync('/absolute/path/app.crx').toString('base64')
      *             ]
      *         }
      *     }
      * });
      * browser.launchChromeApp('aohghmighlieiainnegkcijnfilokake')); // Google Docs (https://chrome.google.com/webstore/detail/docs/aohghmighlieiainnegkcijnfilokake)
      * ```
      */
    def launchChromeApp(id: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Lock the device.
      * @ref http://appium.io/docs/en/commands/device/interactions/lock/
      *
      */
    def lock(): Unit = js.native
    def lock(seconds: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Store a custom event.
      * @ref https://github.com/appium/appium/blob/master/docs/en/commands/session/events/log-event.md
      *
      */
    def logEvent(vendor: String, event: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Press and hold a particular key code on the device.
      * @ref http://appium.io/docs/en/commands/device/keys/long-press-keycode/
      *
      */
    def longPressKeyCode(keycode: Double): Unit = js.native
    def longPressKeyCode(keycode: Double, metastate: Double): Unit = js.native
    def longPressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
    def longPressKeyCode(keycode: Double, metastate: Unit, flags: Double): Unit = js.native
    
    /**
      * Selenium Protocol Command
      *
      * Manage lifecycle of hub node.
      * @ref https://github.com/nicegraham/selenium-grid2-api#lifecycle-manager
      *
      */
    def manageSeleniumHubLifecycle(action: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Maximize Window command invokes the window manager-specific "maximize" operation, if any, on the window containing the current top-level browsing context. This typically increases the window to the maximum available size without going full-screen.
      * @ref https://w3c.github.io/webdriver/#dfn-maximize-window
      *
      */
    def maximizeWindow(): RectReturn = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Minimize Window command invokes the window manager-specific "minimize" operation, if any, on the window containing the current top-level browsing context. This typically hides the window in the system tray.
      * @ref https://w3c.github.io/webdriver/#dfn-minimize-window
      *
      */
    def minimizeWindow(): RectReturn = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Mocks a network resource.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
      *
      */
    def mockRequest(url: String): ProtocolCommandResponse = js.native
    def mockRequest(url: String, filterOptions: js.Object): ProtocolCommandResponse = js.native
    
    def moveToElement(): Unit = js.native
    def moveToElement(element: String): Unit = js.native
    def moveToElement(element: String, xoffset: Double): Unit = js.native
    def moveToElement(element: String, xoffset: Double, yoffset: Double): Unit = js.native
    def moveToElement(element: String, xoffset: Unit, yoffset: Double): Unit = js.native
    def moveToElement(element: Null, xoffset: Double): Unit = js.native
    def moveToElement(element: Null, xoffset: Double, yoffset: Double): Unit = js.native
    def moveToElement(element: Null, xoffset: Unit, yoffset: Double): Unit = js.native
    def moveToElement(element: Unit, xoffset: Double): Unit = js.native
    def moveToElement(element: Unit, xoffset: Double, yoffset: Double): Unit = js.native
    def moveToElement(element: Unit, xoffset: Unit, yoffset: Double): Unit = js.native
    @JSName("moveToElement")
    var moveToElement_Original: js.Function3[
        /* element */ js.UndefOr[String | Null], 
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        Unit
      ] = js.native
    
    /**
      * Appium Protocol Command
      *
      * This functionality is only available from within a native context. Perform a multi touch action sequence.
      * @ref http://appium.io/docs/en/commands/interactions/touch/multi-touch-perform/
      *
      */
    def multiTouchPerform(actions: js.Array[js.Object]): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The navigateTo (go) command is used to cause the user agent to navigate the current top-level browsing context a new location.
      * @ref https://w3c.github.io/webdriver/#dfn-navigate-to
      *
      */
    def navigateTo(url: String): String = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The New Session command creates a new WebDriver session with the endpoint node. If the creation fails, a session not created error is returned.
      * @ref https://w3c.github.io/webdriver/#dfn-new-sessions
      *
      */
    def newSession(capabilities: js.Object): SessionReturn = js.native
    
    /**
      * Appium Protocol Command
      *
      * Open Android notifications (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/system/open-notifications/
      *
      */
    def openNotifications(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Perform Actions command is used to execute complex user actions. See [spec](https://github.com/jlipps/simple-wd-spec#perform-actions) for more details.
      * @ref https://w3c.github.io/webdriver/#dfn-perform-actions
      *
      */
    def performActions(actions: js.Array[js.Object]): Unit = js.native
    
    def positionClick(): Unit = js.native
    def positionClick(button: Double): Unit = js.native
    @JSName("positionClick")
    var positionClick_Original: js.Function1[/* button */ js.UndefOr[Double], Unit] = js.native
    
    def positionDoubleClick(): Unit = js.native
    @JSName("positionDoubleClick")
    var positionDoubleClick_Original: js.Function0[Unit] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set the state of the battery charger to connected or not (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/emulator/power_ac/
      *
      */
    def powerAC(state: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set the battery percentage (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/emulator/power_capacity/
      *
      */
    def powerCapacity(percent: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Press a particular key on the device.
      * @ref http://appium.io/docs/en/commands/device/keys/press-keycode/
      *
      */
    def pressKeyCode(keycode: Double): Unit = js.native
    def pressKeyCode(keycode: Double, metastate: Double): Unit = js.native
    def pressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
    def pressKeyCode(keycode: Double, metastate: Unit, flags: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Print Page command renders the document to a paginated PDF document.
      * @ref https://w3c.github.io/webdriver/#print-page
      *
      */
    def printPage(
      orientation: js.UndefOr[String],
      scale: js.UndefOr[Double],
      background: js.UndefOr[Boolean],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      top: js.UndefOr[Double],
      bottom: js.UndefOr[Double],
      left: js.UndefOr[Double],
      right: js.UndefOr[Double],
      shrinkToFit: js.UndefOr[Boolean],
      pageRanges: js.UndefOr[js.Array[js.Object]]
    ): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve a file from the device's file system.
      * @ref http://appium.io/docs/en/commands/device/files/pull-file/
      *
      */
    def pullFile(path: String): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve a folder from the device's file system.
      * @ref http://appium.io/docs/en/commands/device/files/pull-folder/
      *
      */
    def pullFolder(path: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Place a file onto the device in a particular place.
      * @ref http://appium.io/docs/en/commands/device/files/push-file/
      *
      */
    def pushFile(path: String, data: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the given app status on the device
      * @ref http://appium.io/docs/en/commands/device/app/app-state/
      *
      */
    def queryAppState(appId: String): Double = js.native
    
    /**
      * Selenium Protocol Command
      *
      * Send GraphQL queries to the Selenium (hub or node) server to fetch data. (Only supported with Selenium v4 Server)
      * @ref https://www.selenium.dev/documentation/grid/advanced_features/graphql_support/
      *
      * @example
      * ```js
      * const result = await browser.queryGrid('{ nodesInfo { nodes { status, uri } } }');
      * console.log(JSON.stringify(result, null, 4))
      * //
      * // outputs:
      * // {
      * //   "data": {
      * //     "nodesInfo": {
      * //       "nodes": [{
      * //         "status": "UP",
      * //         "uri": "http://192.168.0.39:4444"
      * //       }]
      * //     }
      * //   }
      * // }
      * //
      * ```
      */
    def queryGrid(query: String): ProtocolCommandResponse = js.native
    
    /**
      * Appium Protocol Command
      *
      * Callback url for asynchronous execution of JavaScript.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def receiveAsyncResponse(response: js.Object): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Refresh command causes the browser to reload the page in current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-refresh
      *
      */
    def refresh(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Release Actions command is used to release all the keys and pointer buttons that are currently depressed. This causes events to be fired as if the state was released by an explicit series of actions. It also clears all the internal state of the virtual devices.
      * @ref https://w3c.github.io/webdriver/#dfn-release-actions
      *
      */
    def releaseActions(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Removes all Public Key Credential Sources stored on a Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-remove-all-credentials
      *
      */
    def removeAllCredentials(authenticatorId: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Remove an app from the device.
      * @ref http://appium.io/docs/en/commands/device/app/remove-app/
      *
      */
    def removeApp(appId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Removes a Public Key Credential Source stored on a Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-remove-credential
      *
      */
    def removeCredential(authenticatorId: String, credentialId: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Removes a previously created Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-remove-virtual-authenticator
      *
      */
    def removeVirtualAuthenticator(authenticatorId: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Replace the value to element directly.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def replaceValue(elementId: String, value: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * <b>Deprecated</b> This command will be removed with the upcoming major version release.
      * @ref http://appium.io/docs/en/commands/device/app/reset-app/
      *
      */
    def reset(): Unit = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * Respond if mock matches a specific resource.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands
      *
      */
    def respondMock(mockId: String, payload: js.Object): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Resume the current page. Extension for [Page Lifecycle API](https://developers.google.com/web/updates/2018/07/page-lifecycle-api).
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/window_commands.cc#L635-L645
      *
      */
    def resume(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Rotate the device in three dimensions.
      * @ref http://appium.io/docs/en/commands/device/interactions/rotate/
      *
      */
    def rotateDevice(x: Double, y: Double, radius: Double, rotation: Double, touchCount: Double, duration: Double): Unit = js.native
    def rotateDevice(
      x: Double,
      y: Double,
      radius: Double,
      rotation: Double,
      touchCount: Double,
      duration: Double,
      element: String
    ): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Selects a cast sink (Cast device) as the recipient of media router intents (connect or play).
      * @ref https://chromium.googlesource.com/chromium/src/+/refs/tags/73.0.3683.121/chrome/test/chromedriver/server/http_handler.cc#737
      *
      */
    def selectCastSink(sinkName: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Send Alert Text command sets the text field of a window.prompt user prompt to the given value.
      * @ref https://w3c.github.io/webdriver/#dfn-send-alert-text
      *
      */
    def sendAlertText(text: String): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Send a command to the DevTools debugger.<br />For a list of available commands and their parameters refer to the [Chrome DevTools Protocol Viewer](https://chromedevtools.github.io/devtools-protocol/).
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/window_commands.cc#L1290-L1304
      *
      */
    def sendCommand(cmd: String, params: js.Object): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Send a command to the DevTools debugger and wait for the result.<br />For a list of available commands and their parameters refer to the [Chrome DevTools Protocol Viewer](https://chromedevtools.github.io/devtools-protocol/).
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/window_commands.cc#L1306-L1320
      *
      */
    def sendCommandAndGetResult(cmd: String, params: js.Object): Any = js.native
    
    /**
      * Appium Protocol Command
      *
      * Send a key code to the device.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def sendKeyEvent(keycode: String): Unit = js.native
    def sendKeyEvent(keycode: String, metastate: String): Unit = js.native
    
    def sendKeys(value: js.Array[String]): Unit = js.native
    @JSName("sendKeys")
    var sendKeys_Original: js.Function1[/* value */ js.Array[String], Unit] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Simulate an SMS message (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/send-sms/
      *
      */
    def sendSms(phoneNumber: String, message: String): Unit = js.native
    
    def setAsyncTimeout(ms: Double): Unit = js.native
    @JSName("setAsyncTimeout")
    var setAsyncTimeout_Original: js.Function1[/* ms */ Double, Unit] = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Toggle whether to return response with unknown error with first browser error (e.g. failed to load resource due to 403/404 response) for all subsequent commands (once enabled).
      * @ref https://codereview.chromium.org/101203012
      *
      * @example
      * ```js
      * // Enable auto reporting first thing after session was initiated with empty browser logs
      * console.log(browser.setAutoReporting(true)); // outputs: null
      * // Upon requesting an non-existing resource it will abort execution due to thrown unknown error
      * browser.url('https://webdriver.io/img/404-does-not-exist.png');
      * ```*
      * @example
      * ```js
      * // During the session do some operations which populate the browser logs
      * browser.url('https://webdriver.io/img/404-does-not-exist.png');
      * browser.url('https://webdriver.io/403/no-access');
      * // Enable auto reporting which throws an unknown error for first browser log (404 response)
      * browser.setAutoReporting(true);
      * ```
      */
    def setAutoReporting(enabled: Boolean): js.Object | Null = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set the content of the system clipboard
      * @ref http://appium.io/docs/en/commands/device/clipboard/set-clipboard/
      *
      */
    def setClipboard(content: String): String = js.native
    def setClipboard(content: String, contentType: String): String = js.native
    def setClipboard(content: String, contentType: String, label: String): String = js.native
    def setClipboard(content: String, contentType: Unit, label: String): String = js.native
    
    def setGeoLocation(location: js.Object): Unit = js.native
    @JSName("setGeoLocation")
    var setGeoLocation_Original: js.Function1[/* location */ js.Object, Unit] = js.native
    
    def setImplicitTimeout(ms: Double): Unit = js.native
    @JSName("setImplicitTimeout")
    var setImplicitTimeout_Original: js.Function1[/* ms */ Double, Unit] = js.native
    
    def setLocalStorage(key: String, value: String): Unit = js.native
    @JSName("setLocalStorage")
    var setLocalStorage_Original: js.Function2[/* key */ String, /* value */ String, Unit] = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Set network conditions used for emulation by throttling connection.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/window_commands.cc#L1663-L1722
      *
      * @example
      * ```js
      * // Use different download (25kb/s) and upload (50kb/s) throughput values for throttling with a latency of 1000ms
      * browser.setNetworkConditions({ latency: 1000, download_throughput: 25600, upload_throughput: 51200 });
      * ```*
      * @example
      * ```js
      * // Force disconnected from network by setting 'offline' to true
      * browser.setNetworkConditions({ latency: 0, throughput: 0, offline: true });
      * ```*
      * @example
      * ```js
      * // When preset name (e.g. 'DSL') is specified it does not respect values in object (e.g. 'offline')
      * browser.setNetworkConditions({ latency: 0, throughput: 0, offline: true }, 'DSL');
      * ```*
      * @example
      * ```js
      * // Best practice for specifying network throttling preset is to use an empty object
      * browser.setNetworkConditions({}, 'Good 3G');
      * ```
      */
    def setNetworkConditions(networkConditions: js.Object): Unit = js.native
    def setNetworkConditions(networkConditions: js.Object, networkName: String): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Change connection type for network connection. This command is only applicable when remote end replies with `networkConnectionEnabled` capability set to `true`.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
      *
      * @example
      * ```js
      * const browser = remote({
      *     capabilities: {
      *         browserName: 'chrome',
      *         'goog:chromeOptions': {
      *             // Network emulation requires device mode, which is only enabled when mobile emulation is on
      *             mobileEmulation: { deviceName: 'iPad' },
      *         },
      *     }
      * });
      * console.log(browser.setNetworkConnection({ type: 1 })); // outputs: 1 (Airplane Mode)
      * ```
      */
    def setNetworkConnection(parameters: js.Object): Double = js.native
    
    def setOrientation(orientation: String): Unit = js.native
    @JSName("setOrientation")
    var setOrientation_Original: js.Function1[/* orientation */ String, Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Simulates user modification of a PermissionDescriptor's permission state. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/permissions/#set-permission-command
      *
      * @example
      * ```js
      * // set midi permissions
      * browser.setPermissions({
      *   name: 'midi',
      *   sysex; true
      * , 'granted'); // can be also 'denied' or 'prompt'
      * ```
      */
    def setPermissions(descriptor: js.Object, state: String): Unit = js.native
    def setPermissions(descriptor: js.Object, state: String, oneRealm: Boolean): Unit = js.native
    
    def setSessionStorage(key: String, value: String): Unit = js.native
    @JSName("setSessionStorage")
    var setSessionStorage_Original: js.Function2[/* key */ String, /* value */ String, Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Simulates the changing of a time zone for the purposes of testing. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#create-mock-sensor-command
      *
      */
    def setTimeZone(timeZone: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Set Timeouts command sets timeout durations associated with the current session. The timeouts that can be controlled are listed in the table of session timeouts below.
      * @ref https://w3c.github.io/webdriver/#dfn-set-timeouts
      *
      */
    def setTimeouts(): Unit = js.native
    def setTimeouts(`implicit`: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Unit, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Unit, script: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Set User Verified extension command sets the isUserVerified property on the Virtual Authenticator.
      * @ref https://www.w3.org/TR/webauthn-2/#sctn-automation-set-user-verified
      *
      */
    def setUserVerified(authenticatorId: String, credentialId: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def setValueImmediate(elementId: String, value: String): Unit = js.native
    
    def setWindowPosition(x: Double, y: Double): ProtocolCommandResponse = js.native
    @JSName("setWindowPosition")
    var setWindowPosition_Original: js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Set Window Rect command alters the size and the position of the operating system window corresponding to the current top-level browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-set-window-rect
      *
      */
    def setWindowRect(): RectReturn = js.native
    def setWindowRect(x: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Double, width: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Double, width: Double, height: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Double, width: Null, height: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Null, width: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Null, width: Double, height: Double): RectReturn = js.native
    def setWindowRect(x: Double, y: Null, width: Null, height: Double): RectReturn = js.native
    def setWindowRect(x: Null, y: Double): RectReturn = js.native
    def setWindowRect(x: Null, y: Double, width: Double): RectReturn = js.native
    def setWindowRect(x: Null, y: Double, width: Double, height: Double): RectReturn = js.native
    def setWindowRect(x: Null, y: Double, width: Null, height: Double): RectReturn = js.native
    def setWindowRect(x: Null, y: Null, width: Double): RectReturn = js.native
    def setWindowRect(x: Null, y: Null, width: Double, height: Double): RectReturn = js.native
    def setWindowRect(x: Null, y: Null, width: Null, height: Double): RectReturn = js.native
    
    /**
      * Appium Protocol Command
      *
      * Perform a shake action on the device.
      * @ref http://appium.io/docs/en/commands/device/interactions/shake/
      *
      */
    def shake(): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Shutdown ChromeDriver process and consequently terminating all active sessions.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/session_commands.cc#L489-L498
      *
      */
    def shutdown(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Start an Android activity by providing package name and activity name.
      * @ref http://appium.io/docs/en/commands/device/activity/start-activity/
      *
      */
    def startActivity(
      appPackage: String,
      appActivity: String,
      appWaitPackage: js.UndefOr[String],
      appWaitActivity: js.UndefOr[String],
      intentAction: js.UndefOr[String],
      intentCategory: js.UndefOr[String],
      intentFlags: js.UndefOr[String],
      optionalIntentArguments: js.UndefOr[String],
      dontStopAppOnReset: js.UndefOr[String]
    ): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Initiates tab mirroring for the current browser tab on the specified device.
      * @ref https://chromium.googlesource.com/chromium/src/+/refs/tags/73.0.3683.121/chrome/test/chromedriver/server/http_handler.cc#741
      *
      */
    def startCastTabMirroring(sinkName: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Start recording the screen.
      * @ref http://appium.io/docs/en/commands/device/recording-screen/start-recording-screen/
      *
      */
    def startRecordingScreen(): Unit = js.native
    def startRecordingScreen(options: js.Object): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Status command returns information about whether a remote end is in a state in which it can create new sessions and can additionally include arbitrary meta information that is specific to the implementation.
      * @ref https://w3c.github.io/webdriver/#dfn-status
      *
      */
    def status(): StatusReturn = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Stops casting from media router to the specified device, if connected.
      * @ref https://chromium.googlesource.com/chromium/src/+/refs/tags/73.0.3683.121/chrome/test/chromedriver/server/http_handler.cc#744
      *
      */
    def stopCasting(sinkName: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Stop recording screen
      * @ref http://appium.io/docs/en/commands/device/recording-screen/stop-recording-screen/
      *
      */
    def stopRecordingScreen(): String = js.native
    def stopRecordingScreen(remotePath: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String, password: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String, password: Unit, method: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: Unit, password: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: Unit, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: Unit, password: Unit, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String, password: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String, password: Unit, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: Unit, password: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: Unit, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: Unit, password: Unit, method: String): String = js.native
    
    def switchContext(name: String): Unit = js.native
    @JSName("switchContext")
    var switchContext_Original: js.Function1[/* name */ String, Unit] = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Switch To Frame command is used to select the current top-level browsing context or a child browsing context of the current browsing context to use as the current browsing context for subsequent commands.
      * @ref https://w3c.github.io/webdriver/#dfn-switch-to-frame
      *
      */
    def switchToFrame(): Unit = js.native
    def switchToFrame(id: js.Object): Unit = js.native
    def switchToFrame(id: Double): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Switch to Parent Frame command sets the current browsing context for future commands to the parent of the current browsing context.
      * @ref https://w3c.github.io/webdriver/#dfn-switch-to-parent-frame
      *
      */
    def switchToParentFrame(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Switch To Window command is used to select the current top-level browsing context for the current session, i.e. the one that will be used for processing commands.
      * @ref https://w3c.github.io/webdriver/#dfn-switch-to-window
      *
      */
    def switchToWindow(handle: String): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Take Element Screenshot command takes a screenshot of the visible region encompassed by the bounding rectangle of an element.
      * @ref https://w3c.github.io/webdriver/#dfn-take-element-screenshot
      *
      */
    def takeElementScreenshot(elementId: String): String = js.native
    def takeElementScreenshot(elementId: String, scroll: Boolean): String = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Takes a heap snapshot of the current execution context.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/chrome/web_view.h#L198-L202
      *
      */
    def takeHeapSnapshot(): ProtocolCommandResponse = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * The Take Screenshot command takes a screenshot of the top-level browsing context's viewport.
      * @ref https://w3c.github.io/webdriver/#dfn-take-screenshot
      *
      */
    def takeScreenshot(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Terminate the given app on the device
      * @ref http://appium.io/docs/en/commands/device/app/terminate-app/
      *
      */
    def terminateApp(appId: String): Unit = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * You can throttle the CPU in DevTools to understand how your page performs under that constraint.
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-ThrottleCPUCapabilities
      *
      * @example
      * ```js
      * // throttle CPU and make it run 4x slower
      * browser.throttleCPU(4)
      * ```*
      * @example
      * ```js
      * // reset CPU throttling
      * browser.throttleCPU(0)
      * ```
      */
    def throttleCPU(rate: Double): Unit = js.native
    
    /**
      * Saucelabs Protocol Command
      *
      * With network conditioning you can test your site on a variety of network connections, including Edge, 3G, and even offline. You can throttle the data throughput, including the maximum download and upload throughput, and use latency manipulation to enforce a minimum delay in connection round-trip time (RTT).
      * @ref https://wiki.saucelabs.com/display/DOCS/Custom+Sauce+Labs+WebDriver+Extensions+for+Network+and+Log+Commands#CustomSauceLabsWebDriverExtensionsforNetworkandLogCommands-ThrottleNetworkCapabilities
      *
      * @example
      * ```js
      * // predefined network condition
      * browser.throttleNetwork('offline')
      * ```*
      * @example
      * ```js
      * // custom network condition
      * browser.throttleNetwork({
      *   download: 1000,
      *   upload: 500,
      *   latency: 40'
      * })
      * ```
      */
    def throttleNetwork(condition: String): Unit = js.native
    def throttleNetwork(condition: js.Object): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Toggle airplane mode on device.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-airplane-mode/
      *
      */
    def toggleAirplaneMode(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Switch the state of data service.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-data/
      *
      */
    def toggleData(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Toggle the simulator being [enrolled](https://support.apple.com/en-ca/ht201371) to accept touchId (iOS Simulator only). To enable this feature, the `allowTouchIdEnroll` desired capability must be set to true. When `allowTouchIdEnroll` is set to true the Simulator will be enrolled by default, and the 'Toggle Touch ID Enrollment' changes the enrollment state. This call will only work if the Appium process or its parent application (e.g., Terminal.app or Appium.app) has access to Mac OS accessibility in System Preferences > Security & Privacy > Privacy > Accessibility list.
      * @ref http://appium.io/docs/en/commands/device/simulator/toggle-touch-id-enrollment/
      *
      */
    def toggleEnrollTouchId(): Unit = js.native
    def toggleEnrollTouchId(enabled: Boolean): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Switch the state of the location service.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-location-services/
      *
      */
    def toggleLocationServices(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set network speed (Emulator only)
      * @ref http://appium.io/docs/en/commands/device/network/network-speed/
      *
      */
    def toggleNetworkSpeed(netspeed: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Switch the state of the wifi service.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-wifi/
      *
      */
    def toggleWiFi(): Unit = js.native
    
    def touchClick(element: String): Unit = js.native
    @JSName("touchClick")
    var touchClick_Original: js.Function1[/* element */ String, Unit] = js.native
    
    def touchDoubleClick(element: String): Unit = js.native
    @JSName("touchDoubleClick")
    var touchDoubleClick_Original: js.Function1[/* element */ String, Unit] = js.native
    
    def touchDown(x: Double, y: Double): Unit = js.native
    @JSName("touchDown")
    var touchDown_Original: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    def touchFlick(
      xoffset: js.UndefOr[Double],
      yoffset: js.UndefOr[Double],
      element: js.UndefOr[String],
      speed: js.UndefOr[Double],
      xspeed: js.UndefOr[Double],
      yspeed: js.UndefOr[Double]
    ): Unit = js.native
    @JSName("touchFlick")
    var touchFlick_Original: js.Function6[
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        /* element */ js.UndefOr[String], 
        /* speed */ js.UndefOr[Double], 
        /* xspeed */ js.UndefOr[Double], 
        /* yspeed */ js.UndefOr[Double], 
        Unit
      ] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Simulate a [touch id](https://support.apple.com/en-ca/ht201371) event (iOS Simulator only). To enable this feature, the `allowTouchIdEnroll` desired capability must be set to true and the Simulator must be [enrolled](https://support.apple.com/en-ca/ht201371). When you set allowTouchIdEnroll to true, it will set the Simulator to be enrolled by default. The enrollment state can be [toggled](http://appium.io/docs/en/commands/device/simulator/toggle-touch-id-enrollment/index.html). This call will only work if Appium process or its parent application (e.g. Terminal.app or Appium.app) has access to Mac OS accessibility in System Preferences > Security & Privacy > Privacy > Accessibility list.
      * @ref http://appium.io/docs/en/commands/device/simulator/touch-id/
      *
      */
    def touchId(`match`: Boolean): Unit = js.native
    
    def touchLongClick(element: String): Unit = js.native
    @JSName("touchLongClick")
    var touchLongClick_Original: js.Function1[/* element */ String, Unit] = js.native
    
    def touchMove(x: Double, y: Double): Unit = js.native
    @JSName("touchMove")
    var touchMove_Original: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    /**
      * Appium Protocol Command
      *
      * This functionality is only available from within a native context. 'Touch Perform' works similarly to the other singular touch interactions, except that this allows you to chain together more than one touch action as one command. This is useful because Appium commands are sent over the network and there's latency between commands. This latency can make certain touch interactions impossible because some interactions need to be performed in one sequence. Vertical, for example, requires pressing down, moving to a different y coordinate, and then releasing. For it to work, there can't be a delay between the interactions.
      * @ref http://appium.io/docs/en/commands/interactions/touch/touch-perform/
      *
      * @example
      * ```js
      * // do a horizontal swipe by percentage
      * const startPercentage = 10;
      * const endPercentage = 90;
      * const anchorPercentage = 50;
      *
      * const { width, height } = driver.getWindowSize();
      * const anchor = height// anchorPercentage / 100;
      * const startPoint = width// startPercentage / 100;
      * const endPoint = width// endPercentage / 100;
      * driver.touchPerform([
      *   {
      *     action: 'press',
      *     options: {
      *       x: startPoint,
      *       y: anchor,
      *     },
      *   },
      *   {
      *     action: 'wait',
      *     options: {
      *       ms: 100,
      *     },
      *   },
      *   {
      *     action: 'moveTo',
      *     options: {
      *       x: endPoint,
      *       y: anchor,
      *     },
      *   },
      *   {
      *     action: 'release',
      *     options: {},
      *   },
      * ]);
      * ```
      */
    def touchPerform(actions: js.Array[js.Object]): Unit = js.native
    
    /**
      * Chromium Protocol Command
      *
      * Trigger a pinch zoom effect.
      * @ref https://github.com/bayandin/chromedriver/blob/v2.45/window_commands.cc#L813-L827
      *
      */
    def touchPinch(x: Double, y: Double, scale: Double): Unit = js.native
    
    def touchScroll(xoffset: Double, yoffset: Double): Unit = js.native
    def touchScroll(xoffset: Double, yoffset: Double, element: String): Unit = js.native
    @JSName("touchScroll")
    var touchScroll_Original: js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit] = js.native
    
    def touchUp(x: Double, y: Double): Unit = js.native
    @JSName("touchUp")
    var touchUp_Original: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Unlock the device.
      * @ref http://appium.io/docs/en/commands/device/interactions/unlock/
      *
      */
    def unlock(): Unit = js.native
    
    /**
      * Webdriver Protocol Command
      *
      * Updates the mock sensor type. __Note:__ this feature has not landed in all browsers yet.
      * @ref https://w3c.github.io/sensors/#update-mock-sensor-reading-command
      *
      */
    def updateMockSensor(`type`: String, mockSensorType: String, maxSamplingFrequency: Double, minSamplingFrequency: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Update the current setting on the device.
      * @ref http://appium.io/docs/en/commands/session/settings/update-settings/
      *
      */
    def updateSettings(settings: js.Object): Unit = js.native
  }
  
  /* Inlined parent @wdio/protocols.@wdio/protocols.WebDriverCommandsAsync */
  /* Inlined parent std.Omit<@wdio/protocols.@wdio/protocols.JSONWPCommandsAsync, keyof @wdio/protocols.@wdio/protocols.WebDriverCommandsAsync> */
  /* Inlined parent @wdio/protocols.@wdio/protocols.AppiumCommandsAsync */
  /* Inlined parent @wdio/protocols.@wdio/protocols.ChromiumCommandsAsync */
  /* Inlined parent std.Omit<@wdio/protocols.@wdio/protocols.MJSONWPCommandsAsync, keyof @wdio/protocols.@wdio/protocols.AppiumCommandsAsync | keyof @wdio/protocols.@wdio/protocols.ChromiumCommandsAsync> */
  /* Inlined parent @wdio/protocols.@wdio/protocols.SauceLabsCommandsAsync */
  /* Inlined parent @wdio/protocols.@wdio/protocols.SeleniumCommandsAsync */
  trait ProtocolCommandsAsync extends StObject {
    
    def _getWindowSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("_getWindowSize")
    var _getWindowSize_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def _setWindowSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
    @JSName("_setWindowSize")
    var _setWindowSize_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
      ]
    
    def acceptAlert(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("acceptAlert")
    var acceptAlert_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def activateApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
    @JSName("activateApp")
    var activateApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    
    def activateIME(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* engine */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
    @JSName("activateIME")
    var activateIME_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
      ]
    
    def addCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* cookie */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
    @JSName("addCookie")
    var addCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
      ]
    
    def addCredential(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def addVirtualAuthenticator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def assertPerformance(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ]
      ]
    @JSName("assertPerformance")
    var assertPerformance_Original: js.Function1[
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
    
    def back(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("back")
    var back_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def background(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ Double | Null, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
    @JSName("background")
    var background_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
      ]
    
    def buttonDown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    @JSName("buttonDown")
    var buttonDown_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    
    def buttonUp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    @JSName("buttonUp")
    var buttonUp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    
    def clearLocalStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("clearLocalStorage")
    var clearLocalStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def clearMockCalls(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
      ]
    @JSName("clearMockCalls")
    var clearMockCalls_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
        ]
      ]
    
    def clearSessionStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("clearSessionStorage")
    var clearSessionStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def closeApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("closeApp")
    var closeApp_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def closeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("closeWindow")
    var closeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def compareImages(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* mode */ String, 
            /* firstImage */ String, 
            /* secondImage */ String, 
            /* options */ js.Object, 
            ProtocolCommandResponse
          ]
        ]
    ): js.Promise[
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
    
    def createMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
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
    
    def createWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ tab | window, WindowHandle]]
    ): js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
    @JSName("createWindow")
    var createWindow_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
        js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
      ]
    
    def deactivateIME(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deactivateIME")
    var deactivateIME_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def deleteAllCookies(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deleteAllCookies")
    var deleteAllCookies_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def deleteCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    @JSName("deleteCookie")
    var deleteCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    
    def deleteLocalStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
    @JSName("deleteLocalStorageItem")
    var deleteLocalStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    
    def deleteMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
    @JSName("deleteMockSensor")
    var deleteMockSensor_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
      ]
    
    def deleteNetworkConditions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deleteNetworkConditions")
    var deleteNetworkConditions_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def deleteSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    
    def deleteSessionStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
    @JSName("deleteSessionStorageItem")
    var deleteSessionStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ]
    
    @JSName("deleteSession")
    var deleteSession_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def dismissAlert(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("dismissAlert")
    var dismissAlert_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def driverScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ]
      ]
    @JSName("driverScript")
    var driverScript_Original: js.Function1[
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
    
    def elementClear(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementClear")
    var elementClear_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def elementClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementClick")
    var elementClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def elementEquals(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
      ]
    @JSName("elementEquals")
    var elementEquals_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
        ]
      ]
    
    def elementHover(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementHover")
    var elementHover_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def elementSendKeys(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
    @JSName("elementSendKeys")
    var elementSendKeys_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
      ]
    
    def elementSubmit(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementSubmit")
    var elementSubmit_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def endCoverage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
    @JSName("endCoverage")
    var endCoverage_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
      ]
    
    def executeAsyncScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
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
    
    def executeScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
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
    
    def file(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* file */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
    @JSName("file")
    var file_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* file */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ]
    
    def findElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]]
    ): js.Promise[
        ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
      ]
    
    def findElementFromElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
      ]
    @JSName("findElementFromElement")
    var findElementFromElement_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
          ]
        ]
      ]
    
    def findElementFromShadowRoot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ]
      ]
    @JSName("findElementFromShadowRoot")
    var findElementFromShadowRoot_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
          ]
        ]
      ]
    
    @JSName("findElement")
    var findElement_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ]
      ]
    
    def findElements(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
    ): js.Promise[
        ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
      ]
    
    def findElementsFromElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
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
    
    def findElementsFromShadowRoot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ]
      ]
    @JSName("findElementsFromShadowRoot")
    var findElementsFromShadowRoot_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
          ]
        ]
      ]
    
    @JSName("findElements")
    var findElements_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ]
      ]
    
    def fingerPrint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* fingerprintId */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
    @JSName("fingerPrint")
    var fingerPrint_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
      ]
    
    def forward(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("forward")
    var forward_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def freeze(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("freeze")
    var freeze_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def fullscreenWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("fullscreenWindow")
    var fullscreenWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def generateTestReport(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* message */ String, /* group */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
    @JSName("generateTestReport")
    var generateTestReport_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
      ]
    
    def getActiveElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getActiveElement")
    var getActiveElement_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getActiveEngine(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getActiveEngine")
    var getActiveEngine_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getAlertText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getAlertText")
    var getAlertText_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getAllCookies(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[Cookie]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
    @JSName("getAllCookies")
    var getAllCookies_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ]
    
    def getApplicationCacheStatus(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getApplicationCacheStatus")
    var getApplicationCacheStatus_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    def getAvailableEngines(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getAvailableEngines")
    var getAvailableEngines_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getCastIssueMessage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getCastIssueMessage")
    var getCastIssueMessage_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getCastSinks(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getCastSinks")
    var getCastSinks_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getClipboard(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]]
    ): js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
    @JSName("getClipboard")
    var getClipboard_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
        js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
      ]
    
    def getContext(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Context]]
    ): js.Promise[ReturnType[js.Function0[Context]]]
    @JSName("getContext")
    var getContext_Original: js.Function1[
        /* args */ Parameters[js.Function0[Context]], 
        js.Promise[ReturnType[js.Function0[Context]]]
      ]
    
    def getContexts(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[Context]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
    @JSName("getContexts")
    var getContexts_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Context]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
      ]
    
    def getCredentials(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
    @JSName("getCredentials")
    var getCredentials_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    
    def getCurrentActivity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getCurrentActivity")
    var getCurrentActivity_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getCurrentPackage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getCurrentPackage")
    var getCurrentPackage_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getDeviceTime(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getDeviceTime")
    var getDeviceTime_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getDisplayDensity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Any]]
    ): js.Promise[ReturnType[js.Function0[Any]]]
    @JSName("getDisplayDensity")
    var getDisplayDensity_Original: js.Function1[
        /* args */ Parameters[js.Function0[Any]], 
        js.Promise[ReturnType[js.Function0[Any]]]
      ]
    
    def getElementAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    @JSName("getElementAttribute")
    var getElementAttribute_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    
    def getElementCSSValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
      ]
    @JSName("getElementCSSValue")
    var getElementCSSValue_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ]
      ]
    
    def getElementComputedLabel(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementComputedLabel")
    var getElementComputedLabel_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementComputedRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementComputedRole")
    var getElementComputedRole_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementLocation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    
    def getElementLocationInView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    @JSName("getElementLocationInView")
    var getElementLocationInView_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    
    @JSName("getElementLocation")
    var getElementLocation_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    
    def getElementProperty(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    @JSName("getElementProperty")
    var getElementProperty_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    
    def getElementRect(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, RectReturn]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
    @JSName("getElementRect")
    var getElementRect_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
      ]
    
    def getElementShadowRoot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementShadowRoot")
    var getElementShadowRoot_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    @JSName("getElementSize")
    var getElementSize_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ]
    
    def getElementTagName(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementTagName")
    var getElementTagName_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementText")
    var getElementText_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String | Null]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
    @JSName("getElementValue")
    var getElementValue_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
      ]
    
    def getEvents(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
    @JSName("getEvents")
    var getEvents_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
      ]
    
    def getGeoLocation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getGeoLocation")
    var getGeoLocation_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getHubConfig(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getHubConfig")
    var getHubConfig_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getLocalStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    
    def getLocalStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
    @JSName("getLocalStorageItem")
    var getLocalStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    
    def getLocalStorageSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getLocalStorageSize")
    var getLocalStorageSize_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    @JSName("getLocalStorage")
    var getLocalStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getLogTypes(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getLogTypes")
    var getLogTypes_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getLogs(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, js.Array[js.Object]]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
    @JSName("getLogs")
    var getLogs_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ]
    
    def getMockCalls(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
    @JSName("getMockCalls")
    var getMockCalls_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
      ]
    
    def getMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
    @JSName("getMockSensor")
    var getMockSensor_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    
    def getNamedCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Cookie]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
    @JSName("getNamedCookie")
    var getNamedCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
      ]
    
    def getNetworkConditions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getNetworkConditions")
    var getNetworkConditions_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getNetworkConnection(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getNetworkConnection")
    var getNetworkConnection_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    def getOrientation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getOrientation")
    var getOrientation_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getPageIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getPageIndex")
    var getPageIndex_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getPageLogs(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
    @JSName("getPageLogs")
    var getPageLogs_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    
    def getPageSource(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getPageSource")
    var getPageSource_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getPerformanceData(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ]
      ]
    
    def getPerformanceDataTypes(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getPerformanceDataTypes")
    var getPerformanceDataTypes_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    @JSName("getPerformanceData")
    var getPerformanceData_Original: js.Function1[
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
    
    def getSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    
    def getSessionStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    
    def getSessionStorageItem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
    @JSName("getSessionStorageItem")
    var getSessionStorageItem_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* key */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ]
    
    def getSessionStorageSize(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Double]]
    ): js.Promise[ReturnType[js.Function0[Double]]]
    @JSName("getSessionStorageSize")
    var getSessionStorageSize_Original: js.Function1[
        /* args */ Parameters[js.Function0[Double]], 
        js.Promise[ReturnType[js.Function0[Double]]]
      ]
    
    @JSName("getSessionStorage")
    var getSessionStorage_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    @JSName("getSession")
    var getSession_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getSessions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
    @JSName("getSessions")
    var getSessions_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    
    def getSettings(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[SettingsReturn]]
    ): js.Promise[ReturnType[js.Function0[SettingsReturn]]]
    @JSName("getSettings")
    var getSettings_Original: js.Function1[
        /* args */ Parameters[js.Function0[SettingsReturn]], 
        js.Promise[ReturnType[js.Function0[SettingsReturn]]]
      ]
    
    def getStrings(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ]
      ]
    @JSName("getStrings")
    var getStrings_Original: js.Function1[
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
    
    def getSystemBars(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
    @JSName("getSystemBars")
    var getSystemBars_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
        js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ]
    
    def getTimeouts(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Timeouts]]
    ): js.Promise[ReturnType[js.Function0[Timeouts]]]
    @JSName("getTimeouts")
    var getTimeouts_Original: js.Function1[
        /* args */ Parameters[js.Function0[Timeouts]], 
        js.Promise[ReturnType[js.Function0[Timeouts]]]
      ]
    
    def getTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getTitle")
    var getTitle_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getUrl(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getUrl")
    var getUrl_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getWindowHandle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getWindowHandle")
    var getWindowHandle_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getWindowHandles(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getWindowHandles")
    var getWindowHandles_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getWindowPosition(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getWindowPosition")
    var getWindowPosition_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def getWindowRect(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("getWindowRect")
    var getWindowRect_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def gridProxyDetails(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
    @JSName("gridProxyDetails")
    var gridProxyDetails_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
      ]
    
    def gridTestSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
    @JSName("gridTestSession")
    var gridTestSession_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
      ]
    
    def gsmCall(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
    @JSName("gsmCall")
    var gsmCall_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
      ]
    
    def gsmSignal(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ]
      ]
    @JSName("gsmSignal")
    var gsmSignal_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
          ]
        ]
      ]
    
    def gsmVoice(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
    @JSName("gsmVoice")
    var gsmVoice_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    
    def hideKeyboard(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* strategy */ js.UndefOr[String], 
            /* key */ js.UndefOr[String], 
            /* keyCode */ js.UndefOr[String], 
            /* keyName */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): js.Promise[
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
    @JSName("hideKeyboard")
    var hideKeyboard_Original: js.Function1[
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
    
    def installApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appPath */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
    @JSName("installApp")
    var installApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
      ]
    
    def interceptRequest(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* rule */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
    @JSName("interceptRequest")
    var interceptRequest_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
      ]
    
    def isAlertOpen(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isAlertOpen")
    var isAlertOpen_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isAppInstalled(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
    @JSName("isAppInstalled")
    var isAppInstalled_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
      ]
    
    def isAutoReporting(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isAutoReporting")
    var isAutoReporting_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isElementDisplayed(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementDisplayed")
    var isElementDisplayed_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isElementEnabled(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementEnabled")
    var isElementEnabled_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isElementSelected(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementSelected")
    var isElementSelected_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isIMEActivated(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isIMEActivated")
    var isIMEActivated_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isKeyboardShown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isKeyboardShown")
    var isKeyboardShown_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isLoading(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isLoading")
    var isLoading_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def isLocked(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
    ): js.Promise[ReturnType[js.Function0[Boolean]]]
    @JSName("isLocked")
    var isLocked_Original: js.Function1[
        /* args */ Parameters[js.Function0[Boolean]], 
        js.Promise[ReturnType[js.Function0[Boolean]]]
      ]
    
    def jankinessCheck(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("jankinessCheck")
    var jankinessCheck_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def launchApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("launchApp")
    var launchApp_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def launchChromeApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
    @JSName("launchChromeApp")
    var launchChromeApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ]
    
    def lock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
    @JSName("lock")
    var lock_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
      ]
    
    def logEvent(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
    @JSName("logEvent")
    var logEvent_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
      ]
    
    def longPressKeyCode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("longPressKeyCode")
    var longPressKeyCode_Original: js.Function1[
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
    
    def manageSeleniumHubLifecycle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* action */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
    @JSName("manageSeleniumHubLifecycle")
    var manageSeleniumHubLifecycle_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
      ]
    
    def maximizeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("maximizeWindow")
    var maximizeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def minimizeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("minimizeWindow")
    var minimizeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def mockRequest(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ]
      ]
    @JSName("mockRequest")
    var mockRequest_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
          ]
        ]
      ]
    
    def moveToElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("moveToElement")
    var moveToElement_Original: js.Function1[
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
    
    def multiTouchPerform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    @JSName("multiTouchPerform")
    var multiTouchPerform_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    
    def navigateTo(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* url */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
    @JSName("navigateTo")
    var navigateTo_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* url */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
      ]
    
    def newSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]]
    ): js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
    @JSName("newSession")
    var newSession_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
        js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
      ]
    
    def openNotifications(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("openNotifications")
    var openNotifications_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def performActions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    @JSName("performActions")
    var performActions_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    
    def positionClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    @JSName("positionClick")
    var positionClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
        js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ]
    
    def positionDoubleClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("positionDoubleClick")
    var positionDoubleClick_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def powerAC(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
    @JSName("powerAC")
    var powerAC_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ]
    
    def powerCapacity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* percent */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
    @JSName("powerCapacity")
    var powerCapacity_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
      ]
    
    def pressKeyCode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("pressKeyCode")
    var pressKeyCode_Original: js.Function1[
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
    
    def printPage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def pullFile(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
    @JSName("pullFile")
    var pullFile_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
      ]
    
    def pullFolder(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
    @JSName("pullFolder")
    var pullFolder_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
      ]
    
    def pushFile(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* path */ String, /* data */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
    @JSName("pushFile")
    var pushFile_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
      ]
    
    def queryAppState(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Double]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
    @JSName("queryAppState")
    var queryAppState_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Double]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
      ]
    
    def queryGrid(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
    @JSName("queryGrid")
    var queryGrid_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
      ]
    
    def receiveAsyncResponse(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* response */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
    @JSName("receiveAsyncResponse")
    var receiveAsyncResponse_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
      ]
    
    def refresh(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("refresh")
    var refresh_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def releaseActions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("releaseActions")
    var releaseActions_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def removeAllCredentials(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
    @JSName("removeAllCredentials")
    var removeAllCredentials_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    
    def removeApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
    @JSName("removeApp")
    var removeApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    
    def removeCredential(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    @JSName("removeCredential")
    var removeCredential_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    
    def removeVirtualAuthenticator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
    @JSName("removeVirtualAuthenticator")
    var removeVirtualAuthenticator_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    
    def replaceValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    @JSName("replaceValue")
    var replaceValue_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    
    def reset(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("reset")
    var reset_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def respondMock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
    @JSName("respondMock")
    var respondMock_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
      ]
    
    def resume(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("resume")
    var resume_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def rotateDevice(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    @JSName("rotateDevice")
    var rotateDevice_Original: js.Function1[
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
    
    def selectCastSink(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
    @JSName("selectCastSink")
    var selectCastSink_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    
    def sendAlertText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* text */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
    @JSName("sendAlertText")
    var sendAlertText_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ]
    
    def sendCommand(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
    
    def sendCommandAndGetResult(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]
    ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
    @JSName("sendCommandAndGetResult")
    var sendCommandAndGetResult_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
      ]
    
    @JSName("sendCommand")
    var sendCommand_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
      ]
    
    def sendKeyEvent(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
      ]
    @JSName("sendKeyEvent")
    var sendKeyEvent_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
        ]
      ]
    
    def sendKeys(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* value */ js.Array[String], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
    @JSName("sendKeys")
    var sendKeys_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
        js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
      ]
    
    def sendSms(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
    @JSName("sendSms")
    var sendSms_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
      ]
    
    def setAsyncTimeout(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
    @JSName("setAsyncTimeout")
    var setAsyncTimeout_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    
    def setAutoReporting(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]]
    ): js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
    @JSName("setAutoReporting")
    var setAutoReporting_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
      ]
    
    def setClipboard(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ]
      ]
    @JSName("setClipboard")
    var setClipboard_Original: js.Function1[
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
    
    def setGeoLocation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* location */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
    @JSName("setGeoLocation")
    var setGeoLocation_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
      ]
    
    def setImplicitTimeout(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
    @JSName("setImplicitTimeout")
    var setImplicitTimeout_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ]
    
    def setLocalStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
    @JSName("setLocalStorage")
    var setLocalStorage_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    
    def setNetworkConditions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ]
      ]
    @JSName("setNetworkConditions")
    var setNetworkConditions_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
          ]
        ]
      ]
    
    def setNetworkConnection(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* parameters */ js.Object, Double]]
    ): js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
    @JSName("setNetworkConnection")
    var setNetworkConnection_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]], 
        js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
      ]
    
    def setOrientation(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* orientation */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
    @JSName("setOrientation")
    var setOrientation_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
      ]
    
    def setPermissions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ]
      ]
    @JSName("setPermissions")
    var setPermissions_Original: js.Function1[
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
    
    def setSessionStorage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
    @JSName("setSessionStorage")
    var setSessionStorage_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ]
    
    def setTimeZone(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* timeZone */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
    @JSName("setTimeZone")
    var setTimeZone_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
      ]
    
    def setTimeouts(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("setTimeouts")
    var setTimeouts_Original: js.Function1[
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
    
    def setUserVerified(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    @JSName("setUserVerified")
    var setUserVerified_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    
    def setValueImmediate(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    @JSName("setValueImmediate")
    var setValueImmediate_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ]
    
    def setWindowPosition(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
    ): js.Promise[
        ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
      ]
    @JSName("setWindowPosition")
    var setWindowPosition_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
        js.Promise[
          ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
        ]
      ]
    
    def setWindowRect(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* x */ Double | Null, 
            /* y */ Double | Null, 
            /* width */ Double | Null, 
            /* height */ Double | Null, 
            RectReturn
          ]
        ]
    ): js.Promise[
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
    @JSName("setWindowRect")
    var setWindowRect_Original: js.Function1[
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
    
    def shake(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("shake")
    var shake_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def shutdown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("shutdown")
    var shutdown_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def startActivity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def startCastTabMirroring(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
    @JSName("startCastTabMirroring")
    var startCastTabMirroring_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    
    def startRecordingScreen(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
    @JSName("startRecordingScreen")
    var startRecordingScreen_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
      ]
    
    def status(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[StatusReturn]]
    ): js.Promise[ReturnType[js.Function0[StatusReturn]]]
    @JSName("status")
    var status_Original: js.Function1[
        /* args */ Parameters[js.Function0[StatusReturn]], 
        js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ]
    
    def stopCasting(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* sinkName */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
    @JSName("stopCasting")
    var stopCasting_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ]
    
    def stopRecordingScreen(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* remotePath */ js.UndefOr[String], 
            /* username */ js.UndefOr[String], 
            /* password */ js.UndefOr[String], 
            /* method */ js.UndefOr[String], 
            String
          ]
        ]
    ): js.Promise[
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
    @JSName("stopRecordingScreen")
    var stopRecordingScreen_Original: js.Function1[
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
    
    def switchContext(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<MJSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    @JSName("switchContext")
    var switchContext_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    
    def switchToFrame(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
    @JSName("switchToFrame")
    var switchToFrame_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
      ]
    
    def switchToParentFrame(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("switchToParentFrame")
    var switchToParentFrame_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def switchToWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* handle */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
    @JSName("switchToWindow")
    var switchToWindow_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
      ]
    
    def takeElementScreenshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
      ]
    @JSName("takeElementScreenshot")
    var takeElementScreenshot_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ]
      ]
    
    def takeHeapSnapshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("takeHeapSnapshot")
    var takeHeapSnapshot_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def takeScreenshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("takeScreenshot")
    var takeScreenshot_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def terminateApp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* appId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
    @JSName("terminateApp")
    var terminateApp_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* appId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ]
    
    def throttleCPU(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* rate */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
    @JSName("throttleCPU")
    var throttleCPU_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
      ]
    
    def throttleNetwork(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* condition */ String | js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
    @JSName("throttleNetwork")
    var throttleNetwork_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
      ]
    
    def toggleAirplaneMode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleAirplaneMode")
    var toggleAirplaneMode_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def toggleData(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleData")
    var toggleData_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def toggleEnrollTouchId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
    @JSName("toggleEnrollTouchId")
    var toggleEnrollTouchId_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
        js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
      ]
    
    def toggleLocationServices(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleLocationServices")
    var toggleLocationServices_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def toggleNetworkSpeed(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* netspeed */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
    @JSName("toggleNetworkSpeed")
    var toggleNetworkSpeed_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
      ]
    
    def toggleWiFi(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("toggleWiFi")
    var toggleWiFi_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def touchClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    @JSName("touchClick")
    var touchClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    
    def touchDoubleClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    @JSName("touchDoubleClick")
    var touchDoubleClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    
    def touchDown(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    @JSName("touchDown")
    var touchDown_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    
    def touchFlick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def touchId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* match */ Boolean, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
    @JSName("touchId")
    var touchId_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
        js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
      ]
    
    def touchLongClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    @JSName("touchLongClick")
    var touchLongClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ]
    
    def touchMove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    @JSName("touchMove")
    var touchMove_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    
    def touchPerform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    @JSName("touchPerform")
    var touchPerform_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    
    def touchPinch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ChromiumCommands[K]> is not an array type */ args: Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
    ): js.Promise[
        ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
      ]
    @JSName("touchPinch")
    var touchPinch_Original: js.Function1[
        /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
        js.Promise[
          ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
        ]
      ]
    
    def touchScroll(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ]
      ]
    @JSName("touchScroll")
    var touchScroll_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
          ]
        ]
      ]
    
    def touchUp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<JSONWPCommands[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    @JSName("touchUp")
    var touchUp_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
        js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ]
    
    def unlock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("unlock")
    var unlock_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def updateMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* type */ String, 
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ]
    ): js.Promise[
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
    
    def updateSettings(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<AppiumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* settings */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
    @JSName("updateSettings")
    var updateSettings_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
      ]
  }
  object ProtocolCommandsAsync {
    
    inline def apply(
      _getWindowSize: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      _setWindowSize: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]],
      acceptAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      activateApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]],
      activateIME: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]],
      addCookie: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]],
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
        ] => js.Promise[
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
        ] => js.Promise[
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
        ],
      assertPerformance: /* args */ Parameters[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* name */ String, 
              /* metrics */ js.UndefOr[js.Array[String]], 
              ProtocolCommandResponse
            ]
          ]
        ],
      back: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      background: /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]],
      buttonDown: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
      buttonUp: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
      clearLocalStorage: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      clearMockCalls: /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]] => js.Promise[
          ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
        ],
      clearSessionStorage: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      closeApp: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      closeWindow: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      compareImages: /* args */ Parameters[
          js.Function4[
            /* mode */ String, 
            /* firstImage */ String, 
            /* secondImage */ String, 
            /* options */ js.Object, 
            ProtocolCommandResponse
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* mode */ String, 
              /* firstImage */ String, 
              /* secondImage */ String, 
              /* options */ js.Object, 
              ProtocolCommandResponse
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
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* mockSensorType */ String, 
              /* maxSamplingFrequency */ Double, 
              /* minSamplingFrequency */ Double, 
              Unit
            ]
          ]
        ],
      createWindow: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]],
      deactivateIME: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteAllCookies: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteCookie: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
      deleteLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]],
      deleteMockSensor: /* args */ Parameters[js.Function1[/* type */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]],
      deleteNetworkConditions: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteSession: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]],
      dismissAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      driverScript: /* args */ Parameters[
          js.Function3[
            /* script */ String, 
            /* type */ js.UndefOr[String], 
            /* timeout */ js.UndefOr[Double], 
            ProtocolCommandResponse
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* script */ String, 
              /* type */ js.UndefOr[String], 
              /* timeout */ js.UndefOr[Double], 
              ProtocolCommandResponse
            ]
          ]
        ],
      elementClear: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      elementClick: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      elementEquals: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
        ],
      elementHover: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      elementSendKeys: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]],
      elementSubmit: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      endCoverage: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]],
      executeAsyncScript: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
            ]
          ]
        ],
      executeScript: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
            ]
          ]
        ],
      file: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]],
      findElement: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ],
      findElementFromElement: /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
          ]
        ],
      findElementFromShadowRoot: /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
          ]
        ],
      findElements: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ],
      findElementsFromElement: /* args */ Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* elementId */ String, 
              /* using */ String, 
              /* value */ String, 
              js.Array[ElementReference]
            ]
          ]
        ],
      findElementsFromShadowRoot: /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
          ]
        ],
      fingerPrint: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]],
      forward: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      freeze: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      fullscreenWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      generateTestReport: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]],
      getActiveElement: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getActiveEngine: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getAlertText: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getAllCookies: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]],
      getApplicationCacheStatus: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getAvailableEngines: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getCastIssueMessage: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getCastSinks: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getClipboard: /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]] => js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]],
      getContext: /* args */ Parameters[js.Function0[Context]] => js.Promise[ReturnType[js.Function0[Context]]],
      getContexts: /* args */ Parameters[js.Function0[js.Array[Context]]] => js.Promise[ReturnType[js.Function0[js.Array[Context]]]],
      getCredentials: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]],
      getCurrentActivity: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getCurrentPackage: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getDeviceTime: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getDisplayDensity: /* args */ Parameters[js.Function0[Any]] => js.Promise[ReturnType[js.Function0[Any]]],
      getElementAttribute: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]],
      getElementCSSValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ],
      getElementComputedLabel: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementComputedRole: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementLocation: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
      getElementLocationInView: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
      getElementProperty: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]],
      getElementRect: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]],
      getElementShadowRoot: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementSize: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
      getElementTagName: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementText: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementValue: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]],
      getEvents: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]],
      getGeoLocation: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getHubConfig: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getLocalStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]],
      getLocalStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getLogTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getLogs: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]],
      getMockCalls: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]],
      getMockSensor: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]],
      getNamedCookie: /* args */ Parameters[js.Function1[/* name */ String, Cookie]] => js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]],
      getNetworkConditions: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getNetworkConnection: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getOrientation: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getPageIndex: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getPageLogs: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]],
      getPageSource: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getPerformanceData: /* args */ Parameters[
          js.Function3[
            /* packageName */ String, 
            /* dataType */ String, 
            /* dataReadTimeout */ js.UndefOr[Double], 
            js.Array[String]
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* packageName */ String, 
              /* dataType */ String, 
              /* dataReadTimeout */ js.UndefOr[Double], 
              js.Array[String]
            ]
          ]
        ],
      getPerformanceDataTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getSession: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getSessionStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]],
      getSessionStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
      getSessions: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]],
      getSettings: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Promise[ReturnType[js.Function0[SettingsReturn]]],
      getStrings: /* args */ Parameters[
          js.Function2[
            /* language */ js.UndefOr[String], 
            /* stringFile */ js.UndefOr[String], 
            StringsReturn
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* language */ js.UndefOr[String], 
              /* stringFile */ js.UndefOr[String], 
              StringsReturn
            ]
          ]
        ],
      getSystemBars: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]],
      getTimeouts: /* args */ Parameters[js.Function0[Timeouts]] => js.Promise[ReturnType[js.Function0[Timeouts]]],
      getTitle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getUrl: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getWindowHandle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getWindowHandles: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getWindowPosition: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      getWindowRect: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      gridProxyDetails: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]],
      gridTestSession: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]],
      gsmCall: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]],
      gsmSignal: /* args */ Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
          ]
        ],
      gsmVoice: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]],
      hideKeyboard: /* args */ Parameters[
          js.Function4[
            /* strategy */ js.UndefOr[String], 
            /* key */ js.UndefOr[String], 
            /* keyCode */ js.UndefOr[String], 
            /* keyName */ js.UndefOr[String], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* strategy */ js.UndefOr[String], 
              /* key */ js.UndefOr[String], 
              /* keyCode */ js.UndefOr[String], 
              /* keyName */ js.UndefOr[String], 
              Unit
            ]
          ]
        ],
      installApp: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]],
      interceptRequest: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]],
      isAlertOpen: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isAppInstalled: /* args */ Parameters[js.Function1[/* appId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]],
      isAutoReporting: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isElementDisplayed: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isElementEnabled: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isElementSelected: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isIMEActivated: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isKeyboardShown: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isLoading: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      isLocked: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
      jankinessCheck: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      launchApp: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      launchChromeApp: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]],
      lock: /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]],
      logEvent: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]],
      longPressKeyCode: /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
      manageSeleniumHubLifecycle: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]],
      maximizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      minimizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      mockRequest: /* args */ Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
          ]
        ],
      moveToElement: /* args */ Parameters[
          js.Function3[
            /* element */ js.UndefOr[String | Null], 
            /* xoffset */ js.UndefOr[Double], 
            /* yoffset */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* element */ js.UndefOr[String | Null], 
              /* xoffset */ js.UndefOr[Double], 
              /* yoffset */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
      multiTouchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
      navigateTo: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Promise[ReturnType[js.Function1[/* url */ String, String]]],
      newSession: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]],
      openNotifications: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      performActions: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
      positionClick: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
      positionDoubleClick: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      powerAC: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]],
      powerCapacity: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]],
      pressKeyCode: /* args */ Parameters[
          js.Function3[
            /* keycode */ Double, 
            /* metastate */ js.UndefOr[Double], 
            /* flags */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* keycode */ Double, 
              /* metastate */ js.UndefOr[Double], 
              /* flags */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
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
        ] => js.Promise[
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
        ],
      pullFile: /* args */ Parameters[js.Function1[/* path */ String, String]] => js.Promise[ReturnType[js.Function1[/* path */ String, String]]],
      pullFolder: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]],
      pushFile: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]],
      queryAppState: /* args */ Parameters[js.Function1[/* appId */ String, Double]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]],
      queryGrid: /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]],
      receiveAsyncResponse: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]],
      refresh: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      releaseActions: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      removeAllCredentials: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]],
      removeApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]],
      removeCredential: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ],
      removeVirtualAuthenticator: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]],
      replaceValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]],
      reset: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      respondMock: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]],
      resume: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      rotateDevice: /* args */ Parameters[
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
        ] => js.Promise[
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
        ],
      selectCastSink: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]],
      sendAlertText: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]],
      sendCommand: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]],
      sendCommandAndGetResult: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]],
      sendKeyEvent: /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]] => js.Promise[
          ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
        ],
      sendKeys: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]],
      sendSms: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]],
      setAsyncTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]],
      setAutoReporting: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]],
      setClipboard: /* args */ Parameters[
          js.Function3[
            /* content */ String, 
            /* contentType */ js.UndefOr[String], 
            /* label */ js.UndefOr[String], 
            String
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* content */ String, 
              /* contentType */ js.UndefOr[String], 
              /* label */ js.UndefOr[String], 
              String
            ]
          ]
        ],
      setGeoLocation: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]],
      setImplicitTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]],
      setLocalStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]],
      setNetworkConditions: /* args */ Parameters[
          js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
          ]
        ],
      setNetworkConnection: /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]] => js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]],
      setOrientation: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]],
      setPermissions: /* args */ Parameters[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* descriptor */ js.Object, 
              /* state */ String, 
              /* oneRealm */ js.UndefOr[Boolean], 
              Unit
            ]
          ]
        ],
      setSessionStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]],
      setTimeZone: /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]],
      setTimeouts: /* args */ Parameters[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* implicit */ js.UndefOr[Double], 
              /* pageLoad */ js.UndefOr[Double], 
              /* script */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
      setUserVerified: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ],
      setValueImmediate: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]],
      setWindowPosition: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Promise[
          ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
        ],
      setWindowRect: /* args */ Parameters[
          js.Function4[
            /* x */ Double | Null, 
            /* y */ Double | Null, 
            /* width */ Double | Null, 
            /* height */ Double | Null, 
            RectReturn
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* x */ Double | Null, 
              /* y */ Double | Null, 
              /* width */ Double | Null, 
              /* height */ Double | Null, 
              RectReturn
            ]
          ]
        ],
      shake: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      shutdown: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
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
        ] => js.Promise[
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
        ],
      startCastTabMirroring: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]],
      startRecordingScreen: /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]],
      status: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]],
      stopCasting: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]],
      stopRecordingScreen: /* args */ Parameters[
          js.Function4[
            /* remotePath */ js.UndefOr[String], 
            /* username */ js.UndefOr[String], 
            /* password */ js.UndefOr[String], 
            /* method */ js.UndefOr[String], 
            String
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* remotePath */ js.UndefOr[String], 
              /* username */ js.UndefOr[String], 
              /* password */ js.UndefOr[String], 
              /* method */ js.UndefOr[String], 
              String
            ]
          ]
        ],
      switchContext: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
      switchToFrame: /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]],
      switchToParentFrame: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      switchToWindow: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]],
      takeElementScreenshot: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ],
      takeHeapSnapshot: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      takeScreenshot: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      terminateApp: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]],
      throttleCPU: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]],
      throttleNetwork: /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]],
      toggleAirplaneMode: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      toggleData: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      toggleEnrollTouchId: /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] => js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]],
      toggleLocationServices: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      toggleNetworkSpeed: /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]],
      toggleWiFi: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      touchClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
      touchDoubleClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
      touchDown: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
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
        ] => js.Promise[
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
        ],
      touchId: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]],
      touchLongClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
      touchMove: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
      touchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
      touchPinch: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Promise[
          ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
        ],
      touchScroll: /* args */ Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
          ]
        ],
      touchUp: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
      unlock: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      updateMockSensor: /* args */ Parameters[
          js.Function4[
            /* type */ String, 
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* type */ String, 
              /* mockSensorType */ String, 
              /* maxSamplingFrequency */ Double, 
              /* minSamplingFrequency */ Double, 
              Unit
            ]
          ]
        ],
      updateSettings: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
    ): ProtocolCommandsAsync = {
      val __obj = js.Dynamic.literal(_getWindowSize = js.Any.fromFunction1(_getWindowSize), _setWindowSize = js.Any.fromFunction1(_setWindowSize), acceptAlert = js.Any.fromFunction1(acceptAlert), activateApp = js.Any.fromFunction1(activateApp), activateIME = js.Any.fromFunction1(activateIME), addCookie = js.Any.fromFunction1(addCookie), addCredential = js.Any.fromFunction1(addCredential), addVirtualAuthenticator = js.Any.fromFunction1(addVirtualAuthenticator), assertPerformance = js.Any.fromFunction1(assertPerformance), back = js.Any.fromFunction1(back), background = js.Any.fromFunction1(background), buttonDown = js.Any.fromFunction1(buttonDown), buttonUp = js.Any.fromFunction1(buttonUp), clearLocalStorage = js.Any.fromFunction1(clearLocalStorage), clearMockCalls = js.Any.fromFunction1(clearMockCalls), clearSessionStorage = js.Any.fromFunction1(clearSessionStorage), closeApp = js.Any.fromFunction1(closeApp), closeWindow = js.Any.fromFunction1(closeWindow), compareImages = js.Any.fromFunction1(compareImages), createMockSensor = js.Any.fromFunction1(createMockSensor), createWindow = js.Any.fromFunction1(createWindow), deactivateIME = js.Any.fromFunction1(deactivateIME), deleteAllCookies = js.Any.fromFunction1(deleteAllCookies), deleteCookie = js.Any.fromFunction1(deleteCookie), deleteLocalStorageItem = js.Any.fromFunction1(deleteLocalStorageItem), deleteMockSensor = js.Any.fromFunction1(deleteMockSensor), deleteNetworkConditions = js.Any.fromFunction1(deleteNetworkConditions), deleteSession = js.Any.fromFunction1(deleteSession), deleteSessionStorageItem = js.Any.fromFunction1(deleteSessionStorageItem), dismissAlert = js.Any.fromFunction1(dismissAlert), driverScript = js.Any.fromFunction1(driverScript), elementClear = js.Any.fromFunction1(elementClear), elementClick = js.Any.fromFunction1(elementClick), elementEquals = js.Any.fromFunction1(elementEquals), elementHover = js.Any.fromFunction1(elementHover), elementSendKeys = js.Any.fromFunction1(elementSendKeys), elementSubmit = js.Any.fromFunction1(elementSubmit), endCoverage = js.Any.fromFunction1(endCoverage), executeAsyncScript = js.Any.fromFunction1(executeAsyncScript), executeScript = js.Any.fromFunction1(executeScript), file = js.Any.fromFunction1(file), findElement = js.Any.fromFunction1(findElement), findElementFromElement = js.Any.fromFunction1(findElementFromElement), findElementFromShadowRoot = js.Any.fromFunction1(findElementFromShadowRoot), findElements = js.Any.fromFunction1(findElements), findElementsFromElement = js.Any.fromFunction1(findElementsFromElement), findElementsFromShadowRoot = js.Any.fromFunction1(findElementsFromShadowRoot), fingerPrint = js.Any.fromFunction1(fingerPrint), forward = js.Any.fromFunction1(forward), freeze = js.Any.fromFunction1(freeze), fullscreenWindow = js.Any.fromFunction1(fullscreenWindow), generateTestReport = js.Any.fromFunction1(generateTestReport), getActiveElement = js.Any.fromFunction1(getActiveElement), getActiveEngine = js.Any.fromFunction1(getActiveEngine), getAlertText = js.Any.fromFunction1(getAlertText), getAllCookies = js.Any.fromFunction1(getAllCookies), getApplicationCacheStatus = js.Any.fromFunction1(getApplicationCacheStatus), getAvailableEngines = js.Any.fromFunction1(getAvailableEngines), getCastIssueMessage = js.Any.fromFunction1(getCastIssueMessage), getCastSinks = js.Any.fromFunction1(getCastSinks), getClipboard = js.Any.fromFunction1(getClipboard), getContext = js.Any.fromFunction1(getContext), getContexts = js.Any.fromFunction1(getContexts), getCredentials = js.Any.fromFunction1(getCredentials), getCurrentActivity = js.Any.fromFunction1(getCurrentActivity), getCurrentPackage = js.Any.fromFunction1(getCurrentPackage), getDeviceTime = js.Any.fromFunction1(getDeviceTime), getDisplayDensity = js.Any.fromFunction1(getDisplayDensity), getElementAttribute = js.Any.fromFunction1(getElementAttribute), getElementCSSValue = js.Any.fromFunction1(getElementCSSValue), getElementComputedLabel = js.Any.fromFunction1(getElementComputedLabel), getElementComputedRole = js.Any.fromFunction1(getElementComputedRole), getElementLocation = js.Any.fromFunction1(getElementLocation), getElementLocationInView = js.Any.fromFunction1(getElementLocationInView), getElementProperty = js.Any.fromFunction1(getElementProperty), getElementRect = js.Any.fromFunction1(getElementRect), getElementShadowRoot = js.Any.fromFunction1(getElementShadowRoot), getElementSize = js.Any.fromFunction1(getElementSize), getElementTagName = js.Any.fromFunction1(getElementTagName), getElementText = js.Any.fromFunction1(getElementText), getElementValue = js.Any.fromFunction1(getElementValue), getEvents = js.Any.fromFunction1(getEvents), getGeoLocation = js.Any.fromFunction1(getGeoLocation), getHubConfig = js.Any.fromFunction1(getHubConfig), getLocalStorage = js.Any.fromFunction1(getLocalStorage), getLocalStorageItem = js.Any.fromFunction1(getLocalStorageItem), getLocalStorageSize = js.Any.fromFunction1(getLocalStorageSize), getLogTypes = js.Any.fromFunction1(getLogTypes), getLogs = js.Any.fromFunction1(getLogs), getMockCalls = js.Any.fromFunction1(getMockCalls), getMockSensor = js.Any.fromFunction1(getMockSensor), getNamedCookie = js.Any.fromFunction1(getNamedCookie), getNetworkConditions = js.Any.fromFunction1(getNetworkConditions), getNetworkConnection = js.Any.fromFunction1(getNetworkConnection), getOrientation = js.Any.fromFunction1(getOrientation), getPageIndex = js.Any.fromFunction1(getPageIndex), getPageLogs = js.Any.fromFunction1(getPageLogs), getPageSource = js.Any.fromFunction1(getPageSource), getPerformanceData = js.Any.fromFunction1(getPerformanceData), getPerformanceDataTypes = js.Any.fromFunction1(getPerformanceDataTypes), getSession = js.Any.fromFunction1(getSession), getSessionStorage = js.Any.fromFunction1(getSessionStorage), getSessionStorageItem = js.Any.fromFunction1(getSessionStorageItem), getSessionStorageSize = js.Any.fromFunction1(getSessionStorageSize), getSessions = js.Any.fromFunction1(getSessions), getSettings = js.Any.fromFunction1(getSettings), getStrings = js.Any.fromFunction1(getStrings), getSystemBars = js.Any.fromFunction1(getSystemBars), getTimeouts = js.Any.fromFunction1(getTimeouts), getTitle = js.Any.fromFunction1(getTitle), getUrl = js.Any.fromFunction1(getUrl), getWindowHandle = js.Any.fromFunction1(getWindowHandle), getWindowHandles = js.Any.fromFunction1(getWindowHandles), getWindowPosition = js.Any.fromFunction1(getWindowPosition), getWindowRect = js.Any.fromFunction1(getWindowRect), gridProxyDetails = js.Any.fromFunction1(gridProxyDetails), gridTestSession = js.Any.fromFunction1(gridTestSession), gsmCall = js.Any.fromFunction1(gsmCall), gsmSignal = js.Any.fromFunction1(gsmSignal), gsmVoice = js.Any.fromFunction1(gsmVoice), hideKeyboard = js.Any.fromFunction1(hideKeyboard), installApp = js.Any.fromFunction1(installApp), interceptRequest = js.Any.fromFunction1(interceptRequest), isAlertOpen = js.Any.fromFunction1(isAlertOpen), isAppInstalled = js.Any.fromFunction1(isAppInstalled), isAutoReporting = js.Any.fromFunction1(isAutoReporting), isElementDisplayed = js.Any.fromFunction1(isElementDisplayed), isElementEnabled = js.Any.fromFunction1(isElementEnabled), isElementSelected = js.Any.fromFunction1(isElementSelected), isIMEActivated = js.Any.fromFunction1(isIMEActivated), isKeyboardShown = js.Any.fromFunction1(isKeyboardShown), isLoading = js.Any.fromFunction1(isLoading), isLocked = js.Any.fromFunction1(isLocked), jankinessCheck = js.Any.fromFunction1(jankinessCheck), launchApp = js.Any.fromFunction1(launchApp), launchChromeApp = js.Any.fromFunction1(launchChromeApp), lock = js.Any.fromFunction1(lock), logEvent = js.Any.fromFunction1(logEvent), longPressKeyCode = js.Any.fromFunction1(longPressKeyCode), manageSeleniumHubLifecycle = js.Any.fromFunction1(manageSeleniumHubLifecycle), maximizeWindow = js.Any.fromFunction1(maximizeWindow), minimizeWindow = js.Any.fromFunction1(minimizeWindow), mockRequest = js.Any.fromFunction1(mockRequest), moveToElement = js.Any.fromFunction1(moveToElement), multiTouchPerform = js.Any.fromFunction1(multiTouchPerform), navigateTo = js.Any.fromFunction1(navigateTo), newSession = js.Any.fromFunction1(newSession), openNotifications = js.Any.fromFunction1(openNotifications), performActions = js.Any.fromFunction1(performActions), positionClick = js.Any.fromFunction1(positionClick), positionDoubleClick = js.Any.fromFunction1(positionDoubleClick), powerAC = js.Any.fromFunction1(powerAC), powerCapacity = js.Any.fromFunction1(powerCapacity), pressKeyCode = js.Any.fromFunction1(pressKeyCode), printPage = js.Any.fromFunction1(printPage), pullFile = js.Any.fromFunction1(pullFile), pullFolder = js.Any.fromFunction1(pullFolder), pushFile = js.Any.fromFunction1(pushFile), queryAppState = js.Any.fromFunction1(queryAppState), queryGrid = js.Any.fromFunction1(queryGrid), receiveAsyncResponse = js.Any.fromFunction1(receiveAsyncResponse), refresh = js.Any.fromFunction1(refresh), releaseActions = js.Any.fromFunction1(releaseActions), removeAllCredentials = js.Any.fromFunction1(removeAllCredentials), removeApp = js.Any.fromFunction1(removeApp), removeCredential = js.Any.fromFunction1(removeCredential), removeVirtualAuthenticator = js.Any.fromFunction1(removeVirtualAuthenticator), replaceValue = js.Any.fromFunction1(replaceValue), reset = js.Any.fromFunction1(reset), respondMock = js.Any.fromFunction1(respondMock), resume = js.Any.fromFunction1(resume), rotateDevice = js.Any.fromFunction1(rotateDevice), selectCastSink = js.Any.fromFunction1(selectCastSink), sendAlertText = js.Any.fromFunction1(sendAlertText), sendCommand = js.Any.fromFunction1(sendCommand), sendCommandAndGetResult = js.Any.fromFunction1(sendCommandAndGetResult), sendKeyEvent = js.Any.fromFunction1(sendKeyEvent), sendKeys = js.Any.fromFunction1(sendKeys), sendSms = js.Any.fromFunction1(sendSms), setAsyncTimeout = js.Any.fromFunction1(setAsyncTimeout), setAutoReporting = js.Any.fromFunction1(setAutoReporting), setClipboard = js.Any.fromFunction1(setClipboard), setGeoLocation = js.Any.fromFunction1(setGeoLocation), setImplicitTimeout = js.Any.fromFunction1(setImplicitTimeout), setLocalStorage = js.Any.fromFunction1(setLocalStorage), setNetworkConditions = js.Any.fromFunction1(setNetworkConditions), setNetworkConnection = js.Any.fromFunction1(setNetworkConnection), setOrientation = js.Any.fromFunction1(setOrientation), setPermissions = js.Any.fromFunction1(setPermissions), setSessionStorage = js.Any.fromFunction1(setSessionStorage), setTimeZone = js.Any.fromFunction1(setTimeZone), setTimeouts = js.Any.fromFunction1(setTimeouts), setUserVerified = js.Any.fromFunction1(setUserVerified), setValueImmediate = js.Any.fromFunction1(setValueImmediate), setWindowPosition = js.Any.fromFunction1(setWindowPosition), setWindowRect = js.Any.fromFunction1(setWindowRect), shake = js.Any.fromFunction1(shake), shutdown = js.Any.fromFunction1(shutdown), startActivity = js.Any.fromFunction1(startActivity), startCastTabMirroring = js.Any.fromFunction1(startCastTabMirroring), startRecordingScreen = js.Any.fromFunction1(startRecordingScreen), status = js.Any.fromFunction1(status), stopCasting = js.Any.fromFunction1(stopCasting), stopRecordingScreen = js.Any.fromFunction1(stopRecordingScreen), switchContext = js.Any.fromFunction1(switchContext), switchToFrame = js.Any.fromFunction1(switchToFrame), switchToParentFrame = js.Any.fromFunction1(switchToParentFrame), switchToWindow = js.Any.fromFunction1(switchToWindow), takeElementScreenshot = js.Any.fromFunction1(takeElementScreenshot), takeHeapSnapshot = js.Any.fromFunction1(takeHeapSnapshot), takeScreenshot = js.Any.fromFunction1(takeScreenshot), terminateApp = js.Any.fromFunction1(terminateApp), throttleCPU = js.Any.fromFunction1(throttleCPU), throttleNetwork = js.Any.fromFunction1(throttleNetwork), toggleAirplaneMode = js.Any.fromFunction1(toggleAirplaneMode), toggleData = js.Any.fromFunction1(toggleData), toggleEnrollTouchId = js.Any.fromFunction1(toggleEnrollTouchId), toggleLocationServices = js.Any.fromFunction1(toggleLocationServices), toggleNetworkSpeed = js.Any.fromFunction1(toggleNetworkSpeed), toggleWiFi = js.Any.fromFunction1(toggleWiFi), touchClick = js.Any.fromFunction1(touchClick), touchDoubleClick = js.Any.fromFunction1(touchDoubleClick), touchDown = js.Any.fromFunction1(touchDown), touchFlick = js.Any.fromFunction1(touchFlick), touchId = js.Any.fromFunction1(touchId), touchLongClick = js.Any.fromFunction1(touchLongClick), touchMove = js.Any.fromFunction1(touchMove), touchPerform = js.Any.fromFunction1(touchPerform), touchPinch = js.Any.fromFunction1(touchPinch), touchScroll = js.Any.fromFunction1(touchScroll), touchUp = js.Any.fromFunction1(touchUp), unlock = js.Any.fromFunction1(unlock), updateMockSensor = js.Any.fromFunction1(updateMockSensor), updateSettings = js.Any.fromFunction1(updateSettings))
      __obj.asInstanceOf[ProtocolCommandsAsync]
    }
    
    extension [Self <: ProtocolCommandsAsync](x: Self) {
      
      inline def setAcceptAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "acceptAlert", js.Any.fromFunction1(value))
      
      inline def setActivateApp(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ): Self = StObject.set(x, "activateApp", js.Any.fromFunction1(value))
      
      inline def setActivateIME(
        value: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
      ): Self = StObject.set(x, "activateIME", js.Any.fromFunction1(value))
      
      inline def setAddCookie(
        value: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
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
            ] => js.Promise[
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "addVirtualAuthenticator", js.Any.fromFunction1(value))
      
      inline def setAssertPerformance(
        value: /* args */ Parameters[
              js.Function2[
                /* name */ String, 
                /* metrics */ js.UndefOr[js.Array[String]], 
                ProtocolCommandResponse
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* name */ String, 
                  /* metrics */ js.UndefOr[js.Array[String]], 
                  ProtocolCommandResponse
                ]
              ]
            ]
      ): Self = StObject.set(x, "assertPerformance", js.Any.fromFunction1(value))
      
      inline def setBack(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
      
      inline def setBackground(
        value: /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
      ): Self = StObject.set(x, "background", js.Any.fromFunction1(value))
      
      inline def setButtonDown(
        value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "buttonDown", js.Any.fromFunction1(value))
      
      inline def setButtonUp(
        value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "buttonUp", js.Any.fromFunction1(value))
      
      inline def setClearLocalStorage(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "clearLocalStorage", js.Any.fromFunction1(value))
      
      inline def setClearMockCalls(
        value: /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]] => js.Promise[
              ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
            ]
      ): Self = StObject.set(x, "clearMockCalls", js.Any.fromFunction1(value))
      
      inline def setClearSessionStorage(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "clearSessionStorage", js.Any.fromFunction1(value))
      
      inline def setCloseApp(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "closeApp", js.Any.fromFunction1(value))
      
      inline def setCloseWindow(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "closeWindow", js.Any.fromFunction1(value))
      
      inline def setCompareImages(
        value: /* args */ Parameters[
              js.Function4[
                /* mode */ String, 
                /* firstImage */ String, 
                /* secondImage */ String, 
                /* options */ js.Object, 
                ProtocolCommandResponse
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "compareImages", js.Any.fromFunction1(value))
      
      inline def setCreateMockSensor(
        value: /* args */ Parameters[
              js.Function3[
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "createMockSensor", js.Any.fromFunction1(value))
      
      inline def setCreateWindow(
        value: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
      ): Self = StObject.set(x, "createWindow", js.Any.fromFunction1(value))
      
      inline def setDeactivateIME(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deactivateIME", js.Any.fromFunction1(value))
      
      inline def setDeleteAllCookies(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteAllCookies", js.Any.fromFunction1(value))
      
      inline def setDeleteCookie(
        value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ): Self = StObject.set(x, "deleteCookie", js.Any.fromFunction1(value))
      
      inline def setDeleteLocalStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ): Self = StObject.set(x, "deleteLocalStorageItem", js.Any.fromFunction1(value))
      
      inline def setDeleteMockSensor(
        value: /* args */ Parameters[js.Function1[/* type */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
      ): Self = StObject.set(x, "deleteMockSensor", js.Any.fromFunction1(value))
      
      inline def setDeleteNetworkConditions(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteNetworkConditions", js.Any.fromFunction1(value))
      
      inline def setDeleteSession(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
      
      inline def setDeleteSessionStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
      ): Self = StObject.set(x, "deleteSessionStorageItem", js.Any.fromFunction1(value))
      
      inline def setDismissAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "dismissAlert", js.Any.fromFunction1(value))
      
      inline def setDriverScript(
        value: /* args */ Parameters[
              js.Function3[
                /* script */ String, 
                /* type */ js.UndefOr[String], 
                /* timeout */ js.UndefOr[Double], 
                ProtocolCommandResponse
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* script */ String, 
                  /* type */ js.UndefOr[String], 
                  /* timeout */ js.UndefOr[Double], 
                  ProtocolCommandResponse
                ]
              ]
            ]
      ): Self = StObject.set(x, "driverScript", js.Any.fromFunction1(value))
      
      inline def setElementClear(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementClear", js.Any.fromFunction1(value))
      
      inline def setElementClick(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementClick", js.Any.fromFunction1(value))
      
      inline def setElementEquals(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
            ]
      ): Self = StObject.set(x, "elementEquals", js.Any.fromFunction1(value))
      
      inline def setElementHover(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementHover", js.Any.fromFunction1(value))
      
      inline def setElementSendKeys(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
      ): Self = StObject.set(x, "elementSendKeys", js.Any.fromFunction1(value))
      
      inline def setElementSubmit(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementSubmit", js.Any.fromFunction1(value))
      
      inline def setEndCoverage(
        value: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
      ): Self = StObject.set(x, "endCoverage", js.Any.fromFunction1(value))
      
      inline def setExecuteAsyncScript(
        value: /* args */ Parameters[
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
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
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
                ]
              ]
            ]
      ): Self = StObject.set(x, "executeScript", js.Any.fromFunction1(value))
      
      inline def setFile(
        value: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
      
      inline def setFindElement(
        value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
            ]
      ): Self = StObject.set(x, "findElement", js.Any.fromFunction1(value))
      
      inline def setFindElementFromElement(
        value: /* args */ Parameters[
              js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
              ]
            ]
      ): Self = StObject.set(x, "findElementFromElement", js.Any.fromFunction1(value))
      
      inline def setFindElementFromShadowRoot(
        value: /* args */ Parameters[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
              ]
            ]
      ): Self = StObject.set(x, "findElementFromShadowRoot", js.Any.fromFunction1(value))
      
      inline def setFindElements(
        value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
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
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* elementId */ String, 
                  /* using */ String, 
                  /* value */ String, 
                  js.Array[ElementReference]
                ]
              ]
            ]
      ): Self = StObject.set(x, "findElementsFromElement", js.Any.fromFunction1(value))
      
      inline def setFindElementsFromShadowRoot(
        value: /* args */ Parameters[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
              ]
            ]
      ): Self = StObject.set(x, "findElementsFromShadowRoot", js.Any.fromFunction1(value))
      
      inline def setFingerPrint(
        value: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
      ): Self = StObject.set(x, "fingerPrint", js.Any.fromFunction1(value))
      
      inline def setForward(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
      
      inline def setFreeze(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "freeze", js.Any.fromFunction1(value))
      
      inline def setFullscreenWindow(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "fullscreenWindow", js.Any.fromFunction1(value))
      
      inline def setGenerateTestReport(
        value: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
      ): Self = StObject.set(x, "generateTestReport", js.Any.fromFunction1(value))
      
      inline def setGetActiveElement(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
      
      inline def setGetActiveEngine(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getActiveEngine", js.Any.fromFunction1(value))
      
      inline def setGetAlertText(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getAlertText", js.Any.fromFunction1(value))
      
      inline def setGetAllCookies(
        value: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ): Self = StObject.set(x, "getAllCookies", js.Any.fromFunction1(value))
      
      inline def setGetApplicationCacheStatus(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getApplicationCacheStatus", js.Any.fromFunction1(value))
      
      inline def setGetAvailableEngines(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getAvailableEngines", js.Any.fromFunction1(value))
      
      inline def setGetCastIssueMessage(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCastIssueMessage", js.Any.fromFunction1(value))
      
      inline def setGetCastSinks(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getCastSinks", js.Any.fromFunction1(value))
      
      inline def setGetClipboard(
        value: /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]] => js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
      ): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
      
      inline def setGetContext(
        value: /* args */ Parameters[js.Function0[Context]] => js.Promise[ReturnType[js.Function0[Context]]]
      ): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      inline def setGetContexts(
        value: /* args */ Parameters[js.Function0[js.Array[Context]]] => js.Promise[ReturnType[js.Function0[js.Array[Context]]]]
      ): Self = StObject.set(x, "getContexts", js.Any.fromFunction1(value))
      
      inline def setGetCredentials(
        value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ): Self = StObject.set(x, "getCredentials", js.Any.fromFunction1(value))
      
      inline def setGetCurrentActivity(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCurrentActivity", js.Any.fromFunction1(value))
      
      inline def setGetCurrentPackage(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCurrentPackage", js.Any.fromFunction1(value))
      
      inline def setGetDeviceTime(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getDeviceTime", js.Any.fromFunction1(value))
      
      inline def setGetDisplayDensity(value: /* args */ Parameters[js.Function0[Any]] => js.Promise[ReturnType[js.Function0[Any]]]): Self = StObject.set(x, "getDisplayDensity", js.Any.fromFunction1(value))
      
      inline def setGetElementAttribute(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ): Self = StObject.set(x, "getElementAttribute", js.Any.fromFunction1(value))
      
      inline def setGetElementCSSValue(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
            ]
      ): Self = StObject.set(x, "getElementCSSValue", js.Any.fromFunction1(value))
      
      inline def setGetElementComputedLabel(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementComputedLabel", js.Any.fromFunction1(value))
      
      inline def setGetElementComputedRole(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementComputedRole", js.Any.fromFunction1(value))
      
      inline def setGetElementLocation(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getElementLocation", js.Any.fromFunction1(value))
      
      inline def setGetElementLocationInView(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getElementLocationInView", js.Any.fromFunction1(value))
      
      inline def setGetElementProperty(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ): Self = StObject.set(x, "getElementProperty", js.Any.fromFunction1(value))
      
      inline def setGetElementRect(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
      ): Self = StObject.set(x, "getElementRect", js.Any.fromFunction1(value))
      
      inline def setGetElementShadowRoot(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementShadowRoot", js.Any.fromFunction1(value))
      
      inline def setGetElementSize(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
      
      inline def setGetElementTagName(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementTagName", js.Any.fromFunction1(value))
      
      inline def setGetElementText(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementText", js.Any.fromFunction1(value))
      
      inline def setGetElementValue(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
      ): Self = StObject.set(x, "getElementValue", js.Any.fromFunction1(value))
      
      inline def setGetEvents(
        value: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getEvents", js.Any.fromFunction1(value))
      
      inline def setGetGeoLocation(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getGeoLocation", js.Any.fromFunction1(value))
      
      inline def setGetHubConfig(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getHubConfig", js.Any.fromFunction1(value))
      
      inline def setGetLocalStorage(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getLocalStorage", js.Any.fromFunction1(value))
      
      inline def setGetLocalStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ): Self = StObject.set(x, "getLocalStorageItem", js.Any.fromFunction1(value))
      
      inline def setGetLocalStorageSize(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getLocalStorageSize", js.Any.fromFunction1(value))
      
      inline def setGetLogTypes(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getLogTypes", js.Any.fromFunction1(value))
      
      inline def setGetLogs(
        value: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
      ): Self = StObject.set(x, "getLogs", js.Any.fromFunction1(value))
      
      inline def setGetMockCalls(
        value: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getMockCalls", js.Any.fromFunction1(value))
      
      inline def setGetMockSensor(
        value: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getMockSensor", js.Any.fromFunction1(value))
      
      inline def setGetNamedCookie(
        value: /* args */ Parameters[js.Function1[/* name */ String, Cookie]] => js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
      ): Self = StObject.set(x, "getNamedCookie", js.Any.fromFunction1(value))
      
      inline def setGetNetworkConditions(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getNetworkConditions", js.Any.fromFunction1(value))
      
      inline def setGetNetworkConnection(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getNetworkConnection", js.Any.fromFunction1(value))
      
      inline def setGetOrientation(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getOrientation", js.Any.fromFunction1(value))
      
      inline def setGetPageIndex(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction1(value))
      
      inline def setGetPageLogs(
        value: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getPageLogs", js.Any.fromFunction1(value))
      
      inline def setGetPageSource(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getPageSource", js.Any.fromFunction1(value))
      
      inline def setGetPerformanceData(
        value: /* args */ Parameters[
              js.Function3[
                /* packageName */ String, 
                /* dataType */ String, 
                /* dataReadTimeout */ js.UndefOr[Double], 
                js.Array[String]
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* packageName */ String, 
                  /* dataType */ String, 
                  /* dataReadTimeout */ js.UndefOr[Double], 
                  js.Array[String]
                ]
              ]
            ]
      ): Self = StObject.set(x, "getPerformanceData", js.Any.fromFunction1(value))
      
      inline def setGetPerformanceDataTypes(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getPerformanceDataTypes", js.Any.fromFunction1(value))
      
      inline def setGetSession(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
      
      inline def setGetSessionStorage(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getSessionStorage", js.Any.fromFunction1(value))
      
      inline def setGetSessionStorageItem(
        value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
      ): Self = StObject.set(x, "getSessionStorageItem", js.Any.fromFunction1(value))
      
      inline def setGetSessionStorageSize(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getSessionStorageSize", js.Any.fromFunction1(value))
      
      inline def setGetSessions(
        value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ): Self = StObject.set(x, "getSessions", js.Any.fromFunction1(value))
      
      inline def setGetSettings(
        value: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Promise[ReturnType[js.Function0[SettingsReturn]]]
      ): Self = StObject.set(x, "getSettings", js.Any.fromFunction1(value))
      
      inline def setGetStrings(
        value: /* args */ Parameters[
              js.Function2[
                /* language */ js.UndefOr[String], 
                /* stringFile */ js.UndefOr[String], 
                StringsReturn
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* language */ js.UndefOr[String], 
                  /* stringFile */ js.UndefOr[String], 
                  StringsReturn
                ]
              ]
            ]
      ): Self = StObject.set(x, "getStrings", js.Any.fromFunction1(value))
      
      inline def setGetSystemBars(
        value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
      ): Self = StObject.set(x, "getSystemBars", js.Any.fromFunction1(value))
      
      inline def setGetTimeouts(
        value: /* args */ Parameters[js.Function0[Timeouts]] => js.Promise[ReturnType[js.Function0[Timeouts]]]
      ): Self = StObject.set(x, "getTimeouts", js.Any.fromFunction1(value))
      
      inline def setGetTitle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
      
      inline def setGetUrl(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
      
      inline def setGetWindowHandle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction1(value))
      
      inline def setGetWindowHandles(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getWindowHandles", js.Any.fromFunction1(value))
      
      inline def setGetWindowPosition(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getWindowPosition", js.Any.fromFunction1(value))
      
      inline def setGetWindowRect(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "getWindowRect", js.Any.fromFunction1(value))
      
      inline def setGridProxyDetails(
        value: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "gridProxyDetails", js.Any.fromFunction1(value))
      
      inline def setGridTestSession(
        value: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "gridTestSession", js.Any.fromFunction1(value))
      
      inline def setGsmCall(
        value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
      ): Self = StObject.set(x, "gsmCall", js.Any.fromFunction1(value))
      
      inline def setGsmSignal(
        value: /* args */ Parameters[
              js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
            ] => js.Promise[
              ReturnType[
                js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
              ]
            ]
      ): Self = StObject.set(x, "gsmSignal", js.Any.fromFunction1(value))
      
      inline def setGsmVoice(
        value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ): Self = StObject.set(x, "gsmVoice", js.Any.fromFunction1(value))
      
      inline def setHideKeyboard(
        value: /* args */ Parameters[
              js.Function4[
                /* strategy */ js.UndefOr[String], 
                /* key */ js.UndefOr[String], 
                /* keyCode */ js.UndefOr[String], 
                /* keyName */ js.UndefOr[String], 
                Unit
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "hideKeyboard", js.Any.fromFunction1(value))
      
      inline def setInstallApp(
        value: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
      ): Self = StObject.set(x, "installApp", js.Any.fromFunction1(value))
      
      inline def setInterceptRequest(
        value: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
      ): Self = StObject.set(x, "interceptRequest", js.Any.fromFunction1(value))
      
      inline def setIsAlertOpen(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isAlertOpen", js.Any.fromFunction1(value))
      
      inline def setIsAppInstalled(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Boolean]]]
      ): Self = StObject.set(x, "isAppInstalled", js.Any.fromFunction1(value))
      
      inline def setIsAutoReporting(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isAutoReporting", js.Any.fromFunction1(value))
      
      inline def setIsElementDisplayed(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementDisplayed", js.Any.fromFunction1(value))
      
      inline def setIsElementEnabled(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementEnabled", js.Any.fromFunction1(value))
      
      inline def setIsElementSelected(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementSelected", js.Any.fromFunction1(value))
      
      inline def setIsIMEActivated(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isIMEActivated", js.Any.fromFunction1(value))
      
      inline def setIsKeyboardShown(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isKeyboardShown", js.Any.fromFunction1(value))
      
      inline def setIsLoading(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
      
      inline def setIsLocked(
        value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
      ): Self = StObject.set(x, "isLocked", js.Any.fromFunction1(value))
      
      inline def setJankinessCheck(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "jankinessCheck", js.Any.fromFunction1(value))
      
      inline def setLaunchApp(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "launchApp", js.Any.fromFunction1(value))
      
      inline def setLaunchChromeApp(
        value: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
      ): Self = StObject.set(x, "launchChromeApp", js.Any.fromFunction1(value))
      
      inline def setLock(
        value: /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
      
      inline def setLogEvent(
        value: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
      ): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
      
      inline def setLongPressKeyCode(
        value: /* args */ Parameters[
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "longPressKeyCode", js.Any.fromFunction1(value))
      
      inline def setManageSeleniumHubLifecycle(
        value: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
      ): Self = StObject.set(x, "manageSeleniumHubLifecycle", js.Any.fromFunction1(value))
      
      inline def setMaximizeWindow(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "maximizeWindow", js.Any.fromFunction1(value))
      
      inline def setMinimizeWindow(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "minimizeWindow", js.Any.fromFunction1(value))
      
      inline def setMockRequest(
        value: /* args */ Parameters[
              js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
            ] => js.Promise[
              ReturnType[
                js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
              ]
            ]
      ): Self = StObject.set(x, "mockRequest", js.Any.fromFunction1(value))
      
      inline def setMoveToElement(
        value: /* args */ Parameters[
              js.Function3[
                /* element */ js.UndefOr[String | Null], 
                /* xoffset */ js.UndefOr[Double], 
                /* yoffset */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* element */ js.UndefOr[String | Null], 
                  /* xoffset */ js.UndefOr[Double], 
                  /* yoffset */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "moveToElement", js.Any.fromFunction1(value))
      
      inline def setMultiTouchPerform(
        value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction1(value))
      
      inline def setNavigateTo(
        value: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
      ): Self = StObject.set(x, "navigateTo", js.Any.fromFunction1(value))
      
      inline def setNewSession(
        value: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
      ): Self = StObject.set(x, "newSession", js.Any.fromFunction1(value))
      
      inline def setOpenNotifications(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "openNotifications", js.Any.fromFunction1(value))
      
      inline def setPerformActions(
        value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ): Self = StObject.set(x, "performActions", js.Any.fromFunction1(value))
      
      inline def setPositionClick(
        value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
      ): Self = StObject.set(x, "positionClick", js.Any.fromFunction1(value))
      
      inline def setPositionDoubleClick(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "positionDoubleClick", js.Any.fromFunction1(value))
      
      inline def setPowerAC(
        value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
      ): Self = StObject.set(x, "powerAC", js.Any.fromFunction1(value))
      
      inline def setPowerCapacity(
        value: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
      ): Self = StObject.set(x, "powerCapacity", js.Any.fromFunction1(value))
      
      inline def setPressKeyCode(
        value: /* args */ Parameters[
              js.Function3[
                /* keycode */ Double, 
                /* metastate */ js.UndefOr[Double], 
                /* flags */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* keycode */ Double, 
                  /* metastate */ js.UndefOr[Double], 
                  /* flags */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "printPage", js.Any.fromFunction1(value))
      
      inline def setPullFile(
        value: /* args */ Parameters[js.Function1[/* path */ String, String]] => js.Promise[ReturnType[js.Function1[/* path */ String, String]]]
      ): Self = StObject.set(x, "pullFile", js.Any.fromFunction1(value))
      
      inline def setPullFolder(
        value: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
      ): Self = StObject.set(x, "pullFolder", js.Any.fromFunction1(value))
      
      inline def setPushFile(
        value: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
      ): Self = StObject.set(x, "pushFile", js.Any.fromFunction1(value))
      
      inline def setQueryAppState(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Double]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Double]]]
      ): Self = StObject.set(x, "queryAppState", js.Any.fromFunction1(value))
      
      inline def setQueryGrid(
        value: /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "queryGrid", js.Any.fromFunction1(value))
      
      inline def setReceiveAsyncResponse(
        value: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
      ): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
      
      inline def setReleaseActions(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "releaseActions", js.Any.fromFunction1(value))
      
      inline def setRemoveAllCredentials(
        value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ): Self = StObject.set(x, "removeAllCredentials", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
      
      inline def setRemoveCredential(
        value: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
      ): Self = StObject.set(x, "removeCredential", js.Any.fromFunction1(value))
      
      inline def setRemoveVirtualAuthenticator(
        value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ): Self = StObject.set(x, "removeVirtualAuthenticator", js.Any.fromFunction1(value))
      
      inline def setReplaceValue(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "replaceValue", js.Any.fromFunction1(value))
      
      inline def setReset(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setRespondMock(
        value: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
      ): Self = StObject.set(x, "respondMock", js.Any.fromFunction1(value))
      
      inline def setResume(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
      
      inline def setRotateDevice(
        value: /* args */ Parameters[
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "rotateDevice", js.Any.fromFunction1(value))
      
      inline def setSelectCastSink(
        value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ): Self = StObject.set(x, "selectCastSink", js.Any.fromFunction1(value))
      
      inline def setSendAlertText(
        value: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ): Self = StObject.set(x, "sendAlertText", js.Any.fromFunction1(value))
      
      inline def setSendCommand(
        value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
      ): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
      
      inline def setSendCommandAndGetResult(
        value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Any]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Any]]]
      ): Self = StObject.set(x, "sendCommandAndGetResult", js.Any.fromFunction1(value))
      
      inline def setSendKeyEvent(
        value: /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]] => js.Promise[
              ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
            ]
      ): Self = StObject.set(x, "sendKeyEvent", js.Any.fromFunction1(value))
      
      inline def setSendKeys(
        value: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
      ): Self = StObject.set(x, "sendKeys", js.Any.fromFunction1(value))
      
      inline def setSendSms(
        value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
      ): Self = StObject.set(x, "sendSms", js.Any.fromFunction1(value))
      
      inline def setSetAsyncTimeout(
        value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ): Self = StObject.set(x, "setAsyncTimeout", js.Any.fromFunction1(value))
      
      inline def setSetAutoReporting(
        value: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
      ): Self = StObject.set(x, "setAutoReporting", js.Any.fromFunction1(value))
      
      inline def setSetClipboard(
        value: /* args */ Parameters[
              js.Function3[
                /* content */ String, 
                /* contentType */ js.UndefOr[String], 
                /* label */ js.UndefOr[String], 
                String
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* content */ String, 
                  /* contentType */ js.UndefOr[String], 
                  /* label */ js.UndefOr[String], 
                  String
                ]
              ]
            ]
      ): Self = StObject.set(x, "setClipboard", js.Any.fromFunction1(value))
      
      inline def setSetGeoLocation(
        value: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
      ): Self = StObject.set(x, "setGeoLocation", js.Any.fromFunction1(value))
      
      inline def setSetImplicitTimeout(
        value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
      ): Self = StObject.set(x, "setImplicitTimeout", js.Any.fromFunction1(value))
      
      inline def setSetLocalStorage(
        value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "setLocalStorage", js.Any.fromFunction1(value))
      
      inline def setSetNetworkConditions(
        value: /* args */ Parameters[
              js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
            ] => js.Promise[
              ReturnType[
                js.Function2[/* networkConditions */ js.Object, /* networkName */ js.UndefOr[String], Unit]
              ]
            ]
      ): Self = StObject.set(x, "setNetworkConditions", js.Any.fromFunction1(value))
      
      inline def setSetNetworkConnection(
        value: /* args */ Parameters[js.Function1[/* parameters */ js.Object, Double]] => js.Promise[ReturnType[js.Function1[/* parameters */ js.Object, Double]]]
      ): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1(value))
      
      inline def setSetOrientation(
        value: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
      ): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
      
      inline def setSetPermissions(
        value: /* args */ Parameters[
              js.Function3[
                /* descriptor */ js.Object, 
                /* state */ String, 
                /* oneRealm */ js.UndefOr[Boolean], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* descriptor */ js.Object, 
                  /* state */ String, 
                  /* oneRealm */ js.UndefOr[Boolean], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "setPermissions", js.Any.fromFunction1(value))
      
      inline def setSetSessionStorage(
        value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "setSessionStorage", js.Any.fromFunction1(value))
      
      inline def setSetTimeZone(
        value: /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
      ): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
      
      inline def setSetTimeouts(
        value: /* args */ Parameters[
              js.Function3[
                /* implicit */ js.UndefOr[Double], 
                /* pageLoad */ js.UndefOr[Double], 
                /* script */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* implicit */ js.UndefOr[Double], 
                  /* pageLoad */ js.UndefOr[Double], 
                  /* script */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "setTimeouts", js.Any.fromFunction1(value))
      
      inline def setSetUserVerified(
        value: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
      ): Self = StObject.set(x, "setUserVerified", js.Any.fromFunction1(value))
      
      inline def setSetValueImmediate(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
      ): Self = StObject.set(x, "setValueImmediate", js.Any.fromFunction1(value))
      
      inline def setSetWindowPosition(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Promise[
              ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
            ]
      ): Self = StObject.set(x, "setWindowPosition", js.Any.fromFunction1(value))
      
      inline def setSetWindowRect(
        value: /* args */ Parameters[
              js.Function4[
                /* x */ Double | Null, 
                /* y */ Double | Null, 
                /* width */ Double | Null, 
                /* height */ Double | Null, 
                RectReturn
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "setWindowRect", js.Any.fromFunction1(value))
      
      inline def setShake(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
      
      inline def setShutdown(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
      
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "startActivity", js.Any.fromFunction1(value))
      
      inline def setStartCastTabMirroring(
        value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ): Self = StObject.set(x, "startCastTabMirroring", js.Any.fromFunction1(value))
      
      inline def setStartRecordingScreen(
        value: /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
      ): Self = StObject.set(x, "startRecordingScreen", js.Any.fromFunction1(value))
      
      inline def setStatus(
        value: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
      
      inline def setStopCasting(
        value: /* args */ Parameters[js.Function1[/* sinkName */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* sinkName */ String, Unit]]]
      ): Self = StObject.set(x, "stopCasting", js.Any.fromFunction1(value))
      
      inline def setStopRecordingScreen(
        value: /* args */ Parameters[
              js.Function4[
                /* remotePath */ js.UndefOr[String], 
                /* username */ js.UndefOr[String], 
                /* password */ js.UndefOr[String], 
                /* method */ js.UndefOr[String], 
                String
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "stopRecordingScreen", js.Any.fromFunction1(value))
      
      inline def setSwitchContext(
        value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ): Self = StObject.set(x, "switchContext", js.Any.fromFunction1(value))
      
      inline def setSwitchToFrame(
        value: /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
      ): Self = StObject.set(x, "switchToFrame", js.Any.fromFunction1(value))
      
      inline def setSwitchToParentFrame(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "switchToParentFrame", js.Any.fromFunction1(value))
      
      inline def setSwitchToWindow(
        value: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
      ): Self = StObject.set(x, "switchToWindow", js.Any.fromFunction1(value))
      
      inline def setTakeElementScreenshot(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
            ]
      ): Self = StObject.set(x, "takeElementScreenshot", js.Any.fromFunction1(value))
      
      inline def setTakeHeapSnapshot(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "takeHeapSnapshot", js.Any.fromFunction1(value))
      
      inline def setTakeScreenshot(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "takeScreenshot", js.Any.fromFunction1(value))
      
      inline def setTerminateApp(
        value: /* args */ Parameters[js.Function1[/* appId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appId */ String, Unit]]]
      ): Self = StObject.set(x, "terminateApp", js.Any.fromFunction1(value))
      
      inline def setThrottleCPU(
        value: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
      ): Self = StObject.set(x, "throttleCPU", js.Any.fromFunction1(value))
      
      inline def setThrottleNetwork(
        value: /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
      ): Self = StObject.set(x, "throttleNetwork", js.Any.fromFunction1(value))
      
      inline def setToggleAirplaneMode(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleAirplaneMode", js.Any.fromFunction1(value))
      
      inline def setToggleData(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleData", js.Any.fromFunction1(value))
      
      inline def setToggleEnrollTouchId(
        value: /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] => js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
      ): Self = StObject.set(x, "toggleEnrollTouchId", js.Any.fromFunction1(value))
      
      inline def setToggleLocationServices(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleLocationServices", js.Any.fromFunction1(value))
      
      inline def setToggleNetworkSpeed(
        value: /* args */ Parameters[js.Function1[/* netspeed */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* netspeed */ String, Unit]]]
      ): Self = StObject.set(x, "toggleNetworkSpeed", js.Any.fromFunction1(value))
      
      inline def setToggleWiFi(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleWiFi", js.Any.fromFunction1(value))
      
      inline def setTouchClick(
        value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ): Self = StObject.set(x, "touchClick", js.Any.fromFunction1(value))
      
      inline def setTouchDoubleClick(
        value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ): Self = StObject.set(x, "touchDoubleClick", js.Any.fromFunction1(value))
      
      inline def setTouchDown(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "touchFlick", js.Any.fromFunction1(value))
      
      inline def setTouchId(
        value: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
      ): Self = StObject.set(x, "touchId", js.Any.fromFunction1(value))
      
      inline def setTouchLongClick(
        value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
      ): Self = StObject.set(x, "touchLongClick", js.Any.fromFunction1(value))
      
      inline def setTouchMove(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction1(value))
      
      inline def setTouchPerform(
        value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1(value))
      
      inline def setTouchPinch(
        value: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Promise[
              ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
            ]
      ): Self = StObject.set(x, "touchPinch", js.Any.fromFunction1(value))
      
      inline def setTouchScroll(
        value: /* args */ Parameters[
              js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
              ]
            ]
      ): Self = StObject.set(x, "touchScroll", js.Any.fromFunction1(value))
      
      inline def setTouchUp(
        value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
      ): Self = StObject.set(x, "touchUp", js.Any.fromFunction1(value))
      
      inline def setUnlock(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
      
      inline def setUpdateMockSensor(
        value: /* args */ Parameters[
              js.Function4[
                /* type */ String, 
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "updateMockSensor", js.Any.fromFunction1(value))
      
      inline def setUpdateSettings(
        value: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
      ): Self = StObject.set(x, "updateSettings", js.Any.fromFunction1(value))
      
      inline def set_getWindowSize(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "_getWindowSize", js.Any.fromFunction1(value))
      
      inline def set_setWindowSize(
        value: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
      ): Self = StObject.set(x, "_setWindowSize", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/saucelabs.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/saucelabs.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/saucelabs.default[K]>>} */
  trait SauceLabsCommandsAsync extends StObject {
    
    def assertPerformance(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ]
      ]
    @JSName("assertPerformance")
    var assertPerformance_Original: js.Function1[
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
    
    def clearMockCalls(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
      ]
    @JSName("clearMockCalls")
    var clearMockCalls_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
        ]
      ]
    
    def getMockCalls(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
    @JSName("getMockCalls")
    var getMockCalls_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
      ]
    
    def getPageLogs(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
    @JSName("getPageLogs")
    var getPageLogs_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    
    def interceptRequest(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* rule */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
    @JSName("interceptRequest")
    var interceptRequest_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
      ]
    
    def jankinessCheck(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("jankinessCheck")
    var jankinessCheck_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def mockRequest(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ]
      ]
    @JSName("mockRequest")
    var mockRequest_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
          ]
        ]
      ]
    
    def respondMock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
    @JSName("respondMock")
    var respondMock_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
      ]
    
    def throttleCPU(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* rate */ Double, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
    @JSName("throttleCPU")
    var throttleCPU_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
        js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
      ]
    
    def throttleNetwork(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SauceLabsCommands[K]> is not an array type */ args: Parameters[js.Function1[/* condition */ String | js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
    @JSName("throttleNetwork")
    var throttleNetwork_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
      ]
  }
  object SauceLabsCommandsAsync {
    
    inline def apply(
      assertPerformance: /* args */ Parameters[
          js.Function2[
            /* name */ String, 
            /* metrics */ js.UndefOr[js.Array[String]], 
            ProtocolCommandResponse
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* name */ String, 
              /* metrics */ js.UndefOr[js.Array[String]], 
              ProtocolCommandResponse
            ]
          ]
        ],
      clearMockCalls: /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]] => js.Promise[
          ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
        ],
      getMockCalls: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]],
      getPageLogs: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]],
      interceptRequest: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]],
      jankinessCheck: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      mockRequest: /* args */ Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
          ]
        ],
      respondMock: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]],
      throttleCPU: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]],
      throttleNetwork: /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
    ): SauceLabsCommandsAsync = {
      val __obj = js.Dynamic.literal(assertPerformance = js.Any.fromFunction1(assertPerformance), clearMockCalls = js.Any.fromFunction1(clearMockCalls), getMockCalls = js.Any.fromFunction1(getMockCalls), getPageLogs = js.Any.fromFunction1(getPageLogs), interceptRequest = js.Any.fromFunction1(interceptRequest), jankinessCheck = js.Any.fromFunction1(jankinessCheck), mockRequest = js.Any.fromFunction1(mockRequest), respondMock = js.Any.fromFunction1(respondMock), throttleCPU = js.Any.fromFunction1(throttleCPU), throttleNetwork = js.Any.fromFunction1(throttleNetwork))
      __obj.asInstanceOf[SauceLabsCommandsAsync]
    }
    
    extension [Self <: SauceLabsCommandsAsync](x: Self) {
      
      inline def setAssertPerformance(
        value: /* args */ Parameters[
              js.Function2[
                /* name */ String, 
                /* metrics */ js.UndefOr[js.Array[String]], 
                ProtocolCommandResponse
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* name */ String, 
                  /* metrics */ js.UndefOr[js.Array[String]], 
                  ProtocolCommandResponse
                ]
              ]
            ]
      ): Self = StObject.set(x, "assertPerformance", js.Any.fromFunction1(value))
      
      inline def setClearMockCalls(
        value: /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]] => js.Promise[
              ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
            ]
      ): Self = StObject.set(x, "clearMockCalls", js.Any.fromFunction1(value))
      
      inline def setGetMockCalls(
        value: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getMockCalls", js.Any.fromFunction1(value))
      
      inline def setGetPageLogs(
        value: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getPageLogs", js.Any.fromFunction1(value))
      
      inline def setInterceptRequest(
        value: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
      ): Self = StObject.set(x, "interceptRequest", js.Any.fromFunction1(value))
      
      inline def setJankinessCheck(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "jankinessCheck", js.Any.fromFunction1(value))
      
      inline def setMockRequest(
        value: /* args */ Parameters[
              js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
            ] => js.Promise[
              ReturnType[
                js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
              ]
            ]
      ): Self = StObject.set(x, "mockRequest", js.Any.fromFunction1(value))
      
      inline def setRespondMock(
        value: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
      ): Self = StObject.set(x, "respondMock", js.Any.fromFunction1(value))
      
      inline def setThrottleCPU(
        value: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
      ): Self = StObject.set(x, "throttleCPU", js.Any.fromFunction1(value))
      
      inline def setThrottleNetwork(
        value: /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
      ): Self = StObject.set(x, "throttleNetwork", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/selenium.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/selenium.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/selenium.default[K]>>} */
  trait SeleniumCommandsAsync extends StObject {
    
    def file(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* file */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
    @JSName("file")
    var file_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* file */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ]
    
    def getHubConfig(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    @JSName("getHubConfig")
    var getHubConfig_Original: js.Function1[
        /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ]
    
    def gridProxyDetails(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
    @JSName("gridProxyDetails")
    var gridProxyDetails_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
      ]
    
    def gridTestSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
    @JSName("gridTestSession")
    var gridTestSession_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
      ]
    
    def manageSeleniumHubLifecycle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* action */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
    @JSName("manageSeleniumHubLifecycle")
    var manageSeleniumHubLifecycle_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
      ]
    
    def queryGrid(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SeleniumCommands[K]> is not an array type */ args: Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
    @JSName("queryGrid")
    var queryGrid_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
      ]
  }
  object SeleniumCommandsAsync {
    
    inline def apply(
      file: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]],
      getHubConfig: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
      gridProxyDetails: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]],
      gridTestSession: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]],
      manageSeleniumHubLifecycle: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]],
      queryGrid: /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
    ): SeleniumCommandsAsync = {
      val __obj = js.Dynamic.literal(file = js.Any.fromFunction1(file), getHubConfig = js.Any.fromFunction1(getHubConfig), gridProxyDetails = js.Any.fromFunction1(gridProxyDetails), gridTestSession = js.Any.fromFunction1(gridTestSession), manageSeleniumHubLifecycle = js.Any.fromFunction1(manageSeleniumHubLifecycle), queryGrid = js.Any.fromFunction1(queryGrid))
      __obj.asInstanceOf[SeleniumCommandsAsync]
    }
    
    extension [Self <: SeleniumCommandsAsync](x: Self) {
      
      inline def setFile(
        value: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
      ): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
      
      inline def setGetHubConfig(
        value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getHubConfig", js.Any.fromFunction1(value))
      
      inline def setGridProxyDetails(
        value: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "gridProxyDetails", js.Any.fromFunction1(value))
      
      inline def setGridTestSession(
        value: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "gridTestSession", js.Any.fromFunction1(value))
      
      inline def setManageSeleniumHubLifecycle(
        value: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
      ): Self = StObject.set(x, "manageSeleniumHubLifecycle", js.Any.fromFunction1(value))
      
      inline def setQueryGrid(
        value: /* args */ Parameters[js.Function1[/* query */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* query */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "queryGrid", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ K in keyof @wdio/protocols.@wdio/protocols/build/commands/webdriver.default ]: (args : std.Parameters<@wdio/protocols.@wdio/protocols/build/commands/webdriver.default[K]>): std.Promise<std.ReturnType<@wdio/protocols.@wdio/protocols/build/commands/webdriver.default[K]>>} */
  trait WebDriverCommandsAsync extends StObject {
    
    def acceptAlert(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("acceptAlert")
    var acceptAlert_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def addCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* cookie */ js.Object, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
    @JSName("addCookie")
    var addCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
        js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
      ]
    
    def addCredential(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def addVirtualAuthenticator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def back(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("back")
    var back_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def closeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("closeWindow")
    var closeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def createMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
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
    
    def createWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ tab | window, WindowHandle]]
    ): js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
    @JSName("createWindow")
    var createWindow_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
        js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
      ]
    
    def deleteAllCookies(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deleteAllCookies")
    var deleteAllCookies_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def deleteCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    @JSName("deleteCookie")
    var deleteCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ]
    
    def deleteMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
    @JSName("deleteMockSensor")
    var deleteMockSensor_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
      ]
    
    def deleteSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("deleteSession")
    var deleteSession_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def dismissAlert(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("dismissAlert")
    var dismissAlert_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def elementClear(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementClear")
    var elementClear_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def elementClick(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    @JSName("elementClick")
    var elementClick_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ]
    
    def elementSendKeys(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
    @JSName("elementSendKeys")
    var elementSendKeys_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
      ]
    
    def executeAsyncScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
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
    
    def executeScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
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
    
    def findElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]]
    ): js.Promise[
        ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
      ]
    
    def findElementFromElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ]
      ]
    @JSName("findElementFromElement")
    var findElementFromElement_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
          ]
        ]
      ]
    
    def findElementFromShadowRoot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ]
      ]
    @JSName("findElementFromShadowRoot")
    var findElementFromShadowRoot_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
          ]
        ]
      ]
    
    @JSName("findElement")
    var findElement_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ]
      ]
    
    def findElements(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
    ): js.Promise[
        ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
      ]
    
    def findElementsFromElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
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
    
    def findElementsFromShadowRoot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ]
      ]
    @JSName("findElementsFromShadowRoot")
    var findElementsFromShadowRoot_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ], 
        js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
          ]
        ]
      ]
    
    @JSName("findElements")
    var findElements_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]], 
        js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ]
      ]
    
    def forward(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("forward")
    var forward_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def fullscreenWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("fullscreenWindow")
    var fullscreenWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def generateTestReport(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* message */ String, /* group */ String, Unit]]
    ): js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
    @JSName("generateTestReport")
    var generateTestReport_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
        js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
      ]
    
    def getActiveElement(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getActiveElement")
    var getActiveElement_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getAlertText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getAlertText")
    var getAlertText_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getAllCookies(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[Cookie]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
    @JSName("getAllCookies")
    var getAllCookies_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[Cookie]]], 
        js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ]
    
    def getCredentials(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
    @JSName("getCredentials")
    var getCredentials_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    
    def getElementAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    @JSName("getElementAttribute")
    var getElementAttribute_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    
    def getElementCSSValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
      ]
    @JSName("getElementCSSValue")
    var getElementCSSValue_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ]
      ]
    
    def getElementComputedLabel(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementComputedLabel")
    var getElementComputedLabel_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementComputedRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementComputedRole")
    var getElementComputedRole_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementProperty(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
    ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    @JSName("getElementProperty")
    var getElementProperty_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
        js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ]
    
    def getElementRect(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, RectReturn]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
    @JSName("getElementRect")
    var getElementRect_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
      ]
    
    def getElementShadowRoot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementShadowRoot")
    var getElementShadowRoot_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementTagName(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementTagName")
    var getElementTagName_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getElementText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    @JSName("getElementText")
    var getElementText_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ]
    
    def getMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
    ): js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
    @JSName("getMockSensor")
    var getMockSensor_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
        js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ]
    
    def getNamedCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Cookie]]
    ): js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
    @JSName("getNamedCookie")
    var getNamedCookie_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
        js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
      ]
    
    def getPageSource(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getPageSource")
    var getPageSource_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getTimeouts(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Timeouts]]
    ): js.Promise[ReturnType[js.Function0[Timeouts]]]
    @JSName("getTimeouts")
    var getTimeouts_Original: js.Function1[
        /* args */ Parameters[js.Function0[Timeouts]], 
        js.Promise[ReturnType[js.Function0[Timeouts]]]
      ]
    
    def getTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getTitle")
    var getTitle_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getUrl(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getUrl")
    var getUrl_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getWindowHandle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("getWindowHandle")
    var getWindowHandle_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def getWindowHandles(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
    ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    @JSName("getWindowHandles")
    var getWindowHandles_Original: js.Function1[
        /* args */ Parameters[js.Function0[js.Array[String]]], 
        js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ]
    
    def getWindowRect(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("getWindowRect")
    var getWindowRect_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def isElementDisplayed(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementDisplayed")
    var isElementDisplayed_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isElementEnabled(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementEnabled")
    var isElementEnabled_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def isElementSelected(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
    ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    @JSName("isElementSelected")
    var isElementSelected_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
        js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ]
    
    def maximizeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("maximizeWindow")
    var maximizeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def minimizeWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
    ): js.Promise[ReturnType[js.Function0[RectReturn]]]
    @JSName("minimizeWindow")
    var minimizeWindow_Original: js.Function1[
        /* args */ Parameters[js.Function0[RectReturn]], 
        js.Promise[ReturnType[js.Function0[RectReturn]]]
      ]
    
    def navigateTo(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* url */ String, String]]
    ): js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
    @JSName("navigateTo")
    var navigateTo_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* url */ String, String]], 
        js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
      ]
    
    def newSession(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]]
    ): js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
    @JSName("newSession")
    var newSession_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
        js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
      ]
    
    def performActions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
    ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    @JSName("performActions")
    var performActions_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
        js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ]
    
    def printPage(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
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
    ): js.Promise[
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
    
    def refresh(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("refresh")
    var refresh_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def releaseActions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("releaseActions")
    var releaseActions_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def removeAllCredentials(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
    @JSName("removeAllCredentials")
    var removeAllCredentials_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    
    def removeCredential(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    @JSName("removeCredential")
    var removeCredential_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    
    def removeVirtualAuthenticator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* authenticatorId */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
    @JSName("removeVirtualAuthenticator")
    var removeVirtualAuthenticator_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ]
    
    def sendAlertText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* text */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
    @JSName("sendAlertText")
    var sendAlertText_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ]
    
    def setPermissions(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ]
      ]
    @JSName("setPermissions")
    var setPermissions_Original: js.Function1[
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
    
    def setTimeZone(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* timeZone */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
    @JSName("setTimeZone")
    var setTimeZone_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
      ]
    
    def setTimeouts(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): js.Promise[
        ReturnType[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ]
      ]
    @JSName("setTimeouts")
    var setTimeouts_Original: js.Function1[
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
    
    def setUserVerified(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
    ): js.Promise[
        ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
      ]
    @JSName("setUserVerified")
    var setUserVerified_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]], 
        js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ]
      ]
    
    def setWindowRect(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* x */ Double | Null, 
            /* y */ Double | Null, 
            /* width */ Double | Null, 
            /* height */ Double | Null, 
            RectReturn
          ]
        ]
    ): js.Promise[
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
    @JSName("setWindowRect")
    var setWindowRect_Original: js.Function1[
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
    
    def status(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[StatusReturn]]
    ): js.Promise[ReturnType[js.Function0[StatusReturn]]]
    @JSName("status")
    var status_Original: js.Function1[
        /* args */ Parameters[js.Function0[StatusReturn]], 
        js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ]
    
    def switchToFrame(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
    @JSName("switchToFrame")
    var switchToFrame_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
        js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
      ]
    
    def switchToParentFrame(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
    ): js.Promise[ReturnType[js.Function0[Unit]]]
    @JSName("switchToParentFrame")
    var switchToParentFrame_Original: js.Function1[
        /* args */ Parameters[js.Function0[Unit]], 
        js.Promise[ReturnType[js.Function0[Unit]]]
      ]
    
    def switchToWindow(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function1[/* handle */ String, Unit]]
    ): js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
    @JSName("switchToWindow")
    var switchToWindow_Original: js.Function1[
        /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
        js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
      ]
    
    def takeElementScreenshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
    ): js.Promise[
        ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
      ]
    @JSName("takeElementScreenshot")
    var takeElementScreenshot_Original: js.Function1[
        /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
        js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ]
      ]
    
    def takeScreenshot(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[js.Function0[String]]
    ): js.Promise[ReturnType[js.Function0[String]]]
    @JSName("takeScreenshot")
    var takeScreenshot_Original: js.Function1[
        /* args */ Parameters[js.Function0[String]], 
        js.Promise[ReturnType[js.Function0[String]]]
      ]
    
    def updateMockSensor(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriverCommands[K]> is not an array type */ args: Parameters[
          js.Function4[
            /* type */ String, 
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ]
    ): js.Promise[
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
  }
  object WebDriverCommandsAsync {
    
    inline def apply(
      acceptAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      addCookie: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]],
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
        ] => js.Promise[
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
        ] => js.Promise[
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
        ],
      back: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      closeWindow: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      createMockSensor: /* args */ Parameters[
          js.Function3[
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* mockSensorType */ String, 
              /* maxSamplingFrequency */ Double, 
              /* minSamplingFrequency */ Double, 
              Unit
            ]
          ]
        ],
      createWindow: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]],
      deleteAllCookies: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      deleteCookie: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
      deleteMockSensor: /* args */ Parameters[js.Function1[/* type */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]],
      deleteSession: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      dismissAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      elementClear: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      elementClick: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
      elementSendKeys: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]],
      executeAsyncScript: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
            ]
          ]
        ],
      executeScript: /* args */ Parameters[
          js.Function2[
            /* script */ String, 
            /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
            Any
          ]
        ] => js.Promise[
          ReturnType[
            js.Function2[
              /* script */ String, 
              /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
              Any
            ]
          ]
        ],
      findElement: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
        ],
      findElementFromElement: /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
          ]
        ],
      findElementFromShadowRoot: /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
          ]
        ],
      findElements: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
        ],
      findElementsFromElement: /* args */ Parameters[
          js.Function3[
            /* elementId */ String, 
            /* using */ String, 
            /* value */ String, 
            js.Array[ElementReference]
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* elementId */ String, 
              /* using */ String, 
              /* value */ String, 
              js.Array[ElementReference]
            ]
          ]
        ],
      findElementsFromShadowRoot: /* args */ Parameters[
          js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
          ]
        ],
      forward: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      fullscreenWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      generateTestReport: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]],
      getActiveElement: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getAlertText: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getAllCookies: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]],
      getCredentials: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]],
      getElementAttribute: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]],
      getElementCSSValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ],
      getElementComputedLabel: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementComputedRole: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementProperty: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]],
      getElementRect: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]],
      getElementShadowRoot: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementTagName: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getElementText: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
      getMockSensor: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]],
      getNamedCookie: /* args */ Parameters[js.Function1[/* name */ String, Cookie]] => js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]],
      getPageSource: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getTimeouts: /* args */ Parameters[js.Function0[Timeouts]] => js.Promise[ReturnType[js.Function0[Timeouts]]],
      getTitle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getUrl: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getWindowHandle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      getWindowHandles: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
      getWindowRect: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      isElementDisplayed: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isElementEnabled: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      isElementSelected: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
      maximizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      minimizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
      navigateTo: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Promise[ReturnType[js.Function1[/* url */ String, String]]],
      newSession: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]],
      performActions: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
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
        ] => js.Promise[
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
        ],
      refresh: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      releaseActions: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      removeAllCredentials: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]],
      removeCredential: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ],
      removeVirtualAuthenticator: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]],
      sendAlertText: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]],
      setPermissions: /* args */ Parameters[
          js.Function3[
            /* descriptor */ js.Object, 
            /* state */ String, 
            /* oneRealm */ js.UndefOr[Boolean], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* descriptor */ js.Object, 
              /* state */ String, 
              /* oneRealm */ js.UndefOr[Boolean], 
              Unit
            ]
          ]
        ],
      setTimeZone: /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]],
      setTimeouts: /* args */ Parameters[
          js.Function3[
            /* implicit */ js.UndefOr[Double], 
            /* pageLoad */ js.UndefOr[Double], 
            /* script */ js.UndefOr[Double], 
            Unit
          ]
        ] => js.Promise[
          ReturnType[
            js.Function3[
              /* implicit */ js.UndefOr[Double], 
              /* pageLoad */ js.UndefOr[Double], 
              /* script */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ],
      setUserVerified: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
          ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
        ],
      setWindowRect: /* args */ Parameters[
          js.Function4[
            /* x */ Double | Null, 
            /* y */ Double | Null, 
            /* width */ Double | Null, 
            /* height */ Double | Null, 
            RectReturn
          ]
        ] => js.Promise[
          ReturnType[
            js.Function4[
              /* x */ Double | Null, 
              /* y */ Double | Null, 
              /* width */ Double | Null, 
              /* height */ Double | Null, 
              RectReturn
            ]
          ]
        ],
      status: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]],
      switchToFrame: /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]],
      switchToParentFrame: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
      switchToWindow: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]],
      takeElementScreenshot: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ],
      takeScreenshot: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
      updateMockSensor: /* args */ Parameters[
          js.Function4[
            /* type */ String, 
            /* mockSensorType */ String, 
            /* maxSamplingFrequency */ Double, 
            /* minSamplingFrequency */ Double, 
            Unit
          ]
        ] => js.Promise[
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
    ): WebDriverCommandsAsync = {
      val __obj = js.Dynamic.literal(acceptAlert = js.Any.fromFunction1(acceptAlert), addCookie = js.Any.fromFunction1(addCookie), addCredential = js.Any.fromFunction1(addCredential), addVirtualAuthenticator = js.Any.fromFunction1(addVirtualAuthenticator), back = js.Any.fromFunction1(back), closeWindow = js.Any.fromFunction1(closeWindow), createMockSensor = js.Any.fromFunction1(createMockSensor), createWindow = js.Any.fromFunction1(createWindow), deleteAllCookies = js.Any.fromFunction1(deleteAllCookies), deleteCookie = js.Any.fromFunction1(deleteCookie), deleteMockSensor = js.Any.fromFunction1(deleteMockSensor), deleteSession = js.Any.fromFunction1(deleteSession), dismissAlert = js.Any.fromFunction1(dismissAlert), elementClear = js.Any.fromFunction1(elementClear), elementClick = js.Any.fromFunction1(elementClick), elementSendKeys = js.Any.fromFunction1(elementSendKeys), executeAsyncScript = js.Any.fromFunction1(executeAsyncScript), executeScript = js.Any.fromFunction1(executeScript), findElement = js.Any.fromFunction1(findElement), findElementFromElement = js.Any.fromFunction1(findElementFromElement), findElementFromShadowRoot = js.Any.fromFunction1(findElementFromShadowRoot), findElements = js.Any.fromFunction1(findElements), findElementsFromElement = js.Any.fromFunction1(findElementsFromElement), findElementsFromShadowRoot = js.Any.fromFunction1(findElementsFromShadowRoot), forward = js.Any.fromFunction1(forward), fullscreenWindow = js.Any.fromFunction1(fullscreenWindow), generateTestReport = js.Any.fromFunction1(generateTestReport), getActiveElement = js.Any.fromFunction1(getActiveElement), getAlertText = js.Any.fromFunction1(getAlertText), getAllCookies = js.Any.fromFunction1(getAllCookies), getCredentials = js.Any.fromFunction1(getCredentials), getElementAttribute = js.Any.fromFunction1(getElementAttribute), getElementCSSValue = js.Any.fromFunction1(getElementCSSValue), getElementComputedLabel = js.Any.fromFunction1(getElementComputedLabel), getElementComputedRole = js.Any.fromFunction1(getElementComputedRole), getElementProperty = js.Any.fromFunction1(getElementProperty), getElementRect = js.Any.fromFunction1(getElementRect), getElementShadowRoot = js.Any.fromFunction1(getElementShadowRoot), getElementTagName = js.Any.fromFunction1(getElementTagName), getElementText = js.Any.fromFunction1(getElementText), getMockSensor = js.Any.fromFunction1(getMockSensor), getNamedCookie = js.Any.fromFunction1(getNamedCookie), getPageSource = js.Any.fromFunction1(getPageSource), getTimeouts = js.Any.fromFunction1(getTimeouts), getTitle = js.Any.fromFunction1(getTitle), getUrl = js.Any.fromFunction1(getUrl), getWindowHandle = js.Any.fromFunction1(getWindowHandle), getWindowHandles = js.Any.fromFunction1(getWindowHandles), getWindowRect = js.Any.fromFunction1(getWindowRect), isElementDisplayed = js.Any.fromFunction1(isElementDisplayed), isElementEnabled = js.Any.fromFunction1(isElementEnabled), isElementSelected = js.Any.fromFunction1(isElementSelected), maximizeWindow = js.Any.fromFunction1(maximizeWindow), minimizeWindow = js.Any.fromFunction1(minimizeWindow), navigateTo = js.Any.fromFunction1(navigateTo), newSession = js.Any.fromFunction1(newSession), performActions = js.Any.fromFunction1(performActions), printPage = js.Any.fromFunction1(printPage), refresh = js.Any.fromFunction1(refresh), releaseActions = js.Any.fromFunction1(releaseActions), removeAllCredentials = js.Any.fromFunction1(removeAllCredentials), removeCredential = js.Any.fromFunction1(removeCredential), removeVirtualAuthenticator = js.Any.fromFunction1(removeVirtualAuthenticator), sendAlertText = js.Any.fromFunction1(sendAlertText), setPermissions = js.Any.fromFunction1(setPermissions), setTimeZone = js.Any.fromFunction1(setTimeZone), setTimeouts = js.Any.fromFunction1(setTimeouts), setUserVerified = js.Any.fromFunction1(setUserVerified), setWindowRect = js.Any.fromFunction1(setWindowRect), status = js.Any.fromFunction1(status), switchToFrame = js.Any.fromFunction1(switchToFrame), switchToParentFrame = js.Any.fromFunction1(switchToParentFrame), switchToWindow = js.Any.fromFunction1(switchToWindow), takeElementScreenshot = js.Any.fromFunction1(takeElementScreenshot), takeScreenshot = js.Any.fromFunction1(takeScreenshot), updateMockSensor = js.Any.fromFunction1(updateMockSensor))
      __obj.asInstanceOf[WebDriverCommandsAsync]
    }
    
    extension [Self <: WebDriverCommandsAsync](x: Self) {
      
      inline def setAcceptAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "acceptAlert", js.Any.fromFunction1(value))
      
      inline def setAddCookie(
        value: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
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
            ] => js.Promise[
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "addVirtualAuthenticator", js.Any.fromFunction1(value))
      
      inline def setBack(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
      
      inline def setCloseWindow(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "closeWindow", js.Any.fromFunction1(value))
      
      inline def setCreateMockSensor(
        value: /* args */ Parameters[
              js.Function3[
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* mockSensorType */ String, 
                  /* maxSamplingFrequency */ Double, 
                  /* minSamplingFrequency */ Double, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "createMockSensor", js.Any.fromFunction1(value))
      
      inline def setCreateWindow(
        value: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
      ): Self = StObject.set(x, "createWindow", js.Any.fromFunction1(value))
      
      inline def setDeleteAllCookies(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteAllCookies", js.Any.fromFunction1(value))
      
      inline def setDeleteCookie(
        value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
      ): Self = StObject.set(x, "deleteCookie", js.Any.fromFunction1(value))
      
      inline def setDeleteMockSensor(
        value: /* args */ Parameters[js.Function1[/* type */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ String, Unit]]]
      ): Self = StObject.set(x, "deleteMockSensor", js.Any.fromFunction1(value))
      
      inline def setDeleteSession(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
      
      inline def setDismissAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "dismissAlert", js.Any.fromFunction1(value))
      
      inline def setElementClear(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementClear", js.Any.fromFunction1(value))
      
      inline def setElementClick(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
      ): Self = StObject.set(x, "elementClick", js.Any.fromFunction1(value))
      
      inline def setElementSendKeys(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
      ): Self = StObject.set(x, "elementSendKeys", js.Any.fromFunction1(value))
      
      inline def setExecuteAsyncScript(
        value: /* args */ Parameters[
              js.Function2[
                /* script */ String, 
                /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                Any
              ]
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
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
            ] => js.Promise[
              ReturnType[
                js.Function2[
                  /* script */ String, 
                  /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
                  Any
                ]
              ]
            ]
      ): Self = StObject.set(x, "executeScript", js.Any.fromFunction1(value))
      
      inline def setFindElement(
        value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, ElementReference]] => js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, ElementReference]]
            ]
      ): Self = StObject.set(x, "findElement", js.Any.fromFunction1(value))
      
      inline def setFindElementFromElement(
        value: /* args */ Parameters[
              js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* elementId */ String, /* using */ String, /* value */ String, ElementReference]
              ]
            ]
      ): Self = StObject.set(x, "findElementFromElement", js.Any.fromFunction1(value))
      
      inline def setFindElementFromShadowRoot(
        value: /* args */ Parameters[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, ProtocolCommandResponse]
              ]
            ]
      ): Self = StObject.set(x, "findElementFromShadowRoot", js.Any.fromFunction1(value))
      
      inline def setFindElements(
        value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]] => js.Promise[
              ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[ElementReference]]]
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
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* elementId */ String, 
                  /* using */ String, 
                  /* value */ String, 
                  js.Array[ElementReference]
                ]
              ]
            ]
      ): Self = StObject.set(x, "findElementsFromElement", js.Any.fromFunction1(value))
      
      inline def setFindElementsFromShadowRoot(
        value: /* args */ Parameters[
              js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
            ] => js.Promise[
              ReturnType[
                js.Function3[/* shadowId */ String, /* using */ String, /* value */ String, js.Array[js.Object]]
              ]
            ]
      ): Self = StObject.set(x, "findElementsFromShadowRoot", js.Any.fromFunction1(value))
      
      inline def setForward(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
      
      inline def setFullscreenWindow(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "fullscreenWindow", js.Any.fromFunction1(value))
      
      inline def setGenerateTestReport(
        value: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
      ): Self = StObject.set(x, "generateTestReport", js.Any.fromFunction1(value))
      
      inline def setGetActiveElement(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
      
      inline def setGetAlertText(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getAlertText", js.Any.fromFunction1(value))
      
      inline def setGetAllCookies(
        value: /* args */ Parameters[js.Function0[js.Array[Cookie]]] => js.Promise[ReturnType[js.Function0[js.Array[Cookie]]]]
      ): Self = StObject.set(x, "getAllCookies", js.Any.fromFunction1(value))
      
      inline def setGetCredentials(
        value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ): Self = StObject.set(x, "getCredentials", js.Any.fromFunction1(value))
      
      inline def setGetElementAttribute(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ): Self = StObject.set(x, "getElementAttribute", js.Any.fromFunction1(value))
      
      inline def setGetElementCSSValue(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
            ]
      ): Self = StObject.set(x, "getElementCSSValue", js.Any.fromFunction1(value))
      
      inline def setGetElementComputedLabel(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementComputedLabel", js.Any.fromFunction1(value))
      
      inline def setGetElementComputedRole(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementComputedRole", js.Any.fromFunction1(value))
      
      inline def setGetElementProperty(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
      ): Self = StObject.set(x, "getElementProperty", js.Any.fromFunction1(value))
      
      inline def setGetElementRect(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
      ): Self = StObject.set(x, "getElementRect", js.Any.fromFunction1(value))
      
      inline def setGetElementShadowRoot(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementShadowRoot", js.Any.fromFunction1(value))
      
      inline def setGetElementTagName(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementTagName", js.Any.fromFunction1(value))
      
      inline def setGetElementText(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
      ): Self = StObject.set(x, "getElementText", js.Any.fromFunction1(value))
      
      inline def setGetMockSensor(
        value: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
      ): Self = StObject.set(x, "getMockSensor", js.Any.fromFunction1(value))
      
      inline def setGetNamedCookie(
        value: /* args */ Parameters[js.Function1[/* name */ String, Cookie]] => js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
      ): Self = StObject.set(x, "getNamedCookie", js.Any.fromFunction1(value))
      
      inline def setGetPageSource(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getPageSource", js.Any.fromFunction1(value))
      
      inline def setGetTimeouts(
        value: /* args */ Parameters[js.Function0[Timeouts]] => js.Promise[ReturnType[js.Function0[Timeouts]]]
      ): Self = StObject.set(x, "getTimeouts", js.Any.fromFunction1(value))
      
      inline def setGetTitle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
      
      inline def setGetUrl(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
      
      inline def setGetWindowHandle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction1(value))
      
      inline def setGetWindowHandles(
        value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
      ): Self = StObject.set(x, "getWindowHandles", js.Any.fromFunction1(value))
      
      inline def setGetWindowRect(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "getWindowRect", js.Any.fromFunction1(value))
      
      inline def setIsElementDisplayed(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementDisplayed", js.Any.fromFunction1(value))
      
      inline def setIsElementEnabled(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementEnabled", js.Any.fromFunction1(value))
      
      inline def setIsElementSelected(
        value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
      ): Self = StObject.set(x, "isElementSelected", js.Any.fromFunction1(value))
      
      inline def setMaximizeWindow(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "maximizeWindow", js.Any.fromFunction1(value))
      
      inline def setMinimizeWindow(
        value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
      ): Self = StObject.set(x, "minimizeWindow", js.Any.fromFunction1(value))
      
      inline def setNavigateTo(
        value: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
      ): Self = StObject.set(x, "navigateTo", js.Any.fromFunction1(value))
      
      inline def setNewSession(
        value: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
      ): Self = StObject.set(x, "newSession", js.Any.fromFunction1(value))
      
      inline def setPerformActions(
        value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
      ): Self = StObject.set(x, "performActions", js.Any.fromFunction1(value))
      
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
            ] => js.Promise[
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
      ): Self = StObject.set(x, "printPage", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
      
      inline def setReleaseActions(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "releaseActions", js.Any.fromFunction1(value))
      
      inline def setRemoveAllCredentials(
        value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ): Self = StObject.set(x, "removeAllCredentials", js.Any.fromFunction1(value))
      
      inline def setRemoveCredential(
        value: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
      ): Self = StObject.set(x, "removeCredential", js.Any.fromFunction1(value))
      
      inline def setRemoveVirtualAuthenticator(
        value: /* args */ Parameters[js.Function1[/* authenticatorId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* authenticatorId */ String, Unit]]]
      ): Self = StObject.set(x, "removeVirtualAuthenticator", js.Any.fromFunction1(value))
      
      inline def setSendAlertText(
        value: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
      ): Self = StObject.set(x, "sendAlertText", js.Any.fromFunction1(value))
      
      inline def setSetPermissions(
        value: /* args */ Parameters[
              js.Function3[
                /* descriptor */ js.Object, 
                /* state */ String, 
                /* oneRealm */ js.UndefOr[Boolean], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* descriptor */ js.Object, 
                  /* state */ String, 
                  /* oneRealm */ js.UndefOr[Boolean], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "setPermissions", js.Any.fromFunction1(value))
      
      inline def setSetTimeZone(
        value: /* args */ Parameters[js.Function1[/* timeZone */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* timeZone */ String, Unit]]]
      ): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
      
      inline def setSetTimeouts(
        value: /* args */ Parameters[
              js.Function3[
                /* implicit */ js.UndefOr[Double], 
                /* pageLoad */ js.UndefOr[Double], 
                /* script */ js.UndefOr[Double], 
                Unit
              ]
            ] => js.Promise[
              ReturnType[
                js.Function3[
                  /* implicit */ js.UndefOr[Double], 
                  /* pageLoad */ js.UndefOr[Double], 
                  /* script */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "setTimeouts", js.Any.fromFunction1(value))
      
      inline def setSetUserVerified(
        value: /* args */ Parameters[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]] => js.Promise[
              ReturnType[js.Function2[/* authenticatorId */ String, /* credentialId */ String, Unit]]
            ]
      ): Self = StObject.set(x, "setUserVerified", js.Any.fromFunction1(value))
      
      inline def setSetWindowRect(
        value: /* args */ Parameters[
              js.Function4[
                /* x */ Double | Null, 
                /* y */ Double | Null, 
                /* width */ Double | Null, 
                /* height */ Double | Null, 
                RectReturn
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "setWindowRect", js.Any.fromFunction1(value))
      
      inline def setStatus(
        value: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]]
      ): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
      
      inline def setSwitchToFrame(
        value: /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
      ): Self = StObject.set(x, "switchToFrame", js.Any.fromFunction1(value))
      
      inline def setSwitchToParentFrame(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "switchToParentFrame", js.Any.fromFunction1(value))
      
      inline def setSwitchToWindow(
        value: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
      ): Self = StObject.set(x, "switchToWindow", js.Any.fromFunction1(value))
      
      inline def setTakeElementScreenshot(
        value: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
              ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
            ]
      ): Self = StObject.set(x, "takeElementScreenshot", js.Any.fromFunction1(value))
      
      inline def setTakeScreenshot(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "takeScreenshot", js.Any.fromFunction1(value))
      
      inline def setUpdateMockSensor(
        value: /* args */ Parameters[
              js.Function4[
                /* type */ String, 
                /* mockSensorType */ String, 
                /* maxSamplingFrequency */ Double, 
                /* minSamplingFrequency */ Double, 
                Unit
              ]
            ] => js.Promise[
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
      ): Self = StObject.set(x, "updateMockSensor", js.Any.fromFunction1(value))
    }
  }
}
