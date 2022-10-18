package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Custom models that are available for entities and relations. */
trait ListModelsResults extends StObject {
  
  /** An array of available models. */
  var models: js.UndefOr[js.Array[Model]] = js.undefined
}
object ListModelsResults {
  
  inline def apply(): ListModelsResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsResults]
  }
  
  extension [Self <: ListModelsResults](x: Self) {
    
    inline def setModels(value: js.Array[Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value*))
  }
}
