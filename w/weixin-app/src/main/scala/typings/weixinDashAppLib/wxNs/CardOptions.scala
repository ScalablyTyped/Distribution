package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[Card]
  @JSName("complete")
  var complete_CardOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  @JSName("fail")
  var fail_CardOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  @JSName("success")
  var success_CardOptions: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object CardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[Card],
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): CardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardList")(cardList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CardOptions]
  }
}

