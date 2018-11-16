package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PathActions extends js.Object

@JSImport("three/three-core", "PathActions")
@js.native
object PathActions extends js.Object {
                  // Circle
  @js.native
  sealed trait ARC
    extends threeLib.threeDashCoreMod.PathActions
  
       // Bezier cubic curve
  @js.native
  sealed trait BEZIER_CURVE_TO
    extends threeLib.threeDashCoreMod.PathActions
  
          // Catmull-rom spline
  @js.native
  sealed trait CSPLINE_THRU
    extends threeLib.threeDashCoreMod.PathActions
  
  @js.native
  sealed trait ELLIPSE
    extends threeLib.threeDashCoreMod.PathActions
  
  @js.native
  sealed trait LINE_TO
    extends threeLib.threeDashCoreMod.PathActions
  
  @js.native
  sealed trait MOVE_TO
    extends threeLib.threeDashCoreMod.PathActions
  
   // Bezier quadratic curve
  @js.native
  sealed trait QUADRATIC_CURVE_TO
    extends threeLib.threeDashCoreMod.PathActions
  
  val ARC: ARC with java.lang.String = js.native
  val BEZIER_CURVE_TO: BEZIER_CURVE_TO with java.lang.String = js.native
  val CSPLINE_THRU: CSPLINE_THRU with java.lang.String = js.native
  val ELLIPSE: ELLIPSE with java.lang.String = js.native
  val LINE_TO: LINE_TO with java.lang.String = js.native
  val MOVE_TO: MOVE_TO with java.lang.String = js.native
  val QUADRATIC_CURVE_TO: QUADRATIC_CURVE_TO with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[threeLib.threeDashCoreMod.PathActions with java.lang.String] = js.native
}

