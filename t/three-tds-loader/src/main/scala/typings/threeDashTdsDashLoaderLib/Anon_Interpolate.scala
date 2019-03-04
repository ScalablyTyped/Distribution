package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interpolate extends js.Object {
  def interpolate(p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double, t: scala.Double): scala.Double
  def tangentCubicBezier(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double): scala.Double
  def tangentQuadraticBezier(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double): scala.Double
  def tangentSpline(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double): scala.Double
}

object Anon_Interpolate {
  @scala.inline
  def apply(
    interpolate: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    tangentCubicBezier: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    tangentQuadraticBezier: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    tangentSpline: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): Anon_Interpolate = {
    val __obj = js.Dynamic.literal(interpolate = interpolate, tangentCubicBezier = tangentCubicBezier, tangentQuadraticBezier = tangentQuadraticBezier, tangentSpline = tangentSpline)
  
    __obj.asInstanceOf[Anon_Interpolate]
  }
}

