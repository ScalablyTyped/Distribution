package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoWifiNetwork
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the DNS address of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val dns: String
  
  /**
    * Represents this connection's encryption type.
    *
    * @since 2.4
    */
  val encryptionType: SystemInfoWifiEncryptionType
  
  /**
    * Represents the gateway of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val gateway: String
  
  /**
    * Represents the IPv4 address of the Wi-Fi network.
    */
  val ipAddress: String
  
  /**
    * Represents this connection's IP configuration type.
    *
    * @since 2.4
    */
  val ipMode: SystemInfoNetworkIpMode
  
  /**
    * Represents the IPv6 address of the Wi-Fi network.
    *
    * @since 2.0
    */
  val ipv6Address: String
  
  /**
    * Represents the MAC address of the Wi-Fi interface.
    *
    * It is written in MM:MM:MM:SS:SS:SS format.
    *
    * @since 2.3
    */
  val macAddress: String
  
  /**
    * Represents this connection's security mode.
    *
    * @since 2.4
    */
  val securityMode: SystemInfoWifiSecurityMode
  
  /**
    * This connection's signal strength, as a normalized value between 0 (no signal detected) and 1 (the level is at its maximum value).
    */
  val signalStrength: Double
  
  /**
    * Represents the SSID of the Wi-Fi network.
    */
  val ssid: String
  
  /**
    * Represents the status (ON or OFF) of the Wi-Fi interface.
    */
  val status: String
  
  /**
    * Represents the subnet mask of this connection.
    *
    * It is written in 255.255.255.255 format.
    * @since 2.4
    */
  val subnetMask: String
}
object SystemInfoWifiNetwork {
  
  inline def apply(
    dns: String,
    encryptionType: SystemInfoWifiEncryptionType,
    gateway: String,
    ipAddress: String,
    ipMode: SystemInfoNetworkIpMode,
    ipv6Address: String,
    macAddress: String,
    securityMode: SystemInfoWifiSecurityMode,
    signalStrength: Double,
    ssid: String,
    status: String,
    subnetMask: String
  ): SystemInfoWifiNetwork = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], encryptionType = encryptionType.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], ipMode = ipMode.asInstanceOf[js.Any], ipv6Address = ipv6Address.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], securityMode = securityMode.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoWifiNetwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoWifiNetwork] (val x: Self) extends AnyVal {
    
    inline def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setEncryptionType(value: SystemInfoWifiEncryptionType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpMode(value: SystemInfoNetworkIpMode): Self = StObject.set(x, "ipMode", value.asInstanceOf[js.Any])
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setSecurityMode(value: SystemInfoWifiSecurityMode): Self = StObject.set(x, "securityMode", value.asInstanceOf[js.Any])
    
    inline def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
    
    inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
  }
}
