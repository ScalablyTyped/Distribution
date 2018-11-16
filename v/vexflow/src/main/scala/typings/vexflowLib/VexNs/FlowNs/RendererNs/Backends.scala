package typings
package vexflowLib.VexNs.FlowNs.RendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Backends extends js.Object

@JSGlobal("Vex.Flow.Renderer.Backends")
@js.native
object Backends extends js.Object {
  @js.native
  sealed trait CANVAS
    extends vexflowLib.VexNs.FlowNs.RendererNs.Backends
  
  @js.native
  sealed trait RAPHAEL
    extends vexflowLib.VexNs.FlowNs.RendererNs.Backends
  
  @js.native
  sealed trait SVG
    extends vexflowLib.VexNs.FlowNs.RendererNs.Backends
  
  @js.native
  sealed trait VML
    extends vexflowLib.VexNs.FlowNs.RendererNs.Backends
  
  /* 1 */ val CANVAS: CANVAS with scala.Double = js.native
  val RAPHAEL: RAPHAEL with scala.Double = js.native
  val SVG: SVG with scala.Double = js.native
  val VML: VML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.RendererNs.Backends with scala.Double] = js.native
}

