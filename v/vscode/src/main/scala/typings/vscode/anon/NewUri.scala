package typings.vscode.anon

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewUri extends js.Object {
  
  var newUri: Uri = js.native
  
  var oldUri: Uri = js.native
}
object NewUri {
  
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri): NewUri = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewUri]
  }
  
  @scala.inline
  implicit class NewUriOps[Self <: NewUri] (val x: Self) extends AnyVal {
    
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
    def setNewUri(value: Uri): Self = this.set("newUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldUri(value: Uri): Self = this.set("oldUri", value.asInstanceOf[js.Any])
  }
}
