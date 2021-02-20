package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobRequestMessage extends JobRequestMessage {
  
  var lockToken: String = js.native
  
  var lockedUntil: Date = js.native
  
  var requestId: Double = js.native
  
  var tasks: js.Array[TaskInstance] = js.native
}
object AgentJobRequestMessage {
  
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    lockToken: String,
    lockedUntil: Date,
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
  implicit class AgentJobRequestMessageMutableBuilder[Self <: AgentJobRequestMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLockToken(value: String): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUntil(value: Date): Self = StObject.set(x, "lockedUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasks(value: js.Array[TaskInstance]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: TaskInstance*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
