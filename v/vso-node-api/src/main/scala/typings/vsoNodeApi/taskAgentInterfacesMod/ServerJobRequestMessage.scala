package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerJobRequestMessage
  extends StObject
     with JobRequestMessage {
  
  var taskDefinition: TaskDefinition
  
  var taskInstance: TaskInstance
}
object ServerJobRequestMessage {
  
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    taskDefinition: TaskDefinition,
    taskInstance: TaskInstance,
    timeline: TimelineReference
  ): ServerJobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any], taskInstance = taskInstance.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerJobRequestMessage]
  }
  
  @scala.inline
  implicit class ServerJobRequestMessageMutableBuilder[Self <: ServerJobRequestMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskDefinition(value: TaskDefinition): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskInstance(value: TaskInstance): Self = StObject.set(x, "taskInstance", value.asInstanceOf[js.Any])
  }
}
