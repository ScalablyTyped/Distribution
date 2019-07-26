package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charge extends js.Object {
  /** The charge that created this object. */
  var charge: java.lang.String
  /** Transaction-specific details of the payment method used in the payment. */
  var payment_method_details: stripeLib.stripeMod.chargesNs.IPaymentMethodDetails
}

object Anon_Charge {
  @scala.inline
  def apply(
    charge: java.lang.String,
    payment_method_details: stripeLib.stripeMod.chargesNs.IPaymentMethodDetails
  ): Anon_Charge = {
    val __obj = js.Dynamic.literal(charge = charge, payment_method_details = payment_method_details)
  
    __obj.asInstanceOf[Anon_Charge]
  }
}

