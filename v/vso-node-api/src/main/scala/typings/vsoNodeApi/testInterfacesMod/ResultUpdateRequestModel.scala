package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultUpdateRequestModel extends js.Object {
  
  var actionResultDeletes: js.Array[TestActionResultModel] = js.native
  
  var actionResults: js.Array[TestActionResultModel] = js.native
  
  var parameterDeletes: js.Array[TestResultParameterModel] = js.native
  
  var parameters: js.Array[TestResultParameterModel] = js.native
  
  var testCaseResult: TestCaseResultUpdateModel = js.native
}
object ResultUpdateRequestModel {
  
  @scala.inline
  def apply(
    actionResultDeletes: js.Array[TestActionResultModel],
    actionResults: js.Array[TestActionResultModel],
    parameterDeletes: js.Array[TestResultParameterModel],
    parameters: js.Array[TestResultParameterModel],
    testCaseResult: TestCaseResultUpdateModel
  ): ResultUpdateRequestModel = {
    val __obj = js.Dynamic.literal(actionResultDeletes = actionResultDeletes.asInstanceOf[js.Any], actionResults = actionResults.asInstanceOf[js.Any], parameterDeletes = parameterDeletes.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], testCaseResult = testCaseResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultUpdateRequestModel]
  }
  
  @scala.inline
  implicit class ResultUpdateRequestModelOps[Self <: ResultUpdateRequestModel] (val x: Self) extends AnyVal {
    
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
    def setActionResultDeletesVarargs(value: TestActionResultModel*): Self = this.set("actionResultDeletes", js.Array(value :_*))
    
    @scala.inline
    def setActionResultDeletes(value: js.Array[TestActionResultModel]): Self = this.set("actionResultDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionResultsVarargs(value: TestActionResultModel*): Self = this.set("actionResults", js.Array(value :_*))
    
    @scala.inline
    def setActionResults(value: js.Array[TestActionResultModel]): Self = this.set("actionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterDeletesVarargs(value: TestResultParameterModel*): Self = this.set("parameterDeletes", js.Array(value :_*))
    
    @scala.inline
    def setParameterDeletes(value: js.Array[TestResultParameterModel]): Self = this.set("parameterDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: TestResultParameterModel*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[TestResultParameterModel]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseResult(value: TestCaseResultUpdateModel): Self = this.set("testCaseResult", value.asInstanceOf[js.Any])
  }
}
