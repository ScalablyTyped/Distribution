package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reading from the proximity sensor. */
trait ProximitySensorReading extends StObject {
  
  /** Gets the distance from the proximity sensor to the detected object. */
  var distanceInMillimeters: Double
  
  /** Gets whether or not an object is detected by the proximity sensor. */
  var isDetected: Boolean
  
  /** Gets the time for the most recent proximity sensor reading. */
  var timestamp: Date
}
object ProximitySensorReading {
  
  inline def apply(distanceInMillimeters: Double, isDetected: Boolean, timestamp: Date): ProximitySensorReading = {
    val __obj = js.Dynamic.literal(distanceInMillimeters = distanceInMillimeters.asInstanceOf[js.Any], isDetected = isDetected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReading]
  }
  
  extension [Self <: ProximitySensorReading](x: Self) {
    
    inline def setDistanceInMillimeters(value: Double): Self = StObject.set(x, "distanceInMillimeters", value.asInstanceOf[js.Any])
    
    inline def setIsDetected(value: Boolean): Self = StObject.set(x, "isDetected", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
