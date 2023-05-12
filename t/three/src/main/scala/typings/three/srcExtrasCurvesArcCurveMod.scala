package typings.three

import typings.three.srcExtrasCurvesEllipseCurveMod.EllipseCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesArcCurveMod {
  
  @JSImport("three/src/extras/curves/ArcCurve", "ArcCurve")
  @js.native
  open class ArcCurve protected () extends EllipseCurve {
    /**
      * This constructor creates a new {@link ArcCurve}.
      * @param aX The X center of the ellipse. Expects a `Float`. Default is `0`.
      * @param aY The Y center of the ellipse. Expects a `Float`. Default is `0`.
      * @param xRadius The radius of the ellipse in the x direction. Expects a `Float`. Default is `1`.
      * @param yRadius The radius of the ellipse in the y direction. Expects a `Float`. Default is `1`.
      * @param aStartAngle The start angle of the curve in radians starting from the positive X axis. Default is `0`.
      * @param aEndAngle The end angle of the curve in radians starting from the positive X axis. Default is `2 x Math.PI`.
      * @param aClockwise Whether the ellipse is drawn clockwise. Default is `false`.
      */
    def this(
      aX: js.UndefOr[Double],
      aY: js.UndefOr[Double],
      aRadius: js.UndefOr[Double],
      aStartAngle: js.UndefOr[Double],
      aEndAngle: js.UndefOr[Double],
      aClockwise: js.UndefOr[Boolean]
    ) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link ArcCurve}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isArcCurve: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `ArcCurve`
      */
    @JSName("type")
    val type_ArcCurve: String | typings.three.threeStrings.ArcCurve = js.native
  }
}
