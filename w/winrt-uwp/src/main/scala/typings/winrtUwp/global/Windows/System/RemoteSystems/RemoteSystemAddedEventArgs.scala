package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemAdded event, namely the RemoteSystem that was added. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemAddedEventArgs")
@js.native
abstract class RemoteSystemAddedEventArgs ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAddedEventArgs {
  /** The RemoteSystem object representing the device that was added to the set of discoverable devices, causing the containing RemoteSystemAdded event to be raised. */
  /* CompleteClass */
  override var remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem = js.native
}

