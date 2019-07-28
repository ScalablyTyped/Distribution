package typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsMod

import typings.webpackDashBugsnagDashPlugins.Anon_Debug
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.debug
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.error
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.info
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReporterOptions extends js.Object {
  /**
    * Post the build payload to a specified URL
    *
    * @default https://build.bugsnag.com
    */
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * The minimum severity of log to output
    *
    * @default warn
    */
  var logLevel: js.UndefOr[debug | info | warn | error] = js.undefined
  /**
    * Provide a different logger object
    */
  var logger: js.UndefOr[Anon_Debug] = js.undefined
  /**
    * The path to search for source control info
    *
    * @default process.cwd()
    */
  var path: js.UndefOr[String] = js.undefined
}

object BuildReporterOptions {
  @scala.inline
  def apply(
    endpoint: String = null,
    logLevel: debug | info | warn | error = null,
    logger: Anon_Debug = null,
    path: String = null
  ): BuildReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[BuildReporterOptions]
  }
}

