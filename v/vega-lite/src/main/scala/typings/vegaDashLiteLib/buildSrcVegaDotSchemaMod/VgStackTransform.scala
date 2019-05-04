package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgStackTransform extends VgTransform {
  var as: js.Array[java.lang.String]
  var field: java.lang.String
  var groupby: js.Array[java.lang.String]
  var offset: js.UndefOr[vegaDashLiteLib.buildSrcStackMod.StackOffset] = js.undefined
  var sort: VgSort
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.stack
}

object VgStackTransform {
  @scala.inline
  def apply(
    as: js.Array[java.lang.String],
    field: java.lang.String,
    groupby: js.Array[java.lang.String],
    sort: VgSort,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.stack,
    offset: vegaDashLiteLib.buildSrcStackMod.StackOffset = null
  ): VgStackTransform = {
    val __obj = js.Dynamic.literal(as = as, field = field, groupby = groupby, sort = sort)
    __obj.updateDynamic("type")(`type`)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[VgStackTransform]
  }
}

