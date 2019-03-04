package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResult extends js.Object {
  var afnStripId: scala.Double
  var area: ShallowReference
  var associatedBugs: js.Array[ShallowReference]
  var automatedTestId: java.lang.String
  var automatedTestName: java.lang.String
  var automatedTestStorage: java.lang.String
  var automatedTestType: java.lang.String
  var automatedTestTypeId: java.lang.String
  var build: ShallowReference
  var buildReference: BuildReference
  var comment: java.lang.String
  var completedDate: stdLib.Date
  var computerName: java.lang.String
  var configuration: ShallowReference
  var createdDate: stdLib.Date
  var customFields: js.Array[CustomTestField]
  var durationInMs: scala.Double
  var errorMessage: java.lang.String
  var failingSince: FailingSince
  var failureType: java.lang.String
  var id: scala.Double
  var iterationDetails: js.Array[TestIterationDetailsModel]
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var outcome: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var priority: scala.Double
  var project: ShallowReference
  var release: ShallowReference
  var releaseReference: ReleaseReference
  var resetCount: scala.Double
  var resolutionState: java.lang.String
  var resolutionStateId: scala.Double
  var revision: scala.Double
  var runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var stackTrace: java.lang.String
  var startedDate: stdLib.Date
  var state: java.lang.String
  var testCase: ShallowReference
  var testCaseReferenceId: scala.Double
  var testCaseTitle: java.lang.String
  var testPlan: ShallowReference
  var testPoint: ShallowReference
  var testRun: ShallowReference
  var testSuite: ShallowReference
  var url: java.lang.String
}

object TestCaseResult {
  @scala.inline
  def apply(
    afnStripId: scala.Double,
    area: ShallowReference,
    associatedBugs: js.Array[ShallowReference],
    automatedTestId: java.lang.String,
    automatedTestName: java.lang.String,
    automatedTestStorage: java.lang.String,
    automatedTestType: java.lang.String,
    automatedTestTypeId: java.lang.String,
    build: ShallowReference,
    buildReference: BuildReference,
    comment: java.lang.String,
    completedDate: stdLib.Date,
    computerName: java.lang.String,
    configuration: ShallowReference,
    createdDate: stdLib.Date,
    customFields: js.Array[CustomTestField],
    durationInMs: scala.Double,
    errorMessage: java.lang.String,
    failingSince: FailingSince,
    failureType: java.lang.String,
    id: scala.Double,
    iterationDetails: js.Array[TestIterationDetailsModel],
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    outcome: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    priority: scala.Double,
    project: ShallowReference,
    release: ShallowReference,
    releaseReference: ReleaseReference,
    resetCount: scala.Double,
    resolutionState: java.lang.String,
    resolutionStateId: scala.Double,
    revision: scala.Double,
    runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    stackTrace: java.lang.String,
    startedDate: stdLib.Date,
    state: java.lang.String,
    testCase: ShallowReference,
    testCaseReferenceId: scala.Double,
    testCaseTitle: java.lang.String,
    testPlan: ShallowReference,
    testPoint: ShallowReference,
    testRun: ShallowReference,
    testSuite: ShallowReference,
    url: java.lang.String
  ): TestCaseResult = {
    val __obj = js.Dynamic.literal(afnStripId = afnStripId, area = area, associatedBugs = associatedBugs, automatedTestId = automatedTestId, automatedTestName = automatedTestName, automatedTestStorage = automatedTestStorage, automatedTestType = automatedTestType, automatedTestTypeId = automatedTestTypeId, build = build, buildReference = buildReference, comment = comment, completedDate = completedDate, computerName = computerName, configuration = configuration, createdDate = createdDate, customFields = customFields, durationInMs = durationInMs, errorMessage = errorMessage, failingSince = failingSince, failureType = failureType, id = id, iterationDetails = iterationDetails, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, outcome = outcome, owner = owner, priority = priority, project = project, release = release, releaseReference = releaseReference, resetCount = resetCount, resolutionState = resolutionState, resolutionStateId = resolutionStateId, revision = revision, runBy = runBy, stackTrace = stackTrace, startedDate = startedDate, state = state, testCase = testCase, testCaseReferenceId = testCaseReferenceId, testCaseTitle = testCaseTitle, testPlan = testPlan, testPoint = testPoint, testRun = testRun, testSuite = testSuite, url = url)
  
    __obj.asInstanceOf[TestCaseResult]
  }
}

