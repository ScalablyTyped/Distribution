package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoGetAddress extends StObject {
  
  var address_parameters: CardanoAddressParametersType
  
  var derivation_type: CardanoDerivationType
  
  var network_id: Double
  
  var protocol_magic: Double
  
  var show_display: js.UndefOr[Boolean] = js.undefined
}
object CardanoGetAddress {
  
  inline def apply(
    address_parameters: CardanoAddressParametersType,
    derivation_type: CardanoDerivationType,
    network_id: Double,
    protocol_magic: Double
  ): CardanoGetAddress = {
    val __obj = js.Dynamic.literal(address_parameters = address_parameters.asInstanceOf[js.Any], derivation_type = derivation_type.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any], protocol_magic = protocol_magic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoGetAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoGetAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress_parameters(value: CardanoAddressParametersType): Self = StObject.set(x, "address_parameters", value.asInstanceOf[js.Any])
    
    inline def setDerivation_type(value: CardanoDerivationType): Self = StObject.set(x, "derivation_type", value.asInstanceOf[js.Any])
    
    inline def setNetwork_id(value: Double): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
    
    inline def setProtocol_magic(value: Double): Self = StObject.set(x, "protocol_magic", value.asInstanceOf[js.Any])
    
    inline def setShow_display(value: Boolean): Self = StObject.set(x, "show_display", value.asInstanceOf[js.Any])
    
    inline def setShow_displayUndefined: Self = StObject.set(x, "show_display", js.undefined)
  }
}
