package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackOptions extends CommonCallbackOptions {
  //  返回的页面数，如果 delta 大于现有页面数，则返回到首页。
  var delta: Double
}

object NavigateBackOptions {
  @scala.inline
  def apply(
    delta: Double,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): NavigateBackOptions = {
    val __obj = js.Dynamic.literal(delta = delta)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateBackOptions]
  }
}

