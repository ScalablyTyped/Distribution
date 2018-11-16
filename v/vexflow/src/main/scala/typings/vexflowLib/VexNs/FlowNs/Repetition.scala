package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Repetition")
@js.native
class Repetition protected () extends StaveModifier {
  def this(`type`: vexflowLib.VexNs.FlowNs.RepetitionNs.`type`, x: scala.Double, y_shift: scala.Double) = this()
  def draw(stave: Stave, x: scala.Double): Repetition = js.native
  def drawCodaFixed(stave: Stave, x: scala.Double): Repetition = js.native
  def drawSignoFixed(stave: Stave, x: scala.Double): Repetition = js.native
   //inconsistent name: drawSignoFixed -> drawSegnoFixed
  def drawSymbolText(stave: Stave, x: scala.Double, text: java.lang.String, draw_coda: scala.Boolean): Repetition = js.native
  def setShiftX(x: scala.Double): Repetition = js.native
  def setShiftY(y: scala.Double): Repetition = js.native
}

