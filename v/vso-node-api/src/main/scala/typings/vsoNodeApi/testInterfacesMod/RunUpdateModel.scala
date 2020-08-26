package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunUpdateModel extends js.Object {
  var build: ShallowReference = js.native
  var buildDropLocation: String = js.native
  var buildFlavor: String = js.native
  var buildPlatform: String = js.native
  var comment: String = js.native
  var completedDate: String = js.native
  var controller: String = js.native
  var deleteInProgressResults: Boolean = js.native
  var dtlAutEnvironment: ShallowReference = js.native
  var dtlEnvironment: ShallowReference = js.native
  var dtlEnvironmentDetails: DtlEnvironmentDetails = js.native
  var dueDate: String = js.native
  var errorMessage: String = js.native
  var iteration: String = js.native
  var logEntries: js.Array[TestMessageLogDetails] = js.native
  var name: String = js.native
  var releaseEnvironmentUri: String = js.native
  var releaseUri: String = js.native
  var sourceWorkflow: String = js.native
  var startedDate: String = js.native
  var state: String = js.native
  var substate: TestRunSubstate = js.native
  var testEnvironmentId: String = js.native
  var testSettings: ShallowReference = js.native
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
  @scala.inline
  implicit class RunUpdateModelOps[Self <: RunUpdateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuild(value: ShallowReference): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildDropLocation(value: String): Self = this.set("buildDropLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildFlavor(value: String): Self = this.set("buildFlavor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildPlatform(value: String): Self = this.set("buildPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletedDate(value: String): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteInProgressResults(value: Boolean): Self = this.set("deleteInProgressResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setDtlAutEnvironment(value: ShallowReference): Self = this.set("dtlAutEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDtlEnvironment(value: ShallowReference): Self = this.set("dtlEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDtlEnvironmentDetails(value: DtlEnvironmentDetails): Self = this.set("dtlEnvironmentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setDueDate(value: String): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIteration(value: String): Self = this.set("iteration", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogEntriesVarargs(value: TestMessageLogDetails*): Self = this.set("logEntries", js.Array(value :_*))
    @scala.inline
    def setLogEntries(value: js.Array[TestMessageLogDetails]): Self = this.set("logEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseEnvironmentUri(value: String): Self = this.set("releaseEnvironmentUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseUri(value: String): Self = this.set("releaseUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceWorkflow(value: String): Self = this.set("sourceWorkflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedDate(value: String): Self = this.set("startedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubstate(value: TestRunSubstate): Self = this.set("substate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestEnvironmentId(value: String): Self = this.set("testEnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSettings(value: ShallowReference): Self = this.set("testSettings", value.asInstanceOf[js.Any])
  }
  
}

