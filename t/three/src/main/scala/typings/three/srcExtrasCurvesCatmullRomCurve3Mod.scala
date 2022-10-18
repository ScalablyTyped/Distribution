package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesCatmullRomCurve3Mod {
  
  @JSImport("three/src/extras/curves/CatmullRomCurve3", "CatmullRomCurve3")
  @js.native
  /**
    * @param [points=[]]
    * @param [closed=false]
    * @param [curveType='centripetal']
    * @param [tension=0.5]
    */
  open class CatmullRomCurve3 () extends Curve[Vector3] {
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
    
    /**
      * @default []
      */
    var points: js.Array[Vector3] = js.native
  }
  
  object CurveUtils {
    
    @JSImport("three/src/extras/curves/CatmullRomCurve3", "CurveUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentCubicBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentQuadraticBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentSpline")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
