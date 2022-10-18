package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.Payload
  - typings.trezorConnect.anon.PayloadType
  - typings.trezorConnect.anon.PayloadBlockchainBlock
  - typings.trezorConnect.anon.PayloadBlockchainNotification
  - typings.trezorConnect.anon.PayloadBlockchainFiatRatesUpdate
*/
trait BlockchainEvent extends StObject
object BlockchainEvent {
  
  inline def Payload(payload: BlockchainInfo, `type`: /* "blockchain-connect" */ String): typings.trezorConnect.anon.Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.Payload]
  }
  
  inline def PayloadBlockchainBlock(payload: BlockchainBlock, `type`: /* "blockchain-block" */ String): typings.trezorConnect.anon.PayloadBlockchainBlock = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadBlockchainBlock]
  }
  
  inline def PayloadBlockchainFiatRatesUpdate(payload: BlockchainFiatRatesUpdate, `type`: /* "fiat-rates-update" */ String): typings.trezorConnect.anon.PayloadBlockchainFiatRatesUpdate = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadBlockchainFiatRatesUpdate]
  }
  
  inline def PayloadBlockchainNotification(payload: BlockchainNotification, `type`: /* "blockchain-notification" */ String): typings.trezorConnect.anon.PayloadBlockchainNotification = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadBlockchainNotification]
  }
  
  inline def PayloadType(payload: BlockchainError, `type`: /* "blockchain-error" */ String): typings.trezorConnect.anon.PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadType]
  }
}
