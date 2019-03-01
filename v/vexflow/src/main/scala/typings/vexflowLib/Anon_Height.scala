package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: scala.Double
  var width: scala.Double
  var x_max: scala.Double
  var x_min: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x_max: scala.Double, x_min: scala.Double): Anon_Height = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x_max")(x_max)
    __obj.updateDynamic("x_min")(x_min)
    __obj.asInstanceOf[Anon_Height]
  }
}

