package typings.tern.libTernMod

import typings.tern.ternStrings.full
import typings.tern.ternStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameQuery extends BaseQueryWithFile {
  /** Specify the location of the variable. */
  var end: Double | Position
  /** The new name of the variable */
  var newName: String
  /** Specify the location of the variable. */
  var start: js.UndefOr[Double | Position] = js.undefined
  /** Rename a variable in a scope-aware way. */
  @JSName("type")
  var type_RenameQuery: rename
}

object RenameQuery {
  @scala.inline
  def apply(
    end: Double | Position,
    file: String,
    newName: String,
    `type`: rename,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file, newName = newName)
    __obj.updateDynamic("type")(`type`)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameQuery]
  }
}

