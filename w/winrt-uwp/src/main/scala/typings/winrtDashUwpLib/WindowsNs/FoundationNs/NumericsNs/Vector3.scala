package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a vector of three floating-point components. */
trait Vector3 extends js.Object {
  /** The x component of the vector. */
  var x: scala.Double
  /** The y component of the vector. */
  var y: scala.Double
  /** The z component of the vector. */
  var z: scala.Double
}

object Vector3 {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[Vector3]
  }
}

