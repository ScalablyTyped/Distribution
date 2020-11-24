package typings.stripe.mod.issuing.transactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def capture: typings.stripe.stripeStrings.capture = "capture".asInstanceOf[typings.stripe.stripeStrings.capture]
  
  @scala.inline
  def cash_withdrawal: typings.stripe.stripeStrings.cash_withdrawal = "cash_withdrawal".asInstanceOf[typings.stripe.stripeStrings.cash_withdrawal]
  
  @scala.inline
  def dispute: typings.stripe.stripeStrings.dispute = "dispute".asInstanceOf[typings.stripe.stripeStrings.dispute]
  
  @scala.inline
  def dispute_loss: typings.stripe.stripeStrings.dispute_loss = "dispute_loss".asInstanceOf[typings.stripe.stripeStrings.dispute_loss]
  
  @scala.inline
  def refund: typings.stripe.stripeStrings.refund = "refund".asInstanceOf[typings.stripe.stripeStrings.refund]
  
  @scala.inline
  def refund_reversal: typings.stripe.stripeStrings.refund_reversal = "refund_reversal".asInstanceOf[typings.stripe.stripeStrings.refund_reversal]
}
