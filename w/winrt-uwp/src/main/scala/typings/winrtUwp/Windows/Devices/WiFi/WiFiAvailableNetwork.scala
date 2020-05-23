package typings.winrtUwp.Windows.Devices.WiFi

import typings.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an available Wi-Fi network. */
trait WiFiAvailableNetwork extends js.Object {
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
}

