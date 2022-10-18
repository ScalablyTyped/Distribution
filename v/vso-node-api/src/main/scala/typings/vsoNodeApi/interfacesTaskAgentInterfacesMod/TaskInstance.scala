package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskInstance
  extends StObject
     with TaskReference {
  
  var alwaysRun: Boolean
  
  var condition: String
  
  var continueOnError: Boolean
  
  var displayName: String
  
  var enabled: Boolean
  
  var instanceId: String
  
  var timeoutInMinutes: Double
}
object TaskInstance {
  
  inline def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    id: String,
    inputs: StringDictionary[String],
    instanceId: String,
    name: String,
    timeoutInMinutes: Double,
    version: String
  ): TaskInstance = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInstance]
  }
  
  extension [Self <: TaskInstance](x: Self) {
    
    inline def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
