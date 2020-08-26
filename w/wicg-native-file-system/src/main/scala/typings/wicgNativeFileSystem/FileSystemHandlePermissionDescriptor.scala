package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemHandlePermissionDescriptor extends js.Object {
  var writable: js.UndefOr[Boolean] = js.native
}

object FileSystemHandlePermissionDescriptor {
  @scala.inline
  def apply(): FileSystemHandlePermissionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemHandlePermissionDescriptor]
  }
  @scala.inline
  implicit class FileSystemHandlePermissionDescriptorOps[Self <: FileSystemHandlePermissionDescriptor] (val x: Self) extends AnyVal {
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
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
  
}

