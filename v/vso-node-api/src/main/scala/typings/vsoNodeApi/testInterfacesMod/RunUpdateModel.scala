package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunUpdateModel extends StObject {
  
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
  
  @scala.inline
  implicit class RunUpdateModelMutableBuilder[Self <: RunUpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildDropLocation(value: String): Self = StObject.set(x, "buildDropLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildFlavor(value: String): Self = StObject.set(x, "buildFlavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildPlatform(value: String): Self = StObject.set(x, "buildPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: String): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteInProgressResults(value: Boolean): Self = StObject.set(x, "deleteInProgressResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlAutEnvironment(value: ShallowReference): Self = StObject.set(x, "dtlAutEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlEnvironment(value: ShallowReference): Self = StObject.set(x, "dtlEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlEnvironmentDetails(value: DtlEnvironmentDetails): Self = StObject.set(x, "dtlEnvironmentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteration(value: String): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEntries(value: js.Array[TestMessageLogDetails]): Self = StObject.set(x, "logEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEntriesVarargs(value: TestMessageLogDetails*): Self = StObject.set(x, "logEntries", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvironmentUri(value: String): Self = StObject.set(x, "releaseEnvironmentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUri(value: String): Self = StObject.set(x, "releaseUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWorkflow(value: String): Self = StObject.set(x, "sourceWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: String): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstate(value: TestRunSubstate): Self = StObject.set(x, "substate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestEnvironmentId(value: String): Self = StObject.set(x, "testEnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSettings(value: ShallowReference): Self = StObject.set(x, "testSettings", value.asInstanceOf[js.Any])
  }
}
