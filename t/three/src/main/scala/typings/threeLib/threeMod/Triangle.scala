package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Triangle")
@js.native
class Triangle ()
  extends threeLib.threeDashCoreMod.Triangle {
  def this(a: threeLib.threeDashCoreMod.Vector3) = this()
  def this(a: threeLib.threeDashCoreMod.Vector3, b: threeLib.threeDashCoreMod.Vector3) = this()
  def this(a: threeLib.threeDashCoreMod.Vector3, b: threeLib.threeDashCoreMod.Vector3, c: threeLib.threeDashCoreMod.Vector3) = this()
}

/* static members */
@JSImport("three", "Triangle")
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

