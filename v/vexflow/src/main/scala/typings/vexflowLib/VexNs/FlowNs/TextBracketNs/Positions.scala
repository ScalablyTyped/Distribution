package typings
package vexflowLib.VexNs.FlowNs.TextBracketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Positions extends js.Object

@JSGlobal("Vex.Flow.TextBracket.Positions")
@js.native
object Positions extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends vexflowLib.VexNs.FlowNs.TextBracketNs.Positions
  
  @js.native
  sealed trait TOP
    extends vexflowLib.VexNs.FlowNs.TextBracketNs.Positions
  
  /* -1 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 1 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.TextBracketNs.Positions with scala.Double] = js.native
}

