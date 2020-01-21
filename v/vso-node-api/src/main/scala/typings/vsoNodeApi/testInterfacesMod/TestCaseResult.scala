package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(afnStripId = afnStripId.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], associatedBugs = associatedBugs.asInstanceOf[js.Any], automatedTestId = automatedTestId.asInstanceOf[js.Any], automatedTestName = automatedTestName.asInstanceOf[js.Any], automatedTestStorage = automatedTestStorage.asInstanceOf[js.Any], automatedTestType = automatedTestType.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildReference = buildReference.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failingSince = failingSince.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iterationDetails = iterationDetails.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseReference = releaseReference.asInstanceOf[js.Any], resetCount = resetCount.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], resolutionStateId = resolutionStateId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testCaseReferenceId = testCaseReferenceId.asInstanceOf[js.Any], testCaseTitle = testCaseTitle.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], testPoint = testPoint.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestCaseResult]
  }
}

