package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundMemo extends StObject {
  
  var address: String
  
  var mac: String
}
object RefundMemo {
  
  inline def apply(address: String, mac: String): RefundMemo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundMemo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefundMemo] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
