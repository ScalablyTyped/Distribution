package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

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
  def apply(
    title: String,
    command: Command = null,
    diagnostics: js.Array[Diagnostic] = null,
    edit: WorkspaceEdit = null,
    kind: CodeActionKind = null
  ): CodeAction = {
    val __obj = js.Dynamic.literal(title = title)
    if (command != null) __obj.updateDynamic("command")(command)
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CodeAction]
  }
}

