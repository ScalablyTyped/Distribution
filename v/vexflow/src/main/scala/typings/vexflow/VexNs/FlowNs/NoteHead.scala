package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Customglyphcode
import typings.vexflow.Anon_FillStyle
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.NoteHead")
@js.native
class NoteHead protected () extends Note {
  def this(head_options: Anon_Customglyphcode) = this()
  def applyStyle(context: IRenderContext): NoteHead = js.native
  def draw(): Unit = js.native
  def getLine(): Double = js.native
  def getStyle(): Anon_FillStyle = js.native
  def getY(): Double = js.native
  def isDisplaced(): Boolean = js.native
  def setLine(line: Double): NoteHead = js.native
  def setStyle(style: Anon_FillStyle): NoteHead = js.native
  def setX(x: Double): NoteHead = js.native
  def setY(y: Double): NoteHead = js.native
}

/* static members */
@JSGlobal("Vex.Flow.NoteHead")
@js.native
object NoteHead extends js.Object {
  var DEBUG: Boolean = js.native
}

