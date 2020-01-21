package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.mixture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionMixture extends Distribution {
  var distributions: js.UndefOr[(js.Array[Distribution | SignalRef]) | SignalRef] = js.undefined
  var field: String | TransformField
  var function: mixture
  var weights: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
}

object DistributionMixture {
  @scala.inline
  def apply(
    field: String | TransformField,
    function: mixture,
    distributions: (js.Array[Distribution | SignalRef]) | SignalRef = null,
    weights: (js.Array[Double | SignalRef]) | SignalRef = null
  ): DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionMixture]
  }
}

