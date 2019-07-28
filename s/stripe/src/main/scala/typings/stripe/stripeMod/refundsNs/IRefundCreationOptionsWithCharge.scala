package typings.stripe.stripeMod.refundsNs

import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefundCreationOptionsWithCharge extends IRefundCreationOptions {
  /**
    * The identifier of the charge to refund.
    */
  var charge: String
}

object IRefundCreationOptionsWithCharge {
  @scala.inline
  def apply(
    charge: String,
    amount: Int | Double = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    reason: String = null,
    refund_application_fee: js.UndefOr[Boolean] = js.undefined,
    reverse_transfer: js.UndefOr[Boolean] = js.undefined
  ): IRefundCreationOptionsWithCharge = {
    val __obj = js.Dynamic.literal(charge = charge)
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

