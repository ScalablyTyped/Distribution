package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowModalOption extends StObject {
  
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
  implicit class ShowModalOptionMutableBuilder[Self <: ShowModalOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelColor(value: String): Self = StObject.set(x, "cancelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelColorUndefined: Self = StObject.set(x, "cancelColor", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setConfirmColor(value: String): Self = StObject.set(x, "confirmColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmColorUndefined: Self = StObject.set(x, "confirmColor", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ShowModalSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
