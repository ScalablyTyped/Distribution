package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonY extends js.Object {
  var x: Double
  var y: Double
  var z: Double
}

object AnonY {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): AnonY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonY]
  }
}

