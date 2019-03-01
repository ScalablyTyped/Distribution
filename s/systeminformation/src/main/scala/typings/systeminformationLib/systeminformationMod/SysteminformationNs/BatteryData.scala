package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatteryData extends js.Object {
  var currentcapacity: scala.Double
  var cyclecount: scala.Double
  var hasbatter: scala.Boolean
  var ischarging: scala.Boolean
  var maxcapacity: scala.Double
  var percent: scala.Double
}

object BatteryData {
  @scala.inline
  def apply(
    currentcapacity: scala.Double,
    cyclecount: scala.Double,
    hasbatter: scala.Boolean,
    ischarging: scala.Boolean,
    maxcapacity: scala.Double,
    percent: scala.Double
  ): BatteryData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentcapacity")(currentcapacity)
    __obj.updateDynamic("cyclecount")(cyclecount)
    __obj.updateDynamic("hasbatter")(hasbatter)
    __obj.updateDynamic("ischarging")(ischarging)
    __obj.updateDynamic("maxcapacity")(maxcapacity)
    __obj.updateDynamic("percent")(percent)
    __obj.asInstanceOf[BatteryData]
  }
}

