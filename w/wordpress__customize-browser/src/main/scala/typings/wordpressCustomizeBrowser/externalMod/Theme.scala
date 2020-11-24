package typings.wordpressCustomizeBrowser.externalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends js.Object {
  
  var _canInstall: Boolean = js.native
  
  var _filesystemCredentialsNeeded: Boolean = js.native
  
  var id: String = js.native
  
  var name: String = js.native
}
object Theme {
  
  @scala.inline
  def apply(_canInstall: Boolean, _filesystemCredentialsNeeded: Boolean, id: String, name: String): Theme = {
    val __obj = js.Dynamic.literal(_canInstall = _canInstall.asInstanceOf[js.Any], _filesystemCredentialsNeeded = _filesystemCredentialsNeeded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    
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
    def set_canInstall(value: Boolean): Self = this.set("_canInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_filesystemCredentialsNeeded(value: Boolean): Self = this.set("_filesystemCredentialsNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
