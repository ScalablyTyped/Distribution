package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobEventsConfig extends StObject {
  
  var jobAssigned: JobEventConfig = js.native
  
  var jobCompleted: JobEventConfig = js.native
  
  var jobStarted: JobEventConfig = js.native
}
object JobEventsConfig {
  
  @scala.inline
  def apply(jobAssigned: JobEventConfig, jobCompleted: JobEventConfig, jobStarted: JobEventConfig): JobEventsConfig = {
    val __obj = js.Dynamic.literal(jobAssigned = jobAssigned.asInstanceOf[js.Any], jobCompleted = jobCompleted.asInstanceOf[js.Any], jobStarted = jobStarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEventsConfig]
  }
  
  @scala.inline
  implicit class JobEventsConfigMutableBuilder[Self <: JobEventsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobAssigned(value: JobEventConfig): Self = StObject.set(x, "jobAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCompleted(value: JobEventConfig): Self = StObject.set(x, "jobCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStarted(value: JobEventConfig): Self = StObject.set(x, "jobStarted", value.asInstanceOf[js.Any])
  }
}
