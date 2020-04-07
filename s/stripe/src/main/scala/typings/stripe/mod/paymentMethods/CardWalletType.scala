package typings.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined stripe.stripe.paymentMethods.CardWallet['type'] */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.masterpass
  - typings.stripe.stripeStrings.apple_pay
  - typings.stripe.stripeStrings.amex_express_checkout
  - typings.stripe.stripeStrings.google_pay
  - typings.stripe.stripeStrings.visa_checkout
  - typings.stripe.stripeStrings.samsung_pay
*/
trait CardWalletType extends js.Object

object CardWalletType {
  @scala.inline
  def amex_express_checkout: typings.stripe.stripeStrings.amex_express_checkout = this.cast("amex_express_checkout")
  @scala.inline
  def apple_pay: typings.stripe.stripeStrings.apple_pay = this.cast("apple_pay")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def google_pay: typings.stripe.stripeStrings.google_pay = this.cast("google_pay")
  @scala.inline
  def masterpass: typings.stripe.stripeStrings.masterpass = this.cast("masterpass")
  @scala.inline
  def samsung_pay: typings.stripe.stripeStrings.samsung_pay = this.cast("samsung_pay")
  @scala.inline
  def visa_checkout: typings.stripe.stripeStrings.visa_checkout = this.cast("visa_checkout")
}

