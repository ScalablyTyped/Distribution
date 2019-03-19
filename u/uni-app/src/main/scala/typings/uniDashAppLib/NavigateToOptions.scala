package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToOptions extends js.Object {
  /**
    * 窗口显示动画的持续时间，单位为 ms
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * 窗口显示的动画类型
    * - auto: 自动选择动画效果
    * - none: 无动画效果
    * - slide-in-right: 从右侧横向滑动效果
    * - slide-in-left: 左侧横向滑动效果
    * - slide-in-top: 从上侧竖向滑动效果
    * - slide-in-bottom: 从下侧竖向滑动效果
    * - fade-in: 从透明到不透明逐渐显示效果
    * - zoom-out: 从小到大逐渐放大显示效果
    * - zoom-fade-out: 从小到大逐渐放大并且从透明到不透明逐渐显示效果
    * - pop-in: 从右侧平移入栈动画效果
    */
  var animationType: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.auto | uniDashAppLib.uniDashAppLibStrings.none | uniDashAppLib.uniDashAppLibStrings.`slide-in-right` | uniDashAppLib.uniDashAppLibStrings.`slide-in-left` | uniDashAppLib.uniDashAppLibStrings.`slide-in-top` | uniDashAppLib.uniDashAppLibStrings.`slide-in-bottom` | uniDashAppLib.uniDashAppLibStrings.`fade-in` | uniDashAppLib.uniDashAppLibStrings.`zoom-out` | uniDashAppLib.uniDashAppLibStrings.`zoom-fade-out` | uniDashAppLib.uniDashAppLibStrings.`pop-in`
  ] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 需要跳转的应用内非 tabBar 的页面的路径 , 路径后可以带参数
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object NavigateToOptions {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    animationType: uniDashAppLib.uniDashAppLibStrings.auto | uniDashAppLib.uniDashAppLibStrings.none | uniDashAppLib.uniDashAppLibStrings.`slide-in-right` | uniDashAppLib.uniDashAppLibStrings.`slide-in-left` | uniDashAppLib.uniDashAppLibStrings.`slide-in-top` | uniDashAppLib.uniDashAppLibStrings.`slide-in-bottom` | uniDashAppLib.uniDashAppLibStrings.`fade-in` | uniDashAppLib.uniDashAppLibStrings.`zoom-out` | uniDashAppLib.uniDashAppLibStrings.`zoom-fade-out` | uniDashAppLib.uniDashAppLibStrings.`pop-in` = null,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: () => scala.Unit = null,
    url: java.lang.String = null
  ): NavigateToOptions = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[NavigateToOptions]
  }
}

