package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultCreateModel extends js.Object {
  var area: ShallowReference
  var associatedWorkItems: js.Array[Double]
  var automatedTestId: String
  var automatedTestName: String
  var automatedTestStorage: String
  var automatedTestType: String
  var automatedTestTypeId: String
  var comment: String
  var completedDate: String
  var computerName: String
  var configuration: ShallowReference
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
  var testCase: ShallowReference
  var testCasePriority: String
  var testCaseTitle: String
  var testPoint: ShallowReference
}

object TestResultCreateModel {
  @scala.inline
  def apply(
    area: ShallowReference,
    associatedWorkItems: js.Array[Double],
    automatedTestId: String,
    automatedTestName: String,
    automatedTestStorage: String,
    automatedTestType: String,
    automatedTestTypeId: String,
    comment: String,
    completedDate: String,
    computerName: String,
    configuration: ShallowReference,
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
    testCase: ShallowReference,
    testCasePriority: String,
    testCaseTitle: String,
    testPoint: ShallowReference
  ): TestResultCreateModel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], automatedTestId = automatedTestId.asInstanceOf[js.Any], automatedTestName = automatedTestName.asInstanceOf[js.Any], automatedTestStorage = automatedTestStorage.asInstanceOf[js.Any], automatedTestType = automatedTestType.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testCasePriority = testCasePriority.asInstanceOf[js.Any], testCaseTitle = testCaseTitle.asInstanceOf[js.Any], testPoint = testPoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultCreateModel]
  }
}

