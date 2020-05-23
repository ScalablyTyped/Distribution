package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectionSession class is used to represent a connection to an access point established with AcquireConnectionAsync . */
@JSGlobal("Windows.Networking.Connectivity.ConnectionSession")
@js.native
abstract class ConnectionSession ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectionSession {
  /** Retrieves the ConnectionProfile associated with the connection session. */
  /* CompleteClass */
  override var connectionProfile: typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile = js.native
  /** Closes the connection to the access point. */
  /* CompleteClass */
  override def close(): Unit = js.native
}

