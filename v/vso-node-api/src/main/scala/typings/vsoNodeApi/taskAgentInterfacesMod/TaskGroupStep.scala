package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskGroupStep extends StObject {
  
  var alwaysRun: Boolean = js.native
  
  var continueOnError: Boolean = js.native
  
  var displayName: String = js.native
  
  var enabled: Boolean = js.native
  
  var inputs: StringDictionary[String] = js.native
  
  var task: TaskDefinitionReference = js.native
  
  var timeoutInMinutes: Double = js.native
}
object TaskGroupStep {
  
  @scala.inline
  def apply(
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
  implicit class TaskGroupStepMutableBuilder[Self <: TaskGroupStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: TaskDefinitionReference): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
