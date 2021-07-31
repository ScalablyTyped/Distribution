package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendHCEMessageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SendHCEMessageCompleteCallback] = js.undefined
  
  /** 二进制数据 */
  var data: ArrayBuffer
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SendHCEMessageFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SendHCEMessageSuccessCallback] = js.undefined
}
object SendHCEMessageOption {
  
  @scala.inline
  def apply(data: ArrayBuffer): SendHCEMessageOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendHCEMessageOption]
  }
  
  @scala.inline
  implicit class SendHCEMessageOptionMutableBuilder[Self <: SendHCEMessageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ NFCError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ NFCError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ NFCError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
