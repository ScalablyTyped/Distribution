package typings.three

import typings.three.matrix4Mod.Matrix4
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Line3", JSImport.Namespace)
@js.native
object line3Mod extends js.Object {
  @js.native
  class Line3 () extends js.Object {
    def this(start: Vector3) = this()
    def this(start: Vector3, end: Vector3) = this()
    var end: Vector3 = js.native
    var start: Vector3 = js.native
    def applyMatrix4(matrix: Matrix4): Line3 = js.native
    def at(t: Double, target: Vector3): Vector3 = js.native
    def closestPointToPoint(point: Vector3, clampToLine: Boolean, target: Vector3): Vector3 = js.native
    def closestPointToPointParameter(point: Vector3): Double = js.native
    def closestPointToPointParameter(point: Vector3, clampToLine: Boolean): Double = js.native
    def copy(line: Line3): this.type = js.native
    def delta(target: Vector3): Vector3 = js.native
    def distance(): Double = js.native
    def distanceSq(): Double = js.native
    def equals(line: Line3): Boolean = js.native
    def getCenter(target: Vector3): Vector3 = js.native
    def set(): Line3 = js.native
    def set(start: Vector3): Line3 = js.native
    def set(start: Vector3, end: Vector3): Line3 = js.native
  }
  
}

