package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskGroupStep extends js.Object {
  
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
  implicit class TaskGroupStepOps[Self <: TaskGroupStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlwaysRun(value: Boolean): Self = this.set("alwaysRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: TaskDefinitionReference): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
