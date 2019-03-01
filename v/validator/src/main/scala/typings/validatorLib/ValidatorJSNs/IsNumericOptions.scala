package typings
package validatorLib.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for isNumeric
  */
trait IsNumericOptions extends js.Object {
  var no_symbols: js.UndefOr[scala.Boolean] = js.undefined
}

object IsNumericOptions {
  @scala.inline
  def apply(no_symbols: js.UndefOr[scala.Boolean] = js.undefined): IsNumericOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(no_symbols)) __obj.updateDynamic("no_symbols")(no_symbols)
    __obj.asInstanceOf[IsNumericOptions]
  }
}

