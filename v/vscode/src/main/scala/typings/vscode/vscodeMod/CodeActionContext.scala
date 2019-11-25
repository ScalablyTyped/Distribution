package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionContext extends js.Object {
  /**
  		 * An array of diagnostics.
  		 */
  val diagnostics: js.Array[Diagnostic]
  /**
  		 * Requested kind of actions to return.
  		 *
  		 * Actions not of this kind are filtered out before being shown by the lightbulb.
  		 */
  val only: js.UndefOr[CodeActionKind] = js.undefined
}

object CodeActionContext {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], only: CodeActionKind = null): CodeActionContext = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
}

