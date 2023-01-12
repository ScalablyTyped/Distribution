package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** VoiceModels. */
trait VoiceModels extends StObject {
  
  /** An array of `VoiceModel` objects that provides information about each available custom voice model. The array is empty if the requesting service credentials own no custom voice models (if no language is specified) or own no custom voice models for the specified language. */
  var customizations: js.Array[VoiceModel]
}
object VoiceModels {
  
  inline def apply(customizations: js.Array[VoiceModel]): VoiceModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceModels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceModels] (val x: Self) extends AnyVal {
    
    inline def setCustomizations(value: js.Array[VoiceModel]): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    
    inline def setCustomizationsVarargs(value: VoiceModel*): Self = StObject.set(x, "customizations", js.Array(value*))
  }
}
