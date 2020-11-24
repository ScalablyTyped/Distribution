package typings.wicgFileSystemAccess.mod.global

import typings.std.PermissionDescriptor
import typings.std.PermissionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemPermissionDescriptor extends PermissionDescriptor {
  
  var handle: FileSystemHandle = js.native
  
  var mode: js.UndefOr[FileSystemPermissionMode] = js.native
}
object FileSystemPermissionDescriptor {
  
  @scala.inline
  def apply(handle: FileSystemHandle, name: PermissionName): FileSystemPermissionDescriptor = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPermissionDescriptor]
  }
  
  @scala.inline
  implicit class FileSystemPermissionDescriptorOps[Self <: FileSystemPermissionDescriptor] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: FileSystemHandle): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: FileSystemPermissionMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
