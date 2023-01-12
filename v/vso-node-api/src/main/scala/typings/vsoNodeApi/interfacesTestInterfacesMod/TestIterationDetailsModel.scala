package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestIterationDetailsModel extends StObject {
  
  var actionResults: js.Array[TestActionResultModel]
  
  var attachments: js.Array[TestCaseResultAttachmentModel]
  
  var comment: String
  
  var completedDate: js.Date
  
  var durationInMs: Double
  
  var errorMessage: String
  
  var id: Double
  
  var outcome: String
  
  var parameters: js.Array[TestResultParameterModel]
  
  var startedDate: js.Date
  
  var url: String
}
object TestIterationDetailsModel {
  
  inline def apply(
    actionResults: js.Array[TestActionResultModel],
    attachments: js.Array[TestCaseResultAttachmentModel],
    comment: String,
    completedDate: js.Date,
    durationInMs: Double,
    errorMessage: String,
    id: Double,
    outcome: String,
    parameters: js.Array[TestResultParameterModel],
    startedDate: js.Date,
    url: String
  ): TestIterationDetailsModel = {
    val __obj = js.Dynamic.literal(actionResults = actionResults.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIterationDetailsModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestIterationDetailsModel] (val x: Self) extends AnyVal {
    
    inline def setActionResults(value: js.Array[TestActionResultModel]): Self = StObject.set(x, "actionResults", value.asInstanceOf[js.Any])
    
    inline def setActionResultsVarargs(value: TestActionResultModel*): Self = StObject.set(x, "actionResults", js.Array(value*))
    
    inline def setAttachments(value: js.Array[TestCaseResultAttachmentModel]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: TestCaseResultAttachmentModel*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCompletedDate(value: js.Date): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    inline def setDurationInMs(value: Double): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[TestResultParameterModel]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: TestResultParameterModel*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setStartedDate(value: js.Date): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
