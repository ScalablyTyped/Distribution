package typings.stripe.mod.refunds

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefundCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much of this charge to
    * refund. Can only refund up to the unrefunded amount remaining of the
    * charge.
    *
    * default is entire charge
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * String indicating the reason for the refund. If set, possible values are
    * "duplicate", "fraudulent", and "requested_by_customer". Specifying
    * "fraudulent" as the reason when you believe the charge to be fraudulent
    * will help us improve our fraud detection algorithms.
    */
  var reason: js.UndefOr[String] = js.native
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
  var refund_application_fee: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating whether the transfer should be reversed when
    * refunding this charge. The transfer will be reversed for the same amount
    * being refunded (either the entire or partial amount).
    * A transfer can only be reversed by the application that created the charge.
    *
    * Connect only, default is false.
    */
  var reverse_transfer: js.UndefOr[Boolean] = js.native
}

object IRefundCreationOptions {
  @scala.inline
  def apply(): IRefundCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRefundCreationOptions]
  }
  @scala.inline
  implicit class IRefundCreationOptionsOps[Self <: IRefundCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRefund_application_fee(value: Boolean): Self = this.set("refund_application_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_application_fee: Self = this.set("refund_application_fee", js.undefined)
    @scala.inline
    def setReverse_transfer(value: Boolean): Self = this.set("reverse_transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse_transfer: Self = this.set("reverse_transfer", js.undefined)
  }
  
}

