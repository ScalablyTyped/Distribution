package typings.winrtDashUwp.Windows.Foundation.Numerics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a quaternion (an axis about which a rotation occurs and a rotation amount about that axis). */
trait Quaternion extends js.Object {
  /** The w component that represents a rotation amount about the axis that is defined by the X, Y, and Z fields. */
  var w: Double
  /** The x component of the vector that represents the axis about which a rotation occurs. */
  var x: Double
  /** The y component of the vector that represents the axis about which a rotation occurs. */
  var y: Double
  /** The z component of the vector that represents the axis about which a rotation occurs. */
  var z: Double
}

object Quaternion {
  @scala.inline
  def apply(w: Double, x: Double, y: Double, z: Double): Quaternion = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quaternion]
  }
}

