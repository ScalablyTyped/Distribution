package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response type for listing existing translation models. */
trait TranslationModels extends StObject {
  
  /** An array of available models. */
  var models: js.Array[TranslationModel]
}
object TranslationModels {
  
  @scala.inline
  def apply(models: js.Array[TranslationModel]): TranslationModels = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationModels]
  }
  
  @scala.inline
  implicit class TranslationModelsMutableBuilder[Self <: TranslationModels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[TranslationModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsVarargs(value: TranslationModel*): Self = StObject.set(x, "models", js.Array(value :_*))
  }
}
