package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainSubscribe extends StObject {
  
  var accounts: js.UndefOr[js.Array[BlockchainSubscribeAccount]] = js.undefined
  
  var coin: String
}
object BlockchainSubscribe {
  
  inline def apply(coin: String): BlockchainSubscribe = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainSubscribe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainSubscribe] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[BlockchainSubscribeAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: BlockchainSubscribeAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
  }
}
