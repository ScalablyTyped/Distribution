package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.exp
import typings.vegaDashTypings.vegaDashTypingsStrings.linear
import typings.vegaDashTypings.vegaDashTypingsStrings.log
import typings.vegaDashTypings.vegaDashTypingsStrings.poly
import typings.vegaDashTypings.vegaDashTypingsStrings.pow
import typings.vegaDashTypings.vegaDashTypingsStrings.quad
import typings.vegaDashTypings.vegaDashTypingsStrings.regression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegressionTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var extent: js.UndefOr[(js.Tuple2[Double, Double]) | SignalRef] = js.undefined
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.undefined
  var method: js.UndefOr[linear | exp | log | quad | poly | pow | SignalRef] = js.undefined
  var order: js.UndefOr[Double | SignalRef] = js.undefined
  var params: js.UndefOr[Boolean | SignalRef] = js.undefined
  var `type`: regression
  var x: String | TransformField
  var y: String | TransformField
}

object RegressionTransform {
  @scala.inline
  def apply(
    `type`: regression,
    x: String | TransformField,
    y: String | TransformField,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    extent: (js.Tuple2[Double, Double]) | SignalRef = null,
    groupby: (js.Array[String | TransformField]) | SignalRef = null,
    method: linear | exp | log | quad | poly | pow | SignalRef = null,
    order: Double | SignalRef = null,
    params: Boolean | SignalRef = null
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

