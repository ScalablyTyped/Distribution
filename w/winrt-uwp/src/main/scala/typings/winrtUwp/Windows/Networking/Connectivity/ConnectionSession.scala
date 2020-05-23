package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectionSession class is used to represent a connection to an access point established with AcquireConnectionAsync . */
trait ConnectionSession extends js.Object {
  /** Retrieves the ConnectionProfile associated with the connection session. */
  var connectionProfile: ConnectionProfile
  /** Closes the connection to the access point. */
  def close(): Unit
}

object ConnectionSession {
  @scala.inline
  def apply(close: () => Unit, connectionProfile: ConnectionProfile): ConnectionSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionProfile = connectionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSession]
  }
}

