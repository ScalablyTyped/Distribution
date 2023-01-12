package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.anon.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeAction extends StObject {
  
  /**
    * A command this code action executes. If a code action
    * provides an edit and a command, first the edit is
    * executed and then the command.
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * A data entry field that is preserved on a code action between
    * a `textDocument/codeAction` and a `codeAction/resolve` request.
    *
    * @since 3.16.0
    */
  var data: js.UndefOr[LSPAny] = js.undefined
  
  /**
    * The diagnostics that this code action resolves.
    */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  
  /**
    * Marks that the code action cannot currently be applied.
    *
    * Clients should follow the following guidelines regarding disabled code actions:
    *
    *   - Disabled code actions are not shown in automatic [lightbulbs](https://code.visualstudio.com/docs/editor/editingevolved#_code-action)
    *     code action menus.
    *
    *   - Disabled actions are shown as faded out in the code action menu when the user requests a more specific type
    *     of code action, such as refactorings.
    *
    *   - If the user has a [keybinding](https://code.visualstudio.com/docs/editor/refactoring#_keybindings-for-code-actions)
    *     that auto applies a code action and only disabled code actions are returned, the client should show the user an
    *     error message with `reason` in the editor.
    *
    * @since 3.16.0
    */
  var disabled: js.UndefOr[Reason] = js.undefined
  
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
  
  inline def apply(title: String): CodeAction = {
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
    * @param kind The kind of the code action.
    */
  inline def create(title: String): CodeAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any]).asInstanceOf[CodeAction]
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  inline def create(title: String, command: Command): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  inline def create(title: String, command: Command, kind: CodeActionKind): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param edit The edit to perform.
    * @param kind The kind of the code action.
    */
  inline def create(title: String, edit: WorkspaceEdit): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], edit.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  inline def create(title: String, edit: WorkspaceEdit, kind: CodeActionKind): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], edit.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  inline def create(title: String, kind: CodeActionKind): CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[CodeAction]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeAction] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setData(value: LSPAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setDisabled(value: Reason): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEdit(value: WorkspaceEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    inline def setKind(value: CodeActionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
