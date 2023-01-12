package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getFeedback` operation. */
trait GetFeedbackParams extends StObject {
  
  /** A string that specifies the feedback entry to be included in the output. */
  var feedback_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object GetFeedbackParams {
  
  inline def apply(feedback_id: String): GetFeedbackParams = {
    val __obj = js.Dynamic.literal(feedback_id = feedback_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeedbackParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFeedbackParams] (val x: Self) extends AnyVal {
    
    inline def setFeedback_id(value: String): Self = StObject.set(x, "feedback_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
