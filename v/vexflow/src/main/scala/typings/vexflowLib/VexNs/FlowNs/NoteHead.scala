package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.NoteHead")
@js.native
class NoteHead protected () extends Note {
  def this(head_options: vexflowLib.Anon_DurationX) = this()
  def applyStyle(context: vexflowLib.VexNs.IRenderContext): NoteHead = js.native
  def draw(): scala.Unit = js.native
  def getLine(): scala.Double = js.native
  def getStyle(): vexflowLib.Anon_ShadowBlur = js.native
  def getY(): scala.Double = js.native
  def isDisplaced(): scala.Boolean = js.native
  def setLine(line: scala.Double): NoteHead = js.native
  def setStyle(style: vexflowLib.Anon_ShadowBlur): NoteHead = js.native
  def setX(x: scala.Double): NoteHead = js.native
  def setY(y: scala.Double): NoteHead = js.native
}

@JSGlobal("Vex.Flow.NoteHead")
@js.native
object NoteHead extends js.Object {
  var DEBUG: scala.Boolean = js.native
}

