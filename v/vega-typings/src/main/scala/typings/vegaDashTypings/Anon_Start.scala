package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod._ScaleBins
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Start extends _ScaleBins {
  var start: js.UndefOr[Double | SignalRef] = js.undefined
  var step: Double | SignalRef
  var stop: js.UndefOr[Double | SignalRef] = js.undefined
}

object Anon_Start {
  @scala.inline
  def apply(step: Double | SignalRef, start: Double | SignalRef = null, stop: Double | SignalRef = null): Anon_Start = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Start]
  }
}

