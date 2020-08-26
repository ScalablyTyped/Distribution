package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.anon.Available
import typings.yandexMoneySdk.anon.Panfragment
import typings.yandexMoneySdk.anon.Ts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfoResult extends js.Object {
  var account: String = js.native
  var account_status: String = js.native
  var account_type: String = js.native
  var avatar: js.UndefOr[Ts] = js.native
  var balance: Double = js.native
  var balance_details: js.UndefOr[Available] = js.native
  var cards_linked: js.UndefOr[js.Array[Panfragment]] = js.native
  var currency: String = js.native
}

object AccountInfoResult {
  @scala.inline
  def apply(account: String, account_status: String, account_type: String, balance: Double, currency: String): AccountInfoResult = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], account_status = account_status.asInstanceOf[js.Any], account_type = account_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfoResult]
  }
  @scala.inline
  implicit class AccountInfoResultOps[Self <: AccountInfoResult] (val x: Self) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_status(value: String): Self = this.set("account_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_type(value: String): Self = this.set("account_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar(value: Ts): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setBalance_details(value: Available): Self = this.set("balance_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance_details: Self = this.set("balance_details", js.undefined)
    @scala.inline
    def setCards_linkedVarargs(value: Panfragment*): Self = this.set("cards_linked", js.Array(value :_*))
    @scala.inline
    def setCards_linked(value: js.Array[Panfragment]): Self = this.set("cards_linked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCards_linked: Self = this.set("cards_linked", js.undefined)
  }
  
}

