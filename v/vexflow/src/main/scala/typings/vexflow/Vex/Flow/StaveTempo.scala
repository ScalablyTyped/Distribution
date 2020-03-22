package typings.vexflow.Vex.Flow

import typings.vexflow.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveTempo")
@js.native
class StaveTempo protected () extends StaveModifier {
  def this(tempo: AnonName, x: Double, shift_y: Double) = this()
  def draw(stave: Stave, shift_x: Double): StaveTempo = js.native
  def setShiftX(x: Double): StaveTempo = js.native
  def setShiftY(y: Double): StaveTempo = js.native
  def setTempo(tempo: AnonName): StaveTempo = js.native
}

