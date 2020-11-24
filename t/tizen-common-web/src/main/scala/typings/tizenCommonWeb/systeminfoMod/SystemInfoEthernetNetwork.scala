package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.AUTO
import typings.tizenCommonWeb.tizenCommonWebStrings.DYNAMIC
import typings.tizenCommonWeb.tizenCommonWebStrings.FIXED
import typings.tizenCommonWeb.tizenCommonWebStrings.NONE
import typings.tizenCommonWeb.tizenCommonWebStrings.STATIC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoEthernetNetwork extends SystemInfoProperty {
  
  /**
    * Represents the cable status (ATTACHED or DETACHED) of the Ethernet interface.
    */
  val cable: String = js.native
  
  /**
    * Represents the DNS address of this connection.
    *
    * It is written in 255.255.255.255 format.
    */
  val dns: String = js.native
  
  /**
    * Represents the gateway of this connection.
    *
    * It is written in 255.255.255.255 format.
    */
  val gateway: String = js.native
  
  /**
    * Represents the IPv4 address of the Ethernet network.
    */
  val ipAddress: String = js.native
  
  /**
    * Represents this connection's IP configuration type.
    */
  val ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED = js.native
  
  /**
    * Represents the IPv6 address of the Ethernet network.
    */
  val ipv6Address: String = js.native
  
  /**
    * Represents the MAC address of the Ethernet interface.
    *
    * It is written in MM:MM:MM:SS:SS:SS format.
    */
  val macAddress: String = js.native
  
  /**
    * Represents the status (DEACTIVATED, DISCONNECTED or CONNECTED) of the Ethernet interface.
    */
  val status: String = js.native
  
  /**
    * Represents the subnet mask of this connection.
    *
    * It is written in 255.255.255.255 format.
    */
  val subnetMask: String = js.native
}
object SystemInfoEthernetNetwork {
  
  @scala.inline
  def apply(
    cable: String,
    dns: String,
    gateway: String,
    ipAddress: String,
    ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED,
    ipv6Address: String,
    macAddress: String,
    status: String,
    subnetMask: String
  ): SystemInfoEthernetNetwork = {
    val __obj = js.Dynamic.literal(cable = cable.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], ipMode = ipMode.asInstanceOf[js.Any], ipv6Address = ipv6Address.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoEthernetNetwork]
  }
  
  @scala.inline
  implicit class SystemInfoEthernetNetworkOps[Self <: SystemInfoEthernetNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCable(value: String): Self = this.set("cable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDns(value: String): Self = this.set("dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = this.set("gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpMode(value: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED): Self = this.set("ipMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Address(value: String): Self = this.set("ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMask(value: String): Self = this.set("subnetMask", value.asInstanceOf[js.Any])
  }
}
