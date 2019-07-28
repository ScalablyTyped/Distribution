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
    val __obj = js.Dynamic.literal(build = build, buildConfiguration = buildConfiguration, comment = comment, completedDate = completedDate, controller = controller, createdDate = createdDate, customFields = customFields, dropLocation = dropLocation, dtlAutEnvironment = dtlAutEnvironment, dtlEnvironment = dtlEnvironment, dtlEnvironmentCreationDetails = dtlEnvironmentCreationDetails, dueDate = dueDate, errorMessage = errorMessage, filter = filter, id = id, incompleteTests = incompleteTests, isAutomated = isAutomated, iteration = iteration, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, name = name, notApplicableTests = notApplicableTests, owner = owner, passedTests = passedTests, phase = phase, plan = plan, postProcessState = postProcessState, project = project, release = release, releaseEnvironmentUri = releaseEnvironmentUri, releaseUri = releaseUri, revision = revision, runStatistics = runStatistics, startedDate = startedDate, state = state, substate = substate, testEnvironment = testEnvironment, testMessageLogId = testMessageLogId, testSettings = testSettings, totalTests = totalTests, unanalyzedTests = unanalyzedTests, url = url, webAccessUrl = webAccessUrl)
  
    __obj.asInstanceOf[TestRun]
  }
}

