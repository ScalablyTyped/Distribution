package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var deprecations: js.Array[String]
  var errored: js.UndefOr[Boolean] = js.undefined
  var ignored: js.UndefOr[Boolean] = js.undefined
  var invalidOptionWarnings: js.Array[_]
  var source: String
  var warnings: js.Array[Warning]
}

object LintResult {
  @scala.inline
  def apply(
    deprecations: js.Array[String],
    invalidOptionWarnings: js.Array[_],
    source: String,
    warnings: js.Array[Warning],
    errored: js.UndefOr[Boolean] = js.undefined,
    ignored: js.UndefOr[Boolean] = js.undefined
  ): LintResult = {
    val __obj = js.Dynamic.literal(deprecations = deprecations.asInstanceOf[js.Any], invalidOptionWarnings = invalidOptionWarnings.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    if (!js.isUndefined(errored)) __obj.updateDynamic("errored")(errored.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
}

