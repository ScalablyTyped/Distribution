package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTaskOnMessageCallbackResult extends StObject {
  
  /** 服务器返回的消息 */
  var data: String | js.typedarray.ArrayBuffer
}
object SocketTaskOnMessageCallbackResult {
  
  inline def apply(data: String | js.typedarray.ArrayBuffer): SocketTaskOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTaskOnMessageCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketTaskOnMessageCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
