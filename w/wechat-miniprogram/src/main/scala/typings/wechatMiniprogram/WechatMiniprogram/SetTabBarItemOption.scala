package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTabBarItemOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetTabBarItemCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetTabBarItemFailCallback] = js.native
  /** 图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px，当 postion 为 top 时，此参数无效 */
  var iconPath: js.UndefOr[String] = js.native
  /** tabBar 的哪一项，从左边算起 */
  var index: Double = js.native
  /** 选中时的图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px ，当 postion 为 top 时，此参数无效 */
  var selectedIconPath: js.UndefOr[String] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetTabBarItemSuccessCallback] = js.native
  /** tab 上的按钮文字 */
  var text: js.UndefOr[String] = js.native
}

object SetTabBarItemOption {
  @scala.inline
  def apply(index: Double): SetTabBarItemOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarItemOption]
  }
  @scala.inline
  implicit class SetTabBarItemOptionOps[Self <: SetTabBarItemOption] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
    @scala.inline
    def setSelectedIconPath(value: String): Self = this.set("selectedIconPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIconPath: Self = this.set("selectedIconPath", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

