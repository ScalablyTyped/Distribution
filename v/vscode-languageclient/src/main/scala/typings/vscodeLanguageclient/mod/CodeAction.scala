package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeAction {
  
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  @JSImport("vscode-languageclient", "CodeAction.create")
  @js.native
  def create(title: String, command: typings.vscodeLanguageserverTypes.mod.Command): typings.vscodeLanguageserverTypes.mod.CodeAction = js.native
  @JSImport("vscode-languageclient", "CodeAction.create")
  @js.native
  def create(
    title: String,
    command: typings.vscodeLanguageserverTypes.mod.Command,
    kind: typings.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typings.vscodeLanguageserverTypes.mod.CodeAction = js.native
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  @JSImport("vscode-languageclient", "CodeAction.create")
  @js.native
  def create(title: String, edit: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit): typings.vscodeLanguageserverTypes.mod.CodeAction = js.native
  @JSImport("vscode-languageclient", "CodeAction.create")
  @js.native
  def create(
    title: String,
    edit: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit,
    kind: typings.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typings.vscodeLanguageserverTypes.mod.CodeAction = js.native
  
  @JSImport("vscode-languageclient", "CodeAction.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = js.native
}
