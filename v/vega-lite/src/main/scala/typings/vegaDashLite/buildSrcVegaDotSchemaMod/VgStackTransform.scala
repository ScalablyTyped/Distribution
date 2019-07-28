package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.buildSrcStackMod.StackOffset
import typings.vegaDashLite.vegaDashLiteStrings.stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgStackTransform extends VgTransform {
  var as: js.Array[String]
  var field: String
  var groupby: js.Array[String]
  var offset: js.UndefOr[StackOffset] = js.undefined
  var sort: VgSort
  var `type`: stack
}

object VgStackTransform {
  @scala.inline
  def apply(
    as: js.Array[String],
    field: String,
    groupby: js.Array[String],
    sort: VgSort,
    `type`: stack,
    offset: StackOffset = null
  ): VgStackTransform = {
    val __obj = js.Dynamic.literal(as = as, field = field, groupby = groupby, sort = sort)
    __obj.updateDynamic("type")(`type`)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[VgStackTransform]
  }
}

