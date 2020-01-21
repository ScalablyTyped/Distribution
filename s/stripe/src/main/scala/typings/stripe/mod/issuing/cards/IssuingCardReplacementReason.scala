package typings.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.damage
  - typings.stripe.stripeStrings.expiration
  - typings.stripe.stripeStrings.loss
  - typings.stripe.stripeStrings.theft
*/
trait IssuingCardReplacementReason extends js.Object

object IssuingCardReplacementReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def damage: typings.stripe.stripeStrings.damage = this.cast("damage")
  @scala.inline
  def expiration: typings.stripe.stripeStrings.expiration = this.cast("expiration")
  @scala.inline
  def loss: typings.stripe.stripeStrings.loss = this.cast("loss")
  @scala.inline
  def theft: typings.stripe.stripeStrings.theft = this.cast("theft")
}

