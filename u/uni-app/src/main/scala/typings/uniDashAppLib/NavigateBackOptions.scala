package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackOptions extends js.Object {
  /**
    * 窗口关闭动画的持续时间，单位为 ms
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * 窗口关闭的动画类型
    * - auto: 自动选择动画效果
    * - none: 无动画效果
    * - slide-out-right: 横向向右侧滑出屏幕动画
    * - slide-out-left: 横向向左侧滑出屏幕动画
    * - slide-out-top: 竖向向上侧滑出屏幕动画
    * - slide-out-bottom: 竖向向下侧滑出屏幕动画
    * - fade-out: 从不透明到透明逐渐隐藏动画
    * - zoom-in: 从大逐渐缩小关闭动画
    * - zoom-fade-in: 从大逐渐缩小并且从不透明到透明逐渐隐藏关闭动画
    * - pop-out: 从右侧平移出栈动画效果
    */
  var animationType: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.auto | uniDashAppLib.uniDashAppLibStrings.none | uniDashAppLib.uniDashAppLibStrings.`slide-out-right` | uniDashAppLib.uniDashAppLibStrings.`slide-out-left` | uniDashAppLib.uniDashAppLibStrings.`slide-out-top` | uniDashAppLib.uniDashAppLibStrings.`slide-out-bottom` | uniDashAppLib.uniDashAppLibStrings.`fade-out` | uniDashAppLib.uniDashAppLibStrings.`zoom-in` | uniDashAppLib.uniDashAppLibStrings.`zoom-fade-in` | uniDashAppLib.uniDashAppLibStrings.`pop-out`
  ] = js.undefined
  /**
    * 返回的页面数，如果 delta 大于现有页面数，则返回到首页
    */
  var delta: js.UndefOr[scala.Double] = js.undefined
}

object NavigateBackOptions {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    animationType: uniDashAppLib.uniDashAppLibStrings.auto | uniDashAppLib.uniDashAppLibStrings.none | uniDashAppLib.uniDashAppLibStrings.`slide-out-right` | uniDashAppLib.uniDashAppLibStrings.`slide-out-left` | uniDashAppLib.uniDashAppLibStrings.`slide-out-top` | uniDashAppLib.uniDashAppLibStrings.`slide-out-bottom` | uniDashAppLib.uniDashAppLibStrings.`fade-out` | uniDashAppLib.uniDashAppLibStrings.`zoom-in` | uniDashAppLib.uniDashAppLibStrings.`zoom-fade-in` | uniDashAppLib.uniDashAppLibStrings.`pop-out` = null,
    delta: scala.Int | scala.Double = null
  ): NavigateBackOptions = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateBackOptions]
  }
}

