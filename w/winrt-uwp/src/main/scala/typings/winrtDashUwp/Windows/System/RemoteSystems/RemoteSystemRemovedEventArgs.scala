package typings.winrtDashUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemRemoved event, namely the RemoteSystem that was removed. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs")
@js.native
abstract class RemoteSystemRemovedEventArgs () extends js.Object {
  /** The RemoteSystem object representing the device that was removed from the set of discoverable devices, causing the containing RemoteSystemRemoved event to be raised. */
  var remoteSystemId: String = js.native
}

