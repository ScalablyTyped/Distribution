package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionRequested event on a WiFiDirectConnectionListener . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs")
@js.native
abstract class WiFiDirectConnectionRequestedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs {
  /**
    * Retrieves the WiFiDirectConnectionRequest received on a ConnectionRequested event by a WiFiDirectConnectionListener .
    * @return The Wi-FI Direct connection request.
    */
  /* CompleteClass */
  override def getConnectionRequest(): typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest = js.native
}

