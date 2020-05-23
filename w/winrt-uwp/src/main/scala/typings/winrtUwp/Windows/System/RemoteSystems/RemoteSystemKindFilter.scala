package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of specific device types. */
trait RemoteSystemKindFilter extends IRemoteSystemFilter {
  /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
  var remoteSystemKinds: RemoteSystemKinds
}

object RemoteSystemKindFilter {
  @scala.inline
  def apply(remoteSystemKinds: RemoteSystemKinds): RemoteSystemKindFilter = {
    val __obj = js.Dynamic.literal(remoteSystemKinds = remoteSystemKinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemKindFilter]
  }
}

