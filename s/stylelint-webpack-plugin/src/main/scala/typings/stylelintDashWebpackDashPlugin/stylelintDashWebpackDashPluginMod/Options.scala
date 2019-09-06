package typings.stylelintDashWebpackDashPlugin.stylelintDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var config: js.UndefOr[Config] = js.undefined
  var configFile: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var emitErrors: js.UndefOr[Boolean] = js.undefined
  var failOnError: js.UndefOr[Boolean] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var fix: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var syntax: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    config: Config = null,
    configFile: String = null,
    context: String = null,
    emitErrors: js.UndefOr[Boolean] = js.undefined,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[String] = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    formatter: Formatter = null,
    lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined,
    syntax: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (configFile != null) __obj.updateDynamic("configFile")(configFile)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(emitErrors)) __obj.updateDynamic("emitErrors")(emitErrors)
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError)
    if (files != null) __obj.updateDynamic("files")(files)
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(lintDirtyModulesOnly)) __obj.updateDynamic("lintDirtyModulesOnly")(lintDirtyModulesOnly)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[Options]
  }
}

