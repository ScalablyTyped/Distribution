package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.quantile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantileTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  var field: FieldRef
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var probs: js.UndefOr[js.Array[Double] | SignalRef] = js.undefined
  var step: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: quantile
}

object QuantileTransform {
  @scala.inline
  def apply(
    field: FieldRef,
    `type`: quantile,
    as: (js.Array[String | SignalRef]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    probs: js.Array[Double] | SignalRef = null,
    step: Double | SignalRef = null
  ): QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (probs != null) __obj.updateDynamic("probs")(probs.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileTransform]
  }
}

