package typings.stripe.mod.transfers

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
  def canceled: typings.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typings.stripe.stripeStrings.canceled]
  @scala.inline
  def failed: typings.stripe.stripeStrings.failed = "failed".asInstanceOf[typings.stripe.stripeStrings.failed]
  @scala.inline
  def in_transit: typings.stripe.stripeStrings.in_transit = "in_transit".asInstanceOf[typings.stripe.stripeStrings.in_transit]
  @scala.inline
  def paid: typings.stripe.stripeStrings.paid = "paid".asInstanceOf[typings.stripe.stripeStrings.paid]
  @scala.inline
  def pending: typings.stripe.stripeStrings.pending = "pending".asInstanceOf[typings.stripe.stripeStrings.pending]
}

