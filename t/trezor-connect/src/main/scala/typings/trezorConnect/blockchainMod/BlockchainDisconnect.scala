package typings.trezorConnect.blockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainDisconnect extends StObject {
  
  var coin: String
}
object BlockchainDisconnect {
  
  inline def apply(coin: String): BlockchainDisconnect = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainDisconnect]
  }
  
  extension [Self <: BlockchainDisconnect](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
  }
}
