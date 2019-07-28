package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_BpmDots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveTempo")
@js.native
class StaveTempo protected () extends StaveModifier {
  def this(tempo: Anon_BpmDots, x: Double, shift_y: Double) = this()
  def draw(stave: Stave, shift_x: Double): StaveTempo = js.native
  def setShiftX(x: Double): StaveTempo = js.native
  def setShiftY(y: Double): StaveTempo = js.native
  def setTempo(tempo: Anon_BpmDots): StaveTempo = js.native
}

