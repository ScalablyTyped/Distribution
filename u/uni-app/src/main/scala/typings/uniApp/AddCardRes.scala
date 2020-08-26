package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCardRes extends js.Object {
  /**
    * 卡券 id
    */
  var cardList: js.UndefOr[js.Array[CardData]] = js.native
}

object AddCardRes {
  @scala.inline
  def apply(): AddCardRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardRes]
  }
  @scala.inline
  implicit class AddCardResOps[Self <: AddCardRes] (val x: Self) extends AnyVal {
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
    def setCardListVarargs(value: CardData*): Self = this.set("cardList", js.Array(value :_*))
    @scala.inline
    def setCardList(value: js.Array[CardData]): Self = this.set("cardList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardList: Self = this.set("cardList", js.undefined)
  }
  
}

