package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarColorOptions extends CommonCallbackOptions {
  //  动画效果
  var animation: NavigationBarColorAnimationOptions
  // 背景颜色值，有效值为十六进制颜色
  var backgroundColor: String
  // 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  var frontColor: String
}

object NavigationBarColorOptions {
  @scala.inline
  def apply(
    animation: NavigationBarColorAnimationOptions,
    backgroundColor: String,
    frontColor: String,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): NavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(animation = animation, backgroundColor = backgroundColor, frontColor = frontColor)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigationBarColorOptions]
  }
}

