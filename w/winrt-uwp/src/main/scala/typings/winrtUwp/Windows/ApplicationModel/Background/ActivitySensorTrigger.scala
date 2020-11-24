package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Sensors.ActivityType
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is activated when the ActivitySensor receives input. This is used when your application needs to respond to the activity sensor. */
@js.native
trait ActivitySensorTrigger extends js.Object {
  
  /** Gets the minimum supported report interval for the sensor trigger. */
  var minimumReportInterval: Double = js.native
  
  /** Gets the report interval for the trigger. */
  var reportInterval: Double = js.native
  
  /** Gets or sets the list of activities your trigger is subscribed to. */
  var subscribedActivities: IVector[ActivityType] = js.native
  
  /** Gets the list of supported activities you can subscribe to. */
  var supportedActivities: IVectorView[ActivityType] = js.native
}
object ActivitySensorTrigger {
  
  @scala.inline
  def apply(
    minimumReportInterval: Double,
    reportInterval: Double,
    subscribedActivities: IVector[ActivityType],
    supportedActivities: IVectorView[ActivityType]
  ): ActivitySensorTrigger = {
    val __obj = js.Dynamic.literal(minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any], subscribedActivities = subscribedActivities.asInstanceOf[js.Any], supportedActivities = supportedActivities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorTrigger]
  }
  
  @scala.inline
  implicit class ActivitySensorTriggerOps[Self <: ActivitySensorTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMinimumReportInterval(value: Double): Self = this.set("minimumReportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportInterval(value: Double): Self = this.set("reportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedActivities(value: IVector[ActivityType]): Self = this.set("subscribedActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedActivities(value: IVectorView[ActivityType]): Self = this.set("supportedActivities", value.asInstanceOf[js.Any])
  }
}
