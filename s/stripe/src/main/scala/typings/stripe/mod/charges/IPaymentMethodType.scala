package typings.stripe.mod.charges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined stripe.stripe.charges.IPaymentMethodDetails['type'] */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.p24
  - typings.stripe.stripeStrings.sofort
  - typings.stripe.stripeStrings.alipay
  - typings.stripe.stripeStrings.stripe_account
  - typings.stripe.stripeStrings.giropay
  - typings.stripe.stripeStrings.bancontact
  - typings.stripe.stripeStrings.ideal
  - typings.stripe.stripeStrings.card_present
  - typings.stripe.stripeStrings.wechat
  - typings.stripe.stripeStrings.eps
  - typings.stripe.stripeStrings.klarna
  - typings.stripe.stripeStrings.ach_debit
  - typings.stripe.stripeStrings.ach_credit_transfer
  - typings.stripe.stripeStrings.card
*/
trait IPaymentMethodType extends js.Object

object IPaymentMethodType {
  @scala.inline
  def ach_credit_transfer: typings.stripe.stripeStrings.ach_credit_transfer = this.cast("ach_credit_transfer")
  @scala.inline
  def ach_debit: typings.stripe.stripeStrings.ach_debit = this.cast("ach_debit")
  @scala.inline
  def alipay: typings.stripe.stripeStrings.alipay = this.cast("alipay")
  @scala.inline
  def bancontact: typings.stripe.stripeStrings.bancontact = this.cast("bancontact")
  @scala.inline
  def card: typings.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  def card_present: typings.stripe.stripeStrings.card_present = this.cast("card_present")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eps: typings.stripe.stripeStrings.eps = this.cast("eps")
  @scala.inline
  def giropay: typings.stripe.stripeStrings.giropay = this.cast("giropay")
  @scala.inline
  def ideal: typings.stripe.stripeStrings.ideal = this.cast("ideal")
  @scala.inline
  def klarna: typings.stripe.stripeStrings.klarna = this.cast("klarna")
  @scala.inline
  def p24: typings.stripe.stripeStrings.p24 = this.cast("p24")
  @scala.inline
  def sofort: typings.stripe.stripeStrings.sofort = this.cast("sofort")
  @scala.inline
  def stripe_account: typings.stripe.stripeStrings.stripe_account = this.cast("stripe_account")
  @scala.inline
  def wechat: typings.stripe.stripeStrings.wechat = this.cast("wechat")
}

