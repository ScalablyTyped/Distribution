package typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a fileremoved event. */
@JSGlobal("Windows.Storage.Pickers.Provider.FileRemovedEventArgs")
@js.native
abstract class FileRemovedEventArgs () extends js.Object {
  /** Gets the identifier of the file that the user removed from the list of chosen files in the file picker. This identifier was set by the providing app when it added the files to the list of chosen files. */
  var id: String = js.native
}

