package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.GhostNote")
@js.native
class GhostNote protected () extends StemmableNote {
  def this(duration: java.lang.String) = this()
  def this(note_struct: vexflowLib.Anon_DotsDurationType) = this()
   //inconsistent type: void -> GhostNote
  def addToModifierContext(): GhostNote = js.native
  def draw(): scala.Unit = js.native
  @JSName("setStave")
  def setStave_Unit(stave: Stave): scala.Unit = js.native
}

