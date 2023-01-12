package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TCPSocketConnectOption extends StObject {
  
  /** 套接字要连接的地址 */
  var address: String
  
  /** 套接字要连接的端口 */
  var port: Double
}
object TCPSocketConnectOption {
  
  inline def apply(address: String, port: Double): TCPSocketConnectOption = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCPSocketConnectOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TCPSocketConnectOption] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
