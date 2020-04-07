package typings.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined stripe.stripe.paymentMethods.IPaymentMethod['type'] */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.card
  - typings.stripe.stripeStrings.card_present
*/
trait IPaymentMethodType extends js.Object

object IPaymentMethodType {
  @scala.inline
  def card: typings.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  def card_present: typings.stripe.stripeStrings.card_present = this.cast("card_present")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

