package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseSchedule extends StObject {
  
  /**
    * Days of the week to release
    */
  var daysToRelease: ScheduleDays
  
  /**
    * Team Foundation Job Definition Job Id
    */
  var jobId: String
  
  /**
    * Local time zone hour to start
    */
  var startHours: Double
  
  /**
    * Local time zone minute to start
    */
  var startMinutes: Double
  
  /**
    * Time zone Id of release schedule, such as 'UTC'
    */
  var timeZoneId: String
}
object ReleaseSchedule {
  
  inline def apply(
    daysToRelease: ScheduleDays,
    jobId: String,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): ReleaseSchedule = {
    val __obj = js.Dynamic.literal(daysToRelease = daysToRelease.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], startHours = startHours.asInstanceOf[js.Any], startMinutes = startMinutes.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSchedule]
  }
  
  extension [Self <: ReleaseSchedule](x: Self) {
    
    inline def setDaysToRelease(value: ScheduleDays): Self = StObject.set(x, "daysToRelease", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setStartHours(value: Double): Self = StObject.set(x, "startHours", value.asInstanceOf[js.Any])
    
    inline def setStartMinutes(value: Double): Self = StObject.set(x, "startMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
  }
}
