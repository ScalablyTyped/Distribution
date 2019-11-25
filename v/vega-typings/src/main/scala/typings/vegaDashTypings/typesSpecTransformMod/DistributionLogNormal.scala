package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.lognormal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionLogNormal extends Distribution {
  var function: lognormal
  var mean: js.UndefOr[Double | SignalRef] = js.undefined
  var stdev: js.UndefOr[Double | SignalRef] = js.undefined
}

object DistributionLogNormal {
  @scala.inline
  def apply(function: lognormal, mean: Double | SignalRef = null, stdev: Double | SignalRef = null): DistributionLogNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (stdev != null) __obj.updateDynamic("stdev")(stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionLogNormal]
  }
}

