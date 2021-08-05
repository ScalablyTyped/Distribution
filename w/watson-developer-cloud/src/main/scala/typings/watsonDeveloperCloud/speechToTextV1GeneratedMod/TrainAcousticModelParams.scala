package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `trainAcousticModel` operation. */
trait TrainAcousticModelParams extends StObject {
  
  /** The customization ID (GUID) of a custom language model that is to be used during training of the custom acoustic model. Specify a custom language model that has been trained with verbatim transcriptions of the audio resources or that contains words that are relevant to the contents of the audio resources. The custom language model must be based on the same version of the same base model as the custom acoustic model. The credentials specified with the request must own both custom models. */
  var custom_language_model_id: js.UndefOr[String] = js.undefined
  
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object TrainAcousticModelParams {
  
  inline def apply(customization_id: String): TrainAcousticModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainAcousticModelParams]
  }
  
  extension [Self <: TrainAcousticModelParams](x: Self) {
    
    inline def setCustom_language_model_id(value: String): Self = StObject.set(x, "custom_language_model_id", value.asInstanceOf[js.Any])
    
    inline def setCustom_language_model_idUndefined: Self = StObject.set(x, "custom_language_model_id", js.undefined)
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
