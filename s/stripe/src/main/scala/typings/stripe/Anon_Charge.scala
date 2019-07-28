package typings.stripe

import typings.stripe.stripeMod.chargesNs.IPaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charge extends js.Object {
  /** The charge that created this object. */
  var charge: String
  /** Transaction-specific details of the payment method used in the payment. */
  var payment_method_details: IPaymentMethodDetails
}

object Anon_Charge {
  @scala.inline
  def apply(charge: String, payment_method_details: IPaymentMethodDetails): Anon_Charge = {
    val __obj = js.Dynamic.literal(charge = charge, payment_method_details = payment_method_details)
  
    __obj.asInstanceOf[Anon_Charge]
  }
}

