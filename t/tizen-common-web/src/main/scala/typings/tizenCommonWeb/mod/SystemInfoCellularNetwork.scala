package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoCellularNetwork
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents an Access Point Name of the cellular network.
    */
  val apn: String
  
  /**
    * Represents Cell ID.
    */
  val cellId: Double
  
  /**
    * Represents the DNS address of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val dns: String
  
  /**
    * Represents the gateway of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val gateway: String
  
  /**
    * Represents the International Mobile Equipment Identity (IMEI).
    *
    * @since 2.1
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/telephony
    * @throw WebAPIException with error type SecurityError, if this attribute is not allowed.
    *
    * @warning 2.3.1 _http://tizen.org/privilege/systemmanager_ _(partner level)_ has been deprecated since 2.3.1. Instead, use _http://tizen.org/privilege/telephony_.
    */
  val imei: String
  
  /**
    * Represents the IPv4 address of the cellular network.
    */
  val ipAddress: String
  
  /**
    * Represents this connection's IP configuration type.
    *
    * @since 2.4
    */
  val ipMode: SystemInfoNetworkIpMode
  
  /**
    * Represents the IPv6 address of the cellular network.
    *
    * @since 2.0
    */
  val ipv6Address: String
  
  /**
    * Indicates whether the device is in flight mode.
    *
    * @since 2.1
    */
  val isFlightMode: Boolean
  
  /**
    * Indicates whether the connection is set up while the device is roaming.
    */
  val isRoaming: Boolean
  
  /**
    * Represents Location Area Code.
    */
  val lac: Double
  
  /**
    * Represents Mobile Country Code (MCC) of the cellular network.
    */
  val mcc: Double
  
  /**
    * Represents Mobile Network Code (MNC) of the cellular network. MNC is used in combination with MCC (also known as a "MCC / MNC tuple") to uniquely
    * identify a mobile phone operator/carrier using the GSM, CDMA, iDEN, TETRA and UMTS public land mobile networks and some satellite mobile networks.
    */
  val mnc: Double
  
  /**
    * Represents the status (ON or OFF) of the cellular network.
    */
  val status: String
  
  /**
    * Represents the subnet mask of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val subnetMask: String
}
object SystemInfoCellularNetwork {
  
  inline def apply(
    apn: String,
    cellId: Double,
    dns: String,
    gateway: String,
    imei: String,
    ipAddress: String,
    ipMode: SystemInfoNetworkIpMode,
    ipv6Address: String,
    isFlightMode: Boolean,
    isRoaming: Boolean,
    lac: Double,
    mcc: Double,
    mnc: Double,
    status: String,
    subnetMask: String
  ): SystemInfoCellularNetwork = {
    val __obj = js.Dynamic.literal(apn = apn.asInstanceOf[js.Any], cellId = cellId.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], imei = imei.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], ipMode = ipMode.asInstanceOf[js.Any], ipv6Address = ipv6Address.asInstanceOf[js.Any], isFlightMode = isFlightMode.asInstanceOf[js.Any], isRoaming = isRoaming.asInstanceOf[js.Any], lac = lac.asInstanceOf[js.Any], mcc = mcc.asInstanceOf[js.Any], mnc = mnc.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoCellularNetwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoCellularNetwork] (val x: Self) extends AnyVal {
    
    inline def setApn(value: String): Self = StObject.set(x, "apn", value.asInstanceOf[js.Any])
    
    inline def setCellId(value: Double): Self = StObject.set(x, "cellId", value.asInstanceOf[js.Any])
    
    inline def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpMode(value: SystemInfoNetworkIpMode): Self = StObject.set(x, "ipMode", value.asInstanceOf[js.Any])
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIsFlightMode(value: Boolean): Self = StObject.set(x, "isFlightMode", value.asInstanceOf[js.Any])
    
    inline def setIsRoaming(value: Boolean): Self = StObject.set(x, "isRoaming", value.asInstanceOf[js.Any])
    
    inline def setLac(value: Double): Self = StObject.set(x, "lac", value.asInstanceOf[js.Any])
    
    inline def setMcc(value: Double): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
    
    inline def setMnc(value: Double): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
  }
}
