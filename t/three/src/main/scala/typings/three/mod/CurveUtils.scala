package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CurveUtils")
@js.native
object CurveUtils extends js.Object {
  def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
  def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
}

