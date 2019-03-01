package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfoResult extends js.Object {
  var account: java.lang.String
  var account_status: java.lang.String
  var account_type: java.lang.String
  var avatar: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Ts] = js.undefined
  var balance: scala.Double
  var balance_details: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Available] = js.undefined
  var cards_linked: js.UndefOr[js.Array[yandexDashMoneyDashSdkLib.Anon_Panfragment]] = js.undefined
  var currency: java.lang.String
}

object AccountInfoResult {
  @scala.inline
  def apply(
    account: java.lang.String,
    account_status: java.lang.String,
    account_type: java.lang.String,
    balance: scala.Double,
    currency: java.lang.String,
    avatar: yandexDashMoneyDashSdkLib.Anon_Ts = null,
    balance_details: yandexDashMoneyDashSdkLib.Anon_Available = null,
    cards_linked: js.Array[yandexDashMoneyDashSdkLib.Anon_Panfragment] = null
  ): AccountInfoResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account")(account)
    __obj.updateDynamic("account_status")(account_status)
    __obj.updateDynamic("account_type")(account_type)
    __obj.updateDynamic("balance")(balance)
    __obj.updateDynamic("currency")(currency)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (balance_details != null) __obj.updateDynamic("balance_details")(balance_details)
    if (cards_linked != null) __obj.updateDynamic("cards_linked")(cards_linked)
    __obj.asInstanceOf[AccountInfoResult]
  }
}

