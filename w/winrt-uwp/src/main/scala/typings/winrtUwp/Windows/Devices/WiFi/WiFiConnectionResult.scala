package typings.winrtUwp.Windows.Devices.WiFi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the results of an attempt to connect to a Wi-Fi network. */
trait WiFiConnectionResult extends js.Object {
  /** Gets the connection result value. */
  var connectionStatus: WiFiConnectionStatus
}

object WiFiConnectionResult {
  @scala.inline
  def apply(connectionStatus: WiFiConnectionStatus): WiFiConnectionResult = {
    val __obj = js.Dynamic.literal(connectionStatus = connectionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiConnectionResult]
  }
}

