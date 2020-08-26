package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNavigationbarColorOptions extends js.Object {
  /**
    * 动画效果
    */
  var animation: js.UndefOr[NavigationBarAnimation] = js.native
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色
    */
  var frontColor: js.UndefOr[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object SetNavigationbarColorOptions {
  @scala.inline
  def apply(): SetNavigationbarColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNavigationbarColorOptions]
  }
  @scala.inline
  implicit class SetNavigationbarColorOptionsOps[Self <: SetNavigationbarColorOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: NavigationBarAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFrontColor(value: String): Self = this.set("frontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrontColor: Self = this.set("frontColor", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

