package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentPoolMaintenanceOptions extends StObject {
  
  /**
    * time to consider a System.DefaultWorkingDirectory is stale
    */
  var workingDirectoryExpirationInDays: Double
}
object TaskAgentPoolMaintenanceOptions {
  
  inline def apply(workingDirectoryExpirationInDays: Double): TaskAgentPoolMaintenanceOptions = {
    val __obj = js.Dynamic.literal(workingDirectoryExpirationInDays = workingDirectoryExpirationInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskAgentPoolMaintenanceOptions] (val x: Self) extends AnyVal {
    
    inline def setWorkingDirectoryExpirationInDays(value: Double): Self = StObject.set(x, "workingDirectoryExpirationInDays", value.asInstanceOf[js.Any])
  }
}
