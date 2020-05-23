package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of edits to make in response to a refactor action, plus an optional
  * location where renaming should be invoked from
  */
trait RefactorEditInfo extends js.Object {
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.undefined
  var edits: js.Array[FileTextChanges]
  var renameFilename: js.UndefOr[java.lang.String] = js.undefined
  var renameLocation: js.UndefOr[Double] = js.undefined
}

object RefactorEditInfo {
  @scala.inline
  def apply(
    edits: js.Array[FileTextChanges],
    commands: js.Array[CodeActionCommand] = null,
    renameFilename: java.lang.String = null,
    renameLocation: js.UndefOr[Double] = js.undefined
  ): RefactorEditInfo = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (renameFilename != null) __obj.updateDynamic("renameFilename")(renameFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(renameLocation)) __obj.updateDynamic("renameLocation")(renameLocation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorEditInfo]
  }
}

