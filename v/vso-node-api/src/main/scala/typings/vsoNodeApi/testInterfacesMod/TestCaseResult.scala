package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseResult extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: TestCaseResult](x: Self) {
    
    inline def setAfnStripId(value: Double): Self = StObject.set(x, "afnStripId", value.asInstanceOf[js.Any])
    
    inline def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAssociatedBugs(value: js.Array[ShallowReference]): Self = StObject.set(x, "associatedBugs", value.asInstanceOf[js.Any])
    
    inline def setAssociatedBugsVarargs(value: ShallowReference*): Self = StObject.set(x, "associatedBugs", js.Array(value :_*))
    
    inline def setAutomatedTestId(value: String): Self = StObject.set(x, "automatedTestId", value.asInstanceOf[js.Any])
    
    inline def setAutomatedTestName(value: String): Self = StObject.set(x, "automatedTestName", value.asInstanceOf[js.Any])
    
    inline def setAutomatedTestStorage(value: String): Self = StObject.set(x, "automatedTestStorage", value.asInstanceOf[js.Any])
    
    inline def setAutomatedTestType(value: String): Self = StObject.set(x, "automatedTestType", value.asInstanceOf[js.Any])
    
    inline def setAutomatedTestTypeId(value: String): Self = StObject.set(x, "automatedTestTypeId", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildReference(value: BuildReference): Self = StObject.set(x, "buildReference", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCompletedDate(value: Date): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    inline def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ShallowReference): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCustomFields(value: js.Array[CustomTestField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsVarargs(value: CustomTestField*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    inline def setDurationInMs(value: Double): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setFailingSince(value: FailingSince): Self = StObject.set(x, "failingSince", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIterationDetails(value: js.Array[TestIterationDetailsModel]): Self = StObject.set(x, "iterationDetails", value.asInstanceOf[js.Any])
    
    inline def setIterationDetailsVarargs(value: TestIterationDetailsModel*): Self = StObject.set(x, "iterationDetails", js.Array(value :_*))
    
    inline def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: ShallowReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseReference(value: ReleaseReference): Self = StObject.set(x, "releaseReference", value.asInstanceOf[js.Any])
    
    inline def setResetCount(value: Double): Self = StObject.set(x, "resetCount", value.asInstanceOf[js.Any])
    
    inline def setResolutionState(value: String): Self = StObject.set(x, "resolutionState", value.asInstanceOf[js.Any])
    
    inline def setResolutionStateId(value: Double): Self = StObject.set(x, "resolutionStateId", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRunBy(value: IdentityRef): Self = StObject.set(x, "runBy", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStartedDate(value: Date): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTestCase(value: ShallowReference): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseReferenceId(value: Double): Self = StObject.set(x, "testCaseReferenceId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseTitle(value: String): Self = StObject.set(x, "testCaseTitle", value.asInstanceOf[js.Any])
    
    inline def setTestPlan(value: ShallowReference): Self = StObject.set(x, "testPlan", value.asInstanceOf[js.Any])
    
    inline def setTestPoint(value: ShallowReference): Self = StObject.set(x, "testPoint", value.asInstanceOf[js.Any])
    
    inline def setTestRun(value: ShallowReference): Self = StObject.set(x, "testRun", value.asInstanceOf[js.Any])
    
    inline def setTestSuite(value: ShallowReference): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
