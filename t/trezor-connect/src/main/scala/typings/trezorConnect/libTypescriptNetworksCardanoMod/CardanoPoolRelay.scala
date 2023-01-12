package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolRelay extends StObject {
  
  var hostName: js.UndefOr[String] = js.undefined
  
  var ipv4Address: js.UndefOr[String] = js.undefined
  
  var ipv6Address: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var `type`: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoPoolRelayType
}
object CardanoPoolRelay {
  
  inline def apply(`type`: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoPoolRelayType): CardanoPoolRelay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPoolRelay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoPoolRelay] (val x: Self) extends AnyVal {
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    inline def setIpv4Address(value: String): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setType(value: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoPoolRelayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
