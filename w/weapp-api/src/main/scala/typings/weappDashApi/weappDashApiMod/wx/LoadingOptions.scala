package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends CommonCallbackOptions {
  //  默认false。是否显示透明蒙层，防止触摸穿透
  var mask: Boolean
  // must，提示的内容
  var title: String
}

object LoadingOptions {
  @scala.inline
  def apply(
    mask: Boolean,
    title: String,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal(mask = mask, title = title)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LoadingOptions]
  }
}

