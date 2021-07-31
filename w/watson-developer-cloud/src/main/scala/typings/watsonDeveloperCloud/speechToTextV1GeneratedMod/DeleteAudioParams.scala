package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteAudio` operation. */
trait DeleteAudioParams extends StObject {
  
  /** The name of the audio resource for the custom acoustic model. */
  var audio_name: String
  
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object DeleteAudioParams {
  
  @scala.inline
  def apply(audio_name: String, customization_id: String): DeleteAudioParams = {
    val __obj = js.Dynamic.literal(audio_name = audio_name.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAudioParams]
  }
  
  @scala.inline
  implicit class DeleteAudioParamsMutableBuilder[Self <: DeleteAudioParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio_name(value: String): Self = StObject.set(x, "audio_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
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
