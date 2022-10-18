package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyWorkspaceEditParams extends StObject {
  
  /**
    * The edits to apply.
    */
  var edit: WorkspaceEdit
  
  /**
    * An optional label of the workspace edit. This label is
    * presented in the user interface for example on an undo
    * stack to undo the workspace edit.
    */
  var label: js.UndefOr[String] = js.undefined
}
object ApplyWorkspaceEditParams {
  
  inline def apply(edit: WorkspaceEdit): ApplyWorkspaceEditParams = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditParams]
  }
  
  extension [Self <: ApplyWorkspaceEditParams](x: Self) {
    
    inline def setEdit(value: WorkspaceEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
