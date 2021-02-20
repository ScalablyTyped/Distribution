package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeAction extends StObject {
  
  /** Text changes to apply to each file as part of the code action */
  var changes: js.Array[FileTextChanges] = js.native
  
  /**
    * If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
    * This allows the language service to have side effects (e.g. installing dependencies) upon a code fix.
    */
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.native
  
  /** Description of the code action to display in the UI of the editor */
  var description: java.lang.String = js.native
}
object CodeAction {
  
  @scala.inline
  def apply(changes: js.Array[FileTextChanges], description: java.lang.String): CodeAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
  
  @scala.inline
  implicit class CodeActionMutableBuilder[Self <: CodeAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[FileTextChanges]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: FileTextChanges*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[CodeActionCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    @scala.inline
    def setCommandsVarargs(value: CodeActionCommand*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
