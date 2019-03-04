package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 需要打开的卡券列表
  */
trait OpenCardConfig extends WxBaseRequestConfig {
  var cardList: js.Array[OpenCardObj]
}

object OpenCardConfig {
  @scala.inline
  def apply(
    cardList: js.Array[OpenCardObj],
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null
  ): OpenCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OpenCardConfig]
  }
}

