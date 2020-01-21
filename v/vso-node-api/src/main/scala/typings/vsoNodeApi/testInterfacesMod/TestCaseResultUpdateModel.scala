package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResultUpdateModel extends js.Object {
  var associatedWorkItems: js.Array[Double]
  var automatedTestTypeId: String
  var comment: String
  var completedDate: String
  var computerName: String
  var customFields: js.Array[CustomTestField]
  var durationInMs: String
  var errorMessage: String
  var failureType: String
  var outcome: String
  var owner: IdentityRef
  var resolutionState: String
  var runBy: IdentityRef
  var stackTrace: String
  var startedDate: String
  var state: String
  var testCasePriority: String
  var testResult: ShallowReference
}

object TestCaseResultUpdateModel {
  @scala.inline
  def apply(
    associatedWorkItems: js.Array[Double],
    automatedTestTypeId: String,
    comment: String,
    completedDate: String,
    computerName: String,
    customFields: js.Array[CustomTestField],
    durationInMs: String,
    errorMessage: String,
    failureType: String,
    outcome: String,
    owner: IdentityRef,
    resolutionState: String,
    runBy: IdentityRef,
    stackTrace: String,
    startedDate: String,
    state: String,
    testCasePriority: String,
    testResult: ShallowReference
  ): TestCaseResultUpdateModel = {
    val __obj = js.Dynamic.literal(associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCasePriority = testCasePriority.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestCaseResultUpdateModel]
  }
}

