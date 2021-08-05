package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UDPSocketSendOption extends StObject {
  
  /** 要发消息的地址。在基础库 2.9.3 及之前版本可以是一个和本机同网段的 IP 地址，也可以是在安全域名列表内的域名地址；在基础库 2.9.4 及之后版本，可以是任意 IP 和域名 */
  var address: String
  
  /** 发送数据的长度，仅当 message 为 ArrayBuffer 类型时有效 */
  var length: js.UndefOr[Double] = js.undefined
  
  /** 要发送的数据 */
  var message: String | ArrayBuffer
  
  /** 发送数据的偏移量，仅当 message 为 ArrayBuffer 类型时有效 */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** 要发送消息的端口号 */
  var port: Double
}
object UDPSocketSendOption {
  
  inline def apply(address: String, message: String | ArrayBuffer, port: Double): UDPSocketSendOption = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSocketSendOption]
  }
  
  extension [Self <: UDPSocketSendOption](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMessage(value: String | ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
