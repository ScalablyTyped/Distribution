package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(associatedWorkItems = associatedWorkItems, automatedTestTypeId = automatedTestTypeId, comment = comment, completedDate = completedDate, computerName = computerName, customFields = customFields, durationInMs = durationInMs, errorMessage = errorMessage, failureType = failureType, outcome = outcome, owner = owner, resolutionState = resolutionState, runBy = runBy, stackTrace = stackTrace, startedDate = startedDate, state = state, testCasePriority = testCasePriority, testResult = testResult)
  
    __obj.asInstanceOf[TestCaseResultUpdateModel]
  }
}

