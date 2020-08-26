package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific discovery type. */
@js.native
trait RemoteSystemDiscoveryTypeFilter extends IRemoteSystemFilter {
  /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
  var remoteSystemKinds: IVectorView[String] = js.native
}

object RemoteSystemDiscoveryTypeFilter {
  @scala.inline
  def apply(remoteSystemKinds: IVectorView[String]): RemoteSystemDiscoveryTypeFilter = {
    val __obj = js.Dynamic.literal(remoteSystemKinds = remoteSystemKinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemDiscoveryTypeFilter]
  }
  @scala.inline
  implicit class RemoteSystemDiscoveryTypeFilterOps[Self <: RemoteSystemDiscoveryTypeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRemoteSystemKinds(value: IVectorView[String]): Self = this.set("remoteSystemKinds", value.asInstanceOf[js.Any])
  }
  
}

