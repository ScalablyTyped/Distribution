package typings.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.duplicate
  - typings.stripe.stripeStrings.fraudulent
  - typings.stripe.stripeStrings.requested_by_customer
  - typings.stripe.stripeStrings.abandoned
*/
trait PaymentIntentUserProvidedCancellationReason extends js.Object

object PaymentIntentUserProvidedCancellationReason {
  @scala.inline
  def abandoned: typings.stripe.stripeStrings.abandoned = "abandoned".asInstanceOf[typings.stripe.stripeStrings.abandoned]
  @scala.inline
  def duplicate: typings.stripe.stripeStrings.duplicate = "duplicate".asInstanceOf[typings.stripe.stripeStrings.duplicate]
  @scala.inline
  def fraudulent: typings.stripe.stripeStrings.fraudulent = "fraudulent".asInstanceOf[typings.stripe.stripeStrings.fraudulent]
  @scala.inline
  def requested_by_customer: typings.stripe.stripeStrings.requested_by_customer = "requested_by_customer".asInstanceOf[typings.stripe.stripeStrings.requested_by_customer]
}

