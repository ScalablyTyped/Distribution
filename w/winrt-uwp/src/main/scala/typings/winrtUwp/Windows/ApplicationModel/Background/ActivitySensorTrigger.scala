package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Sensors.ActivityType
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is activated when the ActivitySensor receives input. This is used when your application needs to respond to the activity sensor. */
trait ActivitySensorTrigger extends StObject {
  
  /** Gets the minimum supported report interval for the sensor trigger. */
  var minimumReportInterval: Double
  
  /** Gets the report interval for the trigger. */
  var reportInterval: Double
  
  /** Gets or sets the list of activities your trigger is subscribed to. */
  var subscribedActivities: IVector[ActivityType]
  
  /** Gets the list of supported activities you can subscribe to. */
  var supportedActivities: IVectorView[ActivityType]
}
object ActivitySensorTrigger {
  
  inline def apply(
    minimumReportInterval: Double,
    reportInterval: Double,
    subscribedActivities: IVector[ActivityType],
    supportedActivities: IVectorView[ActivityType]
  ): ActivitySensorTrigger = {
    val __obj = js.Dynamic.literal(minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any], subscribedActivities = subscribedActivities.asInstanceOf[js.Any], supportedActivities = supportedActivities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivitySensorTrigger] (val x: Self) extends AnyVal {
    
    inline def setMinimumReportInterval(value: Double): Self = StObject.set(x, "minimumReportInterval", value.asInstanceOf[js.Any])
    
    inline def setReportInterval(value: Double): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
    
    inline def setSubscribedActivities(value: IVector[ActivityType]): Self = StObject.set(x, "subscribedActivities", value.asInstanceOf[js.Any])
    
    inline def setSupportedActivities(value: IVectorView[ActivityType]): Self = StObject.set(x, "supportedActivities", value.asInstanceOf[js.Any])
  }
}
