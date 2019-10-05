package typings.three

import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/Curves", JSImport.Namespace)
@js.native
object srcExtrasCurvesCurvesMod extends js.Object {
  @js.native
  class ArcCurve protected ()
    extends typings.three.srcExtrasCurvesArcCurveMod.ArcCurve {
    def this(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ) = this()
  }
  
  @js.native
  class CatmullRomCurve3 ()
    extends typings.three.srcExtrasCurvesCatmullRomCurve3Mod.CatmullRomCurve3 {
    def this(points: js.Array[Vector3]) = this()
    def this(points: js.Array[Vector3], closed: Boolean) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String, tension: Double) = this()
  }
  
  @js.native
  class CubicBezierCurve protected ()
    extends typings.three.srcExtrasCurvesCubicBezierCurveMod.CubicBezierCurve {
    def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
  }
  
  @js.native
  class CubicBezierCurve3 protected ()
    extends typings.three.srcExtrasCurvesCubicBezierCurve3Mod.CubicBezierCurve3 {
    def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
  }
  
  @js.native
  class EllipseCurve protected ()
    extends typings.three.srcExtrasCurvesEllipseCurveMod.EllipseCurve {
    def this(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ) = this()
  }
  
  @js.native
  class LineCurve protected ()
    extends typings.three.srcExtrasCurvesLineCurveMod.LineCurve {
    def this(v1: Vector2, v2: Vector2) = this()
  }
  
  @js.native
  class LineCurve3 protected ()
    extends typings.three.srcExtrasCurvesLineCurve3Mod.LineCurve3 {
    def this(v1: Vector3, v2: Vector3) = this()
  }
  
  @js.native
  class QuadraticBezierCurve protected ()
    extends typings.three.srcExtrasCurvesQuadraticBezierCurveMod.QuadraticBezierCurve {
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
  }
  
  @js.native
  class QuadraticBezierCurve3 protected ()
    extends typings.three.srcExtrasCurvesQuadraticBezierCurve3Mod.QuadraticBezierCurve3 {
    def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
  }
  
  @js.native
  class SplineCurve ()
    extends typings.three.srcExtrasCurvesSplineCurveMod.SplineCurve {
    def this(points: js.Array[Vector2]) = this()
  }
  
  @js.native
  object CurveUtils extends js.Object {
    def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
    def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
    def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  }
  
}

