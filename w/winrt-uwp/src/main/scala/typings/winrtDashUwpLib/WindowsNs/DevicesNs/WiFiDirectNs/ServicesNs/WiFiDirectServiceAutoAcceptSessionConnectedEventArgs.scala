package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceAdvertiser.AutoAcceptSessionConnected event is raised. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAutoAcceptSessionConnectedEventArgs")
@js.native
abstract class WiFiDirectServiceAutoAcceptSessionConnectedEventArgs () extends js.Object {
  /** Gets the WiFiDirectServiceSession that was created when the connection was automatically accepted. */
  var session: WiFiDirectServiceSession = js.native
  /** Gets the session information buffer that corresponds to this automatically accepted connection. */
  var sessionInfo: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

