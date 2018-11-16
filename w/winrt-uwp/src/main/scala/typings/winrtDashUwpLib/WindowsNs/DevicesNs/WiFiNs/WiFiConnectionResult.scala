package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the results of an attempt to connect to a Wi-Fi network. */
@JSGlobal("Windows.Devices.WiFi.WiFiConnectionResult")
@js.native
abstract class WiFiConnectionResult () extends js.Object {
  /** Gets the connection result value. */
  var connectionStatus: WiFiConnectionStatus = js.native
}

