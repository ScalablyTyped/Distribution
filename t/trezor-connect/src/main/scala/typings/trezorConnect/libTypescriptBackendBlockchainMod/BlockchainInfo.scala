package typings.trezorConnect.libTypescriptBackendBlockchainMod

import typings.trezorConnect.anon.Reserve
import typings.trezorConnect.libTypescriptNetworksCoinInfoMod.CoinInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainInfo extends StObject {
  
  var blockHash: String
  
  var blockHeight: Double
  
  var cleanUrl: js.UndefOr[String] = js.undefined
  
  var coin: CoinInfo
  
  var decimals: Double
  
  var misc: js.UndefOr[Reserve] = js.undefined
  
  var name: String
  
  var shortcut: String
  
  var testnet: Boolean
  
  var url: String
  
  var version: String
}
object BlockchainInfo {
  
  inline def apply(
    blockHash: String,
    blockHeight: Double,
    coin: CoinInfo,
    decimals: Double,
    name: String,
    shortcut: String,
    testnet: Boolean,
    url: String,
    version: String
  ): BlockchainInfo = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockHeight = blockHeight.asInstanceOf[js.Any], coin = coin.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], testnet = testnet.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainInfo] (val x: Self) extends AnyVal {
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockHeight(value: Double): Self = StObject.set(x, "blockHeight", value.asInstanceOf[js.Any])
    
    inline def setCleanUrl(value: String): Self = StObject.set(x, "cleanUrl", value.asInstanceOf[js.Any])
    
    inline def setCleanUrlUndefined: Self = StObject.set(x, "cleanUrl", js.undefined)
    
    inline def setCoin(value: CoinInfo): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setMisc(value: Reserve): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    inline def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    inline def setTestnet(value: Boolean): Self = StObject.set(x, "testnet", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
