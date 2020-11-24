package typings.wicgFileSystemAccess.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemGetFileOptions extends js.Object {
  
  var create: js.UndefOr[Boolean] = js.native
}
object FileSystemGetFileOptions {
  
  @scala.inline
  def apply(): FileSystemGetFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemGetFileOptions]
  }
  
  @scala.inline
  implicit class FileSystemGetFileOptionsOps[Self <: FileSystemGetFileOptions] (val x: Self) extends AnyVal {
    
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
