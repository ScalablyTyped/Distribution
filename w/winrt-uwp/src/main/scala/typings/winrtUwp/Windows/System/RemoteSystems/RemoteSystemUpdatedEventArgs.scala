package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemUpdated event, namely the RemoteSystem that was updated. */
trait RemoteSystemUpdatedEventArgs extends js.Object {
  /** The RemoteSystem object representing the device in the set of discoverable devices whose properties were updated, causing the containing RemoteSystemUpdated event to be raised. */
  var remoteSystem: RemoteSystem
}

object RemoteSystemUpdatedEventArgs {
  @scala.inline
  def apply(remoteSystem: RemoteSystem): RemoteSystemUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemUpdatedEventArgs]
  }
}

