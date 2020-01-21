package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.card
  - typings.stripeV3.stripeV3Strings.card_present
*/
trait paymentMethodType extends js.Object

object paymentMethodType {
  @scala.inline
  def card: typings.stripeV3.stripeV3Strings.card = this.cast("card")
  @scala.inline
  def card_present: typings.stripeV3.stripeV3Strings.card_present = this.cast("card_present")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

