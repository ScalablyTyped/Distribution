package typings.vexflow.Vex.Flow

import typings.vexflow.AnonFamilySize
import typings.vexflow.AnonPosition
import typings.vexflow.Vex.Flow.TextBracket.Positions
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TextBracket")
@js.native
class TextBracket_ protected () extends js.Object {
  def this(bracket_data: AnonPosition) = this()
  var position: Positions = js.native
  var start: Note = js.native
  var stop: Note = js.native
  def applyStyle(context: IRenderContext): TextBracket = js.native
  def draw(): Unit = js.native
  def setContext(context: IRenderContext): TextBracket = js.native
  def setDashed(dashed: Boolean): TextBracket = js.native
  def setDashed(dashed: Boolean, dash: js.Array[Double]): TextBracket = js.native
  def setFont(font: AnonFamilySize): TextBracket = js.native
  def setLine(line: Double): TextBracket = js.native
}

