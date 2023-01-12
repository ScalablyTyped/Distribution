package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the additional service features that are supported with the voice. */
trait SupportedFeatures extends StObject {
  
  /** If `true`, the voice can be customized; if `false`, the voice cannot be customized. (Same as `customizable`.). */
  var custom_pronunciation: Boolean
  
  /** If `true`, the voice can be transformed by using the SSML &lt;voice-transformation&gt; element; if `false`, the voice cannot be transformed. */
  var voice_transformation: Boolean
}
object SupportedFeatures {
  
  inline def apply(custom_pronunciation: Boolean, voice_transformation: Boolean): SupportedFeatures = {
    val __obj = js.Dynamic.literal(custom_pronunciation = custom_pronunciation.asInstanceOf[js.Any], voice_transformation = voice_transformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
    
    inline def setCustom_pronunciation(value: Boolean): Self = StObject.set(x, "custom_pronunciation", value.asInstanceOf[js.Any])
    
    inline def setVoice_transformation(value: Boolean): Self = StObject.set(x, "voice_transformation", value.asInstanceOf[js.Any])
  }
}
