package typings.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Payment methods supported by Payment Intents. This is a subsetset of all Payment Method types. See https://stripe.com/docs/api/payment_methods/create#create_payment_method-type */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.card
  - typings.stripe.stripeStrings.ideal
  - typings.stripe.stripeStrings.sepa_debit
*/
trait PaymentIntentPaymentMethodType extends js.Object

object PaymentIntentPaymentMethodType {
  @scala.inline
  def card: typings.stripe.stripeStrings.card = "card".asInstanceOf[typings.stripe.stripeStrings.card]
  @scala.inline
  def ideal: typings.stripe.stripeStrings.ideal = "ideal".asInstanceOf[typings.stripe.stripeStrings.ideal]
  @scala.inline
  def sepa_debit: typings.stripe.stripeStrings.sepa_debit = "sepa_debit".asInstanceOf[typings.stripe.stripeStrings.sepa_debit]
}

