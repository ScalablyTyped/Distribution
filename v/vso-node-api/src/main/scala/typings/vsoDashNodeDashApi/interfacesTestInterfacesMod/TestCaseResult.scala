package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResult extends js.Object {
  var afnStripId: Double
  var area: ShallowReference
  var associatedBugs: js.Array[ShallowReference]
  var automatedTestId: String
  var automatedTestName: String
  var automatedTestStorage: String
  var automatedTestType: String
  var automatedTestTypeId: String
  var build: ShallowReference
  var buildReference: BuildReference
  var comment: String
  var completedDate: Date
  var computerName: String
  var configuration: ShallowReference
  var createdDate: Date
  var customFields: js.Array[CustomTestField]
  var durationInMs: Double
  var errorMessage: String
  var failingSince: FailingSince
  var failureType: String
  var id: Double
  var iterationDetails: js.Array[TestIterationDetailsModel]
  var lastUpdatedBy: IdentityRef
  var lastUpdatedDate: Date
  var outcome: String
  var owner: IdentityRef
  var priority: Double
  var project: ShallowReference
  var release: ShallowReference
  var releaseReference: ReleaseReference
  var resetCount: Double
  var resolutionState: String
  var resolutionStateId: Double
  var revision: Double
  var runBy: IdentityRef
  var stackTrace: String
  var startedDate: Date
  var state: String
  var testCase: ShallowReference
  var testCaseReferenceId: Double
  var testCaseTitle: String
  var testPlan: ShallowReference
  var testPoint: ShallowReference
  var testRun: ShallowReference
  var testSuite: ShallowReference
  var url: String
}

object TestCaseResult {
  @scala.inline
  def apply(
    afnStripId: Double,
    area: ShallowReference,
    associatedBugs: js.Array[ShallowReference],
    automatedTestId: String,
    automatedTestName: String,
    automatedTestStorage: String,
    automatedTestType: String,
    automatedTestTypeId: String,
    build: ShallowReference,
    buildReference: BuildReference,
    comment: String,
    completedDate: Date,
    computerName: String,
    configuration: ShallowReference,
    createdDate: Date,
    customFields: js.Array[CustomTestField],
    durationInMs: Double,
    errorMessage: String,
    failingSince: FailingSince,
    failureType: String,
    id: Double,
    iterationDetails: js.Array[TestIterationDetailsModel],
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: Date,
    outcome: String,
    owner: IdentityRef,
    priority: Double,
    project: ShallowReference,
    release: ShallowReference,
    releaseReference: ReleaseReference,
    resetCount: Double,
    resolutionState: String,
    resolutionStateId: Double,
    revision: Double,
    runBy: IdentityRef,
    stackTrace: String,
    startedDate: Date,
    state: String,
    testCase: ShallowReference,
    testCaseReferenceId: Double,
    testCaseTitle: String,
    testPlan: ShallowReference,
    testPoint: ShallowReference,
    testRun: ShallowReference,
    testSuite: ShallowReference,
    url: String
  ): TestCaseResult = {
    val __obj = js.Dynamic.literal(afnStripId = afnStripId, area = area, associatedBugs = associatedBugs, automatedTestId = automatedTestId, automatedTestName = automatedTestName, automatedTestStorage = automatedTestStorage, automatedTestType = automatedTestType, automatedTestTypeId = automatedTestTypeId, build = build, buildReference = buildReference, comment = comment, completedDate = completedDate, computerName = computerName, configuration = configuration, createdDate = createdDate, customFields = customFields, durationInMs = durationInMs, errorMessage = errorMessage, failingSince = failingSince, failureType = failureType, id = id, iterationDetails = iterationDetails, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, outcome = outcome, owner = owner, priority = priority, project = project, release = release, releaseReference = releaseReference, resetCount = resetCount, resolutionState = resolutionState, resolutionStateId = resolutionStateId, revision = revision, runBy = runBy, stackTrace = stackTrace, startedDate = startedDate, state = state, testCase = testCase, testCaseReferenceId = testCaseReferenceId, testCaseTitle = testCaseTitle, testPlan = testPlan, testPoint = testPoint, testRun = testRun, testSuite = testSuite, url = url)
  
    __obj.asInstanceOf[TestCaseResult]
  }
}

