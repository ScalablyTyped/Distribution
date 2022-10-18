package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AcousticModels. */
trait AcousticModels extends StObject {
  
  /** An array of `AcousticModel` objects that provides information about each available custom acoustic model. The array is empty if the requesting credentials own no custom acoustic models (if no language is specified) or own no custom acoustic models for the specified language. */
  var customizations: js.Array[AcousticModel]
}
object AcousticModels {
  
  inline def apply(customizations: js.Array[AcousticModel]): AcousticModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcousticModels]
  }
  
  extension [Self <: AcousticModels](x: Self) {
    
    inline def setCustomizations(value: js.Array[AcousticModel]): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    
    inline def setCustomizationsVarargs(value: AcousticModel*): Self = StObject.set(x, "customizations", js.Array(value*))
  }
}
