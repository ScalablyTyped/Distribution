package typings
package vexflowLib.VexNs.FlowNs.ModifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("Vex.Flow.Modifier.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait ABOVE
    extends vexflowLib.VexNs.FlowNs.ModifierNs.Position
  
  @js.native
  sealed trait BELOW
    extends vexflowLib.VexNs.FlowNs.ModifierNs.Position
  
  @js.native
  sealed trait LEFT
    extends vexflowLib.VexNs.FlowNs.ModifierNs.Position
  
  @js.native
  sealed trait RIGHT
    extends vexflowLib.VexNs.FlowNs.ModifierNs.Position
  
  val ABOVE: ABOVE with scala.Double = js.native
  val BELOW: BELOW with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.ModifierNs.Position with scala.Double] = js.native
}

