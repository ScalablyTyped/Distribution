package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultParameterModel extends StObject {
  
  var actionPath: String
  
  var iterationId: Double
  
  var parameterName: String
  
  /**
    * This is step Id of test case. For shared step, it is step Id of shared step in test case workitem; step Id in shared step. Example: TestCase workitem has two steps: 1) Normal step with Id = 1 2) Shared Step with Id = 2. Inside shared step: a) Normal Step with Id = 1 Value for StepIdentifier for First step: "1" Second step: "2;1"
    */
  var stepIdentifier: String
  
  var url: String
  
  var value: String
}
object TestResultParameterModel {
  
  inline def apply(
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
  
  extension [Self <: TestResultParameterModel](x: Self) {
    
    inline def setActionPath(value: String): Self = StObject.set(x, "actionPath", value.asInstanceOf[js.Any])
    
    inline def setIterationId(value: Double): Self = StObject.set(x, "iterationId", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setStepIdentifier(value: String): Self = StObject.set(x, "stepIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
