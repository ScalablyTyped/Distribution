package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[java.lang.String] = js.undefined
  var balance: js.UndefOr[scala.Double] = js.undefined
  var contract_amount: js.UndefOr[scala.Double] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var ext_action_uri: js.UndefOr[java.lang.String] = js.undefined
  var money_source: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Cards] = js.undefined
  var protection_code: js.UndefOr[java.lang.String] = js.undefined
  var recipient_account_status: js.UndefOr[java.lang.String] = js.undefined
  var recipient_account_type: js.UndefOr[java.lang.String] = js.undefined
  var request_id: js.UndefOr[java.lang.String] = js.undefined
  var status: java.lang.String
}

object RequestPaymentResult {
  @scala.inline
  def apply(
    status: java.lang.String,
    account_unblock_uri: java.lang.String = null,
    balance: scala.Int | scala.Double = null,
    contract_amount: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    ext_action_uri: java.lang.String = null,
    money_source: yandexDashMoneyDashSdkLib.Anon_Cards = null,
    protection_code: java.lang.String = null,
    recipient_account_status: java.lang.String = null,
    recipient_account_type: java.lang.String = null,
    request_id: java.lang.String = null
  ): RequestPaymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (account_unblock_uri != null) __obj.updateDynamic("account_unblock_uri")(account_unblock_uri)
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (contract_amount != null) __obj.updateDynamic("contract_amount")(contract_amount.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (ext_action_uri != null) __obj.updateDynamic("ext_action_uri")(ext_action_uri)
    if (money_source != null) __obj.updateDynamic("money_source")(money_source)
    if (protection_code != null) __obj.updateDynamic("protection_code")(protection_code)
    if (recipient_account_status != null) __obj.updateDynamic("recipient_account_status")(recipient_account_status)
    if (recipient_account_type != null) __obj.updateDynamic("recipient_account_type")(recipient_account_type)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    __obj.asInstanceOf[RequestPaymentResult]
  }
}

