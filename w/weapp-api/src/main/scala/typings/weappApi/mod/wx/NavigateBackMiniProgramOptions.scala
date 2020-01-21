package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackMiniProgramOptions extends CommonCallbackOptions {
  //  需要返回给上一个小程序的数据，上一个小程序可在 App.onShow 中获取到这份数据。
  var extraData: js.Object
}

object NavigateBackMiniProgramOptions {
  @scala.inline
  def apply(
    extraData: js.Object,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
}

