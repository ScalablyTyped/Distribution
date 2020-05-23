package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Renderer.LineEndType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringNumber extends Modifier {
  var string_number: Double | String = js.native
  def setDashed(dashed: Boolean): StringNumber = js.native
  def setLastNote(note: StemmableNote): StringNumber = js.native
  def setLineEndType(leg: LineEndType): StringNumber = js.native
  def setNote(note: StemmableNote): StringNumber = js.native
  def setOffsetX(x: Double): StringNumber = js.native
  def setOffsetY(y: Double): StringNumber = js.native
  def setStringNumber(number: Double): StringNumber = js.native
}

