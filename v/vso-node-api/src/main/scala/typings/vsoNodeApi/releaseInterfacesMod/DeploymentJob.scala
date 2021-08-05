package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentJob extends StObject {
  
  var job: ReleaseTask
  
  var tasks: js.Array[ReleaseTask]
}
object DeploymentJob {
  
  inline def apply(job: ReleaseTask, tasks: js.Array[ReleaseTask]): DeploymentJob = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentJob]
  }
  
  extension [Self <: DeploymentJob](x: Self) {
    
    inline def setJob(value: ReleaseTask): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: js.Array[ReleaseTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: ReleaseTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
