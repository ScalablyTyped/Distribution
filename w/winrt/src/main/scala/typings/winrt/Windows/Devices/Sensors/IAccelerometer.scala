package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccelerometer extends StObject {
  
  def getCurrentReading(): AccelerometerReading
  
  var minimumReportInterval: Double
  
  var onreadingchanged: js.Any
  
  var onshaken: js.Any
  
  var reportInterval: Double
}
object IAccelerometer {
  
  @scala.inline
  def apply(
    getCurrentReading: () => AccelerometerReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    onshaken: js.Any,
    reportInterval: Double
  ): IAccelerometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], onshaken = onshaken.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometer]
  }
  
  @scala.inline
  implicit class IAccelerometerMutableBuilder[Self <: IAccelerometer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentReading(value: () => AccelerometerReading): Self = StObject.set(x, "getCurrentReading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimumReportInterval(value: Double): Self = StObject.set(x, "minimumReportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnreadingchanged(value: js.Any): Self = StObject.set(x, "onreadingchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnshaken(value: js.Any): Self = StObject.set(x, "onshaken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportInterval(value: Double): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
  }
}
