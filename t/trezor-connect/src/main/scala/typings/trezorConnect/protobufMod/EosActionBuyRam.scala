package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionBuyRam extends StObject {
  
  var payer: String
  
  var quantity: EosAsset
  
  var receiver: String
}
object EosActionBuyRam {
  
  inline def apply(payer: String, quantity: EosAsset, receiver: String): EosActionBuyRam = {
    val __obj = js.Dynamic.literal(payer = payer.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionBuyRam]
  }
  
  extension [Self <: EosActionBuyRam](x: Self) {
    
    inline def setPayer(value: String): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: EosAsset): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
  }
}
