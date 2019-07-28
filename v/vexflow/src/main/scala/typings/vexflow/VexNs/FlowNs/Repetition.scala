package typings.vexflow.VexNs.FlowNs

import typings.vexflow.VexNs.FlowNs.RepetitionNs.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Repetition")
@js.native
class Repetition protected () extends StaveModifier {
  def this(`type`: `type`, x: Double, y_shift: Double) = this()
  def draw(stave: Stave, x: Double): Repetition = js.native
  def drawCodaFixed(stave: Stave, x: Double): Repetition = js.native
  def drawSignoFixed(stave: Stave, x: Double): Repetition = js.native
   //inconsistent name: drawSignoFixed -> drawSegnoFixed
  def drawSymbolText(stave: Stave, x: Double, text: String, draw_coda: Boolean): Repetition = js.native
  def setShiftX(x: Double): Repetition = js.native
  def setShiftY(y: Double): Repetition = js.native
}

