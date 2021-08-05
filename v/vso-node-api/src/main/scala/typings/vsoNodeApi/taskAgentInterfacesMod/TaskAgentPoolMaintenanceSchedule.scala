package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentPoolMaintenanceSchedule extends StObject {
  
  /**
    * Days for a build (flags enum for days of the week)
    */
  var daysToBuild: TaskAgentPoolMaintenanceScheduleDays
  
  /**
    * The Job Id of the Scheduled job that will queue the pool maintenance job.
    */
  var scheduleJobId: String
  
  /**
    * Local timezone hour to start
    */
  var startHours: Double
  
  /**
    * Local timezone minute to start
    */
  var startMinutes: Double
  
  /**
    * Time zone of the build schedule (string representation of the time zone id)
    */
  var timeZoneId: String
}
object TaskAgentPoolMaintenanceSchedule {
  
  inline def apply(
    daysToBuild: TaskAgentPoolMaintenanceScheduleDays,
    scheduleJobId: String,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): TaskAgentPoolMaintenanceSchedule = {
    val __obj = js.Dynamic.literal(daysToBuild = daysToBuild.asInstanceOf[js.Any], scheduleJobId = scheduleJobId.asInstanceOf[js.Any], startHours = startHours.asInstanceOf[js.Any], startMinutes = startMinutes.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceSchedule]
  }
  
  extension [Self <: TaskAgentPoolMaintenanceSchedule](x: Self) {
    
    inline def setDaysToBuild(value: TaskAgentPoolMaintenanceScheduleDays): Self = StObject.set(x, "daysToBuild", value.asInstanceOf[js.Any])
    
    inline def setScheduleJobId(value: String): Self = StObject.set(x, "scheduleJobId", value.asInstanceOf[js.Any])
    
    inline def setStartHours(value: Double): Self = StObject.set(x, "startHours", value.asInstanceOf[js.Any])
    
    inline def setStartMinutes(value: Double): Self = StObject.set(x, "startMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
  }
}
