package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoAssetGroup
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount
  extends StObject
     with CardanoOutput {
  
  var address: String
  
  var amount: String
  
  var datumHash: js.UndefOr[String] = js.undefined
  
  var tokenBundle: js.UndefOr[js.Array[CardanoAssetGroup]] = js.undefined
}
object Amount {
  
  inline def apply(address: String, amount: String): Amount = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  extension [Self <: Amount](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDatumHash(value: String): Self = StObject.set(x, "datumHash", value.asInstanceOf[js.Any])
    
    inline def setDatumHashUndefined: Self = StObject.set(x, "datumHash", js.undefined)
    
    inline def setTokenBundle(value: js.Array[CardanoAssetGroup]): Self = StObject.set(x, "tokenBundle", value.asInstanceOf[js.Any])
    
    inline def setTokenBundleUndefined: Self = StObject.set(x, "tokenBundle", js.undefined)
    
    inline def setTokenBundleVarargs(value: CardanoAssetGroup*): Self = StObject.set(x, "tokenBundle", js.Array(value*))
  }
}
