package typings.uniApp

import typings.uniApp.uniAppStrings.`fade-in`
import typings.uniApp.uniAppStrings.`pop-in`
import typings.uniApp.uniAppStrings.`slide-in-bottom`
import typings.uniApp.uniAppStrings.`slide-in-left`
import typings.uniApp.uniAppStrings.`slide-in-right`
import typings.uniApp.uniAppStrings.`slide-in-top`
import typings.uniApp.uniAppStrings.`zoom-fade-out`
import typings.uniApp.uniAppStrings.`zoom-out`
import typings.uniApp.uniAppStrings.auto
import typings.uniApp.uniAppStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToOptions extends js.Object {
  /**
    * 窗口显示动画的持续时间，单位为 ms
    */
  var animationDuration: js.UndefOr[Double] = js.native
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
  ] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 需要跳转的应用内非 tabBar 的页面的路径 , 路径后可以带参数
    */
  var url: js.UndefOr[String] = js.native
}

object NavigateToOptions {
  @scala.inline
  def apply(): NavigateToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateToOptions]
  }
  @scala.inline
  implicit class NavigateToOptionsOps[Self <: NavigateToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationType(
      value: auto | none | `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
    ): Self = this.set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

