package typings.atUifabricUtilities.libFabricPerformanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerfMeasurement extends js.Object {
  var all: js.Array[IPerfData]
  var count: Double
  var totalDuration: Double
}

object IPerfMeasurement {
  @scala.inline
  def apply(all: js.Array[IPerfData], count: Double, totalDuration: Double): IPerfMeasurement = {
    val __obj = js.Dynamic.literal(all = all, count = count, totalDuration = totalDuration)
  
    __obj.asInstanceOf[IPerfMeasurement]
  }
}

