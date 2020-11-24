package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestIterationDetailsModel extends js.Object {
  
  var actionResults: js.Array[TestActionResultModel] = js.native
  
  var attachments: js.Array[TestCaseResultAttachmentModel] = js.native
  
  var comment: String = js.native
  
  var completedDate: Date = js.native
  
  var durationInMs: Double = js.native
  
  var errorMessage: String = js.native
  
  var id: Double = js.native
  
  var outcome: String = js.native
  
  var parameters: js.Array[TestResultParameterModel] = js.native
  
  var startedDate: Date = js.native
  
  var url: String = js.native
}
object TestIterationDetailsModel {
  
  @scala.inline
  def apply(
    actionResults: js.Array[TestActionResultModel],
    attachments: js.Array[TestCaseResultAttachmentModel],
    comment: String,
    completedDate: Date,
    durationInMs: Double,
    errorMessage: String,
    id: Double,
    outcome: String,
    parameters: js.Array[TestResultParameterModel],
    startedDate: Date,
    url: String
  ): TestIterationDetailsModel = {
    val __obj = js.Dynamic.literal(actionResults = actionResults.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIterationDetailsModel]
  }
  
  @scala.inline
  implicit class TestIterationDetailsModelOps[Self <: TestIterationDetailsModel] (val x: Self) extends AnyVal {
    
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
    def setActionResultsVarargs(value: TestActionResultModel*): Self = this.set("actionResults", js.Array(value :_*))
    
    @scala.inline
    def setActionResults(value: js.Array[TestActionResultModel]): Self = this.set("actionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: TestCaseResultAttachmentModel*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[TestCaseResultAttachmentModel]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: Date): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMs(value: Double): Self = this.set("durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: TestResultParameterModel*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[TestResultParameterModel]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: Date): Self = this.set("startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
