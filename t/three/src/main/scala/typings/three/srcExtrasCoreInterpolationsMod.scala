package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreInterpolationsMod {
  
  @JSImport("three/src/extras/core/Interpolations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CatmullRom(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Used internally by {@link THREE.CubicBezierCurve3 | CubicBezierCurve3} and {@link THREE.CubicBezierCurve | CubicBezierCurve}.
    * @param t Interpolation weight. Expects a `Float`
    * @param p0 Expects a `Float`
    * @param p1 Expects a `Float`
    * @param p2 Expects a `Float`
    * @param p3 P0, p1, p2, the starting, control(twice) and end points defining the curve. Expects a `Float`
    * @see {@link https://threejs.org/docs/index.html#api/en/extras/core/Interpolations | Official Documentation}
    * @see {@link https://github.com/mrdoob/three.js/blob/master/src/extras/core/Interpolations.js | Source}
    */
  inline def CubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CubicBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Used internally by {@link THREE.QuadraticBezierCurve3 | QuadraticBezierCurve3} and {@link THREE.QuadraticBezierCurve | QuadraticBezierCurve}.
    * @param t Interpolation weight. Expects a `Float`
    * @param p0 Expects a `Float`
    * @param p1 Expects a `Float`
    * @param p2 P0, p1, the starting, control and end points defining the curve. Expects a `Float`
    * @see {@link https://threejs.org/docs/index.html#api/en/extras/core/Interpolations | Official Documentation}
    * @see {@link https://github.com/mrdoob/three.js/blob/master/src/extras/core/Interpolations.js | Source}
    */
  inline def QuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("QuadraticBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
