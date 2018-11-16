package typings
package vexflowLib.VexNs.FlowNs.StrokeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("Vex.Flow.Stroke.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait BRUSH_DOWN
    extends vexflowLib.VexNs.FlowNs.StrokeNs.Type
  
  @js.native
  sealed trait BRUSH_UP
    extends vexflowLib.VexNs.FlowNs.StrokeNs.Type
  
  @js.native
  sealed trait RASQUEDO_DOWN
    extends vexflowLib.VexNs.FlowNs.StrokeNs.Type
  
  @js.native
  sealed trait RASQUEDO_UP
    extends vexflowLib.VexNs.FlowNs.StrokeNs.Type
  
  @js.native
  sealed trait ROLL_DOWN
    extends vexflowLib.VexNs.FlowNs.StrokeNs.Type
  
  @js.native
  sealed trait ROLL_UP
    extends vexflowLib.VexNs.FlowNs.StrokeNs.Type
  
  /* 1 */ val BRUSH_DOWN: BRUSH_DOWN with scala.Double = js.native
  val BRUSH_UP: BRUSH_UP with scala.Double = js.native
  val RASQUEDO_DOWN: RASQUEDO_DOWN with scala.Double = js.native
  val RASQUEDO_UP: RASQUEDO_UP with scala.Double = js.native
  val ROLL_DOWN: ROLL_DOWN with scala.Double = js.native
  val ROLL_UP: ROLL_UP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.StrokeNs.Type with scala.Double] = js.native
}

