package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 6. Network related functions
trait NetworkInterfacesData extends StObject {
  
  var carrierChanges: Double
  
  var dhcp: Boolean
  
  var dnsSuffix: String
  
  var duplex: String
  
  var ieee8021xAuth: String
  
  var ieee8021xState: String
  
  var iface: String
  
  var ifaceName: String
  
  var internal: Boolean
  
  var ip4: String
  
  var ip4subnet: String
  
  var ip6: String
  
  var ip6subnet: String
  
  var mac: String
  
  var mtu: Double | Null
  
  var operstate: String
  
  var speed: Double | Null
  
  var `type`: String
  
  var virtual: Boolean
}
object NetworkInterfacesData {
  
  inline def apply(
    carrierChanges: Double,
    dhcp: Boolean,
    dnsSuffix: String,
    duplex: String,
    ieee8021xAuth: String,
    ieee8021xState: String,
    iface: String,
    ifaceName: String,
    internal: Boolean,
    ip4: String,
    ip4subnet: String,
    ip6: String,
    ip6subnet: String,
    mac: String,
    operstate: String,
    `type`: String,
    virtual: Boolean
  ): NetworkInterfacesData = {
    val __obj = js.Dynamic.literal(carrierChanges = carrierChanges.asInstanceOf[js.Any], dhcp = dhcp.asInstanceOf[js.Any], dnsSuffix = dnsSuffix.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], ieee8021xAuth = ieee8021xAuth.asInstanceOf[js.Any], ieee8021xState = ieee8021xState.asInstanceOf[js.Any], iface = iface.asInstanceOf[js.Any], ifaceName = ifaceName.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], ip4 = ip4.asInstanceOf[js.Any], ip4subnet = ip4subnet.asInstanceOf[js.Any], ip6 = ip6.asInstanceOf[js.Any], ip6subnet = ip6subnet.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], operstate = operstate.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any], mtu = null, speed = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfacesData]
  }
  
  extension [Self <: NetworkInterfacesData](x: Self) {
    
    inline def setCarrierChanges(value: Double): Self = StObject.set(x, "carrierChanges", value.asInstanceOf[js.Any])
    
    inline def setDhcp(value: Boolean): Self = StObject.set(x, "dhcp", value.asInstanceOf[js.Any])
    
    inline def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    inline def setDuplex(value: String): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
    
    inline def setIeee8021xAuth(value: String): Self = StObject.set(x, "ieee8021xAuth", value.asInstanceOf[js.Any])
    
    inline def setIeee8021xState(value: String): Self = StObject.set(x, "ieee8021xState", value.asInstanceOf[js.Any])
    
    inline def setIface(value: String): Self = StObject.set(x, "iface", value.asInstanceOf[js.Any])
    
    inline def setIfaceName(value: String): Self = StObject.set(x, "ifaceName", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setIp4(value: String): Self = StObject.set(x, "ip4", value.asInstanceOf[js.Any])
    
    inline def setIp4subnet(value: String): Self = StObject.set(x, "ip4subnet", value.asInstanceOf[js.Any])
    
    inline def setIp6(value: String): Self = StObject.set(x, "ip6", value.asInstanceOf[js.Any])
    
    inline def setIp6subnet(value: String): Self = StObject.set(x, "ip6subnet", value.asInstanceOf[js.Any])
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMtu(value: Double): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setMtuNull: Self = StObject.set(x, "mtu", null)
    
    inline def setOperstate(value: String): Self = StObject.set(x, "operstate", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedNull: Self = StObject.set(x, "speed", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
  }
}
