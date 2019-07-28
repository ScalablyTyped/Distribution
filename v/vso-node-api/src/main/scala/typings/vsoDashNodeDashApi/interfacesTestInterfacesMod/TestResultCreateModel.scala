package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(area = area, associatedWorkItems = associatedWorkItems, automatedTestId = automatedTestId, automatedTestName = automatedTestName, automatedTestStorage = automatedTestStorage, automatedTestType = automatedTestType, automatedTestTypeId = automatedTestTypeId, comment = comment, completedDate = completedDate, computerName = computerName, configuration = configuration, customFields = customFields, durationInMs = durationInMs, errorMessage = errorMessage, failureType = failureType, outcome = outcome, owner = owner, resolutionState = resolutionState, runBy = runBy, stackTrace = stackTrace, startedDate = startedDate, state = state, testCase = testCase, testCasePriority = testCasePriority, testCaseTitle = testCaseTitle, testPoint = testPoint)
  
    __obj.asInstanceOf[TestResultCreateModel]
  }
}

