package typings.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripejs.stripejsStrings.card
  - typings.stripejs.stripejsStrings.cardNumber
  - typings.stripejs.stripejsStrings.cardExpiry
  - typings.stripejs.stripejsStrings.cardCvc
  - typings.stripejs.stripejsStrings.postalCode
  - typings.stripejs.stripejsStrings.paymentRequestButton
*/
trait ElementType extends js.Object

object ElementType {
  @scala.inline
  def card: typings.stripejs.stripejsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typings.stripejs.stripejsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typings.stripejs.stripejsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typings.stripejs.stripejsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def paymentRequestButton: typings.stripejs.stripejsStrings.paymentRequestButton = this.cast("paymentRequestButton")
  @scala.inline
  def postalCode: typings.stripejs.stripejsStrings.postalCode = this.cast("postalCode")
}

