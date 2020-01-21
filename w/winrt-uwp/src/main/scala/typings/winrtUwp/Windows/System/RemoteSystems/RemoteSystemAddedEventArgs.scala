package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemAdded event, namely the RemoteSystem that was added. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemAddedEventArgs")
@js.native
abstract class RemoteSystemAddedEventArgs () extends js.Object {
  /** The RemoteSystem object representing the device that was added to the set of discoverable devices, causing the containing RemoteSystemAdded event to be raised. */
  var remoteSystem: RemoteSystem = js.native
}

