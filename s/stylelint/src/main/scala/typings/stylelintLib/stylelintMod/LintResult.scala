package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var deprecations: js.Array[java.lang.String]
  var errored: js.UndefOr[scala.Boolean]
  var ignored: js.UndefOr[scala.Boolean]
  var invalidOptionWarnings: js.Array[_]
  var source: java.lang.String
  var warnings: js.Array[java.lang.String]
}

object LintResult {
  @scala.inline
  def apply(
    deprecations: js.Array[java.lang.String],
    invalidOptionWarnings: js.Array[_],
    source: java.lang.String,
    warnings: js.Array[java.lang.String],
    errored: js.UndefOr[scala.Boolean] = js.undefined,
    ignored: js.UndefOr[scala.Boolean] = js.undefined
  ): LintResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deprecations")(deprecations)
    __obj.updateDynamic("invalidOptionWarnings")(invalidOptionWarnings)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("warnings")(warnings)
    if (!js.isUndefined(errored)) __obj.updateDynamic("errored")(errored)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    __obj.asInstanceOf[LintResult]
  }
}

