package typings.stripe.stripeMod.creditNotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reason for issuing a credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory
  */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.duplicate
  - typings.stripe.stripeStrings.fraudulent
  - typings.stripe.stripeStrings.order_change
  - typings.stripe.stripeStrings.product_unsatisfactory
*/
trait CreditNoteReason extends js.Object

object CreditNoteReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typings.stripe.stripeStrings.duplicate = this.cast("duplicate")
  @scala.inline
  def fraudulent: typings.stripe.stripeStrings.fraudulent = this.cast("fraudulent")
  @scala.inline
  def order_change: typings.stripe.stripeStrings.order_change = this.cast("order_change")
  @scala.inline
  def product_unsatisfactory: typings.stripe.stripeStrings.product_unsatisfactory = this.cast("product_unsatisfactory")
}

