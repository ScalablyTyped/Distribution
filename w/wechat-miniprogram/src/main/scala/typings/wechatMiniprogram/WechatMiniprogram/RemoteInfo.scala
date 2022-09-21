package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 发送端地址信息 */
trait RemoteInfo extends StObject {
  
  /** 发送消息的 socket 的地址 */
  var address: String
  
  /** 使用的协议族，为 IPv4 或者 IPv6 */
  var family: String
  
  /** 端口号 */
  var port: Double
  
  /** message 的大小，单位：字节 */
  var size: Double
}
object RemoteInfo {
  
  inline def apply(address: String, family: String, port: Double, size: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteInfo]
  }
  
  extension [Self <: RemoteInfo](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
