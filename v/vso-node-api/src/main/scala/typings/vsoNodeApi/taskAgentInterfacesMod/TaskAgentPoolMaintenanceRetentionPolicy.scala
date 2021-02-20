package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentPoolMaintenanceRetentionPolicy extends StObject {
  
  /**
    * Number of records to keep for maintenance job executed with this definition.
    */
  var numberOfHistoryRecordsToKeep: Double = js.native
}
object TaskAgentPoolMaintenanceRetentionPolicy {
  
  @scala.inline
  def apply(numberOfHistoryRecordsToKeep: Double): TaskAgentPoolMaintenanceRetentionPolicy = {
    val __obj = js.Dynamic.literal(numberOfHistoryRecordsToKeep = numberOfHistoryRecordsToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceRetentionPolicy]
  }
  
  @scala.inline
  implicit class TaskAgentPoolMaintenanceRetentionPolicyMutableBuilder[Self <: TaskAgentPoolMaintenanceRetentionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfHistoryRecordsToKeep(value: Double): Self = StObject.set(x, "numberOfHistoryRecordsToKeep", value.asInstanceOf[js.Any])
  }
}
