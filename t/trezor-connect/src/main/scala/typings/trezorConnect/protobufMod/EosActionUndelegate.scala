package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionUndelegate extends StObject {
  
  var cpu_quantity: EosAsset
  
  var net_quantity: EosAsset
  
  var receiver: String
  
  var sender: String
}
object EosActionUndelegate {
  
  inline def apply(cpu_quantity: EosAsset, net_quantity: EosAsset, receiver: String, sender: String): EosActionUndelegate = {
    val __obj = js.Dynamic.literal(cpu_quantity = cpu_quantity.asInstanceOf[js.Any], net_quantity = net_quantity.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionUndelegate]
  }
  
  extension [Self <: EosActionUndelegate](x: Self) {
    
    inline def setCpu_quantity(value: EosAsset): Self = StObject.set(x, "cpu_quantity", value.asInstanceOf[js.Any])
    
    inline def setNet_quantity(value: EosAsset): Self = StObject.set(x, "net_quantity", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
