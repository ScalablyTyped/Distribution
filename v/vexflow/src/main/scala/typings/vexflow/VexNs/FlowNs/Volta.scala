package typings.vexflow.VexNs.FlowNs

import typings.vexflow.VexNs.FlowNs.VoltaNs.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Volta")
@js.native
class Volta protected () extends StaveModifier {
  def this(`type`: `type`, number: Double, x: Double, y_shift: Double) = this()
  def draw(stave: Stave, x: Double): Volta = js.native
  def setShiftY(y: Double): Volta = js.native
}

