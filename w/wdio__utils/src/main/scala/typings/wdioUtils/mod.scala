package typings.wdioUtils

import typings.node.NodeJS.Global
import typings.std.Error
import typings.wdioUtils.anon.Call
import typings.wdioUtils.anon.Capabilities
import typings.wdioUtils.anon.File
import typings.wdioUtils.anon.IgnoredWorkerServices
import typings.wdioUtils.anon.IsAndroid
import typings.wdioUtils.anon.IsChrome
import typings.wdioUtils.anon.IsDevTools
import typings.wdioUtils.monadMod.PropertiesObject
import typings.wdioUtils.shimMod.Retries
import typings.wdioUtils.typesMod.AfterHookParam
import typings.wdioUtils.typesMod.BeforeHookParam
import typings.wdioUtils.typesMod.HookFnArgs
import typings.wdioUtils.typesMod.SpecFunction
import typings.wdioUtils.wdioUtilsStrings.`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark`
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
  
  @scala.inline
  def canAccess(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canAccess")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def capabilitiesEnvironmentDetector(
    capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any,
    automationProtocol: String
  ): IsAndroid = (^.asInstanceOf[js.Dynamic].applyDynamic("capabilitiesEnvironmentDetector")(capabilities.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[IsAndroid]
  
  @scala.inline
  def commandCallStructure(commandName: String, args: js.Array[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commandCallStructure")(commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def devtoolsEnvironmentDetector(
    hasBrowserName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any
  ): IsDevTools = ^.asInstanceOf[js.Dynamic].applyDynamic("devtoolsEnvironmentDetector")(hasBrowserName.asInstanceOf[js.Any]).asInstanceOf[IsDevTools]
  
  @scala.inline
  def executeAsync(fn: js.Function, retries: Retries): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def executeAsync(fn: js.Function, retries: Retries, args: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("@wdio/utils", "executeHooksWithArgs")
  @js.native
  def executeHooksWithArgs: js.Function2[
    /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
    /* args */ js.UndefOr[js.Any | js.Array[js.Any]], 
    js.Promise[js.Array[Error | js.Any]]
  ] = js.native
  @scala.inline
  def executeHooksWithArgs_=(
    x: js.Function2[
      /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
      /* args */ js.UndefOr[js.Any | js.Array[js.Any]], 
      js.Promise[js.Array[Error | js.Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeHooksWithArgs")(x.asInstanceOf[js.Any])
  
  /* was `typeof executeSyncFn` */
  @scala.inline
  def executeSync(fn: js.Function, retries: Retries): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def executeSync(fn: js.Function, retries: Retries, args: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def getArgumentType(arg: js.Any): string | number | bigint | boolean | symbol | undefined | `object` | function | `null` = ^.asInstanceOf[js.Dynamic].applyDynamic("getArgumentType")(arg.asInstanceOf[js.Any]).asInstanceOf[string | number | bigint | boolean | symbol | undefined | `object` | function | `null`]
  
  @JSImport("@wdio/utils", "hasWdioSyncSupport")
  @js.native
  def hasWdioSyncSupport: Boolean = js.native
  @scala.inline
  def hasWdioSyncSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasWdioSyncSupport")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def initialiseLauncherService(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    caps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ): IgnoredWorkerServices = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseLauncherService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[IgnoredWorkerServices]
  
  @scala.inline
  def initialisePlugin(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initialisePlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def initialisePlugin(name: String, `type`: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initialisePlugin")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def initialiseWorkerService(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    caps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ]]
  @scala.inline
  def initialiseWorkerService(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    caps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any,
    ignoredWorkerServices: js.Array[String]
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any], ignoredWorkerServices.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ]]
  
  @scala.inline
  def isFunctionAsync(fn: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidParameter(arg: js.Any, expectedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidParameter")(arg.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isW3C(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")().asInstanceOf[Boolean]
  @scala.inline
  def isW3C(
    capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")(capabilities.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@wdio/utils", "runFnInFiberContext")
  @js.native
  def runFnInFiberContext: js.Function1[
    /* fn */ js.Function, 
    js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Promise[js.Any]]
  ] = js.native
  @scala.inline
  def runFnInFiberContext_=(
    x: js.Function1[
      /* fn */ js.Function, 
      js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, js.Promise[js.Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runFnInFiberContext")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[js.Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[js.Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[js.Any],
    fnName: String,
    cid: String,
    scope: Global & (/* globalThis */ js.Any)
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def safeRequire(name: String): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceClass */ js.Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("safeRequire")(name.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceClass */ js.Any) | Null]
  
  @scala.inline
  def sessionEnvironmentDetector(hasCapabilitiesRequestedCapabilities: Capabilities): IsChrome = ^.asInstanceOf[js.Dynamic].applyDynamic("sessionEnvironmentDetector")(hasCapabilitiesRequestedCapabilities.asInstanceOf[js.Any]).asInstanceOf[IsChrome]
  
  @scala.inline
  def sleep(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")().asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def sleep(ms: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def testFnWrapper(
    args_0: String,
    args_1: SpecFunction,
    args_2: BeforeHookParam[js.Any],
    args_3: AfterHookParam[js.Any],
    args_4: String,
    args_5: Double
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFnWrapper")(args_0.asInstanceOf[js.Any], args_1.asInstanceOf[js.Any], args_2.asInstanceOf[js.Any], args_3.asInstanceOf[js.Any], args_4.asInstanceOf[js.Any], args_5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def transformCommandLogResult(result: File): `QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | File = ^.asInstanceOf[js.Dynamic].applyDynamic("transformCommandLogResult")(result.asInstanceOf[js.Any]).asInstanceOf[`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | File]
  
  @scala.inline
  def webdriverMonad(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any
  ): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any]).asInstanceOf[Call]
  @scala.inline
  def webdriverMonad(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    modifier: js.Function
  ): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Call]
  @scala.inline
  def webdriverMonad(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    modifier: js.Function,
    propertiesObject: PropertiesObject
  ): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  @scala.inline
  def webdriverMonad(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    modifier: Unit,
    propertiesObject: PropertiesObject
  ): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  @JSImport("@wdio/utils", "wrapCommand")
  @js.native
  def wrapCommand: js.Function2[
    /* commandName */ String, 
    /* fn */ js.Function, 
    js.Function1[/* args */ js.Any, js.Promise[js.Any]]
  ] = js.native
  @scala.inline
  def wrapCommand_=(
    x: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function, 
      js.Function1[/* args */ js.Any, js.Promise[js.Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapCommand")(x.asInstanceOf[js.Any])
}
