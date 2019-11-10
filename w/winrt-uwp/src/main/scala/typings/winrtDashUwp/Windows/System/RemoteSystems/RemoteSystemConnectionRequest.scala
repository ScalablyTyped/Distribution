package typings.winrtDashUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an intent to communicate with a specific remote system (device). */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
class RemoteSystemConnectionRequest protected () extends js.Object {
  /** Initializes an instance of the RemoteSystemConnectionRequest class. */
  def this(remoteSystem: RemoteSystem) = this()
  /** Represents the remote system (device) that the app intends to communicate with. */
  var remoteSystem: RemoteSystem = js.native
  /** Represents the remote application that the app intends to communicate with. */
  var remoteSystemApp: RemoteSystemApp = js.native
}

/* static members */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
object RemoteSystemConnectionRequest extends js.Object {
  /** Initializes a new instance of the RemoteSystemConnectionRequest class for a particular application on a remote system. */
  def createForApp(remoteSystemApp: RemoteSystemApp): RemoteSystemConnectionRequest = js.native
}

