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
  def active: typings.stripe.stripeStrings.active = "active".asInstanceOf[typings.stripe.stripeStrings.active]
  @scala.inline
  def canceled: typings.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typings.stripe.stripeStrings.canceled]
  @scala.inline
  def incomplete: typings.stripe.stripeStrings.incomplete = "incomplete".asInstanceOf[typings.stripe.stripeStrings.incomplete]
  @scala.inline
  def incomplete_expired: typings.stripe.stripeStrings.incomplete_expired = "incomplete_expired".asInstanceOf[typings.stripe.stripeStrings.incomplete_expired]
  @scala.inline
  def past_due: typings.stripe.stripeStrings.past_due = "past_due".asInstanceOf[typings.stripe.stripeStrings.past_due]
  @scala.inline
  def trialing: typings.stripe.stripeStrings.trialing = "trialing".asInstanceOf[typings.stripe.stripeStrings.trialing]
  @scala.inline
  def unpaid: typings.stripe.stripeStrings.unpaid = "unpaid".asInstanceOf[typings.stripe.stripeStrings.unpaid]
}

