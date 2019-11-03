package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(bssid = bssid, channel = channel, frequency = frequency, mode = mode, quality = quality, rsnFlags = rsnFlags, security = security, signalLevel = signalLevel, ssid = ssid, wpaFlags = wpaFlags)
  
    __obj.asInstanceOf[WifiNetworkData]
  }
}

