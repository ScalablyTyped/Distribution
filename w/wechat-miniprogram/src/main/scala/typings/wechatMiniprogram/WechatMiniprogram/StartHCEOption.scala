package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartHCEOption extends StObject {
  
  /** 需要注册到系统的 AID 列表 */
  var aid_list: js.Array[String] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartHCECompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartHCEFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartHCESuccessCallback] = js.native
}
object StartHCEOption {
  
  @scala.inline
  def apply(aid_list: js.Array[String]): StartHCEOption = {
    val __obj = js.Dynamic.literal(aid_list = aid_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHCEOption]
  }
  
  @scala.inline
  implicit class StartHCEOptionMutableBuilder[Self <: StartHCEOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAid_list(value: js.Array[String]): Self = StObject.set(x, "aid_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAid_listVarargs(value: String*): Self = StObject.set(x, "aid_list", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: /* res */ NFCError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
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
