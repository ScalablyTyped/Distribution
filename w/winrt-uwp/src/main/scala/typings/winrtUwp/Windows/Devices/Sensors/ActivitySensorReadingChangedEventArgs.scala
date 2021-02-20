package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data for the reading–changed event of the sensor. */
@js.native
trait ActivitySensorReadingChangedEventArgs extends StObject {
  
  /** Gets the most recent sensor reading. */
  var reading: ActivitySensorReading = js.native
}
object ActivitySensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: ActivitySensorReading): ActivitySensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class ActivitySensorReadingChangedEventArgsMutableBuilder[Self <: ActivitySensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: ActivitySensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
