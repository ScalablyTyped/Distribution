package typings.vec3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var x: Double
  var y: Double
  var z: Double
}

object AnonX {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): AnonX = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

