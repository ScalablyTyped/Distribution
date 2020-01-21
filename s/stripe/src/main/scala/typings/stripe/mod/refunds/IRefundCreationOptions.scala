package typings.stripe.mod.refunds

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefundCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much of this charge to
    * refund. Can only refund up to the unrefunded amount remaining of the
    * charge.
    *
    * default is entire charge
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * String indicating the reason for the refund. If set, possible values are
    * "duplicate", "fraudulent", and "requested_by_customer". Specifying
    * "fraudulent" as the reason when you believe the charge to be fraudulent
    * will help us improve our fraud detection algorithms.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * Boolean indicating whether the application fee should be refunded when
    * refunding this charge. If a full charge refund is given, the full application
    * fee will be refunded. Else, the application fee will be refunded with an
    * amount proportional to the amount of the charge refunded.
    * An application fee can only be refunded by the application that created the
    * charge.
    *
    * Connect only, default is false.
    */
  var refund_application_fee: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean indicating whether the transfer should be reversed when
    * refunding this charge. The transfer will be reversed for the same amount
    * being refunded (either the entire or partial amount).
    * A transfer can only be reversed by the application that created the charge.
    *
    * Connect only, default is false.
    */
  var reverse_transfer: js.UndefOr[Boolean] = js.undefined
}

object IRefundCreationOptions {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    reason: String = null,
    refund_application_fee: js.UndefOr[Boolean] = js.undefined,
    reverse_transfer: js.UndefOr[Boolean] = js.undefined
  ): IRefundCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_application_fee)) __obj.updateDynamic("refund_application_fee")(refund_application_fee.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse_transfer)) __obj.updateDynamic("reverse_transfer")(reverse_transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefundCreationOptions]
  }
}

