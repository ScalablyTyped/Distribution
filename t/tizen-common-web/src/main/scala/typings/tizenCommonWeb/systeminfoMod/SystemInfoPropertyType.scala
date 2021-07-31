package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.AES
import typings.tizenCommonWeb.tizenCommonWebStrings.AUTO
import typings.tizenCommonWeb.tizenCommonWebStrings.DYNAMIC
import typings.tizenCommonWeb.tizenCommonWebStrings.EAP
import typings.tizenCommonWeb.tizenCommonWebStrings.ETHERNET
import typings.tizenCommonWeb.tizenCommonWebStrings.FIXED
import typings.tizenCommonWeb.tizenCommonWebStrings.LANDSCAPE_PRIMARY
import typings.tizenCommonWeb.tizenCommonWebStrings.LANDSCAPE_SECONDARY
import typings.tizenCommonWeb.tizenCommonWebStrings.NET_PROXY
import typings.tizenCommonWeb.tizenCommonWebStrings.NONE
import typings.tizenCommonWeb.tizenCommonWebStrings.NORMAL
import typings.tizenCommonWeb.tizenCommonWebStrings.PORTRAIT_PRIMARY
import typings.tizenCommonWeb.tizenCommonWebStrings.PORTRAIT_SECONDARY
import typings.tizenCommonWeb.tizenCommonWebStrings.STATIC
import typings.tizenCommonWeb.tizenCommonWebStrings.TKIP
import typings.tizenCommonWeb.tizenCommonWebStrings.TKIP_AES_MIXED
import typings.tizenCommonWeb.tizenCommonWebStrings.UNKNOWN
import typings.tizenCommonWeb.tizenCommonWebStrings.WARNING
import typings.tizenCommonWeb.tizenCommonWebStrings.WEP
import typings.tizenCommonWeb.tizenCommonWebStrings.WIFI
import typings.tizenCommonWeb.tizenCommonWebStrings.WPA2_PSK
import typings.tizenCommonWeb.tizenCommonWebStrings.WPA_PSK
import typings.tizenCommonWeb.tizenCommonWebStrings.`2Dot5G`
import typings.tizenCommonWeb.tizenCommonWebStrings.`2G`
import typings.tizenCommonWeb.tizenCommonWebStrings.`3G`
import typings.tizenCommonWeb.tizenCommonWebStrings.`4G`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoPropertyType
  extends StObject
     with SystemInfoBattery
     with SystemInfoCpu
     with SystemInfoStorage
     with SystemInfoStorageUnit
     with SystemInfoDisplay
     with SystemInfoPanel
     with SystemInfoDeviceOrientation
     with SystemInfoBuild
     with SystemInfoLocale
     with SystemInfoNetwork
     with SystemInfoWifiNetwork
     with SystemInfoEthernetNetwork
     with SystemInfoCellularNetwork
     with SystemInfoNetProxyNetwork
     with SystemInfoPeripheral
     with SystemInfoMemory
     with SystemInfoVideoSource {
  
  /**
    * Represents the DNS address of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  /* InferMemberOverrides */
  override val dns: String
  
  /**
    * Represents the gateway of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  /* InferMemberOverrides */
  override val gateway: String
  
  /**
    * Represents the IPv4 address of the cellular network.
    */
  /* InferMemberOverrides */
  override val ipAddress: String
  
  /**
    * Represents this connection's IP configuration type.
    *
    * @since 2.4
    */
  /* InferMemberOverrides */
  override val ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED
  
  /**
    * Represents the IPv6 address of the cellular network.
    *
    * @since 2.0
    */
  /* InferMemberOverrides */
  override val ipv6Address: String
  
  /**
    * Represents the MAC address of the Ethernet interface.
    *
    * It is written in MM:MM:MM:SS:SS:SS format.
    */
  /* InferMemberOverrides */
  override val macAddress: String
  
  /**
    * Represents the low memory state.
    */
  /* InferMemberOverrides */
  override val status: (SystemInfoLowMemoryStatus | NORMAL | WARNING) & String & (SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY)
  
  /**
    * Represents the subnet mask of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  /* InferMemberOverrides */
  override val subnetMask: String
}
object SystemInfoPropertyType {
  
  @scala.inline
  def apply(
    apn: String,
    availableCapacity: Double,
    brightness: Double,
    buildVersion: String,
    cable: String,
    capacity: Double,
    cellId: Double,
    connected: js.Array[SystemInfoVideoSourceInfo],
    country: String,
    disconnected: js.Array[SystemInfoVideoSourceInfo],
    dns: String,
    dotsPerInchHeight: Double,
    dotsPerInchWidth: Double,
    encryptionType: SystemInfoWifiEncryptionType | NONE | WEP | TKIP | AES | TKIP_AES_MIXED,
    gateway: String,
    imei: String,
    ipAddress: String,
    ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED,
    ipv6Address: String,
    isAutoRotation: Boolean,
    isCharging: Boolean,
    isFlightMode: Boolean,
    isRemovable: Boolean,
    isRemoveable: Boolean,
    isRoaming: Boolean,
    isVideoOutputOn: Boolean,
    lac: Double,
    language: String,
    level: Double,
    load: Double,
    macAddress: String,
    manufacturer: String,
    mcc: Double,
    mnc: Double,
    model: String,
    networkType: SystemInfoNetworkType | NONE | `2G` | `2Dot5G` | `3G` | `4G` | WIFI | ETHERNET | NET_PROXY | UNKNOWN,
    panelHeight: Double,
    panelWidth: Double,
    physicalHeight: Double,
    physicalWidth: Double,
    resolutionHeight: Double,
    resolutionWidth: Double,
    securityMode: SystemInfoWifiSecurityMode | NONE | WEP | WPA_PSK | WPA2_PSK | EAP,
    signalStrength: Double,
    ssid: String,
    status: (SystemInfoLowMemoryStatus | NORMAL | WARNING) & String & (SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY),
    subnetMask: String,
    `type`: String,
    units: js.Array[SystemInfoStorageUnit]
  ): SystemInfoPropertyType = {
    val __obj = js.Dynamic.literal(apn = apn.asInstanceOf[js.Any], availableCapacity = availableCapacity.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], buildVersion = buildVersion.asInstanceOf[js.Any], cable = cable.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], cellId = cellId.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], dotsPerInchHeight = dotsPerInchHeight.asInstanceOf[js.Any], dotsPerInchWidth = dotsPerInchWidth.asInstanceOf[js.Any], encryptionType = encryptionType.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], imei = imei.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], ipMode = ipMode.asInstanceOf[js.Any], ipv6Address = ipv6Address.asInstanceOf[js.Any], isAutoRotation = isAutoRotation.asInstanceOf[js.Any], isCharging = isCharging.asInstanceOf[js.Any], isFlightMode = isFlightMode.asInstanceOf[js.Any], isRemovable = isRemovable.asInstanceOf[js.Any], isRemoveable = isRemoveable.asInstanceOf[js.Any], isRoaming = isRoaming.asInstanceOf[js.Any], isVideoOutputOn = isVideoOutputOn.asInstanceOf[js.Any], lac = lac.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], mcc = mcc.asInstanceOf[js.Any], mnc = mnc.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any], panelHeight = panelHeight.asInstanceOf[js.Any], panelWidth = panelWidth.asInstanceOf[js.Any], physicalHeight = physicalHeight.asInstanceOf[js.Any], physicalWidth = physicalWidth.asInstanceOf[js.Any], resolutionHeight = resolutionHeight.asInstanceOf[js.Any], resolutionWidth = resolutionWidth.asInstanceOf[js.Any], securityMode = securityMode.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPropertyType]
  }
  
  @scala.inline
  implicit class SystemInfoPropertyTypeMutableBuilder[Self <: SystemInfoPropertyType] (val x: Self) extends AnyVal {
    
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
    def setStatus(
      value: (SystemInfoLowMemoryStatus | NORMAL | WARNING) & String & (SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY)
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
  }
}
