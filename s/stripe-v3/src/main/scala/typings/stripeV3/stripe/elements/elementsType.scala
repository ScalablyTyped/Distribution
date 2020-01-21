package typings.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.card
  - typings.stripeV3.stripeV3Strings.cardNumber
  - typings.stripeV3.stripeV3Strings.cardExpiry
  - typings.stripeV3.stripeV3Strings.cardCvc
  - typings.stripeV3.stripeV3Strings.postalCode
  - typings.stripeV3.stripeV3Strings.paymentRequestButton
  - typings.stripeV3.stripeV3Strings.iban
  - typings.stripeV3.stripeV3Strings.idealBank
*/
trait elementsType extends js.Object

object elementsType {
  @scala.inline
  def card: typings.stripeV3.stripeV3Strings.card = this.cast("card")
  @scala.inline
  def cardCvc: typings.stripeV3.stripeV3Strings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typings.stripeV3.stripeV3Strings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typings.stripeV3.stripeV3Strings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typings.stripeV3.stripeV3Strings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typings.stripeV3.stripeV3Strings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typings.stripeV3.stripeV3Strings.paymentRequestButton = this.cast("paymentRequestButton")
  @scala.inline
  def postalCode: typings.stripeV3.stripeV3Strings.postalCode = this.cast("postalCode")
}

