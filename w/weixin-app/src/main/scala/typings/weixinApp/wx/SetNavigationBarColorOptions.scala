package typings.weixinApp.wx

import typings.weixinApp.anon.Duration
import typings.weixinApp.weixinAppStrings.Numbersign000000
import typings.weixinApp.weixinAppStrings.Numbersignffffff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationBarColorOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 动画效果
    */
  var animation: js.UndefOr[Duration] = js.undefined
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: String
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
    */
  var frontColor: Numbersignffffff | Numbersign000000
}

object SetNavigationBarColorOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    frontColor: Numbersignffffff | Numbersign000000,
    animation: Duration = null,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SetNavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetNavigationBarColorOptions]
  }
}

