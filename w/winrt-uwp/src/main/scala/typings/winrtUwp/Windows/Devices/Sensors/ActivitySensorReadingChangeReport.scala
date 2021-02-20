package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data for the sensor trigger. */
@js.native
trait ActivitySensorReadingChangeReport extends StObject {
  
  /** Gets the reading of the sensor when it's triggered. */
  var reading: ActivitySensorReading = js.native
}
object ActivitySensorReadingChangeReport {
  
  @scala.inline
  def apply(reading: ActivitySensorReading): ActivitySensorReadingChangeReport = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReadingChangeReport]
  }
  
  @scala.inline
  implicit class ActivitySensorReadingChangeReportMutableBuilder[Self <: ActivitySensorReadingChangeReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: ActivitySensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
