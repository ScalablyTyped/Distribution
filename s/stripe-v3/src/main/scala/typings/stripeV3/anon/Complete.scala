package typings.stripeV3.anon

import typings.stripeV3.stripe.elements.PaymentRequestButtonStyleOptions
import typings.stripeV3.stripe.elements.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete extends js.Object {
  var base: js.UndefOr[Style] = js.native
  var complete: js.UndefOr[Style] = js.native
  var empty: js.UndefOr[Style] = js.native
  var invalid: js.UndefOr[Style] = js.native
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyleOptions] = js.native
}

object Complete {
  @scala.inline
  def apply(): Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete]
  }
  @scala.inline
  implicit class CompleteOps[Self <: Complete] (val x: Self) extends AnyVal {
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
    def setBase(value: Style): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setComplete(value: Style): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setEmpty(value: Style): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setInvalid(value: Style): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setPaymentRequestButton(value: PaymentRequestButtonStyleOptions): Self = this.set("paymentRequestButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentRequestButton: Self = this.set("paymentRequestButton", js.undefined)
  }
  
}

