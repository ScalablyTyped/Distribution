package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTask extends StObject {
  
  var alwaysRun: Boolean = js.native
  
  var condition: String = js.native
  
  var continueOnError: Boolean = js.native
  
  var definitionType: String = js.native
  
  var enabled: Boolean = js.native
  
  var inputs: StringDictionary[String] = js.native
  
  var name: String = js.native
  
  var overrideInputs: StringDictionary[String] = js.native
  
  var refName: String = js.native
  
  var taskId: String = js.native
  
  var timeoutInMinutes: Double = js.native
  
  var version: String = js.native
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
