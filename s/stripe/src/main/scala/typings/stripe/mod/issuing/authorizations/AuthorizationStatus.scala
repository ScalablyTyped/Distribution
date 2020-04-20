package typings.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.closed
  - typings.stripe.stripeStrings.pending
  - typings.stripe.stripeStrings.reversed
*/
trait AuthorizationStatus extends js.Object

object AuthorizationStatus {
  @scala.inline
  def closed: typings.stripe.stripeStrings.closed = "closed".asInstanceOf[typings.stripe.stripeStrings.closed]
  @scala.inline
  def pending: typings.stripe.stripeStrings.pending = "pending".asInstanceOf[typings.stripe.stripeStrings.pending]
  @scala.inline
  def reversed: typings.stripe.stripeStrings.reversed = "reversed".asInstanceOf[typings.stripe.stripeStrings.reversed]
}

