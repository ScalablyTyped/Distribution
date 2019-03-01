package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameQuery extends BaseQueryWithFile {
  /** Specify the location of the variable. */
  var end: scala.Double | Position
  /** The new name of the variable */
  var newName: java.lang.String
  /** Specify the location of the variable. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Rename a variable in a scope-aware way. */
  @JSName("type")
  var type_RenameQuery: ternLib.ternLibStrings.rename
}

object RenameQuery {
  @scala.inline
  def apply(
    end: scala.Double | Position,
    file: java.lang.String,
    newName: java.lang.String,
    `type`: ternLib.ternLibStrings.rename,
    docFormat: ternLib.ternLibStrings.full = null,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Double | Position = null
  ): RenameQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("newName")(newName)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameQuery]
  }
}

