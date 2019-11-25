package typings.atWebpackDashBlocksDevDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[Boolean] = js.undefined
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.UndefOr[Boolean] = js.undefined, warnings: js.UndefOr[Boolean] = js.undefined): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Errors]
  }
}

