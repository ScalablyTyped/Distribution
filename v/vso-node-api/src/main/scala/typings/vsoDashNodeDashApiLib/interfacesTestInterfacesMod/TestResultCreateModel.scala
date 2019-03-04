package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultCreateModel extends js.Object {
  var area: ShallowReference
  var associatedWorkItems: js.Array[scala.Double]
  var automatedTestId: java.lang.String
  var automatedTestName: java.lang.String
  var automatedTestStorage: java.lang.String
  var automatedTestType: java.lang.String
  var automatedTestTypeId: java.lang.String
  var comment: java.lang.String
  var completedDate: java.lang.String
  var computerName: java.lang.String
  var configuration: ShallowReference
  var customFields: js.Array[CustomTestField]
  var durationInMs: java.lang.String
  var errorMessage: java.lang.String
  var failureType: java.lang.String
  var outcome: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var resolutionState: java.lang.String
  var runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var stackTrace: java.lang.String
  var startedDate: java.lang.String
  var state: java.lang.String
  var testCase: ShallowReference
  var testCasePriority: java.lang.String
  var testCaseTitle: java.lang.String
  var testPoint: ShallowReference
}

object TestResultCreateModel {
  @scala.inline
  def apply(
    area: ShallowReference,
    associatedWorkItems: js.Array[scala.Double],
    automatedTestId: java.lang.String,
    automatedTestName: java.lang.String,
    automatedTestStorage: java.lang.String,
    automatedTestType: java.lang.String,
    automatedTestTypeId: java.lang.String,
    comment: java.lang.String,
    completedDate: java.lang.String,
    computerName: java.lang.String,
    configuration: ShallowReference,
    customFields: js.Array[CustomTestField],
    durationInMs: java.lang.String,
    errorMessage: java.lang.String,
    failureType: java.lang.String,
    outcome: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolutionState: java.lang.String,
    runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    stackTrace: java.lang.String,
    startedDate: java.lang.String,
    state: java.lang.String,
    testCase: ShallowReference,
    testCasePriority: java.lang.String,
    testCaseTitle: java.lang.String,
    testPoint: ShallowReference
  ): TestResultCreateModel = {
    val __obj = js.Dynamic.literal(area = area, associatedWorkItems = associatedWorkItems, automatedTestId = automatedTestId, automatedTestName = automatedTestName, automatedTestStorage = automatedTestStorage, automatedTestType = automatedTestType, automatedTestTypeId = automatedTestTypeId, comment = comment, completedDate = completedDate, computerName = computerName, configuration = configuration, customFields = customFields, durationInMs = durationInMs, errorMessage = errorMessage, failureType = failureType, outcome = outcome, owner = owner, resolutionState = resolutionState, runBy = runBy, stackTrace = stackTrace, startedDate = startedDate, state = state, testCase = testCase, testCasePriority = testCasePriority, testCaseTitle = testCaseTitle, testPoint = testPoint)
  
    __obj.asInstanceOf[TestResultCreateModel]
  }
}

