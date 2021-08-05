package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOrientationSensor extends StObject {
  
  def getCurrentReading(): OrientationSensorReading
  
  var minimumReportInterval: Double
  
  var onreadingchanged: js.Any
  
  var reportInterval: Double
}
object IOrientationSensor {
  
  inline def apply(
    getCurrentReading: () => OrientationSensorReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): IOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrientationSensor]
  }
  
  extension [Self <: IOrientationSensor](x: Self) {
    
    inline def setGetCurrentReading(value: () => OrientationSensorReading): Self = StObject.set(x, "getCurrentReading", js.Any.fromFunction0(value))
    
    inline def setMinimumReportInterval(value: Double): Self = StObject.set(x, "minimumReportInterval", value.asInstanceOf[js.Any])
    
    inline def setOnreadingchanged(value: js.Any): Self = StObject.set(x, "onreadingchanged", value.asInstanceOf[js.Any])
    
    inline def setReportInterval(value: Double): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
  }
}
