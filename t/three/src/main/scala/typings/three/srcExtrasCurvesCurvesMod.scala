package typings.three

import typings.three.srcExtrasCurvesCatmullRomCurve3Mod.CurveType
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesCurvesMod {
  
  @JSImport("three/src/extras/curves/Curves", "ArcCurve")
  @js.native
  open class ArcCurve protected ()
    extends typings.three.srcExtrasCurvesArcCurveMod.ArcCurve {
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
  }
  
  @JSImport("three/src/extras/curves/Curves", "CatmullRomCurve3")
  @js.native
  /**
    * This constructor creates a new {@link CatmullRomCurve3}.
    * @param points An array of {@link THREE.Vector3 | Vector3} points
    * @param closed Whether the curve is closed. Default `false`
    * @param curveType Type of the curve. Default `centripetal`
    * @param tension Tension of the curve. Expects a `Float`. Default `0.5`
    */
  open class CatmullRomCurve3 ()
    extends typings.three.srcExtrasCurvesCatmullRomCurve3Mod.CatmullRomCurve3 {
    def this(points: js.Array[Vector3]) = this()
    def this(points: js.Array[Vector3], closed: Boolean) = this()
    def this(points: Unit, closed: Boolean) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: CurveType) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: CurveType) = this()
    def this(points: Unit, closed: Boolean, curveType: CurveType) = this()
    def this(points: Unit, closed: Unit, curveType: CurveType) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: Unit, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: CurveType, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: Unit, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: CurveType, tension: Double) = this()
    def this(points: Unit, closed: Boolean, curveType: Unit, tension: Double) = this()
    def this(points: Unit, closed: Boolean, curveType: CurveType, tension: Double) = this()
    def this(points: Unit, closed: Unit, curveType: Unit, tension: Double) = this()
    def this(points: Unit, closed: Unit, curveType: CurveType, tension: Double) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "CubicBezierCurve")
  @js.native
  /**
    * This constructor creates a new {@link CubicBezierCurve}.
    * @param v0 The starting point. Default is `new THREE.Vector2()`.
    * @param v1 The first control point. Default is `new THREE.Vector2()`.
    * @param v2 The second control point. Default is `new THREE.Vector2()`.
    * @param v3 The ending point. Default is `new THREE.Vector2()`.
    */
  open class CubicBezierCurve ()
    extends typings.three.srcExtrasCurvesCubicBezierCurveMod.CubicBezierCurve {
    def this(v0: Vector2) = this()
    def this(v0: Unit, v1: Vector2) = this()
    def this(v0: Vector2, v1: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Unit, v3: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Vector2, v3: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Unit, v3: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Vector2, v3: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Unit, v3: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Vector2, v3: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Unit, v3: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "CubicBezierCurve3")
  @js.native
  /**
    * This constructor creates a new {@link CubicBezierCurve3}.
    * @param v0 The starting point. Default is `new THREE.Vector3()`.
    * @param v1 The first control point. Default is `new THREE.Vector3()`.
    * @param v2 The second control point. Default is `new THREE.Vector3()`.
    * @param v3 The ending point. Default is `new THREE.Vector3()`.
    */
  open class CubicBezierCurve3 ()
    extends typings.three.srcExtrasCurvesCubicBezierCurve3Mod.CubicBezierCurve3 {
    def this(v0: Vector3) = this()
    def this(v0: Unit, v1: Vector3) = this()
    def this(v0: Vector3, v1: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Unit, v3: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Vector3, v3: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Unit, v3: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Vector3, v3: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Unit, v3: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Vector3, v3: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Unit, v3: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "EllipseCurve")
  @js.native
  open class EllipseCurve protected ()
    extends typings.three.srcExtrasCurvesEllipseCurveMod.EllipseCurve {
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
  }
  
  @JSImport("three/src/extras/curves/Curves", "LineCurve")
  @js.native
  /**
    * This constructor creates a new {@link LineCurve}.
    * @param v1 The start point. Default is `new THREE.Vector2()`.
    * @param v2 The end point. Default is `new THREE.Vector2()`.
    */
  open class LineCurve ()
    extends typings.three.srcExtrasCurvesLineCurveMod.LineCurve {
    def this(v1: Vector2) = this()
    def this(v1: Unit, v2: Vector2) = this()
    def this(v1: Vector2, v2: Vector2) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "LineCurve3")
  @js.native
  /**
    * This constructor creates a new {@link LineCurve3}.
    * @param v1 The start point. Default is `new THREE.Vector3()`.
    * @param v2 The end point. Default is `new THREE.Vector3()`.
    */
  open class LineCurve3 ()
    extends typings.three.srcExtrasCurvesLineCurve3Mod.LineCurve3 {
    def this(v1: Vector3) = this()
    def this(v1: Unit, v2: Vector3) = this()
    def this(v1: Vector3, v2: Vector3) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "QuadraticBezierCurve")
  @js.native
  /**
    * This constructor creates a new {@link QuadraticBezierCurve}.
    * @param v0 The start point. Default is `new THREE.Vector2()`.
    * @param v1 The control point. Default is `new THREE.Vector2()`.
    * @param v2 The end point. Default is `new THREE.Vector2()`.
    */
  open class QuadraticBezierCurve ()
    extends typings.three.srcExtrasCurvesQuadraticBezierCurveMod.QuadraticBezierCurve {
    def this(v0: Vector2) = this()
    def this(v0: Unit, v1: Vector2) = this()
    def this(v0: Vector2, v1: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "QuadraticBezierCurve3")
  @js.native
  /**
    * This constructor creates a new {@link QuadraticBezierCurve}.
    * @param v0 The start point. Default is `new THREE.Vector3()`.
    * @param v1 The control point. Default is `new THREE.Vector3()`.
    * @param v2 The end point. Default is `new THREE.Vector3()`.
    */
  open class QuadraticBezierCurve3 ()
    extends typings.three.srcExtrasCurvesQuadraticBezierCurve3Mod.QuadraticBezierCurve3 {
    def this(v0: Vector3) = this()
    def this(v0: Unit, v1: Vector3) = this()
    def this(v0: Vector3, v1: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "SplineCurve")
  @js.native
  /**
    * This constructor creates a new {@link SplineCurve}.
    * @param points An array of {@link THREE.Vector2 | Vector2} points that define the curve. Default `[]`
    */
  open class SplineCurve ()
    extends typings.three.srcExtrasCurvesSplineCurveMod.SplineCurve {
    def this(points: js.Array[Vector2]) = this()
  }
}
