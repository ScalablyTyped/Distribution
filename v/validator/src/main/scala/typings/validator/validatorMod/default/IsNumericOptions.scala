package typings.validator.validatorMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNumericOptions extends js.Object {
  /**
    * If `no_symbols` is true, the validator will reject numeric strings that feature a symbol (e.g. `+`, `-`, or `.`).
    *
    * @default false
    */
  var no_symbols: js.UndefOr[Boolean] = js.undefined
}

object IsNumericOptions {
  @scala.inline
  def apply(no_symbols: js.UndefOr[Boolean] = js.undefined): IsNumericOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(no_symbols)) __obj.updateDynamic("no_symbols")(no_symbols)
    __obj.asInstanceOf[IsNumericOptions]
  }
}

