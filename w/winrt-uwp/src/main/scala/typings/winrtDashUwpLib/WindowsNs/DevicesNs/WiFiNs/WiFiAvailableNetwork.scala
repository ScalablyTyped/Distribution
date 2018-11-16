package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an available Wi-Fi network. */
@JSGlobal("Windows.Devices.WiFi.WiFiAvailableNetwork")
@js.native
abstract class WiFiAvailableNetwork () extends js.Object {
  /** Gets the interval between 802.11 Beacon frames used by this network. */
  var beaconInterval: scala.Double = js.native
  /** Gets the MAC address of the access point. */
  var bssid: java.lang.String = js.native
  /** Gets the channel center frequency of the band on which the 802.11 Beacon or Probe Response was received. */
  var channelCenterFrequencyInKilohertz: scala.Double = js.native
  /** Gets a value indicating whether this network originates from a Wi-Fi Direct access point. */
  var isWiFiDirect: scala.Boolean = js.native
  /** Gets a value describing the kind of network being described. */
  var networkKind: WiFiNetworkKind = js.native
  /** Gets the signal strength of the network. */
  var networkRssiInDecibelMilliwatts: scala.Double = js.native
  /** Gets a value describing the kind of PHY used by this network. */
  var phyKind: WiFiPhyKind = js.native
  /** Gets the security configuration of the network. */
  var securitySettings: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkSecuritySettings = js.native
  /** Gets the strength of the signal as a number of bars. */
  var signalBars: scala.Double = js.native
  /** Gets the SSID (name) of the network. */
  var ssid: java.lang.String = js.native
  /** Gets the uptime value reported by the network. */
  var uptime: scala.Double = js.native
}

