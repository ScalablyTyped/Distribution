package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeAction {
  
  @JSImport("vscode-languageserver", "CodeAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param kind The kind of the code action.
    */
  inline def create(title: String): typings.vscodeLanguageserverTypes.mod.CodeAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeAction]
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  inline def create(title: String, command: typings.vscodeLanguageserverTypes.mod.Command): typings.vscodeLanguageserverTypes.mod.CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeAction]
  inline def create(
    title: String,
    command: typings.vscodeLanguageserverTypes.mod.Command,
    kind: typings.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typings.vscodeLanguageserverTypes.mod.CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], command.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeAction]
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param edit The edit to perform.
    * @param kind The kind of the code action.
    */
  inline def create(title: String, edit: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit): typings.vscodeLanguageserverTypes.mod.CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], edit.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeAction]
  inline def create(
    title: String,
    edit: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit,
    kind: typings.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typings.vscodeLanguageserverTypes.mod.CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], edit.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeAction]
  inline def create(title: String, kind: typings.vscodeLanguageserverTypes.mod.CodeActionKind): typings.vscodeLanguageserverTypes.mod.CodeAction = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeAction]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean]
}
