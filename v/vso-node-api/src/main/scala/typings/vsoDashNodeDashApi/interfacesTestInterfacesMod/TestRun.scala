package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRun extends js.Object {
  var build: ShallowReference
  var buildConfiguration: BuildConfiguration
  var comment: String
  var completedDate: Date
  var controller: String
  var createdDate: Date
  var customFields: js.Array[CustomTestField]
  var dropLocation: String
  var dtlAutEnvironment: ShallowReference
  var dtlEnvironment: ShallowReference
  var dtlEnvironmentCreationDetails: DtlEnvironmentDetails
  var dueDate: Date
  var errorMessage: String
  var filter: RunFilter
  var id: Double
  var incompleteTests: Double
  var isAutomated: Boolean
  var iteration: String
  var lastUpdatedBy: IdentityRef
  var lastUpdatedDate: Date
  var name: String
  var notApplicableTests: Double
  var owner: IdentityRef
  var passedTests: Double
  var phase: String
  var plan: ShallowReference
  var postProcessState: String
  var project: ShallowReference
  var release: ReleaseReference
  var releaseEnvironmentUri: String
  var releaseUri: String
  var revision: Double
  var runStatistics: js.Array[RunStatistic]
  var startedDate: Date
  var state: String
  var substate: TestRunSubstate
  var testEnvironment: TestEnvironment
  var testMessageLogId: Double
  var testSettings: ShallowReference
  var totalTests: Double
  var unanalyzedTests: Double
  var url: String
  var webAccessUrl: String
}

object TestRun {
  @scala.inline
  def apply(
    build: ShallowReference,
    buildConfiguration: BuildConfiguration,
    comment: String,
    completedDate: Date,
    controller: String,
    createdDate: Date,
    customFields: js.Array[CustomTestField],
    dropLocation: String,
    dtlAutEnvironment: ShallowReference,
    dtlEnvironment: ShallowReference,
    dtlEnvironmentCreationDetails: DtlEnvironmentDetails,
    dueDate: Date,
    errorMessage: String,
    filter: RunFilter,
    id: Double,
    incompleteTests: Double,
    isAutomated: Boolean,
    iteration: String,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: Date,
    name: String,
    notApplicableTests: Double,
    owner: IdentityRef,
    passedTests: Double,
    phase: String,
    plan: ShallowReference,
    postProcessState: String,
    project: ShallowReference,
    release: ReleaseReference,
    releaseEnvironmentUri: String,
    releaseUri: String,
    revision: Double,
    runStatistics: js.Array[RunStatistic],
    startedDate: Date,
    state: String,
    substate: TestRunSubstate,
    testEnvironment: TestEnvironment,
    testMessageLogId: Double,
    testSettings: ShallowReference,
    totalTests: Double,
    unanalyzedTests: Double,
    url: String,
    webAccessUrl: String
  ): TestRun = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildConfiguration = buildConfiguration.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], dtlAutEnvironment = dtlAutEnvironment.asInstanceOf[js.Any], dtlEnvironment = dtlEnvironment.asInstanceOf[js.Any], dtlEnvironmentCreationDetails = dtlEnvironmentCreationDetails.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incompleteTests = incompleteTests.asInstanceOf[js.Any], isAutomated = isAutomated.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notApplicableTests = notApplicableTests.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], passedTests = passedTests.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], postProcessState = postProcessState.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseEnvironmentUri = releaseEnvironmentUri.asInstanceOf[js.Any], releaseUri = releaseUri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], runStatistics = runStatistics.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], substate = substate.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testMessageLogId = testMessageLogId.asInstanceOf[js.Any], testSettings = testSettings.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any], unanalyzedTests = unanalyzedTests.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webAccessUrl = webAccessUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestRun]
  }
}

