package typings.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodAttachOptions extends js.Object {
  /** The ID of the customer to which to attach the PaymentMethod. */
  var customer: String
}

object IPaymentMethodAttachOptions {
  @scala.inline
  def apply(customer: String): IPaymentMethodAttachOptions = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPaymentMethodAttachOptions]
  }
}

