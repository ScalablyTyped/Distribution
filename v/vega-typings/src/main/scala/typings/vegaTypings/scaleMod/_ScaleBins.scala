package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
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
  def ScaleBinParams(step: Double | SignalRef): _ScaleBins = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ScaleBins]
  }
}

