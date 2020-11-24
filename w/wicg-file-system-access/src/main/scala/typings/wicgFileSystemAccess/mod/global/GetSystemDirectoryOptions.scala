package typings.wicgFileSystemAccess.mod.global

import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.sandbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemDirectoryOptions extends js.Object {
  
  var `type`: sandbox = js.native
}
object GetSystemDirectoryOptions {
  
  @scala.inline
  def apply(`type`: sandbox): GetSystemDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemDirectoryOptions]
  }
  
  @scala.inline
  implicit class GetSystemDirectoryOptionsOps[Self <: GetSystemDirectoryOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: sandbox): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
