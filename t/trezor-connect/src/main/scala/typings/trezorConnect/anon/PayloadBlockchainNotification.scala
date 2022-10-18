package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEvent
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadBlockchainNotification
  extends StObject
     with BlockchainEvent {
  
  var payload: BlockchainNotification
  
  var `type`: /* "blockchain-notification" */ String
}
object PayloadBlockchainNotification {
  
  inline def apply(payload: BlockchainNotification, `type`: /* "blockchain-notification" */ String): PayloadBlockchainNotification = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadBlockchainNotification]
  }
  
  extension [Self <: PayloadBlockchainNotification](x: Self) {
    
    inline def setPayload(value: BlockchainNotification): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "blockchain-notification" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
