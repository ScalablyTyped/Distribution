package typings.uniDashApp

import typings.uniDashApp.uniDashAppStrings.`fade-in`
import typings.uniDashApp.uniDashAppStrings.`pop-in`
import typings.uniDashApp.uniDashAppStrings.`slide-in-bottom`
import typings.uniDashApp.uniDashAppStrings.`slide-in-left`
import typings.uniDashApp.uniDashAppStrings.`slide-in-right`
import typings.uniDashApp.uniDashAppStrings.`slide-in-top`
import typings.uniDashApp.uniDashAppStrings.`zoom-fade-out`
import typings.uniDashApp.uniDashAppStrings.`zoom-out`
import typings.uniDashApp.uniDashAppStrings.auto
import typings.uniDashApp.uniDashAppStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToOptions extends js.Object {
  /**
    * 窗口显示动画的持续时间，单位为 ms
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
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
    auto | none | `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
  ] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要跳转的应用内非 tabBar 的页面的路径 , 路径后可以带参数
    */
  var url: js.UndefOr[String] = js.undefined
}

object NavigateToOptions {
  @scala.inline
  def apply(
    animationDuration: Int | Double = null,
    animationType: auto | none | `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in` = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null,
    url: String = null
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

