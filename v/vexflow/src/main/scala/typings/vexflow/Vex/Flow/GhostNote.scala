package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostNote extends StemmableNote {
   //inconsistent type: void -> GhostNote
  def addToModifierContext(): GhostNote = js.native
  def draw(): Unit = js.native
  @JSName("setStave")
  def setStave_Unit(stave: Stave): Unit = js.native
}

