package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof webdriver.WebDriver.Options, 'capabilities'> ]: webdriver.WebDriver.Options[P]} */ trait Config
  extends Options
     with Hooks

object Config {
  @scala.inline
  def apply(
    after: js.Function3[
      /* result */ scala.Double, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    afterCommand: js.Function4[
      /* commandName */ java.lang.String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[nodeLib.Error], 
      scala.Unit
    ] = null,
    afterFeature: js.Function1[/* feature */ java.lang.String, scala.Unit] = null,
    afterHook: js.Function0[scala.Unit] = null,
    afterScenario: js.Function1[/* scenario */ js.Any, scala.Unit] = null,
    afterSession: js.Function3[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    afterStep: js.Function1[/* stepResult */ js.Any, scala.Unit] = null,
    afterSuite: js.Function1[/* suite */ Suite, scala.Unit] = null,
    afterTest: js.Function1[/* test */ Test, scala.Unit] = null,
    bail: scala.Int | scala.Double = null,
    baseUrl: java.lang.String = null,
    before: js.Function2[
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    beforeCommand: js.Function2[/* commandName */ java.lang.String, /* args */ js.Array[_], scala.Unit] = null,
    beforeFeature: js.Function1[/* feature */ java.lang.String, scala.Unit] = null,
    beforeHook: js.Function0[scala.Unit] = null,
    beforeScenario: js.Function1[/* scenario */ java.lang.String, scala.Unit] = null,
    beforeSession: js.Function3[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    beforeStep: js.Function1[/* step */ java.lang.String, scala.Unit] = null,
    beforeSuite: js.Function1[/* suite */ Suite, scala.Unit] = null,
    beforeTest: js.Function1[/* test */ Test, scala.Unit] = null,
    capabilities: webdriverLib.WebDriverNs.DesiredCapabilities | js.Array[webdriverLib.WebDriverNs.DesiredCapabilities] = null,
    exclude: js.Array[java.lang.String] = null,
    execArgv: js.Array[java.lang.String] = null,
    framework: java.lang.String = null,
    jasmineNodeOpts: js.Object = null,
    maxInstances: scala.Int | scala.Double = null,
    maxInstancesPerCapability: scala.Int | scala.Double = null,
    mochaOpts: js.Object = null,
    onComplete: js.Function4[
      /* exitCode */ scala.Double, 
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* results */ Results, 
      scala.Unit
    ] = null,
    onPrepare: js.Function2[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      scala.Unit
    ] = null,
    onReload: js.Function2[/* oldSessionId */ java.lang.String, /* newSessionId */ java.lang.String, scala.Unit] = null,
    outputDir: java.lang.String = null,
    reporters: js.Array[java.lang.String | js.Object] = null,
    runner: java.lang.String = null,
    services: js.Array[java.lang.String | js.Object] = null,
    specs: js.Array[java.lang.String] = null,
    suites: js.Object = null,
    waitforInterval: scala.Int | scala.Double = null,
    waitforTimeout: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(afterCommand)
    if (afterFeature != null) __obj.updateDynamic("afterFeature")(afterFeature)
    if (afterHook != null) __obj.updateDynamic("afterHook")(afterHook)
    if (afterScenario != null) __obj.updateDynamic("afterScenario")(afterScenario)
    if (afterSession != null) __obj.updateDynamic("afterSession")(afterSession)
    if (afterStep != null) __obj.updateDynamic("afterStep")(afterStep)
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(afterSuite)
    if (afterTest != null) __obj.updateDynamic("afterTest")(afterTest)
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(beforeCommand)
    if (beforeFeature != null) __obj.updateDynamic("beforeFeature")(beforeFeature)
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(beforeHook)
    if (beforeScenario != null) __obj.updateDynamic("beforeScenario")(beforeScenario)
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(beforeSession)
    if (beforeStep != null) __obj.updateDynamic("beforeStep")(beforeStep)
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(beforeSuite)
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(beforeTest)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (jasmineNodeOpts != null) __obj.updateDynamic("jasmineNodeOpts")(jasmineNodeOpts)
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (maxInstancesPerCapability != null) __obj.updateDynamic("maxInstancesPerCapability")(maxInstancesPerCapability.asInstanceOf[js.Any])
    if (mochaOpts != null) __obj.updateDynamic("mochaOpts")(mochaOpts)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(onPrepare)
    if (onReload != null) __obj.updateDynamic("onReload")(onReload)
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir)
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    if (runner != null) __obj.updateDynamic("runner")(runner)
    if (services != null) __obj.updateDynamic("services")(services)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    if (suites != null) __obj.updateDynamic("suites")(suites)
    if (waitforInterval != null) __obj.updateDynamic("waitforInterval")(waitforInterval.asInstanceOf[js.Any])
    if (waitforTimeout != null) __obj.updateDynamic("waitforTimeout")(waitforTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

