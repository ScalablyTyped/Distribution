package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UDPSocketOnErrorCallbackResult extends StObject {
  
  /** 错误信息 */
  var errMsg: String = js.native
}
object UDPSocketOnErrorCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): UDPSocketOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSocketOnErrorCallbackResult]
  }
  
  @scala.inline
  implicit class UDPSocketOnErrorCallbackResultMutableBuilder[Self <: UDPSocketOnErrorCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
