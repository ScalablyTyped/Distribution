package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemRemoved event, namely the RemoteSystem that was removed. */
@js.native
trait RemoteSystemRemovedEventArgs extends js.Object {
  /** The RemoteSystem object representing the device that was removed from the set of discoverable devices, causing the containing RemoteSystemRemoved event to be raised. */
  var remoteSystemId: String = js.native
}

object RemoteSystemRemovedEventArgs {
  @scala.inline
  def apply(remoteSystemId: String): RemoteSystemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystemId = remoteSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemRemovedEventArgs]
  }
  @scala.inline
  implicit class RemoteSystemRemovedEventArgsOps[Self <: RemoteSystemRemovedEventArgs] (val x: Self) extends AnyVal {
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
    def setRemoteSystemId(value: String): Self = this.set("remoteSystemId", value.asInstanceOf[js.Any])
  }
  
}

