package typings
package webpackDashChainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Errors {
  @scala.inline
  def apply(
    errors: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Anon_Errors]
  }
}

