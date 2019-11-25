package typings.tern.libTernMod

import typings.tern.ternStrings.documentation
import typings.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationQuery extends BaseQueryWithFile {
  /** Specify the location of the expression. */
  var end: Double | Position
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  /** Get the documentation string and URL for a given expression, if any. */
  @JSName("type")
  var type_DocumentationQuery: documentation
}

object DocumentationQuery {
  @scala.inline
  def apply(
    end: Double | Position,
    file: String,
    `type`: documentation,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationQuery]
  }
}

