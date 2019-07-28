package typings.vexflow.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveSection")
@js.native
class StaveSection protected () extends Modifier {
  def this(section: String, x: Double, shift_y: Double) = this()
  def draw(stave: Stave, shift_x: Double): StaveSection = js.native
  def setShiftX(x: Double): StaveSection = js.native
  def setShiftY(y: Double): StaveSection = js.native
  def setStaveSection(section: String): StaveSection = js.native
}

