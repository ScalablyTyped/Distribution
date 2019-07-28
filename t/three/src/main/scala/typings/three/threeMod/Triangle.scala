package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Triangle")
@js.native
class Triangle ()
  extends typings.three.srcMathTriangleMod.Triangle {
  def this(a: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(a: typings.three.srcMathVector3Mod.Vector3, b: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3
  ) = this()
}

/* static members */
@JSImport("three", "Triangle")
@js.native
object Triangle extends js.Object {
  def containsPoint(
    point: typings.three.srcMathVector3Mod.Vector3,
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3
  ): Boolean = js.native
  def getBarycoord(
    point: typings.three.srcMathVector3Mod.Vector3,
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3,
    target: typings.three.srcMathVector3Mod.Vector3
  ): typings.three.srcMathVector3Mod.Vector3 = js.native
  def getNormal(
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3,
    target: typings.three.srcMathVector3Mod.Vector3
  ): typings.three.srcMathVector3Mod.Vector3 = js.native
  def getUV(
    point: typings.three.srcMathVector3Mod.Vector3,
    p1: typings.three.srcMathVector3Mod.Vector3,
    p2: typings.three.srcMathVector3Mod.Vector3,
    p3: typings.three.srcMathVector3Mod.Vector3,
    uv1: typings.three.srcMathVector2Mod.Vector2,
    uv2: typings.three.srcMathVector2Mod.Vector2,
    uv3: typings.three.srcMathVector2Mod.Vector2,
    target: typings.three.srcMathVector2Mod.Vector2
  ): typings.three.srcMathVector2Mod.Vector2 = js.native
  def isFrontFacing(
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3,
    direction: typings.three.srcMathVector3Mod.Vector3
  ): Boolean = js.native
}

