package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseResultUpdateModel extends StObject {
  
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
  implicit class TestCaseResultUpdateModelMutableBuilder[Self <: TestCaseResultUpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedWorkItems(value: js.Array[Double]): Self = StObject.set(x, "associatedWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedWorkItemsVarargs(value: Double*): Self = StObject.set(x, "associatedWorkItems", js.Array(value :_*))
    
    @scala.inline
    def setAutomatedTestTypeId(value: String): Self = StObject.set(x, "automatedTestTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: String): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFields(value: js.Array[CustomTestField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsVarargs(value: CustomTestField*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setDurationInMs(value: String): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionState(value: String): Self = StObject.set(x, "resolutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBy(value: IdentityRef): Self = StObject.set(x, "runBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: String): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasePriority(value: String): Self = StObject.set(x, "testCasePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResult(value: ShallowReference): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
  }
}
