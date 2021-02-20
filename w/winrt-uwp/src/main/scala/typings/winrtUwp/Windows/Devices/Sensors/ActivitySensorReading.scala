package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the reading of an activity sensor that provides readings for the sensor. */
@js.native
trait ActivitySensorReading extends StObject {
  
  /** Gets the activity type for the sensor. */
  var activity: ActivityType = js.native
  
  /** Gets the reading confidence for the sensor. */
  var confidence: ActivitySensorReadingConfidence = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}
object ActivitySensorReading {
  
  @scala.inline
  def apply(activity: ActivityType, confidence: ActivitySensorReadingConfidence, timestamp: Date): ActivitySensorReading = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReading]
  }
  
  @scala.inline
  implicit class ActivitySensorReadingMutableBuilder[Self <: ActivitySensorReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: ActivityType): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: ActivitySensorReadingConfidence): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
