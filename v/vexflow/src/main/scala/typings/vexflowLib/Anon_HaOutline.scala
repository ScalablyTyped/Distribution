package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HaOutline extends js.Object {
  var ha: scala.Double
  var outline: js.Array[scala.Double]
  var x_max: scala.Double
  var x_min: scala.Double
}

object Anon_HaOutline {
  @scala.inline
  def apply(ha: scala.Double, outline: js.Array[scala.Double], x_max: scala.Double, x_min: scala.Double): Anon_HaOutline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ha")(ha)
    __obj.updateDynamic("outline")(outline)
    __obj.updateDynamic("x_max")(x_max)
    __obj.updateDynamic("x_min")(x_min)
    __obj.asInstanceOf[Anon_HaOutline]
  }
}

