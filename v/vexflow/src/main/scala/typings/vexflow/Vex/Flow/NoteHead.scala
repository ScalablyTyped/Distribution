package typings.vexflow.Vex.Flow

import typings.vexflow.AnonCustomglyphcode
import typings.vexflow.AnonFillStyle_
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.NoteHead")
@js.native
class NoteHead protected () extends Note {
  def this(head_options: AnonCustomglyphcode) = this()
  def applyStyle(context: IRenderContext): NoteHead = js.native
  def draw(): Unit = js.native
  def getLine(): Double = js.native
  def getStyle(): AnonFillStyle_ = js.native
  def getY(): Double = js.native
  def isDisplaced(): Boolean = js.native
  def setLine(line: Double): NoteHead = js.native
  def setStyle(style: AnonFillStyle_): NoteHead = js.native
  def setX(x: Double): NoteHead = js.native
  def setY(y: Double): NoteHead = js.native
}

/* static members */
@JSGlobal("Vex.Flow.NoteHead")
@js.native
object NoteHead extends js.Object {
  var DEBUG: Boolean = js.native
}

