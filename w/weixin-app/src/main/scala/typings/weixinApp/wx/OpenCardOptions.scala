package typings.weixinApp.wx

import typings.weixinApp.anon.CardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[CardId] = js.native
}

object OpenCardOptions {
  @scala.inline
  def apply(cardList: js.Array[CardId]): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardOptions]
  }
  @scala.inline
  implicit class OpenCardOptionsOps[Self <: OpenCardOptions] (val x: Self) extends AnyVal {
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
    def setCardListVarargs(value: CardId*): Self = this.set("cardList", js.Array(value :_*))
    @scala.inline
    def setCardList(value: js.Array[CardId]): Self = this.set("cardList", value.asInstanceOf[js.Any])
  }
  
}

