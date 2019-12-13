package typings.stripe.stripeMod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.active
  - typings.stripe.stripeStrings.inactive
  - typings.stripe.stripeStrings.blocked
*/
trait CardholderStatus extends js.Object

object CardholderStatus {
  @scala.inline
  def active: typings.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def blocked: typings.stripe.stripeStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.stripe.stripeStrings.inactive = this.cast("inactive")
}

