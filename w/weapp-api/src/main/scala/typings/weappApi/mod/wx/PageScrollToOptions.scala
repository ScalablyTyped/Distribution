package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//  滚动
trait PageScrollToOptions extends CommonCallbackOptions {
  //  滚动动画的时长，单位 ms。默认300
  var duration: Double
  //  滚动到页面的目标位置，单位 px
  var scrollTop: Double
}

object PageScrollToOptions {
  @scala.inline
  def apply(
    duration: Double,
    scrollTop: Double,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PageScrollToOptions]
  }
}

