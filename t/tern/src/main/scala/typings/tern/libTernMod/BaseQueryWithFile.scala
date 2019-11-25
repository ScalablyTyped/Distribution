package typings.tern.libTernMod

import typings.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQueryWithFile extends BaseQuery {
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: String
}

object BaseQueryWithFile {
  @scala.inline
  def apply(
    file: String,
    `type`: String,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined
  ): BaseQueryWithFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQueryWithFile]
  }
}

