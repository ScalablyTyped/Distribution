package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Availablespare extends StObject {
  
  var available_spare: js.UndefOr[Double] = js.undefined
  
  var available_spare_threshold: js.UndefOr[Double] = js.undefined
  
  var controller_busy_time: js.UndefOr[Double] = js.undefined
  
  var critical_comp_time: js.UndefOr[Double] = js.undefined
  
  var critical_warning: js.UndefOr[Double] = js.undefined
  
  var data_units_read: js.UndefOr[Double] = js.undefined
  
  var data_units_written: js.UndefOr[Double] = js.undefined
  
  var host_reads: js.UndefOr[Double] = js.undefined
  
  var host_writes: js.UndefOr[Double] = js.undefined
  
  var media_errors: js.UndefOr[Double] = js.undefined
  
  var num_err_log_entries: js.UndefOr[Double] = js.undefined
  
  var percentage_used: js.UndefOr[Double] = js.undefined
  
  var power_cycles: js.UndefOr[Double] = js.undefined
  
  var power_on_hours: js.UndefOr[Double] = js.undefined
  
  var temperature: js.UndefOr[Double] = js.undefined
  
  var temperature_sensors: js.UndefOr[js.Array[Double]] = js.undefined
  
  var unsafe_shutdowns: js.UndefOr[Double] = js.undefined
  
  var warning_temp_time: js.UndefOr[Double] = js.undefined
}
object Availablespare {
  
  inline def apply(): Availablespare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Availablespare]
  }
  
  extension [Self <: Availablespare](x: Self) {
    
    inline def setAvailable_spare(value: Double): Self = StObject.set(x, "available_spare", value.asInstanceOf[js.Any])
    
    inline def setAvailable_spareUndefined: Self = StObject.set(x, "available_spare", js.undefined)
    
    inline def setAvailable_spare_threshold(value: Double): Self = StObject.set(x, "available_spare_threshold", value.asInstanceOf[js.Any])
    
    inline def setAvailable_spare_thresholdUndefined: Self = StObject.set(x, "available_spare_threshold", js.undefined)
    
    inline def setController_busy_time(value: Double): Self = StObject.set(x, "controller_busy_time", value.asInstanceOf[js.Any])
    
    inline def setController_busy_timeUndefined: Self = StObject.set(x, "controller_busy_time", js.undefined)
    
    inline def setCritical_comp_time(value: Double): Self = StObject.set(x, "critical_comp_time", value.asInstanceOf[js.Any])
    
    inline def setCritical_comp_timeUndefined: Self = StObject.set(x, "critical_comp_time", js.undefined)
    
    inline def setCritical_warning(value: Double): Self = StObject.set(x, "critical_warning", value.asInstanceOf[js.Any])
    
    inline def setCritical_warningUndefined: Self = StObject.set(x, "critical_warning", js.undefined)
    
    inline def setData_units_read(value: Double): Self = StObject.set(x, "data_units_read", value.asInstanceOf[js.Any])
    
    inline def setData_units_readUndefined: Self = StObject.set(x, "data_units_read", js.undefined)
    
    inline def setData_units_written(value: Double): Self = StObject.set(x, "data_units_written", value.asInstanceOf[js.Any])
    
    inline def setData_units_writtenUndefined: Self = StObject.set(x, "data_units_written", js.undefined)
    
    inline def setHost_reads(value: Double): Self = StObject.set(x, "host_reads", value.asInstanceOf[js.Any])
    
    inline def setHost_readsUndefined: Self = StObject.set(x, "host_reads", js.undefined)
    
    inline def setHost_writes(value: Double): Self = StObject.set(x, "host_writes", value.asInstanceOf[js.Any])
    
    inline def setHost_writesUndefined: Self = StObject.set(x, "host_writes", js.undefined)
    
    inline def setMedia_errors(value: Double): Self = StObject.set(x, "media_errors", value.asInstanceOf[js.Any])
    
    inline def setMedia_errorsUndefined: Self = StObject.set(x, "media_errors", js.undefined)
    
    inline def setNum_err_log_entries(value: Double): Self = StObject.set(x, "num_err_log_entries", value.asInstanceOf[js.Any])
    
    inline def setNum_err_log_entriesUndefined: Self = StObject.set(x, "num_err_log_entries", js.undefined)
    
    inline def setPercentage_used(value: Double): Self = StObject.set(x, "percentage_used", value.asInstanceOf[js.Any])
    
    inline def setPercentage_usedUndefined: Self = StObject.set(x, "percentage_used", js.undefined)
    
    inline def setPower_cycles(value: Double): Self = StObject.set(x, "power_cycles", value.asInstanceOf[js.Any])
    
    inline def setPower_cyclesUndefined: Self = StObject.set(x, "power_cycles", js.undefined)
    
    inline def setPower_on_hours(value: Double): Self = StObject.set(x, "power_on_hours", value.asInstanceOf[js.Any])
    
    inline def setPower_on_hoursUndefined: Self = StObject.set(x, "power_on_hours", js.undefined)
    
    inline def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    inline def setTemperatureUndefined: Self = StObject.set(x, "temperature", js.undefined)
    
    inline def setTemperature_sensors(value: js.Array[Double]): Self = StObject.set(x, "temperature_sensors", value.asInstanceOf[js.Any])
    
    inline def setTemperature_sensorsUndefined: Self = StObject.set(x, "temperature_sensors", js.undefined)
    
    inline def setTemperature_sensorsVarargs(value: Double*): Self = StObject.set(x, "temperature_sensors", js.Array(value*))
    
    inline def setUnsafe_shutdowns(value: Double): Self = StObject.set(x, "unsafe_shutdowns", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_shutdownsUndefined: Self = StObject.set(x, "unsafe_shutdowns", js.undefined)
    
    inline def setWarning_temp_time(value: Double): Self = StObject.set(x, "warning_temp_time", value.asInstanceOf[js.Any])
    
    inline def setWarning_temp_timeUndefined: Self = StObject.set(x, "warning_temp_time", js.undefined)
  }
}
