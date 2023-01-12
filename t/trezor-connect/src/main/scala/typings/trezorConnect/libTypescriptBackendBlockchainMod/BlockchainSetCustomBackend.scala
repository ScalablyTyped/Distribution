package typings.trezorConnect.libTypescriptBackendBlockchainMod

import typings.trezorConnect.libTypescriptNetworksCoinInfoMod.BlockchainLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainSetCustomBackend extends StObject {
  
  var blockchainLink: js.UndefOr[BlockchainLink] = js.undefined
  
  var coin: String
}
object BlockchainSetCustomBackend {
  
  inline def apply(coin: String): BlockchainSetCustomBackend = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainSetCustomBackend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainSetCustomBackend] (val x: Self) extends AnyVal {
    
    inline def setBlockchainLink(value: BlockchainLink): Self = StObject.set(x, "blockchainLink", value.asInstanceOf[js.Any])
    
    inline def setBlockchainLinkUndefined: Self = StObject.set(x, "blockchainLink", js.undefined)
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
  }
}
