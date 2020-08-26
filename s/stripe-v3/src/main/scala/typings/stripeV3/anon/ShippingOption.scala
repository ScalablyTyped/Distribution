package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingOption extends js.Object {
  var shippingOption: typings.stripeV3.stripe.paymentRequest.ShippingOption = js.native
  def updateWith(options: UpdateDetails): Unit = js.native
}

object ShippingOption {
  @scala.inline
  def apply(
    shippingOption: typings.stripeV3.stripe.paymentRequest.ShippingOption,
    updateWith: UpdateDetails => Unit
  ): ShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingOption]
  }
  @scala.inline
  implicit class ShippingOptionOps[Self <: ShippingOption] (val x: Self) extends AnyVal {
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
    def setShippingOption(value: typings.stripeV3.stripe.paymentRequest.ShippingOption): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateWith(value: UpdateDetails => Unit): Self = this.set("updateWith", js.Any.fromFunction1(value))
  }
  
}

