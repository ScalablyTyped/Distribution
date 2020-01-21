package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionNormal extends Distribution {
  var function: normal
  var mean: js.UndefOr[Double | SignalRef] = js.undefined
  var stdev: js.UndefOr[Double | SignalRef] = js.undefined
}

object DistributionNormal {
  @scala.inline
  def apply(function: normal, mean: Double | SignalRef = null, stdev: Double | SignalRef = null): DistributionNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (stdev != null) __obj.updateDynamic("stdev")(stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionNormal]
  }
}

