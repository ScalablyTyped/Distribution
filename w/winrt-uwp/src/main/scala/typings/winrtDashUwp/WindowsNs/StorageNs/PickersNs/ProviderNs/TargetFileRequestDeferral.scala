package typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
@JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestDeferral")
@js.native
abstract class TargetFileRequestDeferral () extends js.Object {
  /** Signals that the app providing the save location finished responding to a targetfilerequested event. */
  def complete(): Unit = js.native
}

