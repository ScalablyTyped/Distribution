package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeCaptureOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptions {
  /**
    * A positive integer in the smallest currency unit (e.g 100 cents to charge
    * $1.00, or 1 to charge ¥1, a 0-decimal currency) representing how much to
    * charge the card. The minimum amount is £0.50 (or equivalent in charge
    * currency).
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
}

object IChargeCaptureOptions {
  @scala.inline
  def apply(
    amount: scala.Int | scala.Double = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): IChargeCaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[IChargeCaptureOptions]
  }
}

