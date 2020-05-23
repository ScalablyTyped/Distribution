package typings.tern.ternMod

import typings.tern.ternStrings.files
import typings.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesQuery
  extends BaseQuery
     with Query {
  /** Get the files that the server currently holds in its set of analyzed files. */
  @JSName("type")
  var type_FilesQuery: files
}

object FilesQuery {
  @scala.inline
  def apply(`type`: files, docFormat: full = null, lineCharPositions: js.UndefOr[Boolean] = js.undefined): FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesQuery]
  }
}

