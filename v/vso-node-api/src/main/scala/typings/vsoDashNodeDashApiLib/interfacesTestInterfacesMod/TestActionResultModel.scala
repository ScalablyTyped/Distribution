package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestActionResultModel extends TestResultModelBase {
  var actionPath: java.lang.String
  var iterationId: scala.Double
  var sharedStepModel: SharedStepModel
  /**
    * This is step Id of test case. For shared step, it is step Id of shared step in test case workitem; step Id in shared step. Example: TestCase workitem has two steps: 1) Normal step with Id = 1 2) Shared Step with Id = 2. Inside shared step: a) Normal Step with Id = 1 Value for StepIdentifier for First step: "1" Second step: "2;1"
    */
  var stepIdentifier: java.lang.String
  var url: java.lang.String
}

object TestActionResultModel {
  @scala.inline
  def apply(
    actionPath: java.lang.String,
    comment: java.lang.String,
    completedDate: stdLib.Date,
    durationInMs: scala.Double,
    errorMessage: java.lang.String,
    iterationId: scala.Double,
    outcome: java.lang.String,
    sharedStepModel: SharedStepModel,
    startedDate: stdLib.Date,
    stepIdentifier: java.lang.String,
    url: java.lang.String
  ): TestActionResultModel = {
    val __obj = js.Dynamic.literal(actionPath = actionPath, comment = comment, completedDate = completedDate, durationInMs = durationInMs, errorMessage = errorMessage, iterationId = iterationId, outcome = outcome, sharedStepModel = sharedStepModel, startedDate = startedDate, stepIdentifier = stepIdentifier, url = url)
  
    __obj.asInstanceOf[TestActionResultModel]
  }
}

