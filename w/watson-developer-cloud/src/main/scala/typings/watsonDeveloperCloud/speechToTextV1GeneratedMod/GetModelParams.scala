package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.GetModelConstants.ModelId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `getModel` operation. */
trait GetModelParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The identifier of the model in the form of its name from the output of the **Get a model** method. */
  var model_id: ModelId | String
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object GetModelParams {
  
  @scala.inline
  def apply(model_id: ModelId | String): GetModelParams = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelParams]
  }
  
  @scala.inline
  implicit class GetModelParamsMutableBuilder[Self <: GetModelParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setModel_id(value: ModelId | String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
