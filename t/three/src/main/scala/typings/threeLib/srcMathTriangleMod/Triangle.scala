package typings
package threeLib.srcMathTriangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Triangle", "Triangle")
@js.native
class Triangle () extends js.Object {
  def this(a: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(a: threeLib.srcMathVector3Mod.Vector3, b: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(a: threeLib.srcMathVector3Mod.Vector3, b: threeLib.srcMathVector3Mod.Vector3, c: threeLib.srcMathVector3Mod.Vector3) = this()
  var a: threeLib.srcMathVector3Mod.Vector3 = js.native
  var b: threeLib.srcMathVector3Mod.Vector3 = js.native
  var c: threeLib.srcMathVector3Mod.Vector3 = js.native
  def closestPointToPoint(point: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def containsPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Boolean = js.native
  def copy(triangle: Triangle): this.type = js.native
  def equals(triangle: Triangle): scala.Boolean = js.native
  def getArea(): scala.Double = js.native
  def getBarycoord(point: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def getMidpoint(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def getNormal(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def getPlane(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathPlaneMod.Plane = js.native
  def set(
    a: threeLib.srcMathVector3Mod.Vector3,
    b: threeLib.srcMathVector3Mod.Vector3,
    c: threeLib.srcMathVector3Mod.Vector3
  ): Triangle = js.native
  def setFromPointsAndIndices(
    points: js.Array[threeLib.srcMathVector3Mod.Vector3],
    i0: scala.Double,
    i1: scala.Double,
    i2: scala.Double
  ): Triangle = js.native
}

/* static members */
@JSImport("three/src/math/Triangle", "Triangle")
@js.native
object Triangle extends js.Object {
  def containsPoint(
    point: threeLib.srcMathVector3Mod.Vector3,
    a: threeLib.srcMathVector3Mod.Vector3,
    b: threeLib.srcMathVector3Mod.Vector3,
    c: threeLib.srcMathVector3Mod.Vector3
  ): scala.Boolean = js.native
  def getBarycoord(
    point: threeLib.srcMathVector3Mod.Vector3,
    a: threeLib.srcMathVector3Mod.Vector3,
    b: threeLib.srcMathVector3Mod.Vector3,
    c: threeLib.srcMathVector3Mod.Vector3,
    target: threeLib.srcMathVector3Mod.Vector3
  ): threeLib.srcMathVector3Mod.Vector3 = js.native
  def getNormal(
    a: threeLib.srcMathVector3Mod.Vector3,
    b: threeLib.srcMathVector3Mod.Vector3,
    c: threeLib.srcMathVector3Mod.Vector3,
    target: threeLib.srcMathVector3Mod.Vector3
  ): threeLib.srcMathVector3Mod.Vector3 = js.native
}

