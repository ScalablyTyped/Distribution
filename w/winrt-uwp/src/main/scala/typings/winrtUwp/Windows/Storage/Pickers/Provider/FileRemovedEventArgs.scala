package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a fileremoved event. */
trait FileRemovedEventArgs extends js.Object {
  /** Gets the identifier of the file that the user removed from the list of chosen files in the file picker. This identifier was set by the providing app when it added the files to the list of chosen files. */
  var id: String
}

object FileRemovedEventArgs {
  @scala.inline
  def apply(id: String): FileRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRemovedEventArgs]
  }
}

