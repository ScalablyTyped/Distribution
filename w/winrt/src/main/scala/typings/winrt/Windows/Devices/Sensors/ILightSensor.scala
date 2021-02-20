package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightSensor extends StObject {
  
  def getCurrentReading(): LightSensorReading = js.native
  
  var minimumReportInterval: Double = js.native
  
  var onreadingchanged: js.Any = js.native
  
  var reportInterval: Double = js.native
}
object ILightSensor {
  
  @scala.inline
  def apply(
    getCurrentReading: () => LightSensorReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): ILightSensor = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightSensor]
  }
  
  @scala.inline
  implicit class ILightSensorMutableBuilder[Self <: ILightSensor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentReading(value: () => LightSensorReading): Self = StObject.set(x, "getCurrentReading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimumReportInterval(value: Double): Self = StObject.set(x, "minimumReportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnreadingchanged(value: js.Any): Self = StObject.set(x, "onreadingchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportInterval(value: Double): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
  }
}
