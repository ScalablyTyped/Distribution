package typings
package vexflowLib.VexNs.FlowNs.StaveLineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextJustification extends js.Object

@JSGlobal("Vex.Flow.StaveLine.TextJustification")
@js.native
object TextJustification extends js.Object {
  @js.native
  sealed trait CENTER
    extends vexflowLib.VexNs.FlowNs.StaveLineNs.TextJustification
  
  @js.native
  sealed trait LEFT
    extends vexflowLib.VexNs.FlowNs.StaveLineNs.TextJustification
  
  @js.native
  sealed trait RIGHT
    extends vexflowLib.VexNs.FlowNs.StaveLineNs.TextJustification
  
  val CENTER: CENTER with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.StaveLineNs.TextJustification with scala.Double] = js.native
}

