package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.joinaggregate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinAggregateTransform extends Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.undefined
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var ops: js.UndefOr[(js.Array[AggregateOp | SignalRef]) | SignalRef] = js.undefined
  var `type`: joinaggregate
}

object JoinAggregateTransform {
  @scala.inline
  def apply(
    `type`: joinaggregate,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    fields: (js.Array[FieldRef | Null]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    ops: (js.Array[AggregateOp | SignalRef]) | SignalRef = null
  ): JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinAggregateTransform]
  }
}

