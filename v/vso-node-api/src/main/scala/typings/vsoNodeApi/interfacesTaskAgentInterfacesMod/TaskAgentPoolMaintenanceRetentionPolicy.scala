package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentPoolMaintenanceRetentionPolicy extends StObject {
  
  /**
    * Number of records to keep for maintenance job executed with this definition.
    */
  var numberOfHistoryRecordsToKeep: Double
}
object TaskAgentPoolMaintenanceRetentionPolicy {
  
  inline def apply(numberOfHistoryRecordsToKeep: Double): TaskAgentPoolMaintenanceRetentionPolicy = {
    val __obj = js.Dynamic.literal(numberOfHistoryRecordsToKeep = numberOfHistoryRecordsToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceRetentionPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskAgentPoolMaintenanceRetentionPolicy] (val x: Self) extends AnyVal {
    
    inline def setNumberOfHistoryRecordsToKeep(value: Double): Self = StObject.set(x, "numberOfHistoryRecordsToKeep", value.asInstanceOf[js.Any])
  }
}
