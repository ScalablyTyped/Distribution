package typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet

import typings.yandexDashMoneyDashSdk.Anon_Available
import typings.yandexDashMoneyDashSdk.Anon_Panfragment
import typings.yandexDashMoneyDashSdk.Anon_Ts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfoResult extends js.Object {
  var account: String
  var account_status: String
  var account_type: String
  var avatar: js.UndefOr[Anon_Ts] = js.undefined
  var balance: Double
  var balance_details: js.UndefOr[Anon_Available] = js.undefined
  var cards_linked: js.UndefOr[js.Array[Anon_Panfragment]] = js.undefined
  var currency: String
}

object AccountInfoResult {
  @scala.inline
  def apply(
    account: String,
    account_status: String,
    account_type: String,
    balance: Double,
    currency: String,
    avatar: Anon_Ts = null,
    balance_details: Anon_Available = null,
    cards_linked: js.Array[Anon_Panfragment] = null
  ): AccountInfoResult = {
    val __obj = js.Dynamic.literal(account = account, account_status = account_status, account_type = account_type, balance = balance, currency = currency)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (balance_details != null) __obj.updateDynamic("balance_details")(balance_details)
    if (cards_linked != null) __obj.updateDynamic("cards_linked")(cards_linked)
    __obj.asInstanceOf[AccountInfoResult]
  }
}

