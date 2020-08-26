package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cardList :std.ReadonlyArray<{  cardId :string,   code :string}>} & wegame-api.wx.types.CallbacksWithType<unknown> */
@js.native
trait cardListReadonlyArraycard extends js.Object {
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.Array[CardId] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
}

object cardListReadonlyArraycard {
  @scala.inline
  def apply(cardList: js.Array[CardId]): cardListReadonlyArraycard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardListReadonlyArraycard]
  }
  @scala.inline
  implicit class cardListReadonlyArraycardOps[Self <: cardListReadonlyArraycard] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

