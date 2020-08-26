package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a fileremoved event. */
@js.native
trait FileRemovedEventArgs extends js.Object {
  /** Gets the identifier of the file that the user removed from the list of chosen files in the file picker. This identifier was set by the providing app when it added the files to the list of chosen files. */
  var id: String = js.native
}

object FileRemovedEventArgs {
  @scala.inline
  def apply(id: String): FileRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRemovedEventArgs]
  }
  @scala.inline
  implicit class FileRemovedEventArgsOps[Self <: FileRemovedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

