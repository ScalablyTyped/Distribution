package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.joinaggregate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinAggregateTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  var fields: js.UndefOr[(js.Array[String | TransformField | Null]) | SignalRef] = js.undefined
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.undefined
  var ops: js.UndefOr[js.Array[AggregateOp | SignalRef]] = js.undefined
  var `type`: joinaggregate
}

object JoinAggregateTransform {
  @scala.inline
  def apply(
    `type`: joinaggregate,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    fields: (js.Array[String | TransformField | Null]) | SignalRef = null,
    groupby: (js.Array[String | TransformField]) | SignalRef = null,
    ops: js.Array[AggregateOp | SignalRef] = null
  ): JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops)
    __obj.asInstanceOf[JoinAggregateTransform]
  }
}

