package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.anon.Cards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[String] = js.native
  var balance: js.UndefOr[Double] = js.native
  var contract_amount: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
  var ext_action_uri: js.UndefOr[String] = js.native
  var money_source: js.UndefOr[Cards] = js.native
  var protection_code: js.UndefOr[String] = js.native
  var recipient_account_status: js.UndefOr[String] = js.native
  var recipient_account_type: js.UndefOr[String] = js.native
  var request_id: js.UndefOr[String] = js.native
  var status: String = js.native
}

object RequestPaymentResult {
  @scala.inline
  def apply(status: String): RequestPaymentResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentResult]
  }
  @scala.inline
  implicit class RequestPaymentResultOps[Self <: RequestPaymentResult] (val x: Self) extends AnyVal {
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
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    @scala.inline
    def setContract_amount(value: Double): Self = this.set("contract_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContract_amount: Self = this.set("contract_amount", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExt_action_uri(value: String): Self = this.set("ext_action_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt_action_uri: Self = this.set("ext_action_uri", js.undefined)
    @scala.inline
    def setMoney_source(value: Cards): Self = this.set("money_source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoney_source: Self = this.set("money_source", js.undefined)
    @scala.inline
    def setProtection_code(value: String): Self = this.set("protection_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection_code: Self = this.set("protection_code", js.undefined)
    @scala.inline
    def setRecipient_account_status(value: String): Self = this.set("recipient_account_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient_account_status: Self = this.set("recipient_account_status", js.undefined)
    @scala.inline
    def setRecipient_account_type(value: String): Self = this.set("recipient_account_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient_account_type: Self = this.set("recipient_account_type", js.undefined)
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_id: Self = this.set("request_id", js.undefined)
  }
  
}

