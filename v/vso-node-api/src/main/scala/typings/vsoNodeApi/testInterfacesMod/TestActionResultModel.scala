package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestActionResultModel extends TestResultModelBase {
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
}

