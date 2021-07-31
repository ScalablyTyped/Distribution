package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.AUTO
import typings.tizenCommonWeb.tizenCommonWebStrings.DYNAMIC
import typings.tizenCommonWeb.tizenCommonWebStrings.FIXED
import typings.tizenCommonWeb.tizenCommonWebStrings.NONE
import typings.tizenCommonWeb.tizenCommonWebStrings.STATIC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoEthernetNetwork
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the cable status (ATTACHED or DETACHED) of the Ethernet interface.
    */
  val cable: String
  
  /**
    * Represents the DNS address of this connection.
    *
    * It is written in 255.255.255.255 format.
    */
  val dns: String
  
  /**
    * Represents the gateway of this connection.
    *
    * It is written in 255.255.255.255 format.
    */
  val gateway: String
  
  /**
    * Represents the IPv4 address of the Ethernet network.
    */
  val ipAddress: String
  
  /**
    * Represents this connection's IP configuration type.
    */
  val ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED
  
  /**
    * Represents the IPv6 address of the Ethernet network.
    */
  val ipv6Address: String
  
  /**
    * Represents the MAC address of the Ethernet interface.
    *
    * It is written in MM:MM:MM:SS:SS:SS format.
    */
  val macAddress: String
  
  /**
    * Represents the status (DEACTIVATED, DISCONNECTED or CONNECTED) of the Ethernet interface.
    */
  val status: String
  
  /**
    * Represents the subnet mask of this connection.
    *
    * It is written in 255.255.255.255 format.
    */
  val subnetMask: String
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
  implicit class SystemInfoEthernetNetworkMutableBuilder[Self <: SystemInfoEthernetNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCable(value: String): Self = StObject.set(x, "cable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpMode(value: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED): Self = StObject.set(x, "ipMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
  }
}
