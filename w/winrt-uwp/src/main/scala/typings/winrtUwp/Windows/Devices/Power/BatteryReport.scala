package typings.winrtUwp.Windows.Devices.Power

import typings.winrtUwp.Windows.System.Power.BatteryStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
@js.native
trait BatteryReport extends js.Object {
  
  /** Gets the rate that the battery is charging. */
  var chargeRateInMilliwatts: Double = js.native
  
  /** Gets the estimated energy capacity of a new battery of this type. */
  var designCapacityInMilliwattHours: Double = js.native
  
  /** Gets the fully-charged energy capacity of the battery. */
  var fullChargeCapacityInMilliwattHours: Double = js.native
  
  /** Gets the remaining power capacity of the battery. */
  var remainingCapacityInMilliwattHours: Double = js.native
  
  /** Gets a BatteryStatus enumeration that indicates the status of the battery. */
  var status: BatteryStatus = js.native
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
  
  @scala.inline
  implicit class BatteryReportOps[Self <: BatteryReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChargeRateInMilliwatts(value: Double): Self = this.set("chargeRateInMilliwatts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignCapacityInMilliwattHours(value: Double): Self = this.set("designCapacityInMilliwattHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullChargeCapacityInMilliwattHours(value: Double): Self = this.set("fullChargeCapacityInMilliwattHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingCapacityInMilliwattHours(value: Double): Self = this.set("remainingCapacityInMilliwattHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BatteryStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
