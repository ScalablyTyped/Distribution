package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific availability status. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter")
@js.native
class RemoteSystemStatusTypeFilter protected () extends IRemoteSystemFilter {
  /** Initializes an instance of the RemoteSystemStatusTypeFilter class. */
  def this(remoteSystemStatusType: RemoteSystemStatusType) = this()
  /** The status type that the containing RemoteSystemStatusTypeFilter object targets. */
  var remoteSystemStatusType: RemoteSystemStatusType = js.native
}

