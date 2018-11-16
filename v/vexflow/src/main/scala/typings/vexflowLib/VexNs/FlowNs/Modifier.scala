package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Modifier")
@js.native
class Modifier () extends js.Object {
  def alignSubNotesWithNote(subNotes: js.Array[Note], note: Note): scala.Unit = js.native
   //inconsistent type: void -> Modifier
  def draw(): scala.Unit = js.native
  def getCategory(): java.lang.String = js.native
  def getContext(): vexflowLib.VexNs.IRenderContext = js.native
  def getIndex(): scala.Double = js.native
  def getModifierContext(): ModifierContext = js.native
  def getNote(): Note = js.native
  def getPosition(): vexflowLib.VexNs.FlowNs.ModifierNs.Position = js.native
  def getWidth(): scala.Double = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): Modifier = js.native
  def setIndex(index: scala.Double): Modifier = js.native
  def setModifierContext(c: ModifierContext): Modifier = js.native
  def setNote(note: Note): Modifier = js.native
  def setPosition(position: vexflowLib.VexNs.FlowNs.ModifierNs.Position): Modifier = js.native
  def setTextLine(line: scala.Double): Modifier = js.native
  def setWidth(width: scala.Double): Modifier = js.native
  def setXShift(x: scala.Double): scala.Unit = js.native
  def setYShift(y: scala.Double): Modifier = js.native
}

@JSGlobal("Vex.Flow.Modifier")
@js.native
object Modifier extends js.Object {
  var DEBUG: scala.Boolean = js.native
}

