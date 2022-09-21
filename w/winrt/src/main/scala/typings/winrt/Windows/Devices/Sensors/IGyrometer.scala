package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGyrometer extends StObject {
  
  def getCurrentReading(): GyrometerReading
  
  var minimumReportInterval: Double
  
  var onreadingchanged: Any
  
  var reportInterval: Double
}
object IGyrometer {
  
  inline def apply(
    getCurrentReading: () => GyrometerReading,
    minimumReportInterval: Double,
    onreadingchanged: Any,
    reportInterval: Double
  ): IGyrometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGyrometer]
  }
  
  extension [Self <: IGyrometer](x: Self) {
    
    inline def setGetCurrentReading(value: () => GyrometerReading): Self = StObject.set(x, "getCurrentReading", js.Any.fromFunction0(value))
    
    inline def setMinimumReportInterval(value: Double): Self = StObject.set(x, "minimumReportInterval", value.asInstanceOf[js.Any])
    
    inline def setOnreadingchanged(value: Any): Self = StObject.set(x, "onreadingchanged", value.asInstanceOf[js.Any])
    
    inline def setReportInterval(value: Double): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
  }
}
