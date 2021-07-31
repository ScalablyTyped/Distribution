package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestActionResultModel
  extends StObject
     with TestResultModelBase {
  
  var actionPath: String
  
  var iterationId: Double
  
  var sharedStepModel: SharedStepModel
  
  /**
    * This is step Id of test case. For shared step, it is step Id of shared step in test case workitem; step Id in shared step. Example: TestCase workitem has two steps: 1) Normal step with Id = 1 2) Shared Step with Id = 2. Inside shared step: a) Normal Step with Id = 1 Value for StepIdentifier for First step: "1" Second step: "2;1"
    */
  var stepIdentifier: String
  
  var url: String
}
object TestActionResultModel {
  
  @scala.inline
  def apply(
    actionPath: String,
    comment: String,
    completedDate: Date,
    durationInMs: Double,
    errorMessage: String,
    iterationId: Double,
    outcome: String,
    sharedStepModel: SharedStepModel,
    startedDate: Date,
    stepIdentifier: String,
    url: String
  ): TestActionResultModel = {
    val __obj = js.Dynamic.literal(actionPath = actionPath.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], sharedStepModel = sharedStepModel.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], stepIdentifier = stepIdentifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestActionResultModel]
  }
  
  @scala.inline
  implicit class TestActionResultModelMutableBuilder[Self <: TestActionResultModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionPath(value: String): Self = StObject.set(x, "actionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationId(value: Double): Self = StObject.set(x, "iterationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedStepModel(value: SharedStepModel): Self = StObject.set(x, "sharedStepModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdentifier(value: String): Self = StObject.set(x, "stepIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
