package typings
package validatorLib.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for IsInt
trait IsIntOptions extends js.Object {
  var allow_leading_zeroes: js.UndefOr[scala.Boolean] = js.undefined
  var gt: js.UndefOr[scala.Double] = js.undefined
  var lt: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object IsIntOptions {
  @scala.inline
  def apply(
    allow_leading_zeroes: js.UndefOr[scala.Boolean] = js.undefined,
    gt: scala.Int | scala.Double = null,
    lt: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_leading_zeroes)) __obj.updateDynamic("allow_leading_zeroes")(allow_leading_zeroes)
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIntOptions]
  }
}

