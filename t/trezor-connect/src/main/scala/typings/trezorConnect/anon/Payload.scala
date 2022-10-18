package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEvent
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload
  extends StObject
     with BlockchainEvent {
  
  var payload: BlockchainInfo
  
  var `type`: /* "blockchain-connect" */ String
}
object Payload {
  
  inline def apply(payload: BlockchainInfo, `type`: /* "blockchain-connect" */ String): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setPayload(value: BlockchainInfo): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "blockchain-connect" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
