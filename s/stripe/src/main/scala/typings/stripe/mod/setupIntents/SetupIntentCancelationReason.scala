package typings.stripe.mod.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.abandoned
  - typings.stripe.stripeStrings.requested_by_customer
  - typings.stripe.stripeStrings.duplicate
*/
trait SetupIntentCancelationReason extends js.Object

object SetupIntentCancelationReason {
  @scala.inline
  def abandoned: typings.stripe.stripeStrings.abandoned = this.cast("abandoned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typings.stripe.stripeStrings.duplicate = this.cast("duplicate")
  @scala.inline
  def requested_by_customer: typings.stripe.stripeStrings.requested_by_customer = this.cast("requested_by_customer")
}

