package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the additional service features that are supported with the model. */
trait SupportedFeatures extends StObject {
  
  /** Indicates whether the customization interface can be used to create a custom language model based on the language model. */
  var custom_language_model: Boolean
  
  /** Indicates whether the `speaker_labels` parameter can be used with the language model. */
  var speaker_labels: Boolean
}
object SupportedFeatures {
  
  inline def apply(custom_language_model: Boolean, speaker_labels: Boolean): SupportedFeatures = {
    val __obj = js.Dynamic.literal(custom_language_model = custom_language_model.asInstanceOf[js.Any], speaker_labels = speaker_labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
    
    inline def setCustom_language_model(value: Boolean): Self = StObject.set(x, "custom_language_model", value.asInstanceOf[js.Any])
    
    inline def setSpeaker_labels(value: Boolean): Self = StObject.set(x, "speaker_labels", value.asInstanceOf[js.Any])
  }
}
