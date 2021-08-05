package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the sensor reading–changed event. */
trait SimpleOrientationSensorOrientationChangedEventArgs extends StObject {
  
  /** Gets the current sensor orientation. */
  var orientation: SimpleOrientation
  
  /** Gets the time of the current sensor reading. */
  var timestamp: Date
}
object SimpleOrientationSensorOrientationChangedEventArgs {
  
  inline def apply(orientation: SimpleOrientation, timestamp: Date): SimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensorOrientationChangedEventArgs]
  }
  
  extension [Self <: SimpleOrientationSensorOrientationChangedEventArgs](x: Self) {
    
    inline def setOrientation(value: SimpleOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
