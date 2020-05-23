package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddress extends js.Object {
  var shippingAddress: typings.stripeV3.stripe.paymentRequest.ShippingAddress
  def updateWith(options: UpdateDetails): Unit
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
}

