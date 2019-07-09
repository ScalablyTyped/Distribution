package typings
package threeLib.srcMathSphericalHarmonics3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/SphericalHarmonics3", "SphericalHarmonics3")
@js.native
class SphericalHarmonics3 () extends js.Object {
  var coefficients: js.Array[threeLib.srcMathVector3Mod.Vector3] = js.native
  var isSphericalHarmonics3: scala.Boolean = js.native
  def add(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
  def copy(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
  def equals(sh: SphericalHarmonics3): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): SphericalHarmonics3 = js.native
  def getAt(normal: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def getIrradianceAt(normal: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def lerp(sh: SphericalHarmonics3, alpha: scala.Double): SphericalHarmonics3 = js.native
  def scale(s: scala.Double): SphericalHarmonics3 = js.native
  def set(coefficients: js.Array[threeLib.srcMathVector3Mod.Vector3]): SphericalHarmonics3 = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def zero(): SphericalHarmonics3 = js.native
}

/* static members */
@JSImport("three/src/math/SphericalHarmonics3", "SphericalHarmonics3")
@js.native
object SphericalHarmonics3 extends js.Object {
  def getBasisAt(normal: threeLib.srcMathVector3Mod.Vector3, shBasis: js.Array[scala.Double]): scala.Unit = js.native
}

