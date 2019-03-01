package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationQuery extends BaseQueryWithFile {
  /** Specify the location of the expression. */
  var end: scala.Double | Position
  /** Specify the location of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Get the documentation string and URL for a given expression, if any. */
  @JSName("type")
  var type_DocumentationQuery: ternLib.ternLibStrings.documentation
}

object DocumentationQuery {
  @scala.inline
  def apply(
    end: scala.Double | Position,
    file: java.lang.String,
    `type`: ternLib.ternLibStrings.documentation,
    docFormat: ternLib.ternLibStrings.full = null,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Double | Position = null
  ): DocumentationQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("file")(file)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationQuery]
  }
}

