package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobRequestMessage extends StObject {
  
  var environment: JobEnvironment = js.native
  
  var jobId: String = js.native
  
  var jobName: String = js.native
  
  var messageType: String = js.native
  
  var plan: TaskOrchestrationPlanReference = js.native
  
  var timeline: TimelineReference = js.native
}
object JobRequestMessage {
  
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    timeline: TimelineReference
  ): JobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRequestMessage]
  }
  
  @scala.inline
  implicit class JobRequestMessageMutableBuilder[Self <: JobRequestMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: JobEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: TaskOrchestrationPlanReference): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: TimelineReference): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
