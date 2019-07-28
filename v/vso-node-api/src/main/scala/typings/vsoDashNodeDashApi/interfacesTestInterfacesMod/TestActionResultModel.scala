package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(actionPath = actionPath, comment = comment, completedDate = completedDate, durationInMs = durationInMs, errorMessage = errorMessage, iterationId = iterationId, outcome = outcome, sharedStepModel = sharedStepModel, startedDate = startedDate, stepIdentifier = stepIdentifier, url = url)
  
    __obj.asInstanceOf[TestActionResultModel]
  }
}

