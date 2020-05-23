package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outline extends js.Object {
  var ha: Double
  var outline: js.Array[Double]
  var x_max: Double
  var x_min: Double
}

object Outline {
  @scala.inline
  def apply(ha: Double, outline: js.Array[Double], x_max: Double, x_min: Double): Outline = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outline]
  }
}

