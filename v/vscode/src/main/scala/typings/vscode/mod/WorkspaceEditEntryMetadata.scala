package typings.vscode.mod

import typings.vscode.anon.Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceEditEntryMetadata extends js.Object {
  
  /**
    * A human-readable string which is rendered less prominent on the same line.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The icon path or [ThemeIcon](#ThemeIcon) for the edit.
    */
  var iconPath: js.UndefOr[Uri | Dark | ThemeIcon] = js.native
  
  /**
    * A human-readable string which is rendered prominent.
    */
  var label: String = js.native
  
  /**
    * A flag which indicates that user confirmation is needed.
    */
  var needsConfirmation: Boolean = js.native
}
object WorkspaceEditEntryMetadata {
  
  @scala.inline
  def apply(label: String, needsConfirmation: Boolean): WorkspaceEditEntryMetadata = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], needsConfirmation = needsConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEditEntryMetadata]
  }
  
  @scala.inline
  implicit class WorkspaceEditEntryMetadataOps[Self <: WorkspaceEditEntryMetadata] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsConfirmation(value: Boolean): Self = this.set("needsConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIconPath(value: Uri | Dark | ThemeIcon): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
  }
}
