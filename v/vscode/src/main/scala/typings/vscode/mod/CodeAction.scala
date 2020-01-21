package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "CodeAction")
@js.native
class CodeAction protected () extends js.Object {
  /**
  		 * Creates a new code action.
  		 *
  		 * A code action must have at least a [title](#CodeAction.title) and [edits](#CodeAction.edit)
  		 * and/or a [command](#CodeAction.command).
  		 *
  		 * @param title The title of the code action.
  		 * @param kind The kind of the code action.
  		 */
  def this(title: String) = this()
  def this(title: String, kind: CodeActionKind) = this()
  /**
  		 * A [command](#Command) this code action executes.
  		 */
  var command: js.UndefOr[Command] = js.native
  /**
  		 * [Diagnostics](#Diagnostic) that this code action resolves.
  		 */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  /**
  		 * A [workspace edit](#WorkspaceEdit) this code action performs.
  		 */
  var edit: js.UndefOr[WorkspaceEdit] = js.native
  /**
  		 * Marks this as a preferred action. Preferred actions are used by the `auto fix` command and can be targeted
  		 * by keybindings.
  		 *
  		 * A quick fix should be marked preferred if it properly addresses the underlying error.
  		 * A refactoring should be marked preferred if it is the most reasonable choice of actions to take.
  		 */
  var isPreferred: js.UndefOr[Boolean] = js.native
  /**
  		 * [Kind](#CodeActionKind) of the code action.
  		 *
  		 * Used to filter code actions.
  		 */
  var kind: js.UndefOr[CodeActionKind] = js.native
  /**
  		 * A short, human-readable, title for this code action.
  		 */
  var title: String = js.native
}

