package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetEnableDebugOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetEnableDebugCompleteCallback] = js.native
  
  /** 是否打开调试 */
  var enableDebug: Boolean = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetEnableDebugFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetEnableDebugSuccessCallback] = js.native
}
object SetEnableDebugOption {
  
  @scala.inline
  def apply(enableDebug: Boolean): SetEnableDebugOption = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEnableDebugOption]
  }
  
  @scala.inline
  implicit class SetEnableDebugOptionMutableBuilder[Self <: SetEnableDebugOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEnableDebug(value: Boolean): Self = StObject.set(x, "enableDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
