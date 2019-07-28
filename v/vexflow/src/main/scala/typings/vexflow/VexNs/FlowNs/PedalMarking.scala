package typings.vexflow.VexNs.FlowNs

import typings.vexflow.VexNs.FlowNs.PedalMarkingNs.Styles
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.PedalMarking")
@js.native
class PedalMarking protected () extends js.Object {
  def this(notes: js.Array[Note]) = this()
  def draw(): Unit = js.native
  def drawBracketed(): Unit = js.native
  def drawText(): Unit = js.native
  def setContext(context: IRenderContext): PedalMarking = js.native
  def setCustomText(): PedalMarking = js.native
  def setCustomText(depress: String): PedalMarking = js.native
  def setCustomText(depress: String, release: String): PedalMarking = js.native
  def setLine(line: Double): PedalMarking = js.native
  def setStyle(style: Styles): PedalMarking = js.native
}

/* static members */
@JSGlobal("Vex.Flow.PedalMarking")
@js.native
object PedalMarking extends js.Object {
   //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
  var DEBUG: Boolean = js.native
  def createSostenuto(notes: js.Array[Note]): PedalMarking = js.native
  def createSustain(notes: js.Array[Note]): PedalMarking = js.native
  def createUnaCorda(notes: js.Array[Note]): PedalMarking = js.native
}

