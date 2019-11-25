package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ScaleBins extends js.Object

object _ScaleBins {
  @scala.inline
  def SignalRef(signal: String): _ScaleBins = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ScaleBins]
  }
  @scala.inline
  def Anon_Start(step: Double | SignalRef, start: Double | SignalRef = null, stop: Double | SignalRef = null): _ScaleBins = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ScaleBins]
  }
}

