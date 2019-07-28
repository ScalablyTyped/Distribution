package typings.tern.libTernMod

import typings.tern.ternStrings.full
import typings.tern.ternStrings.refs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefsQuery extends BaseQueryWithFile {
  /** Specify the location of the expression. */
  var end: Double | Position
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  /** Used to find all references to a given variable or property. */
  @JSName("type")
  var type_RefsQuery: refs
}

object RefsQuery {
  @scala.inline
  def apply(
    end: Double | Position,
    file: String,
    `type`: refs,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file)
    __obj.updateDynamic("type")(`type`)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQuery]
  }
}

