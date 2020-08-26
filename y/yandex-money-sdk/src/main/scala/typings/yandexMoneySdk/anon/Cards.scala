package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cards extends js.Object {
  var cards: js.UndefOr[Cscrequired] = js.native
  var wallet: js.UndefOr[Allowed] = js.native
}

object Cards {
  @scala.inline
  def apply(): Cards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cards]
  }
  @scala.inline
  implicit class CardsOps[Self <: Cards] (val x: Self) extends AnyVal {
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
    def setCards(value: Cscrequired): Self = this.set("cards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCards: Self = this.set("cards", js.undefined)
    @scala.inline
    def setWallet(value: Allowed): Self = this.set("wallet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWallet: Self = this.set("wallet", js.undefined)
  }
  
}

