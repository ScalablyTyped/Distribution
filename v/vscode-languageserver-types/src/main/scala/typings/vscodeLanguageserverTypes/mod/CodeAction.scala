package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeAction extends StObject {
  
  /**
    * A command this code action executes. If a code action
    * provides a edit and a command, first the edit is
    * executed and then the command.
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * The diagnostics that this code action resolves.
    */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  
  /**
    * The workspace edit this code action performs.
    */
  var edit: js.UndefOr[WorkspaceEdit] = js.undefined
  
  /**
    * Marks this as a preferred action. Preferred actions are used by the `auto fix` command and can be targeted
    * by keybindings.
    *
    * A quick fix should be marked preferred if it properly addresses the underlying error.
    * A refactoring should be marked preferred if it is the most reasonable choice of actions to take.
    *
    * @since 3.15.0
    */
  var isPreferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The kind of the code action.
    *
    * Used to filter code actions.
    */
  var kind: js.UndefOr[CodeActionKind] = js.undefined
  
  /**
    * A short, human-readable, title for this code action.
    */
  var title: String
}
object CodeAction {
  
  @scala.inline
  def apply(title: String): CodeAction = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
  
  @JSImport("vscode-languageserver-types", "CodeAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  @scala.inline
  def create(title: String, command: Command): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  @scala.inline
  def create(title: String, command: Command, kind: CodeActionKind): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  @scala.inline
  def create(title: String, edit: WorkspaceEdit): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], edit.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  @scala.inline
  def create(title: String, edit: WorkspaceEdit, kind: CodeActionKind): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], edit.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean]
  
  @scala.inline
  implicit class CodeActionMutableBuilder[Self <: CodeAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setEdit(value: WorkspaceEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    @scala.inline
    def setKind(value: CodeActionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
