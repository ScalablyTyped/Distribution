package typings.wdioUtils

import typings.std.Record
import typings.wdioTypes.buildCapabilitiesMod.Capabilities
import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typings.wdioTypes.buildOptionsMod.Testrunner
import typings.wdioTypes.buildServicesMod.RunnerPlugin
import typings.wdioTypes.buildServicesMod.ServiceInstance
import typings.wdioTypes.buildServicesMod.ServicePlugin
import typings.wdioUtils.anon.Call
import typings.wdioUtils.anon.File
import typings.wdioUtils.anon.IgnoredWorkerServices
import typings.wdioUtils.anon.IsAndroid
import typings.wdioUtils.anon.IsChrome
import typings.wdioUtils.anon.IsDevTools
import typings.wdioUtils.anon.OmitTestrunnercapabilitie
import typings.wdioUtils.buildMonadMod.PropertiesObject
import typings.wdioUtils.buildShimMod.Retries
import typings.wdioUtils.buildTestFrameworkTypesMod.AfterHookParam
import typings.wdioUtils.buildTestFrameworkTypesMod.BeforeHookParam
import typings.wdioUtils.buildTestFrameworkTypesMod.HookFnArgs
import typings.wdioUtils.buildTestFrameworkTypesMod.SpecFunction
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae000
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae001
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae002
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae003
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae004
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae005
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae006
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae007
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae008
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae009
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae00a
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae00b
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae00c
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae00d
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae00e
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae00f
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae010
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae011
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae012
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae013
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae014
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae015
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae016
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae017
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae018
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae019
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae01a
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae01b
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae01c
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae01d
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae01e
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae01f
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae020
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae021
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae022
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae023
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae024
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae025
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae026
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae027
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae028
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae029
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae031
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae032
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae033
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae034
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae035
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae036
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae037
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae038
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae039
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae03a
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae03b
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae03c
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae03d
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae040
import typings.wdioUtils.wdioUtilsStrings.Privateuseareae051
import typings.wdioUtils.wdioUtilsStrings.`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark`
import typings.wdioUtils.wdioUtilsStrings.`QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark`
import typings.wdioUtils.wdioUtilsStrings.`null`
import typings.wdioUtils.wdioUtilsStrings.`object`
import typings.wdioUtils.wdioUtilsStrings.bigint
import typings.wdioUtils.wdioUtilsStrings.boolean
import typings.wdioUtils.wdioUtilsStrings.function
import typings.wdioUtils.wdioUtilsStrings.number
import typings.wdioUtils.wdioUtilsStrings.string
import typings.wdioUtils.wdioUtilsStrings.symbol
import typings.wdioUtils.wdioUtilsStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object UNICODE_CHARACTERS {
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Add")
    @js.native
    val Add: Privateuseareae025 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Alt")
    @js.native
    val Alt: Privateuseareae00a = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowDown")
    @js.native
    val ArrowDown: Privateuseareae015 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowLeft")
    @js.native
    val ArrowLeft: Privateuseareae012 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowRight")
    @js.native
    val ArrowRight: Privateuseareae014 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowUp")
    @js.native
    val ArrowUp: Privateuseareae013 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Down")
    @js.native
    val Arrow_Down: Privateuseareae015 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Left")
    @js.native
    val Arrow_Left: Privateuseareae012 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Right")
    @js.native
    val Arrow_Right: Privateuseareae014 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Up")
    @js.native
    val Arrow_Up: Privateuseareae013 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Back space")
    @js.native
    val `Back space`: Privateuseareae003 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Backspace")
    @js.native
    val Backspace: Privateuseareae003 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Cancel")
    @js.native
    val Cancel: Privateuseareae001 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Clear")
    @js.native
    val Clear: Privateuseareae005 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Command")
    @js.native
    val Command: Privateuseareae03d = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Control")
    @js.native
    val Control: Privateuseareae009 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Control Left")
    @js.native
    val ControlLeft: Privateuseareae009 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Control Right")
    @js.native
    val ControlRight: Privateuseareae051 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Decimal")
    @js.native
    val Decimal: Privateuseareae028 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Delete")
    @js.native
    val Delete: Privateuseareae017 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Divide")
    @js.native
    val Divide: Privateuseareae029 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Down arrow")
    @js.native
    val DownArrow: Privateuseareae015 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.End")
    @js.native
    val End: Privateuseareae010 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Enter")
    @js.native
    val Enter: Privateuseareae007 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Equals")
    @js.native
    val Equals: Privateuseareae019 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Escape")
    @js.native
    val Escape: Privateuseareae00c = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F1")
    @js.native
    val F1: Privateuseareae031 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F10")
    @js.native
    val F10: Privateuseareae03a = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F11")
    @js.native
    val F11: Privateuseareae03b = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F12")
    @js.native
    val F12: Privateuseareae03c = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F2")
    @js.native
    val F2: Privateuseareae032 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F3")
    @js.native
    val F3: Privateuseareae033 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F4")
    @js.native
    val F4: Privateuseareae034 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F5")
    @js.native
    val F5: Privateuseareae035 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F6")
    @js.native
    val F6: Privateuseareae036 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F7")
    @js.native
    val F7: Privateuseareae037 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F8")
    @js.native
    val F8: Privateuseareae038 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F9")
    @js.native
    val F9: Privateuseareae039 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Help")
    @js.native
    val Help: Privateuseareae002 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Home")
    @js.native
    val Home: Privateuseareae011 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Insert")
    @js.native
    val Insert: Privateuseareae016 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Left arrow")
    @js.native
    val LeftArrow: Privateuseareae012 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Meta")
    @js.native
    val Meta: Privateuseareae03d = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Multiply")
    @js.native
    val Multiply: Privateuseareae024 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.NULL")
    @js.native
    val NULL: Privateuseareae000 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 0")
    @js.native
    val Numpad0: Privateuseareae01a = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 1")
    @js.native
    val Numpad1: Privateuseareae01b = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 2")
    @js.native
    val Numpad2: Privateuseareae01c = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 3")
    @js.native
    val Numpad3: Privateuseareae01d = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 4")
    @js.native
    val Numpad4: Privateuseareae01e = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 5")
    @js.native
    val Numpad5: Privateuseareae01f = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 6")
    @js.native
    val Numpad6: Privateuseareae020 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 7")
    @js.native
    val Numpad7: Privateuseareae021 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 8")
    @js.native
    val Numpad8: Privateuseareae022 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 9")
    @js.native
    val Numpad9: Privateuseareae023 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.PageDown")
    @js.native
    val PageDown_ : Privateuseareae00f = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.PageUp")
    @js.native
    val PageUp_ : Privateuseareae00e = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Page_Down")
    @js.native
    val Page_Down: Privateuseareae00f = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Page_Up")
    @js.native
    val Page_Up: Privateuseareae00e = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Pagedown")
    @js.native
    val Pagedown: Privateuseareae00f = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Pageup")
    @js.native
    val Pageup: Privateuseareae00e = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Pause")
    @js.native
    val Pause: Privateuseareae00b = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Return")
    @js.native
    val Return: Privateuseareae006 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Right arrow")
    @js.native
    val RightArrow: Privateuseareae014 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Semicolon")
    @js.native
    val Semicolon: Privateuseareae018 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Separator")
    @js.native
    val Separator: Privateuseareae026 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Shift")
    @js.native
    val Shift: Privateuseareae008 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Space")
    @js.native
    val Space: Privateuseareae00d = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Subtract")
    @js.native
    val Subtract: Privateuseareae027 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Tab")
    @js.native
    val Tab: Privateuseareae004 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Unidentified")
    @js.native
    val Unidentified: Privateuseareae000 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Up arrow")
    @js.native
    val UpArrow: Privateuseareae013 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ZenkakuHankaku")
    @js.native
    val ZenkakuHankaku: Privateuseareae040 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Zenkaku_Hankaku")
    @js.native
    val Zenkaku_Hankaku: Privateuseareae040 = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS. ")
    @js.native
    val _empty: Privateuseareae00d = js.native
  }
  
  inline def canAccess(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canAccess")().asInstanceOf[Boolean]
  inline def canAccess(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canAccess")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def capabilitiesEnvironmentDetector(capabilities: Capabilities, automationProtocol: String): IsAndroid = (^.asInstanceOf[js.Dynamic].applyDynamic("capabilitiesEnvironmentDetector")(capabilities.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[IsAndroid]
  
  inline def commandCallStructure(commandName: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commandCallStructure")(commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def devtoolsEnvironmentDetector(param0: Capabilities): IsDevTools = ^.asInstanceOf[js.Dynamic].applyDynamic("devtoolsEnvironmentDetector")(param0.asInstanceOf[js.Any]).asInstanceOf[IsDevTools]
  
  /**
    * execute test or hook asynchronously
    *
    * @param  {Function} fn         spec or hook method
    * @param  {object}   retries    { limit: number, attempts: number }
    * @param  {Array}    args       arguments passed to hook
    * @return {Promise}             that gets resolved once test/hook is done or was retried enough
    */
  inline def executeAsync(fn: js.Function, retries: Retries): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def executeAsync(fn: js.Function, retries: Retries, args: js.Array[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def executeHooksWithArgs[T](hookName: String): js.Promise[js.Array[js.Error | T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Array[js.Function]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Array[js.Function], args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Function): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: js.Function, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  inline def executeHooksWithArgs[T](hookName: String, hooks: Unit, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeHooksWithArgs")(hookName.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Error | T]]]
  
  inline def getArgumentType(arg: Any): string | number | bigint | boolean | symbol | undefined | `object` | function | `null` = ^.asInstanceOf[js.Dynamic].applyDynamic("getArgumentType")(arg.asInstanceOf[js.Any]).asInstanceOf[string | number | bigint | boolean | symbol | undefined | `object` | function | `null`]
  
  inline def initialiseLauncherService(config: OmitTestrunnercapabilitie, caps: DesiredCapabilities): js.Promise[IgnoredWorkerServices] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseLauncherService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IgnoredWorkerServices]]
  
  inline def initialisePlugin(name: String): js.Promise[ServicePlugin | RunnerPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialisePlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ServicePlugin | RunnerPlugin]]
  inline def initialisePlugin(name: String, `type`: String): js.Promise[ServicePlugin | RunnerPlugin] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialisePlugin")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ServicePlugin | RunnerPlugin]]
  
  inline def initialiseWorkerService(config: Testrunner, caps: DesiredCapabilities): js.Promise[js.Array[ServiceInstance]] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ServiceInstance]]]
  inline def initialiseWorkerService(config: Testrunner, caps: DesiredCapabilities, ignoredWorkerServices: js.Array[String]): js.Promise[js.Array[ServiceInstance]] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any], ignoredWorkerServices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ServiceInstance]]]
  
  inline def isFunctionAsync(fn: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidParameter(arg: Any, expectedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidParameter")(arg.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isW3C(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")().asInstanceOf[Boolean]
  inline def isW3C(capabilities: DesiredCapabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")(capabilities.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def safeImport(name: String): js.Promise[ServicePlugin | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeImport")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ServicePlugin | Null]]
  
  inline def sessionEnvironmentDetector(param0: typings.wdioUtils.anon.Capabilities): IsChrome = ^.asInstanceOf[js.Dynamic].applyDynamic("sessionEnvironmentDetector")(param0.asInstanceOf[js.Any]).asInstanceOf[IsChrome]
  
  inline def sleep(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")().asInstanceOf[js.Promise[Any]]
  inline def sleep(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def testFnWrapper(
    args_0: String,
    args_1: SpecFunction,
    args_2: BeforeHookParam[Any],
    args_3: AfterHookParam[Any],
    args_4: String,
    args_5: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFnWrapper")(args_0.asInstanceOf[js.Any], args_1.asInstanceOf[js.Any], args_2.asInstanceOf[js.Any], args_3.asInstanceOf[js.Any], args_4.asInstanceOf[js.Any], args_5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def transformCommandLogResult(result: File): `QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | `QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark` | File = ^.asInstanceOf[js.Dynamic].applyDynamic("transformCommandLogResult")(result.asInstanceOf[js.Any]).asInstanceOf[`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | `QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark` | File]
  
  inline def webdriverMonad(options: Record[String, Any]): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def webdriverMonad(options: Record[String, Any], modifier: js.Function): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def webdriverMonad(options: Record[String, Any], modifier: js.Function, propertiesObject: PropertiesObject): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def webdriverMonad(options: Record[String, Any], modifier: Unit, propertiesObject: PropertiesObject): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  /**
    * wrap command to enable before and after command to be executed
    * @param commandName name of the command (e.g. getTitle)
    * @param fn          command function
    */
  inline def wrapCommand[T](commandName: String, fn: js.Function): js.Function1[/* args */ Any, js.Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCommand")(commandName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Any, js.Promise[T]]]
  
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrapGlobalTestMethod(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapGlobalTestMethod")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
