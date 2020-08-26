package typings.wicgNativeFileSystem

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePickerAcceptType extends js.Object {
  var accept: Record[String, js.Array[String]] = js.native
  var description: js.UndefOr[String] = js.native
}

object FilePickerAcceptType {
  @scala.inline
  def apply(accept: Record[String, js.Array[String]]): FilePickerAcceptType = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerAcceptType]
  }
  @scala.inline
  implicit class FilePickerAcceptTypeOps[Self <: FilePickerAcceptType] (val x: Self) extends AnyVal {
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
    def setAccept(value: Record[String, js.Array[String]]): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

