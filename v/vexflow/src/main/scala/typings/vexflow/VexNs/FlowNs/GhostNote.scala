package typings.vexflow.VexNs.FlowNs

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
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
}

