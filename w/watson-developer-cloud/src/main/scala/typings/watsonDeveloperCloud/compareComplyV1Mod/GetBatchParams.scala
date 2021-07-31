package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getBatch` operation. */
trait GetBatchParams extends StObject {
  
  /** The ID of the batch-processing job whose information you want to retrieve. */
  var batch_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object GetBatchParams {
  
  @scala.inline
  def apply(batch_id: String): GetBatchParams = {
    val __obj = js.Dynamic.literal(batch_id = batch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchParams]
  }
  
  @scala.inline
  implicit class GetBatchParamsMutableBuilder[Self <: GetBatchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
