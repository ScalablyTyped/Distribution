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
  def ach_credit_transfer: typings.stripe.stripeStrings.ach_credit_transfer = "ach_credit_transfer".asInstanceOf[typings.stripe.stripeStrings.ach_credit_transfer]
  @scala.inline
  def ach_debit: typings.stripe.stripeStrings.ach_debit = "ach_debit".asInstanceOf[typings.stripe.stripeStrings.ach_debit]
  @scala.inline
  def alipay: typings.stripe.stripeStrings.alipay = "alipay".asInstanceOf[typings.stripe.stripeStrings.alipay]
  @scala.inline
  def bancontact: typings.stripe.stripeStrings.bancontact = "bancontact".asInstanceOf[typings.stripe.stripeStrings.bancontact]
  @scala.inline
  def card: typings.stripe.stripeStrings.card = "card".asInstanceOf[typings.stripe.stripeStrings.card]
  @scala.inline
  def card_present: typings.stripe.stripeStrings.card_present = "card_present".asInstanceOf[typings.stripe.stripeStrings.card_present]
  @scala.inline
  def eps: typings.stripe.stripeStrings.eps = "eps".asInstanceOf[typings.stripe.stripeStrings.eps]
  @scala.inline
  def giropay: typings.stripe.stripeStrings.giropay = "giropay".asInstanceOf[typings.stripe.stripeStrings.giropay]
  @scala.inline
  def ideal: typings.stripe.stripeStrings.ideal = "ideal".asInstanceOf[typings.stripe.stripeStrings.ideal]
  @scala.inline
  def klarna: typings.stripe.stripeStrings.klarna = "klarna".asInstanceOf[typings.stripe.stripeStrings.klarna]
  @scala.inline
  def p24: typings.stripe.stripeStrings.p24 = "p24".asInstanceOf[typings.stripe.stripeStrings.p24]
  @scala.inline
  def sofort: typings.stripe.stripeStrings.sofort = "sofort".asInstanceOf[typings.stripe.stripeStrings.sofort]
  @scala.inline
  def stripe_account: typings.stripe.stripeStrings.stripe_account = "stripe_account".asInstanceOf[typings.stripe.stripeStrings.stripe_account]
  @scala.inline
  def wechat: typings.stripe.stripeStrings.wechat = "wechat".asInstanceOf[typings.stripe.stripeStrings.wechat]
}

