package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific availability status. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter")
@js.native
class RemoteSystemStatusTypeFilter protected ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter {
  /** Initializes an instance of the RemoteSystemStatusTypeFilter class. */
  def this(remoteSystemStatusType: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType) = this()
  /** The status type that the containing RemoteSystemStatusTypeFilter object targets. */
  /* CompleteClass */
  override var remoteSystemStatusType: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType = js.native
}

