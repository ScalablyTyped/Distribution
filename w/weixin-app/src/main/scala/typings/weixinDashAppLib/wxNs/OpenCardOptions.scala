package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[weixinDashAppLib.Anon_CardId]
}

object OpenCardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[weixinDashAppLib.Anon_CardId],
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenCardOptions]
  }
}

