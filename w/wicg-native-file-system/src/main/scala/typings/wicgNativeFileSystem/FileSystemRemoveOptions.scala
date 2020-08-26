package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemRemoveOptions extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.native
}

object FileSystemRemoveOptions {
  @scala.inline
  def apply(): FileSystemRemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemRemoveOptions]
  }
  @scala.inline
  implicit class FileSystemRemoveOptionsOps[Self <: FileSystemRemoveOptions] (val x: Self) extends AnyVal {
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
  
}

