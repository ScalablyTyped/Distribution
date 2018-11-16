package typings
package vexflowLib.VexNs.FlowNs.RendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineEndType extends js.Object

@JSGlobal("Vex.Flow.Renderer.LineEndType")
@js.native
object LineEndType extends js.Object {
  @js.native
  sealed trait DOWN
    extends vexflowLib.VexNs.FlowNs.RendererNs.LineEndType
  
  @js.native
  sealed trait NONE
    extends vexflowLib.VexNs.FlowNs.RendererNs.LineEndType
  
  @js.native
  sealed trait UP
    extends vexflowLib.VexNs.FlowNs.RendererNs.LineEndType
  
  val DOWN: DOWN with scala.Double = js.native
  /* 1 */ val NONE: NONE with scala.Double = js.native
  val UP: UP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.RendererNs.LineEndType with scala.Double] = js.native
}

