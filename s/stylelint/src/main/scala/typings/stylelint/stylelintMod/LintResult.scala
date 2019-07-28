package typings.stylelint.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var deprecations: js.Array[String]
  var errored: js.UndefOr[Boolean] = js.undefined
  var ignored: js.UndefOr[Boolean] = js.undefined
  var invalidOptionWarnings: js.Array[_]
  var source: String
  var warnings: js.Array[String]
}

object LintResult {
  @scala.inline
  def apply(
    deprecations: js.Array[String],
    invalidOptionWarnings: js.Array[_],
    source: String,
    warnings: js.Array[String],
    errored: js.UndefOr[Boolean] = js.undefined,
    ignored: js.UndefOr[Boolean] = js.undefined
  ): LintResult = {
    val __obj = js.Dynamic.literal(deprecations = deprecations, invalidOptionWarnings = invalidOptionWarnings, source = source, warnings = warnings)
    if (!js.isUndefined(errored)) __obj.updateDynamic("errored")(errored)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    __obj.asInstanceOf[LintResult]
  }
}

