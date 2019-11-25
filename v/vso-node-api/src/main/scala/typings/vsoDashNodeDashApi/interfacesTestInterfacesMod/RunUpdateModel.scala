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
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildDropLocation = buildDropLocation.asInstanceOf[js.Any], buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], deleteInProgressResults = deleteInProgressResults.asInstanceOf[js.Any], dtlAutEnvironment = dtlAutEnvironment.asInstanceOf[js.Any], dtlEnvironment = dtlEnvironment.asInstanceOf[js.Any], dtlEnvironmentDetails = dtlEnvironmentDetails.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], logEntries = logEntries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseEnvironmentUri = releaseEnvironmentUri.asInstanceOf[js.Any], releaseUri = releaseUri.asInstanceOf[js.Any], sourceWorkflow = sourceWorkflow.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], substate = substate.asInstanceOf[js.Any], testEnvironmentId = testEnvironmentId.asInstanceOf[js.Any], testSettings = testSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunUpdateModel]
  }
}

