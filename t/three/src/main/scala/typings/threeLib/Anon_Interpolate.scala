package typings
package threeLib

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
    interpolate: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double,
    tangentCubicBezier: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double,
    tangentQuadraticBezier: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double,
    tangentSpline: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double
  ): Anon_Interpolate = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction5(interpolate), tangentCubicBezier = js.Any.fromFunction5(tangentCubicBezier), tangentQuadraticBezier = js.Any.fromFunction4(tangentQuadraticBezier), tangentSpline = js.Any.fromFunction5(tangentSpline))
  
    __obj.asInstanceOf[Anon_Interpolate]
  }
}

