package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field
  extends vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSortField {
  var field: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgFieldRef] = js.undefined
  var op: vegaDashTypingsLib.typesSpecTransformMod.AggregateOp
  var order: js.UndefOr[vegaDashLiteLib.buildSrcSortMod.SortOrder] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(
    op: vegaDashTypingsLib.typesSpecTransformMod.AggregateOp,
    field: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgFieldRef = null,
    order: vegaDashLiteLib.buildSrcSortMod.SortOrder = null
  ): Anon_Field = {
    val __obj = js.Dynamic.literal(op = op)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Field]
  }
}

