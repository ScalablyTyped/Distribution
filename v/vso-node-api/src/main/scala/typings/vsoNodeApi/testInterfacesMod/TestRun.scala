package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRun extends js.Object {
  
  var build: ShallowReference = js.native
  
  var buildConfiguration: BuildConfiguration = js.native
  
  var comment: String = js.native
  
  var completedDate: Date = js.native
  
  var controller: String = js.native
  
  var createdDate: Date = js.native
  
  var customFields: js.Array[CustomTestField] = js.native
  
  var dropLocation: String = js.native
  
  var dtlAutEnvironment: ShallowReference = js.native
  
  var dtlEnvironment: ShallowReference = js.native
  
  var dtlEnvironmentCreationDetails: DtlEnvironmentDetails = js.native
  
  var dueDate: Date = js.native
  
  var errorMessage: String = js.native
  
  var filter: RunFilter = js.native
  
  var id: Double = js.native
  
  var incompleteTests: Double = js.native
  
  var isAutomated: Boolean = js.native
  
  var iteration: String = js.native
  
  var lastUpdatedBy: IdentityRef = js.native
  
  var lastUpdatedDate: Date = js.native
  
  var name: String = js.native
  
  var notApplicableTests: Double = js.native
  
  var owner: IdentityRef = js.native
  
  var passedTests: Double = js.native
  
  var phase: String = js.native
  
  var plan: ShallowReference = js.native
  
  var postProcessState: String = js.native
  
  var project: ShallowReference = js.native
  
  var release: ReleaseReference = js.native
  
  var releaseEnvironmentUri: String = js.native
  
  var releaseUri: String = js.native
  
  var revision: Double = js.native
  
  var runStatistics: js.Array[RunStatistic] = js.native
  
  var startedDate: Date = js.native
  
  var state: String = js.native
  
  var substate: TestRunSubstate = js.native
  
  var testEnvironment: TestEnvironment = js.native
  
  var testMessageLogId: Double = js.native
  
  var testSettings: ShallowReference = js.native
  
  var totalTests: Double = js.native
  
  var unanalyzedTests: Double = js.native
  
  var url: String = js.native
  
  var webAccessUrl: String = js.native
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
  
  @scala.inline
  implicit class TestRunOps[Self <: TestRun] (val x: Self) extends AnyVal {
    
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
    def setBuildConfiguration(value: BuildConfiguration): Self = this.set("buildConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: Date): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsVarargs(value: CustomTestField*): Self = this.set("customFields", js.Array(value :_*))
    
    @scala.inline
    def setCustomFields(value: js.Array[CustomTestField]): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLocation(value: String): Self = this.set("dropLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlAutEnvironment(value: ShallowReference): Self = this.set("dtlAutEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlEnvironment(value: ShallowReference): Self = this.set("dtlEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlEnvironmentCreationDetails(value: DtlEnvironmentDetails): Self = this.set("dtlEnvironmentCreationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDate(value: Date): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: RunFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompleteTests(value: Double): Self = this.set("incompleteTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomated(value: Boolean): Self = this.set("isAutomated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteration(value: String): Self = this.set("iteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicableTests(value: Double): Self = this.set("notApplicableTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedTests(value: Double): Self = this.set("passedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: String): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: ShallowReference): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostProcessState(value: String): Self = this.set("postProcessState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReleaseReference): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvironmentUri(value: String): Self = this.set("releaseEnvironmentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUri(value: String): Self = this.set("releaseUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunStatisticsVarargs(value: RunStatistic*): Self = this.set("runStatistics", js.Array(value :_*))
    
    @scala.inline
    def setRunStatistics(value: js.Array[RunStatistic]): Self = this.set("runStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: Date): Self = this.set("startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstate(value: TestRunSubstate): Self = this.set("substate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestEnvironment(value: TestEnvironment): Self = this.set("testEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestMessageLogId(value: Double): Self = this.set("testMessageLogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSettings(value: ShallowReference): Self = this.set("testSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTests(value: Double): Self = this.set("totalTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnanalyzedTests(value: Double): Self = this.set("unanalyzedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAccessUrl(value: String): Self = this.set("webAccessUrl", value.asInstanceOf[js.Any])
  }
}
