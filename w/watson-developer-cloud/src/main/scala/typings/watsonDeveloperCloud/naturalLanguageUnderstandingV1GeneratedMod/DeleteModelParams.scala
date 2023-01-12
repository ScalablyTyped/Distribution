package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteModel` operation. */
trait DeleteModelParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Model ID of the model to delete. */
  var model_id: String
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object DeleteModelParams {
  
  inline def apply(model_id: String): DeleteModelParams = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteModelParams] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
