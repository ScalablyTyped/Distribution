package typings
package threeLib.srcMathBox2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Box2", "Box2")
@js.native
class Box2 () extends js.Object {
  def this(min: threeLib.srcMathVector2Mod.Vector2) = this()
  def this(min: threeLib.srcMathVector2Mod.Vector2, max: threeLib.srcMathVector2Mod.Vector2) = this()
  var max: threeLib.srcMathVector2Mod.Vector2 = js.native
  var min: threeLib.srcMathVector2Mod.Vector2 = js.native
  def clampPoint(point: threeLib.srcMathVector2Mod.Vector2, target: threeLib.srcMathVector2Mod.Vector2): threeLib.srcMathVector2Mod.Vector2 = js.native
  def containsBox(box: Box2): scala.Boolean = js.native
  def containsPoint(point: threeLib.srcMathVector2Mod.Vector2): scala.Boolean = js.native
  def copy(box: Box2): this.type = js.native
  def distanceToPoint(point: threeLib.srcMathVector2Mod.Vector2): scala.Double = js.native
  /**
    * @deprecated Use {@link Box2#isEmpty .isEmpty()} instead.
    */
  def empty(): js.Any = js.native
  def equals(box: Box2): scala.Boolean = js.native
  def expandByPoint(point: threeLib.srcMathVector2Mod.Vector2): Box2 = js.native
  def expandByScalar(scalar: scala.Double): Box2 = js.native
  def expandByVector(vector: threeLib.srcMathVector2Mod.Vector2): Box2 = js.native
  def getCenter(target: threeLib.srcMathVector2Mod.Vector2): threeLib.srcMathVector2Mod.Vector2 = js.native
  def getParameter(point: threeLib.srcMathVector2Mod.Vector2): threeLib.srcMathVector2Mod.Vector2 = js.native
  def getSize(target: threeLib.srcMathVector2Mod.Vector2): threeLib.srcMathVector2Mod.Vector2 = js.native
  def intersect(box: Box2): Box2 = js.native
  def intersectsBox(box: Box2): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  /**
    * @deprecated Use {@link Box2#intersectsBox .intersectsBox()} instead.
    */
  def isIntersectionBox(b: js.Any): js.Any = js.native
  def makeEmpty(): Box2 = js.native
  def set(min: threeLib.srcMathVector2Mod.Vector2, max: threeLib.srcMathVector2Mod.Vector2): Box2 = js.native
  def setFromCenterAndSize(center: threeLib.srcMathVector2Mod.Vector2, size: threeLib.srcMathVector2Mod.Vector2): Box2 = js.native
  def setFromPoints(points: js.Array[threeLib.srcMathVector2Mod.Vector2]): Box2 = js.native
  def translate(offset: threeLib.srcMathVector2Mod.Vector2): Box2 = js.native
  def union(box: Box2): Box2 = js.native
}

