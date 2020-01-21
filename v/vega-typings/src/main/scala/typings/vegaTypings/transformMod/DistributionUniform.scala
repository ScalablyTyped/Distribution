package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionUniform extends Distribution {
  var function: uniform
  var max: js.UndefOr[Double | SignalRef] = js.undefined
  var min: js.UndefOr[Double | SignalRef] = js.undefined
}

object DistributionUniform {
  @scala.inline
  def apply(function: uniform, max: Double | SignalRef = null, min: Double | SignalRef = null): DistributionUniform = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionUniform]
  }
}

