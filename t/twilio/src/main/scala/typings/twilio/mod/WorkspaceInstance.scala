package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceInstance
  extends StObject
     with InstanceResource {
  
  var activities: WorkspaceActivityResource
  
  var events: WorkspaceEventResource
  
  var statistics: WorkspaceInstanceStatisticResource
  
  var taskQueues: WorkspaceTaskQueueResource
  
  var tasks: WorkspaceTaskResource
  
  var workers: WorkspaceWorkerResource
  
  var workflows: WorkspaceWorkflowResource
}
object WorkspaceInstance {
  
  inline def apply(
    activities: WorkspaceActivityResource,
    delete: RestMethod,
    events: WorkspaceEventResource,
    get: RestMethod,
    post: RestMethod,
    statistics: WorkspaceInstanceStatisticResource,
    taskQueues: WorkspaceTaskQueueResource,
    tasks: WorkspaceTaskResource,
    update: RestMethod,
    workers: WorkspaceWorkerResource,
    workflows: WorkspaceWorkflowResource
  ): WorkspaceInstance = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], taskQueues = taskQueues.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceInstance]
  }
  
  extension [Self <: WorkspaceInstance](x: Self) {
    
    inline def setActivities(value: WorkspaceActivityResource): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: WorkspaceEventResource): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: WorkspaceInstanceStatisticResource): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setTaskQueues(value: WorkspaceTaskQueueResource): Self = StObject.set(x, "taskQueues", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: WorkspaceTaskResource): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setWorkers(value: WorkspaceWorkerResource): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    inline def setWorkflows(value: WorkspaceWorkflowResource): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
  }
}
