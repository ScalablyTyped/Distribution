package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TextBracket")
@js.native
class TextBracket protected () extends js.Object {
  def this(bracket_data: vexflowLib.Anon_Position) = this()
  def applyStyle(context: vexflowLib.VexNs.IRenderContext): TextBracket = js.native
  def draw(): scala.Unit = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): TextBracket = js.native
  def setDashed(dashed: scala.Boolean): TextBracket = js.native
  def setDashed(dashed: scala.Boolean, dash: js.Array[scala.Double]): TextBracket = js.native
  def setFont(font: vexflowLib.Anon_FamilySize): TextBracket = js.native
  def setLine(line: scala.Double): TextBracket = js.native
}

@JSGlobal("Vex.Flow.TextBracket")
@js.native
object TextBracket extends js.Object {
  var DEBUG: scala.Boolean = js.native
}

