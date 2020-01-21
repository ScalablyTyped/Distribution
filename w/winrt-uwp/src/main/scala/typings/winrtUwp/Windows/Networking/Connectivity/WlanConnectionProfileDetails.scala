package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to access information specific to a WLAN connection. */
@JSGlobal("Windows.Networking.Connectivity.WlanConnectionProfileDetails")
@js.native
abstract class WlanConnectionProfileDetails () extends js.Object {
  /**
    * Retrieves the Service Set Identifier (SSID) for a WLAN connection.
    * @return The service set identifier (SSID).
    */
  def getConnectedSsid(): String = js.native
}

