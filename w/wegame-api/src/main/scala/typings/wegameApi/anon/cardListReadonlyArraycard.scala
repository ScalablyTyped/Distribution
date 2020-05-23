package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cardList  :std.ReadonlyArray<{  cardId  :string,   code  :string}>} & wegame-api.wx.types.CallbacksWithType<unknown> */
trait cardListReadonlyArraycard extends js.Object {
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.Array[CardId]
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
}

object cardListReadonlyArraycard {
  @scala.inline
  def apply(
    cardList: js.Array[CardId],
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): cardListReadonlyArraycard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[cardListReadonlyArraycard]
  }
}

