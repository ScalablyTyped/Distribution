package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectService.SessionDeferred event is raised. */
trait WiFiDirectServiceSessionDeferredEventArgs extends js.Object {
  /** Gets the service-defined session information returned by the service when it sends a deferral in response to a connection request. Note that a deferral does not indicate that the connection is refused. Rather, it indicates that the server is performing a time-consuming operation such as requesting user input. A seeker should implement a 120-second timeout after getting a deferral before giving up on the request. */
  var deferredSessionInfo: IBuffer
}

object WiFiDirectServiceSessionDeferredEventArgs {
  @scala.inline
  def apply(deferredSessionInfo: IBuffer): WiFiDirectServiceSessionDeferredEventArgs = {
    val __obj = js.Dynamic.literal(deferredSessionInfo = deferredSessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceSessionDeferredEventArgs]
  }
}

