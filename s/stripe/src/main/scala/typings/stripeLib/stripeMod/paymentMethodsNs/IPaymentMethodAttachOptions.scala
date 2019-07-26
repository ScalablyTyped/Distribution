package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodAttachOptions extends js.Object {
  /** The ID of the customer to which to attach the PaymentMethod. */
  var customer: java.lang.String
}

object IPaymentMethodAttachOptions {
  @scala.inline
  def apply(customer: java.lang.String): IPaymentMethodAttachOptions = {
    val __obj = js.Dynamic.literal(customer = customer)
  
    __obj.asInstanceOf[IPaymentMethodAttachOptions]
  }
}

