package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HaOutline extends js.Object {
  var ha: Double
  var outline: js.Array[Double]
  var x_max: Double
  var x_min: Double
}

object Anon_HaOutline {
  @scala.inline
  def apply(ha: Double, outline: js.Array[Double], x_max: Double, x_min: Double): Anon_HaOutline = {
    val __obj = js.Dynamic.literal(ha = ha, outline = outline, x_max = x_max, x_min = x_min)
  
    __obj.asInstanceOf[Anon_HaOutline]
  }
}

