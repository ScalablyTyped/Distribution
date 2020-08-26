package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingAddress extends js.Object {
  var shippingAddress: typings.stripeV3.stripe.paymentRequest.ShippingAddress = js.native
  def updateWith(options: UpdateDetails): Unit = js.native
}

object ShippingAddress {
  @scala.inline
  def apply(
    shippingAddress: typings.stripeV3.stripe.paymentRequest.ShippingAddress,
    updateWith: UpdateDetails => Unit
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingAddress]
  }
  @scala.inline
  implicit class ShippingAddressOps[Self <: ShippingAddress] (val x: Self) extends AnyVal {
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
    def setShippingAddress(value: typings.stripeV3.stripe.paymentRequest.ShippingAddress): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateWith(value: UpdateDetails => Unit): Self = this.set("updateWith", js.Any.fromFunction1(value))
  }
  
}

