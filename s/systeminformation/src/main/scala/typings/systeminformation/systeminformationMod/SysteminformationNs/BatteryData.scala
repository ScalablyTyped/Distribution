package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatteryData extends js.Object {
  var currentcapacity: Double
  var cyclecount: Double
  var hasbatter: Boolean
  var ischarging: Boolean
  var maxcapacity: Double
  var percent: Double
}

object BatteryData {
  @scala.inline
  def apply(
    currentcapacity: Double,
    cyclecount: Double,
    hasbatter: Boolean,
    ischarging: Boolean,
    maxcapacity: Double,
    percent: Double
  ): BatteryData = {
    val __obj = js.Dynamic.literal(currentcapacity = currentcapacity, cyclecount = cyclecount, hasbatter = hasbatter, ischarging = ischarging, maxcapacity = maxcapacity, percent = percent)
  
    __obj.asInstanceOf[BatteryData]
  }
}

