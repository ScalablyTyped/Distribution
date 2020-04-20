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
  def automatic: typings.stripe.stripeStrings.automatic = "automatic".asInstanceOf[typings.stripe.stripeStrings.automatic]
  @scala.inline
  def failed_invoice: typings.stripe.stripeStrings.failed_invoice = "failed_invoice".asInstanceOf[typings.stripe.stripeStrings.failed_invoice]
  @scala.inline
  def void_invoice: typings.stripe.stripeStrings.void_invoice = "void_invoice".asInstanceOf[typings.stripe.stripeStrings.void_invoice]
}

