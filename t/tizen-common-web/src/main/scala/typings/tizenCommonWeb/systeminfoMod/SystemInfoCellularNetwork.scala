package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.AUTO
import typings.tizenCommonWeb.tizenCommonWebStrings.DYNAMIC
import typings.tizenCommonWeb.tizenCommonWebStrings.FIXED
import typings.tizenCommonWeb.tizenCommonWebStrings.NONE
import typings.tizenCommonWeb.tizenCommonWebStrings.STATIC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoCellularNetwork extends SystemInfoProperty {
  
  /**
    * Represents an Access Point Name of the cellular network.
    */
  val apn: String = js.native
  
  /**
    * Represents Cell ID.
    */
  val cellId: Double = js.native
  
  /**
    * Represents the DNS address of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val dns: String = js.native
  
  /**
    * Represents the gateway of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val gateway: String = js.native
  
  /**
    * Represents the International Mobile Equipment Identity (IMEI).
    *
    * @since 2.1
    *
    * @privilegelevel public
    * @privilege http://tizen.org/privilege/telephony
    * @throw WebAPIException with error type SecurityError, if this attribute is not allowed.
    *
    * @warning 2.3.1 `http://tizen.org/privilege/systemmanager` `(partner level)` has been deprecated since 2.3.1. Instead, use `http://tizen.org/privilege/telephony`.
    */
  val imei: String = js.native
  
  /**
    * Represents the IPv4 address of the cellular network.
    */
  val ipAddress: String = js.native
  
  /**
    * Represents this connection's IP configuration type.
    *
    * @since 2.4
    */
  val ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED = js.native
  
  /**
    * Represents the IPv6 address of the cellular network.
    *
    * @since 2.0
    */
  val ipv6Address: String = js.native
  
  /**
    * Indicates whether the device is in flight mode.
    *
    * @since 2.1
    */
  val isFlightMode: Boolean = js.native
  
  /**
    * Indicates whether the connection is set up while the device is roaming.
    */
  val isRoaming: Boolean = js.native
  
  /**
    * Represents Location Area Code.
    */
  val lac: Double = js.native
  
  /**
    * Represents Mobile Country Code (MCC) of the cellular network.
    */
  val mcc: Double = js.native
  
  /**
    * Represents Mobile Network Code (MNC) of the cellular network. MNC is used in combination with MCC (also known as a "MCC / MNC tuple") to uniquely
    * identify a mobile phone operator/carrier using the GSM, CDMA, iDEN, TETRA and UMTS public land mobile networks and some satellite mobile networks.
    */
  val mnc: Double = js.native
  
  /**
    * Represents the status (ON or OFF) of the cellular network.
    */
  val status: String = js.native
  
  /**
    * Represents the subnet mask of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val subnetMask: String = js.native
}
object SystemInfoCellularNetwork {
  
  @scala.inline
  def apply(
    apn: String,
    cellId: Double,
    dns: String,
    gateway: String,
    imei: String,
    ipAddress: String,
    ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED,
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
  implicit class SystemInfoCellularNetworkMutableBuilder[Self <: SystemInfoCellularNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApn(value: String): Self = StObject.set(x, "apn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellId(value: Double): Self = StObject.set(x, "cellId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpMode(value: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED): Self = StObject.set(x, "ipMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlightMode(value: Boolean): Self = StObject.set(x, "isFlightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoaming(value: Boolean): Self = StObject.set(x, "isRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLac(value: Double): Self = StObject.set(x, "lac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMcc(value: Double): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMnc(value: Double): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
  }
}
