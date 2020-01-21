package typings.webdriverio.WebdriverIO

import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriverio.AnonSpecFiltering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bail: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var capabilities: js.UndefOr[js.Array[DesiredCapabilities] | MultiRemoteCapabilities] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var featureFlags: js.UndefOr[AnonSpecFiltering] = js.undefined
  var framework: js.UndefOr[String] = js.undefined
  var jasmineNodeOpts: js.UndefOr[js.Object] = js.undefined
  var maxInstances: js.UndefOr[Double] = js.undefined
  var maxInstancesPerCapability: js.UndefOr[Double] = js.undefined
  var mochaOpts: js.UndefOr[js.Object] = js.undefined
  var outputDir: js.UndefOr[String] = js.undefined
  var reporters: js.UndefOr[js.Array[String | js.Object]] = js.undefined
  var runner: js.UndefOr[String] = js.undefined
  var services: js.UndefOr[js.Array[String | js.Object]] = js.undefined
  var specFileRetries: js.UndefOr[Double] = js.undefined
  val specFileRetryAttempts: js.UndefOr[Double] = js.undefined
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  var suites: js.UndefOr[js.Object] = js.undefined
  var waitforInterval: js.UndefOr[Double] = js.undefined
  var waitforTimeout: js.UndefOr[Double] = js.undefined
}

object Options {
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
  ): Options = {
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
    __obj.asInstanceOf[Options]
  }
}

