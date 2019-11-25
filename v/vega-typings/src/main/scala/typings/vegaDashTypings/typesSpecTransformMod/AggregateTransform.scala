package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.aggregate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  var cross: js.UndefOr[Boolean | SignalRef] = js.undefined
  var drop: js.UndefOr[Boolean | SignalRef] = js.undefined
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.undefined
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var key: js.UndefOr[String | TransformField] = js.undefined
  var ops: js.UndefOr[(js.Array[AggregateOp | SignalRef]) | SignalRef] = js.undefined
  var signal: js.UndefOr[String] = js.undefined
  var `type`: aggregate
}

object AggregateTransform {
  @scala.inline
  def apply(
    `type`: aggregate,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    cross: Boolean | SignalRef = null,
    drop: Boolean | SignalRef = null,
    fields: (js.Array[FieldRef | Null]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    key: String | TransformField = null,
    ops: (js.Array[AggregateOp | SignalRef]) | SignalRef = null,
    signal: String = null
  ): AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (cross != null) __obj.updateDynamic("cross")(cross.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateTransform]
  }
}

