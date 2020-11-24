package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceFolders extends js.Object {
  
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.native
}
object WorkspaceFolders {
  
  @scala.inline
  def apply(): WorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolders]
  }
  
  @scala.inline
  implicit class WorkspaceFoldersOps[Self <: WorkspaceFolders] (val x: Self) extends AnyVal {
    
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
    def setWorkspaceFolders(value: Boolean): Self = this.set("workspaceFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceFolders: Self = this.set("workspaceFolders", js.undefined)
  }
}
