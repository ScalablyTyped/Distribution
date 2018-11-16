package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Line3")
@js.native
class Line3 () extends js.Object {
  def this(start: Vector3) = this()
  def this(start: Vector3, end: Vector3) = this()
  var end: Vector3 = js.native
  var start: Vector3 = js.native
  def applyMatrix4(matrix: Matrix4): Line3 = js.native
  def at(t: scala.Double, target: Vector3): Vector3 = js.native
  def closestPointToPoint(point: Vector3, clampToLine: scala.Boolean, target: Vector3): Vector3 = js.native
  def closestPointToPointParameter(point: Vector3): scala.Double = js.native
  def closestPointToPointParameter(point: Vector3, clampToLine: scala.Boolean): scala.Double = js.native
  def copy(line: this.type): this.type = js.native
  def delta(target: Vector3): Vector3 = js.native
  def distance(): scala.Double = js.native
  def distanceSq(): scala.Double = js.native
  def equals(line: Line3): scala.Boolean = js.native
  def getCenter(target: Vector3): Vector3 = js.native
  def set(): Line3 = js.native
  def set(start: Vector3): Line3 = js.native
  def set(start: Vector3, end: Vector3): Line3 = js.native
}

