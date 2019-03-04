package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a vector of two floating-point components. */
trait Vector2 extends js.Object {
  /** The x component of the vector. */
  var x: scala.Double
  /** The y component of the vector. */
  var y: scala.Double
}

object Vector2 {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Vector2 = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Vector2]
  }
}

