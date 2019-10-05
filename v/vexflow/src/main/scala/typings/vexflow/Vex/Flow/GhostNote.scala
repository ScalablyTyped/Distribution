package typings.vexflow.Vex.Flow

import typings.vexflow.Anon_DotsDurationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.GhostNote")
@js.native
class GhostNote protected () extends StemmableNote {
  def this(duration: String) = this()
  def this(note_struct: Anon_DotsDurationType) = this()
   //inconsistent type: void -> GhostNote
  def addToModifierContext(): GhostNote = js.native
  def draw(): Unit = js.native
  @JSName("setStave")
  def setStave_Unit(stave: Stave): Unit = js.native
}

