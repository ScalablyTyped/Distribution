package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoToken extends StObject {
  
  var amount: js.UndefOr[String] = js.undefined
  
  var assetNameBytes: String
  
  var mintAmount: js.UndefOr[String] = js.undefined
}
object CardanoToken {
  
  inline def apply(assetNameBytes: String): CardanoToken = {
    val __obj = js.Dynamic.literal(assetNameBytes = assetNameBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoToken] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAssetNameBytes(value: String): Self = StObject.set(x, "assetNameBytes", value.asInstanceOf[js.Any])
    
    inline def setMintAmount(value: String): Self = StObject.set(x, "mintAmount", value.asInstanceOf[js.Any])
    
    inline def setMintAmountUndefined: Self = StObject.set(x, "mintAmount", js.undefined)
  }
}
