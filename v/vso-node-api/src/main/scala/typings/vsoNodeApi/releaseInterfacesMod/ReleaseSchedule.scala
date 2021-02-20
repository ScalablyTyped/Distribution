package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseSchedule extends StObject {
  
  /**
    * Days of the week to release
    */
  var daysToRelease: ScheduleDays = js.native
  
  /**
    * Team Foundation Job Definition Job Id
    */
  var jobId: String = js.native
  
  /**
    * Local time zone hour to start
    */
  var startHours: Double = js.native
  
  /**
    * Local time zone minute to start
    */
  var startMinutes: Double = js.native
  
  /**
    * Time zone Id of release schedule, such as 'UTC'
    */
  var timeZoneId: String = js.native
}
object ReleaseSchedule {
  
  @scala.inline
  def apply(
    daysToRelease: ScheduleDays,
    jobId: String,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): ReleaseSchedule = {
    val __obj = js.Dynamic.literal(daysToRelease = daysToRelease.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], startHours = startHours.asInstanceOf[js.Any], startMinutes = startMinutes.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSchedule]
  }
  
  @scala.inline
  implicit class ReleaseScheduleMutableBuilder[Self <: ReleaseSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToRelease(value: ScheduleDays): Self = StObject.set(x, "daysToRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHours(value: Double): Self = StObject.set(x, "startHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinutes(value: Double): Self = StObject.set(x, "startMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
  }
}
