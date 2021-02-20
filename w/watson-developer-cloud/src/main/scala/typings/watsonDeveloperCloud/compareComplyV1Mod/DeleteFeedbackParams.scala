package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.watsonDeveloperCloud.compareComplyV1Mod.DeleteFeedbackConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteFeedback` operation. */
@js.native
trait DeleteFeedbackParams extends StObject {
  
  /** A string that specifies the feedback entry to be deleted from the document. */
  var feedback_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object DeleteFeedbackParams {
  
  @scala.inline
  def apply(feedback_id: String): DeleteFeedbackParams = {
    val __obj = js.Dynamic.literal(feedback_id = feedback_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFeedbackParams]
  }
  
  @scala.inline
  implicit class DeleteFeedbackParamsMutableBuilder[Self <: DeleteFeedbackParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedback_id(value: String): Self = StObject.set(x, "feedback_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
