package typings.vexflow.Vex.Flow

import typings.vexflow.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Crescendo")
@js.native
class Crescendo protected () extends Note {
  def this(note_struct: AnonDuration) = this()
  def draw(): Unit = js.native
  def setDecrescendo(decresc: Boolean): Crescendo = js.native
  def setHeight(height: Double): Crescendo = js.native
  def setLine(line: Double): Crescendo = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Crescendo")
@js.native
object Crescendo extends js.Object {
  var DEBUG: Boolean = js.native
}

