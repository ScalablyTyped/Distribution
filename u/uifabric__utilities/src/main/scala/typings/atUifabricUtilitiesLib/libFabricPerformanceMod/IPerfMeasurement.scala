package typings
package atUifabricUtilitiesLib.libFabricPerformanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerfMeasurement extends js.Object {
  var all: js.Array[IPerfData]
  var count: scala.Double
  var totalDuration: scala.Double
}

object IPerfMeasurement {
  @scala.inline
  def apply(all: js.Array[IPerfData], count: scala.Double, totalDuration: scala.Double): IPerfMeasurement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("totalDuration")(totalDuration)
    __obj.asInstanceOf[IPerfMeasurement]
  }
}

