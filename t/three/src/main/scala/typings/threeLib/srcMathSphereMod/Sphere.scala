package typings
package threeLib.srcMathSphereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Sphere", "Sphere")
@js.native
class Sphere () extends js.Object {
  def this(center: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(center: threeLib.srcMathVector3Mod.Vector3, radius: scala.Double) = this()
  var center: threeLib.srcMathVector3Mod.Vector3 = js.native
  var radius: scala.Double = js.native
  def applyMatrix4(matrix: threeLib.srcMathMatrix4Mod.Matrix4): Sphere = js.native
  def clampPoint(point: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def containsPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Boolean = js.native
  def copy(sphere: Sphere): this.type = js.native
  def distanceToPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Double = js.native
  def empty(): scala.Boolean = js.native
  def equals(sphere: Sphere): scala.Boolean = js.native
  def getBoundingBox(target: threeLib.srcMathBox3Mod.Box3): threeLib.srcMathBox3Mod.Box3 = js.native
  def intersectsBox(box: threeLib.srcMathBox3Mod.Box3): scala.Boolean = js.native
  def intersectsPlane(plane: threeLib.srcMathPlaneMod.Plane): scala.Boolean = js.native
  def intersectsSphere(sphere: Sphere): scala.Boolean = js.native
  def set(center: threeLib.srcMathVector3Mod.Vector3, radius: scala.Double): Sphere = js.native
  def setFromPoints(points: js.Array[threeLib.srcMathVector3Mod.Vector3]): Sphere = js.native
  def setFromPoints(
    points: js.Array[threeLib.srcMathVector3Mod.Vector3],
    optionalCenter: threeLib.srcMathVector3Mod.Vector3
  ): Sphere = js.native
  def translate(offset: threeLib.srcMathVector3Mod.Vector3): Sphere = js.native
}

