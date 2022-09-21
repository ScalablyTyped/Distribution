package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMTransfer extends StObject {
  
  var amount: UintType
  
  var mosaics: js.UndefOr[js.Array[NEMMosaic]] = js.undefined
  
  var payload: js.UndefOr[String] = js.undefined
  
  var public_key: js.UndefOr[String] = js.undefined
  
  var recipient: String
}
object NEMTransfer {
  
  inline def apply(amount: UintType, recipient: String): NEMTransfer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMTransfer]
  }
  
  extension [Self <: NEMTransfer](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setMosaics(value: js.Array[NEMMosaic]): Self = StObject.set(x, "mosaics", value.asInstanceOf[js.Any])
    
    inline def setMosaicsUndefined: Self = StObject.set(x, "mosaics", js.undefined)
    
    inline def setMosaicsVarargs(value: NEMMosaic*): Self = StObject.set(x, "mosaics", js.Array(value*))
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
  }
}
