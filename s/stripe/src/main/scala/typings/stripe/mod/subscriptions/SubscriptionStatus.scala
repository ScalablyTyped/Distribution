package typings.stripe.mod.subscriptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.incomplete
  - typings.stripe.stripeStrings.incomplete_expired
  - typings.stripe.stripeStrings.trialing
  - typings.stripe.stripeStrings.active
  - typings.stripe.stripeStrings.past_due
  - typings.stripe.stripeStrings.canceled
  - typings.stripe.stripeStrings.unpaid
*/
trait SubscriptionStatus extends js.Object

object SubscriptionStatus {
  @scala.inline
  def active: typings.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def canceled: typings.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incomplete: typings.stripe.stripeStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def incomplete_expired: typings.stripe.stripeStrings.incomplete_expired = this.cast("incomplete_expired")
  @scala.inline
  def past_due: typings.stripe.stripeStrings.past_due = this.cast("past_due")
  @scala.inline
  def trialing: typings.stripe.stripeStrings.trialing = this.cast("trialing")
  @scala.inline
  def unpaid: typings.stripe.stripeStrings.unpaid = this.cast("unpaid")
}

