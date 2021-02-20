package typings.vscode.mod

import typings.vscode.anon.Dark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceEditEntryMetadata extends StObject {
  
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
  implicit class WorkspaceEditEntryMetadataMutableBuilder[Self <: WorkspaceEditEntryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIconPath(value: Uri | Dark | ThemeIcon): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsConfirmation(value: Boolean): Self = StObject.set(x, "needsConfirmation", value.asInstanceOf[js.Any])
  }
}
