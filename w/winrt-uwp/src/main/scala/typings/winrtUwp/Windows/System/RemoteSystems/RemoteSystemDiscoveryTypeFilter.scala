package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific discovery type. */
trait RemoteSystemDiscoveryTypeFilter extends IRemoteSystemFilter {
  /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
  var remoteSystemKinds: IVectorView[String]
}

object RemoteSystemDiscoveryTypeFilter {
  @scala.inline
  def apply(remoteSystemKinds: IVectorView[String]): RemoteSystemDiscoveryTypeFilter = {
    val __obj = js.Dynamic.literal(remoteSystemKinds = remoteSystemKinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemDiscoveryTypeFilter]
  }
}

