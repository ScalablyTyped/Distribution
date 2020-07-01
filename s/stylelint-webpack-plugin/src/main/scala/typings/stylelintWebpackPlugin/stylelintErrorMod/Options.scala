package typings.stylelintWebpackPlugin.stylelintErrorMod

import typings.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var emitError: js.UndefOr[Boolean] = js.undefined
  var emitWarning: js.UndefOr[Boolean] = js.undefined
  var failOnError: js.UndefOr[Boolean] = js.undefined
  var failOnWarning: js.UndefOr[Boolean] = js.undefined
  var files: String | js.Array[String]
  var formatter: TimerHandler
  var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var stylelintPath: String
}

object Options {
  @scala.inline
  def apply(
    files: String | js.Array[String],
    formatter: TimerHandler,
    stylelintPath: String,
    context: String = null,
    emitError: js.UndefOr[Boolean] = js.undefined,
    emitWarning: js.UndefOr[Boolean] = js.undefined,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    failOnWarning: js.UndefOr[Boolean] = js.undefined,
    lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], stylelintPath = stylelintPath.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitWarning)) __obj.updateDynamic("emitWarning")(emitWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnWarning)) __obj.updateDynamic("failOnWarning")(failOnWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lintDirtyModulesOnly)) __obj.updateDynamic("lintDirtyModulesOnly")(lintDirtyModulesOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

