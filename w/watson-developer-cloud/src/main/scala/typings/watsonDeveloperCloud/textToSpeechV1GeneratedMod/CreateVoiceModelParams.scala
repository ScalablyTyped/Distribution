package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.CreateVoiceModelConstants.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createVoiceModel` operation. */
trait CreateVoiceModelParams extends StObject {
  
  /** A description of the new custom voice model. Specifying a description is recommended. */
  var description: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The language of the new custom voice model. Omit the parameter to use the the default language, `en-US`. */
  var language: js.UndefOr[Language | String] = js.undefined
  
  /** The name of the new custom voice model. */
  var name: String
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object CreateVoiceModelParams {
  
  @scala.inline
  def apply(name: String): CreateVoiceModelParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceModelParams]
  }
  
  @scala.inline
  implicit class CreateVoiceModelParamsMutableBuilder[Self <: CreateVoiceModelParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language | String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
