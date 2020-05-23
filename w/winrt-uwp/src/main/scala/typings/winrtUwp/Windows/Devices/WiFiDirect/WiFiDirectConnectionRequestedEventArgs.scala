package typings.winrtUwp.Windows.Devices.WiFiDirect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionRequested event on a WiFiDirectConnectionListener . */
trait WiFiDirectConnectionRequestedEventArgs extends js.Object {
  /**
    * Retrieves the WiFiDirectConnectionRequest received on a ConnectionRequested event by a WiFiDirectConnectionListener .
    * @return The Wi-FI Direct connection request.
    */
  def getConnectionRequest(): WiFiDirectConnectionRequest
}

object WiFiDirectConnectionRequestedEventArgs {
  @scala.inline
  def apply(getConnectionRequest: () => WiFiDirectConnectionRequest): WiFiDirectConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getConnectionRequest = js.Any.fromFunction0(getConnectionRequest))
    __obj.asInstanceOf[WiFiDirectConnectionRequestedEventArgs]
  }
}

