package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CurveUtils")
@js.native
object CurveUtilsNs extends js.Object {
  def interpolate(p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double, t: scala.Double): scala.Double = js.native
  def tangentCubicBezier(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double): scala.Double = js.native
  def tangentQuadraticBezier(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double): scala.Double = js.native
  def tangentSpline(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double): scala.Double = js.native
}

