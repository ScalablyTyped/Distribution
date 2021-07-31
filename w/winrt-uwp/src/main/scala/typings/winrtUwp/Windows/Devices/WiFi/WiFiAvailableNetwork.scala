package typings.winrtUwp.Windows.Devices.WiFi

import typings.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes an available Wi-Fi network. */
trait WiFiAvailableNetwork extends StObject {
  
  /** Gets the interval between 802.11 Beacon frames used by this network. */
  var beaconInterval: Double
  
  /** Gets the MAC address of the access point. */
  var bssid: String
  
  /** Gets the channel center frequency of the band on which the 802.11 Beacon or Probe Response was received. */
  var channelCenterFrequencyInKilohertz: Double
  
  /** Gets a value indicating whether this network originates from a Wi-Fi Direct access point. */
  var isWiFiDirect: Boolean
  
  /** Gets a value describing the kind of network being described. */
  var networkKind: WiFiNetworkKind
  
  /** Gets the signal strength of the network. */
  var networkRssiInDecibelMilliwatts: Double
  
  /** Gets a value describing the kind of PHY used by this network. */
  var phyKind: WiFiPhyKind
  
  /** Gets the security configuration of the network. */
  var securitySettings: NetworkSecuritySettings
  
  /** Gets the strength of the signal as a number of bars. */
  var signalBars: Double
  
  /** Gets the SSID (name) of the network. */
  var ssid: String
  
  /** Gets the uptime value reported by the network. */
  var uptime: Double
}
object WiFiAvailableNetwork {
  
  @scala.inline
  def apply(
    beaconInterval: Double,
    bssid: String,
    channelCenterFrequencyInKilohertz: Double,
    isWiFiDirect: Boolean,
    networkKind: WiFiNetworkKind,
    networkRssiInDecibelMilliwatts: Double,
    phyKind: WiFiPhyKind,
    securitySettings: NetworkSecuritySettings,
    signalBars: Double,
    ssid: String,
    uptime: Double
  ): WiFiAvailableNetwork = {
    val __obj = js.Dynamic.literal(beaconInterval = beaconInterval.asInstanceOf[js.Any], bssid = bssid.asInstanceOf[js.Any], channelCenterFrequencyInKilohertz = channelCenterFrequencyInKilohertz.asInstanceOf[js.Any], isWiFiDirect = isWiFiDirect.asInstanceOf[js.Any], networkKind = networkKind.asInstanceOf[js.Any], networkRssiInDecibelMilliwatts = networkRssiInDecibelMilliwatts.asInstanceOf[js.Any], phyKind = phyKind.asInstanceOf[js.Any], securitySettings = securitySettings.asInstanceOf[js.Any], signalBars = signalBars.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiAvailableNetwork]
  }
  
  @scala.inline
  implicit class WiFiAvailableNetworkMutableBuilder[Self <: WiFiAvailableNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeaconInterval(value: Double): Self = StObject.set(x, "beaconInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCenterFrequencyInKilohertz(value: Double): Self = StObject.set(x, "channelCenterFrequencyInKilohertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWiFiDirect(value: Boolean): Self = StObject.set(x, "isWiFiDirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkKind(value: WiFiNetworkKind): Self = StObject.set(x, "networkKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkRssiInDecibelMilliwatts(value: Double): Self = StObject.set(x, "networkRssiInDecibelMilliwatts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhyKind(value: WiFiPhyKind): Self = StObject.set(x, "phyKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuritySettings(value: NetworkSecuritySettings): Self = StObject.set(x, "securitySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalBars(value: Double): Self = StObject.set(x, "signalBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptime(value: Double): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
  }
}
