package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationBarColorOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 动画效果
  		 */
  var animation: js.UndefOr[weixinDashAppLib.Anon_Duratio] = js.undefined
  /**
  		 * 背景颜色值，有效值为十六进制颜色
  		 */
  var backgroundColor: java.lang.String
  /**
  		 * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  		 */
  var frontColor: weixinDashAppLib.weixinDashAppLibStrings.`#ffffff` | weixinDashAppLib.weixinDashAppLibStrings.`#000000`
}

object SetNavigationBarColorOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    frontColor: weixinDashAppLib.weixinDashAppLibStrings.`#ffffff` | weixinDashAppLib.weixinDashAppLibStrings.`#000000`,
    animation: weixinDashAppLib.Anon_Duratio = null,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetNavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, frontColor = frontColor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetNavigationBarColorOptions]
  }
}

