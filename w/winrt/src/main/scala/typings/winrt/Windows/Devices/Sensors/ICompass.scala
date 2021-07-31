package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompass extends StObject {
  
  def getCurrentReading(): CompassReading
  
  var minimumReportInterval: Double
  
  var onreadingchanged: js.Any
  
  var reportInterval: Double
}
object ICompass {
  
  @scala.inline
  def apply(
    getCurrentReading: () => CompassReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): ICompass = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompass]
  }
  
  @scala.inline
  implicit class ICompassMutableBuilder[Self <: ICompass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentReading(value: () => CompassReading): Self = StObject.set(x, "getCurrentReading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimumReportInterval(value: Double): Self = StObject.set(x, "minimumReportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnreadingchanged(value: js.Any): Self = StObject.set(x, "onreadingchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportInterval(value: Double): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
  }
}
