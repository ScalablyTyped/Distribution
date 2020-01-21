package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionFirstxpx extends js.Object {
  var direction: Double
  var first_x_px: Double
  var first_ys: js.Array[Double]
  var last_x_px: Double
  var last_ys: js.Array[Double]
}

object AnonDirectionFirstxpx {
  @scala.inline
  def apply(
    direction: Double,
    first_x_px: Double,
    first_ys: js.Array[Double],
    last_x_px: Double,
    last_ys: js.Array[Double]
  ): AnonDirectionFirstxpx = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x_px = first_x_px.asInstanceOf[js.Any], first_ys = first_ys.asInstanceOf[js.Any], last_x_px = last_x_px.asInstanceOf[js.Any], last_ys = last_ys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionFirstxpx]
  }
}

