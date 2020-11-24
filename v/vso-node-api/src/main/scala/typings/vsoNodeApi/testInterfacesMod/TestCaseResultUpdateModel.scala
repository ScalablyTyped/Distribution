package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseResultUpdateModel extends js.Object {
  
  var associatedWorkItems: js.Array[Double] = js.native
  
  var automatedTestTypeId: String = js.native
  
  var comment: String = js.native
  
  var completedDate: String = js.native
  
  var computerName: String = js.native
  
  var customFields: js.Array[CustomTestField] = js.native
  
  var durationInMs: String = js.native
  
  var errorMessage: String = js.native
  
  var failureType: String = js.native
  
  var outcome: String = js.native
  
  var owner: IdentityRef = js.native
  
  var resolutionState: String = js.native
  
  var runBy: IdentityRef = js.native
  
  var stackTrace: String = js.native
  
  var startedDate: String = js.native
  
  var state: String = js.native
  
  var testCasePriority: String = js.native
  
  var testResult: ShallowReference = js.native
}
object TestCaseResultUpdateModel {
  
  @scala.inline
  def apply(
    associatedWorkItems: js.Array[Double],
    automatedTestTypeId: String,
    comment: String,
    completedDate: String,
    computerName: String,
    customFields: js.Array[CustomTestField],
    durationInMs: String,
    errorMessage: String,
    failureType: String,
    outcome: String,
    owner: IdentityRef,
    resolutionState: String,
    runBy: IdentityRef,
    stackTrace: String,
    startedDate: String,
    state: String,
    testCasePriority: String,
    testResult: ShallowReference
  ): TestCaseResultUpdateModel = {
    val __obj = js.Dynamic.literal(associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCasePriority = testCasePriority.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultUpdateModel]
  }
  
  @scala.inline
  implicit class TestCaseResultUpdateModelOps[Self <: TestCaseResultUpdateModel] (val x: Self) extends AnyVal {
    
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
    def setAssociatedWorkItemsVarargs(value: Double*): Self = this.set("associatedWorkItems", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedWorkItems(value: js.Array[Double]): Self = this.set("associatedWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestTypeId(value: String): Self = this.set("automatedTestTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: String): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerName(value: String): Self = this.set("computerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsVarargs(value: CustomTestField*): Self = this.set("customFields", js.Array(value :_*))
    
    @scala.inline
    def setCustomFields(value: js.Array[CustomTestField]): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMs(value: String): Self = this.set("durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureType(value: String): Self = this.set("failureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionState(value: String): Self = this.set("resolutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBy(value: IdentityRef): Self = this.set("runBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: String): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: String): Self = this.set("startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasePriority(value: String): Self = this.set("testCasePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResult(value: ShallowReference): Self = this.set("testResult", value.asInstanceOf[js.Any])
  }
}
