package typings.stylelintWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stylelint-webpack-plugin.stylelint-webpack-plugin/declarations/getOptions.Options> */
trait PartialOptions extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var emitError: js.UndefOr[Boolean] = js.undefined
  var emitWarning: js.UndefOr[Boolean] = js.undefined
  var failOnError: js.UndefOr[Boolean] = js.undefined
  var failOnWarning: js.UndefOr[Boolean] = js.undefined
  var files: js.UndefOr[js.Array[String] | String] = js.undefined
  var formatter: js.UndefOr[js.Function | String] = js.undefined
  var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var stylelintPath: js.UndefOr[String] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    context: String = null,
    emitError: js.UndefOr[Boolean] = js.undefined,
    emitWarning: js.UndefOr[Boolean] = js.undefined,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    failOnWarning: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[String] | String = null,
    formatter: js.Function | String = null,
    lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined,
    stylelintPath: String = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitWarning)) __obj.updateDynamic("emitWarning")(emitWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnWarning)) __obj.updateDynamic("failOnWarning")(failOnWarning.get.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(lintDirtyModulesOnly)) __obj.updateDynamic("lintDirtyModulesOnly")(lintDirtyModulesOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (stylelintPath != null) __obj.updateDynamic("stylelintPath")(stylelintPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

