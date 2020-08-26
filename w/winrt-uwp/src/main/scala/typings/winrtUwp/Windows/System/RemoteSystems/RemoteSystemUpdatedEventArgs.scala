package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemUpdated event, namely the RemoteSystem that was updated. */
@js.native
trait RemoteSystemUpdatedEventArgs extends js.Object {
  /** The RemoteSystem object representing the device in the set of discoverable devices whose properties were updated, causing the containing RemoteSystemUpdated event to be raised. */
  var remoteSystem: RemoteSystem = js.native
}

object RemoteSystemUpdatedEventArgs {
  @scala.inline
  def apply(remoteSystem: RemoteSystem): RemoteSystemUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemUpdatedEventArgs]
  }
  @scala.inline
  implicit class RemoteSystemUpdatedEventArgsOps[Self <: RemoteSystemUpdatedEventArgs] (val x: Self) extends AnyVal {
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
    def setRemoteSystem(value: RemoteSystem): Self = this.set("remoteSystem", value.asInstanceOf[js.Any])
  }
  
}

