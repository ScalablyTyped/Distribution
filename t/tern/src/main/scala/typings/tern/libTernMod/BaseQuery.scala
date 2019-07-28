package typings.tern.libTernMod

import typings.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQuery extends js.Object {
  var docFormat: js.UndefOr[full] = js.undefined
  var lineCharPositions: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object BaseQuery {
  @scala.inline
  def apply(`type`: String, docFormat: full = null, lineCharPositions: js.UndefOr[Boolean] = js.undefined): BaseQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    __obj.asInstanceOf[BaseQuery]
  }
}

