package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to access information specific to a WLAN connection. */
trait WlanConnectionProfileDetails extends js.Object {
  /**
    * Retrieves the Service Set Identifier (SSID) for a WLAN connection.
    * @return The service set identifier (SSID).
    */
  def getConnectedSsid(): String
}

object WlanConnectionProfileDetails {
  @scala.inline
  def apply(getConnectedSsid: () => String): WlanConnectionProfileDetails = {
    val __obj = js.Dynamic.literal(getConnectedSsid = js.Any.fromFunction0(getConnectedSsid))
    __obj.asInstanceOf[WlanConnectionProfileDetails]
  }
}

