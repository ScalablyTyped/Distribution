package typings.stripe.anon

import typings.stripe.mod.charges.IPaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charge extends js.Object {
  /** The charge that created this object. */
  var charge: String
  /** Transaction-specific details of the payment method used in the payment. */
  var payment_method_details: IPaymentMethodDetails
}

object Charge {
  @scala.inline
  def apply(charge: String, payment_method_details: IPaymentMethodDetails): Charge = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
}

