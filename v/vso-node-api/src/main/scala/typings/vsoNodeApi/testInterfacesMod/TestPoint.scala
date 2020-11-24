package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestPoint extends js.Object {
  
  var assignedTo: IdentityRef = js.native
  
  var automated: Boolean = js.native
  
  var comment: String = js.native
  
  var configuration: ShallowReference = js.native
  
  var failureType: String = js.native
  
  var id: Double = js.native
  
  var lastResolutionStateId: Double = js.native
  
  var lastResult: ShallowReference = js.native
  
  var lastResultDetails: LastResultDetails = js.native
  
  var lastResultState: String = js.native
  
  var lastRunBuildNumber: String = js.native
  
  var lastTestRun: ShallowReference = js.native
  
  var lastUpdatedBy: IdentityRef = js.native
  
  var lastUpdatedDate: Date = js.native
  
  var outcome: String = js.native
  
  var revision: Double = js.native
  
  var state: String = js.native
  
  var suite: ShallowReference = js.native
  
  var testCase: WorkItemReference = js.native
  
  var testPlan: ShallowReference = js.native
  
  var url: String = js.native
  
  var workItemProperties: js.Array[_] = js.native
}
object TestPoint {
  
  @scala.inline
  def apply(
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
    lastUpdatedDate: Date,
    outcome: String,
    revision: Double,
    state: String,
    suite: ShallowReference,
    testCase: WorkItemReference,
    testPlan: ShallowReference,
    url: String,
    workItemProperties: js.Array[_]
  ): TestPoint = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], automated = automated.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResolutionStateId = lastResolutionStateId.asInstanceOf[js.Any], lastResult = lastResult.asInstanceOf[js.Any], lastResultDetails = lastResultDetails.asInstanceOf[js.Any], lastResultState = lastResultState.asInstanceOf[js.Any], lastRunBuildNumber = lastRunBuildNumber.asInstanceOf[js.Any], lastTestRun = lastTestRun.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemProperties = workItemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPoint]
  }
  
  @scala.inline
  implicit class TestPointOps[Self <: TestPoint] (val x: Self) extends AnyVal {
    
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
    def setAssignedTo(value: IdentityRef): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomated(value: Boolean): Self = this.set("automated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: ShallowReference): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureType(value: String): Self = this.set("failureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastResolutionStateId(value: Double): Self = this.set("lastResolutionStateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastResult(value: ShallowReference): Self = this.set("lastResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastResultDetails(value: LastResultDetails): Self = this.set("lastResultDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastResultState(value: String): Self = this.set("lastResultState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunBuildNumber(value: String): Self = this.set("lastRunBuildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTestRun(value: ShallowReference): Self = this.set("lastTestRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuite(value: ShallowReference): Self = this.set("suite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCase(value: WorkItemReference): Self = this.set("testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPlan(value: ShallowReference): Self = this.set("testPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemPropertiesVarargs(value: js.Any*): Self = this.set("workItemProperties", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemProperties(value: js.Array[_]): Self = this.set("workItemProperties", value.asInstanceOf[js.Any])
  }
}
