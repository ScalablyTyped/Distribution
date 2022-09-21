package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the reading of an activity sensor that provides readings for the sensor. */
trait ActivitySensorReading extends StObject {
  
  /** Gets the activity type for the sensor. */
  var activity: ActivityType
  
  /** Gets the reading confidence for the sensor. */
  var confidence: ActivitySensorReadingConfidence
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date
}
object ActivitySensorReading {
  
  inline def apply(activity: ActivityType, confidence: ActivitySensorReadingConfidence, timestamp: js.Date): ActivitySensorReading = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReading]
  }
  
  extension [Self <: ActivitySensorReading](x: Self) {
    
    inline def setActivity(value: ActivityType): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setConfidence(value: ActivitySensorReadingConfidence): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
