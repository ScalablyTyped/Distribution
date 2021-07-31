package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightSensor
  extends StObject
     with ILightSensor
object LightSensor {
  
  @scala.inline
  def apply(
    getCurrentReading: () => LightSensorReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): LightSensor = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensor]
  }
}
