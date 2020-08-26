package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.anon.Article
import typings.yandexMoneySdk.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[String] = js.native
  var acs_params: js.UndefOr[Dictkey] = js.native
  var acs_uri: js.UndefOr[String] = js.native
  var balance: js.UndefOr[Double] = js.native
  var credit_amount: js.UndefOr[Double] = js.native
  var digital_goods: js.UndefOr[Article] = js.native
  var error: js.UndefOr[String] = js.native
  var hold_for_pickup_link: js.UndefOr[String] = js.native
  var invoice_id: js.UndefOr[String] = js.native
  var next_retry: js.UndefOr[Double] = js.native
  var payee: js.UndefOr[String] = js.native
  var payer: js.UndefOr[String] = js.native
  var payment_id: js.UndefOr[String] = js.native
  var status: String = js.native
}

object ProcessPaymentResult {
  @scala.inline
  def apply(status: String): ProcessPaymentResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessPaymentResult]
  }
  @scala.inline
  implicit class ProcessPaymentResultOps[Self <: ProcessPaymentResult] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_unblock_uri(value: String): Self = this.set("account_unblock_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_unblock_uri: Self = this.set("account_unblock_uri", js.undefined)
    @scala.inline
    def setAcs_params(value: Dictkey): Self = this.set("acs_params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcs_params: Self = this.set("acs_params", js.undefined)
    @scala.inline
    def setAcs_uri(value: String): Self = this.set("acs_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcs_uri: Self = this.set("acs_uri", js.undefined)
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    @scala.inline
    def setCredit_amount(value: Double): Self = this.set("credit_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit_amount: Self = this.set("credit_amount", js.undefined)
    @scala.inline
    def setDigital_goods(value: Article): Self = this.set("digital_goods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigital_goods: Self = this.set("digital_goods", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHold_for_pickup_link(value: String): Self = this.set("hold_for_pickup_link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHold_for_pickup_link: Self = this.set("hold_for_pickup_link", js.undefined)
    @scala.inline
    def setInvoice_id(value: String): Self = this.set("invoice_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_id: Self = this.set("invoice_id", js.undefined)
    @scala.inline
    def setNext_retry(value: Double): Self = this.set("next_retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_retry: Self = this.set("next_retry", js.undefined)
    @scala.inline
    def setPayee(value: String): Self = this.set("payee", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayee: Self = this.set("payee", js.undefined)
    @scala.inline
    def setPayer(value: String): Self = this.set("payer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayer: Self = this.set("payer", js.undefined)
    @scala.inline
    def setPayment_id(value: String): Self = this.set("payment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_id: Self = this.set("payment_id", js.undefined)
  }
  
}

