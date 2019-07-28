package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunUpdateModel extends js.Object {
  var build: ShallowReference
  var buildDropLocation: String
  var buildFlavor: String
  var buildPlatform: String
  var comment: String
  var completedDate: String
  var controller: String
  var deleteInProgressResults: Boolean
  var dtlAutEnvironment: ShallowReference
  var dtlEnvironment: ShallowReference
  var dtlEnvironmentDetails: DtlEnvironmentDetails
  var dueDate: String
  var errorMessage: String
  var iteration: String
  var logEntries: js.Array[TestMessageLogDetails]
  var name: String
  var releaseEnvironmentUri: String
  var releaseUri: String
  var sourceWorkflow: String
  var startedDate: String
  var state: String
  var substate: TestRunSubstate
  var testEnvironmentId: String
  var testSettings: ShallowReference
}

object RunUpdateModel {
  @scala.inline
  def apply(
    build: ShallowReference,
    buildDropLocation: String,
    buildFlavor: String,
    buildPlatform: String,
    comment: String,
    completedDate: String,
    controller: String,
    deleteInProgressResults: Boolean,
    dtlAutEnvironment: ShallowReference,
    dtlEnvironment: ShallowReference,
    dtlEnvironmentDetails: DtlEnvironmentDetails,
    dueDate: String,
    errorMessage: String,
    iteration: String,
    logEntries: js.Array[TestMessageLogDetails],
    name: String,
    releaseEnvironmentUri: String,
    releaseUri: String,
    sourceWorkflow: String,
    startedDate: String,
    state: String,
    substate: TestRunSubstate,
    testEnvironmentId: String,
    testSettings: ShallowReference
  ): RunUpdateModel = {
    val __obj = js.Dynamic.literal(build = build, buildDropLocation = buildDropLocation, buildFlavor = buildFlavor, buildPlatform = buildPlatform, comment = comment, completedDate = completedDate, controller = controller, deleteInProgressResults = deleteInProgressResults, dtlAutEnvironment = dtlAutEnvironment, dtlEnvironment = dtlEnvironment, dtlEnvironmentDetails = dtlEnvironmentDetails, dueDate = dueDate, errorMessage = errorMessage, iteration = iteration, logEntries = logEntries, name = name, releaseEnvironmentUri = releaseEnvironmentUri, releaseUri = releaseUri, sourceWorkflow = sourceWorkflow, startedDate = startedDate, state = state, substate = substate, testEnvironmentId = testEnvironmentId, testSettings = testSettings)
  
    __obj.asInstanceOf[RunUpdateModel]
  }
}

