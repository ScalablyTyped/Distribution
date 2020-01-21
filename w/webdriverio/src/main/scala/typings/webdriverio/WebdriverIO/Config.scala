package typings.webdriverio.WebdriverIO

import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriverio.AnonSpecFiltering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof webdriver.WebDriver.Options, 'capabilities'> ]: webdriver.WebDriver.Options[P]}
- Dropped {[ K in keyof std.Pick<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.WebdriverIO.HookFunctions[K]>}
- Dropped {[ P in std.Exclude<keyof webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.WebdriverIO.HookFunctions[P]} */ trait Config extends Options

object Config {
  @scala.inline
  def apply(
    bail: Int | Double = null,
    baseUrl: String = null,
    capabilities: js.Array[DesiredCapabilities] | MultiRemoteCapabilities = null,
    exclude: js.Array[String] = null,
    execArgv: js.Array[String] = null,
    featureFlags: AnonSpecFiltering = null,
    framework: String = null,
    jasmineNodeOpts: js.Object = null,
    maxInstances: Int | Double = null,
    maxInstancesPerCapability: Int | Double = null,
    mochaOpts: js.Object = null,
    outputDir: String = null,
    reporters: js.Array[String | js.Object] = null,
    runner: String = null,
    services: js.Array[String | js.Object] = null,
    specFileRetries: Int | Double = null,
    specFileRetryAttempts: Int | Double = null,
    specs: js.Array[String] = null,
    suites: js.Object = null,
    waitforInterval: Int | Double = null,
    waitforTimeout: Int | Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (featureFlags != null) __obj.updateDynamic("featureFlags")(featureFlags.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (jasmineNodeOpts != null) __obj.updateDynamic("jasmineNodeOpts")(jasmineNodeOpts.asInstanceOf[js.Any])
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (maxInstancesPerCapability != null) __obj.updateDynamic("maxInstancesPerCapability")(maxInstancesPerCapability.asInstanceOf[js.Any])
    if (mochaOpts != null) __obj.updateDynamic("mochaOpts")(mochaOpts.asInstanceOf[js.Any])
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (specFileRetries != null) __obj.updateDynamic("specFileRetries")(specFileRetries.asInstanceOf[js.Any])
    if (specFileRetryAttempts != null) __obj.updateDynamic("specFileRetryAttempts")(specFileRetryAttempts.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    if (suites != null) __obj.updateDynamic("suites")(suites.asInstanceOf[js.Any])
    if (waitforInterval != null) __obj.updateDynamic("waitforInterval")(waitforInterval.asInstanceOf[js.Any])
    if (waitforTimeout != null) __obj.updateDynamic("waitforTimeout")(waitforTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

