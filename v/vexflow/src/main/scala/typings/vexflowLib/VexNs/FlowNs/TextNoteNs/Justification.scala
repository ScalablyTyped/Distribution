package typings
package vexflowLib.VexNs.FlowNs.TextNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Justification extends js.Object

@JSGlobal("Vex.Flow.TextNote.Justification")
@js.native
object Justification extends js.Object {
  @js.native
  sealed trait CENTER
    extends vexflowLib.VexNs.FlowNs.TextNoteNs.Justification
  
  @js.native
  sealed trait LEFT
    extends vexflowLib.VexNs.FlowNs.TextNoteNs.Justification
  
  @js.native
  sealed trait RIGHT
    extends vexflowLib.VexNs.FlowNs.TextNoteNs.Justification
  
  val CENTER: CENTER with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.TextNoteNs.Justification with scala.Double] = js.native
}

