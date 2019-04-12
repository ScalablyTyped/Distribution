package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Triangle")
@js.native
class Triangle ()
  extends threeLib.srcMathTriangleMod.Triangle {
  def this(a: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(a: threeLib.srcMathVector3Mod.Vector3, b: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(a: threeLib.srcMathVector3Mod.Vector3, b: threeLib.srcMathVector3Mod.Vector3, c: threeLib.srcMathVector3Mod.Vector3) = this()
}

/* static members */
@JSImport("three", "Triangle")
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

