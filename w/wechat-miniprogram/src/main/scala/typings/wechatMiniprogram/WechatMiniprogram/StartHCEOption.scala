package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartHCEOption extends StObject {
  
  /** 需要注册到系统的 AID 列表 */
  var aid_list: js.Array[String]
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartHCECompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartHCEFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartHCESuccessCallback] = js.undefined
}
object StartHCEOption {
  
  inline def apply(aid_list: js.Array[String]): StartHCEOption = {
    val __obj = js.Dynamic.literal(aid_list = aid_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHCEOption]
  }
  
  extension [Self <: StartHCEOption](x: Self) {
    
    inline def setAid_list(value: js.Array[String]): Self = StObject.set(x, "aid_list", value.asInstanceOf[js.Any])
    
    inline def setAid_listVarargs(value: String*): Self = StObject.set(x, "aid_list", js.Array(value*))
    
    inline def setComplete(value: /* res */ NFCError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ NFCError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ NFCError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
