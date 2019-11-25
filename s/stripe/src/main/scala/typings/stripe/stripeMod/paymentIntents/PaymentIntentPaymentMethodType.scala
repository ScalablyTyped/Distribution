package typings.stripe.stripeMod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Payment methods supported by Payment Intents. This is a subsetset of all Payment Method types. See https://stripe.com/docs/api/payment_methods/create#create_payment_method-type */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.card
  - typings.stripe.stripeStrings.card_present
*/
trait PaymentIntentPaymentMethodType extends js.Object

object PaymentIntentPaymentMethodType {
  @scala.inline
  def card: typings.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  def card_present: typings.stripe.stripeStrings.card_present = this.cast("card_present")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

