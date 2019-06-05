package typings
package webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReporterOptions extends js.Object {
  /**
    * Post the build payload to a specified URL
    *
    * @default https://build.bugsnag.com
    */
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The minimum severity of log to output
    *
    * @default warn
    */
  var logLevel: js.UndefOr[
    webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.debug | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.info | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.warn | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.error
  ] = js.undefined
  /**
    * Provide a different logger object
    */
  var logger: js.UndefOr[webpackDashBugsnagDashPluginsLib.Anon_Debug] = js.undefined
  /**
    * The path to search for source control info
    *
    * @default process.cwd()
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object BuildReporterOptions {
  @scala.inline
  def apply(
    endpoint: java.lang.String = null,
    logLevel: webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.debug | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.info | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.warn | webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsLibStrings.error = null,
    logger: webpackDashBugsnagDashPluginsLib.Anon_Debug = null,
    path: java.lang.String = null
  ): BuildReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[BuildReporterOptions]
  }
}

