package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bail: js.UndefOr[scala.Double] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var capabilities: js.UndefOr[
    webdriverLib.WebDriverNs.DesiredCapabilities | js.Array[webdriverLib.WebDriverNs.DesiredCapabilities]
  ] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var framework: js.UndefOr[java.lang.String] = js.undefined
  var jasmineNodeOpts: js.UndefOr[js.Object] = js.undefined
  var maxInstances: js.UndefOr[scala.Double] = js.undefined
  var maxInstancesPerCapability: js.UndefOr[scala.Double] = js.undefined
  var mochaOpts: js.UndefOr[js.Object] = js.undefined
  var outputDir: js.UndefOr[java.lang.String] = js.undefined
  var reporters: js.UndefOr[js.Array[java.lang.String | js.Object]] = js.undefined
  var runner: js.UndefOr[java.lang.String] = js.undefined
  var services: js.UndefOr[js.Array[java.lang.String | js.Object]] = js.undefined
  var specs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suites: js.UndefOr[js.Object] = js.undefined
  var waitforInterval: js.UndefOr[scala.Double] = js.undefined
  var waitforTimeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bail: scala.Int | scala.Double = null,
    baseUrl: java.lang.String = null,
    capabilities: webdriverLib.WebDriverNs.DesiredCapabilities | js.Array[webdriverLib.WebDriverNs.DesiredCapabilities] = null,
    exclude: js.Array[java.lang.String] = null,
    execArgv: js.Array[java.lang.String] = null,
    framework: java.lang.String = null,
    jasmineNodeOpts: js.Object = null,
    maxInstances: scala.Int | scala.Double = null,
    maxInstancesPerCapability: scala.Int | scala.Double = null,
    mochaOpts: js.Object = null,
    outputDir: java.lang.String = null,
    reporters: js.Array[java.lang.String | js.Object] = null,
    runner: java.lang.String = null,
    services: js.Array[java.lang.String | js.Object] = null,
    specs: js.Array[java.lang.String] = null,
    suites: js.Object = null,
    waitforInterval: scala.Int | scala.Double = null,
    waitforTimeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (jasmineNodeOpts != null) __obj.updateDynamic("jasmineNodeOpts")(jasmineNodeOpts)
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (maxInstancesPerCapability != null) __obj.updateDynamic("maxInstancesPerCapability")(maxInstancesPerCapability.asInstanceOf[js.Any])
    if (mochaOpts != null) __obj.updateDynamic("mochaOpts")(mochaOpts)
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir)
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    if (runner != null) __obj.updateDynamic("runner")(runner)
    if (services != null) __obj.updateDynamic("services")(services)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    if (suites != null) __obj.updateDynamic("suites")(suites)
    if (waitforInterval != null) __obj.updateDynamic("waitforInterval")(waitforInterval.asInstanceOf[js.Any])
    if (waitforTimeout != null) __obj.updateDynamic("waitforTimeout")(waitforTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

