package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobEventsConfig extends StObject {
  
  var jobAssigned: JobEventConfig
  
  var jobCompleted: JobEventConfig
  
  var jobStarted: JobEventConfig
}
object JobEventsConfig {
  
  inline def apply(jobAssigned: JobEventConfig, jobCompleted: JobEventConfig, jobStarted: JobEventConfig): JobEventsConfig = {
    val __obj = js.Dynamic.literal(jobAssigned = jobAssigned.asInstanceOf[js.Any], jobCompleted = jobCompleted.asInstanceOf[js.Any], jobStarted = jobStarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEventsConfig]
  }
  
  extension [Self <: JobEventsConfig](x: Self) {
    
    inline def setJobAssigned(value: JobEventConfig): Self = StObject.set(x, "jobAssigned", value.asInstanceOf[js.Any])
    
    inline def setJobCompleted(value: JobEventConfig): Self = StObject.set(x, "jobCompleted", value.asInstanceOf[js.Any])
    
    inline def setJobStarted(value: JobEventConfig): Self = StObject.set(x, "jobStarted", value.asInstanceOf[js.Any])
  }
}
