package typings
package threeLib.srcMathPlaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Plane", "Plane")
@js.native
class Plane () extends js.Object {
  def this(normal: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(normal: threeLib.srcMathVector3Mod.Vector3, constant: scala.Double) = this()
  var constant: scala.Double = js.native
  var normal: threeLib.srcMathVector3Mod.Vector3 = js.native
  def applyMatrix4(matrix: threeLib.srcMathMatrix4Mod.Matrix4): Plane = js.native
  def applyMatrix4(
    matrix: threeLib.srcMathMatrix4Mod.Matrix4,
    optionalNormalMatrix: threeLib.srcMathMatrix3Mod.Matrix3
  ): Plane = js.native
  def coplanarPoint(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def copy(plane: Plane): this.type = js.native
  def distanceToPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Double = js.native
  def distanceToSphere(sphere: threeLib.srcMathSphereMod.Sphere): scala.Double = js.native
  def equals(plane: Plane): scala.Boolean = js.native
  def intersectLine(line: threeLib.srcMathLine3Mod.Line3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def intersectsBox(box: threeLib.srcMathBox3Mod.Box3): scala.Boolean = js.native
  def intersectsLine(line: threeLib.srcMathLine3Mod.Line3): scala.Boolean = js.native
  def intersectsSphere(sphere: threeLib.srcMathSphereMod.Sphere): scala.Boolean = js.native
  /**
  	 * @deprecated Use {@link Plane#intersectsLine .intersectsLine()} instead.
  	 */
  def isIntersectionLine(l: js.Any): js.Any = js.native
  def negate(): Plane = js.native
  def normalize(): Plane = js.native
  def orthoPoint(point: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def projectPoint(point: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def set(normal: threeLib.srcMathVector3Mod.Vector3, constant: scala.Double): Plane = js.native
  def setComponents(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Plane = js.native
  def setFromCoplanarPoints(
    a: threeLib.srcMathVector3Mod.Vector3,
    b: threeLib.srcMathVector3Mod.Vector3,
    c: threeLib.srcMathVector3Mod.Vector3
  ): Plane = js.native
  def setFromNormalAndCoplanarPoint(normal: threeLib.srcMathVector3Mod.Vector3, point: threeLib.srcMathVector3Mod.Vector3): Plane = js.native
  def translate(offset: threeLib.srcMathVector3Mod.Vector3): Plane = js.native
}

