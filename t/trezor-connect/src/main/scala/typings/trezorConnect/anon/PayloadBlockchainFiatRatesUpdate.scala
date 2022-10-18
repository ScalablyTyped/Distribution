package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEvent
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainFiatRatesUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadBlockchainFiatRatesUpdate
  extends StObject
     with BlockchainEvent {
  
  var payload: BlockchainFiatRatesUpdate
  
  var `type`: /* "fiat-rates-update" */ String
}
object PayloadBlockchainFiatRatesUpdate {
  
  inline def apply(payload: BlockchainFiatRatesUpdate, `type`: /* "fiat-rates-update" */ String): PayloadBlockchainFiatRatesUpdate = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadBlockchainFiatRatesUpdate]
  }
  
  extension [Self <: PayloadBlockchainFiatRatesUpdate](x: Self) {
    
    inline def setPayload(value: BlockchainFiatRatesUpdate): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "fiat-rates-update" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
