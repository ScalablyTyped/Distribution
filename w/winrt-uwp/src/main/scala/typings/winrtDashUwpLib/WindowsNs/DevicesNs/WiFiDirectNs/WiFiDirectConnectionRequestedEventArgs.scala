package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionRequested event on a WiFiDirectConnectionListener . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs")
@js.native
abstract class WiFiDirectConnectionRequestedEventArgs () extends js.Object {
  /**
                   * Retrieves the WiFiDirectConnectionRequest received on a ConnectionRequested event by a WiFiDirectConnectionListener .
                   * @return The Wi-FI Direct connection request.
                   */
  def getConnectionRequest(): WiFiDirectConnectionRequest = js.native
}

