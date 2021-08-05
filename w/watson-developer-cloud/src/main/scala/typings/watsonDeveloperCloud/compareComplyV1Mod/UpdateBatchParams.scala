package typings.watsonDeveloperCloud.compareComplyV1Mod

import typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action
import typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateBatch` operation. */
trait UpdateBatchParams extends StObject {
  
  /** The action you want to perform on the specified batch-processing job. */
  var action: Action | String
  
  /** The ID of the batch-processing job you want to update. */
  var batch_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object UpdateBatchParams {
  
  inline def apply(action: Action | String, batch_id: String): UpdateBatchParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchParams]
  }
  
  extension [Self <: UpdateBatchParams](x: Self) {
    
    inline def setAction(value: Action | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
