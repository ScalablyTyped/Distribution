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
  def canceled: typings.stripeV3.stripeV3Strings.canceled = "canceled".asInstanceOf[typings.stripeV3.stripeV3Strings.canceled]
  @scala.inline
  def processing: typings.stripeV3.stripeV3Strings.processing = "processing".asInstanceOf[typings.stripeV3.stripeV3Strings.processing]
  @scala.inline
  def requires_action: typings.stripeV3.stripeV3Strings.requires_action = "requires_action".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_action]
  @scala.inline
  def requires_capture: typings.stripeV3.stripeV3Strings.requires_capture = "requires_capture".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_capture]
  @scala.inline
  def requires_confirmation: typings.stripeV3.stripeV3Strings.requires_confirmation = "requires_confirmation".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_confirmation]
  @scala.inline
  def requires_payment_method: typings.stripeV3.stripeV3Strings.requires_payment_method = "requires_payment_method".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_payment_method]
  @scala.inline
  def succeeded: typings.stripeV3.stripeV3Strings.succeeded = "succeeded".asInstanceOf[typings.stripeV3.stripeV3Strings.succeeded]
}

