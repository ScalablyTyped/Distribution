package typings.trezorConnect.libTypescriptNetworksCardanoMod

import typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoDerivationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoGetAddress extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var addressParameters: CardanoAddressParameters
  
  var derivationType: js.UndefOr[CardanoDerivationType] = js.undefined
  
  var networkId: Double
  
  var protocolMagic: Double
  
  var showOnTrezor: js.UndefOr[Boolean] = js.undefined
}
object CardanoGetAddress {
  
  inline def apply(addressParameters: CardanoAddressParameters, networkId: Double, protocolMagic: Double): CardanoGetAddress = {
    val __obj = js.Dynamic.literal(addressParameters = addressParameters.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], protocolMagic = protocolMagic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoGetAddress]
  }
  
  extension [Self <: CardanoGetAddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressParameters(value: CardanoAddressParameters): Self = StObject.set(x, "addressParameters", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDerivationType(value: CardanoDerivationType): Self = StObject.set(x, "derivationType", value.asInstanceOf[js.Any])
    
    inline def setDerivationTypeUndefined: Self = StObject.set(x, "derivationType", js.undefined)
    
    inline def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    inline def setProtocolMagic(value: Double): Self = StObject.set(x, "protocolMagic", value.asInstanceOf[js.Any])
    
    inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
    
    inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
  }
}
