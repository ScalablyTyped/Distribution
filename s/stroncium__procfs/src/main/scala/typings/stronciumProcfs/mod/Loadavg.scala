package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loadavg extends StObject {
  
  var existingEntities: Double
  
  var jobsAverage15Minutes: Double
  
  var jobsAverage1Minute: Double
  
  var jobsAverage5Minutes: Double
  
  var mostRecentlyCreatedPid: Double
  
  var runnableEntities: Double
}
object Loadavg {
  
  inline def apply(
    existingEntities: Double,
    jobsAverage15Minutes: Double,
    jobsAverage1Minute: Double,
    jobsAverage5Minutes: Double,
    mostRecentlyCreatedPid: Double,
    runnableEntities: Double
  ): Loadavg = {
    val __obj = js.Dynamic.literal(existingEntities = existingEntities.asInstanceOf[js.Any], jobsAverage15Minutes = jobsAverage15Minutes.asInstanceOf[js.Any], jobsAverage1Minute = jobsAverage1Minute.asInstanceOf[js.Any], jobsAverage5Minutes = jobsAverage5Minutes.asInstanceOf[js.Any], mostRecentlyCreatedPid = mostRecentlyCreatedPid.asInstanceOf[js.Any], runnableEntities = runnableEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadavg]
  }
  
  extension [Self <: Loadavg](x: Self) {
    
    inline def setExistingEntities(value: Double): Self = StObject.set(x, "existingEntities", value.asInstanceOf[js.Any])
    
    inline def setJobsAverage15Minutes(value: Double): Self = StObject.set(x, "jobsAverage15Minutes", value.asInstanceOf[js.Any])
    
    inline def setJobsAverage1Minute(value: Double): Self = StObject.set(x, "jobsAverage1Minute", value.asInstanceOf[js.Any])
    
    inline def setJobsAverage5Minutes(value: Double): Self = StObject.set(x, "jobsAverage5Minutes", value.asInstanceOf[js.Any])
    
    inline def setMostRecentlyCreatedPid(value: Double): Self = StObject.set(x, "mostRecentlyCreatedPid", value.asInstanceOf[js.Any])
    
    inline def setRunnableEntities(value: Double): Self = StObject.set(x, "runnableEntities", value.asInstanceOf[js.Any])
  }
}
