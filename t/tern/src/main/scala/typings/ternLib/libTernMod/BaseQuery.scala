package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQuery extends js.Object {
  var docFormat: js.UndefOr[ternLib.ternLibStrings.full] = js.undefined
  var lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
}

object BaseQuery {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    docFormat: ternLib.ternLibStrings.full = null,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    __obj.asInstanceOf[BaseQuery]
  }
}

