package typings.wicgFileSystemAccess.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemCreateWritableOptions extends js.Object {
  
  var keepExistingData: js.UndefOr[Boolean] = js.native
}
object FileSystemCreateWritableOptions {
  
  @scala.inline
  def apply(): FileSystemCreateWritableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemCreateWritableOptions]
  }
  
  @scala.inline
  implicit class FileSystemCreateWritableOptionsOps[Self <: FileSystemCreateWritableOptions] (val x: Self) extends AnyVal {
    
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
    def setKeepExistingData(value: Boolean): Self = this.set("keepExistingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepExistingData: Self = this.set("keepExistingData", js.undefined)
  }
}
