package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceTaskQueueInstance
  extends StObject
     with InstanceResource {
  
  var statistics: WorkspaceInstanceStatisticResource
}
object WorkspaceTaskQueueInstance {
  
  inline def apply(
    delete: RestMethod,
    get: RestMethod,
    post: RestMethod,
    statistics: WorkspaceInstanceStatisticResource,
    update: RestMethod
  ): WorkspaceTaskQueueInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTaskQueueInstance]
  }
  
  extension [Self <: WorkspaceTaskQueueInstance](x: Self) {
    
    inline def setStatistics(value: WorkspaceInstanceStatisticResource): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
  }
}
