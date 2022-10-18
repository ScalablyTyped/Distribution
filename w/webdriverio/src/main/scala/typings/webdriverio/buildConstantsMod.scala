package typings.webdriverio

import typings.webdriverio.anon.Default
import typings.webdriverio.anon.DefaultMatch
import typings.webdriverio.anon.DefaultMatchRequired
import typings.webdriverio.anon.DefaultMatchRequiredType
import typings.webdriverio.anon.DefaultMatchRequiredTypeValidate
import typings.webdriverio.anon.Match
import typings.webdriverio.anon.MatchRequired
import typings.webdriverio.anon.MatchRequiredType
import typings.webdriverio.anon.MatchRequiredTypeValidate
import typings.webdriverio.anon.Required
import typings.webdriverio.anon.RequiredType
import typings.webdriverio.anon.RequiredTypeValidate
import typings.webdriverio.anon.Type
import typings.webdriverio.anon.TypeValidate
import typings.webdriverio.anon.Validate
import typings.webdriverio.anon.`0`
import typings.webdriverio.anon.`10`
import typings.webdriverio.anon.`11`
import typings.webdriverio.anon.`12`
import typings.webdriverio.anon.`13`
import typings.webdriverio.anon.`14`
import typings.webdriverio.anon.`15`
import typings.webdriverio.anon.`16`
import typings.webdriverio.anon.`17`
import typings.webdriverio.anon.`18`
import typings.webdriverio.anon.`19`
import typings.webdriverio.anon.`1`
import typings.webdriverio.anon.`20`
import typings.webdriverio.anon.`21`
import typings.webdriverio.anon.`22`
import typings.webdriverio.anon.`23`
import typings.webdriverio.anon.`24`
import typings.webdriverio.anon.`25`
import typings.webdriverio.anon.`2`
import typings.webdriverio.anon.`3`
import typings.webdriverio.anon.`4`
import typings.webdriverio.anon.`5`
import typings.webdriverio.anon.`6`
import typings.webdriverio.anon.`7`
import typings.webdriverio.anon.`8`
import typings.webdriverio.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConstantsMod {
  
  @JSImport("webdriverio/build/constants", "ARIA_SELECTOR")
  @js.native
  val ARIA_SELECTOR: /* "aria/" */ String = js.native
  
  @JSImport("webdriverio/build/constants", "DEEP_SELECTOR")
  @js.native
  val DEEP_SELECTOR: /* ">>>" */ String = js.native
  
  object DRIVER_DEFAULT_ENDPOINT {
    
    @JSImport("webdriverio/build/constants", "DRIVER_DEFAULT_ENDPOINT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriverio/build/constants", "DRIVER_DEFAULT_ENDPOINT.host")
    @js.native
    def host: String = js.native
    inline def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "DRIVER_DEFAULT_ENDPOINT.method")
    @js.native
    def method: String = js.native
    inline def method_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("method")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "DRIVER_DEFAULT_ENDPOINT.path")
    @js.native
    def path: String = js.native
    inline def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "DRIVER_DEFAULT_ENDPOINT.port")
    @js.native
    def port: Double = js.native
    inline def port_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriverio/build/constants", "ELEMENT_KEY")
  @js.native
  val ELEMENT_KEY: /* "element-6066-11e4-a52e-4f735466cecf" */ String = js.native
  
  @JSImport("webdriverio/build/constants", "ERROR_REASON")
  @js.native
  val ERROR_REASON: js.Array[String] = js.native
  
  @JSImport("webdriverio/build/constants", "FF_REMOTE_DEBUG_ARG")
  @js.native
  val FF_REMOTE_DEBUG_ARG: /* "-remote-debugging-port" */ String = js.native
  
  @JSImport("webdriverio/build/constants", "W3C_SELECTOR_STRATEGIES")
  @js.native
  val W3C_SELECTOR_STRATEGIES: js.Array[String] = js.native
  
  /* Inlined @wdio/types.@wdio/types.Options.Definition<@wdio/types.@wdio/types.Options.WebdriverIO & @wdio/types.@wdio/types.Options.Testrunner> */
  object WDIO_DEFAULTS {
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.after")
    @js.native
    def after: js.UndefOr[`9`] = js.native
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.afterCommand")
    @js.native
    def afterCommand: js.UndefOr[`6`] = js.native
    inline def afterCommand_=(x: js.UndefOr[`6`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterCommand")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.afterHook")
    @js.native
    def afterHook: js.UndefOr[Default] = js.native
    inline def afterHook_=(x: js.UndefOr[Default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterHook")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.afterSession")
    @js.native
    def afterSession: js.UndefOr[`24`] = js.native
    inline def afterSession_=(x: js.UndefOr[`24`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterSession")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.afterSuite")
    @js.native
    def afterSuite: js.UndefOr[MatchRequired] = js.native
    inline def afterSuite_=(x: js.UndefOr[MatchRequired]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterSuite")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.afterTest")
    @js.native
    def afterTest: js.UndefOr[Default] = js.native
    inline def afterTest_=(x: js.UndefOr[Default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterTest")(x.asInstanceOf[js.Any])
    
    inline def after_=(x: js.UndefOr[`9`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.agent")
    @js.native
    def agent: js.UndefOr[DefaultMatchRequired] = js.native
    inline def agent_=(x: js.UndefOr[DefaultMatchRequired]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agent")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.autoCompileOpts")
    @js.native
    def autoCompileOpts: js.UndefOr[`25`] = js.native
    inline def autoCompileOpts_=(x: js.UndefOr[`25`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoCompileOpts")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.automationProtocol")
    @js.native
    def automationProtocol: js.UndefOr[`20`] = js.native
    inline def automationProtocol_=(x: js.UndefOr[`20`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("automationProtocol")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.bail")
    @js.native
    def bail: js.UndefOr[MatchRequiredType] = js.native
    inline def bail_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bail")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.baseUrl")
    @js.native
    def baseUrl: js.UndefOr[`16`] = js.native
    inline def baseUrl_=(x: js.UndefOr[`16`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.before")
    @js.native
    def before: js.UndefOr[`12`] = js.native
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.beforeCommand")
    @js.native
    def beforeCommand: js.UndefOr[`13`] = js.native
    inline def beforeCommand_=(x: js.UndefOr[`13`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeCommand")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.beforeHook")
    @js.native
    def beforeHook: js.UndefOr[`22`] = js.native
    inline def beforeHook_=(x: js.UndefOr[`22`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeHook")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.beforeSession")
    @js.native
    def beforeSession: js.UndefOr[`21`] = js.native
    inline def beforeSession_=(x: js.UndefOr[`21`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeSession")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.beforeSuite")
    @js.native
    def beforeSuite: js.UndefOr[MatchRequired] = js.native
    inline def beforeSuite_=(x: js.UndefOr[MatchRequired]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeSuite")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.beforeTest")
    @js.native
    def beforeTest: js.UndefOr[`3`] = js.native
    inline def beforeTest_=(x: js.UndefOr[`3`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeTest")(x.asInstanceOf[js.Any])
    
    inline def before_=(x: js.UndefOr[`12`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.capabilities")
    @js.native
    def capabilities: RequiredType = js.native
    inline def capabilities_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.connectionRetryCount")
    @js.native
    def connectionRetryCount: js.UndefOr[DefaultMatch] = js.native
    inline def connectionRetryCount_=(x: js.UndefOr[DefaultMatch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryCount")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.connectionRetryTimeout")
    @js.native
    def connectionRetryTimeout: js.UndefOr[DefaultMatch] = js.native
    inline def connectionRetryTimeout_=(x: js.UndefOr[DefaultMatch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.cucumberFeaturesWithLineNumbers")
    @js.native
    def cucumberFeaturesWithLineNumbers: js.UndefOr[DefaultMatchRequiredType] = js.native
    inline def cucumberFeaturesWithLineNumbers_=(x: js.UndefOr[DefaultMatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cucumberFeaturesWithLineNumbers")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.cucumberOpts")
    @js.native
    def cucumberOpts: js.UndefOr[`7`] = js.native
    inline def cucumberOpts_=(x: js.UndefOr[`7`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cucumberOpts")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.enableDirectConnect")
    @js.native
    def enableDirectConnect: js.UndefOr[RequiredTypeValidate] = js.native
    inline def enableDirectConnect_=(x: js.UndefOr[RequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDirectConnect")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.exclude")
    @js.native
    def exclude: js.UndefOr[DefaultMatchRequiredType] = js.native
    inline def exclude_=(x: js.UndefOr[DefaultMatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclude")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.execArgv")
    @js.native
    def execArgv: js.UndefOr[DefaultMatchRequiredType] = js.native
    inline def execArgv_=(x: js.UndefOr[DefaultMatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.filesToWatch")
    @js.native
    def filesToWatch: js.UndefOr[DefaultMatchRequiredType] = js.native
    inline def filesToWatch_=(x: js.UndefOr[DefaultMatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filesToWatch")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.framework")
    @js.native
    def framework: js.UndefOr[`16`] = js.native
    inline def framework_=(x: js.UndefOr[`16`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framework")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.headers")
    @js.native
    def headers: js.UndefOr[`15`] = js.native
    inline def headers_=(x: js.UndefOr[`15`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headers")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.headless")
    @js.native
    def headless: js.UndefOr[Type] = js.native
    inline def headless_=(x: js.UndefOr[Type]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headless")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.hostname")
    @js.native
    def hostname: js.UndefOr[MatchRequiredTypeValidate] = js.native
    inline def hostname_=(x: js.UndefOr[MatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hostname")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.jasmineOpts")
    @js.native
    def jasmineOpts: js.UndefOr[`11`] = js.native
    inline def jasmineOpts_=(x: js.UndefOr[`11`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jasmineOpts")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.key")
    @js.native
    def key: js.UndefOr[MatchRequiredTypeValidate] = js.native
    inline def key_=(x: js.UndefOr[MatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.logLevel")
    @js.native
    def logLevel: js.UndefOr[Required] = js.native
    inline def logLevel_=(x: js.UndefOr[Required]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.logLevels")
    @js.native
    def logLevels: js.UndefOr[Match] = js.native
    inline def logLevels_=(x: js.UndefOr[Match]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevels")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.maxInstances")
    @js.native
    def maxInstances: js.UndefOr[MatchRequiredType] = js.native
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.maxInstancesPerCapability")
    @js.native
    def maxInstancesPerCapability: js.UndefOr[MatchRequiredType] = js.native
    inline def maxInstancesPerCapability_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxInstancesPerCapability")(x.asInstanceOf[js.Any])
    
    inline def maxInstances_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.mochaOpts")
    @js.native
    def mochaOpts: js.UndefOr[`8`] = js.native
    inline def mochaOpts_=(x: js.UndefOr[`8`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mochaOpts")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.onComplete")
    @js.native
    def onComplete: js.UndefOr[`5`] = js.native
    inline def onComplete_=(x: js.UndefOr[`5`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.onPrepare")
    @js.native
    def onPrepare: js.UndefOr[`23`] = js.native
    inline def onPrepare_=(x: js.UndefOr[`23`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.onReload")
    @js.native
    def onReload: js.UndefOr[DefaultMatchRequiredTypeValidate] = js.native
    inline def onReload_=(x: js.UndefOr[DefaultMatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReload")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.onWorkerEnd")
    @js.native
    def onWorkerEnd: js.UndefOr[Validate] = js.native
    inline def onWorkerEnd_=(x: js.UndefOr[Validate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onWorkerEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.onWorkerStart")
    @js.native
    def onWorkerStart: js.UndefOr[`19`] = js.native
    inline def onWorkerStart_=(x: js.UndefOr[`19`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onWorkerStart")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.outputDir")
    @js.native
    def outputDir: js.UndefOr[MatchRequiredTypeValidate] = js.native
    inline def outputDir_=(x: js.UndefOr[MatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.path")
    @js.native
    def path: js.UndefOr[MatchRequiredTypeValidate] = js.native
    inline def path_=(x: js.UndefOr[MatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.port")
    @js.native
    def port: js.UndefOr[DefaultMatch] = js.native
    inline def port_=(x: js.UndefOr[DefaultMatch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.protocol")
    @js.native
    def protocol: js.UndefOr[MatchRequiredTypeValidate] = js.native
    inline def protocol_=(x: js.UndefOr[MatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocol")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.queryParams")
    @js.native
    def queryParams: js.UndefOr[`15`] = js.native
    inline def queryParams_=(x: js.UndefOr[`15`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.region")
    @js.native
    def region: js.UndefOr[`0`] = js.native
    inline def region_=(x: js.UndefOr[`0`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("region")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.reporterSyncInterval")
    @js.native
    def reporterSyncInterval: js.UndefOr[MatchRequiredType] = js.native
    inline def reporterSyncInterval_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reporterSyncInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.reporterSyncTimeout")
    @js.native
    def reporterSyncTimeout: js.UndefOr[MatchRequiredType] = js.native
    inline def reporterSyncTimeout_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reporterSyncTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.reporters")
    @js.native
    def reporters: js.UndefOr[`18`] = js.native
    inline def reporters_=(x: js.UndefOr[`18`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reporters")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.runner")
    @js.native
    def runner: js.UndefOr[`10`] = js.native
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.runnerEnv")
    @js.native
    def runnerEnv: js.UndefOr[`4`] = js.native
    inline def runnerEnv_=(x: js.UndefOr[`4`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runnerEnv")(x.asInstanceOf[js.Any])
    
    inline def runner_=(x: js.UndefOr[`10`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runner")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.services")
    @js.native
    def services: js.UndefOr[`14`] = js.native
    inline def services_=(x: js.UndefOr[`14`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("services")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.specFileRetries")
    @js.native
    def specFileRetries: js.UndefOr[MatchRequiredType] = js.native
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.specFileRetriesDeferred")
    @js.native
    def specFileRetriesDeferred: js.UndefOr[Type] = js.native
    inline def specFileRetriesDeferred_=(x: js.UndefOr[Type]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specFileRetriesDeferred")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.specFileRetriesDelay")
    @js.native
    def specFileRetriesDelay: js.UndefOr[MatchRequiredType] = js.native
    inline def specFileRetriesDelay_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specFileRetriesDelay")(x.asInstanceOf[js.Any])
    
    inline def specFileRetries_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specFileRetries")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.specs")
    @js.native
    def specs: js.UndefOr[`2`] = js.native
    inline def specs_=(x: js.UndefOr[`2`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specs")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.strictSSL")
    @js.native
    def strictSSL: js.UndefOr[RequiredTypeValidate] = js.native
    inline def strictSSL_=(x: js.UndefOr[RequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.suites")
    @js.native
    def suites: js.UndefOr[`17`] = js.native
    inline def suites_=(x: js.UndefOr[`17`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suites")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.transformRequest")
    @js.native
    def transformRequest: js.UndefOr[`1`] = js.native
    inline def transformRequest_=(x: js.UndefOr[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.transformResponse")
    @js.native
    def transformResponse: js.UndefOr[TypeValidate] = js.native
    inline def transformResponse_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.user")
    @js.native
    def user: js.UndefOr[MatchRequiredTypeValidate] = js.native
    inline def user_=(x: js.UndefOr[MatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("user")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.waitforInterval")
    @js.native
    def waitforInterval: js.UndefOr[MatchRequiredType] = js.native
    inline def waitforInterval_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitforInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.waitforTimeout")
    @js.native
    def waitforTimeout: js.UndefOr[MatchRequiredType] = js.native
    inline def waitforTimeout_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitforTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/constants", "WDIO_DEFAULTS.watch")
    @js.native
    def watch: js.UndefOr[Type] = js.native
    inline def watch_=(x: js.UndefOr[Type]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watch")(x.asInstanceOf[js.Any])
  }
}
