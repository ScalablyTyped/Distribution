package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemRemoved event, namely the RemoteSystem that was removed. */
trait RemoteSystemRemovedEventArgs extends js.Object {
  /** The RemoteSystem object representing the device that was removed from the set of discoverable devices, causing the containing RemoteSystemRemoved event to be raised. */
  var remoteSystemId: String
}

object RemoteSystemRemovedEventArgs {
  @scala.inline
  def apply(remoteSystemId: String): RemoteSystemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystemId = remoteSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemRemovedEventArgs]
  }
}

