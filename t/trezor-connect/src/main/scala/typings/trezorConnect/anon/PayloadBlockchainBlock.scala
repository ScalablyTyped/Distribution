package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainBlock
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadBlockchainBlock
  extends StObject
     with BlockchainEvent {
  
  var payload: BlockchainBlock
  
  var `type`: /* "blockchain-block" */ String
}
object PayloadBlockchainBlock {
  
  inline def apply(payload: BlockchainBlock, `type`: /* "blockchain-block" */ String): PayloadBlockchainBlock = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadBlockchainBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayloadBlockchainBlock] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: BlockchainBlock): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "blockchain-block" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
