package typings.wdioConfig

import typings.wdioConfig.wdioConfigStrings.info
import typings.wdioConfig.wdioConfigStrings.local
import typings.wdioConfig.wdioConfigStrings.mocha
import typings.webdriver.WebDriver.DesiredCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After extends StObject {
    
    var after: js.Array[scala.Nothing]
    
    var afterCommand: js.Array[scala.Nothing]
    
    var afterFeature: js.Array[scala.Nothing]
    
    var afterHook: js.Array[scala.Nothing]
    
    var afterScenario: js.Array[scala.Nothing]
    
    var afterSession: js.Array[scala.Nothing]
    
    var afterStep: js.Array[scala.Nothing]
    
    var afterSuite: js.Array[scala.Nothing]
    
    var afterTest: js.Array[scala.Nothing]
    
    var bail: Double
    
    var before: js.Array[scala.Nothing]
    
    var beforeCommand: js.Array[scala.Nothing]
    
    var beforeFeature: js.Array[scala.Nothing]
    
    var beforeHook: js.Array[scala.Nothing]
    
    var beforeScenario: js.Array[scala.Nothing]
    
    var beforeSession: js.Array[scala.Nothing]
    
    var beforeStep: js.Array[scala.Nothing]
    
    var beforeSuite: js.Array[scala.Nothing]
    
    var beforeTest: js.Array[scala.Nothing]
    
    var connectionRetryCount: Double
    
    var connectionRetryTimeout: Double
    
    var cucumberOpts: Timeout
    
    var exclude: js.Array[scala.Nothing]
    
    var excludeDriverLogs: js.Array[scala.Nothing]
    
    var execArgv: js.Array[scala.Nothing]
    
    var filesToWatch: js.Array[scala.Nothing]
    
    var framework: mocha
    
    var jasmineNodeOpts: DefaultTimeoutInterval
    
    var logLevel: info
    
    var maxInstances: Double
    
    var maxInstancesPerCapability: Double
    
    var mochaOpts: Timeout
    
    var onComplete: js.Array[scala.Nothing]
    
    var onPrepare: js.Array[scala.Nothing]
    
    var onReload: js.Array[scala.Nothing]
    
    var onWorkerStart: js.Array[scala.Nothing]
    
    var outputDir: Unit
    
    var reporters: js.Array[scala.Nothing]
    
    var runner: local
    
    var services: js.Array[scala.Nothing]
    
    var specs: js.Array[scala.Nothing]
    
    var waitforInterval: Double
    
    var waitforTimeout: Double
  }
  object After {
    
    @scala.inline
    def apply(
      after: js.Array[scala.Nothing],
      afterCommand: js.Array[scala.Nothing],
      afterFeature: js.Array[scala.Nothing],
      afterHook: js.Array[scala.Nothing],
      afterScenario: js.Array[scala.Nothing],
      afterSession: js.Array[scala.Nothing],
      afterStep: js.Array[scala.Nothing],
      afterSuite: js.Array[scala.Nothing],
      afterTest: js.Array[scala.Nothing],
      bail: Double,
      before: js.Array[scala.Nothing],
      beforeCommand: js.Array[scala.Nothing],
      beforeFeature: js.Array[scala.Nothing],
      beforeHook: js.Array[scala.Nothing],
      beforeScenario: js.Array[scala.Nothing],
      beforeSession: js.Array[scala.Nothing],
      beforeStep: js.Array[scala.Nothing],
      beforeSuite: js.Array[scala.Nothing],
      beforeTest: js.Array[scala.Nothing],
      connectionRetryCount: Double,
      connectionRetryTimeout: Double,
      cucumberOpts: Timeout,
      exclude: js.Array[scala.Nothing],
      excludeDriverLogs: js.Array[scala.Nothing],
      execArgv: js.Array[scala.Nothing],
      filesToWatch: js.Array[scala.Nothing],
      jasmineNodeOpts: DefaultTimeoutInterval,
      maxInstances: Double,
      maxInstancesPerCapability: Double,
      mochaOpts: Timeout,
      onComplete: js.Array[scala.Nothing],
      onPrepare: js.Array[scala.Nothing],
      onReload: js.Array[scala.Nothing],
      onWorkerStart: js.Array[scala.Nothing],
      outputDir: Unit,
      reporters: js.Array[scala.Nothing],
      services: js.Array[scala.Nothing],
      specs: js.Array[scala.Nothing],
      waitforInterval: Double,
      waitforTimeout: Double
    ): After = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterCommand = afterCommand.asInstanceOf[js.Any], afterFeature = afterFeature.asInstanceOf[js.Any], afterHook = afterHook.asInstanceOf[js.Any], afterScenario = afterScenario.asInstanceOf[js.Any], afterSession = afterSession.asInstanceOf[js.Any], afterStep = afterStep.asInstanceOf[js.Any], afterSuite = afterSuite.asInstanceOf[js.Any], afterTest = afterTest.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], beforeCommand = beforeCommand.asInstanceOf[js.Any], beforeFeature = beforeFeature.asInstanceOf[js.Any], beforeHook = beforeHook.asInstanceOf[js.Any], beforeScenario = beforeScenario.asInstanceOf[js.Any], beforeSession = beforeSession.asInstanceOf[js.Any], beforeStep = beforeStep.asInstanceOf[js.Any], beforeSuite = beforeSuite.asInstanceOf[js.Any], beforeTest = beforeTest.asInstanceOf[js.Any], connectionRetryCount = connectionRetryCount.asInstanceOf[js.Any], connectionRetryTimeout = connectionRetryTimeout.asInstanceOf[js.Any], cucumberOpts = cucumberOpts.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], excludeDriverLogs = excludeDriverLogs.asInstanceOf[js.Any], execArgv = execArgv.asInstanceOf[js.Any], filesToWatch = filesToWatch.asInstanceOf[js.Any], framework = "mocha", jasmineNodeOpts = jasmineNodeOpts.asInstanceOf[js.Any], logLevel = "info", maxInstances = maxInstances.asInstanceOf[js.Any], maxInstancesPerCapability = maxInstancesPerCapability.asInstanceOf[js.Any], mochaOpts = mochaOpts.asInstanceOf[js.Any], onComplete = onComplete.asInstanceOf[js.Any], onPrepare = onPrepare.asInstanceOf[js.Any], onReload = onReload.asInstanceOf[js.Any], onWorkerStart = onWorkerStart.asInstanceOf[js.Any], outputDir = outputDir.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], runner = "local", services = services.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], waitforInterval = waitforInterval.asInstanceOf[js.Any], waitforTimeout = waitforTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: js.Array[scala.Nothing]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCommand(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCommandVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterCommand", js.Array(value :_*))
      
      @scala.inline
      def setAfterFeature(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterFeature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterFeatureVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterFeature", js.Array(value :_*))
      
      @scala.inline
      def setAfterHook(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterHookVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterHook", js.Array(value :_*))
      
      @scala.inline
      def setAfterScenario(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterScenario", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterScenarioVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterScenario", js.Array(value :_*))
      
      @scala.inline
      def setAfterSession(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterSessionVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterSession", js.Array(value :_*))
      
      @scala.inline
      def setAfterStep(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterStepVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterStep", js.Array(value :_*))
      
      @scala.inline
      def setAfterSuite(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterSuite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterSuiteVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterSuite", js.Array(value :_*))
      
      @scala.inline
      def setAfterTest(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterTest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterTestVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterTest", js.Array(value :_*))
      
      @scala.inline
      def setAfterVarargs(value: scala.Nothing*): Self = StObject.set(x, "after", js.Array(value :_*))
      
      @scala.inline
      def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: js.Array[scala.Nothing]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommand(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCommandVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeCommand", js.Array(value :_*))
      
      @scala.inline
      def setBeforeFeature(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeFeature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeFeatureVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeFeature", js.Array(value :_*))
      
      @scala.inline
      def setBeforeHook(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeHookVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeHook", js.Array(value :_*))
      
      @scala.inline
      def setBeforeScenario(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeScenario", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeScenarioVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeScenario", js.Array(value :_*))
      
      @scala.inline
      def setBeforeSession(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeSessionVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeSession", js.Array(value :_*))
      
      @scala.inline
      def setBeforeStep(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeStepVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeStep", js.Array(value :_*))
      
      @scala.inline
      def setBeforeSuite(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeSuite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeSuiteVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeSuite", js.Array(value :_*))
      
      @scala.inline
      def setBeforeTest(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeTest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeTestVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeTest", js.Array(value :_*))
      
      @scala.inline
      def setBeforeVarargs(value: scala.Nothing*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      @scala.inline
      def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCucumberOpts(value: Timeout): Self = StObject.set(x, "cucumberOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclude(value: js.Array[scala.Nothing]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeDriverLogs(value: js.Array[scala.Nothing]): Self = StObject.set(x, "excludeDriverLogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeDriverLogsVarargs(value: scala.Nothing*): Self = StObject.set(x, "excludeDriverLogs", js.Array(value :_*))
      
      @scala.inline
      def setExcludeVarargs(value: scala.Nothing*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExecArgv(value: js.Array[scala.Nothing]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgvVarargs(value: scala.Nothing*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      @scala.inline
      def setFilesToWatch(value: js.Array[scala.Nothing]): Self = StObject.set(x, "filesToWatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesToWatchVarargs(value: scala.Nothing*): Self = StObject.set(x, "filesToWatch", js.Array(value :_*))
      
      @scala.inline
      def setFramework(value: mocha): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJasmineNodeOpts(value: DefaultTimeoutInterval): Self = StObject.set(x, "jasmineNodeOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevel(value: info): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInstancesPerCapability(value: Double): Self = StObject.set(x, "maxInstancesPerCapability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMochaOpts(value: Timeout): Self = StObject.set(x, "mochaOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnComplete(value: js.Array[scala.Nothing]): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteVarargs(value: scala.Nothing*): Self = StObject.set(x, "onComplete", js.Array(value :_*))
      
      @scala.inline
      def setOnPrepare(value: js.Array[scala.Nothing]): Self = StObject.set(x, "onPrepare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPrepareVarargs(value: scala.Nothing*): Self = StObject.set(x, "onPrepare", js.Array(value :_*))
      
      @scala.inline
      def setOnReload(value: js.Array[scala.Nothing]): Self = StObject.set(x, "onReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReloadVarargs(value: scala.Nothing*): Self = StObject.set(x, "onReload", js.Array(value :_*))
      
      @scala.inline
      def setOnWorkerStart(value: js.Array[scala.Nothing]): Self = StObject.set(x, "onWorkerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWorkerStartVarargs(value: scala.Nothing*): Self = StObject.set(x, "onWorkerStart", js.Array(value :_*))
      
      @scala.inline
      def setOutputDir(value: Unit): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporters(value: js.Array[scala.Nothing]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportersVarargs(value: scala.Nothing*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      @scala.inline
      def setRunner(value: local): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServices(value: js.Array[scala.Nothing]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesVarargs(value: scala.Nothing*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      @scala.inline
      def setSpecs(value: js.Array[scala.Nothing]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecsVarargs(value: scala.Nothing*): Self = StObject.set(x, "specs", js.Array(value :_*))
      
      @scala.inline
      def setWaitforInterval(value: Double): Self = StObject.set(x, "waitforInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitforTimeout(value: Double): Self = StObject.set(x, "waitforTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Capabilities extends StObject {
    
    var capabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  }
  object Capabilities {
    
    @scala.inline
    def apply(): Capabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    }
  }
  
  trait DefaultTimeoutInterval extends StObject {
    
    var defaultTimeoutInterval: Double
  }
  object DefaultTimeoutInterval {
    
    @scala.inline
    def apply(defaultTimeoutInterval: Double): DefaultTimeoutInterval = {
      val __obj = js.Dynamic.literal(defaultTimeoutInterval = defaultTimeoutInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultTimeoutInterval]
    }
    
    @scala.inline
    implicit class DefaultTimeoutIntervalMutableBuilder[Self <: DefaultTimeoutInterval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultTimeoutInterval(value: Double): Self = StObject.set(x, "defaultTimeoutInterval", value.asInstanceOf[js.Any])
    }
  }
  
  trait Eu extends StObject {
    
    var eu: String
    
    var `eu-central-1`: String
    
    var us: String
    
    var `us-east-1`: String
  }
  object Eu {
    
    @scala.inline
    def apply(eu: String, `eu-central-1`: String, us: String, `us-east-1`: String): Eu = {
      val __obj = js.Dynamic.literal(eu = eu.asInstanceOf[js.Any], us = us.asInstanceOf[js.Any])
      __obj.updateDynamic("eu-central-1")(`eu-central-1`.asInstanceOf[js.Any])
      __obj.updateDynamic("us-east-1")(`us-east-1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Eu]
    }
    
    @scala.inline
    implicit class EuMutableBuilder[Self <: Eu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEu(value: String): Self = StObject.set(x, "eu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEu-central-1`(value: String): Self = StObject.set(x, "eu-central-1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUs(value: String): Self = StObject.set(x, "us", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUs-east-1`(value: String): Self = StObject.set(x, "us-east-1", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hostname extends StObject {
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
  }
  object Hostname {
    
    @scala.inline
    def apply(): Hostname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  trait Timeout extends StObject {
    
    var timeout: Double
  }
  object Timeout {
    
    @scala.inline
    def apply(timeout: Double): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
