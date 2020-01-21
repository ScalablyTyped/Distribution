package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: Double
  var first_x: Double
  var first_y: Double
  var last_x: Double
  var last_y: Double
}

object AnonDirection {
  @scala.inline
  def apply(direction: Double, first_x: Double, first_y: Double, last_x: Double, last_y: Double): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x = first_x.asInstanceOf[js.Any], first_y = first_y.asInstanceOf[js.Any], last_x = last_x.asInstanceOf[js.Any], last_y = last_y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirection]
  }
}

