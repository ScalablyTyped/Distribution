package typings.trezorConnect.libTypescriptBackendBlockchainMod

import typings.trezorConnect.anon.Descriptor
import typings.trezorConnect.libTypescriptNetworksCoinInfoMod.CoinInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainNotification extends StObject {
  
  var coin: CoinInfo
  
  var notification: Descriptor
}
object BlockchainNotification {
  
  inline def apply(coin: CoinInfo, notification: Descriptor): BlockchainNotification = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainNotification]
  }
  
  extension [Self <: BlockchainNotification](x: Self) {
    
    inline def setCoin(value: CoinInfo): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: Descriptor): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
