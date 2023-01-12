package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UDPSocketConnectOption extends StObject {
  
  /** 要发消息的地址 */
  var address: String
  
  /** 要发送消息的端口号 */
  var port: Double
}
object UDPSocketConnectOption {
  
  inline def apply(address: String, port: Double): UDPSocketConnectOption = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSocketConnectOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UDPSocketConnectOption] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
