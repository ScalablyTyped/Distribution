package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AcousticModels. */
@js.native
trait AcousticModels extends StObject {
  
  /** An array of `AcousticModel` objects that provides information about each available custom acoustic model. The array is empty if the requesting credentials own no custom acoustic models (if no language is specified) or own no custom acoustic models for the specified language. */
  var customizations: js.Array[AcousticModel] = js.native
}
object AcousticModels {
  
  @scala.inline
  def apply(customizations: js.Array[AcousticModel]): AcousticModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcousticModels]
  }
  
  @scala.inline
  implicit class AcousticModelsMutableBuilder[Self <: AcousticModels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomizations(value: js.Array[AcousticModel]): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizationsVarargs(value: AcousticModel*): Self = StObject.set(x, "customizations", js.Array(value :_*))
  }
}
