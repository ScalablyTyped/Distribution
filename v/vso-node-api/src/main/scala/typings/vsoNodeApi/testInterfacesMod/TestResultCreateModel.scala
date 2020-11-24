package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultCreateModel extends js.Object {
  
  var area: ShallowReference = js.native
  
  var associatedWorkItems: js.Array[Double] = js.native
  
  var automatedTestId: String = js.native
  
  var automatedTestName: String = js.native
  
  var automatedTestStorage: String = js.native
  
  var automatedTestType: String = js.native
  
  var automatedTestTypeId: String = js.native
  
  var comment: String = js.native
  
  var completedDate: String = js.native
  
  var computerName: String = js.native
  
  var configuration: ShallowReference = js.native
  
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
  
  var testCase: ShallowReference = js.native
  
  var testCasePriority: String = js.native
  
  var testCaseTitle: String = js.native
  
  var testPoint: ShallowReference = js.native
}
object TestResultCreateModel {
  
  @scala.inline
  def apply(
    area: ShallowReference,
    associatedWorkItems: js.Array[Double],
    automatedTestId: String,
    automatedTestName: String,
    automatedTestStorage: String,
    automatedTestType: String,
    automatedTestTypeId: String,
    comment: String,
    completedDate: String,
    computerName: String,
    configuration: ShallowReference,
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
    testCase: ShallowReference,
    testCasePriority: String,
    testCaseTitle: String,
    testPoint: ShallowReference
  ): TestResultCreateModel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], automatedTestId = automatedTestId.asInstanceOf[js.Any], automatedTestName = automatedTestName.asInstanceOf[js.Any], automatedTestStorage = automatedTestStorage.asInstanceOf[js.Any], automatedTestType = automatedTestType.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testCasePriority = testCasePriority.asInstanceOf[js.Any], testCaseTitle = testCaseTitle.asInstanceOf[js.Any], testPoint = testPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultCreateModel]
  }
  
  @scala.inline
  implicit class TestResultCreateModelOps[Self <: TestResultCreateModel] (val x: Self) extends AnyVal {
    
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
    def setArea(value: ShallowReference): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedWorkItemsVarargs(value: Double*): Self = this.set("associatedWorkItems", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedWorkItems(value: js.Array[Double]): Self = this.set("associatedWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestId(value: String): Self = this.set("automatedTestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestName(value: String): Self = this.set("automatedTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestStorage(value: String): Self = this.set("automatedTestStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestType(value: String): Self = this.set("automatedTestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestTypeId(value: String): Self = this.set("automatedTestTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: String): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerName(value: String): Self = this.set("computerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: ShallowReference): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
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
    def setTestCase(value: ShallowReference): Self = this.set("testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasePriority(value: String): Self = this.set("testCasePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseTitle(value: String): Self = this.set("testCaseTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPoint(value: ShallowReference): Self = this.set("testPoint", value.asInstanceOf[js.Any])
  }
}
