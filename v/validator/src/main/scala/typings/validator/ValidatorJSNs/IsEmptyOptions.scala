package typings.validator.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for isEmpty
trait IsEmptyOptions extends js.Object {
  var ignore_whitespace: js.UndefOr[Boolean] = js.undefined
}

object IsEmptyOptions {
  @scala.inline
  def apply(ignore_whitespace: js.UndefOr[Boolean] = js.undefined): IsEmptyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignore_whitespace)) __obj.updateDynamic("ignore_whitespace")(ignore_whitespace)
    __obj.asInstanceOf[IsEmptyOptions]
  }
}

