package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutline extends js.Object {
  var ha: Double
  var outline: js.Array[Double]
  var x_max: Double
  var x_min: Double
}

object AnonOutline {
  @scala.inline
  def apply(ha: Double, outline: js.Array[Double], x_max: Double, x_min: Double): AnonOutline = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOutline]
  }
}

