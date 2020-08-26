package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDeleteEvent extends js.Object {
  /**
    * The files that got deleted.
    */
  val files: js.Array[Uri] = js.native
}

object FileDeleteEvent {
  @scala.inline
  def apply(files: js.Array[Uri]): FileDeleteEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDeleteEvent]
  }
  @scala.inline
  implicit class FileDeleteEventOps[Self <: FileDeleteEvent] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: Uri*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[Uri]): Self = this.set("files", value.asInstanceOf[js.Any])
  }
  
}

