package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatteryData extends js.Object {
  var acconnected: Boolean
  var currentcapacity: Double
  var cyclecount: Double
  var hasbattery: Boolean
  var ischarging: Boolean
  var manufacturer: String
  var maxcapacity: Double
  var model: String
  var percent: Double
  var serial: String
  var timeremaining: Double
  var `type`: String
}

object BatteryData {
  @scala.inline
  def apply(
    acconnected: Boolean,
    currentcapacity: Double,
    cyclecount: Double,
    hasbattery: Boolean,
    ischarging: Boolean,
    manufacturer: String,
    maxcapacity: Double,
    model: String,
    percent: Double,
    serial: String,
    timeremaining: Double,
    `type`: String
  ): BatteryData = {
    val __obj = js.Dynamic.literal(acconnected = acconnected, currentcapacity = currentcapacity, cyclecount = cyclecount, hasbattery = hasbattery, ischarging = ischarging, manufacturer = manufacturer, maxcapacity = maxcapacity, model = model, percent = percent, serial = serial, timeremaining = timeremaining)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BatteryData]
  }
}

