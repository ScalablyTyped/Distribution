package typings.trezorConnect.blockchainMod

import typings.trezorConnect.coinInfoMod.CoinInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainBlock extends StObject {
  
  var blockHash: String
  
  var blockHeight: Double
  
  var coin: CoinInfo
}
object BlockchainBlock {
  
  inline def apply(blockHash: String, blockHeight: Double, coin: CoinInfo): BlockchainBlock = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockHeight = blockHeight.asInstanceOf[js.Any], coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainBlock]
  }
  
  extension [Self <: BlockchainBlock](x: Self) {
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockHeight(value: Double): Self = StObject.set(x, "blockHeight", value.asInstanceOf[js.Any])
    
    inline def setCoin(value: CoinInfo): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
  }
}
