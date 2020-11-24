package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceFolderPickOptions extends js.Object {
  
  /**
    * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional string to show as placeholder in the input box to guide the user what to pick on.
    */
  var placeHolder: js.UndefOr[String] = js.native
}
object WorkspaceFolderPickOptions {
  
  @scala.inline
  def apply(): WorkspaceFolderPickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolderPickOptions]
  }
  
  @scala.inline
  implicit class WorkspaceFolderPickOptionsOps[Self <: WorkspaceFolderPickOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreFocusOut(value: Boolean): Self = this.set("ignoreFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFocusOut: Self = this.set("ignoreFocusOut", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
  }
}
