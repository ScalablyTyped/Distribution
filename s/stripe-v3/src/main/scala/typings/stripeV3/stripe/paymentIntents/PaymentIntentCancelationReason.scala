package typings.stripeV3.stripe.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.duplicate
  - typings.stripeV3.stripeV3Strings.fraudulent
  - typings.stripeV3.stripeV3Strings.requested_by_customer
  - typings.stripeV3.stripeV3Strings.abandoned
  - typings.stripeV3.stripeV3Strings.failed_invoice
  - typings.stripeV3.stripeV3Strings.void_invoice
  - typings.stripeV3.stripeV3Strings.automatic
*/
trait PaymentIntentCancelationReason extends js.Object

object PaymentIntentCancelationReason {
  @scala.inline
  def abandoned: typings.stripeV3.stripeV3Strings.abandoned = "abandoned".asInstanceOf[typings.stripeV3.stripeV3Strings.abandoned]
  @scala.inline
  def automatic: typings.stripeV3.stripeV3Strings.automatic = "automatic".asInstanceOf[typings.stripeV3.stripeV3Strings.automatic]
  @scala.inline
  def duplicate: typings.stripeV3.stripeV3Strings.duplicate = "duplicate".asInstanceOf[typings.stripeV3.stripeV3Strings.duplicate]
  @scala.inline
  def failed_invoice: typings.stripeV3.stripeV3Strings.failed_invoice = "failed_invoice".asInstanceOf[typings.stripeV3.stripeV3Strings.failed_invoice]
  @scala.inline
  def fraudulent: typings.stripeV3.stripeV3Strings.fraudulent = "fraudulent".asInstanceOf[typings.stripeV3.stripeV3Strings.fraudulent]
  @scala.inline
  def requested_by_customer: typings.stripeV3.stripeV3Strings.requested_by_customer = "requested_by_customer".asInstanceOf[typings.stripeV3.stripeV3Strings.requested_by_customer]
  @scala.inline
  def void_invoice: typings.stripeV3.stripeV3Strings.void_invoice = "void_invoice".asInstanceOf[typings.stripeV3.stripeV3Strings.void_invoice]
}

