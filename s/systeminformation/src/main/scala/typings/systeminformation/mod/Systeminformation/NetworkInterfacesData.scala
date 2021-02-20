package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 6. Network related functions
@js.native
trait NetworkInterfacesData extends StObject {
  
  var carrier_changes: Double = js.native
  
  var dhcp: Boolean = js.native
  
  var dnsSuffix: String = js.native
  
  var duplex: String = js.native
  
  var ieee8021xAuth: String = js.native
  
  var ieee8021xState: String = js.native
  
  var iface: String = js.native
  
  var ifaceName: String = js.native
  
  var internal: Boolean = js.native
  
  var ip4: String = js.native
  
  var ip4subnet: String = js.native
  
  var ip6: String = js.native
  
  var ip6subnet: String = js.native
  
  var mac: String = js.native
  
  var mtu: Double = js.native
  
  var operstate: String = js.native
  
  var speed: Double = js.native
  
  var `type`: String = js.native
  
  var virtual: Boolean = js.native
}
object NetworkInterfacesData {
  
  @scala.inline
  def apply(
    carrier_changes: Double,
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
    mtu: Double,
    operstate: String,
    speed: Double,
    `type`: String,
    virtual: Boolean
  ): NetworkInterfacesData = {
    val __obj = js.Dynamic.literal(carrier_changes = carrier_changes.asInstanceOf[js.Any], dhcp = dhcp.asInstanceOf[js.Any], dnsSuffix = dnsSuffix.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], ieee8021xAuth = ieee8021xAuth.asInstanceOf[js.Any], ieee8021xState = ieee8021xState.asInstanceOf[js.Any], iface = iface.asInstanceOf[js.Any], ifaceName = ifaceName.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], ip4 = ip4.asInstanceOf[js.Any], ip4subnet = ip4subnet.asInstanceOf[js.Any], ip6 = ip6.asInstanceOf[js.Any], ip6subnet = ip6subnet.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mtu = mtu.asInstanceOf[js.Any], operstate = operstate.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfacesData]
  }
  
  @scala.inline
  implicit class NetworkInterfacesDataMutableBuilder[Self <: NetworkInterfacesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrier_changes(value: Double): Self = StObject.set(x, "carrier_changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcp(value: Boolean): Self = StObject.set(x, "dhcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplex(value: String): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeee8021xAuth(value: String): Self = StObject.set(x, "ieee8021xAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeee8021xState(value: String): Self = StObject.set(x, "ieee8021xState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIface(value: String): Self = StObject.set(x, "iface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfaceName(value: String): Self = StObject.set(x, "ifaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp4(value: String): Self = StObject.set(x, "ip4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp4subnet(value: String): Self = StObject.set(x, "ip4subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp6(value: String): Self = StObject.set(x, "ip6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp6subnet(value: String): Self = StObject.set(x, "ip6subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtu(value: Double): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperstate(value: String): Self = StObject.set(x, "operstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
  }
}
