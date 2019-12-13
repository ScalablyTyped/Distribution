package typings.stripe.stripeMod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.per_authorization
  - typings.stripe.stripeStrings.daily
  - typings.stripe.stripeStrings.weekly
  - typings.stripe.stripeStrings.monthly
  - typings.stripe.stripeStrings.yearly
  - typings.stripe.stripeStrings.all_time
*/
trait SpendingLimitInterval extends js.Object

object SpendingLimitInterval {
  @scala.inline
  def all_time: typings.stripe.stripeStrings.all_time = this.cast("all_time")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def daily: typings.stripe.stripeStrings.daily = this.cast("daily")
  @scala.inline
  def monthly: typings.stripe.stripeStrings.monthly = this.cast("monthly")
  @scala.inline
  def per_authorization: typings.stripe.stripeStrings.per_authorization = this.cast("per_authorization")
  @scala.inline
  def weekly: typings.stripe.stripeStrings.weekly = this.cast("weekly")
  @scala.inline
  def yearly: typings.stripe.stripeStrings.yearly = this.cast("yearly")
}

