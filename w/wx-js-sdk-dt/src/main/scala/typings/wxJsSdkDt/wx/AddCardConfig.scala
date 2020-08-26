package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.CardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCardConfig extends js.Object {
  var cardList: js.Array[Card] = js.native
  var success: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.native
}

object AddCardConfig {
  @scala.inline
  def apply(cardList: js.Array[Card]): AddCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardConfig]
  }
  @scala.inline
  implicit class AddCardConfigOps[Self <: AddCardConfig] (val x: Self) extends AnyVal {
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
    def setCardListVarargs(value: Card*): Self = this.set("cardList", js.Array(value :_*))
    @scala.inline
    def setCardList(value: js.Array[Card]): Self = this.set("cardList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: /* res */ CardList => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

