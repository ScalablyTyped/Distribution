package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTaskOnMessageCallbackResult extends StObject {
  
  /** 服务器返回的消息 */
  var data: String | ArrayBuffer = js.native
}
object SocketTaskOnMessageCallbackResult {
  
  @scala.inline
  def apply(data: String | ArrayBuffer): SocketTaskOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTaskOnMessageCallbackResult]
  }
  
  @scala.inline
  implicit class SocketTaskOnMessageCallbackResultMutableBuilder[Self <: SocketTaskOnMessageCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
