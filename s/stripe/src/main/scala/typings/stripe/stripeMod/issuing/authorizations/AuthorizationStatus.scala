package typings.stripe.stripeMod.issuing.authorizations

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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.stripe.stripeStrings.closed = this.cast("closed")
  @scala.inline
  def pending: typings.stripe.stripeStrings.pending = this.cast("pending")
  @scala.inline
  def reversed: typings.stripe.stripeStrings.reversed = this.cast("reversed")
}

