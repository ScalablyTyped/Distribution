package typings
package threeLib.srcMathLine3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Line3", "Line3")
@js.native
class Line3 () extends js.Object {
  def this(start: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(start: threeLib.srcMathVector3Mod.Vector3, end: threeLib.srcMathVector3Mod.Vector3) = this()
  var end: threeLib.srcMathVector3Mod.Vector3 = js.native
  var start: threeLib.srcMathVector3Mod.Vector3 = js.native
  def applyMatrix4(matrix: threeLib.srcMathMatrix4Mod.Matrix4): Line3 = js.native
  def at(t: scala.Double, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def closestPointToPoint(
    point: threeLib.srcMathVector3Mod.Vector3,
    clampToLine: scala.Boolean,
    target: threeLib.srcMathVector3Mod.Vector3
  ): threeLib.srcMathVector3Mod.Vector3 = js.native
  def closestPointToPointParameter(point: threeLib.srcMathVector3Mod.Vector3): scala.Double = js.native
  def closestPointToPointParameter(point: threeLib.srcMathVector3Mod.Vector3, clampToLine: scala.Boolean): scala.Double = js.native
  def copy(line: Line3): this.type = js.native
  def delta(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def distance(): scala.Double = js.native
  def distanceSq(): scala.Double = js.native
  def equals(line: Line3): scala.Boolean = js.native
  def getCenter(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def set(): Line3 = js.native
  def set(start: threeLib.srcMathVector3Mod.Vector3): Line3 = js.native
  def set(start: threeLib.srcMathVector3Mod.Vector3, end: threeLib.srcMathVector3Mod.Vector3): Line3 = js.native
}

