package typings
package threeLib.srcExtrasCorePathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PathActions extends js.Object

@JSImport("three/src/extras/core/Path", "PathActions")
@js.native
object PathActions extends js.Object {
   // Circle
  @js.native
  sealed trait ARC
    extends threeLib.srcExtrasCorePathMod.PathActions
  
   // Bezier cubic curve
  @js.native
  sealed trait BEZIER_CURVE_TO
    extends threeLib.srcExtrasCorePathMod.PathActions
  
   // Catmull-rom spline
  @js.native
  sealed trait CSPLINE_THRU
    extends threeLib.srcExtrasCorePathMod.PathActions
  
  @js.native
  sealed trait ELLIPSE
    extends threeLib.srcExtrasCorePathMod.PathActions
  
  @js.native
  sealed trait LINE_TO
    extends threeLib.srcExtrasCorePathMod.PathActions
  
  @js.native
  sealed trait MOVE_TO
    extends threeLib.srcExtrasCorePathMod.PathActions
  
   // Bezier quadratic curve
  @js.native
  sealed trait QUADRATIC_CURVE_TO
    extends threeLib.srcExtrasCorePathMod.PathActions
  
  /* 5 */ val ARC: ARC with scala.Double = js.native
  /* 3 */ val BEZIER_CURVE_TO: BEZIER_CURVE_TO with scala.Double = js.native
  /* 4 */ val CSPLINE_THRU: CSPLINE_THRU with scala.Double = js.native
  /* 6 */ val ELLIPSE: ELLIPSE with scala.Double = js.native
  /* 1 */ val LINE_TO: LINE_TO with scala.Double = js.native
  /* 0 */ val MOVE_TO: MOVE_TO with scala.Double = js.native
  /* 2 */ val QUADRATIC_CURVE_TO: QUADRATIC_CURVE_TO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[threeLib.srcExtrasCorePathMod.PathActions with scala.Double] = js.native
}

