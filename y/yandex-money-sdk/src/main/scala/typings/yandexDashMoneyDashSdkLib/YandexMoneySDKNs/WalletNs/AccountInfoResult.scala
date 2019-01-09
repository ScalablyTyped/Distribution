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

