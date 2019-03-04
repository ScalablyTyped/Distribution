package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateTransform extends _Transforms {
  var as: js.UndefOr[
    (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var cross: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var drop: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var fields: js.UndefOr[
    (js.Array[java.lang.String | TransformField | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var groupby: js.UndefOr[
    (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var key: js.UndefOr[java.lang.String | TransformField] = js.undefined
  var ops: js.UndefOr[
    (js.Array[AggregateOp | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.aggregate
}

object AggregateTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.aggregate,
    as: (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    cross: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    drop: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    fields: (js.Array[java.lang.String | TransformField | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    groupby: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    key: java.lang.String | TransformField = null,
    ops: (js.Array[AggregateOp | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    signal: java.lang.String = null
  ): AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (cross != null) __obj.updateDynamic("cross")(cross.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[AggregateTransform]
  }
}

