package typings.three

import typings.three.curveMod.Curve
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object catmullRomCurve3Mod {
  
  @JSImport("three/src/extras/curves/CatmullRomCurve3", "CatmullRomCurve3")
  @js.native
  /**
  	 * @param [points=[]]
  	 * @param [closed=false]
  	 * @param [curveType='centripetal']
  	 * @param [tension=0.5]
  	 */
  class CatmullRomCurve3 () extends Curve[Vector3] {
    def this(points: js.Array[Vector3]) = this()
    def this(points: js.UndefOr[scala.Nothing], closed: Boolean) = this()
    def this(points: js.Array[Vector3], closed: Boolean) = this()
    def this(points: js.UndefOr[scala.Nothing], closed: js.UndefOr[scala.Nothing], curveType: String) = this()
    def this(points: js.UndefOr[scala.Nothing], closed: Boolean, curveType: String) = this()
    def this(points: js.Array[Vector3], closed: js.UndefOr[scala.Nothing], curveType: String) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String) = this()
    def this(
      points: js.UndefOr[scala.Nothing],
      closed: js.UndefOr[scala.Nothing],
      curveType: js.UndefOr[scala.Nothing],
      tension: Double
    ) = this()
    def this(
      points: js.UndefOr[scala.Nothing],
      closed: js.UndefOr[scala.Nothing],
      curveType: String,
      tension: Double
    ) = this()
    def this(
      points: js.UndefOr[scala.Nothing],
      closed: Boolean,
      curveType: js.UndefOr[scala.Nothing],
      tension: Double
    ) = this()
    def this(points: js.UndefOr[scala.Nothing], closed: Boolean, curveType: String, tension: Double) = this()
    def this(
      points: js.Array[Vector3],
      closed: js.UndefOr[scala.Nothing],
      curveType: js.UndefOr[scala.Nothing],
      tension: Double
    ) = this()
    def this(points: js.Array[Vector3], closed: js.UndefOr[scala.Nothing], curveType: String, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: js.UndefOr[scala.Nothing], tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String, tension: Double) = this()
    
    /**
    	 * @default []
    	 */
    var points: js.Array[Vector3] = js.native
  }
  
  object CurveUtils {
    
    @JSImport("three/src/extras/curves/CatmullRomCurve3", "CurveUtils.interpolate")
    @js.native
    def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
    
    @JSImport("three/src/extras/curves/CatmullRomCurve3", "CurveUtils.tangentCubicBezier")
    @js.native
    def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    
    @JSImport("three/src/extras/curves/CatmullRomCurve3", "CurveUtils.tangentQuadraticBezier")
    @js.native
    def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
    
    @JSImport("three/src/extras/curves/CatmullRomCurve3", "CurveUtils.tangentSpline")
    @js.native
    def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  }
}
