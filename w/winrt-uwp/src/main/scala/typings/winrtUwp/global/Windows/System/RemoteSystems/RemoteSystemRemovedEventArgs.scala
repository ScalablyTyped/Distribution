package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemRemoved event, namely the RemoteSystem that was removed. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs")
@js.native
abstract class RemoteSystemRemovedEventArgs ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs {
  /** The RemoteSystem object representing the device that was removed from the set of discoverable devices, causing the containing RemoteSystemRemoved event to be raised. */
  /* CompleteClass */
  override var remoteSystemId: String = js.native
}

