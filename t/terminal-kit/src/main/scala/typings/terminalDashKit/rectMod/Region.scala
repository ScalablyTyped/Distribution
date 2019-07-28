package typings.terminalDashKit.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends Options {
  var xmax: Double
  var xmin: Double
  var ymax: Double
  var ymin: Double
}

object Region {
  @scala.inline
  def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Region = {
    val __obj = js.Dynamic.literal(xmax = xmax, xmin = xmin, ymax = ymax, ymin = ymin)
  
    __obj.asInstanceOf[Region]
  }
}

