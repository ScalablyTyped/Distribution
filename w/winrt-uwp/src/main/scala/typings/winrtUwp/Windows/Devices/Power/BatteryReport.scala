package typings.winrtUwp.Windows.Devices.Power

import typings.winrtUwp.Windows.System.Power.BatteryStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
trait BatteryReport extends js.Object {
  /** Gets the rate that the battery is charging. */
  var chargeRateInMilliwatts: Double
  /** Gets the estimated energy capacity of a new battery of this type. */
  var designCapacityInMilliwattHours: Double
  /** Gets the fully-charged energy capacity of the battery. */
  var fullChargeCapacityInMilliwattHours: Double
  /** Gets the remaining power capacity of the battery. */
  var remainingCapacityInMilliwattHours: Double
  /** Gets a BatteryStatus enumeration that indicates the status of the battery. */
  var status: BatteryStatus
}

object BatteryReport {
  @scala.inline
  def apply(
    chargeRateInMilliwatts: Double,
    designCapacityInMilliwattHours: Double,
    fullChargeCapacityInMilliwattHours: Double,
    remainingCapacityInMilliwattHours: Double,
    status: BatteryStatus
  ): BatteryReport = {
    val __obj = js.Dynamic.literal(chargeRateInMilliwatts = chargeRateInMilliwatts.asInstanceOf[js.Any], designCapacityInMilliwattHours = designCapacityInMilliwattHours.asInstanceOf[js.Any], fullChargeCapacityInMilliwattHours = fullChargeCapacityInMilliwattHours.asInstanceOf[js.Any], remainingCapacityInMilliwattHours = remainingCapacityInMilliwattHours.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatteryReport]
  }
}

