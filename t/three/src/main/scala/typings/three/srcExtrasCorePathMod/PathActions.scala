package typings.three.srcExtrasCorePathMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PathActions with Double] = js.native
  /* 5 */ @js.native
  object ARC extends TopLevel[ARC with Double]
  
  /* 3 */ @js.native
  object BEZIER_CURVE_TO extends TopLevel[BEZIER_CURVE_TO with Double]
  
  /* 4 */ @js.native
  object CSPLINE_THRU extends TopLevel[CSPLINE_THRU with Double]
  
  /* 6 */ @js.native
  object ELLIPSE extends TopLevel[ELLIPSE with Double]
  
  /* 1 */ @js.native
  object LINE_TO extends TopLevel[LINE_TO with Double]
  
  /* 0 */ @js.native
  object MOVE_TO extends TopLevel[MOVE_TO with Double]
  
  /* 2 */ @js.native
  object QUADRATIC_CURVE_TO extends TopLevel[QUADRATIC_CURVE_TO with Double]
  
}

