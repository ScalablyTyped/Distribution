package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: Double
  var first_x: Double
  var first_y: Double
  var last_x: Double
  var last_y: Double
}

object Anon_Direction {
  @scala.inline
  def apply(direction: Double, first_x: Double, first_y: Double, last_x: Double, last_y: Double): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, first_x = first_x, first_y = first_y, last_x = last_x, last_y = last_y)
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

