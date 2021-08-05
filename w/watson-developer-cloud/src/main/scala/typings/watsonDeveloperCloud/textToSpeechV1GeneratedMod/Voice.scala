package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Voice. */
trait Voice extends StObject {
  
  /** If `true`, the voice can be customized; if `false`, the voice cannot be customized. (Same as `custom_pronunciation`; maintained for backward compatibility.). */
  var customizable: Boolean
  
  /** Returns information about a specified custom voice model. This field is returned only by the **Get a voice** method and only when you specify the customization ID of a custom voice model. */
  var customization: js.UndefOr[VoiceModel] = js.undefined
  
  /** A textual description of the voice. */
  var description: String
  
  /** The gender of the voice: `male` or `female`. */
  var gender: String
  
  /** The language and region of the voice (for example, `en-US`). */
  var language: String
  
  /** The name of the voice. Use this as the voice identifier in all requests. */
  var name: String
  
  /** Describes the additional service features that are supported with the voice. */
  var supported_features: SupportedFeatures
  
  /** The URI of the voice. */
  var url: String
}
object Voice {
  
  inline def apply(
    customizable: Boolean,
    description: String,
    gender: String,
    language: String,
    name: String,
    supported_features: SupportedFeatures,
    url: String
  ): Voice = {
    val __obj = js.Dynamic.literal(customizable = customizable.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supported_features = supported_features.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
  
  extension [Self <: Voice](x: Self) {
    
    inline def setCustomizable(value: Boolean): Self = StObject.set(x, "customizable", value.asInstanceOf[js.Any])
    
    inline def setCustomization(value: VoiceModel): Self = StObject.set(x, "customization", value.asInstanceOf[js.Any])
    
    inline def setCustomizationUndefined: Self = StObject.set(x, "customization", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSupported_features(value: SupportedFeatures): Self = StObject.set(x, "supported_features", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
