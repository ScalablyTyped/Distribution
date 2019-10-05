package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.PedalMarking.Styles
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.PedalMarking")
@js.native
class PedalMarking_ protected () extends js.Object {
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

