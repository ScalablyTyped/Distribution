package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_FamilySize
import typings.vexflow.Anon_Position
import typings.vexflow.VexNs.FlowNs.TextBracketNs.Positions
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TextBracket")
@js.native
class TextBracket protected () extends js.Object {
  def this(bracket_data: Anon_Position) = this()
  var position: Positions = js.native
  var start: Note = js.native
  var stop: Note = js.native
  def applyStyle(context: IRenderContext): TextBracket = js.native
  def draw(): Unit = js.native
  def setContext(context: IRenderContext): TextBracket = js.native
  def setDashed(dashed: Boolean): TextBracket = js.native
  def setDashed(dashed: Boolean, dash: js.Array[Double]): TextBracket = js.native
  def setFont(font: Anon_FamilySize): TextBracket = js.native
  def setLine(line: Double): TextBracket = js.native
}

/* static members */
@JSGlobal("Vex.Flow.TextBracket")
@js.native
object TextBracket extends js.Object {
  var DEBUG: Boolean = js.native
}

