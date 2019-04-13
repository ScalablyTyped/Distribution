package typings
package terminalDashKitLib.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends Options {
  var xmax: scala.Double
  var xmin: scala.Double
  var ymax: scala.Double
  var ymin: scala.Double
}

object Region {
  @scala.inline
  def apply(xmax: scala.Double, xmin: scala.Double, ymax: scala.Double, ymin: scala.Double): Region = {
    val __obj = js.Dynamic.literal(xmax = xmax, xmin = xmin, ymax = ymax, ymin = ymin)
  
    __obj.asInstanceOf[Region]
  }
}

