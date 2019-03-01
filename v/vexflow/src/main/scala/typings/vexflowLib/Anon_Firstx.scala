package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Firstx extends js.Object {
  var first_x: scala.Double
  var first_y: scala.Double
  var last_x: scala.Double
  var last_y: scala.Double
  var staff_height: scala.Double
}

object Anon_Firstx {
  @scala.inline
  def apply(
    first_x: scala.Double,
    first_y: scala.Double,
    last_x: scala.Double,
    last_y: scala.Double,
    staff_height: scala.Double
  ): Anon_Firstx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first_x")(first_x)
    __obj.updateDynamic("first_y")(first_y)
    __obj.updateDynamic("last_x")(last_x)
    __obj.updateDynamic("last_y")(last_y)
    __obj.updateDynamic("staff_height")(staff_height)
    __obj.asInstanceOf[Anon_Firstx]
  }
}

