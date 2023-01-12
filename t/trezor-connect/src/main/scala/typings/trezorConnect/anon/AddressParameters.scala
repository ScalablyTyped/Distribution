package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoAddressParameters
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoAssetGroup
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressParameters
  extends StObject
     with CardanoOutput {
  
  var addressParameters: CardanoAddressParameters
  
  var amount: String
  
  var datumHash: js.UndefOr[String] = js.undefined
  
  var tokenBundle: js.UndefOr[js.Array[CardanoAssetGroup]] = js.undefined
}
object AddressParameters {
  
  inline def apply(addressParameters: CardanoAddressParameters, amount: String): AddressParameters = {
    val __obj = js.Dynamic.literal(addressParameters = addressParameters.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressParameters] (val x: Self) extends AnyVal {
    
    inline def setAddressParameters(value: CardanoAddressParameters): Self = StObject.set(x, "addressParameters", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDatumHash(value: String): Self = StObject.set(x, "datumHash", value.asInstanceOf[js.Any])
    
    inline def setDatumHashUndefined: Self = StObject.set(x, "datumHash", js.undefined)
    
    inline def setTokenBundle(value: js.Array[CardanoAssetGroup]): Self = StObject.set(x, "tokenBundle", value.asInstanceOf[js.Any])
    
    inline def setTokenBundleUndefined: Self = StObject.set(x, "tokenBundle", js.undefined)
    
    inline def setTokenBundleVarargs(value: CardanoAssetGroup*): Self = StObject.set(x, "tokenBundle", js.Array(value*))
  }
}
