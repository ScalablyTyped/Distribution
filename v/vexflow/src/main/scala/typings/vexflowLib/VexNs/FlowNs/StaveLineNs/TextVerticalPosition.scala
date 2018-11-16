package typings
package vexflowLib.VexNs.FlowNs.StaveLineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextVerticalPosition extends js.Object

@JSGlobal("Vex.Flow.StaveLine.TextVerticalPosition")
@js.native
object TextVerticalPosition extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends vexflowLib.VexNs.FlowNs.StaveLineNs.TextVerticalPosition
  
  @js.native
  sealed trait TOP
    extends vexflowLib.VexNs.FlowNs.StaveLineNs.TextVerticalPosition
  
  val BOTTOM: BOTTOM with scala.Double = js.native
  /* 1 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.StaveLineNs.TextVerticalPosition with scala.Double] = js.native
}

