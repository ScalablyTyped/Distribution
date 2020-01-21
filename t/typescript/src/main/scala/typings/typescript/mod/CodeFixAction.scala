package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeFixAction extends CodeAction {
  var fixAllDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If present, one may call 'getCombinedCodeFix' with this fixId.
    * This may be omitted to indicate that the code fix can't be applied in a group.
    */
  var fixId: js.UndefOr[js.Object] = js.undefined
  /** Short name to identify the fix, for use by telemetry. */
  var fixName: java.lang.String
}

object CodeFixAction {
  @scala.inline
  def apply(
    changes: js.Array[FileTextChanges],
    description: java.lang.String,
    fixName: java.lang.String,
    commands: js.Array[CodeActionCommand] = null,
    fixAllDescription: java.lang.String = null,
    fixId: js.Object = null
  ): CodeFixAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixName = fixName.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (fixAllDescription != null) __obj.updateDynamic("fixAllDescription")(fixAllDescription.asInstanceOf[js.Any])
    if (fixId != null) __obj.updateDynamic("fixId")(fixId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFixAction]
  }
}

