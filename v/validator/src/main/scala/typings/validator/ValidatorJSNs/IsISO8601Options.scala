package typings.validator.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for isISO8601
trait IsISO8601Options extends js.Object {
  var strict: js.UndefOr[Boolean] = js.undefined
}

object IsISO8601Options {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined): IsISO8601Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[IsISO8601Options]
  }
}

