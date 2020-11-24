package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an intent to communicate with a specific remote system (device). */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
class RemoteSystemConnectionRequest protected ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest {
  /** Initializes an instance of the RemoteSystemConnectionRequest class. */
  def this(remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem) = this()
}
/* static members */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
object RemoteSystemConnectionRequest extends js.Object {
  
  /** Initializes a new instance of the RemoteSystemConnectionRequest class for a particular application on a remote system. */
  def createForApp(remoteSystemApp: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest = js.native
}
