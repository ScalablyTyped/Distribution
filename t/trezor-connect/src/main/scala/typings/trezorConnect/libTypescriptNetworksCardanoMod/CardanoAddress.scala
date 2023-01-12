package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAddress extends StObject {
  
  var address: String
  
  var addressParameters: CardanoAddressParameters
  
  var networkId: Double
  
  var protocolMagic: Double
  
  var serializedPath: String
  
  var serializedStakingPath: String
}
object CardanoAddress {
  
  inline def apply(
    address: String,
    addressParameters: CardanoAddressParameters,
    networkId: Double,
    protocolMagic: Double,
    serializedPath: String,
    serializedStakingPath: String
  ): CardanoAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressParameters = addressParameters.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], protocolMagic = protocolMagic.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], serializedStakingPath = serializedStakingPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressParameters(value: CardanoAddressParameters): Self = StObject.set(x, "addressParameters", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    inline def setProtocolMagic(value: Double): Self = StObject.set(x, "protocolMagic", value.asInstanceOf[js.Any])
    
    inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    
    inline def setSerializedStakingPath(value: String): Self = StObject.set(x, "serializedStakingPath", value.asInstanceOf[js.Any])
  }
}
