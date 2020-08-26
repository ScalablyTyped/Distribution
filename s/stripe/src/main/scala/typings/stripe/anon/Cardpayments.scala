package typings.stripe.anon

import typings.stripe.stripeStrings.active
import typings.stripe.stripeStrings.inactive
import typings.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cardpayments extends js.Object {
  /**
    * The status of the card payments capability of the account, or whether
    * the account can directly process credit and debit card charges.
    */
  var card_payments: js.UndefOr[active | inactive | pending] = js.native
  /**
    * The status of the legacy payments capability of the account.
    */
  var legacy_payments: js.UndefOr[active | inactive | pending] = js.native
  /**
    * The status of the transfers capability of the account, or whether your
    * platform can transfer funds to the account.
    */
  var transfers: js.UndefOr[active | inactive | pending] = js.native
}

object Cardpayments {
  @scala.inline
  def apply(): Cardpayments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cardpayments]
  }
  @scala.inline
  implicit class CardpaymentsOps[Self <: Cardpayments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCard_payments(value: active | inactive | pending): Self = this.set("card_payments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard_payments: Self = this.set("card_payments", js.undefined)
    @scala.inline
    def setLegacy_payments(value: active | inactive | pending): Self = this.set("legacy_payments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacy_payments: Self = this.set("legacy_payments", js.undefined)
    @scala.inline
    def setTransfers(value: active | inactive | pending): Self = this.set("transfers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfers: Self = this.set("transfers", js.undefined)
  }
  
}

