package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StringNumber")
@js.native
class StringNumber protected () extends Modifier {
  def this(number: scala.Double) = this()
  def setDashed(dashed: scala.Boolean): StringNumber = js.native
  def setLastNote(note: StemmableNote): StringNumber = js.native
  def setLineEndType(leg: vexflowLib.VexNs.FlowNs.RendererNs.LineEndType): StringNumber = js.native
  def setNote(note: StemmableNote): StringNumber = js.native
  def setOffsetX(x: scala.Double): StringNumber = js.native
  def setOffsetY(y: scala.Double): StringNumber = js.native
  def setStringNumber(number: scala.Double): StringNumber = js.native
}

@JSGlobal("Vex.Flow.StringNumber")
@js.native
object StringNumber extends js.Object {
  def format(nums: js.Array[vexflowLib.VexNs.FlowNs.StringNumber], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
}

