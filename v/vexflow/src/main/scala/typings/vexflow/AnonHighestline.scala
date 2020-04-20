package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighestline extends js.Object {
  var highest_line: Double
  var lowest_line: Double
  var y_bottom: Double
  var y_top: Double
}

object AnonHighestline {
  @scala.inline
  def apply(highest_line: Double, lowest_line: Double, y_bottom: Double, y_top: Double): AnonHighestline = {
    val __obj = js.Dynamic.literal(highest_line = highest_line.asInstanceOf[js.Any], lowest_line = lowest_line.asInstanceOf[js.Any], y_bottom = y_bottom.asInstanceOf[js.Any], y_top = y_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighestline]
  }
}

