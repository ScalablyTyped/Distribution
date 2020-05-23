package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific availability status. */
trait RemoteSystemStatusTypeFilter extends IRemoteSystemFilter {
  /** The status type that the containing RemoteSystemStatusTypeFilter object targets. */
  var remoteSystemStatusType: RemoteSystemStatusType
}

object RemoteSystemStatusTypeFilter {
  @scala.inline
  def apply(remoteSystemStatusType: RemoteSystemStatusType): RemoteSystemStatusTypeFilter = {
    val __obj = js.Dynamic.literal(remoteSystemStatusType = remoteSystemStatusType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemStatusTypeFilter]
  }
}

