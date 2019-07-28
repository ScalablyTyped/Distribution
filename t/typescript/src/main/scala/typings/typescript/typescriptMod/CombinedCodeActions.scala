package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinedCodeActions extends js.Object {
  var changes: js.Array[FileTextChanges]
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.undefined
}

object CombinedCodeActions {
  @scala.inline
  def apply(changes: js.Array[FileTextChanges], commands: js.Array[CodeActionCommand] = null): CombinedCodeActions = {
    val __obj = js.Dynamic.literal(changes = changes)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    __obj.asInstanceOf[CombinedCodeActions]
  }
}

