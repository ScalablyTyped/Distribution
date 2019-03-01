package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesQuery extends BaseQuery {
  @JSName("docFormat")
  var docFormat_FilesQuery: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("lineCharPositions")
  var lineCharPositions_FilesQuery: js.UndefOr[scala.Nothing] = js.undefined
  /** Get the files that the server currently holds in its set of analyzed files. */
  @JSName("type")
  var type_FilesQuery: ternLib.ternLibStrings.files
}

object FilesQuery {
  @scala.inline
  def apply(
    `type`: ternLib.ternLibStrings.files,
    docFormat: js.UndefOr[scala.Nothing] = js.undefined,
    lineCharPositions: js.UndefOr[scala.Nothing] = js.undefined
  ): FilesQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(docFormat)) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    __obj.asInstanceOf[FilesQuery]
  }
}

