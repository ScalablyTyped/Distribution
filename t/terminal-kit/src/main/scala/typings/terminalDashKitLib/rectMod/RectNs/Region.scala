package typings
package terminalDashKitLib.rectMod.RectNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xmax")(xmax)
    __obj.updateDynamic("xmin")(xmin)
    __obj.updateDynamic("ymax")(ymax)
    __obj.updateDynamic("ymin")(ymin)
    __obj.asInstanceOf[Region]
  }
}

