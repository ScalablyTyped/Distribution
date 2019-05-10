package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PRECISION: scala.Double = js.native
  def makeFrustum(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    znear: scala.Double,
    zfar: scala.Double
  ): Matrix = js.native
  def makeLookAt(
    ex: scala.Double,
    ey: scala.Double,
    ez: scala.Double,
    cx: scala.Double,
    cy: scala.Double,
    cz: scala.Double,
    ux: scala.Double,
    uy: scala.Double,
    uz: scala.Double
  ): Matrix = js.native
  def makeOrtho(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    znear: scala.Double,
    zfar: scala.Double
  ): Matrix = js.native
  def makePerspective(fovy: scala.Double, aspect: scala.Double, znear: scala.Double, zfar: scala.Double): Matrix = js.native
  def mht(m: Matrix): java.lang.String = js.native
}

