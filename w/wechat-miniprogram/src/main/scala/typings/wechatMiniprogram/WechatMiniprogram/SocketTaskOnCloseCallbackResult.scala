package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTaskOnCloseCallbackResult extends StObject {
  
  /** 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。 */
  var code: Double
  
  /** 一个可读的字符串，表示连接被关闭的原因。 */
  var reason: String
}
object SocketTaskOnCloseCallbackResult {
  
  inline def apply(code: Double, reason: String): SocketTaskOnCloseCallbackResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTaskOnCloseCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketTaskOnCloseCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
