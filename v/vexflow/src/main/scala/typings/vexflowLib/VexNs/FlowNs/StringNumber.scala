package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StringNumber")
@js.native
class StringNumber protected () extends Modifier {
  def this(number: java.lang.String) = this()
  // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
  // like it is a string. But from the use of it it might be a number ?!
  def this(number: scala.Double) = this()
  var string_number: scala.Double | java.lang.String = js.native
  def setDashed(dashed: scala.Boolean): StringNumber = js.native
  def setLastNote(note: StemmableNote): StringNumber = js.native
  def setLineEndType(leg: vexflowLib.VexNs.FlowNs.RendererNs.LineEndType): StringNumber = js.native
  def setNote(note: StemmableNote): StringNumber = js.native
  def setOffsetX(x: scala.Double): StringNumber = js.native
  def setOffsetY(y: scala.Double): StringNumber = js.native
  def setStringNumber(number: scala.Double): StringNumber = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StringNumber")
@js.native
object StringNumber extends js.Object {
  def format(nums: js.Array[vexflowLib.VexNs.FlowNs.StringNumber], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
}

