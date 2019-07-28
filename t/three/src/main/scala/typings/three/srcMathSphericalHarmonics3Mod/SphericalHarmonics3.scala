package typings.three.srcMathSphericalHarmonics3Mod

import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/SphericalHarmonics3", "SphericalHarmonics3")
@js.native
class SphericalHarmonics3 () extends js.Object {
  var coefficients: js.Array[Vector3] = js.native
  var isSphericalHarmonics3: Boolean = js.native
  def add(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
  def copy(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
  def equals(sh: SphericalHarmonics3): Boolean = js.native
  def fromArray(array: js.Array[Double]): SphericalHarmonics3 = js.native
  def getAt(normal: Vector3, target: Vector3): Vector3 = js.native
  def getIrradianceAt(normal: Vector3, target: Vector3): Vector3 = js.native
  def lerp(sh: SphericalHarmonics3, alpha: Double): SphericalHarmonics3 = js.native
  def scale(s: Double): SphericalHarmonics3 = js.native
  def set(coefficients: js.Array[Vector3]): SphericalHarmonics3 = js.native
  def toArray(): js.Array[Double] = js.native
  def zero(): SphericalHarmonics3 = js.native
}

/* static members */
@JSImport("three/src/math/SphericalHarmonics3", "SphericalHarmonics3")
@js.native
object SphericalHarmonics3 extends js.Object {
  def getBasisAt(normal: Vector3, shBasis: js.Array[Double]): Unit = js.native
}

