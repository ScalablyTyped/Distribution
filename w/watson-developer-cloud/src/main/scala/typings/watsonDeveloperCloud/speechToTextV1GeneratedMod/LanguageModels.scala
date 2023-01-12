package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** LanguageModels. */
trait LanguageModels extends StObject {
  
  /** An array of `LanguageModel` objects that provides information about each available custom language model. The array is empty if the requesting credentials own no custom language models (if no language is specified) or own no custom language models for the specified language. */
  var customizations: js.Array[LanguageModel]
}
object LanguageModels {
  
  inline def apply(customizations: js.Array[LanguageModel]): LanguageModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageModels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageModels] (val x: Self) extends AnyVal {
    
    inline def setCustomizations(value: js.Array[LanguageModel]): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    
    inline def setCustomizationsVarargs(value: LanguageModel*): Self = StObject.set(x, "customizations", js.Array(value*))
  }
}
