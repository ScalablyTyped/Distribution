package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a quaternion (an axis about which a rotation occurs and a rotation amount about that axis). */
trait Quaternion extends js.Object {
  /** The w component that represents a rotation amount about the axis that is defined by the X, Y, and Z fields. */
  var w: scala.Double
  /** The x component of the vector that represents the axis about which a rotation occurs. */
  var x: scala.Double
  /** The y component of the vector that represents the axis about which a rotation occurs. */
  var y: scala.Double
  /** The z component of the vector that represents the axis about which a rotation occurs. */
  var z: scala.Double
}

object Quaternion {
  @scala.inline
  def apply(w: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): Quaternion = {
    val __obj = js.Dynamic.literal(w = w, x = x, y = y, z = z)
  
    __obj.asInstanceOf[Quaternion]
  }
}

