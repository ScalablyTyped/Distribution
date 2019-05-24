package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegressionTransform extends _Transforms {
  var as: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var extent: js.UndefOr[
    (js.Tuple2[scala.Double, scala.Double]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var groupby: js.UndefOr[
    (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var method: js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.linear | vegaDashTypingsLib.vegaDashTypingsLibStrings.exp | vegaDashTypingsLib.vegaDashTypingsLibStrings.log | vegaDashTypingsLib.vegaDashTypingsLibStrings.quad | vegaDashTypingsLib.vegaDashTypingsLibStrings.poly | vegaDashTypingsLib.vegaDashTypingsLibStrings.pow | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var order: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var params: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.regression
  var x: java.lang.String | TransformField
  var y: java.lang.String | TransformField
}

object RegressionTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.regression,
    x: java.lang.String | TransformField,
    y: java.lang.String | TransformField,
    as: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    extent: (js.Tuple2[scala.Double, scala.Double]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    groupby: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    method: vegaDashTypingsLib.vegaDashTypingsLibStrings.linear | vegaDashTypingsLib.vegaDashTypingsLibStrings.exp | vegaDashTypingsLib.vegaDashTypingsLibStrings.log | vegaDashTypingsLib.vegaDashTypingsLibStrings.quad | vegaDashTypingsLib.vegaDashTypingsLibStrings.poly | vegaDashTypingsLib.vegaDashTypingsLibStrings.pow | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    order: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    params: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegressionTransform]
  }
}

