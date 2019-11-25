package typings.stripe.stripeMod.transfers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.pending
  - typings.stripe.stripeStrings.paid
  - typings.stripe.stripeStrings.failed
  - typings.stripe.stripeStrings.in_transit
  - typings.stripe.stripeStrings.canceled
*/
trait Statuses extends js.Object

object Statuses {
  @scala.inline
  def canceled: typings.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typings.stripe.stripeStrings.failed = this.cast("failed")
  @scala.inline
  def in_transit: typings.stripe.stripeStrings.in_transit = this.cast("in_transit")
  @scala.inline
  def paid: typings.stripe.stripeStrings.paid = this.cast("paid")
  @scala.inline
  def pending: typings.stripe.stripeStrings.pending = this.cast("pending")
}

