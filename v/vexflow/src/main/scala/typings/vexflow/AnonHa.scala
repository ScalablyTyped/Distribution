package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHa extends js.Object {
  var ha: Double
  var o: js.Array[String]
  var x_max: Double
  var x_min: Double
}

object AnonHa {
  @scala.inline
  def apply(ha: Double, o: js.Array[String], x_max: Double, x_min: Double): AnonHa = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHa]
  }
}

