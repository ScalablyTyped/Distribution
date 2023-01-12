package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskGroupStep extends StObject {
  
  var alwaysRun: Boolean
  
  var continueOnError: Boolean
  
  var displayName: String
  
  var enabled: Boolean
  
  var inputs: StringDictionary[String]
  
  var task: TaskDefinitionReference
  
  var timeoutInMinutes: Double
}
object TaskGroupStep {
  
  inline def apply(
    alwaysRun: Boolean,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    inputs: StringDictionary[String],
    task: TaskDefinitionReference,
    timeoutInMinutes: Double
  ): TaskGroupStep = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskGroupStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskGroupStep] (val x: Self) extends AnyVal {
    
    inline def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setTask(value: TaskDefinitionReference): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
