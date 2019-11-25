package typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet

import typings.yandexDashMoneyDashSdk.Anon_Cards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[String] = js.undefined
  var balance: js.UndefOr[Double] = js.undefined
  var contract_amount: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var ext_action_uri: js.UndefOr[String] = js.undefined
  var money_source: js.UndefOr[Anon_Cards] = js.undefined
  var protection_code: js.UndefOr[String] = js.undefined
  var recipient_account_status: js.UndefOr[String] = js.undefined
  var recipient_account_type: js.UndefOr[String] = js.undefined
  var request_id: js.UndefOr[String] = js.undefined
  var status: String
}

object RequestPaymentResult {
  @scala.inline
  def apply(
    status: String,
    account_unblock_uri: String = null,
    balance: Int | Double = null,
    contract_amount: Int | Double = null,
    error: String = null,
    ext_action_uri: String = null,
    money_source: Anon_Cards = null,
    protection_code: String = null,
    recipient_account_status: String = null,
    recipient_account_type: String = null,
    request_id: String = null
  ): RequestPaymentResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (account_unblock_uri != null) __obj.updateDynamic("account_unblock_uri")(account_unblock_uri.asInstanceOf[js.Any])
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (contract_amount != null) __obj.updateDynamic("contract_amount")(contract_amount.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ext_action_uri != null) __obj.updateDynamic("ext_action_uri")(ext_action_uri.asInstanceOf[js.Any])
    if (money_source != null) __obj.updateDynamic("money_source")(money_source.asInstanceOf[js.Any])
    if (protection_code != null) __obj.updateDynamic("protection_code")(protection_code.asInstanceOf[js.Any])
    if (recipient_account_status != null) __obj.updateDynamic("recipient_account_status")(recipient_account_status.asInstanceOf[js.Any])
    if (recipient_account_type != null) __obj.updateDynamic("recipient_account_type")(recipient_account_type.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentResult]
  }
}

