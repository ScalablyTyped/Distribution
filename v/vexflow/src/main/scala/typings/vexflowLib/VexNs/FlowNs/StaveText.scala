package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveText")
@js.native
class StaveText protected () extends Modifier {
  def this(text: java.lang.String, position: vexflowLib.VexNs.FlowNs.ModifierNs.Position) = this()
  def this(text: java.lang.String, position: vexflowLib.VexNs.FlowNs.ModifierNs.Position, options: vexflowLib.Anon_Justification) = this()
  def draw(stave: Stave): StaveText = js.native
  def setFont(font: vexflowLib.Anon_WeightFamily): scala.Unit = js.native
  def setShiftX(x: scala.Double): StaveText = js.native
  def setShiftY(y: scala.Double): StaveText = js.native
  def setStaveText(text: java.lang.String): StaveText = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
}

