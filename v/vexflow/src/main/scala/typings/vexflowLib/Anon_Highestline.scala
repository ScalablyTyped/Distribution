package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Highestline extends js.Object {
  var highest_line: scala.Double
  var lowest_line: scala.Double
  var y_bottom: scala.Double
  var y_top: scala.Double
}

object Anon_Highestline {
  @scala.inline
  def apply(highest_line: scala.Double, lowest_line: scala.Double, y_bottom: scala.Double, y_top: scala.Double): Anon_Highestline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("highest_line")(highest_line)
    __obj.updateDynamic("lowest_line")(lowest_line)
    __obj.updateDynamic("y_bottom")(y_bottom)
    __obj.updateDynamic("y_top")(y_top)
    __obj.asInstanceOf[Anon_Highestline]
  }
}

