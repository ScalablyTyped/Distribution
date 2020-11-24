package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowModalOptions extends js.Object {
  
  /**
    * 取消按钮的文字颜色，默认为"#000000"
    */
  var cancelColor: js.UndefOr[String] = js.native
  
  /**
    * 取消按钮的文字，默认为"取消"
    */
  var cancelText: js.UndefOr[String] = js.native
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 确定按钮的文字颜色，默认为"#3CC51F"
    */
  var confirmColor: js.UndefOr[String] = js.native
  
  /**
    * 确定按钮的文字，默认为"确定"
    */
  var confirmText: js.UndefOr[String] = js.native
  
  /**
    * 提示的内容
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 是否显示取消按钮，默认为 true
    */
  var showCancel: js.UndefOr[Boolean] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ShowModalRes, Unit]] = js.native
  
  /**
    * 提示的标题
    */
  var title: js.UndefOr[String] = js.native
}
object ShowModalOptions {
  
  @scala.inline
  def apply(): ShowModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowModalOptions]
  }
  
  @scala.inline
  implicit class ShowModalOptionsOps[Self <: ShowModalOptions] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
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
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ShowModalRes => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
