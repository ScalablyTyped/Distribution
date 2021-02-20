package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultParameterModel extends StObject {
  
  var actionPath: String = js.native
  
  var iterationId: Double = js.native
  
  var parameterName: String = js.native
  
  /**
    * This is step Id of test case. For shared step, it is step Id of shared step in test case workitem; step Id in shared step. Example: TestCase workitem has two steps: 1) Normal step with Id = 1 2) Shared Step with Id = 2. Inside shared step: a) Normal Step with Id = 1 Value for StepIdentifier for First step: "1" Second step: "2;1"
    */
  var stepIdentifier: String = js.native
  
  var url: String = js.native
  
  var value: String = js.native
}
object TestResultParameterModel {
  
  @scala.inline
  def apply(
    actionPath: String,
    iterationId: Double,
    parameterName: String,
    stepIdentifier: String,
    url: String,
    value: String
  ): TestResultParameterModel = {
    val __obj = js.Dynamic.literal(actionPath = actionPath.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], stepIdentifier = stepIdentifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultParameterModel]
  }
  
  @scala.inline
  implicit class TestResultParameterModelMutableBuilder[Self <: TestResultParameterModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionPath(value: String): Self = StObject.set(x, "actionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationId(value: Double): Self = StObject.set(x, "iterationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdentifier(value: String): Self = StObject.set(x, "stepIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
