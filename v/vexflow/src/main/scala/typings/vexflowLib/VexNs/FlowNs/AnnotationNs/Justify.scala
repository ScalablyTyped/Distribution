package typings
package vexflowLib.VexNs.FlowNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Justify extends js.Object

@JSGlobal("Vex.Flow.Annotation.Justify")
@js.native
object Justify extends js.Object {
  @js.native
  sealed trait CENTER
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.Justify
  
  @js.native
  sealed trait CENTER_STEM
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.Justify
  
  @js.native
  sealed trait LEFT
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.Justify
  
  @js.native
  sealed trait RIGHT
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.Justify
  
  val CENTER: CENTER with scala.Double = js.native
  val CENTER_STEM: CENTER_STEM with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.AnnotationNs.Justify with scala.Double] = js.native
}

