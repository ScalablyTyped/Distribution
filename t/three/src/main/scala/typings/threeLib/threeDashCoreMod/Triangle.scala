package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Triangle")
@js.native
class Triangle () extends js.Object {
  def this(a: Vector3) = this()
  def this(a: Vector3, b: Vector3) = this()
  def this(a: Vector3, b: Vector3, c: Vector3) = this()
  var a: Vector3 = js.native
  var b: Vector3 = js.native
  var c: Vector3 = js.native
  def closestPointToPoint(point: Vector3, target: Vector3): Vector3 = js.native
  def containsPoint(point: Vector3): scala.Boolean = js.native
  def copy(triangle: Triangle): this.type = js.native
  def equals(triangle: Triangle): scala.Boolean = js.native
  def getArea(): scala.Double = js.native
  def getBarycoord(point: Vector3, target: Vector3): Vector3 = js.native
  def getMidpoint(target: Vector3): Vector3 = js.native
  def getNormal(target: Vector3): Vector3 = js.native
  def getPlane(target: Vector3): Plane = js.native
  def set(a: Vector3, b: Vector3, c: Vector3): Triangle = js.native
  def setFromPointsAndIndices(points: js.Array[Vector3], i0: scala.Double, i1: scala.Double, i2: scala.Double): Triangle = js.native
}

@JSImport("three/three-core", "Triangle")
@js.native
object Triangle extends js.Object {
  def containsPoint(
    point: threeLib.threeDashCoreMod.Vector3,
    a: threeLib.threeDashCoreMod.Vector3,
    b: threeLib.threeDashCoreMod.Vector3,
    c: threeLib.threeDashCoreMod.Vector3
  ): scala.Boolean = js.native
  def getBarycoord(
    point: threeLib.threeDashCoreMod.Vector3,
    a: threeLib.threeDashCoreMod.Vector3,
    b: threeLib.threeDashCoreMod.Vector3,
    c: threeLib.threeDashCoreMod.Vector3,
    target: threeLib.threeDashCoreMod.Vector3
  ): threeLib.threeDashCoreMod.Vector3 = js.native
  def getNormal(
    a: threeLib.threeDashCoreMod.Vector3,
    b: threeLib.threeDashCoreMod.Vector3,
    c: threeLib.threeDashCoreMod.Vector3,
    target: threeLib.threeDashCoreMod.Vector3
  ): threeLib.threeDashCoreMod.Vector3 = js.native
}

