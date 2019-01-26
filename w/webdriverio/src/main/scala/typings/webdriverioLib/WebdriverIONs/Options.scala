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

