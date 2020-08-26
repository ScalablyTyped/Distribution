package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePaymentMethodOptions extends js.Object {
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
  var metadata: js.UndefOr[Metadata] = js.native
}

object CreatePaymentMethodOptions {
  @scala.inline
  def apply(): CreatePaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePaymentMethodOptions]
  }
  @scala.inline
  implicit class CreatePaymentMethodOptionsOps[Self <: CreatePaymentMethodOptions] (val x: Self) extends AnyVal {
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
    def setBilling_details(value: BillingDetails): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_details: Self = this.set("billing_details", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

