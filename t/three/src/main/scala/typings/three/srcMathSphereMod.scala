package typings.three

import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Sphere", JSImport.Namespace)
@js.native
object srcMathSphereMod extends js.Object {
  @js.native
  class Sphere () extends js.Object {
    def this(center: Vector3) = this()
    def this(center: Vector3, radius: Double) = this()
    var center: Vector3 = js.native
    var radius: Double = js.native
    def applyMatrix4(matrix: Matrix4): Sphere = js.native
    def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native
    def containsPoint(point: Vector3): Boolean = js.native
    def copy(sphere: Sphere): this.type = js.native
    def distanceToPoint(point: Vector3): Double = js.native
    def empty(): Boolean = js.native
    def equals(sphere: Sphere): Boolean = js.native
    def getBoundingBox(target: Box3): Box3 = js.native
    def intersectsBox(box: Box3): Boolean = js.native
    def intersectsPlane(plane: Plane): Boolean = js.native
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    def set(center: Vector3, radius: Double): Sphere = js.native
    def setFromPoints(points: js.Array[Vector3]): Sphere = js.native
    def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3): Sphere = js.native
    def translate(offset: Vector3): Sphere = js.native
  }
  
}

