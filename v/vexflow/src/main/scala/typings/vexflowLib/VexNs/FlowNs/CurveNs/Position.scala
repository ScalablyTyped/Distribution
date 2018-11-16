package typings
package vexflowLib.VexNs.FlowNs.CurveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("Vex.Flow.Curve.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait NEAR_HEAD
    extends vexflowLib.VexNs.FlowNs.CurveNs.Position
  
  @js.native
  sealed trait NEAR_TOP
    extends vexflowLib.VexNs.FlowNs.CurveNs.Position
  
  /* 1 */ val NEAR_HEAD: NEAR_HEAD with scala.Double = js.native
  val NEAR_TOP: NEAR_TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.CurveNs.Position with scala.Double] = js.native
}

