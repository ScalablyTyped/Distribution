package typings.three

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
    def this(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "CatmullRomCurve3")
  @js.native
  /**
    * @param [points=[]]
    * @param [closed=false]
    * @param [curveType='centripetal']
    * @param [tension=0.5]
    */
  open class CatmullRomCurve3 ()
    extends typings.three.srcExtrasCurvesCatmullRomCurve3Mod.CatmullRomCurve3 {
    def this(points: js.Array[Vector3]) = this()
    def this(points: js.Array[Vector3], closed: Boolean) = this()
    def this(points: Unit, closed: Boolean) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: String) = this()
    def this(points: Unit, closed: Boolean, curveType: String) = this()
    def this(points: Unit, closed: Unit, curveType: String) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: Unit, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: String, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: Unit, tension: Double) = this()
    def this(points: Unit, closed: Boolean, curveType: String, tension: Double) = this()
    def this(points: Unit, closed: Boolean, curveType: Unit, tension: Double) = this()
    def this(points: Unit, closed: Unit, curveType: String, tension: Double) = this()
    def this(points: Unit, closed: Unit, curveType: Unit, tension: Double) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "CubicBezierCurve")
  @js.native
  open class CubicBezierCurve protected ()
    extends typings.three.srcExtrasCurvesCubicBezierCurveMod.CubicBezierCurve {
    def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "CubicBezierCurve3")
  @js.native
  open class CubicBezierCurve3 protected ()
    extends typings.three.srcExtrasCurvesCubicBezierCurve3Mod.CubicBezierCurve3 {
    def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
  }
  
  object CurveUtils {
    
    @JSImport("three/src/extras/curves/Curves", "CurveUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentCubicBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentQuadraticBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentSpline")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("three/src/extras/curves/Curves", "EllipseCurve")
  @js.native
  open class EllipseCurve protected ()
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
  
  @JSImport("three/src/extras/curves/Curves", "LineCurve")
  @js.native
  open class LineCurve protected ()
    extends typings.three.srcExtrasCurvesLineCurveMod.LineCurve {
    def this(v1: Vector2, v2: Vector2) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "LineCurve3")
  @js.native
  open class LineCurve3 protected ()
    extends typings.three.srcExtrasCurvesLineCurve3Mod.LineCurve3 {
    def this(v1: Vector3, v2: Vector3) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "QuadraticBezierCurve")
  @js.native
  open class QuadraticBezierCurve protected ()
    extends typings.three.srcExtrasCurvesQuadraticBezierCurveMod.QuadraticBezierCurve {
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "QuadraticBezierCurve3")
  @js.native
  open class QuadraticBezierCurve3 protected ()
    extends typings.three.srcExtrasCurvesQuadraticBezierCurve3Mod.QuadraticBezierCurve3 {
    def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
  }
  
  @JSImport("three/src/extras/curves/Curves", "SplineCurve")
  @js.native
  open class SplineCurve ()
    extends typings.three.srcExtrasCurvesSplineCurveMod.SplineCurve {
    def this(points: js.Array[Vector2]) = this()
  }
}
