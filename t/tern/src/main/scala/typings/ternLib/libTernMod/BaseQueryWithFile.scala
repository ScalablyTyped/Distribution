package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQueryWithFile extends BaseQuery {
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: java.lang.String
}

object BaseQueryWithFile {
  @scala.inline
  def apply(
    file: java.lang.String,
    `type`: java.lang.String,
    docFormat: ternLib.ternLibStrings.full = null,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseQueryWithFile = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("file")(file)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    __obj.asInstanceOf[BaseQueryWithFile]
  }
}

