package typings.winrtUwp.Windows.Foundation.Numerics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a vector of two floating-point components. */
trait Vector2 extends js.Object {
  /** The x component of the vector. */
  var x: Double
  /** The y component of the vector. */
  var y: Double
}

object Vector2 {
  @scala.inline
  def apply(x: Double, y: Double): Vector2 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Vector2]
  }
}

