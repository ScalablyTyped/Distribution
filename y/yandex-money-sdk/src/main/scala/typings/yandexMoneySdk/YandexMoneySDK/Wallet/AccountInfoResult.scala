package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.AnonAvailable
import typings.yandexMoneySdk.AnonPanfragment
import typings.yandexMoneySdk.AnonTs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfoResult extends js.Object {
  var account: String
  var account_status: String
  var account_type: String
  var avatar: js.UndefOr[AnonTs] = js.undefined
  var balance: Double
  var balance_details: js.UndefOr[AnonAvailable] = js.undefined
  var cards_linked: js.UndefOr[js.Array[AnonPanfragment]] = js.undefined
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
    avatar: AnonTs = null,
    balance_details: AnonAvailable = null,
    cards_linked: js.Array[AnonPanfragment] = null
  ): AccountInfoResult = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], account_status = account_status.asInstanceOf[js.Any], account_type = account_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (balance_details != null) __obj.updateDynamic("balance_details")(balance_details.asInstanceOf[js.Any])
    if (cards_linked != null) __obj.updateDynamic("cards_linked")(cards_linked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfoResult]
  }
}

