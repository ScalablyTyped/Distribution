package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightSensor extends StObject {
  
  def getCurrentReading(): LightSensorReading
  
  var minimumReportInterval: Double
  
  var onreadingchanged: Any
  
  var reportInterval: Double
}
object ILightSensor {
  
  inline def apply(
    getCurrentReading: () => LightSensorReading,
    minimumReportInterval: Double,
    onreadingchanged: Any,
    reportInterval: Double
  ): ILightSensor = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightSensor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILightSensor] (val x: Self) extends AnyVal {
    
    inline def setGetCurrentReading(value: () => LightSensorReading): Self = StObject.set(x, "getCurrentReading", js.Any.fromFunction0(value))
    
    inline def setMinimumReportInterval(value: Double): Self = StObject.set(x, "minimumReportInterval", value.asInstanceOf[js.Any])
    
    inline def setOnreadingchanged(value: Any): Self = StObject.set(x, "onreadingchanged", value.asInstanceOf[js.Any])
    
    inline def setReportInterval(value: Double): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
  }
}
