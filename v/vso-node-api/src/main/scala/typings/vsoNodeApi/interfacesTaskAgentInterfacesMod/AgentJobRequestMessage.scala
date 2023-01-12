package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobRequestMessage
  extends StObject
     with JobRequestMessage {
  
  var lockToken: String
  
  var lockedUntil: js.Date
  
  var requestId: Double
  
  var tasks: js.Array[TaskInstance]
}
object AgentJobRequestMessage {
  
  inline def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    lockToken: String,
    lockedUntil: js.Date,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    requestId: Double,
    tasks: js.Array[TaskInstance],
    timeline: TimelineReference
  ): AgentJobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lockToken = lockToken.asInstanceOf[js.Any], lockedUntil = lockedUntil.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobRequestMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentJobRequestMessage] (val x: Self) extends AnyVal {
    
    inline def setLockToken(value: String): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
    
    inline def setLockedUntil(value: js.Date): Self = StObject.set(x, "lockedUntil", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: js.Array[TaskInstance]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: TaskInstance*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
