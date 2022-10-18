package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateVoiceModel` operation. */
trait UpdateVoiceModelParams extends StObject {
  
  /** The customization ID (GUID) of the custom voice model. You must make the request with service credentials created for the instance of the service that owns the custom model. */
  var customization_id: String
  
  /** A new description for the custom voice model. */
  var description: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** A new name for the custom voice model. */
  var name: js.UndefOr[String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** An array of `Word` objects that provides the words and their translations that are to be added or updated for the custom voice model. Pass an empty array to make no additions or updates. */
  var words: js.UndefOr[js.Array[Word]] = js.undefined
}
object UpdateVoiceModelParams {
  
  inline def apply(customization_id: String): UpdateVoiceModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceModelParams]
  }
  
  extension [Self <: UpdateVoiceModelParams](x: Self) {
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
