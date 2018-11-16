package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.PedalMarking")
@js.native
class PedalMarking protected () extends js.Object {
  def this(notes: js.Array[Note]) = this()
  def draw(): scala.Unit = js.native
  def drawBracketed(): scala.Unit = js.native
  def drawText(): scala.Unit = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): PedalMarking = js.native
  def setCustomText(): PedalMarking = js.native
  def setCustomText(depress: java.lang.String): PedalMarking = js.native
  def setCustomText(depress: java.lang.String, release: java.lang.String): PedalMarking = js.native
  def setLine(line: scala.Double): PedalMarking = js.native
  def setStyle(style: vexflowLib.VexNs.FlowNs.PedalMarkingNs.Styles): PedalMarking = js.native
}

@JSGlobal("Vex.Flow.PedalMarking")
@js.native
object PedalMarking extends js.Object {
   //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
  var DEBUG: scala.Boolean = js.native
  def createSostenuto(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.PedalMarking = js.native
  def createSustain(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.PedalMarking = js.native
  def createUnaCorda(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.PedalMarking = js.native
}

