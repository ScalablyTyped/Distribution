package typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use to complete an update asynchronously. */
@JSGlobal("Windows.Storage.Provider.FileUpdateRequestDeferral")
@js.native
abstract class FileUpdateRequestDeferral () extends js.Object {
  /** Signals that the response to a FileUpdateRequested event is finished. */
  def complete(): Unit = js.native
}

