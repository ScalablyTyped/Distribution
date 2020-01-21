package typings.terminalKit.rectMod

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
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Region]
  }
}

