package typings.tizenCommonWeb.mod

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
  override val ipMode: SystemInfoNetworkIpMode
  
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
  override val status: SystemInfoLowMemoryStatus & String & SystemInfoDeviceOrientationStatus
  
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
  
  inline def apply(
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
    encryptionType: SystemInfoWifiEncryptionType,
    gateway: String,
    imei: String,
    ipAddress: String,
    ipMode: SystemInfoNetworkIpMode,
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
    networkType: SystemInfoNetworkType,
    panelHeight: Double,
    panelWidth: Double,
    physicalHeight: Double,
    physicalWidth: Double,
    resolutionHeight: Double,
    resolutionWidth: Double,
    securityMode: SystemInfoWifiSecurityMode,
    signalStrength: Double,
    ssid: String,
    status: SystemInfoLowMemoryStatus & String & SystemInfoDeviceOrientationStatus,
    subnetMask: String,
    `type`: String,
    units: js.Array[SystemInfoStorageUnit]
  ): SystemInfoPropertyType = {
    val __obj = js.Dynamic.literal(apn = apn.asInstanceOf[js.Any], availableCapacity = availableCapacity.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], buildVersion = buildVersion.asInstanceOf[js.Any], cable = cable.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], cellId = cellId.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], dotsPerInchHeight = dotsPerInchHeight.asInstanceOf[js.Any], dotsPerInchWidth = dotsPerInchWidth.asInstanceOf[js.Any], encryptionType = encryptionType.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], imei = imei.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], ipMode = ipMode.asInstanceOf[js.Any], ipv6Address = ipv6Address.asInstanceOf[js.Any], isAutoRotation = isAutoRotation.asInstanceOf[js.Any], isCharging = isCharging.asInstanceOf[js.Any], isFlightMode = isFlightMode.asInstanceOf[js.Any], isRemovable = isRemovable.asInstanceOf[js.Any], isRemoveable = isRemoveable.asInstanceOf[js.Any], isRoaming = isRoaming.asInstanceOf[js.Any], isVideoOutputOn = isVideoOutputOn.asInstanceOf[js.Any], lac = lac.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], mcc = mcc.asInstanceOf[js.Any], mnc = mnc.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any], panelHeight = panelHeight.asInstanceOf[js.Any], panelWidth = panelWidth.asInstanceOf[js.Any], physicalHeight = physicalHeight.asInstanceOf[js.Any], physicalWidth = physicalWidth.asInstanceOf[js.Any], resolutionHeight = resolutionHeight.asInstanceOf[js.Any], resolutionWidth = resolutionWidth.asInstanceOf[js.Any], securityMode = securityMode.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any], timeToDischarge = null, timeToFullCharge = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPropertyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoPropertyType] (val x: Self) extends AnyVal {
    
    inline def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpMode(value: SystemInfoNetworkIpMode): Self = StObject.set(x, "ipMode", value.asInstanceOf[js.Any])
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SystemInfoLowMemoryStatus & String & SystemInfoDeviceOrientationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
  }
}
