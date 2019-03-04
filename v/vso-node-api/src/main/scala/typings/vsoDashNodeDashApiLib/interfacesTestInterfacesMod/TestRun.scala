package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRun extends js.Object {
  var build: ShallowReference
  var buildConfiguration: BuildConfiguration
  var comment: java.lang.String
  var completedDate: stdLib.Date
  var controller: java.lang.String
  var createdDate: stdLib.Date
  var customFields: js.Array[CustomTestField]
  var dropLocation: java.lang.String
  var dtlAutEnvironment: ShallowReference
  var dtlEnvironment: ShallowReference
  var dtlEnvironmentCreationDetails: DtlEnvironmentDetails
  var dueDate: stdLib.Date
  var errorMessage: java.lang.String
  var filter: RunFilter
  var id: scala.Double
  var incompleteTests: scala.Double
  var isAutomated: scala.Boolean
  var iteration: java.lang.String
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var name: java.lang.String
  var notApplicableTests: scala.Double
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var passedTests: scala.Double
  var phase: java.lang.String
  var plan: ShallowReference
  var postProcessState: java.lang.String
  var project: ShallowReference
  var release: ReleaseReference
  var releaseEnvironmentUri: java.lang.String
  var releaseUri: java.lang.String
  var revision: scala.Double
  var runStatistics: js.Array[RunStatistic]
  var startedDate: stdLib.Date
  var state: java.lang.String
  var substate: TestRunSubstate
  var testEnvironment: TestEnvironment
  var testMessageLogId: scala.Double
  var testSettings: ShallowReference
  var totalTests: scala.Double
  var unanalyzedTests: scala.Double
  var url: java.lang.String
  var webAccessUrl: java.lang.String
}

object TestRun {
  @scala.inline
  def apply(
    build: ShallowReference,
    buildConfiguration: BuildConfiguration,
    comment: java.lang.String,
    completedDate: stdLib.Date,
    controller: java.lang.String,
    createdDate: stdLib.Date,
    customFields: js.Array[CustomTestField],
    dropLocation: java.lang.String,
    dtlAutEnvironment: ShallowReference,
    dtlEnvironment: ShallowReference,
    dtlEnvironmentCreationDetails: DtlEnvironmentDetails,
    dueDate: stdLib.Date,
    errorMessage: java.lang.String,
    filter: RunFilter,
    id: scala.Double,
    incompleteTests: scala.Double,
    isAutomated: scala.Boolean,
    iteration: java.lang.String,
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    name: java.lang.String,
    notApplicableTests: scala.Double,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    passedTests: scala.Double,
    phase: java.lang.String,
    plan: ShallowReference,
    postProcessState: java.lang.String,
    project: ShallowReference,
    release: ReleaseReference,
    releaseEnvironmentUri: java.lang.String,
    releaseUri: java.lang.String,
    revision: scala.Double,
    runStatistics: js.Array[RunStatistic],
    startedDate: stdLib.Date,
    state: java.lang.String,
    substate: TestRunSubstate,
    testEnvironment: TestEnvironment,
    testMessageLogId: scala.Double,
    testSettings: ShallowReference,
    totalTests: scala.Double,
    unanalyzedTests: scala.Double,
    url: java.lang.String,
    webAccessUrl: java.lang.String
  ): TestRun = {
    val __obj = js.Dynamic.literal(build = build, buildConfiguration = buildConfiguration, comment = comment, completedDate = completedDate, controller = controller, createdDate = createdDate, customFields = customFields, dropLocation = dropLocation, dtlAutEnvironment = dtlAutEnvironment, dtlEnvironment = dtlEnvironment, dtlEnvironmentCreationDetails = dtlEnvironmentCreationDetails, dueDate = dueDate, errorMessage = errorMessage, filter = filter, id = id, incompleteTests = incompleteTests, isAutomated = isAutomated, iteration = iteration, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, name = name, notApplicableTests = notApplicableTests, owner = owner, passedTests = passedTests, phase = phase, plan = plan, postProcessState = postProcessState, project = project, release = release, releaseEnvironmentUri = releaseEnvironmentUri, releaseUri = releaseUri, revision = revision, runStatistics = runStatistics, startedDate = startedDate, state = state, substate = substate, testEnvironment = testEnvironment, testMessageLogId = testMessageLogId, testSettings = testSettings, totalTests = totalTests, unanalyzedTests = unanalyzedTests, url = url, webAccessUrl = webAccessUrl)
  
    __obj.asInstanceOf[TestRun]
  }
}

