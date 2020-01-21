package typings.stripeV3.stripe.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.requires_payment_method
  - typings.stripeV3.stripeV3Strings.requires_confirmation
  - typings.stripeV3.stripeV3Strings.requires_action
  - typings.stripeV3.stripeV3Strings.processing
  - typings.stripeV3.stripeV3Strings.requires_capture
  - typings.stripeV3.stripeV3Strings.canceled
  - typings.stripeV3.stripeV3Strings.succeeded
*/
trait PaymentIntentStatus extends js.Object

object PaymentIntentStatus {
  @scala.inline
  def canceled: typings.stripeV3.stripeV3Strings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def processing: typings.stripeV3.stripeV3Strings.processing = this.cast("processing")
  @scala.inline
  def requires_action: typings.stripeV3.stripeV3Strings.requires_action = this.cast("requires_action")
  @scala.inline
  def requires_capture: typings.stripeV3.stripeV3Strings.requires_capture = this.cast("requires_capture")
  @scala.inline
  def requires_confirmation: typings.stripeV3.stripeV3Strings.requires_confirmation = this.cast("requires_confirmation")
  @scala.inline
  def requires_payment_method: typings.stripeV3.stripeV3Strings.requires_payment_method = this.cast("requires_payment_method")
  @scala.inline
  def succeeded: typings.stripeV3.stripeV3Strings.succeeded = this.cast("succeeded")
}

