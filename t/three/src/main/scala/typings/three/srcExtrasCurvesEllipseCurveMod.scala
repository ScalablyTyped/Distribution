package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesEllipseCurveMod {
  
  @JSImport("three/src/extras/curves/EllipseCurve", "EllipseCurve")
  @js.native
  open class EllipseCurve protected () extends Curve[Vector2] {
    /**
      * This constructor creates a new {@link EllipseCurve}.
      * @param aX The X center of the ellipse. Expects a `Float`. Default is `0`.
      * @param aY The Y center of the ellipse. Expects a `Float`. Default is `0`.
      * @param xRadius The radius of the ellipse in the x direction. Expects a `Float`. Default is `1`.
      * @param yRadius The radius of the ellipse in the y direction. Expects a `Float`. Default is `1`.
      * @param aStartAngle The start angle of the curve in radians starting from the positive X axis. Default is `0`.
      * @param aEndAngle The end angle of the curve in radians starting from the positive X axis. Default is `2 x Math.PI`.
      * @param aClockwise Whether the ellipse is drawn clockwise. Default is `false`.
      * @param aRotation The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Default is `0`.
      */
    def this(
      aX: js.UndefOr[Double],
      aY: js.UndefOr[Double],
      xRadius: js.UndefOr[Double],
      yRadius: js.UndefOr[Double],
      aStartAngle: js.UndefOr[Double],
      aEndAngle: js.UndefOr[Double],
      aClockwise: js.UndefOr[Boolean],
      aRotation: js.UndefOr[Double]
    ) = this()
    
    /**
      * Whether the ellipse is drawn clockwise.
      * @defaultValue `false``
      */
    var aClockwise: Boolean = js.native
    
    /**
      * The end angle of the curve in radians starting from the middle right side.
      * @remarks Expects a `Float`
      * @defaultValue `2 * Math.PI`
      */
    var aEndAngle: Double = js.native
    
    /**
      * The rotation angle of the ellipse in radians, counterclockwise from the positive X axis (optional).
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var aRotation: Double = js.native
    
    /**
      * The start angle of the curve in radians starting from the middle right side.
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var aStartAngle: Double = js.native
    
    /**
      * The X center of the ellipse.
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var aX: Double = js.native
    
    /**
      * The Y center of the ellipse.
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var aY: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link EllipseCurve}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isEllipseCurve: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `EllipseCurve`
      */
    @JSName("type")
    val type_EllipseCurve: String | typings.three.threeStrings.EllipseCurve = js.native
    
    /**
      * The radius of the ellipse in the x direction.
      * @defaultValue `1`
      */
    var xRadius: Double = js.native
    
    /**
      * The radius of the ellipse in the y direction.
      * @defaultValue `1`
      */
    var yRadius: Double = js.native
  }
}
