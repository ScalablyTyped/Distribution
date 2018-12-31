package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bail: js.UndefOr[scala.Double] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var browserstackLocal: js.UndefOr[scala.Boolean] = js.undefined
  var capabilities: js.UndefOr[js.Array[DesiredCapabilities]] = js.undefined
  var coloredLogs: js.UndefOr[scala.Boolean] = js.undefined
  var connectionRetryCount: js.UndefOr[scala.Double] = js.undefined
  var connectionRetryTimeout: js.UndefOr[scala.Double] = js.undefined
  var cucumberOpts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var debug: js.UndefOr[scala.Double] = js.undefined
  var deprecationWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var desiredCapabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  var dockerLogs: js.UndefOr[java.lang.String] = js.undefined
  // wdio-docker-service specific
  var dockerOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var execArgv: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  var framework: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var isWDIO: js.UndefOr[scala.Boolean] = js.undefined
  var jasmineNodeOpts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var maxInstances: js.UndefOr[scala.Double] = js.undefined
  var maxInstancesPerCapability: js.UndefOr[scala.Double] = js.undefined
  var maxSession: js.UndefOr[scala.Double] = js.undefined
  var mochaOpts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onDockerReady: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var plugins: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var reporterOptions: js.UndefOr[webdriverioLib.Anon_ReporterName] = js.undefined
  var reporters: js.UndefOr[js.Array[java.lang.String] | (js.Function1[/* repeated */ js.Any, scala.Unit])] = js.undefined
  // wdio-sauce-service specific
  var sauceConnect: js.UndefOr[scala.Boolean] = js.undefined
  var sauceConnectOpts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var screenshotPath: js.UndefOr[java.lang.String] = js.undefined
  var seleniumLogs: js.UndefOr[java.lang.String] = js.undefined
  var services: js.UndefOr[js.Array[java.lang.String] | (js.Function1[/* repeated */ js.Any, scala.Unit])] = js.undefined
  var specs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suites: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
  var waitforInterval: js.UndefOr[scala.Double] = js.undefined
  var waitforTimeout: js.UndefOr[scala.Double] = js.undefined
}

