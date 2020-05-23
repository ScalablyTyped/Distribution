package typings.webpackBlocksDevServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.UndefOr[Boolean] = js.undefined
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object Errors {
  @scala.inline
  def apply(errors: js.UndefOr[Boolean] = js.undefined, warnings: js.UndefOr[Boolean] = js.undefined): Errors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

