package typings.stripe.mod.creditNotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def duplicate: typings.stripe.stripeStrings.duplicate = "duplicate".asInstanceOf[typings.stripe.stripeStrings.duplicate]
  
  @scala.inline
  def fraudulent: typings.stripe.stripeStrings.fraudulent = "fraudulent".asInstanceOf[typings.stripe.stripeStrings.fraudulent]
  
  @scala.inline
  def order_change: typings.stripe.stripeStrings.order_change = "order_change".asInstanceOf[typings.stripe.stripeStrings.order_change]
  
  @scala.inline
  def product_unsatisfactory: typings.stripe.stripeStrings.product_unsatisfactory = "product_unsatisfactory".asInstanceOf[typings.stripe.stripeStrings.product_unsatisfactory]
}
