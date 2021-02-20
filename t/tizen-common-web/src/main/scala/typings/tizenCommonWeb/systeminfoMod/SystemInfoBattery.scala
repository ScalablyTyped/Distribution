package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoBattery extends SystemInfoProperty {
  
  /**
    * Indicates whether the battery source is currently charging.
    */
  val isCharging: Boolean = js.native
  
  /**
    * An attribute to specify the remaining level of an internal battery, scaled from ***0*** to ***1***:
    * - ***0 ***indicates that the battery level is the lowest and the system is about to enter shutdown mode.
    * - ***1 ***indicates that the system's charge is maximum.
    * Any threshold parameter used in a watch operation to monitor this property applies to this attribute.
    */
  val level: Double = js.native
  
  /**
    * Estimated time to discharge, in minutes.
    *
    * This parameter is mutually exclusive with parameter `timeToFullCharge`.
    * An attribute `timeToDischarge` becomes ***null*** when device is plugged.
    *
    * This attribute may equal to ***-1*** indicating there is no enough collected data, which means
    * that the device is still learning device's power usage characteristics and cannot predict the time yet.
    * This process may take up to few days.
    *
    * @since 4.0
    */
  val timeToDischarge: js.UndefOr[Double] = js.native
  
  /**
    * Estimated time to finish charging battery, in minutes.
    *
    * This parameter is mutually exclusive with parameter `timeToDischarge`.
    * An attribute `timeToFullCharge` becomes ***null*** when device is unplugged.
    *
    * This attribute may equal to ***-1*** indicating there is no enough collected data, which means
    * that the device is still learning device's power usage characteristics and cannot predict the time yet.
    * This process may take up to few days.
    *
    * @since 4.0
    */
  val timeToFullCharge: js.UndefOr[Double] = js.native
}
object SystemInfoBattery {
  
  @scala.inline
  def apply(isCharging: Boolean, level: Double): SystemInfoBattery = {
    val __obj = js.Dynamic.literal(isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoBattery]
  }
  
  @scala.inline
  implicit class SystemInfoBatteryMutableBuilder[Self <: SystemInfoBattery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCharging(value: Boolean): Self = StObject.set(x, "isCharging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToDischarge(value: Double): Self = StObject.set(x, "timeToDischarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToDischargeUndefined: Self = StObject.set(x, "timeToDischarge", js.undefined)
    
    @scala.inline
    def setTimeToFullCharge(value: Double): Self = StObject.set(x, "timeToFullCharge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToFullChargeUndefined: Self = StObject.set(x, "timeToFullCharge", js.undefined)
  }
}
