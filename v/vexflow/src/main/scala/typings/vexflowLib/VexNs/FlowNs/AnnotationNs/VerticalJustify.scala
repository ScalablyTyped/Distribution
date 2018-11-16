package typings
package vexflowLib.VexNs.FlowNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalJustify extends js.Object

@JSGlobal("Vex.Flow.Annotation.VerticalJustify")
@js.native
object VerticalJustify extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.VerticalJustify
  
  @js.native
  sealed trait CENTER
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.VerticalJustify
  
  @js.native
  sealed trait CENTER_STEM
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.VerticalJustify
  
  @js.native
  sealed trait TOP
    extends vexflowLib.VexNs.FlowNs.AnnotationNs.VerticalJustify
  
  val BOTTOM: BOTTOM with scala.Double = js.native
  val CENTER: CENTER with scala.Double = js.native
  val CENTER_STEM: CENTER_STEM with scala.Double = js.native
  /* 1 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.AnnotationNs.VerticalJustify with scala.Double] = js.native
}

