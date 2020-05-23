package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charge extends js.Object {
  var charge: js.UndefOr[String | Null] = js.undefined
  var payment_method_details: js.UndefOr[PaymentMethodDetails | Null] = js.undefined
}

object Charge {
  @scala.inline
  def apply(
    charge: js.UndefOr[Null | String] = js.undefined,
    payment_method_details: js.UndefOr[Null | PaymentMethodDetails] = js.undefined
  ): Charge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(charge)) __obj.updateDynamic("charge")(charge.asInstanceOf[js.Any])
    if (!js.isUndefined(payment_method_details)) __obj.updateDynamic("payment_method_details")(payment_method_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
}

