package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
trait WiFiDirectServiceSessionRequestedEventArgs extends js.Object {
  /**
    * Gets information about the session request that raised a WiFiDirectServiceAdvertiser.SessionRequested event.
    * @return Information about a new session request.
    */
  def getSessionRequest(): WiFiDirectServiceSessionRequest
}

object WiFiDirectServiceSessionRequestedEventArgs {
  @scala.inline
  def apply(getSessionRequest: () => WiFiDirectServiceSessionRequest): WiFiDirectServiceSessionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getSessionRequest = js.Any.fromFunction0(getSessionRequest))
    __obj.asInstanceOf[WiFiDirectServiceSessionRequestedEventArgs]
  }
}

