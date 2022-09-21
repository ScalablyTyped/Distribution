package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UDPSocketOnMessageCallbackResult extends StObject {
  
  /** 接收端地址信息，2.18.0 起支持 */
  var localInfo: LocalInfo
  
  /** 收到的消息 */
  var message: js.typedarray.ArrayBuffer
  
  /** 发送端地址信息 */
  var remoteInfo: RemoteInfo
}
object UDPSocketOnMessageCallbackResult {
  
  inline def apply(localInfo: LocalInfo, message: js.typedarray.ArrayBuffer, remoteInfo: RemoteInfo): UDPSocketOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(localInfo = localInfo.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], remoteInfo = remoteInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSocketOnMessageCallbackResult]
  }
  
  extension [Self <: UDPSocketOnMessageCallbackResult](x: Self) {
    
    inline def setLocalInfo(value: LocalInfo): Self = StObject.set(x, "localInfo", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRemoteInfo(value: RemoteInfo): Self = StObject.set(x, "remoteInfo", value.asInstanceOf[js.Any])
  }
}
