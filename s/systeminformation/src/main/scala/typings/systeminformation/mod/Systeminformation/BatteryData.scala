package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatteryData extends js.Object {
  var acconnected: Boolean
  var capacityUnit: String
  var currentcapacity: Double
  var cyclecount: Double
  var designedcapacity: Double
  var hasbattery: Boolean
  var ischarging: Boolean
  var manufacturer: String
  var maxcapacity: Double
  var model: String
  var percent: Double
  var serial: String
  var timeremaining: Double
  var `type`: String
  var voltage: Double
}

object BatteryData {
  @scala.inline
  def apply(
    acconnected: Boolean,
    capacityUnit: String,
    currentcapacity: Double,
    cyclecount: Double,
    designedcapacity: Double,
    hasbattery: Boolean,
    ischarging: Boolean,
    manufacturer: String,
    maxcapacity: Double,
    model: String,
    percent: Double,
    serial: String,
    timeremaining: Double,
    `type`: String,
    voltage: Double
  ): BatteryData = {
    val __obj = js.Dynamic.literal(acconnected = acconnected.asInstanceOf[js.Any], capacityUnit = capacityUnit.asInstanceOf[js.Any], currentcapacity = currentcapacity.asInstanceOf[js.Any], cyclecount = cyclecount.asInstanceOf[js.Any], designedcapacity = designedcapacity.asInstanceOf[js.Any], hasbattery = hasbattery.asInstanceOf[js.Any], ischarging = ischarging.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], maxcapacity = maxcapacity.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], timeremaining = timeremaining.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatteryData]
  }
}

