package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UDPSocketOnMessageCallbackResult extends StObject {
  
  /** 收到的消息 */
  var message: ArrayBuffer = js.native
  
  /** 消息来源的结构化信息 */
  var remoteInfo: RemoteInfo = js.native
}
object UDPSocketOnMessageCallbackResult {
  
  @scala.inline
  def apply(message: ArrayBuffer, remoteInfo: RemoteInfo): UDPSocketOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], remoteInfo = remoteInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSocketOnMessageCallbackResult]
  }
  
  @scala.inline
  implicit class UDPSocketOnMessageCallbackResultMutableBuilder[Self <: UDPSocketOnMessageCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteInfo(value: RemoteInfo): Self = StObject.set(x, "remoteInfo", value.asInstanceOf[js.Any])
  }
}
