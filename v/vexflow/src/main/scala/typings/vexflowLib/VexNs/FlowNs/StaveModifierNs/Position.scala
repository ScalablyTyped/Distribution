package typings
package vexflowLib.VexNs.FlowNs.StaveModifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

// @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
@JSGlobal("Vex.Flow.StaveModifier.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait ABOVE
    extends vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  
  @js.native
  sealed trait BEGIN
    extends vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  
  @js.native
  sealed trait BELOW
    extends vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  
  @js.native
  sealed trait END
    extends vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  
  @js.native
  sealed trait LEFT
    extends vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  
  @js.native
  sealed trait RIGHT
    extends vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  
  /* 3 */ val ABOVE: ABOVE with scala.Double = js.native
  /* 5 */ val BEGIN: BEGIN with scala.Double = js.native
  /* 4 */ val BELOW: BELOW with scala.Double = js.native
  /* 6 */ val END: END with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.StaveModifierNs.Position with scala.Double] = js.native
}

