package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: scala.Double
  var first_x: scala.Double
  var first_y: scala.Double
  var last_x: scala.Double
  var last_y: scala.Double
}

object Anon_Direction {
  @scala.inline
  def apply(
    direction: scala.Double,
    first_x: scala.Double,
    first_y: scala.Double,
    last_x: scala.Double,
    last_y: scala.Double
  ): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, first_x = first_x, first_y = first_y, last_x = last_x, last_y = last_y)
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

