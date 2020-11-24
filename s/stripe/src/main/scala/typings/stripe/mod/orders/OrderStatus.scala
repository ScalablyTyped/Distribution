package typings.stripe.mod.orders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Current order status. One of created, paid, canceled, fulfilled, or returned. More detail in the Relay API Overview.
  */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.created
  - typings.stripe.stripeStrings.paid
  - typings.stripe.stripeStrings.canceled
  - typings.stripe.stripeStrings.fulfilled
  - typings.stripe.stripeStrings.returned
*/
trait OrderStatus extends js.Object
object OrderStatus {
  
  @scala.inline
  def canceled: typings.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typings.stripe.stripeStrings.canceled]
  
  @scala.inline
  def created: typings.stripe.stripeStrings.created = "created".asInstanceOf[typings.stripe.stripeStrings.created]
  
  @scala.inline
  def fulfilled: typings.stripe.stripeStrings.fulfilled = "fulfilled".asInstanceOf[typings.stripe.stripeStrings.fulfilled]
  
  @scala.inline
  def paid: typings.stripe.stripeStrings.paid = "paid".asInstanceOf[typings.stripe.stripeStrings.paid]
  
  @scala.inline
  def returned: typings.stripe.stripeStrings.returned = "returned".asInstanceOf[typings.stripe.stripeStrings.returned]
}
