package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseTasksUpdatedEvent extends RealtimeReleaseEvent {
  
  var environmentId: Double = js.native
  
  var job: ReleaseTask = js.native
  
  var releaseDeployPhaseId: Double = js.native
  
  var releaseStepId: Double = js.native
  
  var tasks: js.Array[ReleaseTask] = js.native
}
object ReleaseTasksUpdatedEvent {
  
  @scala.inline
  def apply(
    environmentId: Double,
    job: ReleaseTask,
    projectId: String,
    releaseDeployPhaseId: Double,
    releaseId: Double,
    releaseStepId: Double,
    tasks: js.Array[ReleaseTask]
  ): ReleaseTasksUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], releaseDeployPhaseId = releaseDeployPhaseId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], releaseStepId = releaseStepId.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTasksUpdatedEvent]
  }
  
  @scala.inline
  implicit class ReleaseTasksUpdatedEventMutableBuilder[Self <: ReleaseTasksUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob(value: ReleaseTask): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDeployPhaseId(value: Double): Self = StObject.set(x, "releaseDeployPhaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseStepId(value: Double): Self = StObject.set(x, "releaseStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasks(value: js.Array[ReleaseTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: ReleaseTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
