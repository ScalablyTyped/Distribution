package typings.three.srcExtrasCorePathMod

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
  sealed trait ARC extends PathActions
  
   // Bezier cubic curve
  @js.native
  sealed trait BEZIER_CURVE_TO extends PathActions
  
   // Catmull-rom spline
  @js.native
  sealed trait CSPLINE_THRU extends PathActions
  
  @js.native
  sealed trait ELLIPSE extends PathActions
  
  @js.native
  sealed trait LINE_TO extends PathActions
  
  @js.native
  sealed trait MOVE_TO extends PathActions
  
   // Bezier quadratic curve
  @js.native
  sealed trait QUADRATIC_CURVE_TO extends PathActions
  
  /* 5 */ val ARC: typings.three.srcExtrasCorePathMod.PathActions.ARC with Double = js.native
  /* 3 */ val BEZIER_CURVE_TO: typings.three.srcExtrasCorePathMod.PathActions.BEZIER_CURVE_TO with Double = js.native
  /* 4 */ val CSPLINE_THRU: typings.three.srcExtrasCorePathMod.PathActions.CSPLINE_THRU with Double = js.native
  /* 6 */ val ELLIPSE: typings.three.srcExtrasCorePathMod.PathActions.ELLIPSE with Double = js.native
  /* 1 */ val LINE_TO: typings.three.srcExtrasCorePathMod.PathActions.LINE_TO with Double = js.native
  /* 0 */ val MOVE_TO: typings.three.srcExtrasCorePathMod.PathActions.MOVE_TO with Double = js.native
  /* 2 */ val QUADRATIC_CURVE_TO: typings.three.srcExtrasCorePathMod.PathActions.QUADRATIC_CURVE_TO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PathActions with Double] = js.native
}

