package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use to complete an update asynchronously. */
@JSGlobal("Windows.Storage.Provider.FileUpdateRequestDeferral")
@js.native
abstract class FileUpdateRequestDeferral () extends js.Object {
  /** Signals that the response to a FileUpdateRequested event is finished. */
  def complete(): scala.Unit = js.native
}

