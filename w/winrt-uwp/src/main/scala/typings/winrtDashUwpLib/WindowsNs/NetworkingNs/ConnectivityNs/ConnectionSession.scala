package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectionSession class is used to represent a connection to an access point established with AcquireConnectionAsync . */
@JSGlobal("Windows.Networking.Connectivity.ConnectionSession")
@js.native
abstract class ConnectionSession () extends js.Object {
  /** Retrieves the ConnectionProfile associated with the connection session. */
  var connectionProfile: ConnectionProfile = js.native
  /** Closes the connection to the access point. */
  def close(): scala.Unit = js.native
}

