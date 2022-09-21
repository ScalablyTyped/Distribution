package typings.trezorConnect.anon

import typings.trezorConnect.blockchainMod.BlockchainError
import typings.trezorConnect.blockchainMod.BlockchainEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadType
  extends StObject
     with BlockchainEvent {
  
  var payload: BlockchainError
  
  var `type`: /* "blockchain-error" */ String
}
object PayloadType {
  
  inline def apply(payload: BlockchainError, `type`: /* "blockchain-error" */ String): PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadType]
  }
  
  extension [Self <: PayloadType](x: Self) {
    
    inline def setPayload(value: BlockchainError): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "blockchain-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
