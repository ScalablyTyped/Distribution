package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cardList :std.ReadonlyArray<{  cardId :string,   cardExt :string}>} & wegame-api.wx.types.CallbacksWithType<{  cardList :std.ReadonlyArray<{  code :string,   cardId :string,   cardExt :string,   isSuccess :boolean}>}> */
@js.native
trait cardListReadonlyArraycardCardList extends js.Object {
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.Array[CardExt] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.native
}

object cardListReadonlyArraycardCardList {
  @scala.inline
  def apply(cardList: js.Array[CardExt]): cardListReadonlyArraycardCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardListReadonlyArraycardCardList]
  }
  @scala.inline
  implicit class cardListReadonlyArraycardCardListOps[Self <: cardListReadonlyArraycardCardList] (val x: Self) extends AnyVal {
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
    def setCardListVarargs(value: CardExt*): Self = this.set("cardList", js.Array(value :_*))
    @scala.inline
    def setCardList(value: js.Array[CardExt]): Self = this.set("cardList", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ CardList => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

