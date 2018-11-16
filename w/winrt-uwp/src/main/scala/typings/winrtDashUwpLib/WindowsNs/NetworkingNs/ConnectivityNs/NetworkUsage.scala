package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents network usage statistics returned by the ConnectionProfile . GetNetworkUsageAsync method. */
@JSGlobal("Windows.Networking.Connectivity.NetworkUsage")
@js.native
abstract class NetworkUsage () extends js.Object {
  /** Indicates the number of bytes received by the connection of a specific period of time. */
  var bytesReceived: scala.Double = js.native
  /** Indicates the number of bytes sent by a connection over a specific period of time. */
  var bytesSent: scala.Double = js.native
  /** Indicates the duration of connectivity. */
  var connectionDuration: scala.Double = js.native
}

