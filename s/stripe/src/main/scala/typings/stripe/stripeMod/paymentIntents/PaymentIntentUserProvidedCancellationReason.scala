package typings.stripe.stripeMod.paymentIntents

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
  def abandoned: typings.stripe.stripeStrings.abandoned = this.cast("abandoned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typings.stripe.stripeStrings.duplicate = this.cast("duplicate")
  @scala.inline
  def fraudulent: typings.stripe.stripeStrings.fraudulent = this.cast("fraudulent")
  @scala.inline
  def requested_by_customer: typings.stripe.stripeStrings.requested_by_customer = this.cast("requested_by_customer")
}

