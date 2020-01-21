package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeAction extends js.Object {
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

@JSImport("vscode-languageserver-types", "CodeAction")
@js.native
object CodeAction extends js.Object {
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(title: String, command: Command): CodeAction = js.native
  def create(title: String, command: Command, kind: CodeActionKind): CodeAction = js.native
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(title: String, edit: WorkspaceEdit): CodeAction = js.native
  def create(title: String, edit: WorkspaceEdit, kind: CodeActionKind): CodeAction = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = js.native
}

