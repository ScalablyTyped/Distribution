package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WifiNetworkData extends js.Object {
  var bssid: String
  var channel: Double
  var frequency: Double
  var mode: String
  var quality: Double
  var rsnFlags: js.Array[String]
  var security: js.Array[String]
  var signalLevel: Double
  var ssid: String
  var wpaFlags: js.Array[String]
}

object WifiNetworkData {
  @scala.inline
  def apply(
    bssid: String,
    channel: Double,
    frequency: Double,
    mode: String,
    quality: Double,
    rsnFlags: js.Array[String],
    security: js.Array[String],
    signalLevel: Double,
    ssid: String,
    wpaFlags: js.Array[String]
  ): WifiNetworkData = {
    val __obj = js.Dynamic.literal(bssid = bssid.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rsnFlags = rsnFlags.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], signalLevel = signalLevel.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], wpaFlags = wpaFlags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WifiNetworkData]
  }
}

