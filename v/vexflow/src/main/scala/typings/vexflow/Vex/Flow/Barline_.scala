package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Barline.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Barline")
@js.native
class Barline_ protected () extends StaveModifier {
  def this(`type`: `type`, x: Double) = this()
  def draw(stave: Stave): Unit = js.native
  def draw(stave: Stave, x_shift: Double): Unit = js.native
  def drawRepeatBar(stave: Stave, x: Double, begin: Boolean): Unit = js.native
  def drawVerticalBar(stave: Stave, x: Double): Unit = js.native
  def drawVerticalBar(stave: Stave, x: Double, double_bar: Boolean): Unit = js.native
  def drawVerticalEndBar(stave: Stave, x: Double): Unit = js.native
  def setX(x: Double): Barline = js.native
}

