package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemAdded event, namely the RemoteSystem that was added. */
trait RemoteSystemAddedEventArgs extends js.Object {
  /** The RemoteSystem object representing the device that was added to the set of discoverable devices, causing the containing RemoteSystemAdded event to be raised. */
  var remoteSystem: RemoteSystem
}

object RemoteSystemAddedEventArgs {
  @scala.inline
  def apply(remoteSystem: RemoteSystem): RemoteSystemAddedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemAddedEventArgs]
  }
}

