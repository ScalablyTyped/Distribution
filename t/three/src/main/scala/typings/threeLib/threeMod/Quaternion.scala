package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Quaternion")
@js.native
/**
  * @param x x coordinate
  * @param y y coordinate
  * @param z z coordinate
  * @param w w coordinate
  */
class Quaternion ()
  extends threeLib.threeDashCoreMod.Quaternion {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
}

@JSImport("three", "Quaternion")
@js.native
object Quaternion extends js.Object {
  /**
    * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
    */
  def slerp(
    qa: threeLib.threeDashCoreMod.Quaternion,
    qb: threeLib.threeDashCoreMod.Quaternion,
    qm: threeLib.threeDashCoreMod.Quaternion,
    t: scala.Double
  ): threeLib.threeDashCoreMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[scala.Double],
    dstOffset: scala.Double,
    src0: js.Array[scala.Double],
    srcOffset: scala.Double,
    src1: js.Array[scala.Double],
    stcOffset1: scala.Double,
    t: scala.Double
  ): threeLib.threeDashCoreMod.Quaternion = js.native
}

