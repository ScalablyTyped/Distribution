package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingOption extends js.Object {
  var shippingOption: typings.stripeV3.stripe.paymentRequest.ShippingOption
  def updateWith(options: UpdateDetails): Unit
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
}

