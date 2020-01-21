package typings.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.failed_invoice
  - typings.stripe.stripeStrings.void_invoice
  - typings.stripe.stripeStrings.automatic
*/
trait PaymentIntentStripeProvidedCancellationReason extends js.Object

object PaymentIntentStripeProvidedCancellationReason {
  @scala.inline
  def automatic: typings.stripe.stripeStrings.automatic = this.cast("automatic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed_invoice: typings.stripe.stripeStrings.failed_invoice = this.cast("failed_invoice")
  @scala.inline
  def void_invoice: typings.stripe.stripeStrings.void_invoice = this.cast("void_invoice")
}

