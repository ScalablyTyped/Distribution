package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemGetDirectoryOptions extends js.Object {
  var create: js.UndefOr[Boolean] = js.native
}

object FileSystemGetDirectoryOptions {
  @scala.inline
  def apply(): FileSystemGetDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemGetDirectoryOptions]
  }
  @scala.inline
  implicit class FileSystemGetDirectoryOptionsOps[Self <: FileSystemGetDirectoryOptions] (val x: Self) extends AnyVal {
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
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
  }
  
}

