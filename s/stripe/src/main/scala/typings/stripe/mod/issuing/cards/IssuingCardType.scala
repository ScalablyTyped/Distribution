package typings.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.virtual
  - typings.stripe.stripeStrings.physical
*/
trait IssuingCardType extends js.Object

object IssuingCardType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def physical: typings.stripe.stripeStrings.physical = this.cast("physical")
  @scala.inline
  def virtual: typings.stripe.stripeStrings.virtual = this.cast("virtual")
}

