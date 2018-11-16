package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PowerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
@JSGlobal("Windows.Devices.Power.BatteryReport")
@js.native
abstract class BatteryReport () extends js.Object {
  /** Gets the rate that the battery is charging. */
  var chargeRateInMilliwatts: scala.Double = js.native
  /** Gets the estimated energy capacity of a new battery of this type. */
  var designCapacityInMilliwattHours: scala.Double = js.native
  /** Gets the fully-charged energy capacity of the battery. */
  var fullChargeCapacityInMilliwattHours: scala.Double = js.native
  /** Gets the remaining power capacity of the battery. */
  var remainingCapacityInMilliwattHours: scala.Double = js.native
  /** Gets a BatteryStatus enumeration that indicates the status of the battery. */
  var status: winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.BatteryStatus = js.native
}

