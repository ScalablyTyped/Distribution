package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeechModels. */
trait SpeechModels extends StObject {
  
  /** An array of `SpeechModel` objects that provides information about each available model. */
  var models: js.Array[SpeechModel]
}
object SpeechModels {
  
  inline def apply(models: js.Array[SpeechModel]): SpeechModels = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechModels]
  }
  
  extension [Self <: SpeechModels](x: Self) {
    
    inline def setModels(value: js.Array[SpeechModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsVarargs(value: SpeechModel*): Self = StObject.set(x, "models", js.Array(value*))
  }
}
