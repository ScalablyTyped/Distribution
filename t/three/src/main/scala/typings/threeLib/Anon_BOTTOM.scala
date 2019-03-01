package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BOTTOM extends js.Object {
  var BOTTOM: scala.Double
  var LEFT: scala.Double
  var RIGHT: scala.Double
  var UP: scala.Double
}

object Anon_BOTTOM {
  @scala.inline
  def apply(BOTTOM: scala.Double, LEFT: scala.Double, RIGHT: scala.Double, UP: scala.Double): Anon_BOTTOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOTTOM")(BOTTOM)
    __obj.updateDynamic("LEFT")(LEFT)
    __obj.updateDynamic("RIGHT")(RIGHT)
    __obj.updateDynamic("UP")(UP)
    __obj.asInstanceOf[Anon_BOTTOM]
  }
}

