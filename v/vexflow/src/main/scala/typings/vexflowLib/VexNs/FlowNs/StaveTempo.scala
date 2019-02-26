package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveTempo")
@js.native
class StaveTempo protected () extends StaveModifier {
  def this(tempo: vexflowLib.Anon_BpmDots, x: scala.Double, shift_y: scala.Double) = this()
  def draw(stave: Stave, shift_x: scala.Double): StaveTempo = js.native
  def setShiftX(x: scala.Double): StaveTempo = js.native
  def setShiftY(y: scala.Double): StaveTempo = js.native
  def setTempo(tempo: vexflowLib.Anon_BpmDots): StaveTempo = js.native
}

