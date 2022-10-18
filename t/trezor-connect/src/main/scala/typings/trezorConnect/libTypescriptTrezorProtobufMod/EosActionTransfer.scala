package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionTransfer extends StObject {
  
  var memo: String
  
  var quantity: EosAsset
  
  var receiver: String
  
  var sender: String
}
object EosActionTransfer {
  
  inline def apply(memo: String, quantity: EosAsset, receiver: String, sender: String): EosActionTransfer = {
    val __obj = js.Dynamic.literal(memo = memo.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionTransfer]
  }
  
  extension [Self <: EosActionTransfer](x: Self) {
    
    inline def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: EosAsset): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
