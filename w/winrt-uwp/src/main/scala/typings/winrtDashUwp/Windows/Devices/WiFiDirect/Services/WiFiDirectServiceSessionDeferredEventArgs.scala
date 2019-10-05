package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectService.SessionDeferred event is raised. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionDeferredEventArgs")
@js.native
abstract class WiFiDirectServiceSessionDeferredEventArgs () extends js.Object {
  /** Gets the service-defined session information returned by the service when it sends a deferral in response to a connection request. Note that a deferral does not indicate that the connection is refused. Rather, it indicates that the server is performing a time-consuming operation such as requesting user input. A seeker should implement a 120-second timeout after getting a deferral before giving up on the request. */
  var deferredSessionInfo: IBuffer = js.native
}

