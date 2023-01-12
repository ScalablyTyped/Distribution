package typings.vsoNodeApi.interfacesTestInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseResultUpdateModel extends StObject {
  
  var associatedWorkItems: js.Array[Double]
  
  var automatedTestTypeId: String
  
  var comment: String
  
  var completedDate: String
  
  var computerName: String
  
  var customFields: js.Array[CustomTestField]
  
  var durationInMs: String
  
  var errorMessage: String
  
  var failureType: String
  
  var outcome: String
  
  var owner: IdentityRef
  
  var resolutionState: String
  
  var runBy: IdentityRef
  
  var stackTrace: String
  
  var startedDate: String
  
  var state: String
  
  var testCasePriority: String
  
  var testResult: ShallowReference
}
object TestCaseResultUpdateModel {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TestCaseResultUpdateModel] (val x: Self) extends AnyVal {
    
    inline def setAssociatedWorkItems(value: js.Array[Double]): Self = StObject.set(x, "associatedWorkItems", value.asInstanceOf[js.Any])
    
    inline def setAssociatedWorkItemsVarargs(value: Double*): Self = StObject.set(x, "associatedWorkItems", js.Array(value*))
    
    inline def setAutomatedTestTypeId(value: String): Self = StObject.set(x, "automatedTestTypeId", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCompletedDate(value: String): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    inline def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
    
    inline def setCustomFields(value: js.Array[CustomTestField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsVarargs(value: CustomTestField*): Self = StObject.set(x, "customFields", js.Array(value*))
    
    inline def setDurationInMs(value: String): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setResolutionState(value: String): Self = StObject.set(x, "resolutionState", value.asInstanceOf[js.Any])
    
    inline def setRunBy(value: IdentityRef): Self = StObject.set(x, "runBy", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStartedDate(value: String): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTestCasePriority(value: String): Self = StObject.set(x, "testCasePriority", value.asInstanceOf[js.Any])
    
    inline def setTestResult(value: ShallowReference): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
  }
}
