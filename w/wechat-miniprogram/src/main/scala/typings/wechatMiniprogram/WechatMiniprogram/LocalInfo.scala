package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalInfo extends StObject {
  
  /** 接收消息的 socket 的地址 */
  var address: String
  
  /** 使用的协议族，为 IPv4 或者 IPv6 */
  var family: String
  
  /** 端口号 */
  var port: Double
}
object LocalInfo {
  
  inline def apply(address: String, family: String, port: Double): LocalInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalInfo] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
