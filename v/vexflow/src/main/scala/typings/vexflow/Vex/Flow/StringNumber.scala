package typings.vexflow.Vex.Flow

import typings.vexflow.AnonLeftshift
import typings.vexflow.Vex.Flow.Renderer.LineEndType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StringNumber")
@js.native
class StringNumber protected () extends Modifier {
  def this(number: String) = this()
  // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
  // like it is a string. But from the use of it it might be a number ?!
  def this(number: Double) = this()
  var string_number: Double | String = js.native
  def setDashed(dashed: Boolean): StringNumber = js.native
  def setLastNote(note: StemmableNote): StringNumber = js.native
  def setLineEndType(leg: LineEndType): StringNumber = js.native
  def setNote(note: StemmableNote): StringNumber = js.native
  def setOffsetX(x: Double): StringNumber = js.native
  def setOffsetY(y: Double): StringNumber = js.native
  def setStringNumber(number: Double): StringNumber = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StringNumber")
@js.native
object StringNumber extends js.Object {
  val CATEGORY: String = js.native
  def format(nums: js.Array[StringNumber], state: AnonLeftshift): Boolean = js.native
}

