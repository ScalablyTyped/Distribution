package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolRelayParametersType extends StObject {
  
  var host_name: js.UndefOr[String] = js.undefined
  
  var ipv4_address: js.UndefOr[String] = js.undefined
  
  var ipv6_address: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var `type`: CardanoPoolRelayType
}
object CardanoPoolRelayParametersType {
  
  inline def apply(`type`: CardanoPoolRelayType): CardanoPoolRelayParametersType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPoolRelayParametersType]
  }
  
  extension [Self <: CardanoPoolRelayParametersType](x: Self) {
    
    inline def setHost_name(value: String): Self = StObject.set(x, "host_name", value.asInstanceOf[js.Any])
    
    inline def setHost_nameUndefined: Self = StObject.set(x, "host_name", js.undefined)
    
    inline def setIpv4_address(value: String): Self = StObject.set(x, "ipv4_address", value.asInstanceOf[js.Any])
    
    inline def setIpv4_addressUndefined: Self = StObject.set(x, "ipv4_address", js.undefined)
    
    inline def setIpv6_address(value: String): Self = StObject.set(x, "ipv6_address", value.asInstanceOf[js.Any])
    
    inline def setIpv6_addressUndefined: Self = StObject.set(x, "ipv6_address", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setType(value: CardanoPoolRelayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
