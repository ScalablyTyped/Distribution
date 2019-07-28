package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.aggregate
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgAggregateTransform extends VgTransform {
  var as: js.UndefOr[js.Array[String]] = js.undefined
  var cross: js.UndefOr[Boolean] = js.undefined
  var drop: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[VgFieldRef]] = js.undefined
  var groupby: js.UndefOr[js.Array[VgFieldRef]] = js.undefined
  var ops: js.UndefOr[js.Array[AggregateOp]] = js.undefined
  var `type`: aggregate
}

object VgAggregateTransform {
  @scala.inline
  def apply(
    `type`: aggregate,
    as: js.Array[String] = null,
    cross: js.UndefOr[Boolean] = js.undefined,
    drop: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[VgFieldRef] = null,
    groupby: js.Array[VgFieldRef] = null,
    ops: js.Array[AggregateOp] = null
  ): VgAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(cross)) __obj.updateDynamic("cross")(cross)
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (ops != null) __obj.updateDynamic("ops")(ops)
    __obj.asInstanceOf[VgAggregateTransform]
  }
}

