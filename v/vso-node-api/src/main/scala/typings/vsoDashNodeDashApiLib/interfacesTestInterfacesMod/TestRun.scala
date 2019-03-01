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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildConfiguration")(buildConfiguration)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("customFields")(customFields)
    __obj.updateDynamic("dropLocation")(dropLocation)
    __obj.updateDynamic("dtlAutEnvironment")(dtlAutEnvironment)
    __obj.updateDynamic("dtlEnvironment")(dtlEnvironment)
    __obj.updateDynamic("dtlEnvironmentCreationDetails")(dtlEnvironmentCreationDetails)
    __obj.updateDynamic("dueDate")(dueDate)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incompleteTests")(incompleteTests)
    __obj.updateDynamic("isAutomated")(isAutomated)
    __obj.updateDynamic("iteration")(iteration)
    __obj.updateDynamic("lastUpdatedBy")(lastUpdatedBy)
    __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("notApplicableTests")(notApplicableTests)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("passedTests")(passedTests)
    __obj.updateDynamic("phase")(phase)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("postProcessState")(postProcessState)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseEnvironmentUri")(releaseEnvironmentUri)
    __obj.updateDynamic("releaseUri")(releaseUri)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("runStatistics")(runStatistics)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("substate")(substate)
    __obj.updateDynamic("testEnvironment")(testEnvironment)
    __obj.updateDynamic("testMessageLogId")(testMessageLogId)
    __obj.updateDynamic("testSettings")(testSettings)
    __obj.updateDynamic("totalTests")(totalTests)
    __obj.updateDynamic("unanalyzedTests")(unanalyzedTests)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("webAccessUrl")(webAccessUrl)
    __obj.asInstanceOf[TestRun]
  }
}

