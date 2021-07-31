package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowTask extends StObject {
  
  var alwaysRun: Boolean
  
  var condition: String
  
  var continueOnError: Boolean
  
  var definitionType: String
  
  var enabled: Boolean
  
  var inputs: StringDictionary[String]
  
  var name: String
  
  var overrideInputs: StringDictionary[String]
  
  var refName: String
  
  var taskId: String
  
  var timeoutInMinutes: Double
  
  var version: String
}
object WorkflowTask {
  
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    definitionType: String,
    enabled: Boolean,
    inputs: StringDictionary[String],
    name: String,
    overrideInputs: StringDictionary[String],
    refName: String,
    taskId: String,
    timeoutInMinutes: Double,
    version: String
  ): WorkflowTask = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], definitionType = definitionType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTask]
  }
  
  @scala.inline
  implicit class WorkflowTaskMutableBuilder[Self <: WorkflowTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionType(value: String): Self = StObject.set(x, "definitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideInputs(value: StringDictionary[String]): Self = StObject.set(x, "overrideInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefName(value: String): Self = StObject.set(x, "refName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
