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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionPath")(actionPath)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("durationInMs")(durationInMs)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("iterationId")(iterationId)
    __obj.updateDynamic("outcome")(outcome)
    __obj.updateDynamic("sharedStepModel")(sharedStepModel)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.updateDynamic("stepIdentifier")(stepIdentifier)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestActionResultModel]
  }
}

