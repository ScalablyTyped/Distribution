package typings.stripe.mod.issuing.cardholders

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
  def active: typings.stripe.stripeStrings.active = "active".asInstanceOf[typings.stripe.stripeStrings.active]
  @scala.inline
  def blocked: typings.stripe.stripeStrings.blocked = "blocked".asInstanceOf[typings.stripe.stripeStrings.blocked]
  @scala.inline
  def inactive: typings.stripe.stripeStrings.inactive = "inactive".asInstanceOf[typings.stripe.stripeStrings.inactive]
}

