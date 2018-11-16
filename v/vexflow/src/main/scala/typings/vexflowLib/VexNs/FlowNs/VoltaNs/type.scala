package typings
package vexflowLib.VexNs.FlowNs.VoltaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait `type` extends js.Object

@JSGlobal("Vex.Flow.Volta.type")
@js.native
object `type` extends js.Object {
  @js.native
  sealed trait BEGIN
    extends vexflowLib.VexNs.FlowNs.VoltaNs.`type`
  
  @js.native
  sealed trait BEGIN_END
    extends vexflowLib.VexNs.FlowNs.VoltaNs.`type`
  
  @js.native
  sealed trait END
    extends vexflowLib.VexNs.FlowNs.VoltaNs.`type`
  
  @js.native
  sealed trait MID
    extends vexflowLib.VexNs.FlowNs.VoltaNs.`type`
  
  @js.native
  sealed trait NONE
    extends vexflowLib.VexNs.FlowNs.VoltaNs.`type`
  
  val BEGIN: BEGIN with scala.Double = js.native
  val BEGIN_END: BEGIN_END with scala.Double = js.native
  val END: END with scala.Double = js.native
  val MID: MID with scala.Double = js.native
  /* 1 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.VoltaNs.`type` with scala.Double] = js.native
}

