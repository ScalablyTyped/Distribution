package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarAnimationOptions extends CommonCallbackOptions {
  //  是否需要动画效果
  var animation: Boolean
}

object TabBarAnimationOptions {
  @scala.inline
  def apply(
    animation: Boolean,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): TabBarAnimationOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TabBarAnimationOptions]
  }
}

