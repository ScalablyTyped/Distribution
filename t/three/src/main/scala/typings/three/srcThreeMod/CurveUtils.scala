package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CurveUtils {
  
  @JSImport("three/src/Three", "CurveUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentCubicBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentQuadraticBezier")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentSpline")(t.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
}
