package typings.sylvesterDashEs6.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PRECISION: Double = js.native
  def makeFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = js.native
  def makeLookAt(
    ex: Double,
    ey: Double,
    ez: Double,
    cx: Double,
    cy: Double,
    cz: Double,
    ux: Double,
    uy: Double,
    uz: Double
  ): Matrix = js.native
  def makeOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = js.native
  def makePerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double): Matrix = js.native
  def mht(m: Matrix): String = js.native
}

