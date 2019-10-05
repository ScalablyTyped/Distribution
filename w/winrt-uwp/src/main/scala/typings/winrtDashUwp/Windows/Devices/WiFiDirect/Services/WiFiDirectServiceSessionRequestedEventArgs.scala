package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequestedEventArgs")
@js.native
abstract class WiFiDirectServiceSessionRequestedEventArgs () extends js.Object {
  /**
    * Gets information about the session request that raised a WiFiDirectServiceAdvertiser.SessionRequested event.
    * @return Information about a new session request.
    */
  def getSessionRequest(): WiFiDirectServiceSessionRequest = js.native
}

