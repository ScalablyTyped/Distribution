package typings.stripe.stripeMod.transfers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.alipay_account
  - typings.stripe.stripeStrings.bank_account
  - typings.stripe.stripeStrings.bitcoin_receiver
  - typings.stripe.stripeStrings.card
*/
trait SourceTypes extends js.Object

object SourceTypes {
  @scala.inline
  def alipay_account: typings.stripe.stripeStrings.alipay_account = this.cast("alipay_account")
  @scala.inline
  def bank_account: typings.stripe.stripeStrings.bank_account = this.cast("bank_account")
  @scala.inline
  def bitcoin_receiver: typings.stripe.stripeStrings.bitcoin_receiver = this.cast("bitcoin_receiver")
  @scala.inline
  def card: typings.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

