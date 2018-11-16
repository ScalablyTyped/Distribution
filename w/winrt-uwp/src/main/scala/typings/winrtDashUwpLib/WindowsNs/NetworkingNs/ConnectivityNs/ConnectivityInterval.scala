package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the start time and duration for an established or prior connection. */
@JSGlobal("Windows.Networking.Connectivity.ConnectivityInterval")
@js.native
abstract class ConnectivityInterval () extends js.Object {
  /** Indicates the duration of connectivity. */
  var connectionDuration: scala.Double = js.native
  /** Indicates when the connection was initially established. */
  var startTime: stdLib.Date = js.native
}

