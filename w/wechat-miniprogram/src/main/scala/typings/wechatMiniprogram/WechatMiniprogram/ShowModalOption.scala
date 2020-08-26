package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowModalOption extends js.Object {
  /** 取消按钮的文字颜色，必须是 16 进制格式的颜色字符串 */
  var cancelColor: js.UndefOr[String] = js.native
  /** 取消按钮的文字，最多 4 个字符 */
  var cancelText: js.UndefOr[String] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowModalCompleteCallback] = js.native
  /** 确认按钮的文字颜色，必须是 16 进制格式的颜色字符串 */
  var confirmColor: js.UndefOr[String] = js.native
  /** 确认按钮的文字，最多 4 个字符 */
  var confirmText: js.UndefOr[String] = js.native
  /** 提示的内容 */
  var content: js.UndefOr[String] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowModalFailCallback] = js.native
  /** 是否显示取消按钮 */
  var showCancel: js.UndefOr[Boolean] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowModalSuccessCallback] = js.native
  /** 提示的标题 */
  var title: js.UndefOr[String] = js.native
}

object ShowModalOption {
  @scala.inline
  def apply(): ShowModalOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowModalOption]
  }
  @scala.inline
  implicit class ShowModalOptionOps[Self <: ShowModalOption] (val x: Self) extends AnyVal {
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
    def setCancelColor(value: String): Self = this.set("cancelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelColor: Self = this.set("cancelColor", js.undefined)
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setConfirmColor(value: String): Self = this.set("confirmColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmColor: Self = this.set("confirmColor", js.undefined)
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setShowCancel(value: Boolean): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ ShowModalSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

