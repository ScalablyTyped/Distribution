package typings.stripe.mod.payouts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.bank_account
  - typings.stripe.stripeStrings.card
*/
trait PayoutTypes extends js.Object

object PayoutTypes {
  @scala.inline
  def bank_account: typings.stripe.stripeStrings.bank_account = this.cast("bank_account")
  @scala.inline
  def card: typings.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

