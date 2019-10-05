package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarBadgeOptions extends CommonCallbackOptions {
  //  tabBar 的哪一项，从左边算起
  var index: Double
  //  显示的文本，超过 4 个字符则显示成 ...
  var text: String
}

object TabBarBadgeOptions {
  @scala.inline
  def apply(
    index: Double,
    text: String,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): TabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index, text = text)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TabBarBadgeOptions]
  }
}

