package typings.winrtDashUwp.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the start time and duration for an established or prior connection. */
@JSGlobal("Windows.Networking.Connectivity.ConnectivityInterval")
@js.native
abstract class ConnectivityInterval () extends js.Object {
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double = js.native
  /** Indicates when the connection was initially established. */
  var startTime: Date = js.native
}

