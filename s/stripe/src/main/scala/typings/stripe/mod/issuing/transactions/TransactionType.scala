package typings.stripe.mod.issuing.transactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.capture
  - typings.stripe.stripeStrings.refund
  - typings.stripe.stripeStrings.cash_withdrawal
  - typings.stripe.stripeStrings.refund_reversal
  - typings.stripe.stripeStrings.dispute
  - typings.stripe.stripeStrings.dispute_loss
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def capture: typings.stripe.stripeStrings.capture = this.cast("capture")
  @scala.inline
  def cash_withdrawal: typings.stripe.stripeStrings.cash_withdrawal = this.cast("cash_withdrawal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dispute: typings.stripe.stripeStrings.dispute = this.cast("dispute")
  @scala.inline
  def dispute_loss: typings.stripe.stripeStrings.dispute_loss = this.cast("dispute_loss")
  @scala.inline
  def refund: typings.stripe.stripeStrings.refund = this.cast("refund")
  @scala.inline
  def refund_reversal: typings.stripe.stripeStrings.refund_reversal = this.cast("refund_reversal")
}

