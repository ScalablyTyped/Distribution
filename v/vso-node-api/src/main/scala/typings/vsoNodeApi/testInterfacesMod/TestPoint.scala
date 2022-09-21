package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPoint extends StObject {
  
  var assignedTo: IdentityRef
  
  var automated: Boolean
  
  var comment: String
  
  var configuration: ShallowReference
  
  var failureType: String
  
  var id: Double
  
  var lastResolutionStateId: Double
  
  var lastResult: ShallowReference
  
  var lastResultDetails: LastResultDetails
  
  var lastResultState: String
  
  var lastRunBuildNumber: String
  
  var lastTestRun: ShallowReference
  
  var lastUpdatedBy: IdentityRef
  
  var lastUpdatedDate: js.Date
  
  var outcome: String
  
  var revision: Double
  
  var state: String
  
  var suite: ShallowReference
  
  var testCase: WorkItemReference
  
  var testPlan: ShallowReference
  
  var url: String
  
  var workItemProperties: js.Array[Any]
}
object TestPoint {
  
  inline def apply(
    assignedTo: IdentityRef,
    automated: Boolean,
    comment: String,
    configuration: ShallowReference,
    failureType: String,
    id: Double,
    lastResolutionStateId: Double,
    lastResult: ShallowReference,
    lastResultDetails: LastResultDetails,
    lastResultState: String,
    lastRunBuildNumber: String,
    lastTestRun: ShallowReference,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    outcome: String,
    revision: Double,
    state: String,
    suite: ShallowReference,
    testCase: WorkItemReference,
    testPlan: ShallowReference,
    url: String,
    workItemProperties: js.Array[Any]
  ): TestPoint = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], automated = automated.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResolutionStateId = lastResolutionStateId.asInstanceOf[js.Any], lastResult = lastResult.asInstanceOf[js.Any], lastResultDetails = lastResultDetails.asInstanceOf[js.Any], lastResultState = lastResultState.asInstanceOf[js.Any], lastRunBuildNumber = lastRunBuildNumber.asInstanceOf[js.Any], lastTestRun = lastTestRun.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemProperties = workItemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPoint]
  }
  
  extension [Self <: TestPoint](x: Self) {
    
    inline def setAssignedTo(value: IdentityRef): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAutomated(value: Boolean): Self = StObject.set(x, "automated", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ShallowReference): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResolutionStateId(value: Double): Self = StObject.set(x, "lastResolutionStateId", value.asInstanceOf[js.Any])
    
    inline def setLastResult(value: ShallowReference): Self = StObject.set(x, "lastResult", value.asInstanceOf[js.Any])
    
    inline def setLastResultDetails(value: LastResultDetails): Self = StObject.set(x, "lastResultDetails", value.asInstanceOf[js.Any])
    
    inline def setLastResultState(value: String): Self = StObject.set(x, "lastResultState", value.asInstanceOf[js.Any])
    
    inline def setLastRunBuildNumber(value: String): Self = StObject.set(x, "lastRunBuildNumber", value.asInstanceOf[js.Any])
    
    inline def setLastTestRun(value: ShallowReference): Self = StObject.set(x, "lastTestRun", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSuite(value: ShallowReference): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    
    inline def setTestCase(value: WorkItemReference): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestPlan(value: ShallowReference): Self = StObject.set(x, "testPlan", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkItemProperties(value: js.Array[Any]): Self = StObject.set(x, "workItemProperties", value.asInstanceOf[js.Any])
    
    inline def setWorkItemPropertiesVarargs(value: Any*): Self = StObject.set(x, "workItemProperties", js.Array(value*))
  }
}
