package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassTriangle
  extends org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Triangle] {
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
  def getUV(
    point: threeLib.srcMathVector3Mod.Vector3,
    p1: threeLib.srcMathVector3Mod.Vector3,
    p2: threeLib.srcMathVector3Mod.Vector3,
    p3: threeLib.srcMathVector3Mod.Vector3,
    uv1: threeLib.srcMathVector2Mod.Vector2,
    uv2: threeLib.srcMathVector2Mod.Vector2,
    uv3: threeLib.srcMathVector2Mod.Vector2,
    target: threeLib.srcMathVector2Mod.Vector2
  ): threeLib.srcMathVector2Mod.Vector2 = js.native
  def isFrontFacing(
    a: threeLib.srcMathVector3Mod.Vector3,
    b: threeLib.srcMathVector3Mod.Vector3,
    c: threeLib.srcMathVector3Mod.Vector3,
    direction: threeLib.srcMathVector3Mod.Vector3
  ): scala.Boolean = js.native
}

