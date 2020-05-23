package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cardList  :std.ReadonlyArray<{  cardId  :string,   cardExt  :string}>} & wegame-api.wx.types.CallbacksWithType<{  cardList  :std.ReadonlyArray<{  code  :string,   cardId  :string,   cardExt  :string,   isSuccess  :boolean}>}> */
trait cardListReadonlyArraycardCardList extends js.Object {
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.Array[CardExt]
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.undefined
}

object cardListReadonlyArraycardCardList {
  @scala.inline
  def apply(
    cardList: js.Array[CardExt],
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ CardList => Unit = null
  ): cardListReadonlyArraycardCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[cardListReadonlyArraycardCardList]
  }
}

