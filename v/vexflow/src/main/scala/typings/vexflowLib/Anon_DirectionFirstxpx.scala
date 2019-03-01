package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectionFirstxpx extends js.Object {
  var direction: scala.Double
  var first_x_px: scala.Double
  var first_ys: js.Array[scala.Double]
  var last_x_px: scala.Double
  var last_ys: js.Array[scala.Double]
}

object Anon_DirectionFirstxpx {
  @scala.inline
  def apply(
    direction: scala.Double,
    first_x_px: scala.Double,
    first_ys: js.Array[scala.Double],
    last_x_px: scala.Double,
    last_ys: js.Array[scala.Double]
  ): Anon_DirectionFirstxpx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("first_x_px")(first_x_px)
    __obj.updateDynamic("first_ys")(first_ys)
    __obj.updateDynamic("last_x_px")(last_x_px)
    __obj.updateDynamic("last_ys")(last_ys)
    __obj.asInstanceOf[Anon_DirectionFirstxpx]
  }
}

