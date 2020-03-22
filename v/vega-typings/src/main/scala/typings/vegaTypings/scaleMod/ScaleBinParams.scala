package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleBinParams extends _ScaleBins {
  /**
    * The starting (lowest-valued) bin boundary.
    *
    * __Default value:__ The lowest value of the scale domain will be used.
    */
  var start: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The step size defining the bin interval width.
    */
  var step: Double | SignalRef
  /**
    * The stopping (highest-valued) bin boundary.
    *
    * __Default value:__ The highest value of the scale domain will be used.
    *
    */
  var stop: js.UndefOr[Double | SignalRef] = js.undefined
}

object ScaleBinParams {
  @scala.inline
  def apply(step: Double | SignalRef, start: Double | SignalRef = null, stop: Double | SignalRef = null): ScaleBinParams = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleBinParams]
  }
}

