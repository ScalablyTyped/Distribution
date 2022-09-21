package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Sensors.ActivityType
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is activated when the ActivitySensor receives input. This is used when your application needs to respond to the activity sensor. */
@JSGlobal("Windows.ApplicationModel.Background.ActivitySensorTrigger")
@js.native
open class ActivitySensorTrigger protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.ActivitySensorTrigger {
  /**
    * Creates an instance of the ActivitySensorTrigger class with an initial MinimumReportInterval .
    * @param reportIntervalInMilliseconds The initial report interval to use for MinimumReportInterval .
    */
  def this(reportIntervalInMilliseconds: Double) = this()
  
  /** Gets the minimum supported report interval for the sensor trigger. */
  /* CompleteClass */
  var minimumReportInterval: Double = js.native
  
  /** Gets the report interval for the trigger. */
  /* CompleteClass */
  var reportInterval: Double = js.native
  
  /** Gets or sets the list of activities your trigger is subscribed to. */
  /* CompleteClass */
  var subscribedActivities: IVector[ActivityType] = js.native
  
  /** Gets the list of supported activities you can subscribe to. */
  /* CompleteClass */
  var supportedActivities: IVectorView[ActivityType] = js.native
}
