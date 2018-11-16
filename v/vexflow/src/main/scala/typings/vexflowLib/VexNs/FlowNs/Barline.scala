package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Barline")
@js.native
class Barline protected () extends StaveModifier {
  def this(`type`: vexflowLib.VexNs.FlowNs.BarlineNs.`type`, x: scala.Double) = this()
  def draw(stave: Stave): scala.Unit = js.native
  def draw(stave: Stave, x_shift: scala.Double): scala.Unit = js.native
  def drawRepeatBar(stave: Stave, x: scala.Double, begin: scala.Boolean): scala.Unit = js.native
  def drawVerticalBar(stave: Stave, x: scala.Double): scala.Unit = js.native
  def drawVerticalBar(stave: Stave, x: scala.Double, double_bar: scala.Boolean): scala.Unit = js.native
  def drawVerticalEndBar(stave: Stave, x: scala.Double): scala.Unit = js.native
  def setX(x: scala.Double): Barline = js.native
}

