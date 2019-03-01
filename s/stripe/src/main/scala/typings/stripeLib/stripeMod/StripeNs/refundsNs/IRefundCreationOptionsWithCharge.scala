package typings
package stripeLib.stripeMod.StripeNs.refundsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefundCreationOptionsWithCharge extends IRefundCreationOptions {
  /**
    * The identifier of the charge to refund.
    */
  var charge: java.lang.String
}

object IRefundCreationOptionsWithCharge {
  @scala.inline
  def apply(
    charge: java.lang.String,
    amount: scala.Int | scala.Double = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    reason: java.lang.String = null,
    refund_application_fee: js.UndefOr[scala.Boolean] = js.undefined,
    reverse_transfer: js.UndefOr[scala.Boolean] = js.undefined
  ): IRefundCreationOptionsWithCharge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charge")(charge)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (!js.isUndefined(refund_application_fee)) __obj.updateDynamic("refund_application_fee")(refund_application_fee)
    if (!js.isUndefined(reverse_transfer)) __obj.updateDynamic("reverse_transfer")(reverse_transfer)
    __obj.asInstanceOf[IRefundCreationOptionsWithCharge]
  }
}

