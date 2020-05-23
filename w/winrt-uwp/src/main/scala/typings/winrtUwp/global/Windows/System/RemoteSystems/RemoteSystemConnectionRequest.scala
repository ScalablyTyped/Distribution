package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an intent to communicate with a specific remote system (device). */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
class RemoteSystemConnectionRequest protected ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest {
  /** Initializes an instance of the RemoteSystemConnectionRequest class. */
  def this(remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem) = this()
  /** Represents the remote system (device) that the app intends to communicate with. */
  /* CompleteClass */
  override var remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem = js.native
  /** Represents the remote application that the app intends to communicate with. */
  /* CompleteClass */
  override var remoteSystemApp: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp = js.native
}

/* static members */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
object RemoteSystemConnectionRequest extends js.Object {
  /** Initializes a new instance of the RemoteSystemConnectionRequest class for a particular application on a remote system. */
  def createForApp(remoteSystemApp: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest = js.native
}

