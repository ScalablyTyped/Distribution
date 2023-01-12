package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the orientation-sensor reading-changed event. */
trait OrientationSensorReadingChangedEventArgs extends StObject {
  
  /** Gets the current reading which includes a Quaternion, a RotationMatrix, and a timestamp. */
  var reading: OrientationSensorReading
}
object OrientationSensorReadingChangedEventArgs {
  
  inline def apply(reading: OrientationSensorReading): OrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrientationSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: OrientationSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
