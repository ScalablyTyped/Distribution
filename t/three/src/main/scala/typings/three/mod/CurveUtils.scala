package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CurveUtils {
  
  @JSImport("three", "CurveUtils.interpolate")
  @js.native
  def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
  
  @JSImport("three", "CurveUtils.tangentCubicBezier")
  @js.native
  def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  
  @JSImport("three", "CurveUtils.tangentQuadraticBezier")
  @js.native
  def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  
  @JSImport("three", "CurveUtils.tangentSpline")
  @js.native
  def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
}
