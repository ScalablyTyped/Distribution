package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinAggregateTransform extends _Transforms {
  var as: js.UndefOr[
    (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var fields: js.UndefOr[
    (js.Array[java.lang.String | TransformField | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var groupby: js.UndefOr[
    (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var ops: js.UndefOr[js.Array[AggregateOp | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.joinaggregate
}

object JoinAggregateTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.joinaggregate,
    as: (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    fields: (js.Array[java.lang.String | TransformField | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    groupby: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    ops: js.Array[AggregateOp | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = null
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

