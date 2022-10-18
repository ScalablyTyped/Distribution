package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionBuyRamBytes extends StObject {
  
  var bytes: Double
  
  var payer: String
  
  var receiver: String
}
object EosActionBuyRamBytes {
  
  inline def apply(bytes: Double, payer: String, receiver: String): EosActionBuyRamBytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionBuyRamBytes]
  }
  
  extension [Self <: EosActionBuyRamBytes](x: Self) {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setPayer(value: String): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
  }
}
