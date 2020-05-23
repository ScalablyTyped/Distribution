package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about a RemoteSystemUpdated event, namely the RemoteSystem that was updated. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs")
@js.native
abstract class RemoteSystemUpdatedEventArgs ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs {
  /** The RemoteSystem object representing the device in the set of discoverable devices whose properties were updated, causing the containing RemoteSystemUpdated event to be raised. */
  /* CompleteClass */
  override var remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem = js.native
}

